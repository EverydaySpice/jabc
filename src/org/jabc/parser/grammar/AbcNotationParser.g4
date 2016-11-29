parser grammar AbcNotationParser;

options { tokenVocab=AbcNotationLexer; }

// --->BASIC RULES:
fraction: numerator=INT Slash denominator=INT;

// --->TUNE:
voice: VoiceSymbol name=STRING EXIT_NEWLINE;
voices: (voice score)+ ;
tune: header (voices | score) NEWLINE? EOF;
score:(bar NEWLINE? suppresScoreLinebreak?)+ ;
bar: (noteExpression)+ endOfBar;
// >---END OF TUNE

// --->BAR:
endOfBar: (WS)* barline;
barline: simpleBarline
       | thinThikBarline
       | thikThinBarline
       | thinThinBarline
       | startOfRepeatedBarline
       | endOfRepeatedBarline
       | startAndEndOfRepeatedBarline;

simpleBarline: VerticalBar;
thinThinBarline: VerticalBar VerticalBar;
thikThinBarline: SqaureBracketOpen VerticalBar;
thinThikBarline: VerticalBar SqaureBracketClosed;
startOfRepeatedBarline: VerticalBar Colon;
endOfRepeatedBarline: Colon VerticalBar;
startAndEndOfRepeatedBarline: Colon Colon;
suppresScoreLinebreak: Backslash NEWLINE;
// >---BAR
// --->HEADER:
header: identifier title+ optionalHeaderInfo*  key;

optionalHeaderInfo: measure
                |   length
                |   notes
                |   tempo
                |   composer;

identifier:     IdentifierSymbol    INT         NEWLINE;
title:          TitleSymbol  string=STRING EXIT_NEWLINE;
measure:        MeterSymbol ((string=STRING EXIT_NEWLINE) | (fraction NEWLINE));
length:         LengthSymbol        fraction    NEWLINE;
key:            KeySymbol           string=STRING      EXIT_NEWLINE;
notes:          NotesSymbol   string=STRING      EXIT_NEWLINE;
tempo:          TempoSymbol   fraction WS* Equals WS* INT NEWLINE;
composer:       ComposerSymbol   string=STRING      EXIT_NEWLINE;
// >---END OF HEADER

// --->NOTES:
note: accidental* (noBeamNote | beamNote) noteOctave* noteLength* tiedNote?;
tiedNote: Minus;
noteExpression: multipleNotes | note;

beamNote: noteString=NOTE;
noBeamNote: WS+ noteString=NOTE;


multipleNotes: WS* SqaureBracketOpen (note)+ SqaureBracketClosed tiedNote?;

annotation: delimeter
            | multiplier
            | octaveUp
            | octaveDown;

noteLength: delimeter
            | multiplier;

noteOctave: octaveUp
            | octaveDown;

accidental: flat
            | sharp
            | natural;

flat: Flat;
sharp: Sharp;
natural: Equals;

delimeter: Slash denominator=INT;
multiplier: (numerator=INT | fraction);
octaveUp: OCTAVE_UP;
octaveDown: OCTAVE_DOWN;
// >---END OF NOTES