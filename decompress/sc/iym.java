import android.view.View;
import com.google.android.apps.youtube.app.player.overlay.SubtitleButtonController;
import android.view.View$OnLongClickListener;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iym implements View$OnClickListener, View$OnLongClickListener
{
    final SubtitleButtonController a;
    private final Runnable b;
    
    public iym(final SubtitleButtonController a, final Runnable b) {
        this.a = a;
        this.b = b;
    }
    
    public final void onClick(final View view) {
        this.a.h(false);
        final SubtitleButtonController a = this.a;
        if (a.f.isPresent() && a.d.b(abkb.d)) {
            a.e.pF().J(3, (wzz)new wyt((xab)a.f.get()), (alhi)null);
        }
        this.b.run();
    }
    
    public final boolean onLongClick(final View view) {
        this.a.h(true);
        final SubtitleButtonController a = this.a;
        if (a.f.isPresent() && a.d.b(abkb.d)) {
            a.e.pF().J(1025, (wzz)new wyt((xab)a.f.get()), (alhi)null);
        }
        this.b.run();
        return true;
    }
}
