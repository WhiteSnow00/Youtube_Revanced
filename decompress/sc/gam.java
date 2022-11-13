import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import android.os.Handler;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class gam implements acvo
{
    static final long a;
    private static final long d;
    public final Set b;
    public acvq c;
    private final gbc e;
    private final Handler f;
    private final gal g;
    private final atke h;
    
    static {
        d = TimeUnit.SECONDS.toMillis(10L);
        a = TimeUnit.SECONDS.toMillis(4L);
    }
    
    public gam(final gbc e, final Handler f, final atke h, final gal g) {
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.b = new CopyOnWriteArraySet();
    }
    
    public final /* bridge */ void a(final Object o, final int n) {
        final acvq acvq = (acvq)o;
        this.c = null;
        this.e.h();
        final acvo i = acvq.i();
        if (i != null) {
            i.a((Object)acvq, n);
        }
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((acvo)iterator.next()).a((Object)acvq, n);
        }
    }
    
    protected abstract gbe c(final BottomUiContainer p0);
    
    public final acvp d() {
        return (acvp)this.h.a();
    }
    
    public final void e(final acvq acvq) {
        this.f(acvq, 3);
    }
    
    public final void f(final acvq acvq, final int n) {
        final BottomUiContainer b = this.e.b();
        if (b != null && acvq != null && acvq.equals(this.c)) {
            b.j(n);
        }
    }
    
    public final void g(final acvq acvq) {
        final BottomUiContainer b = this.e.b();
        if (b != null && acvq != null) {
            if (this.h(acvq)) {
                final gbd a = this.g.a(acvq);
                if (a != null) {
                    if (this.e.qV(a)) {
                        final hft p = BottomUiContainer.p((acvo)this, (Object)acvq);
                        if (acvq.k()) {
                            p.d();
                            p.c(3);
                            return;
                        }
                        this.e.g(a);
                        b.r(a, this.c(b), p);
                        if (!(b.p = this.i(acvq))) {
                            final aqi m = b.m;
                            if (m != null) {
                                m.d();
                            }
                        }
                    }
                }
            }
        }
    }
    
    protected boolean h(final acvq acvq) {
        return true;
    }
    
    protected boolean i(final acvq acvq) {
        return false;
    }
    
    public final /* bridge */ void mv(final Object o) {
        final acvq c = (acvq)o;
        this.c = c;
        this.e.i(this.g.a(c));
        final int f = c.f();
        if (f != -2) {
            long n;
            if (f != -1) {
                if (f != 0) {
                    n = c.f();
                }
                else {
                    n = gam.d;
                }
            }
            else {
                n = gam.a;
            }
            this.f.postDelayed((Runnable)new fsi(this, c, 2), n);
        }
        final acvo i = c.i();
        if (i != null) {
            i.mv((Object)c);
        }
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((acvo)iterator.next()).mv((Object)c);
        }
    }
}
