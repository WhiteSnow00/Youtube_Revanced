import android.os.Handler;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kag extends gec implements ger
{
    public final InlinePlaybackLifecycleController d;
    public final gjd e;
    public final Handler f;
    public gee g;
    private final gem h;
    
    public kag(final gem h, final InlinePlaybackLifecycleController d, final gjd e, final Handler f) {
        this.h = h;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    protected final boolean l(final ged ged, final int n) {
        if (n == 2 && !this.h.m()) {
            this.d.v();
        }
        return true;
    }
}
