import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.ViewParent;
import android.view.View;
import android.os.SystemClock;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ProgressBar;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class adup extends ProgressBar
{
    public final aduq a;
    public int b;
    public final int c;
    public final int d;
    public long e;
    public boolean f;
    public final int g;
    public final Runnable h;
    public final Runnable i;
    private final boolean j;
    private final cju k;
    private final cju l;
    
    protected adup(Context context, final AttributeSet set, final int n, final int n2) {
        super(adyy.a(context, set, n, 2132085235), set, n);
        this.e = -1L;
        this.f = false;
        this.g = 4;
        this.h = (Runnable)new admc(this, 11);
        this.i = (Runnable)new admc(this, 12);
        this.k = new adun(this);
        this.l = new aduo(this);
        context = this.getContext();
        this.a = this.a(context, set);
        final TypedArray a = aduf.a(context, set, advq.a, n, n2, new int[0]);
        this.c = a.getInt(5, -1);
        this.d = Math.min(a.getInt(3, -1), 1000);
        a.recycle();
        this.j = true;
    }
    
    public abstract aduq a(final Context p0, final AttributeSet p1);
    
    public final aduz b() {
        return (aduz)super.getProgressDrawable();
    }
    
    public final advg c() {
        return (advg)super.getIndeterminateDrawable();
    }
    
    protected final void d(final boolean b) {
        if (!this.j) {
            return;
        }
        ((advd)this.getCurrentDrawable()).h(this.f(), false, b);
    }
    
    public final void e() {
        if (this.d > 0) {
            this.e = SystemClock.uptimeMillis();
        }
        this.setVisibility(0);
    }
    
    final boolean f() {
        if (ana.am((View)this) && this.getWindowVisibility() == 0) {
            Object o = this;
            while (((View)o).getVisibility() == 0) {
                final ViewParent parent = ((View)o).getParent();
                if (parent == null) {
                    if (this.getWindowVisibility() != 0) {
                        break;
                    }
                }
                else if (parent instanceof View) {
                    o = parent;
                    continue;
                }
                return true;
            }
        }
        return false;
    }
    
    public void g(final int n) {
        if (this.isIndeterminate()) {
            if (this.b() != null) {
                this.b = n;
                this.f = true;
                if (this.c().isVisible() && adwd.n(this.getContext().getContentResolver()) != 0.0f) {
                    this.c().b.c();
                    return;
                }
                this.k.b((Drawable)this.c());
            }
        }
        else {
            super.setProgress(n);
            if (this.b() != null) {
                this.b().jumpToCurrentState();
            }
        }
    }
    
    public final Drawable getCurrentDrawable() {
        Object o;
        if (this.isIndeterminate()) {
            o = this.c();
        }
        else {
            o = this.b();
        }
        return (Drawable)o;
    }
    
    public final void invalidate() {
        super.invalidate();
        if (this.getCurrentDrawable() != null) {
            this.getCurrentDrawable().invalidateSelf();
        }
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b() != null && this.c() != null) {
            this.c().b.b(this.k);
        }
        if (this.b() != null) {
            ((advd)this.b()).d(this.l);
        }
        if (this.c() != null) {
            ((advd)this.c()).d(this.l);
        }
        if (this.f()) {
            this.e();
        }
    }
    
    protected final void onDetachedFromWindow() {
        this.removeCallbacks(this.i);
        this.removeCallbacks(this.h);
        ((advd)this.getCurrentDrawable()).j();
        if (this.c() != null) {
            ((advd)this.c()).k(this.l);
            this.c().b.e();
        }
        if (this.b() != null) {
            ((advd)this.b()).k(this.l);
        }
        super.onDetachedFromWindow();
    }
    
    protected final void onDraw(final Canvas canvas) {
        synchronized (this) {
            final int save = canvas.save();
            if (this.getPaddingLeft() != 0 || this.getPaddingTop() != 0) {
                canvas.translate((float)this.getPaddingLeft(), (float)this.getPaddingTop());
            }
            if (this.getPaddingRight() != 0 || this.getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, this.getWidth() - (this.getPaddingLeft() + this.getPaddingRight()), this.getHeight() - (this.getPaddingTop() + this.getPaddingBottom()));
            }
            this.getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        }
    }
    
    protected final void onMeasure(int defaultSize, int defaultSize2) {
        synchronized (this) {
            final boolean indeterminate = this.isIndeterminate();
            adve adve = null;
            if (indeterminate) {
                if (this.c() != null) {
                    adve = this.c().a;
                }
            }
            else if (this.b() != null) {
                adve = this.b().a;
            }
            if (adve == null) {
                return;
            }
            if (adve.b() < 0) {
                defaultSize = getDefaultSize(this.getSuggestedMinimumWidth(), defaultSize);
            }
            else {
                defaultSize = adve.b() + this.getPaddingLeft() + this.getPaddingRight();
            }
            if (adve.a() < 0) {
                defaultSize2 = getDefaultSize(this.getSuggestedMinimumHeight(), defaultSize2);
            }
            else {
                defaultSize2 = adve.a() + this.getPaddingTop() + this.getPaddingBottom();
            }
            this.setMeasuredDimension(defaultSize, defaultSize2);
        }
    }
    
    protected final void onVisibilityChanged(final View view, final int n) {
        super.onVisibilityChanged(view, n);
        this.d(n == 0);
    }
    
    protected final void onWindowVisibilityChanged(final int n) {
        super.onWindowVisibilityChanged(n);
        this.d(false);
    }
    
    public final void setIndeterminate(final boolean indeterminate) {
        synchronized (this) {
            if (indeterminate == this.isIndeterminate()) {
                return;
            }
            final Drawable currentDrawable = this.getCurrentDrawable();
            if (currentDrawable != null) {
                ((advd)currentDrawable).j();
            }
            super.setIndeterminate(indeterminate);
            final Drawable currentDrawable2 = this.getCurrentDrawable();
            if (currentDrawable2 != null) {
                ((advd)currentDrawable2).h(this.f(), false, false);
            }
            if (currentDrawable2 instanceof advg && this.f()) {
                ((advg)currentDrawable2).b.d();
            }
            this.f = false;
        }
    }
    
    public final void setIndeterminateDrawable(final Drawable indeterminateDrawable) {
        if (indeterminateDrawable == null) {
            super.setIndeterminateDrawable((Drawable)null);
            return;
        }
        if (indeterminateDrawable instanceof advg) {
            ((advd)indeterminateDrawable).j();
            super.setIndeterminateDrawable(indeterminateDrawable);
            return;
        }
        throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
    }
    
    public final void setProgress(final int n) {
        synchronized (this) {
            if (this.isIndeterminate()) {
                return;
            }
            this.g(n);
        }
    }
    
    public final void setProgressDrawable(final Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable((Drawable)null);
            return;
        }
        if (drawable instanceof aduz) {
            final aduz progressDrawable = (aduz)drawable;
            ((advd)progressDrawable).j();
            super.setProgressDrawable((Drawable)progressDrawable);
            progressDrawable.setLevel((int)(this.getProgress() / (float)this.getMax() * 10000.0f));
            return;
        }
        throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
    }
}
