import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Shader;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Canvas;
import android.graphics.Paint$Style;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.Rect;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adwg extends Drawable
{
    public final Paint a;
    public float b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public aeae h;
    private final aeag i;
    private final Path j;
    private final Rect k;
    private final RectF l;
    private final RectF m;
    private final adwf n;
    private int o;
    private ColorStateList p;
    
    public adwg(final aeae h) {
        this.i = aeaf.a;
        this.j = new Path();
        this.k = new Rect();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new adwf(this);
        this.g = true;
        this.h = h;
        (this.a = new Paint(1)).setStyle(Paint$Style.STROKE);
    }
    
    protected final RectF a() {
        this.m.set(this.getBounds());
        return this.m;
    }
    
    public final void b(final ColorStateList p) {
        if (p != null) {
            this.o = p.getColorForState(this.getState(), this.o);
        }
        this.p = p;
        this.g = true;
        this.invalidateSelf();
    }
    
    public final void draw(final Canvas canvas) {
        if (this.g) {
            final Paint a = this.a;
            final Rect k = this.k;
            this.copyBounds(k);
            final float n = this.b / k.height();
            a.setShader((Shader)new LinearGradient(0.0f, (float)k.top, 0.0f, (float)k.bottom, new int[] { aia.e(this.c, this.o), aia.e(this.d, this.o), aia.e(aia.f(this.d, 0), this.o), aia.e(aia.f(this.f, 0), this.o), aia.e(this.f, this.o), aia.e(this.e, this.o) }, new float[] { 0.0f, n, 0.5f, 0.5f, 1.0f - n, 1.0f }, Shader$TileMode.CLAMP));
            this.g = false;
        }
        final float n2 = this.a.getStrokeWidth() / 2.0f;
        this.copyBounds(this.k);
        this.l.set(this.k);
        final float min = Math.min(this.h.b.a(this.a()), this.l.width() / 2.0f);
        if (this.h.g(this.a())) {
            this.l.inset(n2, n2);
            canvas.drawRoundRect(this.l, min, min, this.a);
        }
    }
    
    public final Drawable$ConstantState getConstantState() {
        return this.n;
    }
    
    public final int getOpacity() {
        if (this.b > 0.0f) {
            return -3;
        }
        return -2;
    }
    
    public final void getOutline(final Outline outline) {
        if (this.h.g(this.a())) {
            outline.setRoundRect(this.getBounds(), this.h.b.a(this.a()));
            return;
        }
        this.copyBounds(this.k);
        this.l.set(this.k);
        this.i.a(this.h, 1.0f, this.l, this.j);
        adfe.H(outline, this.j);
    }
    
    public final boolean getPadding(final Rect rect) {
        if (this.h.g(this.a())) {
            final int round = Math.round(this.b);
            rect.set(round, round, round, round);
        }
        return true;
    }
    
    public final boolean isStateful() {
        final ColorStateList p = this.p;
        return (p != null && p.isStateful()) || super.isStateful();
    }
    
    protected final void onBoundsChange(final Rect rect) {
        this.g = true;
    }
    
    protected final boolean onStateChange(final int[] array) {
        final ColorStateList p = this.p;
        if (p != null) {
            final int colorForState = p.getColorForState(array, this.o);
            if (colorForState != this.o) {
                this.g = true;
                this.o = colorForState;
            }
        }
        if (this.g) {
            this.invalidateSelf();
        }
        return this.g;
    }
    
    public final void setAlpha(final int alpha) {
        this.a.setAlpha(alpha);
        this.invalidateSelf();
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.invalidateSelf();
    }
}
