import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aslm implements asln, asmq
{
    atlj a;
    public volatile boolean b;
    
    public aslm() {
    }
    
    public aslm(final asln... array) {
        this.a = new atlj(array.length + 1);
        for (int i = 0; i < array.length; ++i) {
            final asln asln = array[i];
            asng.b(asln, "A Disposable in the disposables array is null");
            this.a.b(asln);
        }
    }
    
    static final void g(atlj o) {
        if (o == null) {
            return;
        }
        final Object[] array = (Object[])((atlj)o).d;
        final int length = array.length;
        o = null;
        Object o3;
        for (int i = 0; i < length; ++i, o = o3) {
            final Object o2 = array[i];
            o3 = o;
            if (o2 instanceof asln) {
                try {
                    ((asln)o2).dispose();
                }
                finally {
                    final Throwable t;
                    asjv.a(t);
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
            throw atle.b(((List<Throwable>)o).get(0));
        }
        throw new aslv((Iterable)o);
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
            final atlj a = this.a;
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
            final atlj a = this.a;
            this.a = null;
            monitorexit(this);
            g(a);
        }
    }
    
    @Override
    public final boolean c(final asln asln) {
        asng.b(asln, "disposable is null");
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    atlj a;
                    if ((a = this.a) == null) {
                        a = new atlj(16, null);
                        this.a = a;
                    }
                    a.b(asln);
                    return true;
                }
            }
        }
        asln.dispose();
        return false;
    }
    
    @Override
    public final boolean d(final asln asln) {
        asng.b(asln, "disposables is null");
        if (this.b) {
            return false;
        }
        monitorenter(this);
        try {
            if (this.b) {
                monitorexit(this);
                return false;
            }
            final atlj a = this.a;
            Label_0157: {
                if (a != null) {
                    final Object d = a.d;
                    final int a2 = a.a;
                    final int n = atlj.a(asln.hashCode()) & a2;
                    final Object o = ((Object[])d)[n];
                    if (o != null) {
                        int n2 = n;
                        if (o.equals(asln)) {
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
                            } while (!o2.equals(asln));
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
            final atlj a = this.a;
            this.a = null;
            monitorexit(this);
            g(a);
        }
    }
    
    public final void f(final asln... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "disposables is null"
        //     3: invokestatic    asng.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0        
        //     7: getfield        aslm.b:Z
        //    10: istore          5
        //    12: iconst_0       
        //    13: istore_3       
        //    14: iconst_0       
        //    15: istore_2       
        //    16: iload           5
        //    18: ifne            111
        //    21: aload_0        
        //    22: monitorenter   
        //    23: aload_0        
        //    24: getfield        aslm.b:Z
        //    27: ifne            101
        //    30: aload_0        
        //    31: getfield        aslm.a:Latlj;
        //    34: astore          7
        //    36: aload           7
        //    38: astore          6
        //    40: aload           7
        //    42: ifnonnull       65
        //    45: new             Latlj;
        //    48: astore          6
        //    50: aload           6
        //    52: aload_1        
        //    53: arraylength    
        //    54: iconst_1       
        //    55: iadd           
        //    56: invokespecial   atlj.<init>:(I)V
        //    59: aload_0        
        //    60: aload           6
        //    62: putfield        aslm.a:Latlj;
        //    65: aload_1        
        //    66: arraylength    
        //    67: istore_3       
        //    68: iload_2        
        //    69: iload_3        
        //    70: if_icmpge       98
        //    73: aload_1        
        //    74: iload_2        
        //    75: aaload         
        //    76: astore          7
        //    78: aload           7
        //    80: ldc             "A Disposable in the disposables array is null"
        //    82: invokestatic    asng.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //    85: aload           6
        //    87: aload           7
        //    89: invokevirtual   atlj.b:(Ljava/lang/Object;)V
        //    92: iinc            2, 1
        //    95: goto            68
        //    98: aload_0        
        //    99: monitorexit    
        //   100: return         
        //   101: aload_0        
        //   102: monitorexit    
        //   103: goto            111
        //   106: astore_1       
        //   107: aload_0        
        //   108: monitorexit    
        //   109: aload_1        
        //   110: athrow         
        //   111: aload_1        
        //   112: arraylength    
        //   113: istore          4
        //   115: iload_3        
        //   116: istore_2       
        //   117: iload_2        
        //   118: iload           4
        //   120: if_icmpge       137
        //   123: aload_1        
        //   124: iload_2        
        //   125: aaload         
        //   126: invokeinterface asln.dispose:()V
        //   131: iinc            2, 1
        //   134: goto            117
        //   137: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  23     36     106    111    Any
        //  45     65     106    111    Any
        //  65     68     106    111    Any
        //  78     92     106    111    Any
        //  98     100    106    111    Any
        //  101    103    106    111    Any
        //  107    109    106    111    Any
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
    
    @Override
    public final void h(final asln asln) {
        if (this.d(asln)) {
            asln.dispose();
        }
    }
    
    @Override
    public final boolean tz() {
        return this.b;
    }
}
