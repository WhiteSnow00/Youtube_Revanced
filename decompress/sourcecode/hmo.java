import java.util.concurrent.Executor;
import android.view.accessibility.AccessibilityManager;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hmo implements View$OnClickListener
{
    public int a;
    public final hqa b;
    public final wwu c;
    public View d;
    public hmn e;
    public AccessibilityManager f;
    public Runnable g;
    public wyb h;
    public int i;
    public final aagm j;
    private final hqd k;
    
    public hmo(final hqa b, final aagm j, final wwu c, final hqd k, final byte[] array) {
        this.i = 0;
        this.b = b;
        this.j = j;
        this.c = c;
        this.k = k;
    }
    
    final void a() {
        final View d = this.d;
        if (d != null) {
            iba.e(d, false);
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
        final hqk am = this.k.aM();
        if (am != null) {
            final pqq v = am.v;
            if (v != null) {
                v.c(b);
            }
        }
    }
    
    public final void d() {
        if (this.h != null && this.a == 3) {
            this.c.n().J(3, (wxz)new wws(this.h), (alff)null);
            this.h = null;
        }
    }
    
    public final void e() {
        this.j.c((aexg)gku.s, (Executor)afsl.a);
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
                final hmn e = this.e;
                if (e != null) {
                    ((hoa)e).aj.c("r_eod");
                }
            }
        }
    }
}
