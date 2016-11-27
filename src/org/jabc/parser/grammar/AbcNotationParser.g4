parser grammar AbcNotationParser;

options { tokenVocab=AbcNotationLexer; }

// --->TUNE:
tune: header score;
score:(takt)+;
takt: (note)+ BARLINE;
// >---END OF TUNE

// --->BAR:
//barline: SimpleBarline
//       | ThinThikBarline
//       | ThikThinBarline
//       | ThinThinBarline
//       | StartOfRepeatedBarline
//       | EndOfRepeatedBarline
//       | StartAndEndOfRepeatedBarline;

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
note: singleNote | beamNote;
singleNote: SingleNote annotation*;
beamNote: BeamNote annotation*;

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






