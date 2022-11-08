import android.graphics.ColorFilter;
import android.graphics.PathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Canvas;
import android.graphics.Paint$Style;
import java.util.ArrayList;
import android.graphics.Paint$Join;
import android.graphics.Paint$Cap;
import java.util.List;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cut implements cvl, cvc, cuw
{
    protected final cxo a;
    final Paint b;
    private final PathMeasure c;
    private final Path d;
    private final Path e;
    private final RectF f;
    private final cuh g;
    private final List h;
    private final float[] i;
    private final cvq j;
    private final cvq k;
    private final List l;
    private final cvq m;
    private cvq n;
    
    public cut(final cuh g, final cxo a, final Paint$Cap strokeCap, final Paint$Join strokeJoin, final float strokeMiter, final cwp cwp, final cwn cwn, final List list, final cwn cwn2) {
        this.c = new PathMeasure();
        this.d = new Path();
        this.e = new Path();
        this.f = new RectF();
        this.h = new ArrayList();
        final cus b = new cus(1);
        this.b = (Paint)b;
        this.g = g;
        this.a = a;
        ((Paint)b).setStyle(Paint$Style.STROKE);
        ((Paint)b).setStrokeCap(strokeCap);
        ((Paint)b).setStrokeJoin(strokeJoin);
        ((Paint)b).setStrokeMiter(strokeMiter);
        this.k = cwp.a();
        this.j = cwn.a();
        if (cwn2 == null) {
            this.m = null;
        }
        else {
            this.m = cwn2.a();
        }
        this.l = new ArrayList(list.size());
        this.i = new float[list.size()];
        final int n = 0;
        for (int i = 0; i < list.size(); ++i) {
            this.l.add(((cwn)list.get(i)).a());
        }
        a.h(this.k);
        a.h(this.j);
        for (int j = 0; j < this.l.size(); ++j) {
            a.h((cvq)this.l.get(j));
        }
        final cvq m = this.m;
        if (m != null) {
            a.h(m);
        }
        this.k.g((cvl)this);
        this.j.g((cvl)this);
        for (int k = n; k < list.size(); ++k) {
            ((cvq)this.l.get(k)).g((cvl)this);
        }
        final cvq l = this.m;
        if (l != null) {
            l.g((cvl)this);
        }
    }
    
    public void a(final Object o, final czs czs) {
        if (o == cum.d) {
            this.k.d = czs;
            return;
        }
        if (o == cum.q) {
            this.j.d = czs;
            return;
        }
        if (o == cum.E) {
            final cvq n = this.n;
            if (n != null) {
                this.a.j(n);
            }
            (this.n = (cvq)new cwe(czs)).g((cvl)this);
            this.a.h(this.n);
        }
    }
    
    public void b(final Canvas canvas, final Matrix matrix, int i) {
        final float[] array = czq.a.get();
        array[1] = (array[0] = 0.0f);
        array[2] = 37394.73f;
        array[3] = 39575.234f;
        matrix.mapPoints(array);
        if (array[0] == array[2] || array[1] == array[3]) {
            ctp.a();
            return;
        }
        final cvu cvu = (cvu)this.k;
        this.b.setAlpha(czl.k((int)(i / 255.0f * cvu.k(cvu.d(), cvu.b()) / 100.0f * 255.0f)));
        this.b.setStrokeWidth(((cvs)this.j).k() * czq.c(matrix));
        if (this.b.getStrokeWidth() > 0.0f) {
            if (this.l.isEmpty()) {
                ctp.a();
            }
            else {
                final float c = czq.c(matrix);
                float[] j;
                float[] k;
                float[] l;
                for (i = 0; i < this.l.size(); ++i) {
                    this.i[i] = (float)this.l.get(i).e();
                    if (i % 2 == 0) {
                        j = this.i;
                        if (j[i] < 1.0f) {
                            j[i] = 1.0f;
                        }
                    }
                    else {
                        k = this.i;
                        if (k[i] < 0.1f) {
                            k[i] = 0.1f;
                        }
                    }
                    l = this.i;
                    l[i] *= c;
                }
                final cvq m = this.m;
                float n;
                if (m == null) {
                    n = 0.0f;
                }
                else {
                    n = (float)m.e() * c;
                }
                this.b.setPathEffect((PathEffect)new DashPathEffect(this.i, n));
                ctp.a();
            }
            final cvq n2 = this.n;
            if (n2 != null) {
                this.b.setColorFilter((ColorFilter)n2.e());
            }
            eaa eaa;
            int size;
            float length;
            float n3;
            float n4;
            float n5;
            int n6;
            float n7;
            float length2;
            float n8;
            float n9;
            float n10;
            float n11;
            float n12;
            int size2;
            for (i = 0; i < this.h.size(); ++i) {
                eaa = this.h.get(i);
                if (eaa.b != null) {
                    this.d.reset();
                    size = ((List)eaa.a).size();
                    while (--size >= 0) {
                        this.d.addPath(((cve)((List<Object>)eaa.a).get(size)).i(), matrix);
                    }
                    this.c.setPath(this.d, false);
                    length = this.c.getLength();
                    while (this.c.nextContour()) {
                        length += this.c.getLength();
                    }
                    n3 = (float)((cvk)eaa.b).d.e() * length / 360.0f;
                    n4 = (float)((cvk)eaa.b).b.e() * length / 100.0f + n3;
                    n5 = (float)((cvk)eaa.b).c.e() * length / 100.0f + n3;
                    n6 = ((List)eaa.a).size() - 1;
                    n7 = 0.0f;
                    while (n6 >= 0) {
                        this.e.set(((cve)((List<Object>)eaa.a).get(n6)).i());
                        this.e.transform(matrix);
                        this.c.setPath(this.e, false);
                        length2 = this.c.getLength();
                        Label_0910: {
                            if (n5 > length) {
                                n8 = n5 - length;
                                if (n8 < n7 + length2 && n7 < n8) {
                                    if (n4 > length) {
                                        n9 = (n4 - length) / length2;
                                    }
                                    else {
                                        n9 = 0.0f;
                                    }
                                    czq.h(this.e, n9, Math.min(n8 / length2, 1.0f), 0.0f);
                                    canvas.drawPath(this.e, this.b);
                                    break Label_0910;
                                }
                            }
                            n10 = n7 + length2;
                            if (n10 >= n4 && n7 <= n5) {
                                if (n10 <= n5 && n4 < n7) {
                                    canvas.drawPath(this.e, this.b);
                                }
                                else {
                                    if (n4 < n7) {
                                        n11 = 0.0f;
                                    }
                                    else {
                                        n11 = (n4 - n7) / length2;
                                    }
                                    if (n5 > n10) {
                                        n12 = 1.0f;
                                    }
                                    else {
                                        n12 = (n5 - n7) / length2;
                                    }
                                    czq.h(this.e, n11, n12, 0.0f);
                                    canvas.drawPath(this.e, this.b);
                                }
                            }
                        }
                        n7 += length2;
                        --n6;
                    }
                    ctp.a();
                }
                else {
                    this.d.reset();
                    size2 = ((List)eaa.a).size();
                    while (--size2 >= 0) {
                        this.d.addPath(((cve)((List<Object>)eaa.a).get(size2)).i(), matrix);
                    }
                    ctp.a();
                    canvas.drawPath(this.d, this.b);
                    ctp.a();
                }
            }
            ctp.a();
            return;
        }
        ctp.a();
    }
    
    public final void c(final RectF rectF, final Matrix matrix, final boolean b) {
        this.d.reset();
        for (int i = 0; i < this.h.size(); ++i) {
            final eaa eaa = this.h.get(i);
            for (int j = 0; j < ((List)eaa.a).size(); ++j) {
                this.d.addPath(((cve)((List<Object>)eaa.a).get(j)).i(), matrix);
            }
        }
        this.d.computeBounds(this.f, false);
        final float k = ((cvs)this.j).k();
        final RectF f = this.f;
        final float n = k / 2.0f;
        f.set(f.left - n, this.f.top - n, this.f.right + n, this.f.bottom + n);
        rectF.set(this.f);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        ctp.a();
    }
    
    public final void d() {
        this.g.invalidateSelf();
    }
    
    public final void e(final cwi cwi, final int n, final List list, final cwi cwi2) {
        czl.h(cwi, n, list, cwi2, (cvc)this);
    }
    
    public final void f(final List list, final List list2) {
        int i = list.size() - 1;
        final eaa eaa = null;
        cvk cvk = null;
        while (i >= 0) {
            final cuu cuu = list.get(i);
            cvk cvk2 = cvk;
            if (cuu instanceof cvk) {
                final cvk cvk3 = (cvk)cuu;
                cvk2 = cvk;
                if (cvk3.e == 2) {
                    cvk2 = cvk3;
                }
            }
            --i;
            cvk = cvk2;
        }
        if (cvk != null) {
            cvk.a((cvl)this);
        }
        int size = list2.size();
        eaa eaa2 = eaa;
        while (--size >= 0) {
            final cuu cuu2 = list2.get(size);
            eaa eaa3 = null;
            Label_0221: {
                if (cuu2 instanceof cvk) {
                    final cvk cvk4 = (cvk)cuu2;
                    if (cvk4.e == 2) {
                        if (eaa2 != null) {
                            this.h.add(eaa2);
                        }
                        eaa3 = new eaa(cvk4);
                        cvk4.a((cvl)this);
                        break Label_0221;
                    }
                }
                eaa3 = eaa2;
                if (cuu2 instanceof cve) {
                    if ((eaa3 = eaa2) == null) {
                        eaa3 = new eaa(cvk);
                    }
                    ((List<cve>)eaa3.a).add((cve)cuu2);
                }
            }
            eaa2 = eaa3;
        }
        if (eaa2 != null) {
            this.h.add(eaa2);
        }
    }
}
