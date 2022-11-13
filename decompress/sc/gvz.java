import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.view.View;
import android.content.Context;
import android.widget.ViewSwitcher$ViewFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gvz implements ViewSwitcher$ViewFactory
{
    public final Context a;
    public final acan b;
    
    public gvz(final Context a, final acan b) {
        this.a = a;
        this.b = b;
    }
    
    public final View makeView() {
        final Context a = this.a;
        final acan b = this.b;
        final YouTubeTextView youTubeTextView = new YouTubeTextView(a);
        ((TextView)youTubeTextView).setGravity(17);
        ((TextView)youTubeTextView).setTextSize((float)a.getResources().getDimensionPixelSize(2131169651));
        ((TextView)youTubeTextView).setTextColor(tpe.cx(a, 2130970908).orElse(a.getResources().getColor(2131102421)));
        ((TextView)youTubeTextView).setTypeface(b.a(a));
        return (View)youTubeTextView;
    }
}
