import java.util.Collections;
import java.util.Arrays;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dkw implements ddq
{
    public static final ddn a;
    public static final ddn b;
    private static final List c;
    private final dku d;
    private final dgf e;
    
    static {
        a = ddn.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", (Object)(-1L), (ddm)new dkr(1, null));
        b = ddn.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", (Object)2, (ddm)new dkr(0));
        c = Collections.unmodifiableList((List<?>)Arrays.asList("TP1A", "TD1A.220804.031"));
    }
    
    public dkw(final dgf e, final dku d) {
        this.e = e;
        this.d = d;
    }
    
    public final dfx a(final Object p0, final int p1, final int p2, final ddo p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: getstatic       dkw.a:Lddn;
        //     5: invokevirtual   ddo.b:(Lddn;)Ljava/lang/Object;
        //     8: checkcast       Ljava/lang/Long;
        //    11: invokevirtual   java/lang/Long.longValue:()J
        //    14: lstore          5
        //    16: lload           5
        //    18: lconst_0       
        //    19: lcmp           
        //    20: ifge            64
        //    23: lload           5
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
        //    46: lload           5
        //    48: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    51: pop            
        //    52: new             Ljava/lang/IllegalArgumentException;
        //    55: dup            
        //    56: aload_1        
        //    57: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    60: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    63: athrow         
        //    64: aload           4
        //    66: getstatic       dkw.b:Lddn;
        //    69: invokevirtual   ddo.b:(Lddn;)Ljava/lang/Object;
        //    72: checkcast       Ljava/lang/Integer;
        //    75: astore          7
        //    77: aload           7
        //    79: astore          8
        //    81: aload           7
        //    83: ifnonnull       92
        //    86: iconst_2       
        //    87: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    90: astore          8
        //    92: aload           4
        //    94: getstatic       djx.f:Lddn;
        //    97: invokevirtual   ddo.b:(Lddn;)Ljava/lang/Object;
        //   100: checkcast       Ldjx;
        //   103: astore          7
        //   105: aload           7
        //   107: astore          4
        //   109: aload           7
        //   111: ifnonnull       119
        //   114: getstatic       djx.e:Ldjx;
        //   117: astore          4
        //   119: new             Landroid/media/MediaMetadataRetriever;
        //   122: dup            
        //   123: invokespecial   android/media/MediaMetadataRetriever.<init>:()V
        //   126: astore          9
        //   128: aload_0        
        //   129: getfield        dkw.d:Ldku;
        //   132: aload           9
        //   134: aload_1        
        //   135: invokeinterface dku.b:(Landroid/media/MediaMetadataRetriever;Ljava/lang/Object;)V
        //   140: aload           8
        //   142: invokevirtual   java/lang/Integer.intValue:()I
        //   145: istore          10
        //   147: getstatic       android/os/Build.DEVICE:Ljava/lang/String;
        //   150: astore          8
        //   152: aconst_null    
        //   153: astore          7
        //   155: aload           8
        //   157: ifnull          306
        //   160: getstatic       android/os/Build.DEVICE:Ljava/lang/String;
        //   163: ldc             ".+_cheets|cheets_.+"
        //   165: invokevirtual   java/lang/String.matches:(Ljava/lang/String;)Z
        //   168: istore          11
        //   170: iload           11
        //   172: ifeq            306
        //   175: ldc             "video/webm"
        //   177: aload           9
        //   179: bipush          12
        //   181: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   184: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   187: ifne            193
        //   190: goto            306
        //   193: new             Landroid/media/MediaExtractor;
        //   196: astore          8
        //   198: aload           8
        //   200: invokespecial   android/media/MediaExtractor.<init>:()V
        //   203: aload_0        
        //   204: getfield        dkw.d:Ldku;
        //   207: aload           8
        //   209: aload_1        
        //   210: invokeinterface dku.a:(Landroid/media/MediaExtractor;Ljava/lang/Object;)V
        //   215: aload           8
        //   217: invokevirtual   android/media/MediaExtractor.getTrackCount:()I
        //   220: istore          12
        //   222: iconst_0       
        //   223: istore          13
        //   225: aload           8
        //   227: astore_1       
        //   228: iload           13
        //   230: iload           12
        //   232: if_icmpge       282
        //   235: ldc             "video/x-vnd.on2.vp8"
        //   237: aload           8
        //   239: iload           13
        //   241: invokevirtual   android/media/MediaExtractor.getTrackFormat:(I)Landroid/media/MediaFormat;
        //   244: ldc             "mime"
        //   246: invokevirtual   android/media/MediaFormat.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   249: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   252: istore          11
        //   254: iload           11
        //   256: ifne            265
        //   259: iinc            13, 1
        //   262: goto            225
        //   265: aload           8
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
        //   290: aload           8
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
        //   311: if_icmplt       458
        //   314: iload_2        
        //   315: ldc             -2147483648
        //   317: if_icmpeq       458
        //   320: iload_3        
        //   321: ldc             -2147483648
        //   323: if_icmpeq       458
        //   326: getstatic       djx.d:Ldjx;
        //   329: astore_1       
        //   330: aload           4
        //   332: aload_1        
        //   333: if_acmpeq       458
        //   336: aload           9
        //   338: bipush          18
        //   340: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   343: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   346: istore          14
        //   348: aload           9
        //   350: bipush          19
        //   352: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   355: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   358: istore          12
        //   360: aload           9
        //   362: bipush          24
        //   364: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   367: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   370: istore          15
        //   372: iload           15
        //   374: bipush          90
        //   376: if_icmpeq       395
        //   379: iload           14
        //   381: istore          16
        //   383: iload           12
        //   385: istore          13
        //   387: iload           15
        //   389: sipush          270
        //   392: if_icmpne       403
        //   395: iload           14
        //   397: istore          13
        //   399: iload           12
        //   401: istore          16
        //   403: aload           4
        //   405: iload           16
        //   407: iload           13
        //   409: iload_2        
        //   410: iload_3        
        //   411: invokevirtual   djx.a:(IIII)F
        //   414: fstore          17
        //   416: iload           16
        //   418: i2f            
        //   419: fload           17
        //   421: fmul           
        //   422: invokestatic    java/lang/Math.round:(F)I
        //   425: istore_2       
        //   426: fload           17
        //   428: iload           13
        //   430: i2f            
        //   431: fmul           
        //   432: invokestatic    java/lang/Math.round:(F)I
        //   435: istore_3       
        //   436: aload           9
        //   438: lload           5
        //   440: iload           10
        //   442: iload_2        
        //   443: iload_3        
        //   444: invokevirtual   android/media/MediaMetadataRetriever.getScaledFrameAtTime:(JIII)Landroid/graphics/Bitmap;
        //   447: astore_1       
        //   448: goto            461
        //   451: astore_1       
        //   452: aload           7
        //   454: astore_1       
        //   455: goto            461
        //   458: aload           7
        //   460: astore_1       
        //   461: aload_1        
        //   462: astore          4
        //   464: aload_1        
        //   465: ifnonnull       479
        //   468: aload           9
        //   470: lload           5
        //   472: iload           10
        //   474: invokevirtual   android/media/MediaMetadataRetriever.getFrameAtTime:(JI)Landroid/graphics/Bitmap;
        //   477: astore          4
        //   479: getstatic       android/os/Build.MODEL:Ljava/lang/String;
        //   482: ldc             "Pixel"
        //   484: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   487: ifeq            545
        //   490: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   493: bipush          33
        //   495: if_icmpne       545
        //   498: getstatic       dkw.c:Ljava/util/List;
        //   501: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   506: astore          8
        //   508: aload           4
        //   510: astore_1       
        //   511: aload           8
        //   513: invokeinterface java/util/Iterator.hasNext:()Z
        //   518: ifeq            703
        //   521: aload           8
        //   523: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   528: checkcast       Ljava/lang/String;
        //   531: astore_1       
        //   532: getstatic       android/os/Build.ID:Ljava/lang/String;
        //   535: aload_1        
        //   536: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   539: ifeq            508
        //   542: goto            569
        //   545: aload           4
        //   547: astore_1       
        //   548: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   551: bipush          30
        //   553: if_icmplt       703
        //   556: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   559: istore_2       
        //   560: aload           4
        //   562: astore_1       
        //   563: iload_2        
        //   564: bipush          33
        //   566: if_icmpge       703
        //   569: aload           9
        //   571: bipush          36
        //   573: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   576: astore_1       
        //   577: aload           9
        //   579: bipush          35
        //   581: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   584: astore          8
        //   586: aload_1        
        //   587: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   590: istore_2       
        //   591: aload           8
        //   593: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   596: istore_3       
        //   597: iload_2        
        //   598: bipush          7
        //   600: if_icmpeq       612
        //   603: aload           4
        //   605: astore_1       
        //   606: iload_2        
        //   607: bipush          6
        //   609: if_icmpne       703
        //   612: aload           4
        //   614: astore_1       
        //   615: iload_3        
        //   616: bipush          6
        //   618: if_icmpne       703
        //   621: aload           9
        //   623: bipush          24
        //   625: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   628: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   631: invokestatic    java/lang/Math.abs:(I)I
        //   634: istore_2       
        //   635: aload           4
        //   637: astore_1       
        //   638: iload_2        
        //   639: sipush          180
        //   642: if_icmpne       703
        //   645: new             Landroid/graphics/Matrix;
        //   648: astore_1       
        //   649: aload_1        
        //   650: invokespecial   android/graphics/Matrix.<init>:()V
        //   653: aload_1        
        //   654: ldc             180.0
        //   656: aload           4
        //   658: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   661: i2f            
        //   662: fconst_2       
        //   663: fdiv           
        //   664: aload           4
        //   666: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   669: i2f            
        //   670: fconst_2       
        //   671: fdiv           
        //   672: invokevirtual   android/graphics/Matrix.postRotate:(FFF)Z
        //   675: pop            
        //   676: aload           4
        //   678: iconst_0       
        //   679: iconst_0       
        //   680: aload           4
        //   682: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   685: aload           4
        //   687: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   690: aload_1        
        //   691: iconst_1       
        //   692: invokestatic    android/graphics/Bitmap.createBitmap:(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
        //   695: astore_1       
        //   696: goto            703
        //   699: astore_1       
        //   700: aload           4
        //   702: astore_1       
        //   703: aload_1        
        //   704: ifnull          737
        //   707: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   710: bipush          29
        //   712: if_icmplt       723
        //   715: aload           9
        //   717: invokevirtual   android/media/MediaMetadataRetriever.close:()V
        //   720: goto            728
        //   723: aload           9
        //   725: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //   728: aload_1        
        //   729: aload_0        
        //   730: getfield        dkw.e:Ldgf;
        //   733: invokestatic    djj.f:(Landroid/graphics/Bitmap;Ldgf;)Ldjj;
        //   736: areturn        
        //   737: new             Ldkv;
        //   740: astore_1       
        //   741: aload_1        
        //   742: invokespecial   dkv.<init>:()V
        //   745: aload_1        
        //   746: athrow         
        //   747: astore_1       
        //   748: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   751: bipush          29
        //   753: if_icmplt       764
        //   756: aload           9
        //   758: invokevirtual   android/media/MediaMetadataRetriever.close:()V
        //   761: goto            769
        //   764: aload           9
        //   766: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //   769: goto            774
        //   772: aload_1        
        //   773: athrow         
        //   774: goto            772
        //   777: astore_1       
        //   778: goto            452
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  128    152    747    777    Any
        //  160    170    747    777    Any
        //  175    190    296    299    Any
        //  193    203    296    299    Any
        //  203    222    289    296    Any
        //  235    254    289    296    Any
        //  265    282    747    777    Any
        //  282    286    747    777    Any
        //  306    314    747    777    Any
        //  326    330    747    777    Any
        //  336    372    451    452    Any
        //  403    436    451    452    Any
        //  436    448    777    781    Any
        //  468    479    747    777    Any
        //  479    508    747    777    Any
        //  511    542    747    777    Any
        //  548    560    747    777    Any
        //  569    597    699    703    Ljava/lang/NumberFormatException;
        //  569    597    747    777    Any
        //  621    635    699    703    Ljava/lang/NumberFormatException;
        //  621    635    747    777    Any
        //  645    696    747    777    Any
        //  737    747    747    777    Any
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
    
    public final boolean b(final Object o, final ddo ddo) {
        return true;
    }
}
