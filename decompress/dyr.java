import java.io.File;
import java.io.FileFilter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dyr
{
    private static int a = -2;
    private static final FileFilter b;
    
    static {
        b = new dyq(0);
    }
    
    public static int a() {
        int a;
        int n = a = dyr.a;
        if (n != -2) {
            return a;
        }
        n = -1;
        while (true) {
            try {
                if ((a = b("/sys/devices/system/cpu/possible")) == -1) {
                    a = b("/sys/devices/system/cpu/present");
                }
                if (a == -1) {
                    a = new File("/sys/devices/system/cpu/").listFiles(dyr.b).length;
                }
                dyr.a = a;
                return a;
            }
            catch (final SecurityException | NullPointerException ex) {
                a = n;
                continue;
            }
            break;
        }
    }
    
    private static int b(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          5
        //     3: aconst_null    
        //     4: astore          4
        //     6: iconst_m1      
        //     7: istore_2       
        //     8: new             Ljava/io/FileInputStream;
        //    11: astore_3       
        //    12: aload_3        
        //    13: aload_0        
        //    14: invokespecial   java/io/FileInputStream.<init>:(Ljava/lang/String;)V
        //    17: new             Ljava/io/BufferedReader;
        //    20: astore_0       
        //    21: new             Ljava/io/InputStreamReader;
        //    24: astore          4
        //    26: aload           4
        //    28: aload_3        
        //    29: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //    32: aload_0        
        //    33: aload           4
        //    35: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    38: aload_0        
        //    39: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //    42: astore          4
        //    44: aload_0        
        //    45: invokevirtual   java/io/BufferedReader.close:()V
        //    48: iload_2        
        //    49: istore_1       
        //    50: aload           4
        //    52: ifnull          86
        //    55: aload           4
        //    57: ldc             "0-[\\d]+$"
        //    59: invokevirtual   java/lang/String.matches:(Ljava/lang/String;)Z
        //    62: ifne            70
        //    65: iload_2        
        //    66: istore_1       
        //    67: goto            86
        //    70: aload           4
        //    72: iconst_2       
        //    73: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //    76: invokestatic    java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
        //    79: invokevirtual   java/lang/Integer.intValue:()I
        //    82: istore_1       
        //    83: iinc            1, 1
        //    86: aload_3        
        //    87: invokevirtual   java/io/InputStream.close:()V
        //    90: iload_1        
        //    91: ireturn        
        //    92: astore_0       
        //    93: goto            104
        //    96: astore_0       
        //    97: goto            118
        //   100: astore_0       
        //   101: aload           4
        //   103: astore_3       
        //   104: aload_3        
        //   105: ifnull          112
        //   108: aload_3        
        //   109: invokevirtual   java/io/InputStream.close:()V
        //   112: aload_0        
        //   113: athrow         
        //   114: astore_0       
        //   115: aload           5
        //   117: astore_3       
        //   118: aload_3        
        //   119: ifnull          126
        //   122: aload_3        
        //   123: invokevirtual   java/io/InputStream.close:()V
        //   126: iconst_m1      
        //   127: ireturn        
        //   128: astore_0       
        //   129: goto            90
        //   132: astore_3       
        //   133: goto            112
        //   136: astore_0       
        //   137: goto            126
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  8      17     114    118    Ljava/io/IOException;
        //  8      17     100    104    Any
        //  17     48     96     100    Ljava/io/IOException;
        //  17     48     92     96     Any
        //  55     65     96     100    Ljava/io/IOException;
        //  55     65     92     96     Any
        //  70     83     96     100    Ljava/io/IOException;
        //  70     83     92     96     Any
        //  86     90     128    132    Ljava/io/IOException;
        //  108    112    132    136    Ljava/io/IOException;
        //  122    126    136    140    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 76, Size: 76
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
}
