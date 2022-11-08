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

public final class cuz implements cuw, cvl, cvc
{
    private final String a;
    private final boolean b;
    private final cxo c;
    private final abk d;
    private final abk e;
    private final Path f;
    private final Paint g;
    private final RectF h;
    private final List i;
    private final cvq j;
    private final cvq k;
    private final cvq l;
    private final cvq m;
    private cvq n;
    private cwe o;
    private final cuh p;
    private final int q;
    private final int r;
    
    public cuz(final cuh p3, final cxo c, final cxb cxb) {
        this.d = new abk();
        this.e = new abk();
        final Path f = new Path();
        this.f = f;
        this.g = (Paint)new cus(1);
        this.h = new RectF();
        this.i = new ArrayList();
        this.c = c;
        this.a = cxb.f;
        this.b = cxb.g;
        this.p = p3;
        this.r = cxb.h;
        f.setFillType(cxb.a);
        this.q = (int)(p3.a.a() / 32.0f);
        final cvq a = cxb.b.a();
        (this.j = a).g((cvl)this);
        c.h(a);
        final cvq a2 = cxb.c.a();
        (this.k = a2).g((cvl)this);
        c.h(a2);
        final cvq a3 = cxb.d.a();
        (this.l = a3).g((cvl)this);
        c.h(a3);
        final cvq a4 = cxb.e.a();
        (this.m = a4).g((cvl)this);
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
        final cwe o = this.o;
        int[] array2 = array;
        if (o != null) {
            final Integer[] array3 = (Integer[])((cvq)o).e();
            final int length = array.length;
            final int length2 = array3.length;
            final int n = 0;
            int n2 = 0;
            if (length == length2) {
                while (true) {
                    array2 = array;
                    if (n2 >= array.length) {
                        break;
                    }
                    array[n2] = array3[n2];
                    ++n2;
                }
            }
            else {
                array = new int[length2];
                int n3 = n;
                while (true) {
                    array2 = array;
                    if (n3 >= array3.length) {
                        break;
                    }
                    array[n3] = array3[n3];
                    ++n3;
                }
            }
        }
        return array2;
    }
    
    public final void a(final Object o, final czs d) {
        if (o == cum.d) {
            this.k.d = d;
            return;
        }
        if (o == cum.E) {
            final cvq n = this.n;
            if (n != null) {
                this.c.j(n);
            }
            (this.n = (cvq)new cwe(d)).g((cvl)this);
            this.c.h(this.n);
            return;
        }
        if (o == cum.F) {
            final cwe o2 = this.o;
            if (o2 != null) {
                this.c.j((cvq)o2);
            }
            this.d.h();
            this.e.h();
            ((cvq)(this.o = new cwe(d))).g((cvl)this);
            this.c.h((cvq)this.o);
        }
    }
    
    public final void b(final Canvas canvas, final Matrix localMatrix, final int n) {
        if (this.b) {
            return;
        }
        this.f.reset();
        for (int i = 0; i < this.i.size(); ++i) {
            this.f.addPath(((cve)this.i.get(i)).i(), localMatrix);
        }
        this.f.computeBounds(this.h, false);
        Object shader;
        if (this.r == 1) {
            final long n2 = this.h();
            if ((shader = this.d.e(n2)) == null) {
                final PointF pointF = (PointF)this.l.e();
                final PointF pointF2 = (PointF)this.m.e();
                final eaa eaa = (eaa)this.j.e();
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, this.i((int[])eaa.b), (float[])eaa.a, Shader$TileMode.CLAMP);
                this.d.i(n2, shader);
            }
        }
        else {
            final long n3 = this.h();
            if ((shader = this.e.e(n3)) == null) {
                final PointF pointF3 = (PointF)this.l.e();
                final PointF pointF4 = (PointF)this.m.e();
                final eaa eaa2 = (eaa)this.j.e();
                final int[] j = this.i((int[])eaa2.b);
                final Object a = eaa2.a;
                final float x = pointF3.x;
                final float y = pointF3.y;
                float n4 = (float)Math.hypot(pointF4.x - x, pointF4.y - y);
                if (n4 <= 0.0f) {
                    n4 = 0.001f;
                }
                shader = new RadialGradient(x, y, n4, j, (float[])a, Shader$TileMode.CLAMP);
                this.e.i(n3, shader);
            }
        }
        ((Shader)shader).setLocalMatrix(localMatrix);
        this.g.setShader((Shader)shader);
        final cvq n5 = this.n;
        if (n5 != null) {
            this.g.setColorFilter((ColorFilter)n5.e());
        }
        this.g.setAlpha(czl.k((int)(n / 255.0f * (int)this.k.e() / 100.0f * 255.0f)));
        canvas.drawPath(this.f, this.g);
        ctp.a();
    }
    
    public final void c(final RectF rectF, final Matrix matrix, final boolean b) {
        this.f.reset();
        for (int i = 0; i < this.i.size(); ++i) {
            this.f.addPath(((cve)this.i.get(i)).i(), matrix);
        }
        this.f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }
    
    public final void d() {
        this.p.invalidateSelf();
    }
    
    public final void e(final cwi cwi, final int n, final List list, final cwi cwi2) {
        czl.h(cwi, n, list, cwi2, (cvc)this);
    }
    
    public final void f(final List list, final List list2) {
        for (int i = 0; i < list2.size(); ++i) {
            final cuu cuu = list2.get(i);
            if (cuu instanceof cve) {
                this.i.add(cuu);
            }
        }
    }
    
    public final String g() {
        return this.a;
    }
}
