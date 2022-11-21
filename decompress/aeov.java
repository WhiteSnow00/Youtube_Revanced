import com.google.common.util.concurrent.ListenableFuture;
import androidx.work.WorkerParameters;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeov implements aeoh
{
    public final atnb a;
    private final ahei b;
    
    public aeov(final atnb a, final ahei b, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
    }
    
    public final ListenableFuture a(final WorkerParameters p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    aewp.o:(Ljava/lang/String;)Laeux;
        //     5: astore          4
        //     7: aload_0        
        //     8: getfield        aeov.b:Lahei;
        //    11: astore          5
        //    13: new             Laeou;
        //    16: astore          6
        //    18: aload           6
        //    20: aload_0        
        //    21: aload           4
        //    23: aload_1        
        //    24: iconst_0       
        //    25: invokespecial   aeou.<init>:(Laeov;Laeux;Landroidx/work/WorkerParameters;I)V
        //    28: aload           5
        //    30: getfield        ahei.c:Ljava/lang/Object;
        //    33: invokeinterface oco.d:()J
        //    38: lstore_2       
        //    39: aload           5
        //    41: getfield        ahei.d:Ljava/lang/Object;
        //    44: checkcast       Laron;
        //    47: getfield        aron.a:Ljava/lang/Object;
        //    50: checkcast       Ljava/util/Collection;
        //    53: invokestatic    afhk.p:(Ljava/util/Collection;)Lafhk;
        //    56: astore          9
        //    58: aload           5
        //    60: getfield        ahei.a:Ljava/lang/Object;
        //    63: astore          8
        //    65: new             Ljava/util/HashSet;
        //    68: astore_1       
        //    69: aload_1        
        //    70: invokespecial   java/util/HashSet.<init>:()V
        //    73: ldc             "Reporting Tiktok worker start"
        //    75: invokestatic    aewp.o:(Ljava/lang/String;)Laeux;
        //    78: astore          7
        //    80: aload           9
        //    82: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    87: astore          10
        //    89: aload           10
        //    91: invokeinterface java/util/Iterator.hasNext:()Z
        //    96: ifeq            162
        //    99: aload           10
        //   101: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   106: checkcast       Laeoi;
        //   109: astore          9
        //   111: new             Laeml;
        //   114: astore          11
        //   116: aload           11
        //   118: aload           9
        //   120: iconst_4       
        //   121: invokespecial   aeml.<init>:(Laeoi;I)V
        //   124: aload           11
        //   126: invokestatic    aewf.c:(Lafvp;)Lafvp;
        //   129: aload           8
        //   131: invokestatic    agra.W:(Lafvp;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   134: astore          11
        //   136: new             Laeoz;
        //   139: astore          12
        //   141: aload           12
        //   143: aload           9
        //   145: aload           11
        //   147: invokespecial   aeoz.<init>:(Laeoi;Lcom/google/common/util/concurrent/ListenableFuture;)V
        //   150: aload_1        
        //   151: aload           12
        //   153: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   158: pop            
        //   159: goto            89
        //   162: aload           7
        //   164: invokevirtual   aeux.close:()V
        //   167: aload           6
        //   169: invokestatic    aewf.c:(Lafvp;)Lafvp;
        //   172: getstatic       afwd.a:Lafwd;
        //   175: invokestatic    agra.W:(Lafvp;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   178: astore          6
        //   180: new             Laesz;
        //   183: astore          7
        //   185: aload           7
        //   187: aload           5
        //   189: lload_2        
        //   190: iconst_1       
        //   191: aconst_null    
        //   192: aconst_null    
        //   193: invokespecial   aesz.<init>:(Lahei;JI[B[B)V
        //   196: aload           6
        //   198: aload           7
        //   200: invokestatic    aewf.i:(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Callable;
        //   203: getstatic       afwd.a:Lafwd;
        //   206: invokestatic    aftz.u:(Lcom/google/common/util/concurrent/ListenableFuture;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   209: astore          9
        //   211: aload           5
        //   213: getfield        ahei.a:Ljava/lang/Object;
        //   216: astore          7
        //   218: new             Ljava/util/HashSet;
        //   221: astore          8
        //   223: aload           8
        //   225: invokespecial   java/util/HashSet.<init>:()V
        //   228: aload_1        
        //   229: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   234: astore_1       
        //   235: aload_1        
        //   236: invokeinterface java/util/Iterator.hasNext:()Z
        //   241: ifeq            333
        //   244: aload_1        
        //   245: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   250: checkcast       Laeoz;
        //   253: astore          12
        //   255: iconst_3       
        //   256: anewarray       Lcom/google/common/util/concurrent/ListenableFuture;
        //   259: dup            
        //   260: iconst_0       
        //   261: aload           12
        //   263: getfield        aeoz.b:Lcom/google/common/util/concurrent/ListenableFuture;
        //   266: aastore        
        //   267: dup            
        //   268: iconst_1       
        //   269: aload           9
        //   271: aastore        
        //   272: dup            
        //   273: iconst_2       
        //   274: aload           6
        //   276: aastore        
        //   277: invokestatic    agra.ae:([Lcom/google/common/util/concurrent/ListenableFuture;)Ladgg;
        //   280: astore          11
        //   282: new             Ladfs;
        //   285: astore          10
        //   287: aload           10
        //   289: aload           12
        //   291: aload           9
        //   293: bipush          17
        //   295: invokespecial   adfs.<init>:(Laeoz;Lcom/google/common/util/concurrent/ListenableFuture;I)V
        //   298: aload           11
        //   300: aload           10
        //   302: aload           7
        //   304: invokevirtual   adgg.N:(Lafvp;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   307: astore          10
        //   309: aload           10
        //   311: ldc             "TikTok Client WorkManager Worker Execution Monitor failed"
        //   313: iconst_0       
        //   314: anewarray       Ljava/lang/Object;
        //   317: invokestatic    aenj.b:(Lcom/google/common/util/concurrent/ListenableFuture;Ljava/lang/String;[Ljava/lang/Object;)V
        //   320: aload           8
        //   322: aload           10
        //   324: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   329: pop            
        //   330: goto            235
        //   333: iconst_2       
        //   334: anewarray       Lcom/google/common/util/concurrent/ListenableFuture;
        //   337: dup            
        //   338: iconst_0       
        //   339: aload           6
        //   341: aastore        
        //   342: dup            
        //   343: iconst_1       
        //   344: aload           8
        //   346: invokestatic    afxr.i:(Ljava/lang/Iterable;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   349: invokestatic    afxr.m:(Lcom/google/common/util/concurrent/ListenableFuture;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   352: ldc2_w          10
        //   355: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        //   358: aload           5
        //   360: getfield        ahei.a:Ljava/lang/Object;
        //   363: invokestatic    afxr.s:(Lcom/google/common/util/concurrent/ListenableFuture;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   366: invokestatic    afxr.m:(Lcom/google/common/util/concurrent/ListenableFuture;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   369: aastore        
        //   370: invokestatic    agra.ae:([Lcom/google/common/util/concurrent/ListenableFuture;)Ladgg;
        //   373: astore_1       
        //   374: new             Laeml;
        //   377: astore          5
        //   379: aload           5
        //   381: aload           6
        //   383: iconst_5       
        //   384: invokespecial   aeml.<init>:(Lcom/google/common/util/concurrent/ListenableFuture;I)V
        //   387: aload_1        
        //   388: aload           5
        //   390: invokestatic    aewf.c:(Lafvp;)Lafvp;
        //   393: getstatic       afwd.a:Lafwd;
        //   396: invokevirtual   adgg.N:(Lafvp;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   399: astore_1       
        //   400: aload           4
        //   402: invokevirtual   aeux.close:()V
        //   405: aload_1        
        //   406: areturn        
        //   407: astore_1       
        //   408: aload           7
        //   410: invokevirtual   aeux.close:()V
        //   413: goto            448
        //   416: astore          5
        //   418: ldc             Ljava/lang/Throwable;.class
        //   420: ldc             "addSuppressed"
        //   422: iconst_1       
        //   423: anewarray       Ljava/lang/Class;
        //   426: dup            
        //   427: iconst_0       
        //   428: ldc             Ljava/lang/Throwable;.class
        //   430: aastore        
        //   431: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   434: aload_1        
        //   435: iconst_1       
        //   436: anewarray       Ljava/lang/Object;
        //   439: dup            
        //   440: iconst_0       
        //   441: aload           5
        //   443: aastore        
        //   444: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   447: pop            
        //   448: aload_1        
        //   449: athrow         
        //   450: astore_1       
        //   451: aload           4
        //   453: invokevirtual   aeux.close:()V
        //   456: goto            491
        //   459: astore          4
        //   461: ldc             Ljava/lang/Throwable;.class
        //   463: ldc             "addSuppressed"
        //   465: iconst_1       
        //   466: anewarray       Ljava/lang/Class;
        //   469: dup            
        //   470: iconst_0       
        //   471: ldc             Ljava/lang/Throwable;.class
        //   473: aastore        
        //   474: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   477: aload_1        
        //   478: iconst_1       
        //   479: anewarray       Ljava/lang/Object;
        //   482: dup            
        //   483: iconst_0       
        //   484: aload           4
        //   486: aastore        
        //   487: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   490: pop            
        //   491: goto            496
        //   494: aload_1        
        //   495: athrow         
        //   496: goto            494
        //   499: astore          5
        //   501: goto            448
        //   504: astore          4
        //   506: goto            491
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  7      80     450    499    Any
        //  80     89     407    450    Any
        //  89     159    407    450    Any
        //  162    235    450    499    Any
        //  235    330    450    499    Any
        //  333    400    450    499    Any
        //  408    413    416    448    Any
        //  418    448    499    504    Ljava/lang/Exception;
        //  418    448    450    499    Any
        //  448    450    450    499    Any
        //  451    456    459    491    Any
        //  461    491    504    509    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 237, Size: 237
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
        return ((aeoh)this.a.a()).b(workerParameters);
    }
}
