import android.view.View$MeasureSpec;
import android.widget.PopupWindow$OnDismissListener;
import android.widget.TextView;
import android.view.WindowManager;
import android.graphics.Canvas;
import android.content.ContextWrapper;
import android.app.Activity;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Path;
import android.view.View;
import android.widget.PopupWindow;
import android.content.Context;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acyd extends ViewGroup
{
    private int A;
    private int B;
    private final int C;
    public final Context a;
    int b;
    public acxu c;
    public PopupWindow d;
    public acyc e;
    public boolean f;
    public boolean g;
    public View h;
    public View i;
    boolean j;
    public int k;
    public float l;
    public int m;
    public int n;
    private final Path o;
    private final RectF p;
    private final Paint q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final int v;
    private final Rect w;
    private final int[] x;
    private final Point y;
    private int z;
    
    public acyd(final Context a, int dimensionPixelSize) {
        super(a);
        this.w = new Rect();
        this.x = new int[2];
        this.y = new Point();
        this.A = 0;
        this.l = 1.0f;
        this.m = 0;
        this.n = 0;
        this.a = a;
        this.setWillNotDraw(false);
        this.o = new Path();
        this.p = new RectF();
        final Paint q = new Paint(1);
        this.q = q;
        final DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        final TypedArray obtainStyledAttributes = a.obtainStyledAttributes((AttributeSet)null, acxs.a, 0, dimensionPixelSize);
        this.r = obtainStyledAttributes.getDimensionPixelSize(5, tqf.aZ(displayMetrics, 16));
        this.v = obtainStyledAttributes.getDimensionPixelSize(5, tqf.aZ(displayMetrics, 8));
        this.s = obtainStyledAttributes.getDimensionPixelSize(4, tqf.aZ(displayMetrics, 8));
        this.t = obtainStyledAttributes.getDimensionPixelSize(1, tqf.aZ(displayMetrics, 10));
        this.u = obtainStyledAttributes.getDimensionPixelSize(0, tqf.aZ(displayMetrics, 24));
        this.b = obtainStyledAttributes.getDimensionPixelSize(3, tqf.aZ(displayMetrics, 2));
        final int color = obtainStyledAttributes.getColor(2, tqf.cr(a, 2130970938));
        final int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(7, 0);
        this.C = dimensionPixelSize2;
        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        final int color2 = obtainStyledAttributes.getColor(6, 0);
        obtainStyledAttributes.recycle();
        if (dimensionPixelSize > 0) {
            q.setStyle(Paint$Style.FILL);
            final float n = (float)dimensionPixelSize2;
            q.setShadowLayer((float)dimensionPixelSize, n, n, color2);
        }
        this.e(color);
        this.f = true;
        this.g = false;
    }
    
    public static Activity a(final Context context) {
        int i = 0;
        Object o = context;
        while (i < 10) {
            if (o == null) {
                return null;
            }
            if (o instanceof Activity) {
                return (Activity)o;
            }
            Activity a = (Activity)o;
            if (o instanceof ContextWrapper) {
                a = a(((ContextWrapper)o).getBaseContext());
            }
            ++i;
            o = a;
        }
        return null;
    }
    
    private static int g(final int n, final int n2, final int n3) {
        return Math.min(n3, Math.max(n2, n));
    }
    
    private final void h(final Canvas canvas) {
        canvas.save();
        final int a = this.A;
        if (k(a)) {
            canvas.translate((float)(this.s - this.m), 0.0f);
        }
        else if (a == 3 || a == 4) {
            canvas.translate(0.0f, (float)(this.s - this.n));
        }
        canvas.drawPath(this.o, this.q);
        canvas.restore();
    }
    
    private final void i(final Point point) {
        ((WindowManager)this.getContext().getSystemService("window")).getDefaultDisplay().getSize(point);
    }
    
    private final boolean j() {
        final TextView textView = (TextView)this.h.findViewById(2131427452);
        final TextView textView2 = (TextView)this.h.findViewById(2131428701);
        final boolean b = true;
        if (textView != null) {
            final boolean b2 = b;
            if (textView.getVisibility() == 0) {
                return b2;
            }
        }
        boolean b2;
        if (textView2 != null) {
            if (textView2.getVisibility() != 0) {
                return false;
            }
            b2 = b;
        }
        else {
            b2 = false;
        }
        return b2;
    }
    
    private static boolean k(final int n) {
        return n == 1 || n == 2;
    }
    
    public final void b(final int n) {
        if (this.d != null) {
            final acxu c = this.c;
            if (c != null && c.getParent() instanceof ViewGroup) {
                ((ViewGroup)this.c.getParent()).removeView((View)this.c);
                this.c = null;
            }
            this.d.setOnDismissListener((PopupWindow$OnDismissListener)null);
            this.d.dismiss();
            final acyc e = this.e;
            if (e != null) {
                e.a(n);
            }
        }
    }
    
    public final void c(final View i, final Rect rect, final int z, final int b, final int k) {
        this.i = i;
        this.d(rect);
        this.z = z;
        this.A = 0;
        this.B = b;
        this.k = k;
        this.j = true;
    }
    
    public final void d(final Rect rect) {
        this.w.set(rect);
    }
    
    public final void e(final int color) {
        this.q.setColor(color);
        this.setLayerType(1, this.q);
    }
    
    public final void f() {
        this.i(this.y);
        final int x = this.y.x;
        final int y = this.y.y;
        final int measuredWidth = this.getMeasuredWidth();
        final int measuredHeight = this.getMeasuredHeight();
        final int a = this.A;
        int width = 0;
        int height;
        if (a == 1) {
            height = -measuredHeight;
        }
        else if (a == 2) {
            height = this.w.height();
        }
        else if (a == 3) {
            width = -measuredWidth;
            height = (this.w.height() - measuredHeight) / 2;
        }
        else if (a == 4) {
            width = this.w.width();
            height = (this.w.height() - measuredHeight) / 2;
        }
        else {
            height = 0;
        }
        final int f = anc.f((View)this);
        int n2 = 0;
        int n3 = 0;
        Label_0320: {
            if (k(this.A)) {
                final int n = this.w.top + height;
                final int b = this.B;
                int n4;
                int n5;
                if (b != 1) {
                    if (b == 2) {
                        n2 = this.w.left + (this.w.width() - measuredWidth) / 2;
                        n3 = n;
                        break Label_0320;
                    }
                    if (b != 3) {
                        throw new IllegalStateException();
                    }
                    if (f == 1) {
                        n2 = this.w.left;
                        n3 = n;
                        break Label_0320;
                    }
                    n4 = this.w.left;
                    n5 = this.w.width();
                }
                else {
                    if (f != 1) {
                        n2 = this.w.left;
                        n3 = n;
                        break Label_0320;
                    }
                    n4 = this.w.left;
                    n5 = this.w.width();
                }
                n2 = n4 + n5 - measuredWidth;
                n3 = n;
            }
            else {
                final int left = this.w.left;
                final int n6 = this.w.top + height;
                final int n7 = left + width;
                n3 = n6;
                n2 = n7;
            }
        }
        final int s = this.s;
        this.m = g(n2, s, x - s - measuredWidth);
        final int s2 = this.s;
        this.n = g(n3, s2, y - s2 - measuredHeight);
    }
    
    protected final void onDraw(final Canvas canvas) {
        canvas.save();
        final int a = this.A;
        if (a == 2 || a == 4) {
            this.h(canvas);
        }
        final RectF p = this.p;
        final float n = (float)this.b;
        canvas.drawRoundRect(p, n, n, this.q);
        final int a2 = this.A;
        if (a2 == 1 || a2 == 3) {
            this.h(canvas);
        }
        canvas.restore();
    }
    
    protected final void onLayout(final boolean b, int n, int n2, int n3, int n4) {
        final int r = this.r;
        final int a = this.A;
        int t = 0;
        int t2;
        if (a == 3) {
            t2 = this.t;
        }
        else {
            t2 = 0;
        }
        Label_0119: {
            if (this.j()) {
                n4 = (n2 = n4 - n2 - this.v);
                if (this.A == 1) {
                    final int t3 = this.t;
                    n2 = n4;
                    n4 = t3;
                    break Label_0119;
                }
            }
            else {
                n4 = (n2 = n4 - n2 - this.r);
                if (this.A == 1) {
                    final int t4 = this.t;
                    n2 = n4;
                    n4 = t4;
                    break Label_0119;
                }
            }
            n4 = 0;
        }
        final View h = this.h;
        final int r2 = this.r;
        final int a2 = this.A;
        int t5;
        if (a2 == 4) {
            t5 = this.t;
        }
        else {
            t5 = 0;
        }
        if (a2 == 2) {
            t = this.t;
        }
        h.layout(t5 + r2, r2 + t, n3 - n - r - t2, n2 - n4);
        final acxu c = this.c;
        if (c != null) {
            c.postInvalidate();
        }
        this.f();
        this.d.update(this.m, this.n, this.getMeasuredWidth(), this.getMeasuredHeight(), true);
        n = this.B;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new IllegalStateException();
                }
                n3 = this.w.width();
                n2 = this.u / 2;
                n = this.s;
                n = n3 - n2 - (n + n);
            }
            else {
                n = this.w.width() / 2;
            }
        }
        else {
            n2 = this.u / 2;
            n = this.s;
            n = n2 + (n + n);
        }
        n2 = n;
        if (anc.f((View)this) == 1) {
            n2 = this.w.width() - n;
        }
        n = n2 + this.w.left;
        this.o.reset();
        n2 = this.A;
        if (n2 == 1) {
            final Path o = this.o;
            n2 = this.s;
            n3 = this.u / 2;
            o.moveTo((float)(n - n2 - n3), this.p.bottom);
            this.o.rLineTo((float)this.u, 0.0f);
            this.o.rLineTo(-this.u / 2.0f, (float)this.t);
            this.o.rLineTo(-this.u / 2.0f, (float)(-this.t));
            this.o.close();
            return;
        }
        if (n2 == 2) {
            final Path o2 = this.o;
            n3 = this.s;
            n2 = this.u / 2;
            o2.moveTo((float)(n - n3 + n2), this.p.top);
            this.o.rLineTo((float)(-this.u), 0.0f);
            this.o.rLineTo(this.u / 2.0f, (float)(-this.t));
            this.o.rLineTo(this.u / 2.0f, (float)this.t);
            this.o.close();
            return;
        }
        if (n2 == 3) {
            this.o.moveTo(this.p.right, (float)(this.w.centerY() - this.u + this.s / 2));
            this.o.rLineTo((float)this.t, this.u / 2.0f);
            final Path o3 = this.o;
            n = -this.t;
            o3.rLineTo((float)n, this.u / 2.0f);
            this.o.rLineTo(0.0f, (float)(-this.u));
            this.o.close();
            return;
        }
        if (n2 == 4) {
            this.o.moveTo(this.p.left, (float)(this.w.centerY() - this.u + this.s / 2));
            this.o.rLineTo(0.0f, (float)this.u);
            final Path o4 = this.o;
            n = -this.t;
            o4.rLineTo((float)n, -this.u / 2.0f);
            this.o.rLineTo((float)this.t, -this.u / 2.0f);
            this.o.close();
        }
    }
    
    protected final void onMeasure(int n, int n2) {
        if (this.A == 0 && this.j) {
            this.A = acye.a(this.z, (View)this);
        }
        final int[] x = this.x;
        this.i(this.y);
        n = this.y.x;
        final int y = this.y.y;
        n2 = this.A;
        int n4;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        throw new IllegalStateException();
                    }
                    n2 = n - this.w.left - this.w.width();
                    n = this.s;
                }
                else {
                    n2 = this.w.left;
                    n = this.s;
                }
                final int n3 = n2 - n;
                n2 = n + n;
                n = y;
                n4 = n3;
            }
            else {
                n2 = this.s;
                final int n5 = n - (n2 + n2);
                n = y - this.w.top - this.w.height();
                n2 = this.s;
                n4 = n5;
            }
        }
        else {
            n2 = this.s;
            n4 = n - (n2 + n2);
            n = this.w.top;
            n2 = this.s;
        }
        int t = 0;
        x[0] = n4;
        x[1] = n - n2;
        final int[] x2 = this.x;
        final int n6 = x2[0];
        n = x2[1];
        n2 = this.r;
        final int n7 = n6 - (n2 + n2) - this.C;
        if (this.j()) {
            n2 = n - this.r;
            n = this.v;
        }
        else {
            n2 = this.r;
            n2 = n - (n2 + n2);
            n = this.C;
        }
        final int n8 = n2 - n;
        final int a = this.A;
        Label_0367: {
            if (k(a)) {
                n = n8 - this.t;
                n2 = n7;
            }
            else {
                if (a != 3) {
                    n = n8;
                    n2 = n7;
                    if (a != 4) {
                        break Label_0367;
                    }
                }
                n2 = n7 - this.t;
                n = n8;
            }
        }
        this.i(this.y);
        this.h.measure(View$MeasureSpec.makeMeasureSpec(Math.min((int)(this.y.x * this.l), n2), Integer.MIN_VALUE), View$MeasureSpec.makeMeasureSpec(n, 0));
        if (this.h.getMeasuredHeight() > n) {
            this.h.measure(View$MeasureSpec.makeMeasureSpec(n2, Integer.MIN_VALUE), View$MeasureSpec.makeMeasureSpec(n, Integer.MIN_VALUE));
        }
        final int measuredWidth = this.h.getMeasuredWidth();
        final int r = this.r;
        if (this.j()) {
            n = this.h.getMeasuredHeight() + this.r;
            n2 = this.v;
        }
        else {
            n = this.h.getMeasuredHeight();
            n2 = this.r;
            n2 += n2;
        }
        final RectF p2 = this.p;
        final int a2 = this.A;
        float n9 = 0.0f;
        float n10;
        if (a2 == 4) {
            n10 = (float)this.t;
        }
        else {
            n10 = 0.0f;
        }
        if (a2 == 2) {
            n9 = (float)this.t;
        }
        int t2;
        if (a2 == 4) {
            t2 = this.t;
        }
        else {
            t2 = 0;
        }
        if (a2 == 2) {
            t = this.t;
        }
        p2.set(n10, n9, (float)(measuredWidth + r + t2), (float)(n + n2 + t));
        final int n11 = (int)this.p.width() + this.C;
        final int n12 = (int)this.p.height() + this.C;
        final int a3 = this.A;
        Label_0693: {
            if (k(a3)) {
                n = n12 + this.t;
                n2 = n11;
            }
            else {
                if (a3 != 3) {
                    n2 = n11;
                    n = n12;
                    if (a3 != 4) {
                        break Label_0693;
                    }
                }
                n2 = n11 + this.t;
                n = n12;
            }
        }
        this.setMeasuredDimension(n2, n);
    }
}
