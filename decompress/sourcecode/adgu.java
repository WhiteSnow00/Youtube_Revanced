import com.google.protobuf.MessageLite;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adgu implements UncaughtExceptionHandler
{
    public static final AtomicBoolean a;
    public boolean b;
    private final adgw c;
    private final atjj d;
    private UncaughtExceptionHandler e;
    
    static {
        a = new AtomicBoolean(false);
    }
    
    public adgu(final adgw c, final atjj d) {
        this.c = c;
        this.d = d;
        this.b = false;
    }
    
    public final void a() {
        if (!adgu.a.getAndSet(true)) {
            this.e = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)this);
        }
    }
    
    public final void b(final atjj p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        adgu.c:Ladgw;
        //     4: getstatic       adgy.b:Ladgy;
        //     7: iconst_0       
        //     8: invokestatic    adio.q:(Ladgw;Ladgy;Z)Ljava/util/List;
        //    11: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    16: astore_2       
        //    17: aload_2        
        //    18: invokeinterface java/util/Iterator.hasNext:()Z
        //    23: ifeq            263
        //    26: aload_2        
        //    27: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    32: checkcast       Ljava/io/File;
        //    35: astore_3       
        //    36: new             Ljava/io/FileInputStream;
        //    39: astore          4
        //    41: aload           4
        //    43: aload_3        
        //    44: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    47: invokestatic    com/google/protobuf/ExtensionRegistryLite.getGeneratedRegistry:()Lcom/google/protobuf/ExtensionRegistryLite;
        //    50: astore          5
        //    52: getstatic       ahst.a:Lahst;
        //    55: aload           4
        //    57: aload           5
        //    59: invokestatic    agzi.parseFrom:(Lagzi;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lagzi;
        //    62: checkcast       Lahst;
        //    65: astore          5
        //    67: aload           4
        //    69: invokevirtual   java/io/InputStream.close:()V
        //    72: goto            144
        //    75: astore          5
        //    77: aload           4
        //    79: invokevirtual   java/io/InputStream.close:()V
        //    82: goto            118
        //    85: astore          4
        //    87: ldc             Ljava/lang/Throwable;.class
        //    89: ldc             "addSuppressed"
        //    91: iconst_1       
        //    92: anewarray       Ljava/lang/Class;
        //    95: dup            
        //    96: iconst_0       
        //    97: ldc             Ljava/lang/Throwable;.class
        //    99: aastore        
        //   100: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   103: aload           5
        //   105: iconst_1       
        //   106: anewarray       Ljava/lang/Object;
        //   109: dup            
        //   110: iconst_0       
        //   111: aload           4
        //   113: aastore        
        //   114: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   117: pop            
        //   118: aload           5
        //   120: athrow         
        //   121: astore          5
        //   123: ldc             "JavaCrashJournalV2 !read '%s'"
        //   125: iconst_1       
        //   126: anewarray       Ljava/lang/Object;
        //   129: dup            
        //   130: iconst_0       
        //   131: aload_3        
        //   132: aastore        
        //   133: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   136: aload           5
        //   138: invokestatic    adio.n:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   141: aconst_null    
        //   142: astore          5
        //   144: aload           5
        //   146: ifnull          256
        //   149: aload           5
        //   151: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   154: pop            
        //   155: invokestatic    aklq.d:()Laklo;
        //   158: astore          4
        //   160: aload           4
        //   162: invokevirtual   agza.copyOnWrite:()V
        //   165: aload           4
        //   167: getfield        aklo.instance:Lagzi;
        //   170: checkcast       Laklq;
        //   173: aload           5
        //   175: invokestatic    aklq.ae:(Laklq;Lahst;)V
        //   178: aload           4
        //   180: invokevirtual   agza.build:()Lagzi;
        //   183: checkcast       Laklq;
        //   186: astore          6
        //   188: aload           5
        //   190: getfield        ahst.e:Laooh;
        //   193: astore          4
        //   195: aload           4
        //   197: astore          5
        //   199: aload           4
        //   201: ifnonnull       209
        //   204: getstatic       aooh.a:Laooh;
        //   207: astore          5
        //   209: aload           5
        //   211: getfield        aooh.g:Laoob;
        //   214: astore          4
        //   216: aload           4
        //   218: astore          5
        //   220: aload           4
        //   222: ifnonnull       230
        //   225: getstatic       aoob.a:Laoob;
        //   228: astore          5
        //   230: aload           5
        //   232: getfield        aoob.e:J
        //   235: lstore          7
        //   237: aload_1        
        //   238: invokeinterface atjj.a:()Ljava/lang/Object;
        //   243: checkcast       Lwvu;
        //   246: aload           6
        //   248: lload           7
        //   250: invokeinterface wvu.e:(Laklq;J)Z
        //   255: pop            
        //   256: aload_3        
        //   257: invokestatic    adio.m:(Ljava/io/File;)V
        //   260: goto            17
        //   263: return         
        //   264: astore          4
        //   266: goto            118
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  36     47     121    144    Ljava/lang/Exception;
        //  47     67     75     121    Any
        //  67     72     121    144    Ljava/lang/Exception;
        //  77     82     85     118    Any
        //  87     118    264    269    Ljava/lang/Exception;
        //  118    121    121    144    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0118:
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
    public final void uncaughtException(final Thread thread, final Throwable t) {
        try {
            final arud arud = (arud)this.d.a();
            adio.p((adgw)arud.a, (MessageLite)arud.d(thread.getName(), t, arud.e(t)), adgy.b, this.b);
            final UncaughtExceptionHandler e = this.e;
            if (e != null) {
                e.uncaughtException(thread, t);
            }
        }
        catch (final Exception ex) {
            final UncaughtExceptionHandler e2 = this.e;
            if (e2 != null) {
                e2.uncaughtException(thread, t);
            }
        }
        finally {
            final UncaughtExceptionHandler e3 = this.e;
            if (e3 != null) {
                e3.uncaughtException(thread, t);
            }
        }
    }
}
