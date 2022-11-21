import android.graphics.Canvas;
import android.view.View$OnTouchListener;
import android.content.Context;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.RectF;
import android.graphics.Paint;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acxu extends View
{
    private static final Paint g;
    public final acyd a;
    public final RectF b;
    public final View c;
    public final boolean d;
    public boolean e;
    public boolean f;
    private final int[] h;
    private final Paint i;
    private final float j;
    
    static {
        final Paint g2 = new Paint(1);
        (g = g2).setColor(0);
        g2.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.SRC_OUT));
    }
    
    public acxu(final Context context, final acyd a, final View c, final boolean d) {
        super(context);
        this.a = a;
        this.d = d;
        this.b = new RectF();
        this.h = new int[2];
        this.e = true;
        this.f = true;
        this.setClickable(false);
        this.setFocusable(false);
        this.setLayerType(2, (Paint)null);
        this.c = c;
        this.a();
        (this.i = new Paint(1)).setColor(tqf.cx(context, 2130970871).orElse(0));
        this.j = (float)tqf.aZ(this.getResources().getDisplayMetrics(), 2);
        this.setOnTouchListener((View$OnTouchListener)new acut(this, 2));
    }
    
    private final void a() {
        this.c.getLocationInWindow(this.h);
        final RectF b = this.b;
        final int[] h = this.h;
        final int n = h[0];
        b.set((float)n, (float)h[1], (float)(n + this.c.getMeasuredWidth()), (float)(this.h[1] + this.c.getMeasuredHeight()));
    }
    
    public final void invalidate() {
        this.a();
        super.invalidate();
    }
    
    public final void onDraw(final Canvas canvas) {
        if (!this.e) {
            return;
        }
        canvas.drawPaint(this.i);
        final RectF b = this.b;
        final float j = this.j;
        canvas.drawRoundRect(b, j, j, acxu.g);
    }
}
