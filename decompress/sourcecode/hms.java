import android.view.accessibility.AccessibilityManager;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hms
{
    public int a;
    public final wwu b;
    public final hqe c;
    public View d;
    public AccessibilityManager e;
    public wyb f;
    public boolean g;
    public boolean h;
    public int i;
    private final hqd j;
    
    public hms(final wwu b, final hqd j, final hqe c) {
        this.i = -1;
        this.b = b;
        this.j = j;
        this.c = c;
    }
    
    public final void a() {
        final View d = this.d;
        if (d != null) {
            iba.e(d, false);
            this.c(true);
        }
    }
    
    public final void b() {
        if (this.d != null) {
            if (this.e()) {
                this.a();
                if (this.f != null && this.a == 3) {
                    this.b.n().J(3, (wxz)new wws(this.f), (alff)null);
                    this.f = null;
                }
            }
        }
    }
    
    public final void c(final boolean b) {
        final hqk am = this.j.aM();
        if (am != null) {
            final pqq v = am.v;
            if (v != null) {
                v.c(b);
            }
        }
    }
    
    public final boolean d() {
        return this.d != null && this.g;
    }
    
    public final boolean e() {
        final View d = this.d;
        return d != null && d.getVisibility() == 0;
    }
}
