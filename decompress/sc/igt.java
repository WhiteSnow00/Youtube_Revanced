import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class igt implements aezf
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    private final int e;
    
    public igt(final igu a, final Optional b, final Optional c, final aoxc d, final int e) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public igt(final jzk a, final amkk c, final aezp d, final affr b, final int e) {
        this.e = e;
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    public igt(final uaj b, final uai d, final tww a, final ahaz c, final int e) {
        this.e = e;
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = c;
    }
    
    public final Object apply(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        igt.e:I
        //     4: istore_2       
        //     5: iload_2        
        //     6: ifeq            466
        //     9: iload_2        
        //    10: iconst_1       
        //    11: if_icmpeq       387
        //    14: iload_2        
        //    15: iconst_2       
        //    16: if_icmpeq       314
        //    19: aload_0        
        //    20: getfield        igt.b:Ljava/lang/Object;
        //    23: astore          8
        //    25: aload_0        
        //    26: getfield        igt.d:Ljava/lang/Object;
        //    29: astore          4
        //    31: aload_0        
        //    32: getfield        igt.a:Ljava/lang/Object;
        //    35: astore          7
        //    37: aload_0        
        //    38: getfield        igt.c:Ljava/lang/Object;
        //    41: astore          5
        //    43: aload_1        
        //    44: checkcast       Ljava/lang/Void;
        //    47: astore_1       
        //    48: aload           8
        //    50: checkcast       Luaj;
        //    53: astore          6
        //    55: aload           6
        //    57: getfield        uaj.h:Ltxy;
        //    60: astore          9
        //    62: aconst_null    
        //    63: astore_1       
        //    64: aload           9
        //    66: ifnull          87
        //    69: aload           6
        //    71: getfield        uaj.b:Ltxz;
        //    74: aload           9
        //    76: invokeinterface txz.Y:(Ltxy;)V
        //    81: aload           6
        //    83: aconst_null    
        //    84: putfield        uaj.h:Ltxy;
        //    87: aload           8
        //    89: checkcast       Luaj;
        //    92: aload           4
        //    94: putfield        uaj.f:Luai;
        //    97: aload           8
        //    99: checkcast       Luaj;
        //   102: getfield        uaj.c:Luak;
        //   105: astore          9
        //   107: aload           9
        //   109: getfield        uak.b:Ljava/lang/Object;
        //   112: checkcast       Lubu;
        //   115: invokevirtual   ubu.b:()Lucd;
        //   118: astore          4
        //   120: aload           4
        //   122: ifnonnull       128
        //   125: goto            200
        //   128: aload           9
        //   130: getfield        uak.a:Ljava/lang/Object;
        //   133: astore          10
        //   135: getstatic       afsr.a:Lafsr;
        //   138: astore          9
        //   140: invokestatic    j$/time/Instant.now:()Lj$/time/Instant;
        //   143: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   146: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   149: ldc             ".mp4"
        //   151: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   154: astore          9
        //   156: aload           10
        //   158: checkcast       Landroid/content/Context;
        //   161: aload           4
        //   163: invokestatic    vdh.aC:(Landroid/content/Context;Lucd;)Ljava/io/File;
        //   166: astore          4
        //   168: aload           4
        //   170: ifnonnull       176
        //   173: goto            200
        //   176: aload           4
        //   178: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   181: astore          10
        //   183: new             Ljava/io/File;
        //   186: astore          4
        //   188: aload           4
        //   190: aload           10
        //   192: aload           9
        //   194: invokespecial   java/io/File.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   197: aload           4
        //   199: astore_1       
        //   200: aload_1        
        //   201: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   204: pop            
        //   205: aload_1        
        //   206: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   209: astore_1       
        //   210: aload           8
        //   212: checkcast       Luaj;
        //   215: getfield        uaj.i:Laeea;
        //   218: astore          4
        //   220: aload           7
        //   222: checkcast       Ltww;
        //   225: aload_1        
        //   226: aload           4
        //   228: invokevirtual   tww.d:(Ljava/lang/String;Laeea;)V
        //   231: aload           5
        //   233: checkcast       Lahaz;
        //   236: invokevirtual   ahaz.copyOnWrite:()V
        //   239: aload           5
        //   241: checkcast       Lahaz;
        //   244: getfield        ahaz.instance:Lahbh;
        //   247: checkcast       Larbo;
        //   250: astore          4
        //   252: getstatic       arbo.a:Larbo;
        //   255: astore          7
        //   257: aload_1        
        //   258: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   261: pop            
        //   262: aload           4
        //   264: iconst_1       
        //   265: aload           4
        //   267: getfield        arbo.b:I
        //   270: ior            
        //   271: putfield        arbo.b:I
        //   274: aload           4
        //   276: aload_1        
        //   277: putfield        arbo.c:Ljava/lang/String;
        //   280: goto            302
        //   283: astore_1       
        //   284: goto            288
        //   287: astore_1       
        //   288: aload           6
        //   290: invokevirtual   uaj.I:()V
        //   293: aload           6
        //   295: getfield        uaj.i:Laeea;
        //   298: aload_1        
        //   299: invokevirtual   aeea.cz:(Ljava/lang/Exception;)V
        //   302: aload           5
        //   304: checkcast       Lahaz;
        //   307: invokevirtual   ahaz.build:()Lahbh;
        //   310: checkcast       Larbo;
        //   313: areturn        
        //   314: aload_0        
        //   315: getfield        igt.a:Ljava/lang/Object;
        //   318: astore          4
        //   320: aload_0        
        //   321: getfield        igt.c:Ljava/lang/Object;
        //   324: astore          6
        //   326: aload_0        
        //   327: getfield        igt.d:Ljava/lang/Object;
        //   330: astore          7
        //   332: aload_0        
        //   333: getfield        igt.b:Ljava/lang/Object;
        //   336: astore          5
        //   338: aload_1        
        //   339: checkcast       Ltqt;
        //   342: astore_1       
        //   343: aload           7
        //   345: checkcast       Laezp;
        //   348: astore          7
        //   350: aload           6
        //   352: checkcast       Lamkk;
        //   355: astore          6
        //   357: aload_1        
        //   358: aload           4
        //   360: checkcast       Ljzk;
        //   363: aload           6
        //   365: aload           7
        //   367: invokevirtual   jzk.i:(Lamkk;Laezp;)Landroid/view/View;
        //   370: putfield        tqt.d:Ljava/lang/Object;
        //   373: aload_1        
        //   374: aload           5
        //   376: checkcast       Laffr;
        //   379: invokevirtual   affr.g:()Lafft;
        //   382: invokevirtual   tqt.f:(Lafft;)V
        //   385: aload_1        
        //   386: areturn        
        //   387: aload_0        
        //   388: getfield        igt.a:Ljava/lang/Object;
        //   391: astore          4
        //   393: aload_0        
        //   394: getfield        igt.b:Ljava/lang/Object;
        //   397: astore          7
        //   399: aload_0        
        //   400: getfield        igt.c:Ljava/lang/Object;
        //   403: astore          6
        //   405: aload_0        
        //   406: getfield        igt.d:Ljava/lang/Object;
        //   409: astore          5
        //   411: aload_1        
        //   412: checkcast       Ljava/lang/Boolean;
        //   415: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   418: istore_3       
        //   419: aload           7
        //   421: checkcast       Lj$/util/Optional;
        //   424: invokevirtual   j$/util/Optional.get:()Ljava/lang/Object;
        //   427: checkcast       Lancy;
        //   430: astore_1       
        //   431: aload           6
        //   433: checkcast       Lj$/util/Optional;
        //   436: invokevirtual   j$/util/Optional.get:()Ljava/lang/Object;
        //   439: checkcast       Lamwb;
        //   442: astore          6
        //   444: aload           5
        //   446: checkcast       Laoxc;
        //   449: astore          5
        //   451: aload           4
        //   453: checkcast       Ligu;
        //   456: iload_3        
        //   457: aload_1        
        //   458: aload           6
        //   460: aload           5
        //   462: invokevirtual   igu.a:(ZLancy;Lamwb;Laoxc;)Lijk;
        //   465: areturn        
        //   466: aload_0        
        //   467: getfield        igt.a:Ljava/lang/Object;
        //   470: astore          4
        //   472: aload_0        
        //   473: getfield        igt.b:Ljava/lang/Object;
        //   476: astore          7
        //   478: aload_0        
        //   479: getfield        igt.c:Ljava/lang/Object;
        //   482: astore          6
        //   484: aload_0        
        //   485: getfield        igt.d:Ljava/lang/Object;
        //   488: astore          5
        //   490: aload_1        
        //   491: checkcast       Ljava/lang/Boolean;
        //   494: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   497: istore_3       
        //   498: aload           7
        //   500: checkcast       Lj$/util/Optional;
        //   503: invokevirtual   j$/util/Optional.get:()Ljava/lang/Object;
        //   506: checkcast       Lancy;
        //   509: astore_1       
        //   510: aload           6
        //   512: checkcast       Lj$/util/Optional;
        //   515: invokevirtual   j$/util/Optional.get:()Ljava/lang/Object;
        //   518: checkcast       Lamwb;
        //   521: astore          6
        //   523: aload           5
        //   525: checkcast       Laoxc;
        //   528: astore          5
        //   530: aload           4
        //   532: checkcast       Ligu;
        //   535: iload_3        
        //   536: aload_1        
        //   537: aload           6
        //   539: aload           5
        //   541: invokevirtual   igu.a:(ZLancy;Lamwb;Laoxc;)Lijk;
        //   544: areturn        
        //   545: astore          4
        //   547: goto            200
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  87     120    287    288    Ljava/io/IOException;
        //  87     120    283    287    Ljava/lang/NullPointerException;
        //  128    168    287    288    Ljava/io/IOException;
        //  128    168    283    287    Ljava/lang/NullPointerException;
        //  176    183    287    288    Ljava/io/IOException;
        //  176    183    283    287    Ljava/lang/NullPointerException;
        //  183    197    545    550    Ljava/lang/RuntimeException;
        //  183    197    287    288    Ljava/io/IOException;
        //  183    197    283    287    Ljava/lang/NullPointerException;
        //  200    280    287    288    Ljava/io/IOException;
        //  200    280    283    287    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0200:
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
