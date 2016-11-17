lexer grammar StandardRules;

INT: [0-9]+;
FRACTION: INT '/' INT;
ID: [a-zA-Z]+;
NEWLINE: '\r'? '\n';
WS: ('\t' | ' ')+ ->skip;
