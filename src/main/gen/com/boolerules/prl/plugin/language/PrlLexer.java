// Generated by JFlex 1.9.1 http://jflex.de/  (tweaked for IntelliJ platform)
// source: PRL.flex

package com.boolerules.prl.plugin.language;

import com.boolerules.prl.plugin.psi.PrlTypes;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.lexer.FlexLexer;


class PrlLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\u10df\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\1\1\2\22\0\1\1\1\3"+
    "\1\4\1\5\2\0\1\6\1\0\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\2\21"+
    "\6\22\2\0\1\23\1\24\1\25\2\0\15\26\1\27"+
    "\14\26\1\30\1\0\1\31\1\0\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\2\26\1\45\1\46\1\47\1\50\1\51\1\26\1\52"+
    "\1\53\1\54\1\55\1\56\1\26\1\57\1\60\1\26"+
    "\1\61\1\0\1\62\7\0\1\1\u01a2\0\2\1\326\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[768];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\1\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\2\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\1\20\21\1\24"+
    "\1\25\1\26\1\0\1\27\2\0\1\15\1\30\1\31"+
    "\1\32\1\0\15\21\1\33\1\34\1\21\1\35\1\36"+
    "\12\21\2\37\1\0\1\15\1\40\1\41\1\42\6\21"+
    "\1\43\6\21\1\44\14\21\1\0\1\15\1\45\1\21"+
    "\1\46\1\21\1\47\1\50\16\21\1\51\1\21\1\52"+
    "\1\53\1\21\1\0\1\15\2\21\1\54\2\21\1\55"+
    "\15\21\1\0\4\21\1\56\1\57\2\21\1\60\4\21"+
    "\1\61\3\21\1\0\2\21\1\62\4\21\1\63\2\21"+
    "\1\64\1\65\1\21\1\0\1\66\2\21\1\67\1\21"+
    "\1\70\3\21\1\0\1\21\1\71\1\72\2\21\1\73"+
    "\1\74\2\21\1\75\1\76\1\77";

  private static int [] zzUnpackAction() {
    int [] result = new int[216];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\63\0\146\0\231\0\314\0\377\0\63\0\63"+
    "\0\63\0\63\0\63\0\63\0\63\0\63\0\63\0\u0132"+
    "\0\u0165\0\u0198\0\u01cb\0\u01fe\0\u0231\0\63\0\63\0\u0264"+
    "\0\u0297\0\u02ca\0\u02fd\0\u0330\0\u0363\0\u0396\0\u03c9\0\u03fc"+
    "\0\u042f\0\u0462\0\u0495\0\u04c8\0\u04fb\0\u052e\0\u0561\0\u0594"+
    "\0\63\0\63\0\63\0\314\0\63\0\u05c7\0\u05fa\0\u062d"+
    "\0\u0660\0\63\0\63\0\u0693\0\u06c6\0\u06f9\0\u072c\0\u075f"+
    "\0\u0792\0\u07c5\0\u07f8\0\u082b\0\u085e\0\u0891\0\u08c4\0\u08f7"+
    "\0\u092a\0\u0231\0\u0231\0\u095d\0\u0990\0\u0231\0\u09c3\0\u09f6"+
    "\0\u0a29\0\u0a5c\0\u0a8f\0\u0ac2\0\u0af5\0\u0b28\0\u0b5b\0\u0b8e"+
    "\0\63\0\u0bc1\0\u0bf4\0\u0c27\0\63\0\63\0\u0231\0\u0c5a"+
    "\0\u0c8d\0\u0cc0\0\u0cf3\0\u0d26\0\u0d59\0\u0231\0\u0d8c\0\u0dbf"+
    "\0\u0df2\0\u0e25\0\u0e58\0\u0e8b\0\u0ebe\0\u0ef1\0\u0f24\0\u0f57"+
    "\0\u0f8a\0\u0fbd\0\u0ff0\0\u1023\0\u1056\0\u1089\0\u10bc\0\u10ef"+
    "\0\u1122\0\u1155\0\u1188\0\u0231\0\u11bb\0\u0231\0\u11ee\0\u0231"+
    "\0\u0231\0\u1221\0\u1254\0\u1287\0\u12ba\0\u12ed\0\u1320\0\u1353"+
    "\0\u1386\0\u13b9\0\u13ec\0\u141f\0\u1452\0\u1485\0\u14b8\0\u0231"+
    "\0\u14eb\0\u151e\0\u0231\0\u1551\0\u1584\0\u15b7\0\u15ea\0\u161d"+
    "\0\u0231\0\u1650\0\u1683\0\u0231\0\u16b6\0\u16e9\0\u171c\0\u174f"+
    "\0\u1782\0\u17b5\0\u17e8\0\u181b\0\u184e\0\u1881\0\u18b4\0\u18e7"+
    "\0\u191a\0\u194d\0\u1980\0\u19b3\0\u19e6\0\u1a19\0\u0231\0\u0231"+
    "\0\u1a4c\0\u1a7f\0\u0231\0\u1ab2\0\u1ae5\0\u1b18\0\u1b4b\0\u0231"+
    "\0\u1b7e\0\u1bb1\0\u1be4\0\u1c17\0\u1c4a\0\u1c7d\0\u0231\0\u1cb0"+
    "\0\u1ce3\0\u1d16\0\u1d49\0\u0231\0\u1d7c\0\u1daf\0\u0231\0\u0231"+
    "\0\u1de2\0\u1e15\0\u0231\0\u1e48\0\u1e7b\0\u0231\0\u1eae\0\u0231"+
    "\0\u1ee1\0\u1f14\0\u1f47\0\u1f7a\0\u1fad\0\u0231\0\u0231\0\u1fe0"+
    "\0\u2013\0\u0231\0\63\0\u2046\0\u2079\0\u0231\0\u0231\0\u0231";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[216];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\3\21"+
    "\1\22\1\23\1\24\2\25\1\26\1\27\1\25\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\25\1\42\1\25\1\43\1\44\1\45\1\46"+
    "\1\47\1\25\1\50\2\25\1\51\1\52\64\0\2\3"+
    "\104\0\1\53\36\0\2\54\1\0\1\54\1\55\56\54"+
    "\2\6\1\0\60\6\15\0\1\56\1\0\4\57\55\0"+
    "\1\56\1\0\4\60\64\0\1\61\63\0\1\62\61\0"+
    "\1\63\52\0\2\25\1\0\4\25\3\0\2\25\2\0"+
    "\1\25\1\0\25\25\2\0\2\64\1\0\30\64\1\0"+
    "\27\64\14\0\2\25\1\0\4\25\3\0\2\25\2\0"+
    "\1\25\1\0\12\25\1\65\12\25\16\0\2\25\1\0"+
    "\4\25\3\0\2\25\2\0\1\25\1\0\14\25\1\66"+
    "\10\25\16\0\2\25\1\0\4\25\3\0\2\25\2\0"+
    "\1\25\1\0\14\25\1\67\10\25\16\0\2\25\1\0"+
    "\4\25\3\0\2\25\2\0\1\25\1\0\1\70\3\25"+
    "\1\71\20\25\16\0\2\25\1\0\4\25\3\0\2\25"+
    "\2\0\1\25\1\0\11\25\1\72\1\25\1\73\7\25"+
    "\1\74\1\25\16\0\2\25\1\0\4\25\3\0\2\25"+
    "\2\0\1\25\1\0\1\75\3\25\1\76\7\25\1\77"+
    "\10\25\16\0\2\25\1\0\4\25\3\0\2\25\2\0"+
    "\1\25\1\0\16\25\1\100\6\25\16\0\2\25\1\0"+
    "\4\25\3\0\2\25\2\0\1\25\1\0\4\25\1\101"+
    "\20\25\16\0\2\25\1\0\4\25\3\0\2\25\2\0"+
    "\1\25\1\0\3\25\1\102\1\25\1\103\4\25\1\104"+
    "\1\105\3\25\1\106\5\25\16\0\2\25\1\0\4\25"+
    "\3\0\2\25\2\0\1\25\1\0\1\107\13\25\1\110"+
    "\10\25\16\0\2\25\1\0\4\25\3\0\2\25\2\0"+
    "\1\25\1\0\15\25\1\111\7\25\16\0\2\25\1\0"+
    "\4\25\3\0\2\25\2\0\1\25\1\0\16\25\1\112"+
    "\2\25\1\113\3\25\16\0\2\25\1\0\4\25\3\0"+
    "\2\25\2\0\1\25\1\0\21\25\1\114\3\25\16\0"+
    "\2\25\1\0\4\25\3\0\2\25\2\0\1\25\1\0"+
    "\11\25\1\115\13\25\16\0\2\25\1\0\4\25\3\0"+
    "\2\25\2\0\1\25\1\0\7\25\1\116\6\25\1\117"+
    "\6\25\16\0\2\25\1\0\4\25\3\0\2\25\2\0"+
    "\1\25\1\0\4\25\1\120\20\25\21\0\1\121\3\122"+
    "\57\0\4\123\55\0\1\56\1\0\4\124\65\0\1\125"+
    "\35\0\2\64\1\0\30\64\1\126\27\64\14\0\2\25"+
    "\1\0\4\25\3\0\2\25\2\0\1\25\1\0\14\25"+
    "\1\127\10\25\16\0\2\25\1\0\4\25\3\0\2\25"+
    "\2\0\1\25\1\0\14\25\1\130\10\25\16\0\2\25"+
    "\1\0\4\25\3\0\2\25\2\0\1\25\1\0\13\25"+
    "\1\131\11\25\16\0\2\25\1\0\4\25\3\0\2\25"+
    "\2\0\1\25\1\0\20\25\1\132\4\25\16\0\2\25"+
    "\1\0\4\25\3\0\2\25\2\0\1\25\1\0\17\25"+
    "\1\133\5\25\16\0\2\25\1\0\4\25\3\0\2\25"+
    "\2\0\1\25\1\0\17\25\1\134\5\25\16\0\2\25"+
    "\1\0\4\25\3\0\2\25\2\0\1\25\1\0\21\25"+
    "\1\135\3\25\16\0\2\25\1\0\4\25\3\0\2\25"+
    "\2\0\1\25\1\0\14\25\1\136\10\25\16\0\2\25"+
    "\1\0\4\25\3\0\2\25\2\0\1\25\1\0\11\25"+
    "\1\137\13\25\16\0\2\25\1\0\4\25\3\0\2\25"+
    "\2\0\1\25\1\0\1\140\24\25\16\0\2\25\1\0"+
    "\4\25\3\0\2\25\2\0\1\25\1\0\16\25\1\141"+
    "\6\25\16\0\2\25\1\0\4\25\3\0\2\25\2\0"+
    "\1\25\1\0\14\25\1\142\10\25\16\0\2\25\1\0"+
    "\4\25\3\0\2\25\2\0\1\25\1\0\1\143\24\25"+
    "\16\0\2\25\1\0\4\25\3\0\2\25\2\0\1\25"+
    "\1\0\15\25\1\144\7\25\16\0\2\25\1\0\4\25"+
    "\3\0\2\25\2\0\1\25\1\0\20\25\1\145\4\25"+
    "\16\0\2\25\1\0\4\25\3\0\2\25\2\0\1\25"+
    "\1\0\13\25\1\146\11\25\16\0\2\25\1\0\4\25"+
    "\3\0\2\25\2\0\1\25\1\0\3\25\1\147\21\25"+
    "\16\0\2\25\1\0\4\25\3\0\2\25\2\0\1\25"+
    "\1\0\20\25\1\150\4\25\16\0\2\25\1\0\4\25"+
    "\3\0\2\25\2\0\1\25\1\0\10\25\1\151\1\152"+
    "\2\25\1\153\10\25\16\0\2\25\1\0\4\25\3\0"+
    "\2\25\2\0\1\25\1\0\1\25\1\154\23\25\16\0"+
    "\2\25\1\0\4\25\3\0\2\25\2\0\1\25\1\0"+
    "\11\25\1\155\13\25\16\0\2\25\1\0\4\25\3\0"+
    "\2\25\2\0\1\25\1\0\10\25\1\156\14\25\16\0"+
    "\2\25\1\0\4\25\3\0\2\25\2\0\1\25\1\0"+
    "\4\25\1\157\20\25\16\0\2\25\1\0\4\25\3\0"+
    "\2\25\2\0\1\25\1\0\21\25\1\160\3\25\16\0"+
    "\2\25\1\0\4\25\3\0\2\25\2\0\1\25\1\0"+
    "\16\25\1\161\6\25\21\0\4\122\57\0\4\162\55\0"+
    "\1\56\1\0\4\163\54\0\2\25\1\0\4\25\3\0"+
    "\2\25\2\0\1\25\1\0\11\25\1\164\13\25\16\0"+
    "\2\25\1\0\4\25\3\0\2\25\2\0\1\25\1\0"+
    "\20\25\1\165\4\25\16\0\2\25\1\0\4\25\3\0"+
    "\2\25\2\0\1\25\1\0\4\25\1\166\20\25\16\0"+
    "\2\25\1\0\4\25\3\0\2\25\2\0\1\25\1\0"+
    "\2\25\1\167\22\25\16\0\2\25\1\0\4\25\3\0"+
    "\2\25\2\0\1\25\1\0\4\25\1\170\20\25\16\0"+
    "\2\25\1\0\4\25\3\0\2\25\2\0\1\25\1\0"+
    "\12\25\1\171\12\25\16\0\2\25\1\0\4\25\3\0"+
    "\2\25\2\0\1\25\1\0\17\25\1\172\5\25\16\0"+
    "\2\25\1\0\4\25\3\0\2\25\2\0\1\25\1\0"+
    "\20\25\1\173\4\25\16\0\2\25\1\0\4\25\3\0"+
    "\2\25\2\0\1\25\1\0\1\25\1\174\23\25\16\0"+
    "\2\25\1\0\4\25\3\0\2\25\2\0\1\25\1\0"+
    "\21\25\1\175\3\25\16\0\2\25\1\0\4\25\3\0"+
    "\2\25\2\0\1\25\1\0\3\25\1\176\21\25\16\0"+
    "\2\25\1\0\4\25\3\0\2\25\2\0\1\25\1\0"+
    "\14\25\1\177\10\25\16\0\2\25\1\0\4\25\3\0"+
    "\2\25\2\0\1\25\1\0\4\25\1\200\20\25\16\0"+
    "\2\25\1\0\4\25\3\0\2\25\2\0\1\25\1\0"+
    "\3\25\1\201\21\25\16\0\2\25\1\0\4\25\3\0"+
    "\2\25\2\0\1\25\1\0\21\25\1\202\3\25\16\0"+
    "\2\25\1\0\4\25\3\0\2\25\2\0\1\25\1\0"+
    "\10\25\1\203\14\25\16\0\2\25\1\0\4\25\3\0"+
    "\2\25\2\0\1\25\1\0\22\25\1\204\2\25\16\0"+
    "\2\25\1\0\4\25\3\0\2\25\2\0\1\205\1\0"+
    "\25\25\16\0\2\25\1\0\4\25\3\0\2\25\2\0"+
    "\1\25\1\0\15\25\1\206\7\25\16\0\2\25\1\0"+
    "\4\25\3\0\2\25\2\0\1\25\1\0\11\25\1\207"+
    "\13\25\16\0\2\25\1\0\4\25\3\0\2\25\2\0"+
    "\1\25\1\0\4\25\1\210\20\25\16\0\2\25\1\0"+
    "\4\25\3\0\2\25\2\0\1\25\1\0\2\25\1\211"+
    "\22\25\16\0\2\25\1\0\4\25\3\0\2\25\2\0"+
    "\1\25\1\0\13\25\1\212\11\25\16\0\2\25\1\0"+
    "\4\25\3\0\2\25\2\0\1\25\1\0\4\25\1\213"+
    "\20\25\16\0\2\25\1\0\4\25\3\0\2\25\2\0"+
    "\1\25\1\0\17\25\1\214\5\25\16\0\1\215\62\0"+
    "\1\215\1\56\1\0\4\216\54\0\2\25\1\0\4\25"+
    "\3\0\2\25\2\0\1\25\1\0\1\217\24\25\16\0"+
    "\2\25\1\0\4\25\3\0\2\25\2\0\1\25\1\0"+
    "\16\25\1\220\6\25\16\0\2\25\1\0\4\25\3\0"+
    "\2\25\2\0\1\25\1\0\4\25\1\221\20\25\16\0"+
    "\2\25\1\0\4\25\3\0\2\25\2\0\1\25\1\0"+
    "\21\25\1\222\3\25\16\0\2\25\1\0\4\25\3\0"+
    "\2\25\2\0\1\25\1\0\10\25\1\223\14\25\16\0"+
    "\2\25\1\0\4\25\3\0\2\25\2\0\1\25\1\0"+
    "\15\25\1\224\7\25\16\0\2\25\1\0\4\25\3\0"+
    "\2\25\2\0\1\25\1\0\4\25\1\225\20\25\16\0"+
    "\2\25\1\0\4\25\3\0\2\25\2\0\1\25\1\0"+
    "\16\25\1\226\6\25\16\0\2\25\1\0\4\25\3\0"+
    "\2\25\2\0\1\25\1\0\16\25\1\227\6\25\16\0"+
    "\2\25\1\0\4\25\3\0\2\25\2\0\1\25\1\0"+
    "\1\230\24\25\16\0\2\25\1\0\4\25\3\0\2\25"+
    "\2\0\1\25\1\0\11\25\1\231\13\25\16\0\2\25"+
    "\1\0\4\25\3\0\2\25\2\0\1\25\1\0\14\25"+
    "\1\232\10\25\16\0\2\25\1\0\4\25\3\0\2\25"+
    "\2\0\1\25\1\0\1\233\24\25\16\0\2\25\1\0"+
    "\4\25\3\0\2\25\2\0\1\25\1\0\22\25\1\234"+
    "\2\25\16\0\2\25\1\0\4\25\3\0\2\25\2\0"+
    "\1\25\1\0\4\25\1\235\20\25\16\0\2\25\1\0"+
    "\4\25\3\0\2\25\2\0\1\25\1\0\10\25\1\236"+
    "\14\25\16\0\2\25\1\0\4\25\3\0\2\25\2\0"+
    "\1\25\1\0\10\25\1\237\14\25\16\0\2\25\1\0"+
    "\4\25\3\0\1\25\1\240\2\0\1\25\1\0\25\25"+
    "\16\0\2\25\1\0\4\25\3\0\2\25\2\0\1\25"+
    "\1\0\10\25\1\241\14\25\21\0\2\242\57\0\1\56"+
    "\1\0\4\216\54\0\2\25\1\0\4\25\3\0\2\25"+
    "\2\0\1\25\1\0\10\25\1\243\14\25\16\0\2\25"+
    "\1\0\4\25\3\0\2\25\2\0\1\25\1\0\10\25"+
    "\1\244\14\25\16\0\2\25\1\0\4\25\3\0\2\25"+
    "\2\0\1\25\1\0\16\25\1\245\6\25\16\0\2\25"+
    "\1\0\4\25\3\0\2\25\2\0\1\25\1\0\3\25"+
    "\1\246\21\25\16\0\2\25\1\0\4\25\3\0\2\25"+
    "\2\0\1\25\1\0\16\25\1\247\6\25\16\0\2\25"+
    "\1\0\4\25\3\0\2\25\2\0\1\25\1\0\20\25"+
    "\1\250\4\25\16\0\2\25\1\0\4\25\3\0\2\25"+
    "\2\0\1\25\1\0\13\25\1\251\11\25\16\0\2\25"+
    "\1\0\4\25\3\0\2\25\2\0\1\25\1\0\20\25"+
    "\1\252\4\25\16\0\2\25\1\0\4\25\3\0\2\25"+
    "\2\0\1\25\1\0\4\25\1\253\20\25\16\0\2\25"+
    "\1\0\4\25\3\0\2\25\2\0\1\25\1\0\13\25"+
    "\1\254\11\25\16\0\2\25\1\0\4\25\3\0\2\25"+
    "\2\0\1\25\1\0\20\25\1\255\4\25\16\0\2\25"+
    "\1\0\4\25\3\0\2\25\2\0\1\25\1\0\4\25"+
    "\1\256\20\25\16\0\2\25\1\0\4\25\3\0\2\25"+
    "\2\0\1\25\1\0\16\25\1\257\6\25\16\0\2\25"+
    "\1\0\4\25\3\0\2\25\2\0\1\25\1\0\2\25"+
    "\1\260\22\25\16\0\2\25\1\0\4\25\3\0\2\25"+
    "\2\0\1\25\1\0\13\25\1\261\11\25\16\0\2\25"+
    "\1\0\4\25\3\0\2\25\2\0\1\25\1\0\14\25"+
    "\1\262\10\25\16\0\2\25\1\0\4\25\3\0\2\25"+
    "\2\0\1\25\1\0\14\25\1\263\10\25\21\0\4\264"+
    "\54\0\2\25\1\0\4\25\3\0\2\25\2\0\1\25"+
    "\1\0\13\25\1\265\11\25\16\0\2\25\1\0\4\25"+
    "\3\0\2\25\2\0\1\25\1\0\15\25\1\266\7\25"+
    "\16\0\2\25\1\0\4\25\3\0\2\25\2\0\1\25"+
    "\1\0\4\25\1\267\20\25\16\0\2\25\1\0\4\25"+
    "\3\0\2\25\2\0\1\25\1\0\3\25\1\270\21\25"+
    "\16\0\2\25\1\0\4\25\3\0\2\25\2\0\1\25"+
    "\1\0\1\271\24\25\16\0\2\25\1\0\4\25\3\0"+
    "\2\25\2\0\1\25\1\0\14\25\1\272\10\25\16\0"+
    "\2\25\1\0\4\25\3\0\2\25\2\0\1\25\1\0"+
    "\1\273\24\25\16\0\2\25\1\0\4\25\3\0\2\25"+
    "\2\0\1\25\1\0\4\25\1\274\20\25\16\0\2\25"+
    "\1\0\4\25\3\0\2\25\2\0\1\25\1\0\16\25"+
    "\1\275\6\25\16\0\2\25\1\0\4\25\3\0\2\25"+
    "\2\0\1\25\1\0\20\25\1\276\4\25\16\0\2\25"+
    "\1\0\4\25\3\0\2\25\2\0\1\25\1\0\6\25"+
    "\1\277\16\25\16\0\2\25\1\0\4\25\3\0\2\25"+
    "\2\0\1\25\1\0\20\25\1\300\4\25\16\0\2\25"+
    "\1\0\4\25\3\0\2\25\2\0\1\25\1\0\13\25"+
    "\1\301\11\25\16\0\1\302\62\0\2\25\1\0\4\25"+
    "\3\0\2\25\2\0\1\25\1\0\17\25\1\303\5\25"+
    "\16\0\2\25\1\0\4\25\3\0\2\25\2\0\1\25"+
    "\1\0\20\25\1\304\4\25\16\0\2\25\1\0\4\25"+
    "\3\0\2\25\2\0\1\25\1\0\4\25\1\305\20\25"+
    "\16\0\2\25\1\0\4\25\3\0\2\25\2\0\1\25"+
    "\1\0\11\25\1\306\13\25\16\0\2\25\1\0\4\25"+
    "\3\0\2\25\2\0\1\25\1\0\16\25\1\307\6\25"+
    "\16\0\2\25\1\0\4\25\3\0\2\25\2\0\1\25"+
    "\1\0\11\25\1\310\13\25\16\0\2\25\1\0\4\25"+
    "\3\0\2\25\2\0\1\25\1\0\17\25\1\311\5\25"+
    "\16\0\2\25\1\0\4\25\3\0\2\25\2\0\1\25"+
    "\1\0\10\25\1\312\14\25\16\0\2\25\1\0\4\25"+
    "\3\0\2\25\2\0\1\25\1\0\4\25\1\313\20\25"+
    "\21\0\3\314\55\0\2\25\1\0\4\25\3\0\2\25"+
    "\2\0\1\25\1\0\10\25\1\315\14\25\16\0\2\25"+
    "\1\0\4\25\3\0\2\25\2\0\1\25\1\0\13\25"+
    "\1\316\11\25\16\0\2\25\1\0\4\25\3\0\2\25"+
    "\2\0\1\25\1\0\24\25\1\317\16\0\2\25\1\0"+
    "\4\25\3\0\2\25\2\0\1\25\1\0\10\25\1\320"+
    "\14\25\16\0\2\25\1\0\4\25\3\0\2\25\2\0"+
    "\1\25\1\0\4\25\1\321\20\25\16\0\2\25\1\0"+
    "\4\25\3\0\2\25\2\0\1\25\1\0\3\25\1\322"+
    "\21\25\21\0\4\323\54\0\2\25\1\0\4\25\3\0"+
    "\2\25\2\0\1\25\1\0\14\25\1\324\10\25\16\0"+
    "\2\25\1\0\4\25\3\0\2\25\2\0\1\25\1\0"+
    "\14\25\1\325\10\25\16\0\2\25\1\0\4\25\3\0"+
    "\2\25\2\0\1\25\1\0\17\25\1\326\5\25\16\0"+
    "\2\25\1\0\4\25\3\0\2\25\2\0\1\25\1\0"+
    "\13\25\1\327\11\25\16\0\2\25\1\0\4\25\3\0"+
    "\2\25\2\0\1\25\1\0\13\25\1\330\11\25\2\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[8364];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\11\11\6\1\2\11\21\1\3\11"+
    "\1\0\1\11\2\0\2\1\2\11\1\0\34\1\1\11"+
    "\1\1\1\0\1\1\2\11\33\1\1\0\32\1\1\0"+
    "\24\1\1\0\21\1\1\0\15\1\1\0\11\1\1\0"+
    "\6\1\1\11\5\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[216];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  protected int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  PrlLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return TokenType.BAD_CHARACTER;
            }
          // fall through
          case 64: break;
          case 2:
            { return TokenType.WHITE_SPACE;
            }
          // fall through
          case 65: break;
          case 3:
            { return PrlTypes.COMMENT;
            }
          // fall through
          case 66: break;
          case 4:
            { return PrlTypes.AND ;
            }
          // fall through
          case 67: break;
          case 5:
            { return PrlTypes.LPAR ;
            }
          // fall through
          case 68: break;
          case 6:
            { return PrlTypes.RPAR ;
            }
          // fall through
          case 69: break;
          case 7:
            { return PrlTypes.MUL ;
            }
          // fall through
          case 70: break;
          case 8:
            { return PrlTypes.ADD ;
            }
          // fall through
          case 71: break;
          case 9:
            { return PrlTypes.COMMA ;
            }
          // fall through
          case 72: break;
          case 10:
            { return PrlTypes.NOT_MINUS ;
            }
          // fall through
          case 73: break;
          case 11:
            { return PrlTypes.DOT ;
            }
          // fall through
          case 74: break;
          case 12:
            { return PrlTypes.OR ;
            }
          // fall through
          case 75: break;
          case 13:
            { return PrlTypes.NUMBER_VAL ;
            }
          // fall through
          case 76: break;
          case 14:
            { return PrlTypes.LT ;
            }
          // fall through
          case 77: break;
          case 15:
            { return PrlTypes.EQ ;
            }
          // fall through
          case 78: break;
          case 16:
            { return PrlTypes.GT ;
            }
          // fall through
          case 79: break;
          case 17:
            { return PrlTypes.IDENT ;
            }
          // fall through
          case 80: break;
          case 18:
            { return PrlTypes.LSQB ;
            }
          // fall through
          case 81: break;
          case 19:
            { return PrlTypes.RSQB ;
            }
          // fall through
          case 82: break;
          case 20:
            { return PrlTypes.LBRA ;
            }
          // fall through
          case 83: break;
          case 21:
            { return PrlTypes.RBRA ;
            }
          // fall through
          case 84: break;
          case 22:
            { return PrlTypes.NE ;
            }
          // fall through
          case 85: break;
          case 23:
            { return PrlTypes.QUOTED ;
            }
          // fall through
          case 86: break;
          case 24:
            { return PrlTypes.LE ;
            }
          // fall through
          case 87: break;
          case 25:
            { return PrlTypes.IMPL ;
            }
          // fall through
          case 88: break;
          case 26:
            { return PrlTypes.GE ;
            }
          // fall through
          case 89: break;
          case 27:
            { return PrlTypes.ID ;
            }
          // fall through
          case 90: break;
          case 28:
            { return PrlTypes.IF ;
            }
          // fall through
          case 91: break;
          case 29:
            { return PrlTypes.IN ;
            }
          // fall through
          case 92: break;
          case 30:
            { return PrlTypes.IS ;
            }
          // fall through
          case 93: break;
          case 31:
            { return PrlTypes.VERSION_VAL ;
            }
          // fall through
          case 94: break;
          case 32:
            { return PrlTypes.EQUIV ;
            }
          // fall through
          case 95: break;
          case 33:
            { return PrlTypes.BTCK_IDENTIFIER ;
            }
          // fall through
          case 96: break;
          case 34:
            { return PrlTypes.AMO ;
            }
          // fall through
          case 97: break;
          case 35:
            { return PrlTypes.EXO ;
            }
          // fall through
          case 98: break;
          case 36:
            { return PrlTypes.INT ;
            }
          // fall through
          case 99: break;
          case 37:
            { return PrlTypes.BOOL ;
            }
          // fall through
          case 100: break;
          case 38:
            { return PrlTypes.DATE ;
            }
          // fall through
          case 101: break;
          case 39:
            { return PrlTypes.ELSE ;
            }
          // fall through
          case 102: break;
          case 40:
            { return PrlTypes.ENUM ;
            }
          // fall through
          case 103: break;
          case 41:
            { return PrlTypes.RULE ;
            }
          // fall through
          case 104: break;
          case 42:
            { return PrlTypes.THEN ;
            }
          // fall through
          case 105: break;
          case 43:
            { return PrlTypes.TRUE ;
            }
          // fall through
          case 106: break;
          case 44:
            { return PrlTypes.FALSE ;
            }
          // fall through
          case 107: break;
          case 45:
            { return PrlTypes.GROUP ;
            }
          // fall through
          case 108: break;
          case 46:
            { return PrlTypes.HEADER ;
            }
          // fall through
          case 109: break;
          case 47:
            { return PrlTypes.IMPORT ;
            }
          // fall through
          case 110: break;
          case 48:
            { return PrlTypes.MODULE ;
            }
          // fall through
          case 111: break;
          case 49:
            { return PrlTypes.PUBLIC ;
            }
          // fall through
          case 112: break;
          case 50:
            { return PrlTypes.FEAT ;
            }
          // fall through
          case 113: break;
          case 51:
            { return PrlTypes.PRIVATE_ ;
            }
          // fall through
          case 114: break;
          case 52:
            { return PrlTypes.SLICING ;
            }
          // fall through
          case 115: break;
          case 53:
            { return PrlTypes.THEN_NOT ;
            }
          // fall through
          case 116: break;
          case 54:
            { return PrlTypes.CONTAINS ;
            }
          // fall through
          case 117: break;
          case 55:
            { return PrlTypes.INTERNAL ;
            }
          // fall through
          case 118: break;
          case 56:
            { return PrlTypes.OPTIONAL ;
            }
          // fall through
          case 119: break;
          case 57:
            { return PrlTypes.FORBIDDEN ;
            }
          // fall through
          case 120: break;
          case 58:
            { return PrlTypes.MANDATORY ;
            }
          // fall through
          case 121: break;
          case 59:
            { return PrlTypes.VERSIONED ;
            }
          // fall through
          case 122: break;
          case 60:
            { return PrlTypes.DATE_VAL ;
            }
          // fall through
          case 123: break;
          case 61:
            { return PrlTypes.PROPERTIES ;
            }
          // fall through
          case 124: break;
          case 62:
            { return PrlTypes.DESCRIPTION ;
            }
          // fall through
          case 125: break;
          case 63:
            { return PrlTypes.PRL_VERSION ;
            }
          // fall through
          case 126: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
