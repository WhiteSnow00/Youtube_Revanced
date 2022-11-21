import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adyz extends adyw
{
    public final adyx a;
    public final adyy b;
    
    public adyz(final Context context, final adyj adyj, final adyx a, final adyy b) {
        super(context, adyj);
        this.a = a;
        a.b = this;
        this.b = b;
        b.j = this;
    }
    
    public final boolean b(final boolean b, final boolean b2, final boolean b3) {
        final boolean b4 = super.b(b, b2, b3);
        if (!this.isRunning()) {
            this.b.a();
        }
        adfe.z(this.d.getContentResolver());
        if (b && b3) {
            this.b.d();
        }
        return b4;
    }
    
    public final void draw(final Canvas canvas) {
        final Rect rect = new Rect();
        if (!this.getBounds().isEmpty() && this.isVisible()) {
            if (canvas.getClipBounds(rect)) {
                canvas.save();
                this.a.f(canvas, this.getBounds(), this.c());
                this.a.e(canvas, this.h);
                int n = 0;
                while (true) {
                    final adyy b = this.b;
                    final int[] l = b.l;
                    if (n >= l.length) {
                        break;
                    }
                    final adyx a = this.a;
                    final Paint h = this.h;
                    final float[] k = b.k;
                    final int n2 = n + n;
                    a.d(canvas, h, k[n2], k[n2 + 1], l[n]);
                    ++n;
                }
                canvas.restore();
            }
        }
    }
    
    public final int getIntrinsicHeight() {
        return this.a.a();
    }
    
    public final int getIntrinsicWidth() {
        return this.a.b();
    }
    
    public final /* bridge */ int getOpacity() {
        return -3;
    }
}
