parser grammar AbcNotationParser;

options { tokenVocab=AbcNotationLexer; }

// --->TUNE:
tune: header score NEWLINE?;
score:(takt)+;
takt: (note)+ endOfBar;
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
thinThikBarline: VerticalBar SquareBracketClosed;
startOfRepeatedBarline: VerticalBar Colon;
endOfRepeatedBarline: Colon VerticalBar;
startAndEndOfRepeatedBarline: Colon Colon;

// >---BAR
// --->HEADER:
header: identifier title optionalHeaderInfo*  key;

optionalHeaderInfo: measure
                |   length
                |   comment;

identifier:     IdentifierSymbol    INT         NEWLINE;
title:          TitleSymbol         STRING      EXIT_NEWLINE;
measure:        MeasureSymbol       ((STRING EXIT_NEWLINE) | (FRACTION NEWLINE));
length:         LengthSymbol        FRACTION    NEWLINE;
key:            KeySymbol           STRING      EXIT_NEWLINE;
comment:        CommentSymbol       STRING      EXIT_NEWLINE;
// >---END OF HEADER

// --->NOTES:
note: (singleNote | beamNote | multipleNotes);
singleNote: SingleNote annotation*;
beamNote: BeamNote annotation*;
multipleNotes: WS* SqaureBracketOpen (singleNote | beamNote )+ SqaureBracketClosed;
// Note annotations:
annotation: delimeter
            | multiplier
            | octaveUp
            | octaveDown;

delimeter: Delimiter;
multiplier: INT;
octaveUp: OCTAVE_UP;
octaveDown: OCTAVE_DOWN;
// >---END OF NOTES






