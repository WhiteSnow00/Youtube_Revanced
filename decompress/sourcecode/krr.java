import android.view.MenuItem;

// 
// Decompiled by Procyon v0.6.0
// 

final class krr implements fzi
{
    final /* synthetic */ krs a;
    private final aioe b;
    private final CharSequence c;
    private final ardu d;
    
    public krr(final krs a, final aioe b, final CharSequence c, final arcq arcq, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = arcq.u();
    }
    
    public final int j() {
        return this.d.m();
    }
    
    public final int k() {
        return 0;
    }
    
    public final fyz l() {
        return null;
    }
    
    public final boolean n() {
        return true;
    }
    
    public final void o(final MenuItem menuItem) {
        final CharSequence c = this.c;
        if (c != null) {
            menuItem.setTitle(c);
        }
    }
    
    public final boolean p() {
        this.a.e.a(this.b);
        return true;
    }
    
    public final int q() {
        return this.d.a;
    }
    
    public final CharSequence r() {
        return "";
    }
}
