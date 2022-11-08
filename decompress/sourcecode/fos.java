import java.util.List;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import java.util.concurrent.ScheduledFuture;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fos extends abry implements ariy, absb
{
    public afts a;
    public final Rect b;
    public final Rect c;
    public final int d;
    public absb e;
    public ScheduledFuture f;
    public uyi g;
    public fzo h;
    private arit i;
    private boolean j;
    private final asib k;
    
    public fos(final Context context) {
        super(context);
        if (!this.j) {
            this.j = true;
            ((fpr)this.aR()).o(this);
        }
        this.b = new Rect();
        this.c = new Rect();
        this.k = new asib();
        this.d = context.getResources().getInteger(17694720);
    }
    
    public final ViewGroup$LayoutParams a() {
        this.e.getClass();
        return (ViewGroup$LayoutParams)foo.c();
    }
    
    public final Object aR() {
        return this.d().aR();
    }
    
    public final arit d() {
        if (this.i == null) {
            this.i = new arit((View)this, false);
        }
        return this.i;
    }
    
    public final void e(final boolean b) {
        final int childCount = this.getChildCount();
        afcr afcr;
        if (childCount == 0) {
            afcr = afcr.q();
        }
        else {
            final afcm h = afcr.h(childCount);
            for (int i = 0; i < childCount; ++i) {
                h.h((Object)this.getChildAt(i));
            }
            afcr = h.g();
        }
        if (!afcr.isEmpty()) {
            for (int c = ((afgh)afcr).c, j = 0; j < c; ++j) {
                final View view = ((List<View>)afcr).get(j);
                int visibility;
                if (!b) {
                    visibility = 8;
                }
                else {
                    visibility = 0;
                }
                view.setVisibility(visibility);
            }
        }
    }
    
    public final String mr() {
        final absb e = this.e;
        if (e == null) {
            return null;
        }
        return ((foo)e).a;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.k.f(((asgt)this.h.b).p().am((asix)new fmh(this, 16), (asix)ezm.r), ((asgt)this.h.a).p().am((asix)new fmh(this, 17), (asix)ezm.r));
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.k.b();
        if (this.g.cE()) {
            final ScheduledFuture f = this.f;
            if (f != null && !f.isDone()) {
                this.f.cancel(false);
            }
        }
    }
    
    protected final void onLayout(final boolean b, int i, int childCount, int bottom, final int n) {
        bottom = this.b.bottom;
        View child;
        for (childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            child.layout(0, bottom, child.getMeasuredWidth(), child.getMeasuredHeight() + bottom);
        }
    }
    
    protected final void onMeasure(final int n, int i) {
        super.onMeasure(n, i);
        final int size = View$MeasureSpec.getSize(n);
        final int size2 = View$MeasureSpec.getSize(i);
        final int size3 = View$MeasureSpec.getSize(i);
        int childCount;
        for (childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            this.getChildAt(i).measure(n, View$MeasureSpec.makeMeasureSpec(size3 - this.b.height() - this.c.height(), 1073741824));
        }
        this.setMeasuredDimension(size, size2);
    }
}
