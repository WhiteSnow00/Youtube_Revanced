import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ftr
{
    public final View d;
    public final acgs e;
    public Object f;
    
    public ftr(final View d, final acgs e) {
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
    }
    
    public static final acgo e(final int n) {
        final ftp c = new ftp(n);
        final acgn a = acgo.a();
        a.c(true);
        a.c = (acgq)c;
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
