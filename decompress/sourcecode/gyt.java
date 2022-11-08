import android.os.Bundle;
import android.view.View;
import android.content.Context;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TextTrackView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gyt extends gyv
{
    final /* synthetic */ TextTrackView a;
    
    public gyt(final TextTrackView a, final Context context) {
        this.a = a;
        super(a, context, 2132017290);
    }
    
    protected final long a() {
        final TextTrackView a = this.a;
        return a.b(a.c.getX());
    }
    
    protected final void b(long max) {
        max = Math.max(0L, max);
        final TextTrackView a = this.a;
        a.e((float)a.a(max));
        TextTrackView.g(this.a, max, gyw.a);
    }
    
    protected final void c(long min) {
        min = Math.min(min, this.a.d() - 100L);
        final TextTrackView a = this.a;
        a.e((float)a.a(min));
        TextTrackView.g(this.a, min, gyw.a);
        this.performAccessibilityAction((View)this.a.c, 64, (Bundle)null);
        this.a.c.sendAccessibilityEvent(4);
    }
}
