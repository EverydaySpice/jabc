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

Annotation: Delimiter
            | MULTIPLIER
            | OCTAVE_DOWN
            | OCTAVE_UP;

SingleNote: WS+ NOTE;

BeamNote: NOTE;

BARLINE: (' ')* ('|' | '|]');
NOTE: [a-gA-G];

mode STRING_MODE;
EXIT_NEWLINE: NEWLINE->mode(DEFAULT_MODE);
//EXIT_WS: WS ->mode(DEFAULT_MODE);
STRING: (ID | INT | WS)+;
ID: [a-zA-Z]+;
