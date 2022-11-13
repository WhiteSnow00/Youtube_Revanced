import android.view.accessibility.AccessibilityManager;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hnm
{
    public int a;
    public final wyv b;
    public final hqz c;
    public View d;
    public AccessibilityManager e;
    public xab f;
    public boolean g;
    public boolean h;
    public int i;
    private final hqy j;
    
    public hnm(final wyv b, final hqy j, final hqz c) {
        this.i = -1;
        this.b = b;
        this.j = j;
        this.c = c;
    }
    
    public final void a() {
        final View d = this.d;
        if (d != null) {
            hnu.f(d, false);
            this.c(true);
        }
    }
    
    public final void b() {
        if (this.d != null) {
            if (this.e()) {
                this.a();
                if (this.f != null && this.a == 3) {
                    this.b.pF().J(3, (wzz)new wyt(this.f), (alhi)null);
                    this.f = null;
                }
            }
        }
    }
    
    public final void c(final boolean b) {
        final hrf am = this.j.aM();
        if (am != null) {
            final psb v = am.v;
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
