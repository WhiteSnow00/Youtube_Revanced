import com.google.common.util.concurrent.ListenableFuture;
import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import android.content.Context;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aafd implements aaff
{
    public final Executor a;
    private final Context b;
    private final tkq c;
    private final aafh d;
    private final aafc e;
    private final atnb f;
    private final aapu g;
    private final gab h;
    
    public aafd(final Context b, final Executor a, final aapu g, final gab h, final tkq c, final aafh d, final aafc e, final atnb f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.a = a;
        this.g = g;
        this.h = h;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    private final PlaybackStartDescriptor c(final PlaybackStartDescriptor playbackStartDescriptor, final aacx aacx, final int n) {
        String i;
        if (!TextUtils.isEmpty((CharSequence)playbackStartDescriptor.i())) {
            i = playbackStartDescriptor.i();
        }
        else {
            i = "PPSV";
        }
        final aisc j = this.d.j(i, aacx.f(), n, playbackStartDescriptor);
        final abkw d = PlaybackStartDescriptor.d();
        d.a = j;
        return d.a();
    }
    
    public final void a(final PlaybackStartDescriptor p0, final tdg p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          8
        //     3: aload_0        
        //     4: getfield        aafd.h:Lgab;
        //     7: astore          7
        //     9: aload_1        
        //    10: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.i:()Ljava/lang/String;
        //    13: astore          9
        //    15: aload_1        
        //    16: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.k:()Ljava/lang/String;
        //    19: pop            
        //    20: aload           7
        //    22: aload           9
        //    24: invokevirtual   gab.ar:(Ljava/lang/String;)Laaek;
        //    27: astore          10
        //    29: aload           10
        //    31: invokevirtual   aaek.d:()Ljava/util/List;
        //    34: astore          9
        //    36: aload           9
        //    38: invokeinterface java/util/List.isEmpty:()Z
        //    43: ifne            658
        //    46: aload_1        
        //    47: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.k:()Ljava/lang/String;
        //    50: astore          11
        //    52: aload_1        
        //    53: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.a:()I
        //    56: istore          6
        //    58: iconst_0       
        //    59: istore          5
        //    61: iload           5
        //    63: istore          4
        //    65: iload           6
        //    67: iconst_m1      
        //    68: if_icmpeq       236
        //    71: iload           5
        //    73: istore          4
        //    75: iload           6
        //    77: iconst_0       
        //    78: aload           9
        //    80: invokeinterface java/util/List.size:()I
        //    85: invokestatic    tqf.aP:(III)Z
        //    88: ifeq            236
        //    91: aload           11
        //    93: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    96: ifne            133
        //    99: iload           5
        //   101: istore          4
        //   103: aload           11
        //   105: aload           9
        //   107: iload           6
        //   109: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   114: checkcast       Laacx;
        //   117: invokevirtual   aacx.f:()Ljava/lang/String;
        //   120: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //   123: ifeq            236
        //   126: aload           8
        //   128: astore          7
        //   130: goto            287
        //   133: aload_1        
        //   134: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.a:()I
        //   137: iconst_m1      
        //   138: if_icmpeq       150
        //   141: aload_1        
        //   142: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.a:()I
        //   145: istore          4
        //   147: goto            153
        //   150: iconst_0       
        //   151: istore          4
        //   153: aload           10
        //   155: invokevirtual   aaek.d:()Ljava/util/List;
        //   158: astore          7
        //   160: iload           4
        //   162: iconst_0       
        //   163: aload           7
        //   165: invokeinterface java/util/List.size:()I
        //   170: invokestatic    tqf.aP:(III)Z
        //   173: ifeq            193
        //   176: aload           7
        //   178: iload           4
        //   180: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   185: checkcast       Laacx;
        //   188: astore          7
        //   190: goto            196
        //   193: aconst_null    
        //   194: astore          7
        //   196: aload           7
        //   198: ifnull          223
        //   201: aload_0        
        //   202: aload           8
        //   204: aload           7
        //   206: aload           9
        //   208: aload           7
        //   210: invokeinterface java/util/List.indexOf:(Ljava/lang/Object;)I
        //   215: invokespecial   aafd.c:(Lcom/google/android/libraries/youtube/player/model/PlaybackStartDescriptor;Laacx;I)Lcom/google/android/libraries/youtube/player/model/PlaybackStartDescriptor;
        //   218: astore          7
        //   220: goto            287
        //   223: new             Ljava/lang/IllegalArgumentException;
        //   226: astore          7
        //   228: aload           7
        //   230: invokespecial   java/lang/IllegalArgumentException.<init>:()V
        //   233: aload           7
        //   235: athrow         
        //   236: iload           4
        //   238: aload           9
        //   240: invokeinterface java/util/List.size:()I
        //   245: if_icmpge       645
        //   248: aload           9
        //   250: iload           4
        //   252: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   257: checkcast       Laacx;
        //   260: astore          7
        //   262: aload           11
        //   264: aload           7
        //   266: invokevirtual   aacx.f:()Ljava/lang/String;
        //   269: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //   272: ifeq            639
        //   275: aload_0        
        //   276: aload           8
        //   278: aload           7
        //   280: iload           4
        //   282: invokespecial   aafd.c:(Lcom/google/android/libraries/youtube/player/model/PlaybackStartDescriptor;Laacx;I)Lcom/google/android/libraries/youtube/player/model/PlaybackStartDescriptor;
        //   285: astore          7
        //   287: iconst_1       
        //   288: aload_1        
        //   289: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.s:()Z
        //   292: if_icmpne       299
        //   295: aload           7
        //   297: astore          8
        //   299: aload           10
        //   301: getfield        aaek.c:Ljava/lang/Object;
        //   304: astore          11
        //   306: aload           11
        //   308: monitorenter   
        //   309: aload           10
        //   311: getfield        aaek.d:Landroid/util/Pair;
        //   314: astore          9
        //   316: aload           9
        //   318: astore_1       
        //   319: aload           9
        //   321: ifnonnull       330
        //   324: aload           10
        //   326: invokevirtual   aaek.a:()Landroid/util/Pair;
        //   329: astore_1       
        //   330: aload_1        
        //   331: getfield        android/util/Pair.first:Ljava/lang/Object;
        //   334: checkcast       Laaco;
        //   337: astore_1       
        //   338: aload           11
        //   340: monitorexit    
        //   341: aload           10
        //   343: invokevirtual   aaek.d:()Ljava/util/List;
        //   346: astore          9
        //   348: aload           7
        //   350: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.a:()I
        //   353: istore          5
        //   355: aload           9
        //   357: iload           5
        //   359: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   364: checkcast       Laacx;
        //   367: astore          11
        //   369: aload_0        
        //   370: getfield        aafd.b:Landroid/content/Context;
        //   373: invokestatic    tvo.e:(Landroid/content/Context;)Z
        //   376: ifne            547
        //   379: aload_0        
        //   380: getfield        aafd.c:Ltkq;
        //   383: invokeinterface tkq.o:()Z
        //   388: ifeq            547
        //   391: iload_3        
        //   392: ifeq            547
        //   395: invokestatic    zra.d:()Lzra;
        //   398: astore          12
        //   400: aload_0        
        //   401: getfield        aafd.g:Laapu;
        //   404: astore          14
        //   406: aload           11
        //   408: invokevirtual   aacx.f:()Ljava/lang/String;
        //   411: astore          15
        //   413: aload           8
        //   415: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.i:()Ljava/lang/String;
        //   418: astore          13
        //   420: aload           10
        //   422: invokevirtual   aaek.f:()Z
        //   425: ifeq            434
        //   428: iconst_m1      
        //   429: istore          4
        //   431: goto            441
        //   434: aload           8
        //   436: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.a:()I
        //   439: istore          4
        //   441: aload           14
        //   443: aload           15
        //   445: aload           13
        //   447: iload           4
        //   449: ldc             ""
        //   451: aload           8
        //   453: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.x:()[B
        //   456: aload           12
        //   458: aconst_null    
        //   459: invokestatic    j$/util/Optional.empty:()Lj$/util/Optional;
        //   462: invokestatic    j$/util/Optional.empty:()Lj$/util/Optional;
        //   465: invokestatic    j$/util/Optional.empty:()Lj$/util/Optional;
        //   468: invokevirtual   aapu.b:(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[BLzrb;Lxbt;Lj$/util/Optional;Lj$/util/Optional;Lj$/util/Optional;)V
        //   471: aload           12
        //   473: ldc2_w          3
        //   476: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        //   479: invokevirtual   afvd.get:(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
        //   482: checkcast       Lcom/google/android/libraries/youtube/innertube/model/WatchNextResponseModel;
        //   485: astore          13
        //   487: aload_0        
        //   488: getfield        aafd.d:Laafh;
        //   491: astore          14
        //   493: aload_0        
        //   494: getfield        aafd.b:Landroid/content/Context;
        //   497: astore          15
        //   499: aload_0        
        //   500: getfield        aafd.e:Laafc;
        //   503: aload           7
        //   505: aload           10
        //   507: invokeinterface aafc.a:(Lcom/google/android/libraries/youtube/player/model/PlaybackStartDescriptor;Laaek;)Lahzf;
        //   512: astore          12
        //   514: aload_2        
        //   515: aconst_null    
        //   516: aload           14
        //   518: aload           13
        //   520: aload           15
        //   522: aload_1        
        //   523: aload           9
        //   525: iload           5
        //   527: aload           8
        //   529: aload           12
        //   531: invokeinterface aafh.g:(Lcom/google/android/libraries/youtube/innertube/model/WatchNextResponseModel;Landroid/content/Context;Laaco;Ljava/util/List;ILcom/google/android/libraries/youtube/player/model/PlaybackStartDescriptor;Lahzf;)Lcom/google/android/libraries/youtube/innertube/model/WatchNextResponseModel;
        //   536: invokeinterface tdg.d:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   541: return         
        //   542: astore          12
        //   544: goto            547
        //   547: aload_1        
        //   548: ifnull          606
        //   551: aload           10
        //   553: invokevirtual   aaek.f:()Z
        //   556: ifne            569
        //   559: aload           9
        //   561: invokeinterface java/util/List.isEmpty:()Z
        //   566: ifne            606
        //   569: aload_0        
        //   570: getfield        aafd.d:Laafh;
        //   573: aload_0        
        //   574: getfield        aafd.b:Landroid/content/Context;
        //   577: aload_1        
        //   578: aload           9
        //   580: iload           5
        //   582: aload           8
        //   584: aload_0        
        //   585: getfield        aafd.e:Laafc;
        //   588: aload           7
        //   590: aload           10
        //   592: invokeinterface aafc.a:(Lcom/google/android/libraries/youtube/player/model/PlaybackStartDescriptor;Laaek;)Lahzf;
        //   597: invokeinterface aafh.i:(Landroid/content/Context;Laaco;Ljava/util/List;ILcom/google/android/libraries/youtube/player/model/PlaybackStartDescriptor;Lahzf;)Lcom/google/android/libraries/youtube/innertube/model/WatchNextResponseModel;
        //   602: astore_1       
        //   603: goto            624
        //   606: aload_0        
        //   607: getfield        aafd.d:Laafh;
        //   610: aload_0        
        //   611: getfield        aafd.b:Landroid/content/Context;
        //   614: aload           11
        //   616: aload           8
        //   618: invokeinterface aafh.h:(Landroid/content/Context;Laacx;Lcom/google/android/libraries/youtube/player/model/PlaybackStartDescriptor;)Lcom/google/android/libraries/youtube/innertube/model/WatchNextResponseModel;
        //   623: astore_1       
        //   624: aload_2        
        //   625: aconst_null    
        //   626: aload_1        
        //   627: invokeinterface tdg.d:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   632: return         
        //   633: astore_1       
        //   634: aload           11
        //   636: monitorexit    
        //   637: aload_1        
        //   638: athrow         
        //   639: iinc            4, 1
        //   642: goto            236
        //   645: new             Ljava/lang/IllegalArgumentException;
        //   648: astore          7
        //   650: aload           7
        //   652: invokespecial   java/lang/IllegalArgumentException.<init>:()V
        //   655: aload           7
        //   657: athrow         
        //   658: aconst_null    
        //   659: athrow         
        //   660: astore          7
        //   662: goto            667
        //   665: astore          7
        //   667: aload_1        
        //   668: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.k:()Ljava/lang/String;
        //   671: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   674: ifne            757
        //   677: aload_0        
        //   678: getfield        aafd.f:Latnb;
        //   681: invokeinterface atnb.a:()Ljava/lang/Object;
        //   686: checkcast       Laadl;
        //   689: invokevirtual   aadl.a:()Laage;
        //   692: invokeinterface aage.l:()Laagj;
        //   697: aload_1        
        //   698: invokevirtual   com/google/android/libraries/youtube/player/model/PlaybackStartDescriptor.k:()Ljava/lang/String;
        //   701: invokeinterface aagj.e:(Ljava/lang/String;)Laadc;
        //   706: astore_1       
        //   707: aload_1        
        //   708: ifnull          748
        //   711: aload_1        
        //   712: invokevirtual   aadc.q:()Z
        //   715: ifeq            721
        //   718: goto            748
        //   721: aload_2        
        //   722: aconst_null    
        //   723: aload_0        
        //   724: getfield        aafd.d:Laafh;
        //   727: aload_0        
        //   728: getfield        aafd.b:Landroid/content/Context;
        //   731: aload_1        
        //   732: getfield        aadc.a:Laacx;
        //   735: aload           8
        //   737: invokeinterface aafh.h:(Landroid/content/Context;Laacx;Lcom/google/android/libraries/youtube/player/model/PlaybackStartDescriptor;)Lcom/google/android/libraries/youtube/innertube/model/WatchNextResponseModel;
        //   742: invokeinterface tdg.d:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   747: return         
        //   748: aload_0        
        //   749: getfield        aafd.d:Laafh;
        //   752: invokeinterface aafh.o:()V
        //   757: aload_2        
        //   758: aconst_null    
        //   759: aload           7
        //   761: invokeinterface tdg.c:(Ljava/lang/Object;Ljava/lang/Exception;)V
        //   766: return         
        //   767: astore          12
        //   769: goto            544
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  29     58     665    667    Ljava/lang/NullPointerException;
        //  29     58     660    665    Ljava/lang/IllegalArgumentException;
        //  75     99     665    667    Ljava/lang/NullPointerException;
        //  75     99     660    665    Ljava/lang/IllegalArgumentException;
        //  103    126    665    667    Ljava/lang/NullPointerException;
        //  103    126    660    665    Ljava/lang/IllegalArgumentException;
        //  133    147    665    667    Ljava/lang/NullPointerException;
        //  133    147    660    665    Ljava/lang/IllegalArgumentException;
        //  153    190    665    667    Ljava/lang/NullPointerException;
        //  153    190    660    665    Ljava/lang/IllegalArgumentException;
        //  201    220    665    667    Ljava/lang/NullPointerException;
        //  201    220    660    665    Ljava/lang/IllegalArgumentException;
        //  223    236    665    667    Ljava/lang/NullPointerException;
        //  223    236    660    665    Ljava/lang/IllegalArgumentException;
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
