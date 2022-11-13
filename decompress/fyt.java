import android.graphics.Canvas;
import android.graphics.Paint$Style;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fyt extends tqc
{
    public int a;
    private final Paint b;
    private final Rect c;
    private int d;
    private boolean e;
    
    public fyt(final int n, final int n2) {
        this(null, n, n2);
    }
    
    public fyt(final Drawable drawable, final int color, final int a) {
        Object o = drawable;
        if (drawable == null) {
            o = new ColorDrawable(0);
        }
        super((Drawable)o);
        final Paint b = new Paint();
        this.b = b;
        this.c = new Rect();
        this.d = 80;
        this.e = true;
        b.setStyle(Paint$Style.FILL);
        b.setColor(color);
        this.a = a;
    }
    
    private final void f() {
        if (this.a > 0) {
            final int d = this.d;
            Rect rect = null;
            Label_0239: {
                Label_0214: {
                    if (d != 8388611) {
                        if (d != 8388613) {
                            if (d == 3) {
                                break Label_0214;
                            }
                            if (d != 5) {
                                if (d == 16) {
                                    rect = new Rect(this.getBounds());
                                    rect.top = (int)Math.ceil(rect.exactCenterY() - this.a / 2.0f);
                                    rect.bottom = rect.top + this.a;
                                    break Label_0239;
                                }
                                if (d == 48) {
                                    rect = new Rect(this.getBounds());
                                    rect.bottom = rect.top + this.a;
                                    break Label_0239;
                                }
                                if (d == 80) {
                                    rect = new Rect(this.getBounds());
                                    rect.top = rect.bottom - this.a;
                                    break Label_0239;
                                }
                                throw new AssertionError((Object)"gravity should never be anything other than bottom, top, center_vertical, right, left, start, and end");
                            }
                        }
                        else if (air.a((Drawable)this) == 1) {
                            break Label_0214;
                        }
                    }
                    else if (air.a((Drawable)this) != 1) {
                        break Label_0214;
                    }
                    rect = new Rect(this.getBounds());
                    rect.left = rect.right - this.a;
                    break Label_0239;
                }
                rect = new Rect(this.getBounds());
                rect.right = rect.left + this.a;
            }
            if (!this.c.equals((Object)rect)) {
                this.c.set(rect);
                this.invalidateSelf();
            }
        }
    }
    
    public final int a() {
        return this.b.getColor();
    }
    
    public final void b(final int color) {
        if (color == this.b.getColor()) {
            return;
        }
        this.b.setColor(color);
        this.invalidateSelf();
    }
    
    public final void c(final int d) {
        if (d == this.d) {
            return;
        }
        if (d != 3 && d != 5 && d != 16 && d != 48 && d != 80 && d != 8388611 && d != 8388613) {
            throw new IllegalArgumentException("Unsupported gravity value");
        }
        this.d = d;
        this.f();
    }
    
    public final void d(final int a) {
        if (a == this.a) {
            return;
        }
        this.a = a;
        this.f();
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        if (this.e && this.a > 0 && this.a() != 0) {
            canvas.drawRect(this.c, this.b);
        }
    }
    
    public final void e(final boolean e) {
        if (this.e == e) {
            return;
        }
        this.e = e;
        this.invalidateSelf();
    }
    
    protected final void onBoundsChange(final Rect rect) {
        super.onBoundsChange(rect);
        this.f();
    }
    
    public final void setAlpha(final int n) {
        super.setAlpha(n);
        this.b.setAlpha(n);
    }
}
