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

NOTE: [a-gA-G];
SingleNote: WS+ NOTE;
BeamNote: NOTE;

//StartOfMultipleNotes: '[';
//EndOfMultipleNotes: ']';

BARLINE: (' ')* ('|' | '|]');
//SimpleBarline:                  '|';
//ThinThikBarline:                '|]';
//ThikThinBarline:                '[|';
//ThinThinBarline:                '||';
//StartOfRepeatedBarline:         '|:';
//EndOfRepeatedBarline:           ':|';
//StartAndEndOfRepeatedBarline:   '::';

mode STRING_MODE;
EXIT_NEWLINE: NEWLINE->mode(DEFAULT_MODE);
STRING: (ID | INT | WS)+;
ID: [a-zA-Z]+;
