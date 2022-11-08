import android.view.View;
import com.google.android.apps.youtube.app.player.overlay.SubtitleButtonController;
import android.view.View$OnLongClickListener;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixo implements View$OnClickListener, View$OnLongClickListener
{
    final /* synthetic */ SubtitleButtonController a;
    private final Runnable b;
    
    public ixo(final SubtitleButtonController a, final Runnable b) {
        this.a = a;
        this.b = b;
    }
    
    public final void onClick(final View view) {
        this.a.h(false);
        final SubtitleButtonController a = this.a;
        if (a.f.isPresent() && a.d.b(abij.d)) {
            a.e.n().J(3, (wxz)new wws((wyb)a.f.get()), (alff)null);
        }
        this.b.run();
    }
    
    public final boolean onLongClick(final View view) {
        this.a.h(true);
        final SubtitleButtonController a = this.a;
        if (a.f.isPresent() && a.d.b(abij.d)) {
            a.e.n().J(1025, (wxz)new wws((wyb)a.f.get()), (alff)null);
        }
        this.b.run();
        return true;
    }
}
