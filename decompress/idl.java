import java.util.Map;
import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class idl implements fmm
{
    static final long a;
    public final zmf b;
    private final oby c;
    private final atke d;
    private final Executor e;
    private final aln f;
    
    static {
        a = TimeUnit.DAYS.toMillis(1L);
    }
    
    public idl(final oby c, final aln f, final zmf b, final atke d, final Executor e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.f = f;
        this.b = b;
        this.d = d;
        this.e = e;
    }
    
    public static void e(final Throwable t) {
        ttr.d("Failed to update offline access enabled and offline access updated at.", t);
    }
    
    public static void f(final Throwable t) {
        ttr.d("Failed to clear offline access enabled and offline access updated at.", t);
    }
    
    public final ListenableFuture a() {
        final ListenableFuture o = afnd.o((Callable)new hvu(this, 7), this.e);
        final ListenableFuture e = aftq.e(((tmx)this.f.a).a(), (aezf)fel.n, (Executor)afum.a);
        return afnd.z(new ListenableFuture[] { o, e }).P((Callable)new daa(this, o, e, 5), this.e);
    }
    
    public final boolean b() {
        return this.c();
    }
    
    public final boolean c() {
        return this.b.t() && this.g() && this.f.H();
    }
    
    public final boolean d() {
        return this.g();
    }
    
    public final boolean g() {
        if (!this.b.t()) {
            return false;
        }
        final boolean j = ((fms)this.d.a()).j();
        final String d = this.b.c().d();
        final fnc fnc = (fnc)((tmx)this.f.a).c();
        fmx a = fmx.a;
        final ahcr i = fnc.j;
        if (((Map)i).containsKey(d)) {
            a = (fmx)((Map)i).get(d);
        }
        final boolean c = a.c;
        final fnc fnc2 = (fnc)((tmx)this.f.a).c();
        fmx a2 = fmx.a;
        final ahcr k = fnc2.j;
        if (((Map)k).containsKey(d)) {
            a2 = (fmx)((Map)k).get(d);
        }
        final long d2 = a2.d;
        final long n = this.c.c() - idl.a;
        if (j) {
            if (!c || d2 < n) {
                teu.m(((tmx)this.f.a).b((aezf)new fmu(d, this.c.c(), 2)), (tes)gnn.p);
            }
            return true;
        }
        if (c) {
            if (d2 >= n) {
                return true;
            }
            teu.m(((tmx)this.f.a).b((aezf)new bwk(d, 16)), (tes)gnn.q);
        }
        return false;
    }
}
