import com.google.protobuf.MessageLite;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adix implements UncaughtExceptionHandler
{
    public static final AtomicBoolean a;
    public boolean b;
    private final adiz c;
    private final atke d;
    private UncaughtExceptionHandler e;
    
    static {
        a = new AtomicBoolean(false);
    }
    
    public adix(final adiz c, final atke d) {
        this.c = c;
        this.d = d;
        this.b = false;
    }
    
    public final void a() {
        if (!adix.a.getAndSet(true)) {
            this.e = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)this);
        }
    }
    
    public final void b(final atke p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        adix.c:Ladiz;
        //     4: getstatic       adjb.b:Ladjb;
        //     7: iconst_0       
        //     8: invokestatic    adkp.v:(Ladiz;Ladjb;Z)Ljava/util/List;
        //    11: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    16: astore          7
        //    18: aload           7
        //    20: invokeinterface java/util/Iterator.hasNext:()Z
        //    25: ifeq            268
        //    28: aload           7
        //    30: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    35: checkcast       Ljava/io/File;
        //    38: astore          6
        //    40: new             Ljava/io/FileInputStream;
        //    43: astore          5
        //    45: aload           5
        //    47: aload           6
        //    49: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    52: invokestatic    com/google/protobuf/ExtensionRegistryLite.getGeneratedRegistry:()Lcom/google/protobuf/ExtensionRegistryLite;
        //    55: astore          4
        //    57: getstatic       ahur.a:Lahur;
        //    60: aload           5
        //    62: aload           4
        //    64: invokestatic    ahbh.parseFrom:(Lahbh;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lahbh;
        //    67: checkcast       Lahur;
        //    70: astore          4
        //    72: aload           5
        //    74: invokevirtual   java/io/InputStream.close:()V
        //    77: goto            150
        //    80: astore          4
        //    82: aload           5
        //    84: invokevirtual   java/io/InputStream.close:()V
        //    87: goto            123
        //    90: astore          5
        //    92: ldc             Ljava/lang/Throwable;.class
        //    94: ldc             "addSuppressed"
        //    96: iconst_1       
        //    97: anewarray       Ljava/lang/Class;
        //   100: dup            
        //   101: iconst_0       
        //   102: ldc             Ljava/lang/Throwable;.class
        //   104: aastore        
        //   105: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   108: aload           4
        //   110: iconst_1       
        //   111: anewarray       Ljava/lang/Object;
        //   114: dup            
        //   115: iconst_0       
        //   116: aload           5
        //   118: aastore        
        //   119: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   122: pop            
        //   123: aload           4
        //   125: athrow         
        //   126: astore          4
        //   128: ldc             "JavaCrashJournalV2 !read '%s'"
        //   130: iconst_1       
        //   131: anewarray       Ljava/lang/Object;
        //   134: dup            
        //   135: iconst_0       
        //   136: aload           6
        //   138: aastore        
        //   139: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   142: aload           4
        //   144: invokestatic    adkp.s:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   147: aconst_null    
        //   148: astore          4
        //   150: aload           4
        //   152: ifnull          260
        //   155: aload           4
        //   157: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   160: pop            
        //   161: invokestatic    aknt.d:()Laknr;
        //   164: astore          5
        //   166: aload           5
        //   168: invokevirtual   ahaz.copyOnWrite:()V
        //   171: aload           5
        //   173: getfield        aknr.instance:Lahbh;
        //   176: checkcast       Laknt;
        //   179: aload           4
        //   181: invokestatic    aknt.af:(Laknt;Lahur;)V
        //   184: aload           5
        //   186: invokevirtual   ahaz.build:()Lahbh;
        //   189: checkcast       Laknt;
        //   192: astore          8
        //   194: aload           4
        //   196: getfield        ahur.e:Laoqk;
        //   199: astore          5
        //   201: aload           5
        //   203: astore          4
        //   205: aload           5
        //   207: ifnonnull       215
        //   210: getstatic       aoqk.a:Laoqk;
        //   213: astore          4
        //   215: aload           4
        //   217: getfield        aoqk.g:Laoqe;
        //   220: astore          5
        //   222: aload           5
        //   224: astore          4
        //   226: aload           5
        //   228: ifnonnull       236
        //   231: getstatic       aoqe.a:Laoqe;
        //   234: astore          4
        //   236: aload           4
        //   238: getfield        aoqe.e:J
        //   241: lstore_2       
        //   242: aload_1        
        //   243: invokeinterface atke.a:()Ljava/lang/Object;
        //   248: checkcast       Lwxx;
        //   251: aload           8
        //   253: lload_2        
        //   254: invokeinterface wxx.e:(Laknt;J)Z
        //   259: pop            
        //   260: aload           6
        //   262: invokestatic    adkp.r:(Ljava/io/File;)V
        //   265: goto            18
        //   268: return         
        //   269: astore          5
        //   271: goto            123
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  40     52     126    150    Ljava/lang/Exception;
        //  52     72     80     126    Any
        //  72     77     126    150    Ljava/lang/Exception;
        //  82     87     90     123    Any
        //  92     123    269    274    Ljava/lang/Exception;
        //  123    126    126    150    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0123:
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
            final arwh arwh = (arwh)this.d.a();
            adkp.u((adiz)arwh.a, (MessageLite)arwh.d(thread.getName(), t, arwh.e(t)), adjb.b, this.b);
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
