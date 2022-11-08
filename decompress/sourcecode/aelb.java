import com.google.common.util.concurrent.ListenableFuture;
import androidx.work.WorkerParameters;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aelb implements aekn
{
    public final atjj a;
    private final ahar b;
    
    public aelb(final atjj a, final ahar b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
    }
    
    public final ListenableFuture a(final WorkerParameters p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    aesw.o:(Ljava/lang/String;)Laere;
        //     5: astore_2       
        //     6: aload_0        
        //     7: getfield        aelb.b:Lahar;
        //    10: astore_3       
        //    11: new             Laepb;
        //    14: astore          4
        //    16: aload           4
        //    18: aload_0        
        //    19: aload_2        
        //    20: aload_1        
        //    21: iconst_1       
        //    22: invokespecial   aepb.<init>:(Laelb;Laere;Landroidx/work/WorkerParameters;I)V
        //    25: aload_3        
        //    26: getfield        ahar.c:Ljava/lang/Object;
        //    29: invokeinterface oas.d:()J
        //    34: lstore          5
        //    36: aload_3        
        //    37: getfield        ahar.a:Ljava/lang/Object;
        //    40: checkcast       Larje;
        //    43: getfield        arje.a:Ljava/lang/Object;
        //    46: checkcast       Ljava/util/Collection;
        //    49: invokestatic    afdu.p:(Ljava/util/Collection;)Lafdu;
        //    52: astore          7
        //    54: aload_3        
        //    55: getfield        ahar.b:Ljava/lang/Object;
        //    58: astore          8
        //    60: new             Ljava/util/HashSet;
        //    63: astore_1       
        //    64: aload_1        
        //    65: invokespecial   java/util/HashSet.<init>:()V
        //    68: ldc             "Reporting Tiktok worker start"
        //    70: invokestatic    aesw.o:(Ljava/lang/String;)Laere;
        //    73: astore          9
        //    75: aload           7
        //    77: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    82: astore          10
        //    84: aload           10
        //    86: invokeinterface java/util/Iterator.hasNext:()Z
        //    91: ifeq            157
        //    94: aload           10
        //    96: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   101: checkcast       Laeko;
        //   104: astore          7
        //   106: new             Laeiq;
        //   109: astore          11
        //   111: aload           11
        //   113: aload           7
        //   115: iconst_4       
        //   116: invokespecial   aeiq.<init>:(Laeko;I)V
        //   119: aload           11
        //   121: invokestatic    aesm.c:(Lafrx;)Lafrx;
        //   124: aload           8
        //   126: invokestatic    afld.l:(Lafrx;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   129: astore          12
        //   131: new             Laelg;
        //   134: astore          11
        //   136: aload           11
        //   138: aload           7
        //   140: aload           12
        //   142: invokespecial   aelg.<init>:(Laeko;Lcom/google/common/util/concurrent/ListenableFuture;)V
        //   145: aload_1        
        //   146: aload           11
        //   148: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   153: pop            
        //   154: goto            84
        //   157: aload           9
        //   159: invokevirtual   aere.close:()V
        //   162: aload           4
        //   164: invokestatic    aesm.c:(Lafrx;)Lafrx;
        //   167: getstatic       afsl.a:Lafsl;
        //   170: invokestatic    afld.l:(Lafrx;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   173: astore          9
        //   175: new             Laepg;
        //   178: astore          4
        //   180: aload           4
        //   182: aload_3        
        //   183: lload           5
        //   185: iconst_1       
        //   186: aconst_null    
        //   187: aconst_null    
        //   188: aconst_null    
        //   189: invokespecial   aepg.<init>:(Lahar;JI[B[B[B)V
        //   192: aload           9
        //   194: aload           4
        //   196: invokestatic    aesm.i:(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Callable;
        //   199: getstatic       afsl.a:Lafsl;
        //   202: invokestatic    afqg.j:(Lcom/google/common/util/concurrent/ListenableFuture;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   205: astore          4
        //   207: aload_3        
        //   208: getfield        ahar.b:Ljava/lang/Object;
        //   211: astore          8
        //   213: new             Ljava/util/HashSet;
        //   216: astore          7
        //   218: aload           7
        //   220: invokespecial   java/util/HashSet.<init>:()V
        //   223: aload_1        
        //   224: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   229: astore_1       
        //   230: aload_1        
        //   231: invokeinterface java/util/Iterator.hasNext:()Z
        //   236: ifeq            328
        //   239: aload_1        
        //   240: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   245: checkcast       Laelg;
        //   248: astore          10
        //   250: iconst_3       
        //   251: anewarray       Lcom/google/common/util/concurrent/ListenableFuture;
        //   254: dup            
        //   255: iconst_0       
        //   256: aload           10
        //   258: getfield        aelg.b:Lcom/google/common/util/concurrent/ListenableFuture;
        //   261: aastore        
        //   262: dup            
        //   263: iconst_1       
        //   264: aload           4
        //   266: aastore        
        //   267: dup            
        //   268: iconst_2       
        //   269: aload           9
        //   271: aastore        
        //   272: invokestatic    afld.s:([Lcom/google/common/util/concurrent/ListenableFuture;)Ladcr;
        //   275: astore          12
        //   277: new             Ladcd;
        //   280: astore          11
        //   282: aload           11
        //   284: aload           10
        //   286: aload           4
        //   288: bipush          18
        //   290: invokespecial   adcd.<init>:(Laelg;Lcom/google/common/util/concurrent/ListenableFuture;I)V
        //   293: aload           12
        //   295: aload           11
        //   297: aload           8
        //   299: invokevirtual   adcr.Q:(Lafrx;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   302: astore          10
        //   304: aload           10
        //   306: ldc             "TikTok Client WorkManager Worker Execution Monitor failed"
        //   308: iconst_0       
        //   309: anewarray       Ljava/lang/Object;
        //   312: invokestatic    aejp.b:(Lcom/google/common/util/concurrent/ListenableFuture;Ljava/lang/String;[Ljava/lang/Object;)V
        //   315: aload           7
        //   317: aload           10
        //   319: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   324: pop            
        //   325: goto            230
        //   328: iconst_2       
        //   329: anewarray       Lcom/google/common/util/concurrent/ListenableFuture;
        //   332: dup            
        //   333: iconst_0       
        //   334: aload           9
        //   336: aastore        
        //   337: dup            
        //   338: iconst_1       
        //   339: aload           7
        //   341: invokestatic    afva.j:(Ljava/lang/Iterable;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   344: invokestatic    afva.n:(Lcom/google/common/util/concurrent/ListenableFuture;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   347: ldc2_w          10
        //   350: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        //   353: aload_3        
        //   354: getfield        ahar.b:Ljava/lang/Object;
        //   357: invokestatic    afva.t:(Lcom/google/common/util/concurrent/ListenableFuture;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   360: invokestatic    afva.n:(Lcom/google/common/util/concurrent/ListenableFuture;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   363: aastore        
        //   364: invokestatic    afld.s:([Lcom/google/common/util/concurrent/ListenableFuture;)Ladcr;
        //   367: astore_1       
        //   368: new             Laeiq;
        //   371: astore_3       
        //   372: aload_3        
        //   373: aload           9
        //   375: iconst_5       
        //   376: invokespecial   aeiq.<init>:(Lcom/google/common/util/concurrent/ListenableFuture;I)V
        //   379: aload_1        
        //   380: aload_3        
        //   381: invokestatic    aesm.c:(Lafrx;)Lafrx;
        //   384: getstatic       afsl.a:Lafsl;
        //   387: invokevirtual   adcr.Q:(Lafrx;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   390: astore_1       
        //   391: aload_2        
        //   392: invokevirtual   aere.close:()V
        //   395: aload_1        
        //   396: areturn        
        //   397: astore_1       
        //   398: aload           9
        //   400: invokevirtual   aere.close:()V
        //   403: goto            436
        //   406: astore_3       
        //   407: ldc             Ljava/lang/Throwable;.class
        //   409: ldc             "addSuppressed"
        //   411: iconst_1       
        //   412: anewarray       Ljava/lang/Class;
        //   415: dup            
        //   416: iconst_0       
        //   417: ldc             Ljava/lang/Throwable;.class
        //   419: aastore        
        //   420: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   423: aload_1        
        //   424: iconst_1       
        //   425: anewarray       Ljava/lang/Object;
        //   428: dup            
        //   429: iconst_0       
        //   430: aload_3        
        //   431: aastore        
        //   432: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   435: pop            
        //   436: aload_1        
        //   437: athrow         
        //   438: astore_1       
        //   439: aload_2        
        //   440: invokevirtual   aere.close:()V
        //   443: goto            476
        //   446: astore_2       
        //   447: ldc             Ljava/lang/Throwable;.class
        //   449: ldc             "addSuppressed"
        //   451: iconst_1       
        //   452: anewarray       Ljava/lang/Class;
        //   455: dup            
        //   456: iconst_0       
        //   457: ldc             Ljava/lang/Throwable;.class
        //   459: aastore        
        //   460: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   463: aload_1        
        //   464: iconst_1       
        //   465: anewarray       Ljava/lang/Object;
        //   468: dup            
        //   469: iconst_0       
        //   470: aload_2        
        //   471: aastore        
        //   472: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   475: pop            
        //   476: goto            481
        //   479: aload_1        
        //   480: athrow         
        //   481: goto            479
        //   484: astore_3       
        //   485: goto            436
        //   488: astore_2       
        //   489: goto            476
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  6      75     438    484    Any
        //  75     84     397    438    Any
        //  84     154    397    438    Any
        //  157    230    438    484    Any
        //  230    325    438    484    Any
        //  328    391    438    484    Any
        //  398    403    406    436    Any
        //  407    436    484    488    Ljava/lang/Exception;
        //  407    436    438    484    Any
        //  436    438    438    484    Any
        //  439    443    446    476    Any
        //  447    476    488    492    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 238, Size: 238
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
    
    public final ListenableFuture b(final WorkerParameters workerParameters) {
        return ((aekn)this.a.a()).b(workerParameters);
    }
}
