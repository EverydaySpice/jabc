lexer grammar AbcNotationLexer;

INT: [0-9]+;
NEWLINE: '\r'? '\n';
WS: ('\t' | ' ')+;
COMMENT: '%' .*? {System.out.println("lc > " + getText());} NEWLINE ->skip;
//FRACTION: INT '/' INT;
//Delimiter: '/' INT;
Slash: '/';
IdentifierSymbol:   'X:';
TitleSymbol:        'T:' ->mode(STRING_MODE);
MeterSymbol:        'M:' ->mode(STRING_MODE);
LengthSymbol:       'L:';
KeySymbol:          'K:'  ->mode(STRING_MODE);
NotesSymbol:        'N:'  ->mode(STRING_MODE);
VoiceSymbol:        'V:'  ->mode(STRING_MODE);
ComposerSymbol:     'C:'  ->mode(STRING_MODE);
TempoSymbol:        'Q:';


MULTIPLIER: INT;
OCTAVE_UP:      '\'';
OCTAVE_DOWN:    ',';
Flat:           '_';
Sharp:          '^';

//NoBeamNote: WS+ NOTE;
//BeamNote: NOTE;

NOTE: [a-gA-G];
Rest:                   'z';
InvisibleRest:          'x';
BarRest:                'Z';
BracketOpen:            '(';
BracketClosed:          ')';
SqaureBracketOpen:      '[';
SqaureBracketClosed:    ']';
VerticalBar:            '|';
Colon:                  ':';
Equals:                 '=';
Minus:                  '-';
Backslash:              '\\';

mode STRING_MODE;
EXIT_NEWLINE: NEWLINE->mode(DEFAULT_MODE);
STRING: (ID | INT | WS | [-_;,/.%$§"!?=&()] )+;
ID: [a-zA-Z]+;
