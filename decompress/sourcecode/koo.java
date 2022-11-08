import android.view.View$MeasureSpec;
import android.content.Context;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

final class koo extends FrameLayout
{
    public double a;
    
    public koo(final Context context) {
        super(context);
    }
    
    final void a() {
        if (this.a == 0.0) {
            return;
        }
        this.a = 0.0;
        this.requestLayout();
    }
    
    protected final void onMeasure(int size, int measureSpec) {
        if (this.a == 0.0) {
            super.onMeasure(size, measureSpec);
            return;
        }
        size = View$MeasureSpec.getSize(size);
        final double a = this.a;
        measureSpec = View$MeasureSpec.makeMeasureSpec(size, 1073741824);
        final double n = size;
        Double.isNaN(n);
        super.onMeasure(measureSpec, View$MeasureSpec.makeMeasureSpec((int)(n / a), 1073741824));
    }
}
