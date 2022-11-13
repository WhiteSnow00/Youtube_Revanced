import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TextTrackView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gzi implements acko
{
    public final TextTrackView a;
    private final View b;
    
    public gzi(final ViewGroup viewGroup) {
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131625633, viewGroup, false);
        this.b = inflate;
        this.a = (TextTrackView)inflate.findViewById(2131431983);
    }
    
    public final View a() {
        return this.b;
    }
    
    public final void c(final acku acku) {
    }
    
    public final /* bridge */ void mN(final ackm ackm, final Object o) {
        final gzw b = (gzw)o;
        final TextTrackView a = this.a;
        a.b = b;
        a.requestLayout();
    }
}
