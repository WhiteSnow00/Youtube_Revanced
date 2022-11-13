import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import android.os.Build$VERSION;
import android.os.VibrationEffect;
import android.os.Vibrator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abaa implements abao, abdp
{
    private final Vibrator a;
    private final VibrationEffect b;
    private final VibrationEffect c;
    private boolean d;
    
    public abaa(final Vibrator a) {
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
                    ttr.d("Failed to execute markers haptics vibrate.", (Throwable)ex);
                }
            }
        }
    }
    
    public final void a() {
        this.b(this.c, 25L);
    }
    
    public final void c(final TimelineMarker timelineMarker, final TimelineMarker timelineMarker2, final abea abea, final int n) {
        if ((abea == abea.f || abea == abea.g) && n == 2) {
            if (timelineMarker2 != null) {
                if (abea == abea.g && !this.d) {
                    return;
                }
                this.b(this.b, 10L);
            }
        }
    }
    
    public final void d(final abea abea) {
    }
    
    public final void oR(final abea abea, final boolean d) {
        if (abea != abea.g) {
            return;
        }
        this.d = d;
    }
}
