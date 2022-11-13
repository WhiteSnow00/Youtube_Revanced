import java.util.concurrent.Callable;
import android.view.ViewConfiguration;
import android.content.Context;
import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hpy
{
    public final PointF a;
    public final PointF b;
    public final wyv c;
    public final int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    private final PointF j;
    
    public hpy(final Context context, final wyv c, final vai vai, final msr msr, final byte[] array, final byte[] array2) {
        this.a = new PointF();
        this.b = new PointF();
        this.j = new PointF();
        this.h = false;
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.c = c;
        msr.Q((Callable)new hly(this, vai, 10));
    }
    
    public static float a(final PointF pointF, final PointF pointF2) {
        return (float)Math.sqrt(b(pointF, pointF2));
    }
    
    static float b(final PointF pointF, final PointF pointF2) {
        final float n = pointF2.x - pointF.x;
        final float n2 = pointF2.y - pointF.y;
        return n * n + n2 * n2;
    }
    
    public static appm c(final int d) {
        final ahaz builder = appm.a.createBuilder();
        builder.copyOnWrite();
        final appm appm = (appm)builder.instance;
        appm.b |= 0x2;
        appm.d = d;
        return (appm)builder.build();
    }
    
    public final void d() {
        this.e = false;
        this.i = 0;
    }
    
    public final void e() {
        if (this.e) {
            if (a(this.a, this.b) > this.d) {
                this.e = false;
                final float n = (float)Math.toDegrees(Math.atan2(this.b.y - this.a.y, this.b.x - this.a.x));
                int i;
                int n2;
                if (n > -45.0f && n < 45.0f) {
                    i = 93502;
                    n2 = 91955;
                }
                else if (n >= 45.0f && n <= 135.0f) {
                    if (!this.f) {
                        return;
                    }
                    i = 93500;
                    n2 = 91953;
                }
                else if (n >= -135.0f && n <= -45.0f) {
                    if (!this.f) {
                        return;
                    }
                    i = 93503;
                    n2 = 91956;
                }
                else {
                    i = 93501;
                    n2 = 91954;
                }
                this.h(65, n2);
                this.i = i;
            }
        }
    }
    
    public final void f(final float n, final float n2) {
        if (!this.e) {
            return;
        }
        this.j.set(n, n2);
        if (b(this.a, this.j) > b(this.a, this.b)) {
            this.b.set(this.j);
        }
    }
    
    public final void g(final float n, final float n2) {
        this.a.set(n, n2);
        this.b.set(this.a);
        this.e = true;
        this.i = 0;
    }
    
    public final void h(final int n, final int n2) {
        this.c.pF().J(n, (wzz)new wyt(xaa.c(n2)), (alhi)null);
    }
}
