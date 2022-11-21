// 
// Decompiled by Procyon v0.6.0
// 

public final class afty
{
    public static final int[] a;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: arraylength    
        //     4: newarray        I
        //     6: astore_0       
        //     7: aload_0        
        //     8: putstatic       afty.a:[I
        //    11: aload_0        
        //    12: getstatic       java/math/RoundingMode.UNNECESSARY:Ljava/math/RoundingMode;
        //    15: invokevirtual   java/math/RoundingMode.ordinal:()I
        //    18: iconst_1       
        //    19: iastore        
        //    20: getstatic       afty.a:[I
        //    23: getstatic       java/math/RoundingMode.DOWN:Ljava/math/RoundingMode;
        //    26: invokevirtual   java/math/RoundingMode.ordinal:()I
        //    29: iconst_2       
        //    30: iastore        
        //    31: getstatic       afty.a:[I
        //    34: getstatic       java/math/RoundingMode.FLOOR:Ljava/math/RoundingMode;
        //    37: invokevirtual   java/math/RoundingMode.ordinal:()I
        //    40: iconst_3       
        //    41: iastore        
        //    42: getstatic       afty.a:[I
        //    45: getstatic       java/math/RoundingMode.UP:Ljava/math/RoundingMode;
        //    48: invokevirtual   java/math/RoundingMode.ordinal:()I
        //    51: iconst_4       
        //    52: iastore        
        //    53: getstatic       afty.a:[I
        //    56: getstatic       java/math/RoundingMode.CEILING:Ljava/math/RoundingMode;
        //    59: invokevirtual   java/math/RoundingMode.ordinal:()I
        //    62: iconst_5       
        //    63: iastore        
        //    64: getstatic       afty.a:[I
        //    67: getstatic       java/math/RoundingMode.HALF_DOWN:Ljava/math/RoundingMode;
        //    70: invokevirtual   java/math/RoundingMode.ordinal:()I
        //    73: bipush          6
        //    75: iastore        
        //    76: getstatic       afty.a:[I
        //    79: getstatic       java/math/RoundingMode.HALF_UP:Ljava/math/RoundingMode;
        //    82: invokevirtual   java/math/RoundingMode.ordinal:()I
        //    85: bipush          7
        //    87: iastore        
        //    88: getstatic       afty.a:[I
        //    91: getstatic       java/math/RoundingMode.HALF_EVEN:Ljava/math/RoundingMode;
        //    94: invokevirtual   java/math/RoundingMode.ordinal:()I
        //    97: bipush          8
        //    99: iastore        
        //   100: return         
        //   101: astore_0       
        //   102: goto            20
        //   105: astore_0       
        //   106: goto            31
        //   109: astore_0       
        //   110: goto            42
        //   113: astore_0       
        //   114: goto            53
        //   117: astore_0       
        //   118: goto            64
        //   121: astore_0       
        //   122: goto            76
        //   125: astore_0       
        //   126: goto            88
        //   129: astore_0       
        //   130: goto            100
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  11     20     101    105    Ljava/lang/NoSuchFieldError;
        //  20     31     105    109    Ljava/lang/NoSuchFieldError;
        //  31     42     109    113    Ljava/lang/NoSuchFieldError;
        //  42     53     113    117    Ljava/lang/NoSuchFieldError;
        //  53     64     117    121    Ljava/lang/NoSuchFieldError;
        //  64     76     121    125    Ljava/lang/NoSuchFieldError;
        //  76     88     125    129    Ljava/lang/NoSuchFieldError;
        //  88     100    129    133    Ljava/lang/NoSuchFieldError;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 63, Size: 63
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
