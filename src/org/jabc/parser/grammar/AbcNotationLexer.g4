lexer grammar AbcNotationLexer;

INT: [0-9]+;
NEWLINE: '\r'? '\n';
WS: ('\t' | ' ')+;

FRACTION: INT '/' INT;
Delimiter: '/' INT;

IdentifierSymbol:     'X:';
TitleSymbol:          'T:' ->mode(STRING_MODE);
MeasureSymbol:        'M:' ->mode(STRING_MODE);
LengthSymbol:         'L:';
KeySymbol:            'K:'  ->mode(STRING_MODE);
CommentSymbol:        'N:'  ->mode(STRING_MODE);

MULTIPLIER: INT;
OCTAVE_UP: '\'';
OCTAVE_DOWN: ',';

SingleNote: WS+ NOTE;
BeamNote: NOTE;



NOTE: [a-gA-G];
//SimpleBarline:                  '|';
////ThinThikBarline:                '|]';
////ThikThinBarline:                '[|';
//ThinThinBarline:                '||';
//StartOfRepeatedBarline:         '|:';
//EndOfRepeatedBarline:           ':|';
//StartAndEndOfRepeatedBarline:   '::';

SqaureBracketOpen:     '[';
SqaureBracketClosed:   ']';
VerticalBar:           '|';
Colon:                 ':';

//StartOfMultipleNotes: '[' [^|];
//EndOfMultipleNotes: [^|]']';

mode STRING_MODE;
EXIT_NEWLINE: NEWLINE->mode(DEFAULT_MODE);
STRING: (ID | INT | WS)+;
ID: [a-zA-Z]+;
