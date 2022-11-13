import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import com.google.common.util.concurrent.ListenableFuture;
import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqwu implements aqxa
{
    public static final char[] a;
    public final String b;
    public final String c;
    public final aqwo d;
    public final String e;
    public final aqwl f;
    public final aqwn g;
    public final MessageDigest h;
    public aqxa i;
    public int j;
    public int k;
    public aqsy l;
    private int m;
    
    static {
        a = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();
    }
    
    public aqwu(final String b, final aqwo d, final aqwl f, final String s, final aqwn g, final aqxd aqxd) {
        b.getClass();
        f.getClass();
        g.getClass();
        this.b = b;
        this.c = "POST";
        this.d = d;
        this.e = aezr.e(s);
        this.g = g;
        this.f = f;
        this.m = 1;
        this.h = aqxd.b;
    }
    
    public final ListenableFuture a() {
        final aerg aerg = new aerg(this, 5);
        final aruy aruy = new aruy((byte[])null);
        aruy.k("Scotty-Uploader-MultipartTransfer-%d");
        final afvs d = afwm.d(Executors.newSingleThreadExecutor(aruy.o(aruy)));
        final ListenableFuture rz = d.rz((Callable)aerg);
        d.shutdown();
        return rz;
    }
    
    public final ListenableFuture b() {
        return aqsy.h();
    }
    
    public final aqwl c() {
        return this.f;
    }
    
    public final String d() {
        return null;
    }
    
    public final void e() {
        synchronized (this) {
            final aqxa i = this.i;
            if (i != null) {
                i.e();
            }
            this.m = 3;
            this.notifyAll();
        }
    }
    
    public final void f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        aqwu.m:I
        //     6: istore_1       
        //     7: iload_1        
        //     8: iconst_2       
        //     9: if_icmpne       19
        //    12: aload_0        
        //    13: invokevirtual   java/lang/Object.wait:()V
        //    16: goto            2
        //    19: iload_1        
        //    20: iconst_3       
        //    21: if_icmpeq       43
        //    24: iconst_1       
        //    25: istore_2       
        //    26: iload_1        
        //    27: iconst_1       
        //    28: if_icmpne       34
        //    31: goto            36
        //    34: iconst_0       
        //    35: istore_2       
        //    36: iload_2        
        //    37: invokestatic    aefb.L:(Z)V
        //    40: aload_0        
        //    41: monitorexit    
        //    42: return         
        //    43: new             Laqxc;
        //    46: astore_3       
        //    47: aload_3        
        //    48: getstatic       aqxb.b:Laqxb;
        //    51: ldc             ""
        //    53: invokespecial   aqxc.<init>:(Laqxb;Ljava/lang/String;)V
        //    56: aload_3        
        //    57: athrow         
        //    58: astore_3       
        //    59: aload_0        
        //    60: monitorexit    
        //    61: goto            66
        //    64: aload_3        
        //    65: athrow         
        //    66: goto            64
        //    69: astore_3       
        //    70: goto            2
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  2      7      58     69     Any
        //  12     16     69     73     Ljava/lang/InterruptedException;
        //  12     16     58     69     Any
        //  36     40     58     69     Any
        //  43     58     58     69     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0019:
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
    
    public final boolean h() {
        return false;
    }
    
    public final void j(final aqsy l, final int j, final int k) {
        monitorenter(this);
        boolean b;
        if (j > 0) {
            b = true;
        }
        else {
            b = false;
        }
        try {
            adkp.I(b, (Object)"Progress threshold (bytes) must be greater than 0");
            adkp.I(true, (Object)"Progress threshold (millis) must be greater or equal to 0");
            this.l = l;
            this.j = j;
            this.k = k;
        }
        finally {
            monitorexit(this);
        }
    }
}
