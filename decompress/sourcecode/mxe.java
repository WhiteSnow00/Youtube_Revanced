import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mxe
{
    public static volatile ehl a;
    private final Context b;
    private final Executor c;
    private final nly d;
    private final boolean e;
    
    static {
        mxe.a = ehl.a;
    }
    
    public mxe(final Context b, final Executor c, final nly d, final boolean e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static mxe a(final Context context, final Executor executor, final boolean b) {
        final nmo nmo = new nmo();
        if (b) {
            executor.execute((Runnable)new moe(context, nmo, 6, (byte[])null));
        }
        else {
            executor.execute((Runnable)new mkn(nmo, 12, (byte[])null));
        }
        return new mxe(context, executor, (nly)nmo.a, b);
    }
    
    private final void g(final int n, final long n2, final Exception ex, final String s, final String s2) {
        if (!this.e) {
            this.d.a(this.c, (nln)mxc.a);
            return;
        }
        final ehj a = ehm.a();
        final String packageName = this.b.getPackageName();
        ((agza)a).copyOnWrite();
        ehm.i((ehm)a.instance, packageName);
        ((agza)a).copyOnWrite();
        ehm.c((ehm)a.instance, n2);
        final ehl a2 = mxe.a;
        ((agza)a).copyOnWrite();
        ehm.h((ehm)a.instance, a2);
        if (ex != null) {
            final String a3 = aeyv.a((Throwable)ex);
            ((agza)a).copyOnWrite();
            ehm.d((ehm)a.instance, a3);
            final String name = ex.getClass().getName();
            ((agza)a).copyOnWrite();
            ehm.e((ehm)a.instance, name);
        }
        if (s2 != null) {
            ((agza)a).copyOnWrite();
            ehm.f((ehm)a.instance, s2);
        }
        if (s != null) {
            ((agza)a).copyOnWrite();
            ehm.g((ehm)a.instance, s);
        }
        this.d.a(this.c, (nln)new mxd(a, n));
    }
    
    public final void b(final int n, final String s) {
        this.g(n, 0L, null, null, s);
    }
    
    public final void c(final int n, final long n2, final Exception ex) {
        this.g(n, n2, ex, null, null);
    }
    
    public final void d(final int n, final long n2) {
        this.g(n, n2, null, null, null);
    }
    
    public final void e(final int n, final long n2, final String s) {
        this.g(n, n2, null, null, s);
    }
    
    public final void f(final int n, final long n2, final String s) {
        this.g(n, n2, null, s, null);
    }
}
