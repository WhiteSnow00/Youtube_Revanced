import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asiq implements asir, asju
{
    atim a;
    public volatile boolean b;
    
    public asiq() {
    }
    
    public asiq(final asir... array) {
        this.a = new atim(array.length + 1);
        for (int i = 0; i < array.length; ++i) {
            final asir asir = array[i];
            askk.b((Object)asir, "A Disposable in the disposables array is null");
            this.a.b((Object)asir);
        }
    }
    
    static final void g(atim o) {
        if (o == null) {
            return;
        }
        final Object[] array = (Object[])((atim)o).d;
        final int length = array.length;
        o = null;
        Object o3;
        for (int i = 0; i < length; ++i, o = o3) {
            final Object o2 = array[i];
            o3 = o;
            if (o2 instanceof asir) {
                try {
                    ((asir)o2).dispose();
                }
                finally {
                    final Throwable t;
                    asgz.c(t);
                    o3 = o;
                    if (o == null) {
                        o3 = new ArrayList<Throwable>();
                    }
                    ((List<Throwable>)o3).add(t);
                }
            }
        }
        if (o == null) {
            return;
        }
        if (((List)o).size() == 1) {
            throw atih.b((Throwable)((List<Throwable>)o).get(0));
        }
        throw new asiz((Iterable)o);
    }
    
    public final int a() {
        final boolean b = this.b;
        int b2 = 0;
        if (b) {
            return 0;
        }
        synchronized (this) {
            if (this.b) {
                return 0;
            }
            final atim a = this.a;
            if (a != null) {
                b2 = a.b;
            }
            return b2;
        }
    }
    
    public final void b() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            final atim a = this.a;
            this.a = null;
            monitorexit(this);
            g(a);
        }
    }
    
    public final boolean c(final asir asir) {
        askk.b((Object)asir, "disposable is null");
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    atim a;
                    if ((a = this.a) == null) {
                        a = new atim(16, (byte[])null);
                        this.a = a;
                    }
                    a.b((Object)asir);
                    return true;
                }
            }
        }
        asir.dispose();
        return false;
    }
    
    public final boolean d(final asir asir) {
        askk.b((Object)asir, "disposables is null");
        if (this.b) {
            return false;
        }
        monitorenter(this);
        try {
            if (this.b) {
                monitorexit(this);
                return false;
            }
            final atim a = this.a;
            Label_0157: {
                if (a != null) {
                    final Object d = a.d;
                    final int a2 = a.a;
                    final int n = atim.a(asir.hashCode()) & a2;
                    final Object o = ((Object[])d)[n];
                    if (o != null) {
                        int n2 = n;
                        if (o.equals(asir)) {
                            a.c(n, (Object[])d, a2);
                        }
                        else {
                            Object o2;
                            int n3;
                            do {
                                n3 = (n2 + 1 & a2);
                                o2 = ((Object[])d)[n3];
                                if (o2 == null) {
                                    break Label_0157;
                                }
                                n2 = n3;
                            } while (!o2.equals(asir));
                            a.c(n3, (Object[])d, a2);
                        }
                        monitorexit(this);
                        return true;
                    }
                }
            }
            monitorexit(this);
            return false;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void dispose() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            final atim a = this.a;
            this.a = null;
            monitorexit(this);
            g(a);
        }
    }
    
    public final void f(final asir... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "disposables is null"
        //     3: invokestatic    askk.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0        
        //     7: getfield        asiq.b:Z
        //    10: istore          5
        //    12: iconst_0       
        //    13: istore_2       
        //    14: iconst_0       
        //    15: istore_3       
        //    16: iload           5
        //    18: ifne            115
        //    21: aload_0        
        //    22: monitorenter   
        //    23: aload_0        
        //    24: getfield        asiq.b:Z
        //    27: ifne            105
        //    30: aload_0        
        //    31: getfield        asiq.a:Latim;
        //    34: astore          7
        //    36: aload           7
        //    38: astore          6
        //    40: aload           7
        //    42: ifnonnull       65
        //    45: new             Latim;
        //    48: astore          6
        //    50: aload           6
        //    52: aload_1        
        //    53: arraylength    
        //    54: iconst_1       
        //    55: iadd           
        //    56: invokespecial   atim.<init>:(I)V
        //    59: aload_0        
        //    60: aload           6
        //    62: putfield        asiq.a:Latim;
        //    65: aload_1        
        //    66: arraylength    
        //    67: istore          4
        //    69: iload_3        
        //    70: istore_2       
        //    71: iload_2        
        //    72: iload           4
        //    74: if_icmpge       102
        //    77: aload_1        
        //    78: iload_2        
        //    79: aaload         
        //    80: astore          7
        //    82: aload           7
        //    84: ldc             "A Disposable in the disposables array is null"
        //    86: invokestatic    askk.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //    89: aload           6
        //    91: aload           7
        //    93: invokevirtual   atim.b:(Ljava/lang/Object;)V
        //    96: iinc            2, 1
        //    99: goto            71
        //   102: aload_0        
        //   103: monitorexit    
        //   104: return         
        //   105: aload_0        
        //   106: monitorexit    
        //   107: goto            115
        //   110: astore_1       
        //   111: aload_0        
        //   112: monitorexit    
        //   113: aload_1        
        //   114: athrow         
        //   115: aload_1        
        //   116: arraylength    
        //   117: istore_3       
        //   118: iload_2        
        //   119: iload_3        
        //   120: if_icmpge       137
        //   123: aload_1        
        //   124: iload_2        
        //   125: aaload         
        //   126: invokeinterface asir.dispose:()V
        //   131: iinc            2, 1
        //   134: goto            118
        //   137: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  23     36     110    115    Any
        //  45     65     110    115    Any
        //  65     69     110    115    Any
        //  82     96     110    115    Any
        //  102    104    110    115    Any
        //  105    107    110    115    Any
        //  111    113    110    115    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:837)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2086)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
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
    
    public final void h(final asir asir) {
        if (this.d(asir)) {
            asir.dispose();
        }
    }
    
    @Override
    public final boolean tA() {
        return this.b;
    }
}
