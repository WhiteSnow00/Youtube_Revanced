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

public class adub extends FrameLayout
{
    Drawable a;
    Rect b;
    public boolean c;
    public boolean d;
    private Rect e;
    
    public adub(final Context context) {
        this(context, null);
    }
    
    public adub(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public adub(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.e = new Rect();
        this.c = true;
        this.d = true;
        final TypedArray a = aduf.a(context, set, adtz.b, n, 2132084675, new int[0]);
        this.a = a.getDrawable(0);
        a.recycle();
        this.setWillNotDraw(true);
        ana.Z((View)this, (alv)new adua(this, 0));
    }
    
    protected void a(final aoa aoa) {
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        final int width = this.getWidth();
        final int height = this.getHeight();
        if (this.b != null && this.a != null) {
            final int save = canvas.save();
            canvas.translate((float)this.getScrollX(), (float)this.getScrollY());
            if (this.c) {
                this.e.set(0, 0, width, this.b.top);
                this.a.setBounds(this.e);
                this.a.draw(canvas);
            }
            if (this.d) {
                this.e.set(0, height - this.b.bottom, width, height);
                this.a.setBounds(this.e);
                this.a.draw(canvas);
            }
            this.e.set(0, this.b.top, this.b.left, height - this.b.bottom);
            this.a.setBounds(this.e);
            this.a.draw(canvas);
            this.e.set(width - this.b.right, this.b.top, width, height - this.b.bottom);
            this.a.setBounds(this.e);
            this.a.draw(canvas);
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
