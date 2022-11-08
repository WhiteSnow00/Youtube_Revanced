import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class owx implements ddx, ddw
{
    public final int a;
    public final int b;
    public final ddo c;
    public final owu d;
    public volatile dbz e;
    public volatile boolean f;
    public volatile ddx g;
    public final /* synthetic */ owy h;
    private volatile ddw i;
    private volatile boolean j;
    private volatile ListenableFuture k;
    
    public owx(final owy h, final owu d, final int a, final int b, final ddo c) {
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final Class a() {
        return this.h.d;
    }
    
    public final void b(final Object o) {
        if (this.f) {
            return;
        }
        this.i.b(o);
    }
    
    public final void d() {
        final ddx g = this.g;
        if (g != null) {
            g.d();
        }
    }
    
    public final void e(final Exception ex) {
        if (!this.f && !this.j) {
            final ddn a = owy.a;
            if (ex instanceof ddc && ((ddc)ex).a == 403) {
                this.j = true;
                cll.h((Object)this.h.c);
                this.h.c.b(this.d);
                this.f(this.e, this.i);
                return;
            }
        }
        this.i.e(ex);
    }
    
    public final void f(final dbz e, final ddw i) {
        this.e = e;
        this.i = i;
        if (this.f) {
            return;
        }
        final oxd c = this.h.c;
        cll.h((Object)c);
        afva.w(this.k = afva.m((Object)c.a(this.d)), (afsz)new fkb(this, i, 7), (Executor)afsl.a);
        if (this.f) {
            this.lq();
        }
    }
    
    public final int g() {
        return 2;
    }
    
    public final void lq() {
        this.f = true;
        final ddx g = this.g;
        if (g != null) {
            g.lq();
        }
    }
}
