import android.graphics.drawable.Drawable$Callback;
import android.view.Gravity;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public class adtm extends mt
{
    protected boolean a;
    boolean b;
    private Drawable c;
    private final Rect d;
    private final Rect e;
    private int f;
    
    public adtm(final Context context) {
        this(context, null);
    }
    
    public adtm(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public adtm(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.d = new Rect();
        this.e = new Rect();
        this.f = 119;
        this.a = true;
        this.b = false;
        final TypedArray a = aduf.a(context, set, adtz.a, n, 0, new int[0]);
        this.f = a.getInt(1, this.f);
        final Drawable drawable = a.getDrawable(0);
        if (drawable != null) {
            this.setForeground(drawable);
        }
        this.a = a.getBoolean(2, true);
        a.recycle();
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        final Drawable c = this.c;
        if (c != null) {
            if (this.b) {
                this.b = false;
                final Rect d = this.d;
                final Rect e = this.e;
                final int n = this.getRight() - this.getLeft();
                final int n2 = this.getBottom() - this.getTop();
                if (this.a) {
                    d.set(0, 0, n, n2);
                }
                else {
                    d.set(this.getPaddingLeft(), this.getPaddingTop(), n - this.getPaddingRight(), n2 - this.getPaddingBottom());
                }
                Gravity.apply(this.f, c.getIntrinsicWidth(), c.getIntrinsicHeight(), d, e);
                c.setBounds(e);
            }
            c.draw(canvas);
        }
    }
    
    public final void drawableHotspotChanged(final float n, final float n2) {
        super.drawableHotspotChanged(n, n2);
        final Drawable c = this.c;
        if (c != null) {
            c.setHotspot(n, n2);
        }
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        final Drawable c = this.c;
        if (c != null && c.isStateful()) {
            this.c.setState(this.getDrawableState());
        }
    }
    
    public final Drawable getForeground() {
        return this.c;
    }
    
    public final int getForegroundGravity() {
        return this.f;
    }
    
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        final Drawable c = this.c;
        if (c != null) {
            c.jumpToCurrentState();
        }
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.b |= b;
    }
    
    protected final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.b = true;
    }
    
    public final void setForeground(final Drawable c) {
        final Drawable c2 = this.c;
        if (c2 != c) {
            if (c2 != null) {
                c2.setCallback((Drawable$Callback)null);
                this.unscheduleDrawable(this.c);
            }
            this.c = c;
            this.b = true;
            if (c != null) {
                this.setWillNotDraw(false);
                c.setCallback((Drawable$Callback)this);
                if (c.isStateful()) {
                    c.setState(this.getDrawableState());
                }
                if (this.f == 119) {
                    c.getPadding(new Rect());
                }
            }
            else {
                this.setWillNotDraw(true);
            }
            this.requestLayout();
            this.invalidate();
        }
    }
    
    public final void setForegroundGravity(int f) {
        if (this.f != f) {
            int n = f;
            if ((0x800007 & f) == 0x0) {
                n = (f | 0x800003);
            }
            f = n;
            if ((n & 0x70) == 0x0) {
                f = (n | 0x30);
            }
            this.f = f;
            if (f == 119 && this.c != null) {
                this.c.getPadding(new Rect());
            }
            this.requestLayout();
        }
    }
    
    protected final boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.c;
    }
}
