import android.view.View$MeasureSpec;
import android.util.Size;
import android.graphics.Point;
import android.widget.PopupWindow;
import android.view.View;
import android.content.Context;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acqm extends ViewGroup
{
    public final Context a;
    public View b;
    public PopupWindow c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    private View l;
    
    public acqm(final Context a) {
        super(a);
        this.a = a;
    }
    
    public final void a(final View l) {
        this.removeAllViews();
        this.addView(l);
        this.l = l;
    }
    
    protected final void onLayout(final boolean b, int n, int n2, int g, final int n3) {
        if (!b) {
            return;
        }
        n = g - n;
        n2 = n3 - n2;
        this.l.layout(0, 0, n, n2);
        g = this.g;
        g += g;
        n += g;
        n2 += g;
        final Point c = actc.c(this.a, this.b, this.j, n, n2, this.d, this.e, this.f);
        this.c.update(c.x, c.y, n, n2, true);
    }
    
    protected final void onMeasure(int n, int n2) {
        final Context a = this.a;
        final View b = this.b;
        final int j = this.j;
        final int d = this.d;
        final int e = this.e;
        final int f = this.f;
        final Point b2 = actc.b(a);
        final int[] array = new int[2];
        b.getLocationInWindow(array);
        final int n3 = array[1];
        final int height = b.getHeight();
        final int n4 = array[0];
        final int width = b.getWidth();
        final int n5 = b2.y - (height + n3 + f) - d;
        final int n6 = b2.y - e - d;
        final int n7 = b2.x - (width + n4 + f) - d;
        final int n8 = b2.x - (d + d);
        final int x = b2.x;
        final int n9 = array[0];
        int n10 = x - n9 - d;
        final int n11 = n9 + b.getWidth() - d;
        int n12 = 0;
        while (true) {
            switch (j) {
                default: {
                    throw new IllegalStateException();
                }
                case 8: {
                    n12 = n6;
                    n10 = n4 - f - d;
                    break;
                }
                case 7: {
                    n12 = n6;
                    n10 = n7;
                    break;
                }
                case 4: {
                    n12 = n3 - f - e;
                    break;
                }
                case 6: {
                    n10 = n11;
                    continue;
                }
                case 5: {
                    n10 = n8;
                    continue;
                }
                case 3: {
                    n10 = n11;
                    n12 = n5;
                    break;
                }
                case 2: {
                    n10 = n8;
                    n12 = n5;
                    break;
                }
                case 1: {
                    n12 = n5;
                    break;
                }
            }
            break;
        }
        final Size size = new Size(Math.min(n10, n8), Math.min(n12, n6));
        if (!this.k) {
            this.k = true;
            this.l.setMinimumWidth(this.h);
            final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
            this.l.measure(measureSpec, measureSpec);
            final int measuredHeight = this.l.getMeasuredHeight();
            final int height2 = size.getHeight();
            final int g = this.g;
            if (measuredHeight > height2 - (g + g)) {
                final int i = this.j;
                int k = 8;
                if (i != 3) {
                    if (i == 6) {
                        k = k;
                    }
                    else {
                        k = 7;
                    }
                }
                this.j = k;
                this.measure(n, n2);
                return;
            }
        }
        final View l = this.l;
        n2 = size.getWidth();
        n = this.g;
        n2 = View$MeasureSpec.makeMeasureSpec(Math.min(n2 - (n + n), this.i), Integer.MIN_VALUE);
        final int height3 = size.getHeight();
        n = this.g;
        l.measure(n2, View$MeasureSpec.makeMeasureSpec(height3 - (n + n), Integer.MIN_VALUE));
        this.setMeasuredDimension(this.l.getMeasuredWidth(), this.l.getMeasuredHeight());
    }
}
