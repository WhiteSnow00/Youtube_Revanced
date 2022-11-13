import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import com.facebook.litho.ComponentTree;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dti
{
    public final dsx a;
    public final dst b;
    public final int c;
    public final int d;
    public final boolean e;
    public final AtomicInteger f;
    public final boolean g;
    public volatile boolean h;
    public final int i;
    public final String j;
    public volatile boolean k;
    public final ComponentTree l;
    public final cya m;
    private final AtomicInteger n;
    private final RunnableFuture o;
    private volatile Object p;
    private volatile Object q;
    
    public dti(final ComponentTree l, final dsx a, final dst b, final int c, final int d, final boolean e, final cya m, final int i, final String j, final byte[] array, final byte[] array2, final byte[] array3) {
        this.l = l;
        this.n = new AtomicInteger(-1);
        this.f = new AtomicInteger(0);
        this.k = false;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.m = m;
        this.g = ComponentTree.r(i);
        this.i = i;
        this.j = j;
        final FutureTask o = new FutureTask((Callable<V>)new ctz(this, 3));
        final dus b2 = bku.b;
        this.o = o;
    }
    
    public final dvf a(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        dti.n:Ljava/util/concurrent/atomic/AtomicInteger;
        //     4: iconst_m1      
        //     5: invokestatic    android/os/Process.myTid:()I
        //     8: invokevirtual   java/util/concurrent/atomic/AtomicInteger.compareAndSet:(II)Z
        //    11: ifeq            23
        //    14: aload_0        
        //    15: getfield        dti.o:Ljava/util/concurrent/RunnableFuture;
        //    18: invokeinterface java/util/concurrent/RunnableFuture.run:()V
        //    23: aload_0        
        //    24: getfield        dti.n:Ljava/util/concurrent/atomic/AtomicInteger;
        //    27: invokevirtual   java/util/concurrent/atomic/AtomicInteger.get:()I
        //    30: istore          5
        //    32: invokestatic    android/os/Process.myTid:()I
        //    35: istore_2       
        //    36: aload_0        
        //    37: getfield        dti.o:Ljava/util/concurrent/RunnableFuture;
        //    40: invokeinterface java/util/concurrent/RunnableFuture.isDone:()Z
        //    45: istore          6
        //    47: iconst_0       
        //    48: istore_3       
        //    49: iload           6
        //    51: ifne            65
        //    54: iload           5
        //    56: iload_2        
        //    57: if_icmpeq       65
        //    60: iconst_1       
        //    61: istore_2       
        //    62: goto            67
        //    65: iconst_0       
        //    66: istore_2       
        //    67: aload_0        
        //    68: getfield        dti.g:Z
        //    71: istore          6
        //    73: aconst_null    
        //    74: astore          8
        //    76: aconst_null    
        //    77: astore          9
        //    79: iload_2        
        //    80: ifeq            101
        //    83: invokestatic    bkw.f:()Z
        //    86: ifne            101
        //    89: iload_1        
        //    90: invokestatic    com/facebook/litho/ComponentTree.r:(I)Z
        //    93: ifeq            99
        //    96: goto            101
        //    99: aconst_null    
        //   100: areturn        
        //   101: invokestatic    bkw.f:()Z
        //   104: ifeq            192
        //   107: iload_2        
        //   108: ifeq            192
        //   111: aload_0        
        //   112: getfield        dti.l:Lcom/facebook/litho/ComponentTree;
        //   115: getfield        com/facebook/litho/ComponentTree.z:Z
        //   118: ifeq            141
        //   121: iload           6
        //   123: ifne            141
        //   126: aload_0        
        //   127: iconst_1       
        //   128: putfield        dti.h:Z
        //   131: getstatic       bkw.a:Ldxr;
        //   134: astore          7
        //   136: aload_0        
        //   137: aconst_null    
        //   138: putfield        dti.p:Ljava/lang/Object;
        //   141: iload           5
        //   143: invokestatic    android/os/Process.getThreadPriority:(I)I
        //   146: istore          4
        //   148: bipush          -4
        //   150: istore_2       
        //   151: iconst_0       
        //   152: istore_1       
        //   153: iload_1        
        //   154: ifne            182
        //   157: iload_2        
        //   158: iload           4
        //   160: if_icmpge       182
        //   163: iload           5
        //   165: iload_2        
        //   166: invokestatic    android/os/Process.setThreadPriority:(II)V
        //   169: iconst_1       
        //   170: istore_1       
        //   171: goto            153
        //   174: astore          7
        //   176: iinc            2, 1
        //   179: goto            153
        //   182: iload           4
        //   184: istore_2       
        //   185: iconst_1       
        //   186: istore_1       
        //   187: goto            196
        //   190: astore          7
        //   192: iconst_0       
        //   193: istore_1       
        //   194: iload_3        
        //   195: istore_2       
        //   196: aload_0        
        //   197: getfield        dti.l:Lcom/facebook/litho/ComponentTree;
        //   200: invokevirtual   com/facebook/litho/ComponentTree.x:()Lmsr;
        //   203: astore          10
        //   205: aload           10
        //   207: ifnull          267
        //   210: aload           9
        //   212: astore          7
        //   214: aload_0        
        //   215: getfield        dti.l:Lcom/facebook/litho/ComponentTree;
        //   218: getfield        com/facebook/litho/ComponentTree.g:Ldsx;
        //   221: astore          11
        //   223: aload           9
        //   225: astore          7
        //   227: aload           11
        //   229: aload           10
        //   231: aload           10
        //   233: aload           11
        //   235: bipush          21
        //   237: invokevirtual   msr.r:(Ldsx;I)Ldwk;
        //   240: invokestatic    bkv.e:(Ldsx;Lmsr;Ldwk;)Ldwk;
        //   243: astore          9
        //   245: aload           9
        //   247: astore          7
        //   249: goto            270
        //   252: astore          8
        //   254: goto            569
        //   257: astore          9
        //   259: goto            504
        //   262: astore          9
        //   264: goto            504
        //   267: aconst_null    
        //   268: astore          7
        //   270: aload_0        
        //   271: getfield        dti.o:Ljava/util/concurrent/RunnableFuture;
        //   274: invokestatic    afwm.a:(Ljava/util/concurrent/Future;)Ljava/lang/Object;
        //   277: checkcast       Ldvf;
        //   280: astore          9
        //   282: aload           7
        //   284: ifnull          296
        //   287: aload           7
        //   289: ldc             "FUTURE_TASK_END"
        //   291: invokeinterface dwk.b:(Ljava/lang/String;)V
        //   296: iload_1        
        //   297: ifeq            306
        //   300: iload           5
        //   302: iload_2        
        //   303: invokestatic    android/os/Process.setThreadPriority:(II)V
        //   306: aload           9
        //   308: astore          8
        //   310: aload_0        
        //   311: getfield        dti.h:Z
        //   314: ifeq            442
        //   317: aload           9
        //   319: astore          8
        //   321: aload           9
        //   323: getfield        dvf.z:Z
        //   326: ifeq            442
        //   329: invokestatic    bkw.f:()Z
        //   332: ifeq            424
        //   335: getstatic       bkw.a:Ldxr;
        //   338: astore          8
        //   340: aload_0        
        //   341: aconst_null    
        //   342: putfield        dti.q:Ljava/lang/Object;
        //   345: aload_0        
        //   346: getfield        dti.k:Z
        //   349: ifeq            358
        //   352: aconst_null    
        //   353: astore          8
        //   355: goto            389
        //   358: aload_0        
        //   359: getfield        dti.i:I
        //   362: aload           9
        //   364: invokestatic    dvf.n:(ILdvf;)V
        //   367: aload_0        
        //   368: monitorenter   
        //   369: iconst_1       
        //   370: aload_0        
        //   371: getfield        dti.k:Z
        //   374: if_icmpeq       384
        //   377: aload           9
        //   379: astore          8
        //   381: goto            387
        //   384: aconst_null    
        //   385: astore          8
        //   387: aload_0        
        //   388: monitorexit    
        //   389: getstatic       bkw.a:Ldxr;
        //   392: astore          9
        //   394: goto            442
        //   397: astore          8
        //   399: aload_0        
        //   400: monitorexit    
        //   401: aload           8
        //   403: athrow         
        //   404: astore          8
        //   406: getstatic       bkw.a:Ldxr;
        //   409: astore          9
        //   411: aload           8
        //   413: athrow         
        //   414: astore          9
        //   416: getstatic       bkw.a:Ldxr;
        //   419: astore          8
        //   421: aload           9
        //   423: athrow         
        //   424: getstatic       bkw.a:Ldxr;
        //   427: astore          8
        //   429: aload_0        
        //   430: aconst_null    
        //   431: putfield        dti.q:Ljava/lang/Object;
        //   434: aload_0        
        //   435: aconst_null    
        //   436: putfield        dti.p:Ljava/lang/Object;
        //   439: aconst_null    
        //   440: astore          8
        //   442: aload           7
        //   444: ifnull          456
        //   447: invokestatic    bkw.f:()Z
        //   450: pop            
        //   451: aload           7
        //   453: invokestatic    msr.u:(Ldwk;)V
        //   456: aload           8
        //   458: ifnonnull       463
        //   461: aconst_null    
        //   462: areturn        
        //   463: aload_0        
        //   464: monitorenter   
        //   465: aload_0        
        //   466: getfield        dti.k:Z
        //   469: ifeq            476
        //   472: aload_0        
        //   473: monitorexit    
        //   474: aconst_null    
        //   475: areturn        
        //   476: aload_0        
        //   477: monitorexit    
        //   478: aload           8
        //   480: areturn        
        //   481: astore          7
        //   483: aload_0        
        //   484: monitorexit    
        //   485: aload           7
        //   487: athrow         
        //   488: astore          8
        //   490: goto            569
        //   493: astore          9
        //   495: goto            500
        //   498: astore          9
        //   500: aload           7
        //   502: astore          8
        //   504: aload           8
        //   506: astore          7
        //   508: aload           9
        //   510: invokevirtual   java/lang/Exception.getCause:()Ljava/lang/Throwable;
        //   513: astore          10
        //   515: aload           8
        //   517: astore          7
        //   519: aload           10
        //   521: instanceof      Ljava/lang/RuntimeException;
        //   524: ifeq            537
        //   527: aload           8
        //   529: astore          7
        //   531: aload           10
        //   533: checkcast       Ljava/lang/RuntimeException;
        //   536: athrow         
        //   537: aload           8
        //   539: astore          7
        //   541: new             Ljava/lang/RuntimeException;
        //   544: astore          10
        //   546: aload           8
        //   548: astore          7
        //   550: aload           10
        //   552: aload           9
        //   554: invokevirtual   java/lang/Exception.getMessage:()Ljava/lang/String;
        //   557: aload           9
        //   559: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   562: aload           8
        //   564: astore          7
        //   566: aload           10
        //   568: athrow         
        //   569: aload           7
        //   571: ifnull          583
        //   574: invokestatic    bkw.f:()Z
        //   577: pop            
        //   578: aload           7
        //   580: invokestatic    msr.u:(Ldwk;)V
        //   583: goto            589
        //   586: aload           8
        //   588: athrow         
        //   589: goto            586
        //   592: astore          8
        //   594: goto            306
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                        
        //  -----  -----  -----  -----  --------------------------------------------
        //  141    148    190    192    Ljava/lang/RuntimeException;
        //  163    169    174    182    Ljava/lang/SecurityException;
        //  163    169    190    192    Ljava/lang/RuntimeException;
        //  214    223    262    267    Ljava/util/concurrent/ExecutionException;
        //  214    223    257    262    Ljava/util/concurrent/CancellationException;
        //  214    223    252    257    Any
        //  227    245    262    267    Ljava/util/concurrent/ExecutionException;
        //  227    245    257    262    Ljava/util/concurrent/CancellationException;
        //  227    245    252    257    Any
        //  270    282    498    500    Ljava/util/concurrent/ExecutionException;
        //  270    282    493    498    Ljava/util/concurrent/CancellationException;
        //  270    282    488    493    Any
        //  287    296    498    500    Ljava/util/concurrent/ExecutionException;
        //  287    296    493    498    Ljava/util/concurrent/CancellationException;
        //  287    296    488    493    Any
        //  300    306    592    597    Ljava/lang/IllegalArgumentException;
        //  300    306    592    597    Ljava/lang/SecurityException;
        //  300    306    498    500    Ljava/util/concurrent/ExecutionException;
        //  300    306    493    498    Ljava/util/concurrent/CancellationException;
        //  300    306    488    493    Any
        //  310    317    498    500    Ljava/util/concurrent/ExecutionException;
        //  310    317    493    498    Ljava/util/concurrent/CancellationException;
        //  310    317    488    493    Any
        //  321    345    498    500    Ljava/util/concurrent/ExecutionException;
        //  321    345    493    498    Ljava/util/concurrent/CancellationException;
        //  321    345    488    493    Any
        //  345    352    404    424    Any
        //  358    369    404    424    Any
        //  369    377    397    404    Any
        //  387    389    397    404    Any
        //  389    394    498    500    Ljava/util/concurrent/ExecutionException;
        //  389    394    493    498    Ljava/util/concurrent/CancellationException;
        //  389    394    488    493    Any
        //  399    401    397    404    Any
        //  401    404    404    424    Any
        //  406    414    414    424    Any
        //  416    424    498    500    Ljava/util/concurrent/ExecutionException;
        //  416    424    493    498    Ljava/util/concurrent/CancellationException;
        //  416    424    488    493    Any
        //  424    439    498    500    Ljava/util/concurrent/ExecutionException;
        //  424    439    493    498    Ljava/util/concurrent/CancellationException;
        //  424    439    488    493    Any
        //  465    474    481    488    Any
        //  476    478    481    488    Any
        //  483    485    481    488    Any
        //  508    515    252    257    Any
        //  519    527    252    257    Any
        //  531    537    252    257    Any
        //  541    546    252    257    Any
        //  550    562    252    257    Any
        //  566    569    252    257    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0306:
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
    
    public final void b() {
        synchronized (this) {
            if (this.k) {
                return;
            }
            this.q = null;
            this.p = null;
            this.k = true;
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final dti dti = (dti)o;
            return this.c == dti.c && this.d == dti.d && this.a.equals(dti.a) && this.b.j == dti.b.j;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() * 31 + this.b.j) * 31 + this.c) * 31 + this.d;
    }
}
