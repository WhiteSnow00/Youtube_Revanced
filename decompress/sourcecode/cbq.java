import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.mediarouter.app.MediaRouteExpandCollapseButton;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cbq implements View$OnClickListener
{
    final /* synthetic */ MediaRouteExpandCollapseButton a;
    
    public cbq(final MediaRouteExpandCollapseButton a) {
        this.a = a;
    }
    
    public final void onClick(final View view) {
        final MediaRouteExpandCollapseButton a = this.a;
        final boolean e = a.e ^ true;
        a.e = e;
        if (e) {
            a.setImageDrawable((Drawable)a.a);
            this.a.a.start();
            final MediaRouteExpandCollapseButton a2 = this.a;
            a2.setContentDescription((CharSequence)a2.d);
        }
        else {
            a.setImageDrawable((Drawable)a.b);
            this.a.b.start();
            final MediaRouteExpandCollapseButton a3 = this.a;
            a3.setContentDescription((CharSequence)a3.c);
        }
        final View$OnClickListener f = this.a.f;
        if (f != null) {
            f.onClick(view);
        }
    }
}
