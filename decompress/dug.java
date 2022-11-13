// 
// Decompiled by Procyon v0.6.0
// 

public final class dug
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
        //     8: putstatic       dug.a:[I
        //    11: aload_0        
        //    12: getstatic       android/widget/ImageView$ScaleType.FIT_XY:Landroid/widget/ImageView$ScaleType;
        //    15: invokevirtual   android/widget/ImageView$ScaleType.ordinal:()I
        //    18: iconst_1       
        //    19: iastore        
        //    20: getstatic       dug.a:[I
        //    23: getstatic       android/widget/ImageView$ScaleType.FIT_START:Landroid/widget/ImageView$ScaleType;
        //    26: invokevirtual   android/widget/ImageView$ScaleType.ordinal:()I
        //    29: iconst_2       
        //    30: iastore        
        //    31: getstatic       dug.a:[I
        //    34: getstatic       android/widget/ImageView$ScaleType.FIT_CENTER:Landroid/widget/ImageView$ScaleType;
        //    37: invokevirtual   android/widget/ImageView$ScaleType.ordinal:()I
        //    40: iconst_3       
        //    41: iastore        
        //    42: getstatic       dug.a:[I
        //    45: getstatic       android/widget/ImageView$ScaleType.FIT_END:Landroid/widget/ImageView$ScaleType;
        //    48: invokevirtual   android/widget/ImageView$ScaleType.ordinal:()I
        //    51: iconst_4       
        //    52: iastore        
        //    53: return         
        //    54: astore_0       
        //    55: goto            20
        //    58: astore_0       
        //    59: goto            31
        //    62: astore_0       
        //    63: goto            42
        //    66: astore_0       
        //    67: goto            53
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  11     20     54     58     Ljava/lang/NoSuchFieldError;
        //  20     31     58     62     Ljava/lang/NoSuchFieldError;
        //  31     42     62     66     Ljava/lang/NoSuchFieldError;
        //  42     53     66     70     Ljava/lang/NoSuchFieldError;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 35, Size: 35
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
