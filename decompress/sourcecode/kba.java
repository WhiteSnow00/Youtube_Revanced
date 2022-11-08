import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kba extends gec implements ger, fjo
{
    private final fjp d;
    private final InlinePlaybackLifecycleController e;
    
    public kba(final fjp d, final InlinePlaybackLifecycleController e) {
        this.d = d;
        this.e = e;
    }
    
    public final boolean l(final ged ged, final int n) {
        boolean b = true;
        if (n == 1) {
            b = (this.d.j().d() && b);
        }
        return b;
    }
    
    @Override
    public final void oL(final fkk fkk, final fkk fkk2) {
        if (fkk.e() && !fkk2.d()) {
            this.e.u();
            return;
        }
        if (!fkk.d() && fkk2.d()) {
            this.k();
        }
    }
}
