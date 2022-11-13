import android.widget.SeekBar;

// 
// Decompiled by Procyon v0.6.0
// 

final class cbl extends bku
{
    final cbo h;
    
    public cbl(final cbo h) {
        this.h = h;
    }
    
    @Override
    public final void j(final cct cct) {
        this.h.oB(true);
    }
    
    @Override
    public final void l() {
        this.h.oB(false);
    }
    
    @Override
    public final void m(final cct cct) {
        final SeekBar seekBar = this.h.A.get(cct);
        final int n = cct.n;
        if (seekBar != null && this.h.v != cct) {
            seekBar.setProgress(n);
        }
    }
}
