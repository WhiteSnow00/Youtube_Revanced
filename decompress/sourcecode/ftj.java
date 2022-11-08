import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ftj
{
    public final View d;
    public final aceo e;
    public Object f;
    
    public ftj(final View d, final aceo e) {
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
    }
    
    public static final acek e(final int n) {
        final fth c = new fth(n);
        final acej a = acek.a();
        a.c(true);
        a.c = (acem)c;
        return a.a();
    }
    
    public abstract void b(final Object p0);
    
    public void c() {
        this.d.setVisibility(8);
        this.d(true);
        this.f = null;
    }
    
    public final void d(final boolean clickable) {
        this.d.setClickable(clickable);
    }
}
