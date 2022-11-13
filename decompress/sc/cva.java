import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.RadialGradient;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.PointF;
import android.graphics.Matrix;
import android.graphics.Canvas;
import java.util.ArrayList;
import java.util.List;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Path;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cva implements cux, cvm, cvd
{
    private final String a;
    private final boolean b;
    private final cxp c;
    private final abl d;
    private final abl e;
    private final Path f;
    private final Paint g;
    private final RectF h;
    private final List i;
    private final cvr j;
    private final cvr k;
    private final cvr l;
    private final cvr m;
    private cvr n;
    private cwf o;
    private final cui p;
    private final int q;
    private final int r;
    
    public cva(final cui p3, final cxp c, final cxc cxc) {
        this.d = new abl();
        this.e = new abl();
        final Path f = new Path();
        this.f = f;
        this.g = (Paint)new cut(1);
        this.h = new RectF();
        this.i = new ArrayList();
        this.c = c;
        this.a = cxc.f;
        this.b = cxc.g;
        this.p = p3;
        this.r = cxc.h;
        f.setFillType(cxc.a);
        this.q = (int)(p3.a.a() / 32.0f);
        final cvr a = cxc.b.a();
        (this.j = a).g((cvm)this);
        c.h(a);
        final cvr a2 = cxc.c.a();
        (this.k = a2).g((cvm)this);
        c.h(a2);
        final cvr a3 = cxc.d.a();
        (this.l = a3).g((cvm)this);
        c.h(a3);
        final cvr a4 = cxc.e.a();
        (this.m = a4).g((cvm)this);
        c.h(a4);
    }
    
    private final int h() {
        final int round = Math.round(this.l.c * this.q);
        final int round2 = Math.round(this.m.c * this.q);
        final int round3 = Math.round(this.j.c * this.q);
        int n;
        if (round != 0) {
            n = round * 527;
        }
        else {
            n = 17;
        }
        int n2 = n;
        if (round2 != 0) {
            n2 = n * 31 * round2;
        }
        int n3 = n2;
        if (round3 != 0) {
            n3 = n2 * 31 * round3;
        }
        return n3;
    }
    
    private final int[] i(int[] array) {
        final cwf o = this.o;
        int[] array2 = array;
        if (o != null) {
            final Integer[] array3 = (Integer[])o.e();
            final int length = array.length;
            final int length2 = array3.length;
            int n = 0;
            final int n2 = 0;
            if (length == length2) {
                int n3 = n2;
                while (true) {
                    array2 = array;
                    if (n3 >= array.length) {
                        break;
                    }
                    array[n3] = array3[n3];
                    ++n3;
                }
            }
            else {
                array = new int[length2];
                while (true) {
                    array2 = array;
                    if (n >= array3.length) {
                        break;
                    }
                    array[n] = array3[n];
                    ++n;
                }
            }
        }
        return array2;
    }
    
    public final void a(final Object o, final czt d) {
        if (o == cun.d) {
            this.k.d = d;
            return;
        }
        if (o == cun.E) {
            final cvr n = this.n;
            if (n != null) {
                this.c.j(n);
            }
            (this.n = new cwf(d)).g((cvm)this);
            this.c.h(this.n);
            return;
        }
        if (o == cun.F) {
            final cwf o2 = this.o;
            if (o2 != null) {
                this.c.j(o2);
            }
            this.d.h();
            this.e.h();
            (this.o = new cwf(d)).g((cvm)this);
            this.c.h(this.o);
        }
    }
    
    @Override
    public final void b(final Canvas canvas, final Matrix localMatrix, int intValue) {
        if (this.b) {
            return;
        }
        this.f.reset();
        for (int i = 0; i < this.i.size(); ++i) {
            this.f.addPath(((cvf)this.i.get(i)).i(), localMatrix);
        }
        this.f.computeBounds(this.h, false);
        Object shader;
        if (this.r == 1) {
            final int h = this.h();
            final abl d = this.d;
            final long n = h;
            if ((shader = d.e(n)) == null) {
                final PointF pointF = (PointF)this.l.e();
                final PointF pointF2 = (PointF)this.m.e();
                final eab eab = (eab)this.j.e();
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, this.i((int[])eab.b), (float[])eab.a, Shader$TileMode.CLAMP);
                this.d.i(n, shader);
            }
        }
        else {
            final int h2 = this.h();
            final abl e = this.e;
            final long n2 = h2;
            if ((shader = e.e(n2)) == null) {
                final PointF pointF3 = (PointF)this.l.e();
                final PointF pointF4 = (PointF)this.m.e();
                final eab eab2 = (eab)this.j.e();
                final int[] j = this.i((int[])eab2.b);
                final Object a = eab2.a;
                final float x = pointF3.x;
                final float y = pointF3.y;
                float n3 = (float)Math.hypot(pointF4.x - x, pointF4.y - y);
                if (n3 <= 0.0f) {
                    n3 = 0.001f;
                }
                shader = new RadialGradient(x, y, n3, j, (float[])a, Shader$TileMode.CLAMP);
                this.e.i(n2, shader);
            }
        }
        ((Shader)shader).setLocalMatrix(localMatrix);
        this.g.setShader((Shader)shader);
        final cvr n4 = this.n;
        if (n4 != null) {
            this.g.setColorFilter((ColorFilter)n4.e());
        }
        final float n5 = (float)intValue;
        intValue = (int)this.k.e();
        this.g.setAlpha(czm.k((int)(n5 / 255.0f * intValue / 100.0f * 255.0f)));
        canvas.drawPath(this.f, this.g);
        ctq.a();
    }
    
    @Override
    public final void c(final RectF rectF, final Matrix matrix, final boolean b) {
        this.f.reset();
        for (int i = 0; i < this.i.size(); ++i) {
            this.f.addPath(((cvf)this.i.get(i)).i(), matrix);
        }
        this.f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }
    
    public final void d() {
        this.p.invalidateSelf();
    }
    
    public final void e(final cwj cwj, final int n, final List list, final cwj cwj2) {
        czm.h(cwj, n, list, cwj2, (cvd)this);
    }
    
    public final void f(final List list, final List list2) {
        for (int i = 0; i < list2.size(); ++i) {
            final cuv cuv = list2.get(i);
            if (cuv instanceof cvf) {
                this.i.add(cuv);
            }
        }
    }
    
    public final String g() {
        return this.a;
    }
}
