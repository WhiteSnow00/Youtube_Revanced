import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jcw implements itw
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public jcw(final jaz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcw(final jcz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcw(final lgz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void oX(final boolean b) {
        final int b2 = this.b;
        if (b2 == 0) {
            ((jcz)this.a).d = false;
            return;
        }
        if (b2 != 1) {
            ((lgz)this.a).c(false);
            return;
        }
        ((jaz)this.a).b.tr((Object)false);
    }
    
    @Override
    public final void y(final boolean b) {
        final int b2 = this.b;
        if (b2 == 0) {
            ((jcz)this.a).d = true;
            return;
        }
        if (b2 != 1) {
            ((lgz)this.a).c(true);
            return;
        }
        ((jaz)this.a).b.tr((Object)true);
    }
}
