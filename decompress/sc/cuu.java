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

public abstract class cuu implements cvm, cvd, cux
{
    protected final cxp a;
    final Paint b;
    private final PathMeasure c;
    private final Path d;
    private final Path e;
    private final RectF f;
    private final cui g;
    private final List h;
    private final float[] i;
    private final cvr j;
    private final cvr k;
    private final List l;
    private final cvr m;
    private cvr n;
    
    public cuu(final cui g, final cxp a, final Paint$Cap strokeCap, final Paint$Join strokeJoin, final float strokeMiter, final cwq cwq, final cwo cwo, final List list, final cwo cwo2) {
        this.c = new PathMeasure();
        this.d = new Path();
        this.e = new Path();
        this.f = new RectF();
        this.h = new ArrayList();
        final cut b = new cut(1);
        this.b = (Paint)b;
        this.g = g;
        this.a = a;
        ((Paint)b).setStyle(Paint$Style.STROKE);
        ((Paint)b).setStrokeCap(strokeCap);
        ((Paint)b).setStrokeJoin(strokeJoin);
        ((Paint)b).setStrokeMiter(strokeMiter);
        this.k = cwq.a();
        this.j = cwo.a();
        if (cwo2 == null) {
            this.m = null;
        }
        else {
            this.m = cwo2.a();
        }
        this.l = new ArrayList(list.size());
        this.i = new float[list.size()];
        final int n = 0;
        for (int i = 0; i < list.size(); ++i) {
            this.l.add(((cwo)list.get(i)).a());
        }
        a.h(this.k);
        a.h(this.j);
        for (int j = 0; j < this.l.size(); ++j) {
            a.h((cvr)this.l.get(j));
        }
        final cvr m = this.m;
        if (m != null) {
            a.h(m);
        }
        this.k.g((cvm)this);
        this.j.g((cvm)this);
        for (int k = n; k < list.size(); ++k) {
            ((cvr)this.l.get(k)).g((cvm)this);
        }
        final cvr l = this.m;
        if (l != null) {
            l.g((cvm)this);
        }
    }
    
    public void a(final Object o, final czt czt) {
        if (o == cun.d) {
            this.k.d = czt;
            return;
        }
        if (o == cun.q) {
            this.j.d = czt;
            return;
        }
        if (o == cun.E) {
            final cvr n = this.n;
            if (n != null) {
                this.a.j(n);
            }
            (this.n = new cwf(czt)).g((cvm)this);
            this.a.h(this.n);
        }
    }
    
    public void b(final Canvas canvas, final Matrix matrix, int i) {
        final float[] array = czr.a.get();
        array[1] = (array[0] = 0.0f);
        array[2] = 37394.73f;
        array[3] = 39575.234f;
        matrix.mapPoints(array);
        if (array[0] == array[2] || array[1] == array[3]) {
            ctq.a();
            return;
        }
        final float n = (float)i;
        final cvv cvv = (cvv)this.k;
        i = cvv.k(cvv.d(), cvv.b());
        this.b.setAlpha(czm.k((int)(n / 255.0f * i / 100.0f * 255.0f)));
        this.b.setStrokeWidth(((cvt)this.j).k() * czr.c(matrix));
        if (this.b.getStrokeWidth() > 0.0f) {
            if (this.l.isEmpty()) {
                ctq.a();
            }
            else {
                final float c = czr.c(matrix);
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
                final cvr m = this.m;
                float n2;
                if (m == null) {
                    n2 = 0.0f;
                }
                else {
                    n2 = (float)m.e() * c;
                }
                this.b.setPathEffect((PathEffect)new DashPathEffect(this.i, n2));
                ctq.a();
            }
            final cvr n3 = this.n;
            if (n3 != null) {
                this.b.setColorFilter((ColorFilter)n3.e());
            }
            eab eab;
            int size;
            float length;
            float floatValue;
            float floatValue2;
            float floatValue3;
            int n4;
            float n5;
            float n6;
            float n7;
            float n8;
            float length2;
            float n9;
            float n10;
            float n11;
            float n12;
            float n13;
            float n14;
            float n15;
            int size2;
            for (i = 0; i < this.h.size(); ++i) {
                eab = this.h.get(i);
                if (eab.b != null) {
                    this.d.reset();
                    size = ((List)eab.a).size();
                    while (--size >= 0) {
                        this.d.addPath(((cvf)((List<Object>)eab.a).get(size)).i(), matrix);
                    }
                    this.c.setPath(this.d, false);
                    length = this.c.getLength();
                    while (this.c.nextContour()) {
                        length += this.c.getLength();
                    }
                    floatValue = (float)((cvl)eab.b).d.e();
                    floatValue2 = (float)((cvl)eab.b).b.e();
                    floatValue3 = (float)((cvl)eab.b).c.e();
                    n4 = ((List)eab.a).size() - 1;
                    n5 = 0.0f;
                    while (n4 >= 0) {
                        n6 = floatValue3 * length / 100.0f;
                        n7 = floatValue2 * length / 100.0f;
                        n8 = floatValue * length / 360.0f;
                        this.e.set(((cvf)((List<Object>)eab.a).get(n4)).i());
                        this.e.transform(matrix);
                        this.c.setPath(this.e, false);
                        length2 = this.c.getLength();
                        n9 = n6 + n8;
                        n10 = n7 + n8;
                        Label_0943: {
                            if (n9 > length) {
                                n11 = n9 - length;
                                if (n11 < n5 + length2 && n5 < n11) {
                                    if (n10 > length) {
                                        n12 = (n10 - length) / length2;
                                    }
                                    else {
                                        n12 = 0.0f;
                                    }
                                    czr.h(this.e, n12, Math.min(n11 / length2, 1.0f), 0.0f);
                                    canvas.drawPath(this.e, this.b);
                                    break Label_0943;
                                }
                            }
                            n13 = n5 + length2;
                            if (n13 >= n10 && n5 <= n9) {
                                if (n13 <= n9 && n10 < n5) {
                                    canvas.drawPath(this.e, this.b);
                                }
                                else {
                                    if (n10 < n5) {
                                        n14 = 0.0f;
                                    }
                                    else {
                                        n14 = (n10 - n5) / length2;
                                    }
                                    if (n9 > n13) {
                                        n15 = 1.0f;
                                    }
                                    else {
                                        n15 = (n9 - n5) / length2;
                                    }
                                    czr.h(this.e, n14, n15, 0.0f);
                                    canvas.drawPath(this.e, this.b);
                                }
                            }
                        }
                        n5 += length2;
                        --n4;
                    }
                    ctq.a();
                }
                else {
                    this.d.reset();
                    size2 = ((List)eab.a).size();
                    while (--size2 >= 0) {
                        this.d.addPath(((cvf)((List<Object>)eab.a).get(size2)).i(), matrix);
                    }
                    ctq.a();
                    canvas.drawPath(this.d, this.b);
                    ctq.a();
                }
            }
            ctq.a();
            return;
        }
        ctq.a();
    }
    
    public final void c(final RectF rectF, final Matrix matrix, final boolean b) {
        this.d.reset();
        for (int i = 0; i < this.h.size(); ++i) {
            final eab eab = this.h.get(i);
            for (int j = 0; j < ((List)eab.a).size(); ++j) {
                this.d.addPath(((cvf)((List<Object>)eab.a).get(j)).i(), matrix);
            }
        }
        this.d.computeBounds(this.f, false);
        final float k = ((cvt)this.j).k();
        final RectF f = this.f;
        final float left = f.left;
        final float n = k / 2.0f;
        f.set(left - n, this.f.top - n, this.f.right + n, this.f.bottom + n);
        rectF.set(this.f);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        ctq.a();
    }
    
    public final void d() {
        this.g.invalidateSelf();
    }
    
    public final void e(final cwj cwj, final int n, final List list, final cwj cwj2) {
        czm.h(cwj, n, list, cwj2, (cvd)this);
    }
    
    public final void f(final List list, final List list2) {
        int i = list.size() - 1;
        final eab eab = null;
        cvl cvl = null;
        while (i >= 0) {
            final cuv cuv = list.get(i);
            cvl cvl2 = cvl;
            if (cuv instanceof cvl) {
                final cvl cvl3 = (cvl)cuv;
                cvl2 = cvl;
                if (cvl3.e == 2) {
                    cvl2 = cvl3;
                }
            }
            --i;
            cvl = cvl2;
        }
        if (cvl != null) {
            cvl.a((cvm)this);
        }
        int size = list2.size();
        eab eab2 = eab;
        while (--size >= 0) {
            final cuv cuv2 = list2.get(size);
            eab eab3 = null;
            Label_0221: {
                if (cuv2 instanceof cvl) {
                    final cvl cvl4 = (cvl)cuv2;
                    if (cvl4.e == 2) {
                        if (eab2 != null) {
                            this.h.add(eab2);
                        }
                        eab3 = new eab(cvl4);
                        cvl4.a((cvm)this);
                        break Label_0221;
                    }
                }
                eab3 = eab2;
                if (cuv2 instanceof cvf) {
                    if ((eab3 = eab2) == null) {
                        eab3 = new eab(cvl);
                    }
                    ((List<cvf>)eab3.a).add((cvf)cuv2);
                }
            }
            eab2 = eab3;
        }
        if (eab2 != null) {
            this.h.add(eab2);
        }
    }
}
