import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jch implements aezf
{
    public final Bitmap a;
    public final abil b;
    public final int c;
    public final int d;
    
    public jch(final Bitmap a, final abil b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final Object apply(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        jch.a:Landroid/graphics/Bitmap;
        //     4: astore          4
        //     6: aload_0        
        //     7: getfield        jch.b:Labil;
        //    10: astore          7
        //    12: aload_0        
        //    13: getfield        jch.c:I
        //    16: istore_2       
        //    17: aload_0        
        //    18: getfield        jch.d:I
        //    21: istore_3       
        //    22: aload_1        
        //    23: checkcast       [B
        //    26: astore_1       
        //    27: aload_1        
        //    28: iconst_0       
        //    29: aload_1        
        //    30: arraylength    
        //    31: iconst_1       
        //    32: invokestatic    android/graphics/BitmapRegionDecoder.newInstance:([BIIZ)Landroid/graphics/BitmapRegionDecoder;
        //    35: astore          6
        //    37: new             Landroid/graphics/BitmapFactory$Options;
        //    40: astore          5
        //    42: aload           5
        //    44: invokespecial   android/graphics/BitmapFactory$Options.<init>:()V
        //    47: aload           5
        //    49: iconst_1       
        //    50: putfield        android/graphics/BitmapFactory$Options.inMutable:Z
        //    53: aload           4
        //    55: ifnull          65
        //    58: aload           5
        //    60: aload           4
        //    62: putfield        android/graphics/BitmapFactory$Options.inBitmap:Landroid/graphics/Bitmap;
        //    65: aconst_null    
        //    66: astore          4
        //    68: aload           7
        //    70: iload_3        
        //    71: invokevirtual   abil.f:(I)Landroid/graphics/Rect;
        //    74: astore          7
        //    76: iload_2        
        //    77: iconst_1       
        //    78: if_icmpne       109
        //    81: aload           7
        //    83: aload           7
        //    85: getfield        android/graphics/Rect.left:I
        //    88: aload           7
        //    90: getfield        android/graphics/Rect.top:I
        //    93: aload           7
        //    95: invokevirtual   android/graphics/Rect.centerX:()I
        //    98: aload           7
        //   100: getfield        android/graphics/Rect.bottom:I
        //   103: invokevirtual   android/graphics/Rect.set:(IIII)V
        //   106: goto            139
        //   109: iload_2        
        //   110: iconst_3       
        //   111: if_icmpne       139
        //   114: aload           7
        //   116: aload           7
        //   118: getfield        android/graphics/Rect.left:I
        //   121: aload           7
        //   123: getfield        android/graphics/Rect.top:I
        //   126: aload           7
        //   128: getfield        android/graphics/Rect.right:I
        //   131: aload           7
        //   133: invokevirtual   android/graphics/Rect.centerY:()I
        //   136: invokevirtual   android/graphics/Rect.set:(IIII)V
        //   139: aload           4
        //   141: astore_1       
        //   142: aload           6
        //   144: invokevirtual   android/graphics/BitmapRegionDecoder.getWidth:()I
        //   147: aload           7
        //   149: getfield        android/graphics/Rect.right:I
        //   152: if_icmplt       192
        //   155: aload           4
        //   157: astore_1       
        //   158: aload           6
        //   160: invokevirtual   android/graphics/BitmapRegionDecoder.getHeight:()I
        //   163: aload           7
        //   165: getfield        android/graphics/Rect.bottom:I
        //   168: if_icmplt       192
        //   171: aload           4
        //   173: astore_1       
        //   174: aload           7
        //   176: invokevirtual   android/graphics/Rect.height:()I
        //   179: ifle            192
        //   182: aload           6
        //   184: aload           7
        //   186: aload           5
        //   188: invokevirtual   android/graphics/BitmapRegionDecoder.decodeRegion:(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   191: astore_1       
        //   192: aload_1        
        //   193: invokestatic    j$/util/Optional.ofNullable:(Ljava/lang/Object;)Lj$/util/Optional;
        //   196: astore_1       
        //   197: goto            211
        //   200: astore_1       
        //   201: ldc             "Ad hoc client creating decoder failed: "
        //   203: aload_1        
        //   204: invokestatic    ttr.d:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   207: invokestatic    j$/util/Optional.empty:()Lj$/util/Optional;
        //   210: astore_1       
        //   211: aload_1        
        //   212: areturn        
        //   213: astore_1       
        //   214: aload           4
        //   216: astore_1       
        //   217: goto            192
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  27     53     200    211    Ljava/io/IOException;
        //  58     65     200    211    Ljava/io/IOException;
        //  68     76     213    220    Ljava/lang/RuntimeException;
        //  68     76     200    211    Ljava/io/IOException;
        //  81     106    213    220    Ljava/lang/RuntimeException;
        //  81     106    200    211    Ljava/io/IOException;
        //  114    139    213    220    Ljava/lang/RuntimeException;
        //  114    139    200    211    Ljava/io/IOException;
        //  142    155    213    220    Ljava/lang/RuntimeException;
        //  142    155    200    211    Ljava/io/IOException;
        //  158    171    213    220    Ljava/lang/RuntimeException;
        //  158    171    200    211    Ljava/io/IOException;
        //  174    192    213    220    Ljava/lang/RuntimeException;
        //  174    192    200    211    Ljava/io/IOException;
        //  192    197    200    211    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0109:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
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
