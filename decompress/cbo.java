import android.widget.SeekBar;

// 
// Decompiled by Procyon v0.6.0
// 

final class cbo extends bkx
{
    final cbr a;
    
    public cbo(final cbr a) {
        this.a = a;
    }
    
    public final void h(final ccw ccw) {
        this.a.oz(true);
    }
    
    public final void j() {
        this.a.oz(false);
    }
    
    public final void k(final ccw ccw) {
        final SeekBar seekBar = this.a.A.get(ccw);
        final int n = ccw.n;
        if (seekBar != null && this.a.v != ccw) {
            seekBar.setProgress(n);
        }
    }
}
