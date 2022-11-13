import android.view.View$OnClickListener;
import java.util.concurrent.TimeUnit;
import com.google.android.apps.youtube.app.player.overlay.accessibility.PlayerAccessibilitySettingsEduController$LifecycleObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jac
{
    public static final long a;
    public final bu b;
    public final oby c;
    public final acvy d;
    public final abpu e;
    public final PlayerAccessibilitySettingsEduController$LifecycleObserver f;
    public final wyw g;
    public final zlv h;
    public final zmf i;
    public final vaf j;
    public final bx k;
    public final bx l;
    
    static {
        a = TimeUnit.DAYS.toMillis(90L);
    }
    
    public jac(final bu b, final bx l, final bx k, final vaf j, final abpu e, final acvy d, final oby c, final wyw g, final zlv h, final zmf i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
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
        return (View$OnClickListener)new ixg(this, 19);
    }
}
