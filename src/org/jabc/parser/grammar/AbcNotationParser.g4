parser grammar AbcNotationParser;

options { tokenVocab=AbcNotationLexer; }

// --->BASIC RULES:
fraction: numerator=INT Slash denominator=INT;
string: text=STRING STRING_MODE_EXIT;
endOfLine: NEWLINE | COMMENT;

// --->TUNE:
tune: header (voice)+ ;
// voiceInfo example: V: left hand
voice: (voiceInfo? score+);
voiceInfo: VoiceSymbol text=STRING STRING_MODE_EXIT;
score:(bar suppresScoreLinebreak?)+ (NEWLINE | EOF);
// >---END OF TUNE

// --->HEADER:
header: identifier title+ (meter| length| notes| tempo | composer )* key;

identifier:     IdentifierSymbol    text=INT         endOfLine;

title:          TitleSymbol  string ;

meter:          MeterSymbol (NOTE | fraction) endOfLine?;

length:         LengthSymbol        WS? fraction WS? endOfLine;

key:            KeySymbol           string      ;

notes:          NotesSymbol   string     ;

composer:       ComposerSymbol   string      ;

tempo:          TempoSymbol WS? (fractionTempo | stringTempo | integerTempo) WS* endOfLine;
fractionTempo:  stringQuotation? (WS? fraction)+ WS? Equals WS? speed=INT WS? stringQuotation?;
stringTempo:    stringQuotation;
stringQuotation: Quotationmark string;
integerTempo:    stringQuotation? speed=INT stringQuotation?;

// >---END OF HEADER


// --->BAR:
bar: WS* (musicalExpression)+ endOfBar;
endOfBar: WS* barline;
barline: simpleBarline
       | thinThikBarline
       | thikThinBarline
       | thinThinBarline
       | startOfRepeatedBarline
       | endOfRepeatedBarline
       | startAndEndOfRepeatedBarline;

simpleBarline: VerticalBar;
thinThinBarline: VerticalBar VerticalBar;
thikThinBarline: SquareBracketOpen VerticalBar;
thinThikBarline: VerticalBar SquareBracketClosed;
startOfRepeatedBarline: VerticalBar Colon;
endOfRepeatedBarline: Colon VerticalBar;
startAndEndOfRepeatedBarline: Colon Colon;
suppresScoreLinebreak: Backslash NEWLINE;
// >---BAR


// --->NOTES and muscial Expressions:

musicalExpression: WS? (inlineField | slurStart | slurEnd | multipleNotes | note | rest );
note: decoration? accidental? noteExpression noteOctave noteLength tiedNote?;
multipleNotes: decorationExpression? WS* SquareBracketOpen (note)+ SquareBracketClosed tiedNote?;
rest: WS? (Rest | InvisibleRest) noteLength WS?;
noteExpression: noBeamNote | beamNote;
beamNote: noteString=NOTE;
noBeamNote: WS+ noteString=NOTE;
decoration: decorationName=Decoration;
decorationExpression: decorationName=Decoration;
noteLength: (delimiter
            | multiplier)?;

noteOctave: (octaveUp
            | octaveDown)*;

accidental: (flat
            | sharp
            | natural)+;

slurStart: WS? BracketOpen;
slurEnd:   WS? BracketClosed;

inlineField: (meterChange | lengthChange | keyChange | tempoChange);
meterChange: SquareBracketOpen meter SquareBracketClosed;
lengthChange: SquareBracketOpen length SquareBracketClosed;
keyChange: SquareBracketOpen key SquareBracketClosed?;
tempoChange: SquareBracketOpen tempo SquareBracketClosed;

flat: Flat;
sharp: Sharp;
natural: Equals;
tiedNote: Minus;

delimiter: Slash denominator=INT?;
multiplier: (numerator=INT |  numerator=INT Slash+ denominator=INT?);
octaveUp: OCTAVE_UP;
octaveDown: OCTAVE_DOWN;
// >---END OF NOTES