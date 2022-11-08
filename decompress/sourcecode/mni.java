import org.json.JSONArray;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import android.text.TextUtils;
import java.util.Calendar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mni
{
    private static final mnb a;
    private static final String[] b;
    private static final String c;
    
    static {
        a = new mnb("MetadataUtils");
        b = new String[] { "Z", "+hh", "+hhmm", "+hh:mm" };
        c = "yyyyMMdd'T'HHmmss".concat(String.valueOf("Z"));
    }
    
    public static Calendar a(String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return null;
        }
        String s2 = c(s);
        if (TextUtils.isEmpty((CharSequence)s2)) {
            return null;
        }
        s = d(s);
        if (!TextUtils.isEmpty((CharSequence)s)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(s2);
            sb.append("T");
            sb.append(s);
            s2 = sb.toString();
            if (s.length() == 6) {
                s = "yyyyMMdd'T'HHmmss";
            }
            else {
                s = mni.c;
            }
        }
        else {
            s = "yyyyMMdd";
        }
        final Calendar instance = Calendar.getInstance();
        try {
            instance.setTime(new SimpleDateFormat(s).parse(s2));
            return instance;
        }
        catch (final ParseException ex) {
            mni.a.c(ex, "Error parsing string", new Object[0]);
            return null;
        }
    }
    
    public static void b(final List p0, final JSONArray p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokeinterface java/util/List.clear:()V
        //     6: iconst_0       
        //     7: istore_2       
        //     8: iload_2        
        //     9: aload_1        
        //    10: invokevirtual   org/json/JSONArray.length:()I
        //    13: if_icmpge       96
        //    16: aload_1        
        //    17: iload_2        
        //    18: invokevirtual   org/json/JSONArray.getJSONObject:(I)Lorg/json/JSONObject;
        //    21: astore_3       
        //    22: new             Lcom/google/android/gms/common/images/WebImage;
        //    25: astore          4
        //    27: getstatic       android/net/Uri.EMPTY:Landroid/net/Uri;
        //    30: astore          5
        //    32: aload_3        
        //    33: ldc             "url"
        //    35: invokevirtual   org/json/JSONObject.has:(Ljava/lang/String;)Z
        //    38: istore          6
        //    40: aload           5
        //    42: astore          7
        //    44: iload           6
        //    46: ifeq            60
        //    49: aload_3        
        //    50: ldc             "url"
        //    52: invokevirtual   org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
        //    55: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //    58: astore          7
        //    60: aload           4
        //    62: aload           7
        //    64: aload_3        
        //    65: ldc             "width"
        //    67: iconst_0       
        //    68: invokevirtual   org/json/JSONObject.optInt:(Ljava/lang/String;I)I
        //    71: aload_3        
        //    72: ldc             "height"
        //    74: iconst_0       
        //    75: invokevirtual   org/json/JSONObject.optInt:(Ljava/lang/String;I)I
        //    78: invokespecial   com/google/android/gms/common/images/WebImage.<init>:(Landroid/net/Uri;II)V
        //    81: aload_0        
        //    82: aload           4
        //    84: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    89: pop            
        //    90: iinc            2, 1
        //    93: goto            8
        //    96: return         
        //    97: astore_0       
        //    98: goto            96
        //   101: astore          7
        //   103: goto            90
        //   106: astore          7
        //   108: aload           5
        //   110: astore          7
        //   112: goto            60
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      6      97     101    Lorg/json/JSONException;
        //  8      22     97     101    Lorg/json/JSONException;
        //  22     40     101    106    Ljava/lang/IllegalArgumentException;
        //  22     40     97     101    Lorg/json/JSONException;
        //  49     60     106    115    Lorg/json/JSONException;
        //  49     60     101    106    Ljava/lang/IllegalArgumentException;
        //  60     90     101    106    Ljava/lang/IllegalArgumentException;
        //  60     90     97     101    Lorg/json/JSONException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 55, Size: 55
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static String c(String substring) {
        if (TextUtils.isEmpty((CharSequence)substring)) {
            return null;
        }
        try {
            substring = substring.substring(0, 8);
            return substring;
        }
        catch (final IndexOutOfBoundsException ex) {
            mni.a.c(ex, "Error extracting the date", new Object[0]);
            return null;
        }
    }
    
    private static String d(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return null;
        }
        final int index = s.indexOf(84);
        if (index != 8) {
            return null;
        }
        try {
            final String substring = s.substring(index + 1);
            if (substring.length() == 6) {
                return substring;
            }
            final char char1 = substring.charAt(6);
            if (char1 != '+' && char1 != '-') {
                if (char1 == 'Z') {
                    if (substring.length() == mni.b[0].length() + 6) {
                        return String.valueOf(substring.substring(0, substring.length() - 1)).concat("+0000");
                    }
                    return null;
                }
            }
            else {
                final int length = substring.length();
                final String[] b = mni.b;
                if (length == b[1].length() + 6 || length == b[2].length() + 6 || length == b[3].length() + 6) {
                    return substring.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
                }
            }
            return null;
        }
        catch (final IndexOutOfBoundsException ex) {
            mni.a.c(ex, "Error extracting the time substring: %s", new Object[0]);
            return null;
        }
    }
}
