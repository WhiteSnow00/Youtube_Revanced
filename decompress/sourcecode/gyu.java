import android.os.Bundle;
import android.view.View;
import android.content.Context;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TextTrackView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gyu extends gyv
{
    final /* synthetic */ TextTrackView a;
    
    public gyu(final TextTrackView a, final Context context) {
        this.a = a;
        super(a, context, 2132017379);
    }
    
    protected final long a() {
        final TextTrackView a = this.a;
        return a.b(a.d.getX() - this.a.f);
    }
    
    protected final void b(long max) {
        max = Math.max(100L, max);
        final TextTrackView a = this.a;
        a.f((float)a.a(max));
        TextTrackView.g(this.a, max, gyw.b);
    }
    
    protected final void c(long min) {
        min = Math.min(min, this.a.d());
        final TextTrackView a = this.a;
        a.f((float)a.a(min));
        TextTrackView.g(this.a, min, gyw.b);
        this.performAccessibilityAction((View)this.a.d, 64, (Bundle)null);
        this.a.d.sendAccessibilityEvent(4);
    }
}
