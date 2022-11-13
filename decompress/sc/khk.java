import java.util.Iterator;
import com.google.protos.youtube.api.innertube.ChipCloudRendererOuterClass;
import java.util.concurrent.atomic.AtomicReference;
import android.view.ViewGroup$LayoutParams;
import android.support.v7.widget.LinearLayoutManager;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class khk extends acld
{
    public final View a;
    public final RecyclerView b;
    public final atjm c;
    public final Context d;
    public acns e;
    public lex f;
    private final acle g;
    private final acjz h;
    private final kya i;
    private final vfp j;
    private final asid k;
    private lev l;
    private asir m;
    private String n;
    private asir o;
    private int p;
    
    public khk(final Context d, final acps acps, final asid k, final aeea aeea, final vaf vaf, final vdr vdr, final zmf zmf, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.k = k;
        this.d = d;
        if (fbu.Q(vaf)) {
            this.a = LayoutInflater.from(d).inflate(2131625292, (ViewGroup)null);
        }
        else {
            this.a = LayoutInflater.from(d).inflate(2131625291, (ViewGroup)null);
        }
        final RecyclerView b = (RecyclerView)this.a.findViewById(2131431129);
        this.b = b;
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.ac(0);
        b.af((nw)linearLayoutManager);
        b.ae((nt)null);
        final ackz aa = aeea.aa((acku)acps.a(), new ViewGroup$LayoutParams(-2, -2));
        this.c = atjm.e();
        final kya kya = new kya();
        this.i = kya;
        final acjz h = new acjz();
        this.h = h;
        h.a = (wyw)kya;
        aa.f((ackn)h);
        aa.f((ackn)new kdu(this, 3));
        aa.h((acjn)(this.g = new acle()));
        b.ac((nq)aa);
        b.aC((hy)new khj(this, d.getResources().getDimensionPixelSize(2131170370)));
        this.j = (vfp)vdr.a(zmf.c());
    }
    
    public final View a() {
        return this.a;
    }
    
    public final void c(final acku acku) {
        final asir m = this.m;
        if (m != null && !m.tA()) {
            asjv.b((AtomicReference)this.m);
        }
        final asir o = this.o;
        if (o != null) {
            athz.f((AtomicReference)o);
            this.o = null;
        }
        this.n = null;
        ((tfz)this.g).clear();
        this.f = null;
        this.e = null;
        this.l = null;
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        final anuf anuf = (anuf)o;
        return null;
    }
    
    public final void f(final int p) {
        final int p2 = this.p;
        this.p = p;
        if (this.f == null) {
            return;
        }
        this.k.f((Runnable)new ccm(this, p, 15));
        this.c.tu((Object)p);
        final lev l = this.l;
        if (l != null) {
            if (p == 0) {
                l.b();
                return;
            }
            if (p2 == 0) {
                l.a();
            }
        }
    }
    
    final void g(final int n) {
        this.f.m(n);
        if (!aezr.f(this.n)) {
            final vfw c = this.j.c();
            final String n2 = this.n;
            n2.getClass();
            adkp.R(n2.isEmpty() ^ true, (Object)"key cannot be empty");
            final ahaz builder = ((ahbh)anuj.a).createBuilder();
            builder.copyOnWrite();
            final anuj anuj = (anuj)builder.instance;
            anuj.b |= 0x1;
            anuj.c = n2;
            final anug anug = new anug(builder);
            final long n3 = n;
            final ahaz a = anug.a;
            final long longValue = n3;
            a.copyOnWrite();
            final anuj anuj2 = (anuj)a.instance;
            anuj2.b |= 0x2;
            anuj2.d = longValue;
            c.j((vfk)anug);
            c.b().U();
            return;
        }
        if (this.o == null) {
            this.f(n);
        }
    }
    
    protected final /* bridge */ void lR(final ackm ackm, Object o) {
        final anuf anuf = (anuf)o;
        o = ackm.c("watchNextChipsVisibilityPredicate");
        final boolean b = o instanceof aezs;
        final wyw wyw = null;
        aezs aezs;
        if (b) {
            aezs = (aezs)o;
        }
        else {
            aezs = null;
        }
        final boolean b2 = aezs == null || aezs.a((Object)this.a);
        final kya i = this.i;
        wyw a = wyw;
        if (b2) {
            a = ackm.a;
        }
        i.A(a);
        o = ackm.c("sectionListController");
        if (o instanceof acns) {
            this.e = (acns)o;
        }
        o = ackm.c("sectionController");
        if (!(o instanceof lex)) {
            ttr.b("A RelatedChipsSectionController is required for the RelatedChipCloud.");
            return;
        }
        final lex f = (lex)o;
        this.f = f;
        final int b3 = f.b();
        final int h = this.f.h();
        anuv anuv;
        if ((anuv = anuf.c) == null) {
            anuv = anuv.a;
        }
        if (anuv.ry((ahaq)ChipCloudRendererOuterClass.chipCloudRenderer)) {
            anuv anuv2;
            if ((anuv2 = anuf.c) == null) {
                anuv2 = anuv.a;
            }
            for (final aikv aikv : ((aiku)anuv2.rx((ahaq)ChipCloudRendererOuterClass.chipCloudRenderer)).b) {
                final int b4 = aikv.b;
                if (b4 == 91394224) {
                    aikr aikr = (aikr)aikv.c;
                    final int size = ((tfz)this.g).size();
                    final acle g = this.g;
                    final boolean j = (h < 0) ? (size == b3) : (size == h);
                    if (aikr.i != j) {
                        final ahaz builder = ((ahbh)aikr).toBuilder();
                        builder.copyOnWrite();
                        final aikr aikr2 = (aikr)builder.instance;
                        aikr2.b |= 0x100;
                        aikr2.i = j;
                        aikr = (aikr)builder.build();
                    }
                    g.add((Object)aikr);
                }
                else {
                    if (b4 != 65153809) {
                        continue;
                    }
                    this.g.add((Object)aikv.c);
                }
            }
        }
        if (h < 0 && b3 != 0) {
            this.b.post((Runnable)new ccm(this, b3, 14));
        }
        final Object c = ackm.c("related_chip_section_list_filter");
        if (c instanceof lev) {
            this.l = (lev)c;
        }
        final String e = anuf.e;
        this.n = e;
        if (!aezr.f(e)) {
            this.m = this.j.h(this.n, true).K((asjs)kcz.f).Z((asjr)jxh.t).l(anui.class).af(this.k).aH((asjm)new kcx(this, 6));
            return;
        }
        this.o = this.f.i().P(this.k).am((asjm)new kcx(this, 7));
    }
}
