lexer grammar AbcNotationLexer;

INT: [0-9]+;
NEWLINE: '\r' ? '\n';
WS: ('\t' | ' ')+;
COMMENT: '%' ~[\r\n]* {System.out.println("lc > " + getText());} NEWLINE->skip;

Slash: '/';
IdentifierSymbol:   'X:';
TitleSymbol:        'T:' ->mode(STRING_MODE);
MeterSymbol:        'M:';
LengthSymbol:       'L:';
KeySymbol:          'K:'  ->mode(STRING_MODE);
NotesSymbol:        'N:'  ->mode(STRING_MODE);
VoiceSymbol:        'V:'  ->mode(STRING_MODE);
ComposerSymbol:     'C:'  ->mode(STRING_MODE);
TempoSymbol:        'Q:';
NotSupportedSymbol: [ABDFGHImOPRrSsUWwZ] ':' .*? NEWLINE ->skip;
MULTIPLIER: INT;
OCTAVE_UP:      '\'';
OCTAVE_DOWN:    ',';
Flat:           '_';
Sharp:          '^';

NOTE: [a-gA-G];
Rest:                   'z';
InvisibleRest:          'x';
BarRest:                'Z';
BracketOpen:            '(';
BracketClosed:          ')';
SquareBracketOpen:      '[';
SquareBracketClosed:    ']';
VerticalBar:            '|';
Colon:                  ':';
Equals:                 '=';
Minus:                  '-';
Backslash:              '\\';
Quotationmark:          '"' ->mode(STRING_MODE);

Decoration:             ('!' [a-zA-Z0-9().+<>]* '!') |
                        '.'  |
                        '~'  |
                        'H'  |
                        'L'  |
                        'M'  |
                        'O'  |
                        'P'  |
                        'S'  |
                        'T'  |
                        'u'  |
                        'v'  ;

mode STRING_MODE;
STRING_MODE_EXIT: (NEWLINE | '"' | ']' ) ->mode(DEFAULT_MODE);
STRING_MODE_COMMENT: '%' ~[\r\n]* {System.out.println("lc > " + getText());}->skip;
STRING: (ID | INT | WS | [-_;,/.$§!?=&()] | '|' )+;
ID: [a-zA-Z \u00C4 \u00D6 \u00DC \u00E4 \u00F6 \u00FC]+;
