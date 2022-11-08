import android.widget.SeekBar;
import android.widget.SeekBar$OnSeekBarChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cbl implements SeekBar$OnSeekBarChangeListener
{
    public final /* synthetic */ cbn a;
    private final Runnable b;
    
    public cbl(final cbn a) {
        this.a = a;
        this.b = (Runnable)new aur(this, 16);
    }
    
    public final void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
        if (b) {
            final ccs ccs = (ccs)seekBar.getTag();
            final int x = cbn.X;
            ccs.e(n);
        }
    }
    
    public final void onStartTrackingTouch(final SeekBar seekBar) {
        final cbn a = this.a;
        if (a.v != null) {
            a.t.removeCallbacks(this.b);
        }
        this.a.v = (ccs)seekBar.getTag();
    }
    
    public final void onStopTrackingTouch(final SeekBar seekBar) {
        this.a.t.postDelayed(this.b, 500L);
    }
}
