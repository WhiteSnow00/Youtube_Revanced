// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference.internal;

import android.view.View$MeasureSpec;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;

public class PreferenceImageView extends ImageView
{
    private int a;
    private int b;
    
    public PreferenceImageView(final Context context) {
        this(context, null);
    }
    
    public PreferenceImageView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public PreferenceImageView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = Integer.MAX_VALUE;
        this.b = Integer.MAX_VALUE;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, cfj.j, n, 0);
        this.setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(3, Integer.MAX_VALUE));
        this.setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(2, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }
    
    public final int getMaxHeight() {
        return this.b;
    }
    
    public final int getMaxWidth() {
        return this.a;
    }
    
    protected final void onMeasure(int measureSpec, final int n) {
        final int mode = View$MeasureSpec.getMode(measureSpec);
        final int n2 = 0;
        int n3 = mode;
        int measureSpec2 = 0;
        Label_0071: {
            if (mode != Integer.MIN_VALUE) {
                measureSpec2 = measureSpec;
                if (mode != 0) {
                    break Label_0071;
                }
                n3 = 0;
            }
            final int size = View$MeasureSpec.getSize(measureSpec);
            final int a = this.a;
            measureSpec2 = measureSpec;
            if (a != Integer.MAX_VALUE) {
                if (a >= size) {
                    measureSpec2 = measureSpec;
                    if (n3 != 0) {
                        break Label_0071;
                    }
                }
                measureSpec2 = View$MeasureSpec.makeMeasureSpec(a, Integer.MIN_VALUE);
            }
        }
        int mode2 = View$MeasureSpec.getMode(n);
        Label_0139: {
            if (mode2 != Integer.MIN_VALUE) {
                measureSpec = n;
                if (mode2 != 0) {
                    break Label_0139;
                }
                mode2 = n2;
            }
            final int size2 = View$MeasureSpec.getSize(n);
            final int b = this.b;
            measureSpec = n;
            if (b != Integer.MAX_VALUE) {
                if (b >= size2) {
                    measureSpec = n;
                    if (mode2 != 0) {
                        break Label_0139;
                    }
                }
                measureSpec = View$MeasureSpec.makeMeasureSpec(b, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(measureSpec2, measureSpec);
    }
    
    public final void setMaxHeight(final int b) {
        super.setMaxHeight(this.b = b);
    }
    
    public final void setMaxWidth(final int a) {
        super.setMaxWidth(this.a = a);
    }
}
