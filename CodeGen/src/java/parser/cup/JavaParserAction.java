package uml.java.parser.cup;

public class JavaParserAction {
  private final JavaParser parser;

  /** Constructor */
  JavaParserAction(JavaParser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  @SuppressWarnings({ "unused", "rawtypes" })
public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 354: // constant_expression ::= expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("constant_expression",153, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 353: // expression ::= assignment_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression",152, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 352: // expression_opt ::= expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression_opt",151, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 351: // expression_opt ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression_opt",151, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 350: // assignment_operator ::= OREQ 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("assignment_operator",150, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 349: // assignment_operator ::= XOREQ 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("assignment_operator",150, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 348: // assignment_operator ::= ANDEQ 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("assignment_operator",150, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 347: // assignment_operator ::= URSHIFTEQ 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("assignment_operator",150, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 346: // assignment_operator ::= RSHIFTEQ 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("assignment_operator",150, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 345: // assignment_operator ::= LSHIFTEQ 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("assignment_operator",150, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 344: // assignment_operator ::= MINUSEQ 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("assignment_operator",150, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 343: // assignment_operator ::= PLUSEQ 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("assignment_operator",150, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 342: // assignment_operator ::= MODEQ 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("assignment_operator",150, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 341: // assignment_operator ::= DIVEQ 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("assignment_operator",150, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 340: // assignment_operator ::= MULTEQ 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("assignment_operator",150, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 339: // assignment_operator ::= EQ 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("assignment_operator",150, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 338: // left_hand_side ::= array_access 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("left_hand_side",149, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 337: // left_hand_side ::= field_access 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("left_hand_side",149, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 336: // left_hand_side ::= name 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("left_hand_side",149, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 335: // assignment ::= left_hand_side assignment_operator assignment_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("assignment",148, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 334: // assignment_expression ::= assignment 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("assignment_expression",147, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 333: // assignment_expression ::= conditional_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("assignment_expression",147, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 332: // conditional_expression ::= conditional_or_expression QUESTION expression COLON conditional_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("conditional_expression",146, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 331: // conditional_expression ::= conditional_or_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("conditional_expression",146, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 330: // conditional_or_expression ::= conditional_or_expression OROR conditional_and_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("conditional_or_expression",145, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 329: // conditional_or_expression ::= conditional_and_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("conditional_or_expression",145, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 328: // conditional_and_expression ::= conditional_and_expression ANDAND inclusive_or_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("conditional_and_expression",144, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 327: // conditional_and_expression ::= inclusive_or_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("conditional_and_expression",144, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 326: // inclusive_or_expression ::= inclusive_or_expression OR exclusive_or_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inclusive_or_expression",143, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 325: // inclusive_or_expression ::= exclusive_or_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inclusive_or_expression",143, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 324: // exclusive_or_expression ::= exclusive_or_expression XOR and_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("exclusive_or_expression",142, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 323: // exclusive_or_expression ::= and_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("exclusive_or_expression",142, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 322: // and_expression ::= and_expression AND equality_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("and_expression",141, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 321: // and_expression ::= equality_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("and_expression",141, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 320: // equality_expression ::= equality_expression NOTEQ relational_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("equality_expression",140, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 319: // equality_expression ::= equality_expression EQEQ relational_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("equality_expression",140, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 318: // equality_expression ::= relational_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("equality_expression",140, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 317: // relational_expression ::= relational_expression INSTANCEOF reference_type 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("relational_expression",139, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 316: // relational_expression ::= relational_expression GTEQ shift_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("relational_expression",139, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 315: // relational_expression ::= relational_expression LTEQ shift_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("relational_expression",139, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 314: // relational_expression ::= relational_expression GT shift_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("relational_expression",139, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 313: // relational_expression ::= relational_expression LT shift_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("relational_expression",139, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 312: // relational_expression ::= shift_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("relational_expression",139, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 311: // shift_expression ::= shift_expression URSHIFT additive_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("shift_expression",138, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 310: // shift_expression ::= shift_expression RSHIFT additive_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("shift_expression",138, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 309: // shift_expression ::= shift_expression LSHIFT additive_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("shift_expression",138, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 308: // shift_expression ::= additive_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("shift_expression",138, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 307: // additive_expression ::= additive_expression MINUS multiplicative_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("additive_expression",137, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 306: // additive_expression ::= additive_expression PLUS multiplicative_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("additive_expression",137, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 305: // additive_expression ::= multiplicative_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("additive_expression",137, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 304: // multiplicative_expression ::= multiplicative_expression MOD unary_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("multiplicative_expression",136, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 303: // multiplicative_expression ::= multiplicative_expression DIV unary_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("multiplicative_expression",136, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 302: // multiplicative_expression ::= multiplicative_expression MULT unary_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("multiplicative_expression",136, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 301: // multiplicative_expression ::= unary_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("multiplicative_expression",136, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 300: // cast_expression ::= LPAREN name dims RPAREN unary_expression_not_plus_minus 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("cast_expression",135, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 299: // cast_expression ::= LPAREN expression RPAREN unary_expression_not_plus_minus 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("cast_expression",135, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 298: // cast_expression ::= LPAREN primitive_type dims_opt RPAREN unary_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("cast_expression",135, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 297: // unary_expression_not_plus_minus ::= cast_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("unary_expression_not_plus_minus",132, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 296: // unary_expression_not_plus_minus ::= NOT unary_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("unary_expression_not_plus_minus",132, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 295: // unary_expression_not_plus_minus ::= COMP unary_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("unary_expression_not_plus_minus",132, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 294: // unary_expression_not_plus_minus ::= postfix_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("unary_expression_not_plus_minus",132, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 293: // predecrement_expression ::= MINUSMINUS unary_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("predecrement_expression",134, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 292: // preincrement_expression ::= PLUSPLUS unary_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("preincrement_expression",133, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 291: // unary_expression ::= unary_expression_not_plus_minus 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("unary_expression",131, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 290: // unary_expression ::= MINUS unary_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("unary_expression",131, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 289: // unary_expression ::= PLUS unary_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("unary_expression",131, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 288: // unary_expression ::= predecrement_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("unary_expression",131, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 287: // unary_expression ::= preincrement_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("unary_expression",131, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 286: // postdecrement_expression ::= postfix_expression MINUSMINUS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("postdecrement_expression",130, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 285: // postincrement_expression ::= postfix_expression PLUSPLUS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("postincrement_expression",129, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 284: // postfix_expression ::= postdecrement_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("postfix_expression",128, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 283: // postfix_expression ::= postincrement_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("postfix_expression",128, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 282: // postfix_expression ::= name 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("postfix_expression",128, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 281: // postfix_expression ::= primary 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("postfix_expression",128, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 280: // array_access ::= primary_no_new_array LBRACK expression RBRACK 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("array_access",127, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 279: // array_access ::= name LBRACK expression RBRACK 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("array_access",127, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 278: // method_invocation ::= name DOT SUPER DOT IDENTIFIER LPAREN argument_list_opt RPAREN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("method_invocation",126, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 277: // method_invocation ::= SUPER DOT IDENTIFIER LPAREN argument_list_opt RPAREN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("method_invocation",126, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 276: // method_invocation ::= primary DOT IDENTIFIER LPAREN argument_list_opt RPAREN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("method_invocation",126, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 275: // method_invocation ::= name LPAREN argument_list_opt RPAREN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("method_invocation",126, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 274: // field_access ::= name DOT SUPER DOT IDENTIFIER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("field_access",125, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 273: // field_access ::= SUPER DOT IDENTIFIER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("field_access",125, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 272: // field_access ::= primary DOT IDENTIFIER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("field_access",125, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 271: // dims ::= dims LBRACK RBRACK 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dims",124, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 270: // dims ::= LBRACK RBRACK 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dims",124, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 269: // dims_opt ::= dims 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dims_opt",123, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 268: // dims_opt ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dims_opt",123, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 267: // dim_expr ::= LBRACK expression RBRACK 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dim_expr",122, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 266: // dim_exprs ::= dim_exprs dim_expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dim_exprs",121, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 265: // dim_exprs ::= dim_expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dim_exprs",121, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 264: // array_creation_expression ::= NEW class_or_interface_type dims array_initializer 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("array_creation_expression",120, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 263: // array_creation_expression ::= NEW primitive_type dims array_initializer 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("array_creation_expression",120, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 262: // array_creation_expression ::= NEW class_or_interface_type dim_exprs dims_opt 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("array_creation_expression",120, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 261: // array_creation_expression ::= NEW primitive_type dim_exprs dims_opt 
            {
              Object RESULT =null;
              //array primitive + explicit initialization
              CUP$parser$result = parser.getSymbolFactory().newSymbol("array_creation_expression",120, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 260: // argument_list ::= argument_list COMMA expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("argument_list",119, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 259: // argument_list ::= expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("argument_list",119, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 258: // argument_list_opt ::= argument_list 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("argument_list_opt",118, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 257: // argument_list_opt ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("argument_list_opt",118, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 256: // class_instance_creation_expression ::= primary DOT NEW IDENTIFIER LPAREN argument_list_opt RPAREN class_body 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("class_instance_creation_expression",117, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 255: // class_instance_creation_expression ::= primary DOT NEW IDENTIFIER LPAREN argument_list_opt RPAREN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("class_instance_creation_expression",117, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 254: // class_instance_creation_expression ::= NEW class_type LPAREN argument_list_opt RPAREN class_body 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("class_instance_creation_expression",117, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 253: // class_instance_creation_expression ::= NEW class_type LPAREN argument_list_opt RPAREN 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4));
              CUP$parser$result = parser.getSymbolFactory().newSymbol("class_instance_creation_expression",117, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 252: // primary_no_new_array ::= name DOT THIS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("primary_no_new_array",116, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 251: // primary_no_new_array ::= name DOT CLASS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("primary_no_new_array",116, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 250: // primary_no_new_array ::= array_type DOT CLASS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("primary_no_new_array",116, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 249: // primary_no_new_array ::= VOID DOT CLASS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("primary_no_new_array",116, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 248: // primary_no_new_array ::= primitive_type DOT CLASS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("primary_no_new_array",116, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 247: // primary_no_new_array ::= array_access 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("primary_no_new_array",116, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 246: // primary_no_new_array ::= method_invocation 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("primary_no_new_array",116, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 245: // primary_no_new_array ::= field_access 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("primary_no_new_array",116, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 244: // primary_no_new_array ::= class_instance_creation_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("primary_no_new_array",116, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 243: // primary_no_new_array ::= LPAREN expression RPAREN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("primary_no_new_array",116, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 242: // primary_no_new_array ::= THIS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("primary_no_new_array",116, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 241: // primary_no_new_array ::= literal 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              //parser.fac._members.add(parser.fac.toFieldDeclaration_reference(true));
              CUP$parser$result = parser.getSymbolFactory().newSymbol("primary_no_new_array",116, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 240: // primary ::= array_creation_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("primary",115, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 239: // primary ::= primary_no_new_array 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("primary",115, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 238: // finally ::= FINALLY block 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("finally",114, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 237: // catch_clause ::= CATCH LPAREN formal_parameter RPAREN block 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("catch_clause",113, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 236: // catches ::= catches catch_clause 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("catches",112, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 235: // catches ::= catch_clause 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("catches",112, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 234: // catches_opt ::= catches 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("catches_opt",111, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 233: // catches_opt ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("catches_opt",111, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 232: // try_statement ::= TRY block catches_opt finally 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("try_statement",110, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 231: // try_statement ::= TRY block catches 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("try_statement",110, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 230: // synchronized_statement ::= SYNCHRONIZED LPAREN expression RPAREN block 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("synchronized_statement",109, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 229: // throw_statement ::= THROW expression SEMICOLON 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("throw_statement",108, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 228: // return_statement ::= RETURN expression_opt SEMICOLON 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("return_statement",107, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 227: // continue_statement ::= CONTINUE identifier_opt SEMICOLON 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("continue_statement",106, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 226: // break_statement ::= BREAK identifier_opt SEMICOLON 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("break_statement",105, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 225: // identifier_opt ::= IDENTIFIER 
            {
              Object RESULT =null;
              	//YYYY
              CUP$parser$result = parser.getSymbolFactory().newSymbol("identifier_opt",104, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 224: // identifier_opt ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("identifier_opt",104, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 223: // statement_expression_list ::= statement_expression_list COMMA statement_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_expression_list",103, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 222: // statement_expression_list ::= statement_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_expression_list",103, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 221: // for_update ::= statement_expression_list 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("for_update",102, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 220: // for_update_opt ::= for_update 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("for_update_opt",101, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 219: // for_update_opt ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("for_update_opt",101, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 218: // for_init ::= local_variable_declaration 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("for_init",100, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 217: // for_init ::= statement_expression_list 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("for_init",100, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 216: // for_init_opt ::= for_init 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("for_init_opt",99, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 215: // for_init_opt ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("for_init_opt",99, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 214: // for_statement_no_short_if ::= FOR LPAREN for_init_opt SEMICOLON expression_opt SEMICOLON for_update_opt RPAREN statement_no_short_if 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("for_statement_no_short_if",98, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 213: // for_statement ::= FOR LPAREN for_init_opt SEMICOLON expression_opt SEMICOLON for_update_opt RPAREN statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("for_statement",97, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 212: // do_statement ::= DO statement WHILE LPAREN expression RPAREN SEMICOLON 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("do_statement",96, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 211: // while_statement_no_short_if ::= WHILE LPAREN expression RPAREN statement_no_short_if 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("while_statement_no_short_if",95, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 210: // while_statement ::= WHILE LPAREN expression RPAREN statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("while_statement",94, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 209: // switch_label ::= DEFAULT COLON 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("switch_label",93, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 208: // switch_label ::= CASE constant_expression COLON 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("switch_label",93, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 207: // switch_labels ::= switch_labels switch_label 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("switch_labels",92, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 206: // switch_labels ::= switch_label 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("switch_labels",92, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 205: // switch_block_statement_group ::= switch_labels block_statements 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("switch_block_statement_group",91, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 204: // switch_block_statement_groups ::= switch_block_statement_groups switch_block_statement_group 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("switch_block_statement_groups",90, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 203: // switch_block_statement_groups ::= switch_block_statement_group 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("switch_block_statement_groups",90, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 202: // switch_block ::= LBRACE RBRACE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("switch_block",89, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 201: // switch_block ::= LBRACE switch_labels RBRACE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("switch_block",89, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 200: // switch_block ::= LBRACE switch_block_statement_groups RBRACE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("switch_block",89, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 199: // switch_block ::= LBRACE switch_block_statement_groups switch_labels RBRACE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("switch_block",89, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 198: // switch_statement ::= SWITCH LPAREN expression RPAREN switch_block 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("switch_statement",88, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 197: // if_then_else_statement_no_short_if ::= IF LPAREN expression RPAREN statement_no_short_if ELSE statement_no_short_if 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("if_then_else_statement_no_short_if",87, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 196: // if_then_else_statement ::= IF LPAREN expression RPAREN statement_no_short_if ELSE statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("if_then_else_statement",86, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 195: // if_then_statement ::= IF LPAREN expression RPAREN statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("if_then_statement",85, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 194: // statement_expression ::= class_instance_creation_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_expression",84, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 193: // statement_expression ::= method_invocation 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_expression",84, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 192: // statement_expression ::= postdecrement_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_expression",84, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 191: // statement_expression ::= postincrement_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_expression",84, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 190: // statement_expression ::= predecrement_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_expression",84, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 189: // statement_expression ::= preincrement_expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_expression",84, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 188: // statement_expression ::= assignment 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_expression",84, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 187: // expression_statement ::= statement_expression SEMICOLON 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression_statement",83, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 186: // labeled_statement_no_short_if ::= IDENTIFIER COLON statement_no_short_if 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("labeled_statement_no_short_if",82, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 185: // labeled_statement ::= IDENTIFIER COLON statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("labeled_statement",81, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 184: // empty_statement ::= SEMICOLON 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("empty_statement",80, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 183: // statement_without_trailing_substatement ::= try_statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_without_trailing_substatement",79, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 182: // statement_without_trailing_substatement ::= throw_statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_without_trailing_substatement",79, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 181: // statement_without_trailing_substatement ::= synchronized_statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_without_trailing_substatement",79, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 180: // statement_without_trailing_substatement ::= return_statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_without_trailing_substatement",79, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 179: // statement_without_trailing_substatement ::= continue_statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_without_trailing_substatement",79, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 178: // statement_without_trailing_substatement ::= break_statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_without_trailing_substatement",79, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 177: // statement_without_trailing_substatement ::= do_statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_without_trailing_substatement",79, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 176: // statement_without_trailing_substatement ::= switch_statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_without_trailing_substatement",79, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 175: // statement_without_trailing_substatement ::= expression_statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_without_trailing_substatement",79, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 174: // statement_without_trailing_substatement ::= empty_statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_without_trailing_substatement",79, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 173: // statement_without_trailing_substatement ::= block 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_without_trailing_substatement",79, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 172: // statement_no_short_if ::= for_statement_no_short_if 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_no_short_if",78, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 171: // statement_no_short_if ::= while_statement_no_short_if 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_no_short_if",78, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 170: // statement_no_short_if ::= if_then_else_statement_no_short_if 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_no_short_if",78, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 169: // statement_no_short_if ::= labeled_statement_no_short_if 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_no_short_if",78, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 168: // statement_no_short_if ::= statement_without_trailing_substatement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_no_short_if",78, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 167: // statement ::= for_statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",77, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 166: // statement ::= while_statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",77, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 165: // statement ::= if_then_else_statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",77, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 164: // statement ::= if_then_statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",77, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 163: // statement ::= labeled_statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",77, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 162: // statement ::= statement_without_trailing_substatement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",77, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 161: // local_variable_declaration ::= FINAL type variable_declarators 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("local_variable_declaration",76, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 160: // local_variable_declaration ::= type variable_declarators 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("local_variable_declaration",76, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 159: // local_variable_declaration_statement ::= local_variable_declaration SEMICOLON 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("local_variable_declaration_statement",75, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 158: // block_statement ::= interface_declaration 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("block_statement",74, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 157: // block_statement ::= class_declaration 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("block_statement",74, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 156: // block_statement ::= statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("block_statement",74, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 155: // block_statement ::= local_variable_declaration_statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("block_statement",74, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 154: // block_statements ::= block_statements block_statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("block_statements",73, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 153: // block_statements ::= block_statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("block_statements",73, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 152: // block_statements_opt ::= block_statements 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("block_statements_opt",72, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 151: // block_statements_opt ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("block_statements_opt",72, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 150: // block ::= LBRACE block_statements_opt RBRACE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("block",71, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 149: // variable_initializers ::= variable_initializers COMMA variable_initializer 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("variable_initializers",70, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 148: // variable_initializers ::= variable_initializer 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("variable_initializers",70, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 147: // array_initializer ::= LBRACE RBRACE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("array_initializer",69, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 146: // array_initializer ::= LBRACE COMMA RBRACE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("array_initializer",69, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 145: // array_initializer ::= LBRACE variable_initializers RBRACE 
            {
              Object RESULT =null;
              
              CUP$parser$result = parser.getSymbolFactory().newSymbol("array_initializer",69, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 144: // array_initializer ::= LBRACE variable_initializers COMMA RBRACE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("array_initializer",69, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 143: // abstract_method_declaration ::= method_header SEMICOLON 
            {
              Object RESULT =null;
              parser.fac.setPauseParse(false);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("abstract_method_declaration",68, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 142: // constant_declaration ::= field_declaration 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("constant_declaration",67, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 141: // interface_member_declaration ::= SEMICOLON 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("interface_member_declaration",66, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 140: // interface_member_declaration ::= interface_declaration 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("interface_member_declaration",66, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 139: // interface_member_declaration ::= class_declaration 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("interface_member_declaration",66, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 138: // interface_member_declaration ::= abstract_method_declaration 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("interface_member_declaration",66, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 137: // interface_member_declaration ::= constant_declaration 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("interface_member_declaration",66, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 136: // interface_member_declarations ::= interface_member_declarations interface_member_declaration 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("interface_member_declarations",65, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 135: // interface_member_declarations ::= interface_member_declaration 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("interface_member_declarations",65, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 134: // interface_member_declarations_opt ::= interface_member_declarations 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("interface_member_declarations_opt",64, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 133: // interface_member_declarations_opt ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("interface_member_declarations_opt",64, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 132: // interface_body ::= LBRACE interface_member_declarations_opt RBRACE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("interface_body",63, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 131: // extends_interfaces ::= extends_interfaces COMMA interface_type 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("extends_interfaces",62, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 130: // extends_interfaces ::= EXTENDS interface_type 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("extends_interfaces",62, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 129: // extends_interfaces_opt ::= extends_interfaces 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("extends_interfaces_opt",61, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 128: // extends_interfaces_opt ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("extends_interfaces_opt",61, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 127: // interface_declaration ::= modifiers_opt INTERFACE IDENTIFIER extends_interfaces_opt interface_body 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2));
              parser.cu.setTypes(parser.fac.toClassDeclaration(true));
              CUP$parser$result = parser.getSymbolFactory().newSymbol("interface_declaration",60, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 126: // explicit_constructor_invocation ::= primary DOT SUPER LPAREN argument_list_opt RPAREN SEMICOLON 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("explicit_constructor_invocation",59, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 125: // explicit_constructor_invocation ::= primary DOT THIS LPAREN argument_list_opt RPAREN SEMICOLON 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("explicit_constructor_invocation",59, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 124: // explicit_constructor_invocation ::= SUPER LPAREN argument_list_opt RPAREN SEMICOLON 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("explicit_constructor_invocation",59, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 123: // explicit_constructor_invocation ::= THIS LPAREN argument_list_opt RPAREN SEMICOLON 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("explicit_constructor_invocation",59, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 122: // constructor_body ::= LBRACE RBRACE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("constructor_body",58, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 121: // constructor_body ::= LBRACE block_statements RBRACE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("constructor_body",58, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 120: // constructor_body ::= LBRACE explicit_constructor_invocation RBRACE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("constructor_body",58, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 119: // constructor_body ::= LBRACE explicit_constructor_invocation block_statements RBRACE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("constructor_body",58, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 118: // constructor_declarator ::= simple_name LPAREN formal_parameter_list_opt RPAREN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("constructor_declarator",57, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 117: // constructor_declaration ::= modifiers_opt constructor_declarator throws_opt constructor_body 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("constructor_declaration",56, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 116: // static_initializer ::= STATIC block 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("static_initializer",55, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 115: // method_body ::= SEMICOLON 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("method_body",54, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 114: // method_body ::= block 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("method_body",54, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 113: // class_type_list ::= class_type_list COMMA class_type 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("class_type_list",53, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 112: // class_type_list ::= class_type 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("class_type_list",53, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 111: // throws ::= THROWS class_type_list 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("throws",52, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 110: // throws_opt ::= throws 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("throws_opt",51, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 109: // throws_opt ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("throws_opt",51, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 108: // formal_parameter ::= FINAL type variable_declarator_id 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("formal_parameter",50, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 107: // formal_parameter ::= type variable_declarator_id 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("formal_parameter",50, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 106: // formal_parameter_list ::= formal_parameter_list COMMA formal_parameter 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("formal_parameter_list",49, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 105: // formal_parameter_list ::= formal_parameter 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("formal_parameter_list",49, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 104: // formal_parameter_list_opt ::= formal_parameter_list 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("formal_parameter_list_opt",48, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 103: // formal_parameter_list_opt ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("formal_parameter_list_opt",48, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 102: // method_declarator ::= method_declarator LBRACK RBRACK 
            {
              Object RESULT =null;
              
             
              
              CUP$parser$result = parser.getSymbolFactory().newSymbol("method_declarator",47, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 101: // method_declarator ::= IDENTIFIER LPAREN formal_parameter_list_opt RPAREN 
            {
                Object RESULT =null;

                parser.fac.addItem((JavaSymbol)CUP$parser$stack.elementAt(CUP$parser$top-3));
 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("method_declarator",47, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 100: // method_header ::= modifiers_opt VOID method_declarator throws_opt 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3));
              parser.fac.addMember(parser.fac.toMethodDeclaration(true));
              parser.fac.setPauseParse(true);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("method_header",46, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 99: // method_header ::= modifiers_opt type method_declarator throws_opt 
            {
              Object RESULT =null;
              //parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3));
              parser.fac.addMember(parser.fac.toMethodDeclaration(false));
              parser.fac.setPauseParse(true);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("method_header",46, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 98: // method_declaration ::= method_header method_body 
            {
              Object RESULT =null;
              parser.fac.setPauseParse(false);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("method_declaration",45, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 97: // variable_initializer ::= array_initializer 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("variable_initializer",44, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 96: // variable_initializer ::= expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("variable_initializer",44, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 95: // variable_declarator_id ::= variable_declarator_id LBRACK RBRACK 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("variable_declarator_id",43, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 94: // variable_declarator_id ::= IDENTIFIER 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("variable_declarator_id",43, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 93: // variable_declarator ::= variable_declarator_id EQ variable_initializer 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("variable_declarator",42, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 92: // variable_declarator ::= variable_declarator_id 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              
              CUP$parser$result = parser.getSymbolFactory().newSymbol("variable_declarator",42, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 91: // variable_declarators ::= variable_declarators COMMA variable_declarator 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("variable_declarators",41, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 90: // variable_declarators ::= variable_declarator 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("variable_declarators",41, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 89: // field_declaration ::= modifiers_opt type variable_declarators SEMICOLON 
            {
              Object RESULT =null;
             parser.fac.addMember(parser.fac.toFieldDeclaration_reference());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("field_declaration",40, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 88: // class_member_declaration ::= SEMICOLON 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("class_member_declaration",39, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 87: // class_member_declaration ::= interface_declaration 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("class_member_declaration",39, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 86: // class_member_declaration ::= modifiers_opt CLASS IDENTIFIER super_opt interfaces_opt class_body 
        	  	   //        class_declaration ::= modifiers_opt CLASS IDENTIFIER super_opt interfaces_opt class_body 
            {
              Object RESULT =null;
              //class anonymes
              CUP$parser$result = parser.getSymbolFactory().newSymbol("class_member_declaration",39, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 85: // class_member_declaration ::= method_declaration 
            {
              Object RESULT =null;
              
              CUP$parser$result = parser.getSymbolFactory().newSymbol("class_member_declaration",39, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 84: // class_member_declaration ::= field_declaration 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("class_member_declaration",39, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 83: // class_body_declaration ::= block 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("class_body_declaration",38, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 82: // class_body_declaration ::= constructor_declaration 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("class_body_declaration",38, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 81: // class_body_declaration ::= static_initializer 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("class_body_declaration",38, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 80: // class_body_declaration ::= class_member_declaration 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("class_body_declaration",38, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 79: // class_body_declarations ::= class_body_declarations class_body_declaration 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("class_body_declarations",36, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 78: // class_body_declarations ::= class_body_declaration 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("class_body_declarations",36, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 77: // class_body_declarations_opt ::= class_body_declarations 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("class_body_declarations_opt",37, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 76: // class_body_declarations_opt ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("class_body_declarations_opt",37, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 75: // class_body ::= LBRACE class_body_declarations_opt RBRACE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("class_body",35, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 74: // interface_type_list ::= interface_type_list COMMA interface_type 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("interface_type_list",34, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 73: // interface_type_list ::= interface_type 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("interface_type_list",34, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 72: // interfaces_opt ::= interfaces 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("interfaces_opt",33, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 71: // interfaces_opt ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("interfaces_opt",33, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 70: // interfaces ::= IMPLEMENTS interface_type_list 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("interfaces",32, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.get(CUP$parser$top-1));
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 69: // super_opt ::= super_cl 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("super_opt",31, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 68: // super_opt ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("super_opt",31, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 67: // super_cl ::= EXTENDS class_type 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.get(CUP$parser$top-1));
              CUP$parser$result = parser.getSymbolFactory().newSymbol("super_cl",30, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 66: // class_declaration ::= modifiers_opt CLASS IDENTIFIER super_opt interfaces_opt class_body 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3));
              parser.cu.setTypes(parser.fac.toClassDeclaration(false));
              CUP$parser$result = parser.getSymbolFactory().newSymbol("class_declaration",29, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 65: // modifier ::= STRICTFP 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("modifier",28, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 64: // modifier ::= VOLATILE 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("modifier",28, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 63: // modifier ::= TRANSIENT 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("modifier",28, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 62: // modifier ::= SYNCHRONIZED 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("modifier",28, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 61: // modifier ::= NATIVE 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("modifier",28, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 60: // modifier ::= FINAL 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("modifier",28, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 59: // modifier ::= ABSTRACT 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("modifier",28, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 58: // modifier ::= STATIC 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("modifier",28, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 57: // modifier ::= PRIVATE 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("modifier",28, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 56: // modifier ::= PROTECTED 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("modifier",28, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 55: // modifier ::= PUBLIC 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("modifier",28, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 54: // modifiers ::= modifiers modifier 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("modifiers",27, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 53: // modifiers ::= modifier 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("modifiers",27, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 52: // modifiers_opt ::= modifiers 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("modifiers_opt",26, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 51: // modifiers_opt ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("modifiers_opt",26, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // type_declaration ::= SEMICOLON 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type_declaration",25, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // type_declaration ::= interface_declaration 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type_declaration",25, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // type_declaration ::= class_declaration 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type_declaration",25, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // type_import_on_demand_declaration ::= IMPORT name DOT MULT SEMICOLON 
            {
              Object RESULT =null;
              parser.cu.setImports(parser.fac.toImportDeclaration(true));
              CUP$parser$result = parser.getSymbolFactory().newSymbol("type_import_on_demand_declaration",24, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
              
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // single_type_import_declaration ::= IMPORT name SEMICOLON 
            {
              Object RESULT =null;
              parser.cu.setImports(parser.fac.toImportDeclaration(false));
              CUP$parser$result = parser.getSymbolFactory().newSymbol("single_type_import_declaration",23, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
             
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // import_declaration ::= type_import_on_demand_declaration 
            {
              Object RESULT =null;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("import_declaration",22, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // import_declaration ::= single_type_import_declaration 
            {
              Object RESULT =null;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("import_declaration",22, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
              
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // package_declaration ::= PACKAGE name SEMICOLON 
            {
              Object RESULT =null;
              parser.cu.setPackage(parser.fac.toPackageDeclaration());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("package_declaration",17, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // type_declarations ::= type_declarations type_declaration 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type_declarations",21, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // type_declarations ::= type_declaration 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type_declarations",21, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // import_declarations ::= import_declarations import_declaration 
            {
              Object RESULT =null;;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("import_declarations",19, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
              
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // import_declarations ::= import_declaration 
            {
              Object RESULT =null;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("import_declarations",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // type_declarations_opt ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type_declarations_opt",20, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // type_declarations_opt ::= type_declarations 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type_declarations_opt",20, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // import_declarations_opt ::= 
            {
              Object RESULT =null;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("import_declarations_opt",18, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
             
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // import_declarations_opt ::= import_declarations 
            {
              Object RESULT =null;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("import_declarations_opt",18, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
             
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // package_declaration_opt ::= 
            {
              Object RESULT =null;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("package_declaration_opt",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // package_declaration_opt ::= package_declaration 
            {
              Object RESULT =null;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("package_declaration_opt",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // compilation_unit ::= package_declaration_opt import_declarations_opt type_declarations_opt 
            {
              Object RESULT =null;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("compilation_unit",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // qualified_name ::= name DOT IDENTIFIER 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("qualified_name",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
              
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // simple_name ::= IDENTIFIER 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("simple_name",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // name ::= qualified_name 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
             
              CUP$parser$result = parser.getSymbolFactory().newSymbol("name",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
              
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // name ::= simple_name 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("name",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // array_type ::= name dims 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("array_type",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // array_type ::= primitive_type dims 
            {
              Object RESULT =null;
              //array primitive + initialized
              JavaSymbol jvs = new JavaSymbol(0,0,0);
              jvs.sym = Sym.ARRAY;
              parser.fac.addItem(jvs);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("array_type",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // interface_type ::= class_or_interface_type 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("interface_type",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // class_type ::= class_or_interface_type 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("class_type",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // class_or_interface_type ::= name 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("class_or_interface_type",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // reference_type ::= array_type 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("reference_type",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // reference_type ::= class_or_interface_type 
            {
              Object RESULT =null;
       
              CUP$parser$result = parser.getSymbolFactory().newSymbol("reference_type",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // floating_point_type ::= DOUBLE 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("floating_point_type",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // floating_point_type ::= FLOAT 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("floating_point_type",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // integral_type ::= CHAR 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("integral_type",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // integral_type ::= LONG 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("integral_type",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // integral_type ::= INT 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("integral_type",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // integral_type ::= SHORT 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("integral_type",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // integral_type ::= BYTE 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("integral_type",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // numeric_type ::= floating_point_type 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("numeric_type",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // numeric_type ::= integral_type 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("numeric_type",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // primitive_type ::= BOOLEAN 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("primitive_type",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // primitive_type ::= numeric_type 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("primitive_type",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // type ::= reference_type 
            {
              Object RESULT =null;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("type",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
              parser.fac.addItem(CUP$parser$result);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // type ::= primitive_type 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // literal ::= NULL_LITERAL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("literal",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // literal ::= STRING_LITERAL 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              //parser.fac.addMember(parser.fac.toFieldDeclaration_reference());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("literal",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // literal ::= CHARACTER_LITERAL 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              parser.fac.addMember(parser.fac.toFieldDeclaration_primitive());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("literal",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // literal ::= BOOLEAN_LITERAL 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              parser.fac.addMember(parser.fac.toFieldDeclaration_primitive());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("literal",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // literal ::= FLOATING_POINT_LITERAL 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              parser.fac.addMember(parser.fac.toFieldDeclaration_primitive());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("literal",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // literal ::= INTEGER_LITERAL 
            {
              Object RESULT =null;
              parser.fac.addItem((java_cup.runtime.Symbol)CUP$parser$stack.peek());
              parser.fac.addMember(parser.fac.toFieldDeclaration_primitive());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("literal",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // goal ::= compilation_unit 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("goal",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= goal EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}