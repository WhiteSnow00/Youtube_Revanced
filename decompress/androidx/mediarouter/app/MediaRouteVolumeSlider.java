// 
// Decompiled by Procyon v0.6.0
// 

package androidx.mediarouter.app;

import android.graphics.drawable.LayerDrawable;
import android.graphics.PorterDuff$Mode;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatSeekBar;

public class MediaRouteVolumeSlider extends AppCompatSeekBar
{
    public int a;
    public int b;
    private final float c;
    private boolean d;
    private Drawable e;
    
    public MediaRouteVolumeSlider(final Context context) {
        this(context, null);
    }
    
    public MediaRouteVolumeSlider(final Context context, final AttributeSet set) {
        this(context, set, 2130970228);
    }
    
    public MediaRouteVolumeSlider(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.c = bid.d(context);
    }
    
    public final void a(final boolean d) {
        if (this.d == d) {
            return;
        }
        this.d = d;
        Drawable e;
        if (d) {
            e = null;
        }
        else {
            e = this.e;
        }
        super.setThumb(e);
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int n;
        if (this.isEnabled()) {
            n = 255;
        }
        else {
            n = (int)(this.c * 255.0f);
        }
        this.e.setColorFilter(this.a, PorterDuff$Mode.SRC_IN);
        this.e.setAlpha(n);
        Drawable drawable;
        if ((drawable = this.getProgressDrawable()) instanceof LayerDrawable) {
            final LayerDrawable layerDrawable = (LayerDrawable)this.getProgressDrawable();
            drawable = layerDrawable.findDrawableByLayerId(16908301);
            layerDrawable.findDrawableByLayerId(16908288).setColorFilter(this.b, PorterDuff$Mode.SRC_IN);
        }
        drawable.setColorFilter(this.a, PorterDuff$Mode.SRC_IN);
        drawable.setAlpha(n);
    }
    
    public final void setThumb(Drawable drawable) {
        this.e = drawable;
        if (this.d) {
            drawable = null;
        }
        super.setThumb(drawable);
    }
}
