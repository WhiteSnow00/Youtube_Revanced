// 
// Decompiled by Procyon v0.6.0
// 

public final class aetq implements aevl
{
    public final aevl a;
    public final aevl b;
    private final int c;
    
    public aetq(final aevl a, final aevl b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void close() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        aetq.c:I
        //     4: istore_1       
        //     5: iload_1        
        //     6: ifeq            105
        //     9: iload_1        
        //    10: iconst_1       
        //    11: if_icmpeq       40
        //    14: aload_0        
        //    15: getfield        aetq.a:Laevl;
        //    18: astore_3       
        //    19: aload_0        
        //    20: getfield        aetq.b:Laevl;
        //    23: astore_2       
        //    24: aload_3        
        //    25: invokeinterface aevl.close:()V
        //    30: aload_2        
        //    31: invokeinterface aevl.close:()V
        //    36: invokestatic    aewp.k:()V
        //    39: return         
        //    40: aload_0        
        //    41: getfield        aetq.a:Laevl;
        //    44: astore_3       
        //    45: aload_0        
        //    46: getfield        aetq.b:Laevl;
        //    49: astore_2       
        //    50: aload_2        
        //    51: invokeinterface aevl.close:()V
        //    56: aload_3        
        //    57: invokeinterface aevl.close:()V
        //    62: return         
        //    63: astore_2       
        //    64: aload_3        
        //    65: invokeinterface aevl.close:()V
        //    70: goto            103
        //    73: astore_3       
        //    74: ldc             Ljava/lang/Throwable;.class
        //    76: ldc             "addSuppressed"
        //    78: iconst_1       
        //    79: anewarray       Ljava/lang/Class;
        //    82: dup            
        //    83: iconst_0       
        //    84: ldc             Ljava/lang/Throwable;.class
        //    86: aastore        
        //    87: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    90: aload_2        
        //    91: iconst_1       
        //    92: anewarray       Ljava/lang/Object;
        //    95: dup            
        //    96: iconst_0       
        //    97: aload_3        
        //    98: aastore        
        //    99: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   102: pop            
        //   103: aload_2        
        //   104: athrow         
        //   105: aload_0        
        //   106: getfield        aetq.a:Laevl;
        //   109: astore_2       
        //   110: aload_0        
        //   111: getfield        aetq.b:Laevl;
        //   114: astore_3       
        //   115: aload_2        
        //   116: invokeinterface aevl.close:()V
        //   121: aload_3        
        //   122: invokeinterface aevl.close:()V
        //   127: return         
        //   128: astore_3       
        //   129: goto            103
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  50     56     63     105    Any
        //  64     70     73     103    Any
        //  74     103    128    132    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0103:
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
