import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import android.widget.ImageView;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView$ScaleType;
import com.google.android.setupcompat.internal.TemplateLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aedy implements aedi
{
    public final TemplateLayout a;
    private final int b;
    private final ImageView$ScaleType c;
    private final Context d;
    
    public aedy(final TemplateLayout a, final AttributeSet set, int colorFilter) {
        this.a = a;
        final Context context = a.getContext();
        this.d = context;
        final ImageView b = this.b();
        if (b != null) {
            this.b = b.getLayoutParams().height;
            this.c = b.getScaleType();
        }
        else {
            this.b = 0;
            this.c = null;
        }
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aedq.i, colorFilter, 0);
        colorFilter = obtainStyledAttributes.getResourceId(0, 0);
        if (colorFilter != 0) {
            final ImageView b2 = this.b();
            if (b2 != null) {
                b2.setImageResource(colorFilter);
                if (colorFilter != 0) {
                    colorFilter = 0;
                }
                else {
                    colorFilter = 8;
                }
                b2.setVisibility(colorFilter);
                colorFilter = b2.getVisibility();
                if (this.a() != null) {
                    this.a().setVisibility(colorFilter);
                }
            }
        }
        final boolean boolean1 = obtainStyledAttributes.getBoolean(2, false);
        final ImageView b3 = this.b();
        if (b3 != null) {
            final ViewGroup$LayoutParams layoutParams = b3.getLayoutParams();
            colorFilter = b3.getMaxHeight();
            if (!boolean1) {
                colorFilter = this.b;
            }
            layoutParams.height = colorFilter;
            b3.setLayoutParams(layoutParams);
            ImageView$ScaleType scaleType;
            if (boolean1) {
                scaleType = ImageView$ScaleType.FIT_CENTER;
            }
            else {
                scaleType = this.c;
            }
            b3.setScaleType(scaleType);
        }
        colorFilter = obtainStyledAttributes.getColor(1, 0);
        if (colorFilter != 0) {
            final ImageView b4 = this.b();
            if (b4 != null) {
                b4.setColorFilter(colorFilter);
            }
        }
        obtainStyledAttributes.recycle();
    }
    
    public final FrameLayout a() {
        return (FrameLayout)this.a.h(2131431858);
    }
    
    public final ImageView b() {
        return (ImageView)this.a.h(2131431857);
    }
}
