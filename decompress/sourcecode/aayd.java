import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import android.os.Build$VERSION;
import android.os.VibrationEffect;
import android.os.Vibrator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aayd implements aayr, abbv
{
    private final Vibrator a;
    private final VibrationEffect b;
    private final VibrationEffect c;
    private boolean d;
    
    public aayd(final Vibrator a) {
        this.a = a;
        if (Build$VERSION.SDK_INT >= 29) {
            this.b = VibrationEffect.createPredefined(2);
            this.c = VibrationEffect.createPredefined(0);
            return;
        }
        this.b = VibrationEffect.createOneShot(10L, 96);
        this.c = VibrationEffect.createOneShot(25L, 255);
    }
    
    private final void b(final VibrationEffect vibrationEffect, final long n) {
        if (this.a.hasVibrator()) {
            if (Build$VERSION.SDK_INT != 26) {
                try {
                    if (Build$VERSION.SDK_INT <= 26) {
                        this.a.vibrate(n);
                        return;
                    }
                    if (vibrationEffect == null) {
                        return;
                    }
                    this.a.vibrate(vibrationEffect);
                }
                catch (final Exception ex) {
                    trn.d("Failed to execute markers haptics vibrate.", (Throwable)ex);
                }
            }
        }
    }
    
    public final void a() {
        this.b(this.c, 25L);
    }
    
    public final void c(final TimelineMarker timelineMarker, final TimelineMarker timelineMarker2, final abcg abcg, final int n) {
        if ((abcg == abcg.f || abcg == abcg.g) && n == 2) {
            if (timelineMarker2 != null) {
                if (abcg == abcg.g && !this.d) {
                    return;
                }
                this.b(this.b, 10L);
            }
        }
    }
    
    public final void oR(final abcg abcg, final boolean d) {
        if (abcg != abcg.g) {
            return;
        }
        this.d = d;
    }
}
