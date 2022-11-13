import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agok implements qkg
{
    private static final AtomicBoolean a;
    private final agoj b;
    
    static {
        a = new AtomicBoolean(false);
    }
    
    public agok(final agoj b) {
        this.b = b;
    }
    
    public final void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifeq            7
        //     6: return         
        //     7: getstatic       agok.a:Ljava/util/concurrent/atomic/AtomicBoolean;
        //    10: iconst_1       
        //    11: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.getAndSet:(Z)Z
        //    14: ifne            146
        //    17: ldc             "AndroidLoggerConfig"
        //    19: invokestatic    aeux.o:(Ljava/lang/String;)Laetf;
        //    22: astore_1       
        //    23: aload_0        
        //    24: getfield        agok.b:Lagoj;
        //    27: astore_2       
        //    28: getstatic       afmt.a:Ljava/util/concurrent/atomic/AtomicBoolean;
        //    31: iconst_0       
        //    32: iconst_1       
        //    33: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.compareAndSet:(ZZ)Z
        //    36: ifeq            94
        //    39: getstatic       afmy.a:Ljava/util/concurrent/atomic/AtomicReference;
        //    42: astore_3       
        //    43: aload_3        
        //    44: aconst_null    
        //    45: aload_2        
        //    46: invokevirtual   java/util/concurrent/atomic/AtomicReference.compareAndSet:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    49: ifeq            72
        //    52: invokestatic    afmy.e:()V
        //    55: getstatic       afmz.a:Lafmz;
        //    58: getfield        afmz.b:Ljava/util/concurrent/atomic/AtomicReference;
        //    61: getstatic       afnf.a:Lafnd;
        //    64: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //    67: aload_1        
        //    68: invokevirtual   aetf.close:()V
        //    71: return         
        //    72: aload_3        
        //    73: invokevirtual   java/util/concurrent/atomic/AtomicReference.get:()Ljava/lang/Object;
        //    76: ifnonnull       82
        //    79: goto            43
        //    82: new             Ljava/lang/IllegalStateException;
        //    85: astore_2       
        //    86: aload_2        
        //    87: ldc             "Logger backends can only be configured once."
        //    89: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    92: aload_2        
        //    93: athrow         
        //    94: new             Ljava/lang/IllegalStateException;
        //    97: astore_2       
        //    98: aload_2        
        //    99: ldc             "Logger backend configuration may only occur once."
        //   101: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   104: aload_2        
        //   105: athrow         
        //   106: astore_2       
        //   107: aload_1        
        //   108: invokevirtual   aetf.close:()V
        //   111: goto            144
        //   114: astore_1       
        //   115: ldc             Ljava/lang/Throwable;.class
        //   117: ldc             "addSuppressed"
        //   119: iconst_1       
        //   120: anewarray       Ljava/lang/Class;
        //   123: dup            
        //   124: iconst_0       
        //   125: ldc             Ljava/lang/Throwable;.class
        //   127: aastore        
        //   128: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   131: aload_2        
        //   132: iconst_1       
        //   133: anewarray       Ljava/lang/Object;
        //   136: dup            
        //   137: iconst_0       
        //   138: aload_1        
        //   139: aastore        
        //   140: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   143: pop            
        //   144: aload_2        
        //   145: athrow         
        //   146: return         
        //   147: astore_1       
        //   148: goto            144
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  23     43     106    146    Any
        //  43     67     106    146    Any
        //  72     79     106    146    Any
        //  82     94     106    146    Any
        //  94     106    106    146    Any
        //  107    111    114    144    Any
        //  115    144    147    151    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0144:
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
