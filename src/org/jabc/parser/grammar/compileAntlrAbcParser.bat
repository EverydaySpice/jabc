echo "ANTLR ABC Notation file generation..."
java -jar %ANTLR_LIB% -package org.jabc.parser.grammar -no-listener -visitor AbcNotation.g4
echo javac -cp ../../../../../../../../libs/antlr-4.5.3-complete.jar AbcNotationVisitor.java AbcNotationParser.java AbcNotationLexer.java AbcNotationBaseVisitor.java
echo java -cp .;../../../../../../../../libs/antlr-4.5.3-complete.jar org.antlr.v4.gui.TestRig AbcNotation tune -gui code.demo

