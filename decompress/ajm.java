// 
// Decompiled by Procyon v0.6.0
// 

public final class ajm
{
    public boolean a;
    public Object b;
    public boolean c;
    public Object d;
    
    public final void a() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.c = true;
            final Object d = this.d;
            final Object b = this.b;
            monitorexit(this);
            Label_0051: {
                if (d == null) {
                    break Label_0051;
                }
                try {
                    ((ajl)d).a();
                    break Label_0051;
                }
                finally {
                    synchronized (this) {
                        this.c = false;
                        this.notifyAll();
                    }
                    while (true) {
                        ajk.b(b);
                        break Label_0051;
                        iftrue(Label_0082:)(b == null);
                        continue;
                    }
                }
            }
            synchronized (this) {
                this.c = false;
                this.notifyAll();
            }
        }
    }
    
    public final void b(final ajl p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        ajm.c:Z
        //     6: istore_2       
        //     7: iload_2        
        //     8: ifeq            18
        //    11: aload_0        
        //    12: invokevirtual   java/lang/Object.wait:()V
        //    15: goto            2
        //    18: aload_0        
        //    19: getfield        ajm.d:Ljava/lang/Object;
        //    22: aload_1        
        //    23: if_acmpne       29
        //    26: aload_0        
        //    27: monitorexit    
        //    28: return         
        //    29: aload_0        
        //    30: aload_1        
        //    31: putfield        ajm.d:Ljava/lang/Object;
        //    34: aload_0        
        //    35: getfield        ajm.a:Z
        //    38: ifeq            57
        //    41: aload_1        
        //    42: ifnonnull       48
        //    45: goto            57
        //    48: aload_0        
        //    49: monitorexit    
        //    50: aload_1        
        //    51: invokeinterface ajl.a:()V
        //    56: return         
        //    57: aload_0        
        //    58: monitorexit    
        //    59: return         
        //    60: astore_1       
        //    61: aload_0        
        //    62: monitorexit    
        //    63: goto            68
        //    66: aload_1        
        //    67: athrow         
        //    68: goto            66
        //    71: astore_3       
        //    72: goto            2
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  2      7      60     71     Any
        //  11     15     71     75     Ljava/lang/InterruptedException;
        //  11     15     60     71     Any
        //  18     28     60     71     Any
        //  29     41     60     71     Any
        //  48     50     60     71     Any
        //  57     59     60     71     Any
        //  61     63     60     71     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0018:
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
