import java.io.File;
import java.io.FileFilter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dyq
{
    private static int a = -2;
    private static final FileFilter b;
    
    static {
        b = new dyp(0);
    }
    
    public static int a() {
        int a;
        int n = a = dyq.a;
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
                    a = new File("/sys/devices/system/cpu/").listFiles(dyq.b).length;
                }
                dyq.a = a;
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
        //     1: astore_1       
        //     2: aconst_null    
        //     3: astore_2       
        //     4: iconst_m1      
        //     5: istore_3       
        //     6: new             Ljava/io/FileInputStream;
        //     9: astore          4
        //    11: aload           4
        //    13: aload_0        
        //    14: invokespecial   java/io/FileInputStream.<init>:(Ljava/lang/String;)V
        //    17: new             Ljava/io/BufferedReader;
        //    20: astore_0       
        //    21: new             Ljava/io/InputStreamReader;
        //    24: astore_2       
        //    25: aload_2        
        //    26: aload           4
        //    28: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //    31: aload_0        
        //    32: aload_2        
        //    33: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    36: aload_0        
        //    37: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //    40: astore_2       
        //    41: aload_0        
        //    42: invokevirtual   java/io/BufferedReader.close:()V
        //    45: iload_3        
        //    46: istore          5
        //    48: aload_2        
        //    49: ifnull          83
        //    52: aload_2        
        //    53: ldc             "0-[\\d]+$"
        //    55: invokevirtual   java/lang/String.matches:(Ljava/lang/String;)Z
        //    58: ifne            67
        //    61: iload_3        
        //    62: istore          5
        //    64: goto            83
        //    67: aload_2        
        //    68: iconst_2       
        //    69: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //    72: invokestatic    java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
        //    75: invokevirtual   java/lang/Integer.intValue:()I
        //    78: istore          5
        //    80: iinc            5, 1
        //    83: aload           4
        //    85: invokevirtual   java/io/InputStream.close:()V
        //    88: iload           5
        //    90: ireturn        
        //    91: astore_0       
        //    92: goto            106
        //    95: astore_0       
        //    96: aload           4
        //    98: astore_0       
        //    99: goto            121
        //   102: astore_0       
        //   103: aload_2        
        //   104: astore          4
        //   106: aload           4
        //   108: ifnull          116
        //   111: aload           4
        //   113: invokevirtual   java/io/InputStream.close:()V
        //   116: aload_0        
        //   117: athrow         
        //   118: astore_0       
        //   119: aload_1        
        //   120: astore_0       
        //   121: aload_0        
        //   122: ifnull          129
        //   125: aload_0        
        //   126: invokevirtual   java/io/InputStream.close:()V
        //   129: iconst_m1      
        //   130: ireturn        
        //   131: astore_0       
        //   132: goto            88
        //   135: astore          4
        //   137: goto            116
        //   140: astore_0       
        //   141: goto            129
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  6      17     118    121    Ljava/io/IOException;
        //  6      17     102    106    Any
        //  17     45     95     102    Ljava/io/IOException;
        //  17     45     91     95     Any
        //  52     61     95     102    Ljava/io/IOException;
        //  52     61     91     95     Any
        //  67     80     95     102    Ljava/io/IOException;
        //  67     80     91     95     Any
        //  83     88     131    135    Ljava/io/IOException;
        //  111    116    135    140    Ljava/io/IOException;
        //  125    129    140    144    Ljava/io/IOException;
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
