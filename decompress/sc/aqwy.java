import java.util.concurrent.Future;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqwy implements aqxa
{
    public String a;
    public aqsy b;
    private String c;
    private String d;
    private aqwo e;
    private String f;
    private final aqwl g;
    private final aqwn h;
    private final long i;
    private double j;
    private int k;
    private long l;
    private final Random m;
    private aqxa n;
    private int o;
    private int p;
    private int q;
    
    public aqwy(final String s, final String d, final aqwo aqwo, final aqwl g, final String f, final aqwn h, final aqxd aqxd, final boolean b) {
        this.k = 1;
        if (!b) {
            this.c = s;
            this.d = d;
            aqwo e;
            if ((e = aqwo) == null) {
                e = new aqwo();
            }
            this.e = e;
            this.f = f;
        }
        else {
            this.a = s;
        }
        this.h = h;
        this.g = g;
        this.i = aqxd.a;
        this.j = 0.0;
        this.l = 1L;
        this.m = new Random();
        this.q = 1;
    }
    
    private final ListenableFuture i(final boolean b) {
        final afvq a = afvq.a((Callable)new aqww(this, b, 0));
        final aruy aruy = new aruy((byte[])null);
        aruy.k("Scotty-Uploader-ResumableTransfer-%d");
        final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor(aruy.o(aruy));
        singleThreadExecutor.submit((Runnable)a);
        singleThreadExecutor.shutdown();
        return (ListenableFuture)a;
    }
    
    private final void k() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        aqwy.q:I
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
    
    private final void l(final aqxc aqxc) {
        Label_0098: {
            if (this.j >= this.i) {
                break Label_0098;
            }
            final double nextDouble = this.m.nextDouble();
            while (true) {
                try {
                    final double j = this.j;
                    final long l = this.l;
                    final double n = (double)l;
                    Double.isNaN(n);
                    this.j = j + n * nextDouble;
                    final double n2 = (double)(l * 1000L);
                    Double.isNaN(n2);
                    Thread.sleep((long)(n2 * nextDouble));
                    final long i = this.l;
                    this.l = i + i;
                    return;
                    throw aqxc;
                }
                catch (final InterruptedException ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    private final void m() {
        if (this.g.e() > this.g.c()) {
            this.g.g();
            this.n();
        }
    }
    
    private final void n() {
        this.l = 1L;
        this.j = 0.0;
    }
    
    private final boolean o() {
        try {
            return this.g.i();
        }
        catch (final IOException ex) {
            throw new aqxc(aqxb.c, "Could not call hasMoreData() on upload stream.", (Throwable)ex);
        }
    }
    
    private final aetv p(aqwo a, final String s, final aqwl aqwl) {
        this.k();
        final aqwo aqwo = new aqwo();
        aqwo.e("X-Goog-Upload-Protocol", "resumable");
        aqwo.e("X-Goog-Upload-Command", s);
        for (final String s2 : ((aqwo)a).c()) {
            final Iterator iterator2 = ((aqwo)a).b(s2).iterator();
            while (iterator2.hasNext()) {
                aqwo.e(s2, (String)iterator2.next());
            }
        }
        String s3;
        if (s.equals("start")) {
            s3 = this.c;
        }
        else {
            s3 = this.a;
        }
        String d;
        if (s.contains("start")) {
            d = this.d;
        }
        else {
            d = "PUT";
        }
        final aqxa a2 = this.h.a(s3, d, aqwo, aqwl);
        if (this.b != null && !s.equals("start")) {
            synchronized (this) {
                a2.j((aqsy)new aqwx((aqxa)this, this.b, null, null), this.o, this.p);
            }
        }
        monitorenter(this);
        try {
            this.n = a2;
            a = (ExecutionException)a2.a();
            monitorexit(this);
            try {
                a = (ExecutionException)((Future<arzp>)a).get();
                if (!((arzp)a).f()) {
                    return (aetv)((arzp)a).b;
                }
                if (((aqxc)((arzp)a).a).a != aqxb.b) {
                    throw (Throwable)((arzp)a).a;
                }
                this.k();
                throw new aqxc(aqxb.d, "");
            }
            catch (final ExecutionException a) {}
            catch (final InterruptedException ex) {}
            throw new RuntimeException("Unexpected error occurred: ".concat(String.valueOf(a.getMessage())), a);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private static final boolean q(final aetv aetv) {
        return aetv.a / 100 == 4;
    }
    
    private static final boolean r(final aetv aetv) {
        final Object c = aetv.c;
        if (c != null) {
            final String a = ((aqwo)c).a("X-Goog-Upload-Status");
            if (a != null && aevy.d((CharSequence)"final", (CharSequence)a)) {
                return true;
            }
        }
        return false;
    }
    
    private static final boolean s(final aetv aetv) {
        final Object c = aetv.c;
        if (c != null) {
            final String a = ((aqwo)c).a("X-Goog-Upload-Status");
            if (a != null && aevy.d((CharSequence)"active", (CharSequence)a) && aetv.a == 200) {
                return true;
            }
        }
        return false;
    }
    
    public final ListenableFuture a() {
        return this.i(false);
    }
    
    public final ListenableFuture b() {
        return this.i(true);
    }
    
    public final aqwl c() {
        return this.g;
    }
    
    public final String d() {
        return this.a;
    }
    
    public final void e() {
        synchronized (this) {
            final aqxa n = this.n;
            if (n != null) {
                n.e();
                this.n = null;
            }
            this.q = 3;
            this.notifyAll();
        }
    }
    
    public final aetv f(final boolean b) {
    Label_0013_Outer:
        while (true) {
            if (b) {
                final aqwy aqwy = this;
                break Label_0397;
            }
            final aqwy aqwy = this;
            while (true) {
                Label_0186: {
                    if (!aqwy.o()) {
                        final Object o = aqwy.g;
                        final Boolean b2 = true;
                        break Label_0186;
                    }
                    if (aqwy.g.d() == Long.MAX_VALUE) {
                        final Object o = aqwy.g;
                        final Boolean b2 = true;
                        break Label_0186;
                    }
                    try {
                        Object o = new aqwv(aqwy.g, aqwy.k);
                        final long a = ((aqwl)o).a();
                        final long d = aqwy.g.d();
                        final long n = aqwy.k;
                        Boolean b2;
                        if (a >= d / n * n && aqwy.g.e() + ((aqwl)o).a() != aqwy.g.a()) {
                            b2 = false;
                        }
                        else {
                            o = aqwy.g;
                            b2 = true;
                        }
                        final boolean booleanValue = b2;
                        String s;
                        if (aqwy.o()) {
                            if (booleanValue) {
                                s = "upload, finalize";
                            }
                            else {
                                s = "upload";
                            }
                        }
                        else {
                            s = "finalize";
                        }
                        final aqsy b3 = aqwy.b;
                        if (b3 != null) {
                            b3.a((aqxa)aqwy);
                        }
                        final aqwo aqwo = new aqwo();
                        aqwo.e("X-Goog-Upload-Offset", Long.toString(aqwy.g.e()));
                        try {
                            final aetv p = aqwy.p(aqwo, s, (aqwl)o);
                            if (r(p)) {
                                return p;
                            }
                            if (s(p)) {
                                if (!booleanValue) {
                                    aqwy.m();
                                    continue;
                                }
                                throw new aqxc(aqxb.e, "Finalize call returned active state.");
                            }
                            else {
                                if (q(p) && p.a != 400) {
                                    return p;
                                }
                                aqwy.l(new aqxc(aqxb.e, p.d()));
                                break Label_0397;
                            }
                        }
                        catch (final aqxc aqxc) {
                            if (!aqxc.a()) {
                                throw aqxc;
                            }
                            aqwy.l(aqxc);
                        }
                        try {
                            aetv p2;
                            while (true) {
                                final aetv aetv = p2 = aqwy.p(new aqwo(), "query", (aqwl)new aqwz(""));
                                if (r(aetv)) {
                                    break;
                                }
                                if (s(aetv)) {
                                    final String a2 = ((aqwo)aetv.c).a("X-Goog-Upload-Chunk-Granularity");
                                    if (a2 != null) {
                                        try {
                                            aqwy.k = Integer.parseInt(a2);
                                        }
                                        catch (final NumberFormatException ex) {
                                            throw new aqxc(aqxb.e, "Server returned an invalid chunk granularity.", (Throwable)ex);
                                        }
                                    }
                                    try {
                                        final long long1 = Long.parseLong(((aqwo)aetv.c).a("X-Goog-Upload-Size-Received"));
                                        if (long1 >= aqwy.g.c()) {
                                            if (long1 < aqwy.g.e()) {
                                                aqwy.g.h();
                                            }
                                            while (aqwy.g.e() < long1) {
                                                if (aqwy.o()) {
                                                    try {
                                                        final aqwl g = aqwy.g;
                                                        g.f(long1 - g.e());
                                                        aqwy.g.g();
                                                        continue Label_0013_Outer;
                                                    }
                                                    catch (final IOException ex2) {
                                                        throw new aqxc(aqxb.c, "Could not skip in the data stream.", (Throwable)ex2);
                                                    }
                                                }
                                                final aqxb c = aqxb.c;
                                                final long e = aqwy.g.e();
                                                final StringBuilder sb = new StringBuilder("Upload stream does not have more data but it should. Maybe the caller passed in a data stream to upload with a mark position that didn't match the transfer handle? Confirmed offset from server: ");
                                                sb.append(long1);
                                                sb.append(" Size: ");
                                                sb.append(e);
                                                throw new aqxc(c, sb.toString());
                                            }
                                            aqwy.m();
                                            p2 = null;
                                            break;
                                        }
                                        final aqxb e2 = aqxb.e;
                                        final long c2 = aqwy.g.c();
                                        final StringBuilder sb2 = new StringBuilder("The server lost bytes that were previously committed. Our offset: ");
                                        sb2.append(c2);
                                        sb2.append(", server offset: ");
                                        sb2.append(long1);
                                        throw new aqxc(e2, sb2.toString());
                                    }
                                    catch (final NumberFormatException ex3) {
                                        throw new aqxc(aqxb.e, "Failed to parse X-Goog-Upload-Size-Received header", (Throwable)ex3);
                                    }
                                }
                                p2 = aetv;
                                if (q(aetv)) {
                                    break;
                                }
                                aqwy.l(new aqxc(aqxb.e, aetv.d()));
                            }
                            if (p2 == null) {
                                continue;
                            }
                            return p2;
                        }
                        catch (final aqxc aqxc2) {
                            if (aqxc2.a()) {
                                aqwy.l(aqxc2);
                                continue Label_0013_Outer;
                            }
                            throw aqxc2;
                        }
                        throw;
                    }
                    catch (final IOException ex4) {
                        throw new aqxc(aqxb.c, "Could not create chunked data stream.", (Throwable)ex4);
                    }
                }
                break;
            }
            break;
        }
    }
    
    public final aetv g(final boolean b) {
        monitorenter(this);
        try {
            final aqsy b2 = this.b;
            if (b2 != null) {
                b2.d();
            }
            monitorexit(this);
            this.n();
            while (true) {
                try {
                    while (true) {
                        final aetv p = this.p(this.e, "start", (aqwl)new aqwz(aezr.e(this.f)));
                        if (r(p)) {
                            return p;
                        }
                        if (s(p)) {
                            final aqwo aqwo = (aqwo)p.c;
                            final String a = aqwo.a("X-Goog-Upload-URL");
                            try {
                                new URL(a);
                                this.a = a;
                                synchronized (this) {
                                    monitorexit(this);
                                    final String a2 = aqwo.a("X-Goog-Upload-Chunk-Granularity");
                                    if (a2 != null) {
                                        try {
                                            this.k = Integer.parseInt(a2);
                                        }
                                        catch (final NumberFormatException ex) {
                                            throw new aqxc(aqxb.e, "Server returned an invalid chunk granularity.", (Throwable)ex);
                                        }
                                    }
                                    if (b) {
                                        return p;
                                    }
                                    return this.f(false);
                                }
                            }
                            catch (final MalformedURLException ex2) {
                                throw new aqxc(aqxb.e, "Server returned an invalid upload url.", (Throwable)ex2);
                            }
                        }
                        if (q(p)) {
                            return p;
                        }
                        this.l(new aqxc(aqxb.e, p.d()));
                    }
                }
                catch (final aqxc aqxc) {
                    if (aqxc.a()) {
                        this.l(aqxc);
                        continue;
                    }
                    throw aqxc;
                }
                break;
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final boolean h() {
        return true;
    }
    
    public final void j(final aqsy b, final int o, final int p3) {
        monitorenter(this);
        boolean b2;
        if (o > 0) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        try {
            adkp.I(b2, (Object)"Progress threshold (bytes) must be greater than 0");
            adkp.I(true, (Object)"Progress threshold (millis) must be greater or equal to 0");
            this.b = b;
            this.o = o;
            this.p = p3;
        }
        finally {
            monitorexit(this);
        }
    }
}
