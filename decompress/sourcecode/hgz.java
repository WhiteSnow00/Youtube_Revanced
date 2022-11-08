import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hgz implements trb
{
    public boolean a;
    private final View b;
    private final wwv c;
    private final wyb d;
    private boolean e;
    private boolean f;
    
    public hgz(final View b, final wwv c, final wyb d) {
        this.f = true;
        this.b = b;
        c.getClass();
        this.c = c;
        this.d = d;
    }
    
    private final void d() {
        final View b = this.b;
        if (b == null) {
            return;
        }
        final boolean e = this.e;
        int visibility = 0;
        final boolean enabled = e && this.f;
        b.setEnabled(enabled);
        final View b2 = this.b;
        if (!enabled) {
            visibility = 4;
        }
        b2.setVisibility(visibility);
    }
    
    public final void b() {
        this.f = false;
        this.d();
    }
    
    public final void c() {
        this.f = true;
        this.d();
    }
}
