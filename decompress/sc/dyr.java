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
        //    93: goto            106
        //    96: astore_0       
        //    97: aload_3        
        //    98: astore_0       
        //    99: goto            120
        //   102: astore_0       
        //   103: aload           4
        //   105: astore_3       
        //   106: aload_3        
        //   107: ifnull          114
        //   110: aload_3        
        //   111: invokevirtual   java/io/InputStream.close:()V
        //   114: aload_0        
        //   115: athrow         
        //   116: astore_0       
        //   117: aload           5
        //   119: astore_0       
        //   120: aload_0        
        //   121: ifnull          128
        //   124: aload_0        
        //   125: invokevirtual   java/io/InputStream.close:()V
        //   128: iconst_m1      
        //   129: ireturn        
        //   130: astore_0       
        //   131: goto            90
        //   134: astore_3       
        //   135: goto            114
        //   138: astore_0       
        //   139: goto            128
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  8      17     116    120    Ljava/io/IOException;
        //  8      17     102    106    Any
        //  17     48     96     102    Ljava/io/IOException;
        //  17     48     92     96     Any
        //  55     65     96     102    Ljava/io/IOException;
        //  55     65     92     96     Any
        //  70     83     96     102    Ljava/io/IOException;
        //  70     83     92     96     Any
        //  86     90     130    134    Ljava/io/IOException;
        //  110    114    134    138    Ljava/io/IOException;
        //  124    128    138    142    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 78, Size: 78
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
