echo "ANTLR ABC Notation file generation..."
java -jar %ANTLR_LIB% -package org.jabc.parser.grammar -no-listener -visitor AbcNotation.g4


