import android.graphics.PointF;
import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cwe
{
    public cvr a;
    public cvr b;
    public cvr c;
    public cvr d;
    public cvr e;
    public final cvt f;
    public final cvt g;
    public final cvr h;
    public final cvr i;
    private final Matrix j;
    private final Matrix k;
    private final Matrix l;
    private final Matrix m;
    private final float[] n;
    
    public cwe(final cwx cwx) {
        this.j = new Matrix();
        final cwr a = cwx.a;
        cvr a2;
        if (a == null) {
            a2 = null;
        }
        else {
            a2 = a.a();
        }
        this.a = a2;
        final cwy b = cwx.b;
        cvr a3;
        if (b == null) {
            a3 = null;
        }
        else {
            a3 = b.a();
        }
        this.b = a3;
        final cwt c = cwx.c;
        cvr a4;
        if (c == null) {
            a4 = null;
        }
        else {
            a4 = c.a();
        }
        this.c = a4;
        final cwo d = cwx.d;
        cvr a5;
        if (d == null) {
            a5 = null;
        }
        else {
            a5 = d.a();
        }
        this.d = a5;
        final cwo f = cwx.f;
        Object a6;
        if (f == null) {
            a6 = null;
        }
        else {
            a6 = f.a();
        }
        final cvt f2 = (cvt)a6;
        this.f = f2;
        if (f2 != null) {
            this.k = new Matrix();
            this.l = new Matrix();
            this.m = new Matrix();
            this.n = new float[9];
        }
        else {
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
        }
        final cwo g = cwx.g;
        Object a7;
        if (g == null) {
            a7 = null;
        }
        else {
            a7 = g.a();
        }
        this.g = (cvt)a7;
        final cwq e = cwx.e;
        if (e != null) {
            this.e = e.a();
        }
        final cwo h = cwx.h;
        if (h != null) {
            this.h = h.a();
        }
        else {
            this.h = null;
        }
        final cwo i = cwx.i;
        if (i != null) {
            this.i = i.a();
            return;
        }
        this.i = null;
    }
    
    private final void f() {
        for (int i = 0; i < 9; ++i) {
            this.n[i] = 0.0f;
        }
    }
    
    public final Matrix a() {
        this.j.reset();
        final cvr b = this.b;
        if (b != null) {
            final PointF pointF = (PointF)b.e();
            if (pointF.x != 0.0f || pointF.y != 0.0f) {
                this.j.preTranslate(pointF.x, pointF.y);
            }
        }
        final cvr d = this.d;
        if (d != null) {
            float n;
            if (d instanceof cwf) {
                n = (float)d.e();
            }
            else {
                n = ((cvt)d).k();
            }
            if (n != 0.0f) {
                this.j.preRotate(n);
            }
        }
        if (this.f != null) {
            final cvt g = this.g;
            float n2;
            if (g == null) {
                n2 = 0.0f;
            }
            else {
                n2 = (float)Math.cos(Math.toRadians(-g.k() + 90.0f));
            }
            final cvt g2 = this.g;
            float n3;
            if (g2 == null) {
                n3 = 1.0f;
            }
            else {
                n3 = (float)Math.sin(Math.toRadians(-g2.k() + 90.0f));
            }
            final float n4 = (float)Math.tan(Math.toRadians(this.f.k()));
            this.f();
            final float[] n5 = this.n;
            n5[0] = n2;
            n5[1] = n3;
            final float n6 = -n3;
            n5[3] = n6;
            n5[4] = n2;
            n5[8] = 1.0f;
            this.k.setValues(n5);
            this.f();
            final float[] n7 = this.n;
            n7[0] = 1.0f;
            n7[3] = n4;
            n7[8] = (n7[4] = 1.0f);
            this.l.setValues(n7);
            this.f();
            final float[] n8 = this.n;
            n8[0] = n2;
            n8[1] = n6;
            n8[3] = n3;
            n8[4] = n2;
            n8[8] = 1.0f;
            this.m.setValues(n8);
            this.l.preConcat(this.k);
            this.m.preConcat(this.l);
            this.j.preConcat(this.m);
        }
        final cvr c = this.c;
        if (c != null) {
            final czu czu = (czu)c.e();
            final float a = czu.a;
            if (a != 1.0f || czu.b != 1.0f) {
                this.j.preScale(a, czu.b);
            }
        }
        final cvr a2 = this.a;
        if (a2 != null) {
            final PointF pointF2 = (PointF)a2.e();
            if (pointF2.x != 0.0f || pointF2.y != 0.0f) {
                this.j.preTranslate(-pointF2.x, -pointF2.y);
            }
        }
        return this.j;
    }
    
    public final Matrix b(final float n) {
        final cvr b = this.b;
        final PointF pointF = null;
        PointF pointF2;
        if (b == null) {
            pointF2 = null;
        }
        else {
            pointF2 = (PointF)b.e();
        }
        final cvr c = this.c;
        czu czu;
        if (c == null) {
            czu = null;
        }
        else {
            czu = (czu)c.e();
        }
        this.j.reset();
        if (pointF2 != null) {
            this.j.preTranslate(pointF2.x * n, pointF2.y * n);
        }
        if (czu != null) {
            final Matrix j = this.j;
            final double n2 = czu.a;
            final double n3 = n;
            j.preScale((float)Math.pow(n2, n3), (float)Math.pow(czu.b, n3));
        }
        final cvr d = this.d;
        if (d != null) {
            final float floatValue = (float)d.e();
            final cvr a = this.a;
            PointF pointF3;
            if (a == null) {
                pointF3 = pointF;
            }
            else {
                pointF3 = (PointF)a.e();
            }
            final Matrix i = this.j;
            float y = 0.0f;
            float x;
            if (pointF3 == null) {
                x = 0.0f;
            }
            else {
                x = pointF3.x;
            }
            if (pointF3 != null) {
                y = pointF3.y;
            }
            i.preRotate(floatValue * n, x, y);
        }
        return this.j;
    }
    
    public final void c(final cxp cxp) {
        cxp.h(this.e);
        cxp.h(this.h);
        cxp.h(this.i);
        cxp.h(this.a);
        cxp.h(this.b);
        cxp.h(this.c);
        cxp.h(this.d);
        cxp.h((cvr)this.f);
        cxp.h((cvr)this.g);
    }
    
    public final void d(final cvm cvm) {
        final cvr e = this.e;
        if (e != null) {
            e.g(cvm);
        }
        final cvr h = this.h;
        if (h != null) {
            h.g(cvm);
        }
        final cvr i = this.i;
        if (i != null) {
            i.g(cvm);
        }
        final cvr a = this.a;
        if (a != null) {
            a.g(cvm);
        }
        final cvr b = this.b;
        if (b != null) {
            b.g(cvm);
        }
        final cvr c = this.c;
        if (c != null) {
            c.g(cvm);
        }
        final cvr d = this.d;
        if (d != null) {
            d.g(cvm);
        }
        final cvt f = this.f;
        if (f != null) {
            ((cvr)f).g(cvm);
        }
        final cvt g = this.g;
        if (g != null) {
            ((cvr)g).g(cvm);
        }
    }
    
    public final boolean e(final Object o, final czt czt) {
        if (o == cun.e) {
            final cvr a = this.a;
            if (a == null) {
                new PointF();
                this.a = (cvr)new cwf(czt, (byte[])null);
            }
            else {
                a.d = czt;
            }
        }
        else if (o == cun.f) {
            final cvr b = this.b;
            if (b == null) {
                new PointF();
                this.b = (cvr)new cwf(czt, (byte[])null);
            }
            else {
                b.d = czt;
            }
        }
        else {
            if (o == cun.g) {
                final cvr b2 = this.b;
                if (b2 instanceof cwc) {
                    final cwc cwc = (cwc)b2;
                    final czt e = cwc.e;
                    cwc.e = czt;
                    return true;
                }
            }
            if (o == cun.h) {
                final cvr b3 = this.b;
                if (b3 instanceof cwc) {
                    final cwc cwc2 = (cwc)b3;
                    final czt f = cwc2.f;
                    cwc2.f = czt;
                    return true;
                }
            }
            if (o == cun.m) {
                final cvr c = this.c;
                if (c == null) {
                    this.c = (cvr)new cwf(czt, (byte[])null);
                }
                else {
                    c.d = czt;
                }
            }
            else if (o == cun.n) {
                final cvr d = this.d;
                if (d == null) {
                    this.d = (cvr)new cwf(czt, (byte[])null);
                }
                else {
                    d.d = czt;
                }
            }
            else {
                Object o3 = null;
                Label_0284: {
                    if (o != cun.c) {
                        while (true) {
                            Label_0318: {
                                if (o != cun.A) {
                                    break Label_0318;
                                }
                                final cvr h = this.h;
                                if (h == null) {
                                    break Label_0318;
                                }
                                final Object o2 = h;
                                ((cvr)o2).d = czt;
                                return true;
                            }
                            if (o == cun.B) {
                                final cvr i = this.i;
                                if (i != null) {
                                    final Object o2 = i;
                                    continue;
                                }
                            }
                            if (o == cun.o) {
                                final cvt f2 = this.f;
                                if (f2 != null) {
                                    final Object o2 = f2;
                                    continue;
                                }
                            }
                            break;
                        }
                        if (o == cun.p) {
                            o3 = this.g;
                            if (o3 != null) {
                                break Label_0284;
                            }
                        }
                        return false;
                    }
                    if ((o3 = this.e) == null) {
                        this.e = (cvr)new cwf(czt, (byte[])null);
                        return true;
                    }
                }
                ((cvr)o3).d = czt;
            }
        }
        return true;
    }
}
