import android.widget.SeekBar;
import android.widget.SeekBar$OnSeekBarChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cbp implements SeekBar$OnSeekBarChangeListener
{
    public final cbr a;
    private final Runnable b;
    
    public cbp(final cbr a) {
        this.a = a;
        this.b = new asa(this, 17);
    }
    
    public final void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
        if (b) {
            final ccw ccw = (ccw)seekBar.getTag();
            final int x = cbr.X;
            ccw.e(n);
        }
    }
    
    public final void onStartTrackingTouch(final SeekBar seekBar) {
        final cbr a = this.a;
        if (a.v != null) {
            a.t.removeCallbacks(this.b);
        }
        this.a.v = (ccw)seekBar.getTag();
    }
    
    public final void onStopTrackingTouch(final SeekBar seekBar) {
        this.a.t.postDelayed(this.b, 500L);
    }
}
