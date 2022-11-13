import android.graphics.Canvas;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fsw extends View
{
    public volatile float a;
    public volatile long b;
    public volatile long c;
    public long d;
    public float e;
    public final Paint f;
    public final Paint g;
    public abpu h;
    public oby i;
    public final asiq j;
    public final asiq k;
    public String l;
    public String m;
    private volatile boolean n;
    
    public fsw(final Context context) {
        super(context);
        this.n = true;
        this.f = new Paint(1);
        this.g = new Paint(1);
        this.j = new asiq();
        this.k = new asiq();
        this.m = "";
    }
    
    private final void d(final Canvas canvas, final float n, final float n2, final Paint paint) {
        final float e = this.e;
        canvas.drawRoundRect(0.0f, 0.0f, n, n2, e, e, paint);
    }
    
    public final long a() {
        final oby i = this.i;
        if (i != null) {
            return i.d();
        }
        return 0L;
    }
    
    public final void b() {
        if (!this.isAttachedToWindow()) {
            return;
        }
        if (this.b > 0L && this.c > 0L && !this.n) {
            final long c = this.c;
            this.c = this.a();
            final long d = this.d + (this.c - c);
            this.d = d;
            if (d <= this.b) {
                this.a = this.d / (float)this.b;
                this.postInvalidateOnAnimation();
                this.postOnAnimation((Runnable)new eym(this, 10));
                return;
            }
            this.b = 0L;
            this.n = true;
        }
    }
    
    public final void c(final boolean n) {
        if (this.n && !n) {
            this.c = this.a();
        }
        this.n = n;
        this.b();
    }
    
    protected final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final float n = (float)this.getHeight();
        this.d(canvas, (float)this.getWidth(), n, this.f);
        if (this.a > 0.0f) {
            try {
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, this.a * this.getWidth(), n);
                this.d(canvas, this.a * this.getWidth(), n, this.g);
            }
            finally {
                canvas.restore();
            }
        }
    }
}
