import android.graphics.drawable.Drawable$Callback;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public class adxu extends FrameLayout
{
    Drawable a;
    Rect b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    private Rect g;
    
    public adxu(final Context context) {
        this(context, null);
    }
    
    public adxu(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public adxu(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.g = new Rect();
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = true;
        final TypedArray a = adxy.a(context, set, adxs.b, n, 2132084683, new int[0]);
        this.a = a.getDrawable(0);
        a.recycle();
        this.setWillNotDraw(true);
        anc.Z((View)this, (alx)new adxt(this, 0));
    }
    
    protected void a(final aoc aoc) {
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        final int width = this.getWidth();
        final int height = this.getHeight();
        if (this.b != null && this.a != null) {
            final int save = canvas.save();
            canvas.translate((float)this.getScrollX(), (float)this.getScrollY());
            if (this.c) {
                this.g.set(0, 0, width, this.b.top);
                this.a.setBounds(this.g);
                this.a.draw(canvas);
            }
            if (this.d) {
                this.g.set(0, height - this.b.bottom, width, height);
                this.a.setBounds(this.g);
                this.a.draw(canvas);
            }
            if (this.e) {
                this.g.set(0, this.b.top, this.b.left, height - this.b.bottom);
                this.a.setBounds(this.g);
                this.a.draw(canvas);
            }
            if (this.f) {
                this.g.set(width - this.b.right, this.b.top, width, height - this.b.bottom);
                this.a.setBounds(this.g);
                this.a.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        final Drawable a = this.a;
        if (a != null) {
            a.setCallback((Drawable$Callback)this);
        }
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final Drawable a = this.a;
        if (a != null) {
            a.setCallback((Drawable$Callback)null);
        }
    }
}
