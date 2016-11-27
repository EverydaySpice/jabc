echo "ANTLR ABC Notation file generation..."
java -jar %ANTLR_LIB% -package org.jabc.parser.grammar -listener -visitor AbcNotationParser.g4 AbcNotationLexer.g4


