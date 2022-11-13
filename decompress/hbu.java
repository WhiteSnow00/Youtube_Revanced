import com.google.research.xeno.effect.Control$FloatSetting;
import android.widget.SeekBar;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.ShortsIntensitySliderView;
import android.widget.LinearLayout$LayoutParams;
import android.widget.SeekBar$OnSeekBarChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hbu implements SeekBar$OnSeekBarChangeListener
{
    final int a;
    final LinearLayout$LayoutParams b;
    final ShortsIntensitySliderView c;
    
    public hbu(final ShortsIntensitySliderView c, final int a, final LinearLayout$LayoutParams b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
        if (b) {
            final Control$FloatSetting a = this.c.a;
            if (a != null) {
                a.b(ShortsIntensitySliderView.a(n));
                this.c.b.setText((CharSequence)String.valueOf(n));
                this.b.leftMargin = (int)((seekBar.getWidth() - this.a) * ShortsIntensitySliderView.a(n));
            }
        }
    }
    
    public final void onStartTrackingTouch(final SeekBar seekBar) {
        this.c.b.setVisibility(0);
    }
    
    public final void onStopTrackingTouch(final SeekBar seekBar) {
        this.c.b.setVisibility(4);
    }
}
