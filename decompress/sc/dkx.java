import java.util.Collections;
import java.util.Arrays;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dkx implements ddr
{
    public static final ddo a;
    public static final ddo b;
    private static final List c;
    private final dkv d;
    private final dgg e;
    
    static {
        a = ddo.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new dks(1, null));
        b = ddo.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new dks(0));
        c = Collections.unmodifiableList((List<?>)Arrays.asList("TP1A", "TD1A.220804.031"));
    }
    
    public dkx(final dgg e, final dkv d) {
        this.e = e;
        this.d = d;
    }
    
    @Override
    public final dfy a(final Object p0, final int p1, final int p2, final ddp p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: getstatic       dkx.a:Lddo;
        //     5: invokevirtual   ddp.b:(Lddo;)Ljava/lang/Object;
        //     8: checkcast       Ljava/lang/Long;
        //    11: invokevirtual   java/lang/Long.longValue:()J
        //    14: lstore          10
        //    16: lload           10
        //    18: lconst_0       
        //    19: lcmp           
        //    20: ifge            64
        //    23: lload           10
        //    25: ldc2_w          -1
        //    28: lcmp           
        //    29: ifne            35
        //    32: goto            64
        //    35: new             Ljava/lang/StringBuilder;
        //    38: dup            
        //    39: ldc             "Requested frame must be non-negative, or DEFAULT_FRAME, given: "
        //    41: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    44: astore_1       
        //    45: aload_1        
        //    46: lload           10
        //    48: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    51: pop            
        //    52: new             Ljava/lang/IllegalArgumentException;
        //    55: dup            
        //    56: aload_1        
        //    57: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    60: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    63: athrow         
        //    64: aload           4
        //    66: getstatic       dkx.b:Lddo;
        //    69: invokevirtual   ddp.b:(Lddo;)Ljava/lang/Object;
        //    72: checkcast       Ljava/lang/Integer;
        //    75: astore          14
        //    77: aload           14
        //    79: astore          13
        //    81: aload           14
        //    83: ifnonnull       92
        //    86: iconst_2       
        //    87: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    90: astore          13
        //    92: aload           4
        //    94: getstatic       djy.f:Lddo;
        //    97: invokevirtual   ddp.b:(Lddo;)Ljava/lang/Object;
        //   100: checkcast       Ldjy;
        //   103: astore          14
        //   105: aload           14
        //   107: astore          4
        //   109: aload           14
        //   111: ifnonnull       119
        //   114: getstatic       djy.e:Ldjy;
        //   117: astore          4
        //   119: new             Landroid/media/MediaMetadataRetriever;
        //   122: dup            
        //   123: invokespecial   android/media/MediaMetadataRetriever.<init>:()V
        //   126: astore          15
        //   128: aload_0        
        //   129: getfield        dkx.d:Ldkv;
        //   132: aload           15
        //   134: aload_1        
        //   135: invokeinterface dkv.b:(Landroid/media/MediaMetadataRetriever;Ljava/lang/Object;)V
        //   140: aload           13
        //   142: invokevirtual   java/lang/Integer.intValue:()I
        //   145: istore          9
        //   147: getstatic       android/os/Build.DEVICE:Ljava/lang/String;
        //   150: astore          13
        //   152: aconst_null    
        //   153: astore          14
        //   155: aload           13
        //   157: ifnull          306
        //   160: getstatic       android/os/Build.DEVICE:Ljava/lang/String;
        //   163: ldc             ".+_cheets|cheets_.+"
        //   165: invokevirtual   java/lang/String.matches:(Ljava/lang/String;)Z
        //   168: istore          12
        //   170: iload           12
        //   172: ifeq            306
        //   175: ldc             "video/webm"
        //   177: aload           15
        //   179: bipush          12
        //   181: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   184: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   187: ifne            193
        //   190: goto            306
        //   193: new             Landroid/media/MediaExtractor;
        //   196: astore          13
        //   198: aload           13
        //   200: invokespecial   android/media/MediaExtractor.<init>:()V
        //   203: aload_0        
        //   204: getfield        dkx.d:Ldkv;
        //   207: aload           13
        //   209: aload_1        
        //   210: invokeinterface dkv.a:(Landroid/media/MediaExtractor;Ljava/lang/Object;)V
        //   215: aload           13
        //   217: invokevirtual   android/media/MediaExtractor.getTrackCount:()I
        //   220: istore          7
        //   222: iconst_0       
        //   223: istore          6
        //   225: aload           13
        //   227: astore_1       
        //   228: iload           6
        //   230: iload           7
        //   232: if_icmpge       282
        //   235: ldc             "video/x-vnd.on2.vp8"
        //   237: aload           13
        //   239: iload           6
        //   241: invokevirtual   android/media/MediaExtractor.getTrackFormat:(I)Landroid/media/MediaFormat;
        //   244: ldc             "mime"
        //   246: invokevirtual   android/media/MediaFormat.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   249: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   252: istore          12
        //   254: iload           12
        //   256: ifne            265
        //   259: iinc            6, 1
        //   262: goto            225
        //   265: aload           13
        //   267: invokevirtual   android/media/MediaExtractor.release:()V
        //   270: new             Ljava/lang/IllegalStateException;
        //   273: astore_1       
        //   274: aload_1        
        //   275: ldc             "Cannot decode VP8 video on CrOS."
        //   277: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   280: aload_1        
        //   281: athrow         
        //   282: aload_1        
        //   283: invokevirtual   android/media/MediaExtractor.release:()V
        //   286: goto            306
        //   289: astore_1       
        //   290: aload           13
        //   292: astore_1       
        //   293: goto            299
        //   296: astore_1       
        //   297: aconst_null    
        //   298: astore_1       
        //   299: aload_1        
        //   300: ifnull          306
        //   303: goto            282
        //   306: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   309: bipush          27
        //   311: if_icmplt       459
        //   314: iload_2        
        //   315: ldc             -2147483648
        //   317: if_icmpeq       459
        //   320: iload_3        
        //   321: ldc             -2147483648
        //   323: if_icmpeq       459
        //   326: getstatic       djy.d:Ldjy;
        //   329: astore_1       
        //   330: aload           4
        //   332: aload_1        
        //   333: if_acmpeq       459
        //   336: aload           15
        //   338: bipush          18
        //   340: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   343: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   346: istore          7
        //   348: aload           15
        //   350: bipush          19
        //   352: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   355: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   358: istore          6
        //   360: aload           15
        //   362: bipush          24
        //   364: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   367: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   370: istore          8
        //   372: iload           8
        //   374: bipush          90
        //   376: if_icmpeq       390
        //   379: iload           8
        //   381: sipush          270
        //   384: if_icmpeq       390
        //   387: goto            402
        //   390: iload           7
        //   392: istore          8
        //   394: iload           6
        //   396: istore          7
        //   398: iload           8
        //   400: istore          6
        //   402: aload           4
        //   404: iload           7
        //   406: iload           6
        //   408: iload_2        
        //   409: iload_3        
        //   410: invokevirtual   djy.a:(IIII)F
        //   413: fstore          5
        //   415: iload           7
        //   417: i2f            
        //   418: fload           5
        //   420: fmul           
        //   421: invokestatic    java/lang/Math.round:(F)I
        //   424: istore_2       
        //   425: fload           5
        //   427: iload           6
        //   429: i2f            
        //   430: fmul           
        //   431: invokestatic    java/lang/Math.round:(F)I
        //   434: istore_3       
        //   435: aload           15
        //   437: lload           10
        //   439: iload           9
        //   441: iload_2        
        //   442: iload_3        
        //   443: invokevirtual   android/media/MediaMetadataRetriever.getScaledFrameAtTime:(JIII)Landroid/graphics/Bitmap;
        //   446: astore          4
        //   448: goto            463
        //   451: astore_1       
        //   452: aload           14
        //   454: astore          4
        //   456: goto            463
        //   459: aload           14
        //   461: astore          4
        //   463: aload           4
        //   465: astore_1       
        //   466: aload           4
        //   468: ifnonnull       481
        //   471: aload           15
        //   473: lload           10
        //   475: iload           9
        //   477: invokevirtual   android/media/MediaMetadataRetriever.getFrameAtTime:(JI)Landroid/graphics/Bitmap;
        //   480: astore_1       
        //   481: getstatic       android/os/Build.MODEL:Ljava/lang/String;
        //   484: ldc             "Pixel"
        //   486: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   489: ifeq            549
        //   492: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   495: bipush          33
        //   497: if_icmpne       549
        //   500: getstatic       dkx.c:Ljava/util/List;
        //   503: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   508: astore          13
        //   510: aload_1        
        //   511: astore          4
        //   513: aload           13
        //   515: invokeinterface java/util/Iterator.hasNext:()Z
        //   520: ifeq            710
        //   523: aload           13
        //   525: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   530: checkcast       Ljava/lang/String;
        //   533: astore          4
        //   535: getstatic       android/os/Build.ID:Ljava/lang/String;
        //   538: aload           4
        //   540: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   543: ifeq            510
        //   546: goto            573
        //   549: aload_1        
        //   550: astore          4
        //   552: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   555: bipush          30
        //   557: if_icmplt       710
        //   560: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   563: istore_2       
        //   564: aload_1        
        //   565: astore          4
        //   567: iload_2        
        //   568: bipush          33
        //   570: if_icmpge       710
        //   573: aload           15
        //   575: bipush          36
        //   577: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   580: astore          4
        //   582: aload           15
        //   584: bipush          35
        //   586: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   589: astore          13
        //   591: aload           4
        //   593: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   596: istore_2       
        //   597: aload           13
        //   599: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   602: istore_3       
        //   603: iload_2        
        //   604: bipush          7
        //   606: if_icmpeq       618
        //   609: aload_1        
        //   610: astore          4
        //   612: iload_2        
        //   613: bipush          6
        //   615: if_icmpne       710
        //   618: aload_1        
        //   619: astore          4
        //   621: iload_3        
        //   622: bipush          6
        //   624: if_icmpne       710
        //   627: aload           15
        //   629: bipush          24
        //   631: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   634: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   637: invokestatic    java/lang/Math.abs:(I)I
        //   640: istore_2       
        //   641: aload_1        
        //   642: astore          4
        //   644: iload_2        
        //   645: sipush          180
        //   648: if_icmpne       710
        //   651: new             Landroid/graphics/Matrix;
        //   654: astore          4
        //   656: aload           4
        //   658: invokespecial   android/graphics/Matrix.<init>:()V
        //   661: aload           4
        //   663: ldc             180.0
        //   665: aload_1        
        //   666: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   669: i2f            
        //   670: fconst_2       
        //   671: fdiv           
        //   672: aload_1        
        //   673: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   676: i2f            
        //   677: fconst_2       
        //   678: fdiv           
        //   679: invokevirtual   android/graphics/Matrix.postRotate:(FFF)Z
        //   682: pop            
        //   683: aload_1        
        //   684: iconst_0       
        //   685: iconst_0       
        //   686: aload_1        
        //   687: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   690: aload_1        
        //   691: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   694: aload           4
        //   696: iconst_1       
        //   697: invokestatic    android/graphics/Bitmap.createBitmap:(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
        //   700: astore          4
        //   702: goto            710
        //   705: astore          4
        //   707: aload_1        
        //   708: astore          4
        //   710: aload           4
        //   712: ifnull          746
        //   715: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   718: bipush          29
        //   720: if_icmplt       731
        //   723: aload           15
        //   725: invokevirtual   android/media/MediaMetadataRetriever.close:()V
        //   728: goto            736
        //   731: aload           15
        //   733: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //   736: aload           4
        //   738: aload_0        
        //   739: getfield        dkx.e:Ldgg;
        //   742: invokestatic    djk.f:(Landroid/graphics/Bitmap;Ldgg;)Ldjk;
        //   745: areturn        
        //   746: new             Ldkw;
        //   749: astore_1       
        //   750: aload_1        
        //   751: invokespecial   dkw.<init>:()V
        //   754: aload_1        
        //   755: athrow         
        //   756: astore_1       
        //   757: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   760: bipush          29
        //   762: if_icmplt       773
        //   765: aload           15
        //   767: invokevirtual   android/media/MediaMetadataRetriever.close:()V
        //   770: goto            778
        //   773: aload           15
        //   775: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //   778: goto            783
        //   781: aload_1        
        //   782: athrow         
        //   783: goto            781
        //   786: astore_1       
        //   787: goto            452
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  128    152    756    786    Any
        //  160    170    756    786    Any
        //  175    190    296    299    Any
        //  193    203    296    299    Any
        //  203    222    289    296    Any
        //  235    254    289    296    Any
        //  265    282    756    786    Any
        //  282    286    756    786    Any
        //  306    314    756    786    Any
        //  326    330    756    786    Any
        //  336    372    451    452    Any
        //  402    435    451    452    Any
        //  435    448    786    790    Any
        //  471    481    756    786    Any
        //  481    510    756    786    Any
        //  513    546    756    786    Any
        //  552    564    756    786    Any
        //  573    603    705    710    Ljava/lang/NumberFormatException;
        //  573    603    756    786    Any
        //  627    641    705    710    Ljava/lang/NumberFormatException;
        //  627    641    756    786    Any
        //  651    702    756    786    Any
        //  746    756    756    786    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0452:
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
    
    @Override
    public final boolean b(final Object o, final ddp ddp) {
        return true;
    }
}
