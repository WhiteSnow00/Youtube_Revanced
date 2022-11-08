import android.view.MenuItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jwr implements fzi
{
    private final vax a;
    private final aioe b;
    private final CharSequence c;
    private final agyc d;
    private final wwv e;
    private final ardu f;
    
    public jwr(final arcq arcq, final vax a, final aioe b, final CharSequence c, final agyc d, final wwv e, final byte[] array, final byte[] array2) {
        this.f = arcq.u();
        a.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final int j() {
        return this.f.m();
    }
    
    public final int k() {
        return 0;
    }
    
    public final fyz l() {
        return null;
    }
    
    public final void m() {
        final agyc d = this.d;
        if (d != null && !d.H()) {
            final wwv e = this.e;
            if (e != null) {
                e.t((wxz)new wws(d), (alff)null);
            }
        }
    }
    
    public final boolean n() {
        return false;
    }
    
    public final void o(final MenuItem menuItem) {
        menuItem.setTitle(this.c);
    }
    
    public final boolean p() {
        final agyc d = this.d;
        if (d != null && !d.H()) {
            final wwv e = this.e;
            if (e != null) {
                e.J(3, (wxz)new wws(d), (alff)null);
            }
        }
        final aioe b = this.b;
        if (b != null) {
            this.a.a(b);
            return true;
        }
        return false;
    }
    
    public final int q() {
        return this.f.a;
    }
    
    public final CharSequence r() {
        return this.c;
    }
}
