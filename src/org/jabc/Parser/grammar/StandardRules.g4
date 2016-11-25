lexer grammar StandardRules;

INT: [0-9]+;
ID: [a-zA-Z]+;
NEWLINE: '\r'? '\n';
//WS: ('\t' | ' ')+ ->skip;

FRACTION: INT '/' INT;