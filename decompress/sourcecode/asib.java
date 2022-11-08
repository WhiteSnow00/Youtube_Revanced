import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asib implements asic, asjf
{
    athu a;
    public volatile boolean b;
    
    public asib() {
    }
    
    public asib(final asic... array) {
        final int length = array.length;
        this.a = new athu(length + 1);
        for (final asic asic : array) {
            asjv.b((Object)asic, "A Disposable in the disposables array is null");
            this.a.b(asic);
        }
    }
    
    static final void g(athu o) {
        if (o == null) {
            return;
        }
        final Object[] array = (Object[])((athu)o).d;
        final int length = array.length;
        o = null;
        Object o3;
        for (int i = 0; i < length; ++i, o = o3) {
            final Object o2 = array[i];
            o3 = o;
            if (o2 instanceof asic) {
                try {
                    ((asic)o2).dispose();
                }
                finally {
                    final Throwable t;
                    asey.d(t);
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
            throw athp.b(((List<Throwable>)o).get(0));
        }
        throw new asik((Iterable)o);
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
            final athu a = this.a;
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
            final athu a = this.a;
            this.a = null;
            monitorexit(this);
            g(a);
        }
    }
    
    public final boolean c(final asic asic) {
        asjv.b((Object)asic, "disposable is null");
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    athu a;
                    if ((a = this.a) == null) {
                        a = new athu(16, null);
                        this.a = a;
                    }
                    a.b(asic);
                    return true;
                }
            }
        }
        asic.dispose();
        return false;
    }
    
    public final boolean d(final asic asic) {
        asjv.b((Object)asic, "disposables is null");
        if (this.b) {
            return false;
        }
        monitorenter(this);
        try {
            if (this.b) {
                monitorexit(this);
                return false;
            }
            final athu a = this.a;
            Label_0157: {
                if (a != null) {
                    final Object d = a.d;
                    final int a2 = a.a;
                    final int n = athu.a(asic.hashCode()) & a2;
                    final Object o = ((Object[])d)[n];
                    if (o != null) {
                        int n2 = n;
                        if (o.equals(asic)) {
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
                            } while (!o2.equals(asic));
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
    
    public final void dispose() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            final athu a = this.a;
            this.a = null;
            monitorexit(this);
            g(a);
        }
    }
    
    public final void f(final asic... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "disposables is null"
        //     3: invokestatic    asjv.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0        
        //     7: getfield        asib.b:Z
        //    10: istore_2       
        //    11: iconst_0       
        //    12: istore_3       
        //    13: iconst_0       
        //    14: istore          4
        //    16: iload_2        
        //    17: ifne            112
        //    20: aload_0        
        //    21: monitorenter   
        //    22: aload_0        
        //    23: getfield        asib.b:Z
        //    26: ifne            102
        //    29: aload_0        
        //    30: getfield        asib.a:Lathu;
        //    33: astore          5
        //    35: aload           5
        //    37: astore          6
        //    39: aload           5
        //    41: ifnonnull       64
        //    44: new             Lathu;
        //    47: astore          6
        //    49: aload           6
        //    51: aload_1        
        //    52: arraylength    
        //    53: iconst_1       
        //    54: iadd           
        //    55: invokespecial   athu.<init>:(I)V
        //    58: aload_0        
        //    59: aload           6
        //    61: putfield        asib.a:Lathu;
        //    64: aload_1        
        //    65: arraylength    
        //    66: istore_3       
        //    67: iload           4
        //    69: iload_3        
        //    70: if_icmpge       99
        //    73: aload_1        
        //    74: iload           4
        //    76: aaload         
        //    77: astore          5
        //    79: aload           5
        //    81: ldc             "A Disposable in the disposables array is null"
        //    83: invokestatic    asjv.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //    86: aload           6
        //    88: aload           5
        //    90: invokevirtual   athu.b:(Ljava/lang/Object;)V
        //    93: iinc            4, 1
        //    96: goto            67
        //    99: aload_0        
        //   100: monitorexit    
        //   101: return         
        //   102: aload_0        
        //   103: monitorexit    
        //   104: goto            112
        //   107: astore_1       
        //   108: aload_0        
        //   109: monitorexit    
        //   110: aload_1        
        //   111: athrow         
        //   112: aload_1        
        //   113: arraylength    
        //   114: istore          7
        //   116: iload_3        
        //   117: istore          4
        //   119: iload           4
        //   121: iload           7
        //   123: if_icmpge       141
        //   126: aload_1        
        //   127: iload           4
        //   129: aaload         
        //   130: invokeinterface asic.dispose:()V
        //   135: iinc            4, 1
        //   138: goto            119
        //   141: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  22     35     107    112    Any
        //  44     64     107    112    Any
        //  64     67     107    112    Any
        //  79     93     107    112    Any
        //  99     101    107    112    Any
        //  102    104    107    112    Any
        //  108    110    107    112    Any
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
    
    public final void h(final asic asic) {
        if (this.d(asic)) {
            asic.dispose();
        }
    }
    
    public final boolean tx() {
        return this.b;
    }
}
