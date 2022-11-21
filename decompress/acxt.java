import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.view.Display;
import android.view.WindowManager;
import android.graphics.Point;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import android.graphics.Paint$Style;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Path;
import android.view.View;
import android.widget.PopupWindow;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acxt extends ViewGroup
{
    public PopupWindow a;
    public boolean b;
    public View c;
    public int d;
    public View e;
    public int f;
    public float g;
    private final int[] h;
    private final Path i;
    private final RectF j;
    private final Paint k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private boolean s;
    private Rect t;
    
    public acxt(final Context context) {
        super(context);
        this.g = 1.0f;
        this.setWillNotDraw(false);
        this.h = new int[2];
        this.i = new Path();
        this.j = new RectF();
        final Paint k = new Paint();
        this.k = k;
        final DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(acxs.a);
        this.l = obtainStyledAttributes.getDimensionPixelSize(5, tqf.aZ(displayMetrics, 16));
        this.m = obtainStyledAttributes.getDimensionPixelSize(4, tqf.aZ(displayMetrics, 8));
        final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(7, tqf.aZ(displayMetrics, 1));
        this.n = dimensionPixelSize;
        final int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(8, tqf.aZ(displayMetrics, 1));
        this.r = dimensionPixelSize2;
        this.o = obtainStyledAttributes.getDimensionPixelSize(1, tqf.aZ(displayMetrics, 10));
        this.p = obtainStyledAttributes.getDimensionPixelSize(0, tqf.aZ(displayMetrics, 24));
        this.q = obtainStyledAttributes.getDimensionPixelSize(3, tqf.aZ(displayMetrics, 4));
        final int color = obtainStyledAttributes.getColor(2, tqf.cr(context, 2130970938));
        final int color2 = obtainStyledAttributes.getColor(6, 1073741824);
        obtainStyledAttributes.recycle();
        k.setStyle(Paint$Style.FILL);
        final float n = (float)dimensionPixelSize2;
        final float n2 = (float)dimensionPixelSize;
        k.setShadowLayer(n, n2, n2, color2);
        this.a(color);
        this.b = true;
    }
    
    private static int c(final int n, final int n2, final int n3) {
        return Math.min(n3, Math.max(n2, n));
    }
    
    private final Point d() {
        final Display defaultDisplay = ((WindowManager)this.getContext().getSystemService("window")).getDefaultDisplay();
        final Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }
    
    private final void e(final Canvas canvas) {
        final int[] h = this.h;
        this.getLocationOnScreen(h);
        final int n = h[0];
        final int n2 = h[1];
        this.e.getLocationOnScreen(h);
        final int n3 = h[0];
        final int n4 = h[1];
        this.e.getLocationInWindow(h);
        final int n5 = h[0];
        final int n6 = h[1];
        h[0] = n - n3 + n5;
        h[1] = n2 - n4 + n6;
        canvas.save();
        final int d = this.d;
        if (acgn.i(d)) {
            canvas.translate((float)(this.m - this.h[0]), 0.0f);
        }
        else if (d == 5 || d == 6) {
            canvas.translate(0.0f, (float)(this.m - this.h[1]));
        }
        canvas.drawPath(this.i, this.k);
        canvas.restore();
    }
    
    public final void a(final int color) {
        this.k.setColor(color);
        this.setLayerType(1, this.k);
    }
    
    public final void b() {
        final int[] h = this.h;
        final View e = this.e;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
        e.measure(measureSpec, measureSpec);
        e.getLocationInWindow(h);
        int n;
        if (e.getWidth() == 0) {
            n = e.getMeasuredWidth();
        }
        else {
            n = e.getWidth();
        }
        int n2;
        if (e.getHeight() == 0) {
            n2 = e.getMeasuredHeight();
        }
        else {
            n2 = e.getHeight();
        }
        final int n3 = h[0];
        final int n4 = h[1];
        this.t = new Rect(n3, n4, n + n3, n2 + n4);
    }
    
    protected final void onDraw(final Canvas canvas) {
        canvas.save();
        final int d = this.d;
        if (d == 2 || d == 6) {
            this.e(canvas);
        }
        final RectF j = this.j;
        final float n = (float)this.q;
        canvas.drawRoundRect(j, n, n, this.k);
        final int d2 = this.d;
        if (d2 == 1 || d2 == 5) {
            this.e(canvas);
        }
        canvas.restore();
    }
    
    protected final void onLayout(final boolean b, int n, int n2, int n3, int top) {
        final View c = this.c;
        final int l = this.l;
        final int d = this.d;
        final int n4 = 0;
        int o;
        if (d == 6) {
            o = this.o;
        }
        else {
            o = 0;
        }
        int o2;
        if (d == 2) {
            o2 = this.o;
        }
        else {
            o2 = 0;
        }
        int o3;
        if (d == 5) {
            o3 = this.o;
        }
        else {
            o3 = 0;
        }
        int o4;
        if (d == 1) {
            o4 = this.o;
        }
        else {
            o4 = 0;
        }
        c.layout(o + l, o2 + l, n3 - n - l - o3, top - n2 - l - o4);
        final Point d2 = this.d();
        final int x = d2.x;
        final int y = d2.y;
        n = this.d;
        Label_0312: {
            if (n != 1) {
                if (n != 2) {
                    if (n != 5) {
                        if (n != 6) {
                            throw new IllegalStateException();
                        }
                        n2 = x - this.t.left - this.t.width();
                        n = this.m;
                    }
                    else {
                        n2 = this.t.left;
                        n = this.m;
                    }
                    n3 = n2 - n;
                    n2 = y - (n + n);
                    n = n3;
                    break Label_0312;
                }
                n = this.m;
                n = x - (n + n);
                n2 = y - this.t.top - this.t.height();
                n3 = this.m;
            }
            else {
                n = this.m;
                n = x - (n + n);
                n2 = this.t.top;
                n3 = this.m;
            }
            n2 -= n3;
        }
        this.measure(View$MeasureSpec.makeMeasureSpec(n, Integer.MIN_VALUE), View$MeasureSpec.makeMeasureSpec(n2, Integer.MIN_VALUE));
        n3 = this.t.left;
        top = this.t.top;
        final int measuredWidth = this.getMeasuredWidth();
        final int measuredHeight = this.getMeasuredHeight();
        n = this.d;
        Label_0456: {
            if (n == 1) {
                n = -measuredHeight;
            }
            else if (n == 2) {
                n = this.t.height();
            }
            else {
                if (n == 5) {
                    n = -measuredWidth;
                    n2 = (this.t.height() - measuredHeight) / 2;
                    break Label_0456;
                }
                if (n == 6) {
                    n = this.t.width();
                    n2 = (this.t.height() - measuredHeight) / 2;
                    break Label_0456;
                }
                n = 0;
                n2 = 0;
                break Label_0456;
            }
            n2 = n;
            n = 0;
        }
        final int f = anc.f((View)this);
        if (acgn.i(this.d)) {
            top += n2;
            n = this.f;
            if (n != 1) {
                if (n != 2) {
                    throw new IllegalStateException();
                }
                n = n3 + (this.t.width() - measuredWidth) / 2;
                n2 = top;
            }
            else {
                n = n3;
                n2 = top;
                if (f == 1) {
                    n = n3 + this.t.width() - measuredWidth;
                    n2 = top;
                }
            }
        }
        else {
            n += n3;
            n2 += top;
        }
        n3 = this.m;
        n = c(n, n3, x - n3 - measuredWidth);
        n3 = this.m;
        n2 = c(n2, n3, y - n3 - measuredHeight);
        this.a.update(n, n2, measuredWidth, measuredHeight, true);
        n = this.f;
        if (n != 1) {
            if (n != 2) {
                n = n4;
            }
            else {
                n = this.t.width() / 2;
            }
        }
        else {
            n2 = this.p / 2;
            n = this.m;
            n = n2 + (n + n);
        }
        n2 = n;
        if (anc.f((View)this) == 1) {
            n2 = this.t.width() - n;
        }
        n = n2 + this.t.left;
        this.i.reset();
        n2 = this.d;
        if (n2 == 1) {
            final Path i = this.i;
            n3 = this.m;
            n2 = this.p / 2;
            i.moveTo((float)(n - n3 - n2), this.j.bottom);
            this.i.rLineTo((float)this.p, 0.0f);
            final Path j = this.i;
            n = -this.p / 2;
            j.rLineTo((float)n, (float)this.o);
            final Path k = this.i;
            n = -this.p / 2;
            n2 = -this.o;
            k.rLineTo((float)n, (float)n2);
            this.i.close();
            return;
        }
        if (n2 == 2) {
            final Path m = this.i;
            n2 = this.m;
            n3 = this.p / 2;
            m.moveTo((float)(n - n2 + n3), this.j.top);
            this.i.rLineTo((float)(-this.p), 0.0f);
            final Path i2 = this.i;
            n2 = this.p / 2;
            n = -this.o;
            i2.rLineTo((float)n2, (float)n);
            final Path i3 = this.i;
            n = this.p / 2;
            i3.rLineTo((float)n, (float)this.o);
            this.i.close();
            return;
        }
        if (n2 == 5) {
            this.i.moveTo(this.j.right, (float)(this.t.centerY() - this.p + this.m / 2));
            this.i.rLineTo((float)this.o, (float)(this.p / 2));
            final Path i4 = this.i;
            n = -this.o;
            n2 = this.p / 2;
            i4.rLineTo((float)n, (float)n2);
            this.i.rLineTo(0.0f, (float)(-this.p));
            this.i.close();
            return;
        }
        if (n2 == 6) {
            this.i.moveTo(this.j.left, (float)(this.t.centerY() - this.p + this.m / 2));
            this.i.rLineTo(0.0f, (float)this.p);
            final Path i5 = this.i;
            n = -this.o;
            n2 = -this.p / 2;
            i5.rLineTo((float)n, (float)n2);
            this.i.rLineTo((float)this.o, (float)(-this.p / 2));
            this.i.close();
        }
    }
    
    protected final void onMeasure(int n, int n2) {
        if (!this.s) {
            final int d = this.d;
            if (d != 0) {
                this.d = acgn.c(d, (View)this);
                this.s = true;
            }
        }
        n = View$MeasureSpec.getSize(n);
        n2 = View$MeasureSpec.getSize(n2);
        final int l = this.l;
        final int n3 = l + l;
        final int n4 = this.n;
        final int n5 = n - n3 - n4;
        final int n6 = n2 - n3 - n4;
        final int d2 = this.d;
        Label_0138: {
            if (acgn.i(d2)) {
                n2 = n6 - this.o;
                n = n5;
            }
            else {
                if (d2 != 5) {
                    n = n5;
                    n2 = n6;
                    if (d2 != 6) {
                        break Label_0138;
                    }
                }
                n = n5 - this.o;
                n2 = n6;
            }
        }
        final int min = Math.min((int)(this.d().x * this.g), n);
        final View c = this.c;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(min, Integer.MIN_VALUE);
        final int n7 = 0;
        c.measure(measureSpec, View$MeasureSpec.makeMeasureSpec(n2, 0));
        if (this.c.getMeasuredHeight() > n2) {
            this.c.measure(View$MeasureSpec.makeMeasureSpec(n, Integer.MIN_VALUE), View$MeasureSpec.makeMeasureSpec(n2, Integer.MIN_VALUE));
        }
        final int measuredWidth = this.c.getMeasuredWidth();
        final int i = this.l;
        final int measuredHeight = this.c.getMeasuredHeight();
        final int j = this.l;
        final RectF k = this.j;
        final int d3 = this.d;
        float n8 = 0.0f;
        float n9;
        if (d3 == 6) {
            n9 = (float)this.o;
        }
        else {
            n9 = 0.0f;
        }
        if (d3 == 2) {
            n8 = (float)this.o;
        }
        if (d3 == 6) {
            n = this.o;
        }
        else {
            n = 0;
        }
        n2 = n7;
        if (d3 == 2) {
            n2 = this.o;
        }
        k.set(n9, n8, (float)(measuredWidth + (i + i) + n), (float)(measuredHeight + (j + j) + n2));
        final int n10 = (int)this.j.width() + this.n;
        final int n11 = (int)this.j.height() + this.n;
        final int d4 = this.d;
        Label_0446: {
            if (acgn.i(d4)) {
                n = n11 + this.o;
                n2 = n10;
            }
            else {
                if (d4 != 5) {
                    n2 = n10;
                    n = n11;
                    if (d4 != 6) {
                        break Label_0446;
                    }
                }
                n2 = n10 + this.o;
                n = n11;
            }
        }
        this.setMeasuredDimension(n2, n);
    }
}
