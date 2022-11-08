import android.view.View$OnClickListener;
import java.util.concurrent.TimeUnit;
import com.google.android.apps.youtube.app.player.overlay.accessibility.PlayerAccessibilitySettingsEduController$LifecycleObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izd
{
    public static final long a;
    public final bu b;
    public final oas c;
    public final actu d;
    public final abns e;
    public final PlayerAccessibilitySettingsEduController$LifecycleObserver f;
    public final wwv g;
    public final zjy h;
    public final zki i;
    public final uyf j;
    public final bx k;
    public final bx l;
    
    static {
        a = TimeUnit.DAYS.toMillis(90L);
    }
    
    public izd(final bu b, final bx l, final bx k, final uyf j, final abns e, final actu d, final oas c, final wwv g, final zjy h, final zki i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        b.getClass();
        this.b = b;
        this.l = l;
        this.k = k;
        this.j = j;
        this.e = e;
        this.d = d;
        this.c = c;
        this.g = g;
        this.h = h;
        this.i = i;
        this.f = new PlayerAccessibilitySettingsEduController$LifecycleObserver(this);
    }
    
    public final View$OnClickListener a() {
        return (View$OnClickListener)new iwh(this, 19);
    }
}
