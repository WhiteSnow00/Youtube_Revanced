import android.view.View$OnClickListener;
import android.text.TextUtils;
import java.util.Collection;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.RelatedChipCloudRendererOuterClass;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class acpm extends acph implements thj
{
    private final thg a;
    private final acmr b;
    public final aoft c;
    public final aclr d;
    protected final acmr e;
    public final ackv f;
    protected final acmr g;
    protected final acqq h;
    public boolean i;
    public int j;
    protected final afbh k;
    public final List l;
    public final aheu m;
    private final acmr n;
    private final acqp o;
    private final boolean p;
    private boolean q;
    private final acqr r;
    private final int s;
    private final CharSequence t;
    private final CharSequence u;
    private final aisc v;
    private final acpk w;
    private final acdr x;
    private final adzx y;
    
    public acpm(final acrd acrd, final thg thg, final aoft aoft, final List list, final int n, final acqr acqr, final afbh afbh, final CharSequence charSequence, final CharSequence charSequence2, final aisc aisc, final int n2, final boolean b, final acsq acsq, final acdr acdr, final acsx acsx) {
        this(acrd, thg, aoft, list, n, acqr, afbh, charSequence, charSequence2, aisc, n2, b, acsq, acdr, acsx, acpj.a);
    }
    
    public acpm(final acrd acrd, final thg a, final aoft c, final List list, final int s, final acqr acqr, final afbh k, final CharSequence t, final CharSequence u, final aisc v, final int f, final boolean p16, final acsq acsq, final acdr x, final acsx acsx, final acpk w) {
        list.getClass();
        this.a = a;
        this.c = c;
        this.s = s;
        this.k = k;
        this.x = x;
        final aclr d = new aclr();
        this.d = d;
        final acmr e = new acmr();
        this.e = e;
        final acmr b = new acmr();
        this.b = b;
        final ackv f2 = new ackv(b);
        this.f = f2;
        final acmr n = new acmr();
        this.n = n;
        final acmr g = new acmr();
        this.g = g;
        final acqq h = new acqq();
        this.h = h;
        h.f = f;
        this.o = new acqp();
        w.getClass();
        this.w = w;
        acrd.b(this.d());
        a.h((Object)this, (Class)acpm.class);
        acqr a2;
        if (acqr == null) {
            a2 = acsv.a;
        }
        else {
            a2 = acqr;
        }
        (this.r = a2).e(this.y = new adzx(this));
        this.j = this.n(a2.a());
        this.t = t;
        this.u = u;
        this.v = v;
        this.p = p16;
        d.nf((acma)new kgp(a2.b(), 6));
        final aheu m = new aheu((byte[])null, (short[])null);
        this.m = m;
        this.f();
        this.o(acsq);
        final boolean b2 = acsx instanceof acpl;
        final boolean b3 = true;
        if (b2) {
            final acpl acpl = (acpl)acsx;
            this.l = acpl.b;
            this.i = acpl.a;
            this.q = acpl.c;
        }
        else {
            this.l = m.P(list);
            this.q = true;
        }
        if (this.l.isEmpty()) {
            return;
        }
        if (this.q) {
            d.m(e);
            d.m((acla)f2);
            d.m(n);
            d.m(g);
        }
        if (!c.m) {
            if ((c.b & 0x8) != 0x0) {
                anxb anxb;
                if ((anxb = c.i) == null) {
                    anxb = anxb.a;
                }
                if (((ahcu)anxb).ry((ahci)RelatedChipCloudRendererOuterClass.relatedChipCloudRenderer)) {
                    anxb anxb2;
                    if ((anxb2 = c.i) == null) {
                        anxb2 = anxb.a;
                    }
                    e.add(((ahcu)anxb2).rx((ahci)RelatedChipCloudRendererOuterClass.relatedChipCloudRenderer));
                }
                else {
                    anxb anxb3;
                    if ((anxb3 = c.i) == null) {
                        anxb3 = anxb.a;
                    }
                    if (((ahcu)anxb3).ry((ahci)ElementRendererOuterClass.elementRenderer) && x != null) {
                        anxb anxb4;
                        if ((anxb4 = c.i) == null) {
                            anxb4 = anxb.a;
                        }
                        x.b((Object)anxb4, (acsp)new acsn(e, 1));
                    }
                }
            }
            else {
                e.add((Object)c);
            }
        }
        boolean i = b3;
        if (!this.i) {
            i = (this.l.size() <= s && b3);
        }
        this.i = i;
        this.w();
        this.p();
        this.q();
    }
    
    private final boolean j() {
        final int size = this.l.size();
        final boolean b = (this.j > 1 && size > 1) || this.qP();
        return this.qQ() && b;
    }
    
    private final boolean qP() {
        int bp;
        if ((bp = aqvq.bp(this.c.s)) == 0) {
            bp = 1;
        }
        return bp == 3 || bp == 4 || bp == 2;
    }
    
    private final boolean qQ() {
        return this.j > 0;
    }
    
    public final acla a() {
        return (acla)this.d;
    }
    
    protected abstract Class d();
    
    protected void f() {
    }
    
    public Class[] mr(final Class clazz, final Object o, final int n) {
        return aamz.w(this, o, n);
    }
    
    public final int n(final int n) {
        final aoft c = this.c;
        final int d = c.d;
        if (d != 45) {
            int max = n;
            if (d == 46) {
                max = Math.max((int)c.e, n);
            }
            return max;
        }
        return (int)c.e;
    }
    
    protected final void o(final acsq acsq) {
        this.m.Q(acsq);
    }
    
    public final void p() {
        this.b.clear();
        if (!this.l.isEmpty()) {
            final int size = this.l.size();
            if (this.j()) {
                final int j = this.j;
                int n2;
                for (int n = (size + j - 1) / j, i = 0; i < n; i = n2) {
                    final int k = this.j;
                    n2 = i + 1;
                    this.b.add((Object)this.w.a(this.j, this.l.subList(i * k, Math.min(k * n2, size)), i, n));
                }
            }
            else if (this.qQ()) {
                this.b.addAll((Collection)this.l);
            }
        }
    }
    
    public final void q() {
        final int a = this.f.a();
        final int size = this.b.size();
        ajoq ajoq;
        if ((ajoq = this.c.v) == null) {
            ajoq = ajoq.a;
        }
        boolean b = false;
        Label_0090: {
            if ((ajoq.b & 0x1) != 0x0) {
                ajoq ajoq2;
                if ((ajoq2 = this.c.v) == null) {
                    ajoq2 = ajoq.a;
                }
                if (!ajoq2.c) {
                    b = false;
                    break Label_0090;
                }
            }
            b = true;
        }
        final boolean qp = this.qP();
        if (a < size) {
            final acqq h = this.h;
            h.b = this.t;
            h.e = 2;
            h.c = (View$OnClickListener)new zhw(this, 15);
            h.d = null;
            this.u(h);
            return;
        }
        if (this.v != null && !TextUtils.isEmpty(this.u)) {
            final acqq h2 = this.h;
            h2.a = this.u;
            h2.e = 1;
            h2.c = null;
            h2.d = this.v;
            this.u(h2);
            return;
        }
        if (this.p && this.s < this.l.size()) {
            final acqq h3 = this.h;
            h3.a = this.u;
            h3.e = 3;
            h3.d = null;
            h3.c = (View$OnClickListener)new zhw(this, 16);
            this.u(h3);
            return;
        }
        if ((qp ^ true) & b) {
            this.u(this.o);
            return;
        }
        this.n.clear();
    }
    
    @Override
    public acsx qz() {
        return new acpl(this.i, this.l, this.q);
    }
    
    public final void s(final Object o) {
        if (o == this.c) {
            this.v(false);
            return;
        }
        if (this.l.remove(o)) {
            if (this.l.isEmpty()) {
                this.v(false);
                return;
            }
            if (this.j()) {
                this.p();
            }
            else {
                this.b.remove(o);
            }
            this.q();
        }
    }
    
    @Override
    public void sa() {
        this.a.m((Object)this);
        this.r.f(this.y);
    }
    
    public final void t(final Object o, final Object o2) {
        final int index = this.l.indexOf(o);
        if (index != -1) {
            this.l.set(index, o2);
            if (this.j()) {
                final int size = this.l.size();
                final int j = this.j;
                final int n = (size + j - 1) / j;
                final int n2 = index / j;
                this.b.set(n2, (Object)this.w.a(this.j, this.l.subList(n2 * j, Math.min((n2 + 1) * j, size)), n2, n));
                return;
            }
            if (this.qQ()) {
                this.b.set(index, o2);
            }
        }
    }
    
    protected final void u(final Object o) {
        if (this.n.isEmpty()) {
            this.n.add(o);
            return;
        }
        this.n.n(0, o);
    }
    
    public final void v(final boolean q) {
        if (this.q == q) {
            return;
        }
        this.q = q;
        if (q && !this.l.isEmpty()) {
            this.d.m(this.e);
            this.d.m((acla)this.f);
            this.d.m(this.n);
            this.d.m(this.g);
            return;
        }
        this.d.t();
    }
    
    public final void w() {
        if (this.i) {
            this.f.h(Integer.MAX_VALUE);
            return;
        }
        final int min = Math.min(this.s, this.l.size());
        final int j = this.j;
        int n = min;
        if (j > 1) {
            n = (min + j - 1) / j;
        }
        this.f.h(n);
    }
}
