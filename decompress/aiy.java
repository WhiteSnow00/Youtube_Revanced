import android.graphics.ColorFilter;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.Shader$TileMode;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public class aiy extends Drawable
{
    final Bitmap a;
    public float b;
    final Rect c;
    private int d;
    private final int e;
    private final Paint f;
    private final BitmapShader g;
    private final Matrix h;
    private final RectF i;
    private boolean j;
    private boolean k;
    private final int l;
    private final int m;
    
    public aiy(final Resources resources, final Bitmap a) {
        this.d = 160;
        this.e = 119;
        this.f = new Paint(3);
        this.h = new Matrix();
        this.c = new Rect();
        this.i = new RectF();
        this.j = true;
        if (resources != null) {
            this.d = resources.getDisplayMetrics().densityDpi;
        }
        BitmapShader g;
        if ((this.a = a) != null) {
            this.l = a.getScaledWidth(this.d);
            this.m = a.getScaledHeight(this.d);
            g = new BitmapShader(a, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP);
        }
        else {
            this.m = -1;
            this.l = -1;
            g = null;
        }
        this.g = g;
    }
    
    private final void e() {
        this.b = (float)(Math.min(this.m, this.l) / 2);
    }
    
    private static boolean f(final float n) {
        return n > 0.05f;
    }
    
    public void a(final int n, final int n2, final int n3, final Rect rect, final Rect rect2) {
        throw null;
    }
    
    final void b() {
        if (this.j) {
            if (this.k) {
                final int min = Math.min(this.l, this.m);
                this.a(this.e, min, min, this.getBounds(), this.c);
                final int min2 = Math.min(this.c.width(), this.c.height());
                this.c.inset(Math.max(0, (this.c.width() - min2) / 2), Math.max(0, (this.c.height() - min2) / 2));
                this.b = min2 * 0.5f;
            }
            else {
                this.a(this.e, this.l, this.m, this.getBounds(), this.c);
            }
            this.i.set(this.c);
            if (this.g != null) {
                this.h.setTranslate(this.i.left, this.i.top);
                this.h.preScale(this.i.width() / this.a.getWidth(), this.i.height() / this.a.getHeight());
                this.g.setLocalMatrix(this.h);
                this.f.setShader((Shader)this.g);
            }
            this.j = false;
        }
    }
    
    public final void c() {
        this.k = true;
        this.j = true;
        this.e();
        this.f.setShader((Shader)this.g);
        this.invalidateSelf();
    }
    
    public final void d() {
        if (this.b == 8.0f) {
            return;
        }
        this.k = false;
        if (f(8.0f)) {
            this.f.setShader((Shader)this.g);
        }
        else {
            this.f.setShader((Shader)null);
        }
        this.b = 8.0f;
        this.invalidateSelf();
    }
    
    public final void draw(final Canvas canvas) {
        final Bitmap a = this.a;
        if (a == null) {
            return;
        }
        this.b();
        if (this.f.getShader() == null) {
            canvas.drawBitmap(a, (Rect)null, this.c, this.f);
            return;
        }
        final RectF i = this.i;
        final float b = this.b;
        canvas.drawRoundRect(i, b, b, this.f);
    }
    
    public final int getAlpha() {
        return this.f.getAlpha();
    }
    
    public final ColorFilter getColorFilter() {
        return this.f.getColorFilter();
    }
    
    public final int getIntrinsicHeight() {
        return this.m;
    }
    
    public final int getIntrinsicWidth() {
        return this.l;
    }
    
    public final int getOpacity() {
        if (this.e == 119) {
            if (!this.k) {
                final Bitmap a = this.a;
                if (a != null && !a.hasAlpha() && this.f.getAlpha() >= 255) {
                    if (!f(this.b)) {
                        return -1;
                    }
                }
            }
        }
        return -3;
    }
    
    protected final void onBoundsChange(final Rect rect) {
        super.onBoundsChange(rect);
        if (this.k) {
            this.e();
        }
        this.j = true;
    }
    
    public final void setAlpha(final int alpha) {
        if (alpha != this.f.getAlpha()) {
            this.f.setAlpha(alpha);
            this.invalidateSelf();
        }
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
        this.invalidateSelf();
    }
    
    public final void setDither(final boolean dither) {
        this.f.setDither(dither);
        this.invalidateSelf();
    }
    
    public final void setFilterBitmap(final boolean filterBitmap) {
        this.f.setFilterBitmap(filterBitmap);
        this.invalidateSelf();
    }
}
