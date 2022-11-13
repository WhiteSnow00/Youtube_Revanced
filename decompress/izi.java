import java.util.Iterator;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izi implements fpk
{
    final Object a;
    private final int b;
    
    public izi(final YouTubeControlsOverlay a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public izi(final izd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        if (this.b != 0) {
            final Iterator iterator = ((izd)this.a).e.iterator();
            while (iterator.hasNext()) {
                ((fpk)iterator.next()).a();
            }
            return;
        }
        ((YouTubeControlsOverlay)this.a).U();
    }
}
