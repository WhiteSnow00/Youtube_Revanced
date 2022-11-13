import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.View$MeasureSpec;
import android.view.View;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gfc implements foh
{
    private final Rect a;
    private final gfe b;
    
    public gfc(final gfe b) {
        this.b = b;
        this.a = new Rect();
    }
    
    public final int b() {
        return -16777216;
    }
    
    public final void c(final View view) {
        final gfe b = this.b;
        final Rect a = this.a;
        final Rect a2 = b.a(b.c);
        final Rect c = b.c;
        a.set(a2);
        a.offset(-c.left, -c.top);
        view.layout(this.a.left, this.a.top, this.a.right, this.a.bottom);
    }
    
    public final void d(final View view, int size, int size2) {
        final gfe b = this.b;
        size = View$MeasureSpec.getSize(size);
        size2 = View$MeasureSpec.getSize(size2);
        if (size2 > 0 && size > 0) {
            b.b = size / (float)size2;
            b.c = new Rect(0, 0, size, size2);
            b.b();
        }
        else {
            b.b = 0.0f;
        }
        final gfe b2 = this.b;
        final Rect a = b2.a(b2.c);
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(View$MeasureSpec.makeMeasureSpec(a.width(), 1073741824), 0, layoutParams.width), ViewGroup.getChildMeasureSpec(View$MeasureSpec.makeMeasureSpec(a.height(), 1073741824), 0, layoutParams.height));
    }
}
