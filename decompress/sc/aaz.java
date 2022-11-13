import android.graphics.Outline;
import android.graphics.ColorFilter;
import android.graphics.Canvas;
import android.graphics.PorterDuff$Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Paint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaz extends Drawable
{
    public float a;
    public float b;
    public boolean c;
    public boolean d;
    public ColorStateList e;
    private final Paint f;
    private final RectF g;
    private final Rect h;
    private PorterDuffColorFilter i;
    private ColorStateList j;
    private PorterDuff$Mode k;
    
    public aaz(final ColorStateList list, final float a) {
        this.c = false;
        this.d = true;
        this.k = PorterDuff$Mode.SRC_IN;
        this.a = a;
        this.f = new Paint(5);
        this.a(list);
        this.g = new RectF();
        this.h = new Rect();
    }
    
    private final PorterDuffColorFilter c(final ColorStateList list, final PorterDuff$Mode porterDuff$Mode) {
        if (list != null && porterDuff$Mode != null) {
            return new PorterDuffColorFilter(list.getColorForState(this.getState(), 0), porterDuff$Mode);
        }
        return null;
    }
    
    public final void a(final ColorStateList list) {
        ColorStateList value = list;
        if (list == null) {
            value = ColorStateList.valueOf(0);
        }
        this.e = value;
        this.f.setColor(value.getColorForState(this.getState(), this.e.getDefaultColor()));
    }
    
    public final void b(final Rect rect) {
        Rect bounds = rect;
        if (rect == null) {
            bounds = this.getBounds();
        }
        this.g.set((float)bounds.left, (float)bounds.top, (float)bounds.right, (float)bounds.bottom);
        this.h.set(bounds);
        if (this.c) {
            this.h.inset((int)Math.ceil(aba.a(this.b, this.a, this.d)), (int)Math.ceil(aba.b(this.b, this.a, this.d)));
            this.g.set(this.h);
        }
    }
    
    public final void draw(final Canvas canvas) {
        final Paint f = this.f;
        final PorterDuffColorFilter i = this.i;
        int n = 0;
        if (i != null) {
            n = n;
            if (f.getColorFilter() == null) {
                f.setColorFilter((ColorFilter)this.i);
                n = 1;
            }
        }
        final RectF g = this.g;
        final float a = this.a;
        canvas.drawRoundRect(g, a, a, f);
        if (n != 0) {
            f.setColorFilter((ColorFilter)null);
        }
    }
    
    public final int getOpacity() {
        return -3;
    }
    
    public final void getOutline(final Outline outline) {
        outline.setRoundRect(this.h, this.a);
    }
    
    public final boolean isStateful() {
        final ColorStateList j = this.j;
        if (j == null || !j.isStateful()) {
            final ColorStateList e = this.e;
            if ((e == null || !e.isStateful()) && !super.isStateful()) {
                return false;
            }
        }
        return true;
    }
    
    protected final void onBoundsChange(final Rect rect) {
        super.onBoundsChange(rect);
        this.b(rect);
    }
    
    protected final boolean onStateChange(final int[] array) {
        final ColorStateList e = this.e;
        final int colorForState = e.getColorForState(array, e.getDefaultColor());
        final boolean b = colorForState != this.f.getColor();
        if (b) {
            this.f.setColor(colorForState);
        }
        final ColorStateList j = this.j;
        if (j != null) {
            final PorterDuff$Mode k = this.k;
            if (k != null) {
                this.i = this.c(j, k);
                return true;
            }
        }
        return b;
    }
    
    public final void setAlpha(final int alpha) {
        this.f.setAlpha(alpha);
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
    }
    
    public final void setTintList(final ColorStateList j) {
        this.j = j;
        this.i = this.c(j, this.k);
        this.invalidateSelf();
    }
    
    public final void setTintMode(final PorterDuff$Mode k) {
        this.k = k;
        this.i = this.c(this.j, k);
        this.invalidateSelf();
    }
}
