import android.os.Build$VERSION;
import android.graphics.Canvas;
import java.util.Collections;
import java.util.Iterator;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import java.util.ArrayList;
import android.graphics.PorterDuff$Mode;
import java.util.List;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cxp implements cux, cvm, cwk
{
    final Matrix a;
    final cui b;
    final cxs c;
    public cvt d;
    public cxp e;
    public cxp f;
    final cwe g;
    private final Path h;
    private final Matrix i;
    private final Paint j;
    private final Paint k;
    private final Paint l;
    private final Paint m;
    private final Paint n;
    private final RectF o;
    private final RectF p;
    private final RectF q;
    private final RectF r;
    private List s;
    private final List t;
    private boolean u;
    private ajb v;
    
    public cxp(final cui b, final cxs c) {
        this.h = new Path();
        this.i = new Matrix();
        boolean b2 = true;
        this.j = (Paint)new cut(1);
        this.k = (Paint)new cut(PorterDuff$Mode.DST_IN, (byte[])null);
        this.l = (Paint)new cut(PorterDuff$Mode.DST_OUT, (byte[])null);
        final cut m = new cut(1);
        this.m = (Paint)m;
        this.n = (Paint)new cut(PorterDuff$Mode.CLEAR);
        this.o = new RectF();
        this.p = new RectF();
        this.q = new RectF();
        this.r = new RectF();
        this.a = new Matrix();
        this.t = new ArrayList();
        this.u = true;
        this.b = b;
        this.c = c;
        final String c2 = c.c;
        if (c.u == 3) {
            ((Paint)m).setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
        }
        else {
            ((Paint)m).setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_IN));
        }
        (this.g = c.h.b()).d((cvm)this);
        final List g = c.g;
        if (g != null && !g.isEmpty()) {
            final ajb v = new ajb(c.g);
            this.v = v;
            final Iterator<Object> iterator = ((List<Object>)v.b).iterator();
            while (iterator.hasNext()) {
                iterator.next().g((cvm)this);
            }
            for (final cvr cvr : this.v.a) {
                this.h(cvr);
                cvr.g((cvm)this);
            }
        }
        if (!this.c.r.isEmpty()) {
            final cvt d = new cvt(this.c.r);
            this.d = d;
            d.b = true;
            d.g((cvm)new cxo(this));
            if ((float)this.d.e() != 1.0f) {
                b2 = false;
            }
            this.m(b2);
            this.h(this.d);
            return;
        }
        this.m(true);
    }
    
    private final void p() {
        if (this.s != null) {
            return;
        }
        if (this.f == null) {
            this.s = Collections.emptyList();
            return;
        }
        this.s = new ArrayList();
        for (cxp cxp = this.f; cxp != null; cxp = cxp.f) {
            this.s.add(cxp);
        }
    }
    
    private final void q(final Canvas canvas) {
        canvas.drawRect(this.o.left - 1.0f, this.o.top - 1.0f, this.o.right + 1.0f, this.o.bottom + 1.0f, this.n);
        ctq.a();
    }
    
    private final void r() {
        this.b.invalidateSelf();
    }
    
    private final void s() {
        final cij m = this.b.a.m;
        final String c = this.c.c;
    }
    
    public void a(final Object o, final czt czt) {
        this.g.e(o, czt);
    }
    
    @Override
    public final void b(final Canvas canvas, final Matrix matrix, int i) {
        if (!this.u || this.c.s) {
            ctq.a();
            return;
        }
        this.p();
        this.i.reset();
        this.i.set(matrix);
        int size = this.s.size();
        while (--size >= 0) {
            this.i.preConcat(((cxp)this.s.get(size)).g.a());
        }
        ctq.a();
        final cvr e = this.g.e;
        int intValue;
        if (e == null) {
            intValue = 100;
        }
        else {
            intValue = (int)e.e();
        }
        final float n = (float)i;
        final boolean o = this.o();
        final int n2 = (int)(n / 255.0f * intValue / 100.0f * 255.0f);
        if (!o && !this.n()) {
            this.i.preConcat(this.g.a());
            this.i(canvas, this.i, n2);
            ctq.a();
            ctq.a();
            this.s();
            return;
        }
        this.c(this.o, this.i, false);
        final RectF o2 = this.o;
        if (this.o()) {
            if (this.c.u != 3) {
                this.q.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.e.c(this.q, matrix, true);
                if (!o2.intersect(this.q)) {
                    o2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
        }
        this.i.preConcat(this.g.a());
        final RectF o3 = this.o;
        final Matrix j = this.i;
        this.p.set(0.0f, 0.0f, 0.0f, 0.0f);
        Label_0339: {
            if (this.n()) {
                int size2;
                afaj afaj;
                int b;
                int n3;
                RectF p3;
                for (size2 = ((List)this.v.c).size(), i = 0; i < size2; ++i) {
                    afaj = ((List<afaj>)this.v.c).get(i);
                    this.h.set((Path)((List<cvr>)this.v.b).get(i).e());
                    this.h.transform(j);
                    b = afaj.b;
                    n3 = b - 1;
                    if (b == 0) {
                        throw null;
                    }
                    Label_0479: {
                        if (n3 != 0) {
                            if (n3 == 1) {
                                break Label_0339;
                            }
                            if (n3 != 2) {
                                if (n3 != 3) {
                                    break Label_0479;
                                }
                                break Label_0339;
                            }
                        }
                        if (afaj.a) {
                            break Label_0339;
                        }
                    }
                    this.h.computeBounds(this.r, false);
                    if (i == 0) {
                        this.p.set(this.r);
                    }
                    else {
                        p3 = this.p;
                        p3.set(Math.min(p3.left, this.r.left), Math.min(this.p.top, this.r.top), Math.max(this.p.right, this.r.right), Math.max(this.p.bottom, this.r.bottom));
                    }
                }
                if (!o3.intersect(this.p)) {
                    o3.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
        }
        if (!this.o.intersect(0.0f, 0.0f, (float)canvas.getWidth(), (float)canvas.getHeight())) {
            this.o.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        ctq.a();
        if (this.o.width() >= 1.0f && this.o.height() >= 1.0f) {
            this.j.setAlpha(255);
            czr.l(canvas, this.o, this.j);
            ctq.a();
            this.q(canvas);
            this.i(canvas, this.i, n2);
            ctq.a();
            if (this.n()) {
                final Matrix k = this.i;
                czr.l(canvas, this.o, this.k);
                if (Build$VERSION.SDK_INT < 28) {
                    this.q(canvas);
                }
                ctq.a();
                int n5;
            Label_1542:
                for (i = 0; i < ((List)this.v.c).size(); i = n5 + 1) {
                    final afaj afaj2 = ((List<afaj>)this.v.c).get(i);
                    final cvr cvr = ((List<cvr>)this.v.b).get(i);
                    final cvr cvr2 = ((List<cvr>)this.v.a).get(i);
                    final int b2 = afaj2.b;
                    final int n4 = b2 - 1;
                    if (b2 == 0) {
                        throw null;
                    }
                    if (n4 != 0) {
                        if (n4 != 1) {
                            if (n4 != 2) {
                                if (n4 != 3) {
                                    n5 = i;
                                }
                                else if (((List)this.v.b).isEmpty()) {
                                    n5 = i;
                                }
                                else {
                                    for (int l = 0; l < ((List)this.v.c).size(); ++l) {
                                        n5 = i;
                                        if (((afaj)((List<Object>)this.v.c).get(l)).b != 4) {
                                            continue Label_1542;
                                        }
                                    }
                                    this.j.setAlpha(255);
                                    canvas.drawRect(this.o, this.j);
                                    n5 = i;
                                }
                            }
                            else if (afaj2.a) {
                                czr.l(canvas, this.o, this.k);
                                canvas.drawRect(this.o, this.j);
                                this.l.setAlpha((int)((int)cvr2.e() * 2.55f));
                                this.h.set((Path)cvr.e());
                                this.h.transform(k);
                                canvas.drawPath(this.h, this.l);
                                canvas.restore();
                                n5 = i;
                            }
                            else {
                                czr.l(canvas, this.o, this.k);
                                this.h.set((Path)cvr.e());
                                this.h.transform(k);
                                this.j.setAlpha((int)((int)cvr2.e() * 2.55f));
                                canvas.drawPath(this.h, this.j);
                                canvas.restore();
                                n5 = i;
                            }
                        }
                        else {
                            int n6;
                            if ((n6 = i) == 0) {
                                this.j.setColor(-16777216);
                                this.j.setAlpha(255);
                                canvas.drawRect(this.o, this.j);
                                n6 = 0;
                            }
                            if (afaj2.a) {
                                czr.l(canvas, this.o, this.l);
                                canvas.drawRect(this.o, this.j);
                                this.l.setAlpha((int)((int)cvr2.e() * 2.55f));
                                this.h.set((Path)cvr.e());
                                this.h.transform(k);
                                canvas.drawPath(this.h, this.l);
                                canvas.restore();
                                n5 = n6;
                            }
                            else {
                                this.h.set((Path)cvr.e());
                                this.h.transform(k);
                                canvas.drawPath(this.h, this.l);
                                n5 = n6;
                            }
                        }
                    }
                    else if (afaj2.a) {
                        czr.l(canvas, this.o, this.j);
                        canvas.drawRect(this.o, this.j);
                        this.h.set((Path)cvr.e());
                        this.h.transform(k);
                        this.j.setAlpha((int)((int)cvr2.e() * 2.55f));
                        canvas.drawPath(this.h, this.l);
                        canvas.restore();
                        n5 = i;
                    }
                    else {
                        this.h.set((Path)cvr.e());
                        this.h.transform(k);
                        this.j.setAlpha((int)((int)cvr2.e() * 2.55f));
                        canvas.drawPath(this.h, this.j);
                        n5 = i;
                    }
                }
                canvas.restore();
                ctq.a();
            }
            if (this.o()) {
                czr.l(canvas, this.o, this.m);
                ctq.a();
                this.q(canvas);
                this.e.b(canvas, matrix, n2);
                canvas.restore();
                ctq.a();
                ctq.a();
            }
            canvas.restore();
            ctq.a();
        }
        ctq.a();
        this.s();
    }
    
    @Override
    public void c(final RectF rectF, final Matrix matrix, final boolean b) {
        this.o.set(0.0f, 0.0f, 0.0f, 0.0f);
        this.p();
        this.a.set(matrix);
        if (b) {
            final List s = this.s;
            if (s != null) {
                int size = s.size();
                while (--size >= 0) {
                    this.a.preConcat(((cxp)this.s.get(size)).g.a());
                }
            }
            else {
                final cxp f = this.f;
                if (f != null) {
                    this.a.preConcat(f.g.a());
                }
            }
        }
        this.a.preConcat(this.g.a());
    }
    
    public final void d() {
        this.r();
    }
    
    public final void e(final cwj cwj, final int n, final List list, cwj cwj2) {
        final cxp e = this.e;
        if (e != null) {
            final cwj b = cwj2.b(e.g());
            if (cwj.d(this.e.g(), n)) {
                list.add(b.c((cwk)this.e));
            }
            if (cwj.f(this.g(), n)) {
                this.e.k(cwj, cwj.a(this.e.g(), n) + n, list, b);
            }
        }
        if (!cwj.e(this.g(), n)) {
            return;
        }
        cwj b2 = cwj2;
        if (!"__container".equals(this.g())) {
            cwj2 = (b2 = cwj2.b(this.g()));
            if (cwj.d(this.g(), n)) {
                list.add(cwj2.c((cwk)this));
                b2 = cwj2;
            }
        }
        if (cwj.f(this.g(), n)) {
            this.k(cwj, n + cwj.a(this.g(), n), list, b2);
        }
    }
    
    public final void f(final List list, final List list2) {
    }
    
    public final String g() {
        return this.c.c;
    }
    
    public final void h(final cvr cvr) {
        if (cvr == null) {
            return;
        }
        this.t.add(cvr);
    }
    
    public abstract void i(final Canvas p0, final Matrix p1, final int p2);
    
    public final void j(final cvr cvr) {
        this.t.remove(cvr);
    }
    
    public void k(final cwj cwj, final int n, final List list, final cwj cwj2) {
    }
    
    public void l(final float n) {
        final cwe g = this.g;
        final cvr e = g.e;
        if (e != null) {
            e.i(n);
        }
        final cvr h = g.h;
        if (h != null) {
            h.i(n);
        }
        final cvr i = g.i;
        if (i != null) {
            i.i(n);
        }
        final cvr a = g.a;
        if (a != null) {
            a.i(n);
        }
        final cvr b = g.b;
        if (b != null) {
            b.i(n);
        }
        final cvr c = g.c;
        if (c != null) {
            c.i(n);
        }
        final cvr d = g.d;
        if (d != null) {
            d.i(n);
        }
        final cvt f = g.f;
        if (f != null) {
            f.i(n);
        }
        final cvt g2 = g.g;
        if (g2 != null) {
            g2.i(n);
        }
        final ajb v = this.v;
        final int n2 = 0;
        if (v != null) {
            for (int j = 0; j < ((List)this.v.b).size(); ++j) {
                ((cvr)((List<Object>)this.v.b).get(j)).i(n);
            }
        }
        final cvt d2 = this.d;
        if (d2 != null) {
            d2.i(n);
        }
        final cxp e2 = this.e;
        int k = n2;
        if (e2 != null) {
            e2.l(n);
            k = n2;
        }
        while (k < this.t.size()) {
            ((cvr)this.t.get(k)).i(n);
            ++k;
        }
    }
    
    public final void m(final boolean u) {
        if (u != this.u) {
            this.u = u;
            this.r();
        }
    }
    
    final boolean n() {
        final ajb v = this.v;
        return v != null && !((List)v.b).isEmpty();
    }
    
    final boolean o() {
        return this.e != null;
    }
}
