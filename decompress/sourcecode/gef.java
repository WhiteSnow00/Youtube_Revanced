import android.view.View$MeasureSpec;
import android.graphics.Rect;
import android.os.Build$VERSION;
import android.graphics.Canvas;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.EdgeEffect;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public class gef extends ViewGroup implements fjo
{
    EdgeEffect a;
    EdgeEffect b;
    public tpc c;
    public fkd d;
    int e;
    int f;
    private float g;
    private boolean h;
    
    public gef(final Context context) {
        super(context);
        this.e(context);
    }
    
    public gef(final Context context, final float g, final tpc c) {
        super(context);
        this.g = g;
        this.c = c;
        this.d = new fkd();
    }
    
    public gef(final Context context, final AttributeSet set) {
        super(context, set);
        this.e(context);
    }
    
    public gef(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.e(context);
    }
    
    protected static final void l(final View view, final int n, final int n2, final float scaleX, final float scaleY) {
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX((float)n);
        view.setTranslationY((float)n2);
        view.setScaleX(scaleX);
        view.setScaleY(scaleY);
    }
    
    protected final void d() {
        this.setVisibility(8);
    }
    
    protected final boolean drawChild(final Canvas canvas, final View view, final long n) {
        canvas.save();
        canvas.clipRect(this.c.d.b);
        final boolean drawChild = super.drawChild(canvas, view, n);
        canvas.restore();
        return drawChild;
    }
    
    final void e(final Context context) {
        this.g = context.getResources().getFraction(2131361793, 1, 1);
        this.d = new fkd();
    }
    
    public final void f(final arhr arhr) {
        if (Build$VERSION.SDK_INT <= 30) {
            return;
        }
        this.setWillNotDraw(false);
        this.a = new EdgeEffect(this.getContext());
        this.b = new EdgeEffect(this.getContext());
        final hdv hdv = (hdv)arhr.a();
        final EdgeEffect a = this.a;
        a.getClass();
        hdv.o(1, (View)this, a);
        final hdv hdv2 = (hdv)arhr.a();
        final EdgeEffect b = this.b;
        b.getClass();
        hdv2.o(3, (View)this, b);
    }
    
    protected void g(final View view, final int n, final int n2, final int n3, final int n4) {
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }
    
    final void h() {
        if (this.k()) {
            this.j();
            this.invalidate();
        }
    }
    
    protected void i() {
        if (this.getVisibility() == 8) {
            this.setVisibility(0);
        }
    }
    
    protected final void j() {
        if (!this.k()) {
            return;
        }
        final toz d = this.c.d;
        if (d.e()) {
            final Rect a = d.a;
            final int left = a.left;
            final int top = a.top;
            final boolean h = this.h;
            float n = 1.0f;
            float n4;
            if (!h && (a.width() != this.e || a.height() != this.f)) {
                float n2;
                if (this.e == 0) {
                    n2 = 1.0f;
                }
                else {
                    n2 = a.width() / (float)this.e;
                }
                if (this.f != 0) {
                    n = a.height() / (float)this.f;
                }
                this.e = a.width();
                this.f = a.height();
                if (!ana.an((View)this)) {
                    this.requestLayout();
                }
                final float n3 = n2;
                n4 = n;
                n = n3;
            }
            else {
                n4 = 1.0f;
            }
            this.i();
            final fkd d2 = this.d;
            final int e = this.e;
            final int f = this.f;
            int i = 0;
            d2.b(e, f, false);
            while (i < this.getChildCount()) {
                l(this.getChildAt(i), left, top, n, n4);
                ++i;
            }
            return;
        }
        this.d();
    }
    
    public final boolean k() {
        return this.getChildCount() > 0;
    }
    
    public final void oK(final fkk fkk) {
        final boolean h = this.h;
        final boolean c = fkk.c();
        this.h = c;
        if (h == c) {
            return;
        }
        if (c) {
            this.requestLayout();
        }
    }
    
    protected final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final EdgeEffect a = this.a;
        int n2;
        final int n = n2 = 0;
        if (a != null) {
            n2 = n;
            if (!a.isFinished()) {
                n2 = n;
                if (this.a.draw(canvas)) {
                    n2 = 1;
                }
            }
        }
        final EdgeEffect b = this.b;
        int n3 = n2;
        if (b != null) {
            n3 = n2;
            if (!b.isFinished()) {
                final int save = canvas.save();
                canvas.rotate(180.0f);
                canvas.translate((float)(-this.getWidth()), (float)(-this.getHeight()));
                n3 = (n2 | (this.b.draw(canvas) ? 1 : 0));
                canvas.restoreToCount(save);
            }
        }
        if (n3 != 0) {
            this.invalidate();
        }
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        int i = 0;
        final int max = Math.max(0, n3 - n);
        final int max2 = Math.max(0, n4 - n2);
        final EdgeEffect a = this.a;
        if (a != null) {
            a.setSize(max, max2);
        }
        final EdgeEffect b2 = this.b;
        if (b2 != null) {
            b2.setSize(max, max2);
        }
        this.j();
        while (i < this.getChildCount()) {
            final View child = this.getChildAt(i);
            if (b || child.getVisibility() != 8) {
                this.g(child, n, n2, n3, n4);
            }
            ++i;
        }
    }
    
    protected final void onMeasure(int n, int i) {
        super.onMeasure(n, i);
        final int size = View$MeasureSpec.getSize(n);
        if (this.h) {
            n = View$MeasureSpec.getSize(i);
        }
        else {
            n = Math.round(size / this.g);
        }
        int childCount;
        View child;
        int e;
        for (childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            e = this.e;
            if (e > 0 && this.f > 0 && !this.h) {
                child.measure(View$MeasureSpec.makeMeasureSpec(e, 1073741824), View$MeasureSpec.makeMeasureSpec(this.f, 1073741824));
            }
            else {
                child.measure(View$MeasureSpec.makeMeasureSpec(size, 1073741824), View$MeasureSpec.makeMeasureSpec(n, 1073741824));
            }
        }
    }
    
    public final void onViewAdded(final View view) {
        super.onViewAdded(view);
        this.j();
    }
    
    public final void onViewRemoved(final View view) {
        l(view, 0, 0, 1.0f, 1.0f);
    }
}
