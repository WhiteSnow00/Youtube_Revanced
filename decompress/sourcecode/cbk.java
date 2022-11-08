import android.widget.SeekBar;

// 
// Decompiled by Procyon v0.6.0
// 

final class cbk extends bkt
{
    final /* synthetic */ cbn h;
    
    public cbk(final cbn h) {
        this.h = h;
    }
    
    public final void j(final ccs ccs) {
        this.h.oB(true);
    }
    
    public final void l() {
        this.h.oB(false);
    }
    
    public final void m(final ccs ccs) {
        final SeekBar seekBar = this.h.A.get(ccs);
        final int n = ccs.n;
        if (seekBar != null && this.h.v != ccs) {
            seekBar.setProgress(n);
        }
    }
}
