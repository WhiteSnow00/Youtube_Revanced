import java.util.Set;
import java.util.HashSet;
import java.util.regex.Pattern;
import java.util.Map;
import java.util.Collections;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeyq
{
    private static final ahbd a;
    private static final ahbd b;
    
    static {
        aexa.i((CharSequence)"\u0091\u0092\u2018\u2019");
        aexa.i((CharSequence)"\u0093\u0094\u201c\u201d");
        final HashMap hashMap = new HashMap(252);
        hashMap.put("&nbsp", '�');
        hashMap.put("&iexcl", '�');
        hashMap.put("&cent", '�');
        hashMap.put("&pound", '�');
        hashMap.put("&curren", '�');
        hashMap.put("&yen", '�');
        hashMap.put("&brvbar", '�');
        hashMap.put("&sect", '�');
        hashMap.put("&uml", '�');
        hashMap.put("&copy", '�');
        hashMap.put("&ordf", '�');
        hashMap.put("&laquo", '�');
        hashMap.put("&not", '�');
        hashMap.put("&shy", '\u00ad');
        hashMap.put("&reg", '�');
        hashMap.put("&macr", '�');
        hashMap.put("&deg", '�');
        hashMap.put("&plusmn", '�');
        hashMap.put("&sup2", '�');
        hashMap.put("&sup3", '�');
        hashMap.put("&acute", '�');
        hashMap.put("&micro", '�');
        hashMap.put("&para", '�');
        hashMap.put("&middot", '�');
        hashMap.put("&cedil", '�');
        hashMap.put("&sup1", '�');
        hashMap.put("&ordm", '�');
        hashMap.put("&raquo", '�');
        hashMap.put("&frac14", '�');
        hashMap.put("&frac12", '�');
        hashMap.put("&frac34", '�');
        hashMap.put("&iquest", '�');
        hashMap.put("&Agrave", '\u00c0');
        hashMap.put("&Aacute", '\u00c1');
        hashMap.put("&Acirc", '\u00c2');
        hashMap.put("&Atilde", '\u00c3');
        hashMap.put("&Auml", '\u00c4');
        hashMap.put("&Aring", '\u00c5');
        hashMap.put("&AElig", '\u00c6');
        hashMap.put("&Ccedil", '\u00c7');
        hashMap.put("&Egrave", '\u00c8');
        hashMap.put("&Eacute", '\u00c9');
        hashMap.put("&Ecirc", '\u00ca');
        hashMap.put("&Euml", '\u00cb');
        hashMap.put("&Igrave", '\u00cc');
        hashMap.put("&Iacute", '\u00cd');
        hashMap.put("&Icirc", '\u00ce');
        hashMap.put("&Iuml", '\u00cf');
        hashMap.put("&ETH", '\u00d0');
        hashMap.put("&Ntilde", '\u00d1');
        hashMap.put("&Ograve", '\u00d2');
        hashMap.put("&Oacute", '\u00d3');
        hashMap.put("&Ocirc", '\u00d4');
        hashMap.put("&Otilde", '\u00d5');
        hashMap.put("&Ouml", '\u00d6');
        hashMap.put("&times", '\u00d7');
        hashMap.put("&Oslash", '\u00d8');
        hashMap.put("&Ugrave", '\u00d9');
        hashMap.put("&Uacute", '\u00da');
        hashMap.put("&Ucirc", '\u00db');
        hashMap.put("&Uuml", '\u00dc');
        hashMap.put("&Yacute", '\u00dd');
        hashMap.put("&THORN", '\u00de');
        hashMap.put("&szlig", '\u00df');
        hashMap.put("&agrave", '\u00e0');
        hashMap.put("&aacute", '\u00e1');
        hashMap.put("&acirc", '\u00e2');
        hashMap.put("&atilde", '\u00e3');
        hashMap.put("&auml", '\u00e4');
        hashMap.put("&aring", '\u00e5');
        hashMap.put("&aelig", '\u00e6');
        hashMap.put("&ccedil", '\u00e7');
        hashMap.put("&egrave", '\u00e8');
        hashMap.put("&eacute", '\u00e9');
        hashMap.put("&ecirc", '\u00ea');
        hashMap.put("&euml", '\u00eb');
        hashMap.put("&igrave", '\u00ec');
        hashMap.put("&iacute", '\u00ed');
        hashMap.put("&icirc", '\u00ee');
        hashMap.put("&iuml", '\u00ef');
        hashMap.put("&eth", '\u00f0');
        hashMap.put("&ntilde", '\u00f1');
        hashMap.put("&ograve", '\u00f2');
        hashMap.put("&oacute", '\u00f3');
        hashMap.put("&ocirc", '\u00f4');
        hashMap.put("&otilde", '\u00f5');
        hashMap.put("&ouml", '\u00f6');
        hashMap.put("&divide", '\u00f7');
        hashMap.put("&oslash", '\u00f8');
        hashMap.put("&ugrave", '\u00f9');
        hashMap.put("&uacute", '\u00fa');
        hashMap.put("&ucirc", '\u00fb');
        hashMap.put("&uuml", '\u00fc');
        hashMap.put("&yacute", '\u00fd');
        hashMap.put("&thorn", '\u00fe');
        hashMap.put("&yuml", '\u00ff');
        hashMap.put("&fnof", '\u0192');
        hashMap.put("&Alpha", '\u0391');
        hashMap.put("&Beta", '\u0392');
        hashMap.put("&Gamma", '\u0393');
        hashMap.put("&Delta", '\u0394');
        hashMap.put("&Epsilon", '\u0395');
        hashMap.put("&Zeta", '\u0396');
        hashMap.put("&Eta", '\u0397');
        hashMap.put("&Theta", '\u0398');
        hashMap.put("&Iota", '\u0399');
        hashMap.put("&Kappa", '\u039a');
        hashMap.put("&Lambda", '\u039b');
        hashMap.put("&Mu", '\u039c');
        hashMap.put("&Nu", '\u039d');
        hashMap.put("&Xi", '\u039e');
        hashMap.put("&Omicron", '\u039f');
        hashMap.put("&Pi", '\u03a0');
        hashMap.put("&Rho", '\u03a1');
        hashMap.put("&Sigma", '\u03a3');
        hashMap.put("&Tau", '\u03a4');
        hashMap.put("&Upsilon", '\u03a5');
        hashMap.put("&Phi", '\u03a6');
        hashMap.put("&Chi", '\u03a7');
        hashMap.put("&Psi", '\u03a8');
        hashMap.put("&Omega", '\u03a9');
        hashMap.put("&alpha", '\u03b1');
        hashMap.put("&beta", '\u03b2');
        hashMap.put("&gamma", '\u03b3');
        hashMap.put("&delta", '\u03b4');
        hashMap.put("&epsilon", '\u03b5');
        hashMap.put("&zeta", '\u03b6');
        hashMap.put("&eta", '\u03b7');
        hashMap.put("&theta", '\u03b8');
        hashMap.put("&iota", '\u03b9');
        hashMap.put("&kappa", '\u03ba');
        hashMap.put("&lambda", '\u03bb');
        hashMap.put("&mu", '\u03bc');
        hashMap.put("&nu", '\u03bd');
        hashMap.put("&xi", '\u03be');
        hashMap.put("&omicron", '\u03bf');
        hashMap.put("&pi", '\u03c0');
        hashMap.put("&rho", '\u03c1');
        hashMap.put("&sigmaf", '\u03c2');
        hashMap.put("&sigma", '\u03c3');
        hashMap.put("&tau", '\u03c4');
        hashMap.put("&upsilon", '\u03c5');
        hashMap.put("&phi", '\u03c6');
        hashMap.put("&chi", '\u03c7');
        hashMap.put("&psi", '\u03c8');
        hashMap.put("&omega", '\u03c9');
        hashMap.put("&thetasym", '\u03d1');
        hashMap.put("&upsih", '\u03d2');
        hashMap.put("&piv", '\u03d6');
        hashMap.put("&bull", '\u2022');
        hashMap.put("&hellip", '\u2026');
        hashMap.put("&prime", '\u2032');
        hashMap.put("&Prime", '\u2033');
        hashMap.put("&oline", '\u203e');
        hashMap.put("&frasl", '\u2044');
        hashMap.put("&weierp", '\u2118');
        hashMap.put("&image", '\u2111');
        hashMap.put("&real", '\u211c');
        hashMap.put("&trade", '\u2122');
        hashMap.put("&alefsym", '\u2135');
        hashMap.put("&larr", '\u2190');
        hashMap.put("&uarr", '\u2191');
        hashMap.put("&rarr", '\u2192');
        hashMap.put("&darr", '\u2193');
        hashMap.put("&harr", '\u2194');
        hashMap.put("&crarr", '\u21b5');
        hashMap.put("&lArr", '\u21d0');
        hashMap.put("&uArr", '\u21d1');
        hashMap.put("&rArr", '\u21d2');
        hashMap.put("&dArr", '\u21d3');
        hashMap.put("&hArr", '\u21d4');
        hashMap.put("&forall", '\u2200');
        hashMap.put("&part", '\u2202');
        hashMap.put("&exist", '\u2203');
        hashMap.put("&empty", '\u2205');
        hashMap.put("&nabla", '\u2207');
        hashMap.put("&isin", '\u2208');
        hashMap.put("&notin", '\u2209');
        hashMap.put("&ni", '\u220b');
        hashMap.put("&prod", '\u220f');
        hashMap.put("&sum", '\u2211');
        hashMap.put("&minus", '\u2212');
        hashMap.put("&lowast", '\u2217');
        hashMap.put("&radic", '\u221a');
        hashMap.put("&prop", '\u221d');
        hashMap.put("&infin", '\u221e');
        hashMap.put("&ang", '\u2220');
        hashMap.put("&and", '\u2227');
        hashMap.put("&or", '\u2228');
        hashMap.put("&cap", '\u2229');
        hashMap.put("&cup", '\u222a');
        hashMap.put("&int", '\u222b');
        hashMap.put("&there4", '\u2234');
        hashMap.put("&sim", '\u223c');
        hashMap.put("&cong", '\u2245');
        hashMap.put("&asymp", '\u2248');
        hashMap.put("&ne", '\u2260');
        hashMap.put("&equiv", '\u2261');
        hashMap.put("&le", '\u2264');
        hashMap.put("&ge", '\u2265');
        hashMap.put("&sub", '\u2282');
        hashMap.put("&sup", '\u2283');
        hashMap.put("&nsub", '\u2284');
        hashMap.put("&sube", '\u2286');
        hashMap.put("&supe", '\u2287');
        hashMap.put("&oplus", '\u2295');
        hashMap.put("&otimes", '\u2297');
        hashMap.put("&perp", '\u22a5');
        hashMap.put("&sdot", '\u22c5');
        hashMap.put("&lceil", '\u2308');
        hashMap.put("&rceil", '\u2309');
        hashMap.put("&lfloor", '\u230a');
        hashMap.put("&rfloor", '\u230b');
        hashMap.put("&lang", '\u2329');
        hashMap.put("&rang", '\u232a');
        hashMap.put("&loz", '\u25ca');
        hashMap.put("&spades", '\u2660');
        hashMap.put("&clubs", '\u2663');
        hashMap.put("&hearts", '\u2665');
        hashMap.put("&diams", '\u2666');
        hashMap.put("&quot", '\"');
        hashMap.put("&amp", '&');
        hashMap.put("&lt", '<');
        hashMap.put("&gt", '>');
        hashMap.put("&apos", '\'');
        hashMap.put("&OElig", '\u0152');
        hashMap.put("&oelig", '\u0153');
        hashMap.put("&Scaron", '\u0160');
        hashMap.put("&scaron", '\u0161');
        hashMap.put("&Yuml", '\u0178');
        hashMap.put("&circ", '\u02c6');
        hashMap.put("&tilde", '\u02dc');
        hashMap.put("&ensp", '\u2002');
        hashMap.put("&emsp", '\u2003');
        hashMap.put("&thinsp", '\u2009');
        hashMap.put("&zwnj", '\u200c');
        hashMap.put("&zwj", '\u200d');
        hashMap.put("&lrm", '\u200e');
        hashMap.put("&rlm", '\u200f');
        hashMap.put("&ndash", '\u2013');
        hashMap.put("&mdash", '\u2014');
        hashMap.put("&lsquo", '\u2018');
        hashMap.put("&rsquo", '\u2019');
        hashMap.put("&sbquo", '\u201a');
        hashMap.put("&ldquo", '\u201c');
        hashMap.put("&rdquo", '\u201d');
        hashMap.put("&bdquo", '\u201e');
        hashMap.put("&dagger", '\u2020');
        hashMap.put("&Dagger", '\u2021');
        hashMap.put("&permil", '\u2030');
        hashMap.put("&lsaquo", '\u2039');
        hashMap.put("&rsaquo", '\u203a');
        hashMap.put("&euro", '\u20ac');
        Collections.unmodifiableMap((Map<?, ?>)hashMap);
        aexa.d('A', 'F').f(aexa.d('a', 'f'));
        final arcq arcq = new arcq((byte[])null);
        arcq.b('<', "&lt;");
        arcq.b('>', "&gt;");
        final int a2 = aeyp.a;
        arcq.c();
        Pattern.compile("</?[a-zA-Z][^>]*>");
        Pattern.compile("&#?[a-zA-Z0-9]{1,8};");
        final HashSet set = new HashSet();
        set.add(Character.UnicodeBlock.HANGUL_JAMO);
        set.add(Character.UnicodeBlock.CJK_RADICALS_SUPPLEMENT);
        set.add(Character.UnicodeBlock.KANGXI_RADICALS);
        set.add(Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION);
        set.add(Character.UnicodeBlock.HIRAGANA);
        set.add(Character.UnicodeBlock.KATAKANA);
        set.add(Character.UnicodeBlock.BOPOMOFO);
        set.add(Character.UnicodeBlock.HANGUL_COMPATIBILITY_JAMO);
        set.add(Character.UnicodeBlock.KANBUN);
        set.add(Character.UnicodeBlock.BOPOMOFO_EXTENDED);
        set.add(Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS);
        set.add(Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS);
        set.add(Character.UnicodeBlock.CJK_COMPATIBILITY);
        set.add(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A);
        set.add(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS);
        set.add(Character.UnicodeBlock.HANGUL_SYLLABLES);
        set.add(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS);
        set.add(Character.UnicodeBlock.CJK_COMPATIBILITY_FORMS);
        set.add(Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS);
        set.add(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B);
        set.add(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT);
        Collections.unmodifiableSet((Set<?>)set);
        "0123456789abcdef".toCharArray();
        final HashSet set2 = new HashSet();
        agnj.H(173, (Set)set2);
        agnj.I(1536, 1539, (Set)set2);
        agnj.H(1757, (Set)set2);
        agnj.H(1807, (Set)set2);
        agnj.I(6068, 6069, (Set)set2);
        agnj.I(8203, 8207, (Set)set2);
        agnj.I(8234, 8238, (Set)set2);
        agnj.I(8288, 8292, (Set)set2);
        agnj.I(8298, 8303, (Set)set2);
        agnj.H(65279, (Set)set2);
        agnj.I(65529, 65531, (Set)set2);
        agnj.I(119155, 119162, (Set)set2);
        agnj.H(917505, (Set)set2);
        agnj.I(917536, 917631, (Set)set2);
        agnj.H(0, (Set)set2);
        agnj.H(10, (Set)set2);
        agnj.H(13, (Set)set2);
        agnj.I(8232, 8233, (Set)set2);
        agnj.H(133, (Set)set2);
        agnj.H(Character.codePointAt("'", 0), (Set)set2);
        agnj.H(Character.codePointAt("\"", 0), (Set)set2);
        agnj.H(Character.codePointAt("&", 0), (Set)set2);
        agnj.H(Character.codePointAt("<", 0), (Set)set2);
        agnj.H(Character.codePointAt(">", 0), (Set)set2);
        agnj.H(Character.codePointAt("=", 0), (Set)set2);
        agnj.H(Character.codePointAt("\\", 0), (Set)set2);
        final ahbd ahbd = a = agnj.O((Set)set2);
        final HashSet set3 = new HashSet();
        agnj.H(Character.codePointAt("\"", 0), (Set)set3);
        agnj.H(Character.codePointAt("\\", 0), (Set)set3);
        agnj.I(0, 31, (Set)set3);
        final ahbd ahbd2 = b = agnj.O((Set)set3);
        final HashSet set4 = new HashSet();
        agnj.P(ahbd2, (Set)set4);
        agnj.P(ahbd, (Set)set4);
        agnj.O((Set)set4);
    }
    
    public static boolean a(final String s) {
        return s == null || ((aexa)aewz.b).h((CharSequence)s);
    }
}