import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import android.os.Handler;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class gae implements actk
{
    static final long a;
    private static final long d;
    public final Set b;
    public actm c;
    private final gau e;
    private final Handler f;
    private final gad g;
    private final atjj h;
    
    static {
        d = TimeUnit.SECONDS.toMillis(10L);
        a = TimeUnit.SECONDS.toMillis(4L);
    }
    
    public gae(final gau e, final Handler f, final atjj h, final gad g) {
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.b = new CopyOnWriteArraySet();
    }
    
    protected abstract gaw c(final BottomUiContainer p0);
    
    public final actl d() {
        return (actl)this.h.a();
    }
    
    public final void e(final actm actm) {
        this.f(actm, 3);
    }
    
    public final void f(final actm actm, final int n) {
        final BottomUiContainer b = this.e.b();
        if (b != null && actm != null && actm.equals(this.c)) {
            b.j(n);
        }
    }
    
    public final void g(final actm actm) {
        final BottomUiContainer b = this.e.b();
        if (b != null && actm != null) {
            if (this.h(actm)) {
                final gav a = this.g.a(actm);
                if (a != null) {
                    if (this.e.n(a)) {
                        final hez p = BottomUiContainer.p((actk)this, (Object)actm);
                        if (actm.k()) {
                            p.e();
                            p.d(3);
                            return;
                        }
                        this.e.g(a);
                        b.r(a, this.c(b), p);
                        if (!(b.p = this.i(actm))) {
                            final aqh m = b.m;
                            if (m != null) {
                                m.d();
                            }
                        }
                    }
                }
            }
        }
    }
    
    protected boolean h(final actm actm) {
        return true;
    }
    
    protected boolean i(final actm actm) {
        return false;
    }
}
