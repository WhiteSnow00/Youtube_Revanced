import java.util.concurrent.Executor;
import android.view.accessibility.AccessibilityManager;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hni implements View$OnClickListener
{
    public int a;
    public final hqv b;
    public final wyv c;
    public View d;
    public hnh e;
    public AccessibilityManager f;
    public Runnable g;
    public xab h;
    public int i;
    public final qqr j;
    private final hqy k;
    
    public hni(final hqv b, final qqr j, final wyv c, final hqy k) {
        this.i = 0;
        this.b = b;
        this.j = j;
        this.c = c;
        this.k = k;
    }
    
    final void a() {
        final View d = this.d;
        if (d != null) {
            hnu.f(d, false);
            this.b.c(this.i);
            this.i = 0;
            this.c(true);
        }
        this.d = null;
        final Runnable g = this.g;
        if (g != null) {
            g.run();
            this.g = null;
        }
    }
    
    public final void b() {
        this.onClick(this.d);
    }
    
    public final void c(final boolean b) {
        final hrf am = this.k.aM();
        if (am != null) {
            final psb v = am.v;
            if (v != null) {
                v.c(b);
            }
        }
    }
    
    public final void d() {
        if (this.h != null && this.a == 3) {
            this.c.pF().J(3, (wzz)new wyt(this.h), (alhi)null);
            this.h = null;
        }
    }
    
    public final void e() {
        this.j.b((aezf)glc.s, (Executor)afum.a);
    }
    
    public final boolean f() {
        final View d = this.d;
        return d != null && d.getVisibility() == 0;
    }
    
    public final void onClick(final View view) {
        if (this.d != null) {
            if (this.f()) {
                this.e();
                this.a();
                this.a |= 0x2;
                this.d();
                final hnh e = this.e;
                if (e != null) {
                    ((how)e).ai.c("r_eod");
                }
            }
        }
    }
}
