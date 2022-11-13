// 
// Decompiled by Procyon v0.6.0
// 

final class dci
{
    static final int[] a;
    static final int[] b;
    
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
        //     8: putstatic       dci.b:[I
        //    11: aload_0        
        //    12: getstatic       dca.d:Ldca;
        //    15: invokevirtual   dca.ordinal:()I
        //    18: iconst_1       
        //    19: iastore        
        //    20: getstatic       dci.b:[I
        //    23: getstatic       dca.c:Ldca;
        //    26: invokevirtual   dca.ordinal:()I
        //    29: iconst_2       
        //    30: iastore        
        //    31: getstatic       dci.b:[I
        //    34: getstatic       dca.b:Ldca;
        //    37: invokevirtual   dca.ordinal:()I
        //    40: iconst_3       
        //    41: iastore        
        //    42: getstatic       dci.b:[I
        //    45: getstatic       dca.a:Ldca;
        //    48: invokevirtual   dca.ordinal:()I
        //    51: iconst_4       
        //    52: iastore        
        //    53: invokestatic    android/widget/ImageView$ScaleType.values:()[Landroid/widget/ImageView$ScaleType;
        //    56: arraylength    
        //    57: newarray        I
        //    59: astore_0       
        //    60: aload_0        
        //    61: putstatic       dci.a:[I
        //    64: aload_0        
        //    65: getstatic       android/widget/ImageView$ScaleType.CENTER_CROP:Landroid/widget/ImageView$ScaleType;
        //    68: invokevirtual   android/widget/ImageView$ScaleType.ordinal:()I
        //    71: iconst_1       
        //    72: iastore        
        //    73: getstatic       dci.a:[I
        //    76: getstatic       android/widget/ImageView$ScaleType.CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;
        //    79: invokevirtual   android/widget/ImageView$ScaleType.ordinal:()I
        //    82: iconst_2       
        //    83: iastore        
        //    84: getstatic       dci.a:[I
        //    87: getstatic       android/widget/ImageView$ScaleType.FIT_CENTER:Landroid/widget/ImageView$ScaleType;
        //    90: invokevirtual   android/widget/ImageView$ScaleType.ordinal:()I
        //    93: iconst_3       
        //    94: iastore        
        //    95: getstatic       dci.a:[I
        //    98: getstatic       android/widget/ImageView$ScaleType.FIT_START:Landroid/widget/ImageView$ScaleType;
        //   101: invokevirtual   android/widget/ImageView$ScaleType.ordinal:()I
        //   104: iconst_4       
        //   105: iastore        
        //   106: getstatic       dci.a:[I
        //   109: getstatic       android/widget/ImageView$ScaleType.FIT_END:Landroid/widget/ImageView$ScaleType;
        //   112: invokevirtual   android/widget/ImageView$ScaleType.ordinal:()I
        //   115: iconst_5       
        //   116: iastore        
        //   117: getstatic       dci.a:[I
        //   120: getstatic       android/widget/ImageView$ScaleType.FIT_XY:Landroid/widget/ImageView$ScaleType;
        //   123: invokevirtual   android/widget/ImageView$ScaleType.ordinal:()I
        //   126: bipush          6
        //   128: iastore        
        //   129: getstatic       dci.a:[I
        //   132: getstatic       android/widget/ImageView$ScaleType.CENTER:Landroid/widget/ImageView$ScaleType;
        //   135: invokevirtual   android/widget/ImageView$ScaleType.ordinal:()I
        //   138: bipush          7
        //   140: iastore        
        //   141: getstatic       dci.a:[I
        //   144: getstatic       android/widget/ImageView$ScaleType.MATRIX:Landroid/widget/ImageView$ScaleType;
        //   147: invokevirtual   android/widget/ImageView$ScaleType.ordinal:()I
        //   150: bipush          8
        //   152: iastore        
        //   153: return         
        //   154: astore_0       
        //   155: goto            20
        //   158: astore_0       
        //   159: goto            31
        //   162: astore_0       
        //   163: goto            42
        //   166: astore_0       
        //   167: goto            53
        //   170: astore_0       
        //   171: goto            73
        //   174: astore_0       
        //   175: goto            84
        //   178: astore_0       
        //   179: goto            95
        //   182: astore_0       
        //   183: goto            106
        //   186: astore_0       
        //   187: goto            117
        //   190: astore_0       
        //   191: goto            129
        //   194: astore_0       
        //   195: goto            141
        //   198: astore_0       
        //   199: goto            153
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  11     20     154    158    Ljava/lang/NoSuchFieldError;
        //  20     31     158    162    Ljava/lang/NoSuchFieldError;
        //  31     42     162    166    Ljava/lang/NoSuchFieldError;
        //  42     53     166    170    Ljava/lang/NoSuchFieldError;
        //  64     73     170    174    Ljava/lang/NoSuchFieldError;
        //  73     84     174    178    Ljava/lang/NoSuchFieldError;
        //  84     95     178    182    Ljava/lang/NoSuchFieldError;
        //  95     106    182    186    Ljava/lang/NoSuchFieldError;
        //  106    117    186    190    Ljava/lang/NoSuchFieldError;
        //  117    129    190    194    Ljava/lang/NoSuchFieldError;
        //  129    141    194    198    Ljava/lang/NoSuchFieldError;
        //  141    153    198    202    Ljava/lang/NoSuchFieldError;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 97, Size: 97
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
