import com.google.common.util.concurrent.ListenableFuture;
import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import android.content.Context;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aabk implements aabm
{
    public final Executor a;
    private final Context b;
    private final thh c;
    private final aabo d;
    private final aabj e;
    private final atjj f;
    private final auip g;
    private final fzo h;
    
    public aabk(final Context b, final Executor a, final auip g, final fzo h, final thh c, final aabo d, final aabj e, final atjj f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.b = b;
        this.a = a;
        this.g = g;
        this.h = h;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    private final PlaybackStartDescriptor c(final PlaybackStartDescriptor playbackStartDescriptor, final zzg zzg, final int n) {
        String i;
        if (!TextUtils.isEmpty((CharSequence)playbackStartDescriptor.i())) {
            i = playbackStartDescriptor.i();
        }
        else {
            i = "PPSV";
        }
        final aioe j = this.d.j(i, zzg.f(), n, playbackStartDescriptor);
        final abhx d = PlaybackStartDescriptor.d();
        d.a = j;
        return d.a();
    }
    
    public final void a(final PlaybackStartDescriptor p0, final szx p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          4
        //     3: aload_0        
        //     4: getfield        aabk.h:Lfzo;
        //     7: astore          5
        //     9: aload_1        
        //    10: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.i:()Ljava/lang/String;
        //    13: astore          6
        //    15: aload_1        
        //    16: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.k:()Ljava/lang/String;
        //    19: pop            
        //    20: aload           5
        //    22: aload           6
        //    24: invokevirtual   fzo.ao:(Ljava/lang/String;)Laaat;
        //    27: astore          7
        //    29: aload           7
        //    31: invokevirtual   aaat.d:()Ljava/util/List;
        //    34: astore          5
        //    36: aload           5
        //    38: invokeinterface java/util/List.isEmpty:()Z
        //    43: ifne            658
        //    46: aload_1        
        //    47: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.k:()Ljava/lang/String;
        //    50: astore          8
        //    52: aload_1        
        //    53: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.a:()I
        //    56: istore          9
        //    58: iconst_0       
        //    59: istore          10
        //    61: iload           10
        //    63: istore          11
        //    65: iload           9
        //    67: iconst_m1      
        //    68: if_icmpeq       236
        //    71: iload           10
        //    73: istore          11
        //    75: iload           9
        //    77: iconst_0       
        //    78: aload           5
        //    80: invokeinterface java/util/List.size:()I
        //    85: invokestatic    tmy.aP:(III)Z
        //    88: ifeq            236
        //    91: aload           8
        //    93: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    96: ifeq            202
        //    99: aload_1        
        //   100: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.a:()I
        //   103: iconst_m1      
        //   104: if_icmpeq       116
        //   107: aload_1        
        //   108: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.a:()I
        //   111: istore          11
        //   113: goto            119
        //   116: iconst_0       
        //   117: istore          11
        //   119: aload           7
        //   121: invokevirtual   aaat.d:()Ljava/util/List;
        //   124: astore          6
        //   126: iload           11
        //   128: iconst_0       
        //   129: aload           6
        //   131: invokeinterface java/util/List.size:()I
        //   136: invokestatic    tmy.aP:(III)Z
        //   139: ifeq            159
        //   142: aload           6
        //   144: iload           11
        //   146: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   151: checkcast       Lzzg;
        //   154: astore          6
        //   156: goto            162
        //   159: aconst_null    
        //   160: astore          6
        //   162: aload           6
        //   164: ifnull          189
        //   167: aload_0        
        //   168: aload           4
        //   170: aload           6
        //   172: aload           5
        //   174: aload           6
        //   176: invokeinterface java/util/List.indexOf:(Ljava/lang/Object;)I
        //   181: invokespecial   aabk.c:(Lcom/google/android/libraries/youtube/player/model/PlaybackStartDescriptor;Lzzg;I)Lcom/google/android/libraries/youtube/player/model/PlaybackStartDescriptor;
        //   184: astore          6
        //   186: goto            287
        //   189: new             Ljava/lang/IllegalArgumentException;
        //   192: astore          6
        //   194: aload           6
        //   196: invokespecial   java/lang/IllegalArgumentException.<init>:()V
        //   199: aload           6
        //   201: athrow         
        //   202: iload           10
        //   204: istore          11
        //   206: aload           8
        //   208: aload           5
        //   210: iload           9
        //   212: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   217: checkcast       Lzzg;
        //   220: invokevirtual   zzg.f:()Ljava/lang/String;
        //   223: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //   226: ifeq            236
        //   229: aload           4
        //   231: astore          6
        //   233: goto            287
        //   236: iload           11
        //   238: aload           5
        //   240: invokeinterface java/util/List.size:()I
        //   245: if_icmpge       645
        //   248: aload           5
        //   250: iload           11
        //   252: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   257: checkcast       Lzzg;
        //   260: astore          6
        //   262: aload           8
        //   264: aload           6
        //   266: invokevirtual   zzg.f:()Ljava/lang/String;
        //   269: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //   272: ifeq            639
        //   275: aload_0        
        //   276: aload           4
        //   278: aload           6
        //   280: iload           11
        //   282: invokespecial   aabk.c:(Lcom/google/android/libraries/youtube/player/model/PlaybackStartDescriptor;Lzzg;I)Lcom/google/android/libraries/youtube/player/model/PlaybackStartDescriptor;
        //   285: astore          6
        //   287: iconst_1       
        //   288: aload_1        
        //   289: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.s:()Z
        //   292: if_icmpne       299
        //   295: aload           6
        //   297: astore          4
        //   299: aload           7
        //   301: getfield        aaat.c:Ljava/lang/Object;
        //   304: astore          8
        //   306: aload           8
        //   308: monitorenter   
        //   309: aload           7
        //   311: getfield        aaat.d:Landroid/util/Pair;
        //   314: astore          5
        //   316: aload           5
        //   318: astore_1       
        //   319: aload           5
        //   321: ifnonnull       330
        //   324: aload           7
        //   326: invokevirtual   aaat.a:()Landroid/util/Pair;
        //   329: astore_1       
        //   330: aload_1        
        //   331: getfield        android/util/Pair.first:Ljava/lang/Object;
        //   334: checkcast       Lzyx;
        //   337: astore_1       
        //   338: aload           8
        //   340: monitorexit    
        //   341: aload           7
        //   343: invokevirtual   aaat.d:()Ljava/util/List;
        //   346: astore          5
        //   348: aload           6
        //   350: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.a:()I
        //   353: istore          10
        //   355: aload           5
        //   357: iload           10
        //   359: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   364: checkcast       Lzzg;
        //   367: astore          8
        //   369: aload_0        
        //   370: getfield        aabk.b:Landroid/content/Context;
        //   373: invokestatic    tsi.g:(Landroid/content/Context;)Z
        //   376: ifne            547
        //   379: aload_0        
        //   380: getfield        aabk.c:Lthh;
        //   383: invokeinterface thh.o:()Z
        //   388: ifeq            547
        //   391: iload_3        
        //   392: ifeq            547
        //   395: invokestatic    zni.d:()Lzni;
        //   398: astore          12
        //   400: aload_0        
        //   401: getfield        aabk.g:Lauip;
        //   404: astore          13
        //   406: aload           8
        //   408: invokevirtual   zzg.f:()Ljava/lang/String;
        //   411: astore          14
        //   413: aload           4
        //   415: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.i:()Ljava/lang/String;
        //   418: astore          15
        //   420: aload           7
        //   422: invokevirtual   aaat.f:()Z
        //   425: ifeq            434
        //   428: iconst_m1      
        //   429: istore          11
        //   431: goto            441
        //   434: aload           4
        //   436: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.a:()I
        //   439: istore          11
        //   441: aload           13
        //   443: aload           14
        //   445: aload           15
        //   447: iload           11
        //   449: ldc             ""
        //   451: aload           4
        //   453: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.x:()[B
        //   456: aload           12
        //   458: aconst_null    
        //   459: invokestatic    j$/util/Optional.empty:()Lj$/util/Optional;
        //   462: invokestatic    j$/util/Optional.empty:()Lj$/util/Optional;
        //   465: invokestatic    j$/util/Optional.empty:()Lj$/util/Optional;
        //   468: invokevirtual   auip.N:(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[BLznj;Lwyn;Lj$/util/Optional;Lj$/util/Optional;Lj$/util/Optional;)V
        //   471: aload           12
        //   473: ldc2_w          3
        //   476: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        //   479: invokevirtual   afrl.get:(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
        //   482: checkcast       Lcom/google/android/libraries/youtube/innertube/model/WatchNextResponseModel;
        //   485: astore          12
        //   487: aload_0        
        //   488: getfield        aabk.d:Laabo;
        //   491: astore          14
        //   493: aload_0        
        //   494: getfield        aabk.b:Landroid/content/Context;
        //   497: astore          15
        //   499: aload_0        
        //   500: getfield        aabk.e:Laabj;
        //   503: aload           6
        //   505: aload           7
        //   507: invokeinterface aabj.a:(Lcom/google/android/libraries/youtube/player/model/PlaybackStartDescriptor;Laaat;)Lahvo;
        //   512: astore          13
        //   514: aload_2        
        //   515: aconst_null    
        //   516: aload           14
        //   518: aload           12
        //   520: aload           15
        //   522: aload_1        
        //   523: aload           5
        //   525: iload           10
        //   527: aload           4
        //   529: aload           13
        //   531: invokeinterface aabo.g:(Lcom/google/android/libraries/youtube/innertube/model/WatchNextResponseModel;Landroid/content/Context;Lzyx;Ljava/util/List;ILcom/google/android/libraries/youtube/player/model/PlaybackStartDescriptor;Lahvo;)Lcom/google/android/libraries/youtube/innertube/model/WatchNextResponseModel;
        //   536: invokeinterface szx.b:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   541: return         
        //   542: astore          12
        //   544: goto            547
        //   547: aload_1        
        //   548: ifnull          606
        //   551: aload           7
        //   553: invokevirtual   aaat.f:()Z
        //   556: ifne            569
        //   559: aload           5
        //   561: invokeinterface java/util/List.isEmpty:()Z
        //   566: ifne            606
        //   569: aload_0        
        //   570: getfield        aabk.d:Laabo;
        //   573: aload_0        
        //   574: getfield        aabk.b:Landroid/content/Context;
        //   577: aload_1        
        //   578: aload           5
        //   580: iload           10
        //   582: aload           4
        //   584: aload_0        
        //   585: getfield        aabk.e:Laabj;
        //   588: aload           6
        //   590: aload           7
        //   592: invokeinterface aabj.a:(Lcom/google/android/libraries/youtube/player/model/PlaybackStartDescriptor;Laaat;)Lahvo;
        //   597: invokeinterface aabo.i:(Landroid/content/Context;Lzyx;Ljava/util/List;ILcom/google/android/libraries/youtube/player/model/PlaybackStartDescriptor;Lahvo;)Lcom/google/android/libraries/youtube/innertube/model/WatchNextResponseModel;
        //   602: astore_1       
        //   603: goto            624
        //   606: aload_0        
        //   607: getfield        aabk.d:Laabo;
        //   610: aload_0        
        //   611: getfield        aabk.b:Landroid/content/Context;
        //   614: aload           8
        //   616: aload           4
        //   618: invokeinterface aabo.h:(Landroid/content/Context;Lzzg;Lcom/google/android/libraries/youtube/player/model/PlaybackStartDescriptor;)Lcom/google/android/libraries/youtube/innertube/model/WatchNextResponseModel;
        //   623: astore_1       
        //   624: aload_2        
        //   625: aconst_null    
        //   626: aload_1        
        //   627: invokeinterface szx.b:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   632: return         
        //   633: astore_1       
        //   634: aload           8
        //   636: monitorexit    
        //   637: aload_1        
        //   638: athrow         
        //   639: iinc            11, 1
        //   642: goto            236
        //   645: new             Ljava/lang/IllegalArgumentException;
        //   648: astore          6
        //   650: aload           6
        //   652: invokespecial   java/lang/IllegalArgumentException.<init>:()V
        //   655: aload           6
        //   657: athrow         
        //   658: aconst_null    
        //   659: athrow         
        //   660: astore          6
        //   662: goto            667
        //   665: astore          6
        //   667: aload_1        
        //   668: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.k:()Ljava/lang/String;
        //   671: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   674: ifne            757
        //   677: aload_0        
        //   678: getfield        aabk.f:Latjj;
        //   681: invokeinterface atjj.a:()Ljava/lang/Object;
        //   686: checkcast       Lzzu;
        //   689: invokevirtual   zzu.a:()Laack;
        //   692: invokeinterface aack.l:()Laacp;
        //   697: aload_1        
        //   698: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.k:()Ljava/lang/String;
        //   701: invokeinterface aacp.e:(Ljava/lang/String;)Lzzl;
        //   706: astore_1       
        //   707: aload_1        
        //   708: ifnull          748
        //   711: aload_1        
        //   712: invokevirtual   zzl.q:()Z
        //   715: ifeq            721
        //   718: goto            748
        //   721: aload_2        
        //   722: aconst_null    
        //   723: aload_0        
        //   724: getfield        aabk.d:Laabo;
        //   727: aload_0        
        //   728: getfield        aabk.b:Landroid/content/Context;
        //   731: aload_1        
        //   732: getfield        zzl.a:Lzzg;
        //   735: aload           4
        //   737: invokeinterface aabo.h:(Landroid/content/Context;Lzzg;Lcom/google/android/libraries/youtube/player/model/PlaybackStartDescriptor;)Lcom/google/android/libraries/youtube/innertube/model/WatchNextResponseModel;
        //   742: invokeinterface szx.b:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   747: return         
        //   748: aload_0        
        //   749: getfield        aabk.d:Laabo;
        //   752: invokeinterface aabo.o:()V
        //   757: aload_2        
        //   758: aconst_null    
        //   759: aload           6
        //   761: invokeinterface szx.rX:(Ljava/lang/Object;Ljava/lang/Exception;)V
        //   766: return         
        //   767: astore          12
        //   769: goto            544
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  29     58     665    667    Ljava/lang/NullPointerException;
        //  29     58     660    665    Ljava/lang/IllegalArgumentException;
        //  75     113    665    667    Ljava/lang/NullPointerException;
        //  75     113    660    665    Ljava/lang/IllegalArgumentException;
        //  119    156    665    667    Ljava/lang/NullPointerException;
        //  119    156    660    665    Ljava/lang/IllegalArgumentException;
        //  167    186    665    667    Ljava/lang/NullPointerException;
        //  167    186    660    665    Ljava/lang/IllegalArgumentException;
        //  189    202    665    667    Ljava/lang/NullPointerException;
        //  189    202    660    665    Ljava/lang/IllegalArgumentException;
        //  206    229    665    667    Ljava/lang/NullPointerException;
        //  206    229    660    665    Ljava/lang/IllegalArgumentException;
        //  236    287    665    667    Ljava/lang/NullPointerException;
        //  236    287    660    665    Ljava/lang/IllegalArgumentException;
        //  309    316    633    639    Any
        //  324    330    633    639    Any
        //  330    341    633    639    Any
        //  471    514    542    544    Ljava/util/concurrent/ExecutionException;
        //  471    514    542    544    Ljava/lang/InterruptedException;
        //  471    514    542    544    Ljava/util/concurrent/TimeoutException;
        //  514    541    767    772    Ljava/util/concurrent/ExecutionException;
        //  514    541    767    772    Ljava/lang/InterruptedException;
        //  514    541    767    772    Ljava/util/concurrent/TimeoutException;
        //  634    637    633    639    Any
        //  645    658    665    667    Ljava/lang/NullPointerException;
        //  645    658    660    665    Ljava/lang/IllegalArgumentException;
        //  658    660    665    667    Ljava/lang/NullPointerException;
        //  658    660    660    665    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0544:
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
    
    public final ListenableFuture b(final PlaybackStartDescriptor playbackStartDescriptor, final boolean b) {
        throw null;
    }
}
