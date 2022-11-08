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

public final class aquk implements aqum
{
    public String a;
    public aqqm b;
    private String c;
    private String d;
    private aqub e;
    private String f;
    private final aqty g;
    private final aqua h;
    private final long i;
    private double j;
    private int k;
    private long l;
    private final Random m;
    private aqum n;
    private int o;
    private int p;
    private int q;
    
    public aquk(final String s, final String d, final aqub aqub, final aqty g, final String f, final aqua h, final aqup aqup, final boolean b) {
        this.k = 1;
        if (!b) {
            this.c = s;
            this.d = d;
            aqub e;
            if ((e = aqub) == null) {
                e = new aqub();
            }
            this.e = e;
            this.f = f;
        }
        else {
            this.a = s;
        }
        this.h = h;
        this.g = g;
        this.i = aqup.a;
        this.j = 0.0;
        this.l = 1L;
        this.m = new Random();
        this.q = 1;
    }
    
    private final ListenableFuture i(final boolean b) {
        final aftp a = aftp.a((Callable)new atyk(this, b, 1));
        final arss arss = new arss(null);
        arss.k("Scotty-Uploader-ResumableTransfer-%d");
        final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor(arss.l(arss));
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
        //     3: getfield        aquk.q:I
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
        //    37: invokestatic    agnj.B:(Z)V
        //    40: aload_0        
        //    41: monitorexit    
        //    42: return         
        //    43: new             Laquo;
        //    46: astore_3       
        //    47: aload_3        
        //    48: getstatic       aqun.b:Laqun;
        //    51: ldc             ""
        //    53: invokespecial   aquo.<init>:(Laqun;Ljava/lang/String;)V
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
    
    private final void l(final aquo aquo) {
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
                    throw aquo;
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
            throw new aquo(aqun.c, "Could not call hasMoreData() on upload stream.", ex);
        }
    }
    
    private final aeru p(aqub a, final String s, final aqty aqty) {
        this.k();
        final aqub aqub = new aqub();
        aqub.e("X-Goog-Upload-Protocol", "resumable");
        aqub.e("X-Goog-Upload-Command", s);
        for (final String s2 : ((aqub)a).c()) {
            final Iterator iterator2 = ((aqub)a).b(s2).iterator();
            while (iterator2.hasNext()) {
                aqub.e(s2, (String)iterator2.next());
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
        final aqum a2 = this.h.a(s3, d, aqub, aqty);
        if (this.b != null && !s.equals("start")) {
            synchronized (this) {
                a2.j(new aquj(this, this.b, null, null), this.o, this.p);
            }
        }
        monitorenter(this);
        try {
            this.n = a2;
            a = (ExecutionException)a2.a();
            monitorexit(this);
            try {
                a = (ExecutionException)((Future<ahbd>)a).get();
                if (!((ahbd)a).b()) {
                    return (aeru)((ahbd)a).a;
                }
                if (((aquo)((ahbd)a).b).a != aqun.b) {
                    throw (Throwable)((ahbd)a).b;
                }
                this.k();
                throw new aquo(aqun.d, "");
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
    
    private static final boolean q(final aeru aeru) {
        return aeru.a / 100 == 4;
    }
    
    private static final boolean r(final aeru aeru) {
        final Object c = aeru.c;
        if (c != null) {
            final String a = ((aqub)c).a("X-Goog-Upload-Status");
            if (a != null && aeda.y("final", a)) {
                return true;
            }
        }
        return false;
    }
    
    private static final boolean s(final aeru aeru) {
        final Object c = aeru.c;
        if (c != null) {
            final String a = ((aqub)c).a("X-Goog-Upload-Status");
            if (a != null && aeda.y("active", a) && aeru.a == 200) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final ListenableFuture a() {
        return this.i(false);
    }
    
    @Override
    public final ListenableFuture b() {
        return this.i(true);
    }
    
    @Override
    public final aqty c() {
        return this.g;
    }
    
    @Override
    public final String d() {
        return this.a;
    }
    
    @Override
    public final void e() {
        synchronized (this) {
            final aqum n = this.n;
            if (n != null) {
                n.e();
                this.n = null;
            }
            this.q = 3;
            this.notifyAll();
        }
    }
    
    public final aeru f(final boolean b) {
    Label_0011_Outer:
        while (true) {
            if (b) {
                final aquk aquk = this;
                break Label_0361;
            }
            final aquk aquk = this;
            while (true) {
                Label_0170: {
                    if (!aquk.o()) {
                        final aqty aqty = aquk.g;
                        final Boolean b2 = true;
                        break Label_0170;
                    }
                    if (aquk.g.d() == Long.MAX_VALUE) {
                        final aqty aqty = aquk.g;
                        final Boolean b2 = true;
                        break Label_0170;
                    }
                    try {
                        aqty aqty = new aqui(aquk.g, aquk.k);
                        final long a = aqty.a();
                        final long d = aquk.g.d();
                        final long n = aquk.k;
                        Boolean b2;
                        if (a >= d / n * n && aquk.g.e() + aqty.a() != aquk.g.a()) {
                            b2 = false;
                        }
                        else {
                            aqty = aquk.g;
                            b2 = true;
                        }
                        final boolean booleanValue = b2;
                        String s;
                        if (aquk.o()) {
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
                        final aqqm b3 = aquk.b;
                        if (b3 != null) {
                            b3.a((aqum)aquk);
                        }
                        final aqub aqub = new aqub();
                        aqub.e("X-Goog-Upload-Offset", Long.toString(aquk.g.e()));
                        try {
                            final aeru p = aquk.p(aqub, s, aqty);
                            if (r(p)) {
                                return p;
                            }
                            if (s(p)) {
                                if (!booleanValue) {
                                    aquk.m();
                                    continue;
                                }
                                throw new aquo(aqun.e, "Finalize call returned active state.");
                            }
                            else {
                                if (q(p) && p.a != 400) {
                                    return p;
                                }
                                aquk.l(new aquo(aqun.e, p.e()));
                                break Label_0361;
                            }
                        }
                        catch (final aquo aquo) {
                            if (!aquo.a()) {
                                throw aquo;
                            }
                            aquk.l(aquo);
                        }
                        try {
                            aeru p2;
                            while (true) {
                                final aeru aeru = p2 = aquk.p(new aqub(), "query", new aqul(""));
                                if (r(aeru)) {
                                    break;
                                }
                                if (s(aeru)) {
                                    final String a2 = ((aqub)aeru.c).a("X-Goog-Upload-Chunk-Granularity");
                                    if (a2 != null) {
                                        try {
                                            aquk.k = Integer.parseInt(a2);
                                        }
                                        catch (final NumberFormatException ex) {
                                            throw new aquo(aqun.e, "Server returned an invalid chunk granularity.", ex);
                                        }
                                    }
                                    try {
                                        final long long1 = Long.parseLong(((aqub)aeru.c).a("X-Goog-Upload-Size-Received"));
                                        if (long1 >= aquk.g.c()) {
                                            if (long1 < aquk.g.e()) {
                                                aquk.g.h();
                                            }
                                            while (aquk.g.e() < long1) {
                                                if (aquk.o()) {
                                                    try {
                                                        final aqty g = aquk.g;
                                                        g.f(long1 - g.e());
                                                        aquk.g.g();
                                                        continue Label_0011_Outer;
                                                    }
                                                    catch (final IOException ex2) {
                                                        throw new aquo(aqun.c, "Could not skip in the data stream.", ex2);
                                                    }
                                                }
                                                final aqun c = aqun.c;
                                                final long e = aquk.g.e();
                                                final StringBuilder sb = new StringBuilder("Upload stream does not have more data but it should. Maybe the caller passed in a data stream to upload with a mark position that didn't match the transfer handle? Confirmed offset from server: ");
                                                sb.append(long1);
                                                sb.append(" Size: ");
                                                sb.append(e);
                                                throw new aquo(c, sb.toString());
                                            }
                                            aquk.m();
                                            p2 = null;
                                            break;
                                        }
                                        final aqun e2 = aqun.e;
                                        final long c2 = aquk.g.c();
                                        final StringBuilder sb2 = new StringBuilder("The server lost bytes that were previously committed. Our offset: ");
                                        sb2.append(c2);
                                        sb2.append(", server offset: ");
                                        sb2.append(long1);
                                        throw new aquo(e2, sb2.toString());
                                    }
                                    catch (final NumberFormatException ex3) {
                                        throw new aquo(aqun.e, "Failed to parse X-Goog-Upload-Size-Received header", ex3);
                                    }
                                }
                                p2 = aeru;
                                if (q(aeru)) {
                                    break;
                                }
                                aquk.l(new aquo(aqun.e, aeru.e()));
                            }
                            if (p2 == null) {
                                continue;
                            }
                            return p2;
                        }
                        catch (final aquo aquo2) {
                            if (aquo2.a()) {
                                aquk.l(aquo2);
                                continue Label_0011_Outer;
                            }
                            throw aquo2;
                        }
                        throw;
                    }
                    catch (final IOException ex4) {
                        throw new aquo(aqun.c, "Could not create chunked data stream.", ex4);
                    }
                }
                break;
            }
            break;
        }
    }
    
    public final aeru g(final boolean b) {
        monitorenter(this);
        try {
            final aqqm b2 = this.b;
            if (b2 != null) {
                b2.d();
            }
            monitorexit(this);
            this.n();
            while (true) {
                try {
                    while (true) {
                        final aeru p = this.p(this.e, "start", new aqul(aexs.e(this.f)));
                        if (r(p)) {
                            return p;
                        }
                        if (s(p)) {
                            final aqub aqub = (aqub)p.c;
                            final String a = aqub.a("X-Goog-Upload-URL");
                            try {
                                new URL(a);
                                this.a = a;
                                synchronized (this) {
                                    monitorexit(this);
                                    final String a2 = aqub.a("X-Goog-Upload-Chunk-Granularity");
                                    if (a2 != null) {
                                        try {
                                            this.k = Integer.parseInt(a2);
                                        }
                                        catch (final NumberFormatException ex) {
                                            throw new aquo(aqun.e, "Server returned an invalid chunk granularity.", ex);
                                        }
                                    }
                                    if (b) {
                                        return p;
                                    }
                                    return this.f(false);
                                }
                            }
                            catch (final MalformedURLException ex2) {
                                throw new aquo(aqun.e, "Server returned an invalid upload url.", ex2);
                            }
                        }
                        if (q(p)) {
                            return p;
                        }
                        this.l(new aquo(aqun.e, p.e()));
                    }
                }
                catch (final aquo aquo) {
                    if (aquo.a()) {
                        this.l(aquo);
                        continue;
                    }
                    throw aquo;
                }
                break;
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final boolean h() {
        return true;
    }
    
    @Override
    public final void j(final aqqm b, final int o, final int p3) {
        monitorenter(this);
        boolean b2;
        if (o > 0) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        try {
            agot.v(b2, (Object)"Progress threshold (bytes) must be greater than 0");
            agot.v(true, (Object)"Progress threshold (millis) must be greater or equal to 0");
            this.b = b;
            this.o = o;
            this.p = p3;
        }
        finally {
            monitorexit(this);
        }
    }
}
