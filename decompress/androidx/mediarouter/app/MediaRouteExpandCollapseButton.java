// 
// Decompiled by Procyon v0.6.0
// 

package androidx.mediarouter.app;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View$OnClickListener;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.widget.AppCompatImageButton;

public class MediaRouteExpandCollapseButton extends AppCompatImageButton
{
    public final AnimationDrawable a;
    public final AnimationDrawable b;
    public final String c;
    public final String d;
    public boolean e;
    public View$OnClickListener f;
    
    public MediaRouteExpandCollapseButton(final Context context) {
        this(context, null);
    }
    
    public MediaRouteExpandCollapseButton(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public MediaRouteExpandCollapseButton(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final AnimationDrawable a = (AnimationDrawable)agw.a(context, 2131232305);
        this.a = a;
        final AnimationDrawable b = (AnimationDrawable)agw.a(context, 2131232304);
        this.b = b;
        final PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(bid.f(context, n), PorterDuff$Mode.SRC_IN);
        a.setColorFilter((ColorFilter)porterDuffColorFilter);
        b.setColorFilter((ColorFilter)porterDuffColorFilter);
        final String string = context.getString(2132018682);
        this.c = string;
        this.d = context.getString(2132018680);
        this.setImageDrawable(a.getFrame(0));
        this.setContentDescription((CharSequence)string);
        super.setOnClickListener((View$OnClickListener)new cbq(this));
    }
    
    public final void setOnClickListener(final View$OnClickListener f) {
        this.f = f;
    }
}
