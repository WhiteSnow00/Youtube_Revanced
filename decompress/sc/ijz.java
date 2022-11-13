import java.util.List;
import java.util.ArrayList;
import android.widget.ImageView;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.widget.ListAdapter;
import android.content.Context;
import android.widget.ListView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import android.app.Activity;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ijz extends ika implements tgg
{
    public tgd a;
    public arkg ae;
    public gae af;
    public String ag;
    public CharSequence ah;
    public Future ai;
    public igf aj;
    public aabo ak;
    public vai al;
    public lff am;
    public e an;
    private aaeh ao;
    public tjm b;
    public abnl c;
    public ilm d;
    public fmj e;
    
    public ijz() {
        this.ai = (Future)afwm.k();
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2131624948, viewGroup, false);
        this.ao = this.ak.a();
        final abnl c = this.c;
        final fa at = this.at;
        aefb.K((Object)at);
        c.d = new abni((Activity)at);
        final lff am = this.am;
        final wyw pf = ((ggq)this).pF();
        final String ag = this.ag;
        ag.getClass();
        final boolean bn = ((ggq)this).bn();
        final Activity activity = (Activity)am.d.a();
        final tgd tgd = (tgd)am.b.a();
        tgd.getClass();
        final arwh arwh = (arwh)am.a.a();
        arwh.getClass();
        final lan lan = (lan)am.j.a();
        final ktn ktn = (ktn)am.h.a();
        final ktn ktn2 = (ktn)am.i.a();
        ktn2.getClass();
        final atke g = am.g;
        final aeea aeea = (aeea)am.k.a();
        final acku acku = (acku)am.c.a();
        final kle kle = (kle)am.e.a();
        final atke f = am.f;
        pf.getClass();
        final igf aj = new igf(activity, tgd, arwh, lan, ktn, ktn2, g, aeea, acku, kle, f, pf, ag, bn, null, null, null, null, null, null, null);
        this.aj = aj;
        final LoadingFrameLayout j = (LoadingFrameLayout)inflate.findViewById(2131429675);
        j.getClass();
        aj.j = j;
        final ListView k = (ListView)inflate.findViewById(2131432359);
        k.getClass();
        aj.k = k;
        if (aj.h) {
            final fzw fzw = new fzw((CharSequence)"");
            (aj.o = aald.z(aj.c, (Object)fzw, (ViewGroup)null)).mN(new ackm(), fzw);
            tpe.aH(aj.o.a(), -1, -2);
            final ListView i = aj.k;
            final acko o = aj.o;
            o.getClass();
            i.addHeaderView(o.a());
        }
        if (fal.v((Context)aj.a)) {
            final ViewGroup viewGroup2 = (ViewGroup)layoutInflater.inflate(2131625045, (ViewGroup)aj.k, false);
            aj.k.addHeaderView((View)viewGroup2);
            final ktn v = aj.v;
            final wyw f2 = aj.f;
            final alog c2 = alog.c;
            final String g2 = aj.g;
            final boolean h = aj.h;
            final Activity activity2 = (Activity)((atke)v.d).a();
            final acgs acgs = (acgs)((atke)v.c).a();
            acgs.getClass();
            final lmo lmo = (lmo)((atke)v.e).a();
            final aaih aaih = (aaih)((atke)v.h).a();
            final ajb ajb = (ajb)((atke)v.a).a();
            final aln aln = (aln)((atke)v.g).a();
            final Object l = v.i;
            final arwh arwh2 = (arwh)((atke)v.f).a();
            arwh2.getClass();
            final ziy ziy = (ziy)((atke)v.b).a();
            c2.getClass();
            ((View)viewGroup2).getClass();
            aj.q = new igk(activity2, acgs, lmo, aaih, ajb, aln, (atke)l, arwh2, ziy, f2, c2, viewGroup2, g2, h, null, null, null, null, null, null);
        }
        else {
            final ViewGroup viewGroup3 = (ViewGroup)layoutInflater.inflate(2131625044, (ViewGroup)aj.k, false);
            aj.k.addHeaderView((View)viewGroup3);
            final lan t = aj.t;
            final wyw f3 = aj.f;
            final alog c3 = alog.c;
            final String g3 = aj.g;
            final boolean h2 = aj.h;
            final Activity activity3 = (Activity)((atke)t.d).a();
            final acgs acgs2 = (acgs)((atke)t.a).a();
            acgs2.getClass();
            final lmo lmo2 = (lmo)((atke)t.g).a();
            final aaih aaih2 = (aaih)((atke)t.e).a();
            final ger ger = (ger)((atke)t.i).a();
            final fzw fzw2 = (fzw)((atke)t.b).a();
            final ajb ajb2 = (ajb)((atke)t.c).a();
            final aln aln2 = (aln)((atke)t.h).a();
            final Object m = t.j;
            final arwh arwh3 = (arwh)((atke)t.f).a();
            arwh3.getClass();
            c3.getClass();
            ((View)viewGroup3).getClass();
            aj.p = new igh(activity3, acgs2, lmo2, aaih2, fzw2, ajb2, aln2, (atke)m, arwh3, f3, c3, viewGroup3, g3, h2, null, null, null, null, null, null);
        }
        final acjv acjv = new acjv();
        ((acku)acjv).f(aaba.class, (acks)aj.r);
        ((acku)acjv).f(amhi.class, (acks)new ackw(aj.d, 0));
        final ackc ad = aj.w.ad((acku)acjv);
        (aj.l = new acle()).ni((ackn)new faw(aj, 4));
        ad.h((acjn)aj.l);
        aj.k.setAdapter((ListAdapter)ad);
        (aj.n = (TextView)layoutInflater.inflate(2131624957, (ViewGroup)aj.k, false)).setVisibility(8);
        aj.k.addFooterView((View)aj.n);
        return inflate;
    }
    
    public final gae aS() {
        return this.af;
    }
    
    public final void aa() {
        super.aa();
        if (!this.al.f(45372882L) && this.b.o()) {
            final aaeh ao = this.ao;
            ao.getClass();
            ao.k().j();
        }
    }
    
    public final CharSequence bb() {
        if (fal.v(((br)this).nT())) {
            this.ah = null;
        }
        return this.ah;
    }
    
    public final gae mG() {
        if (this.au == null) {
            final gad b = this.af.b();
            b.n((aezf)new igr(this, 6));
            this.au = b.a();
        }
        return this.au;
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final String a = ((zxt)o).a;
            final String ag = this.ag;
            ag.getClass();
            final boolean equals = a.equals(ag);
            array = null;
            if (equals) {
                this.ax.c(true);
                return null;
            }
        }
        else {
            array = new Class[] { zxt.class };
        }
        return array;
    }
    
    public final void no() {
        super.no();
        this.a.g((Object)this);
        this.a.g((Object)this.d);
        this.a.g((Object)this.e);
        final igf aj = this.aj;
        aj.getClass();
        final boolean b = true;
        boolean b2 = true;
        aj.a(true);
        aj.b.g((Object)aj);
        if (fal.v((Context)aj.a)) {
            final igk q = aj.q;
            if (q != null) {
                aj.b.g((Object)q);
                final ajb u = q.u;
                final String e = q.e;
                q.k = u.x(e, q.j, 1, (View$OnClickListener)q.t.I(e, (amxe)null, (aicz)null, (atke)new esd(q, 14), (atke)new esd(q, 15), q.c));
                if (q.g != null) {
                    if (q.d != alog.a) {
                        b2 = false;
                    }
                    q.c(b2);
                    q.g.setEnabled(false);
                }
                final ImageView h = q.h;
                if (h != null) {
                    tpe.v((View)h, false);
                }
                final ImageView g = q.g;
                if (g != null) {
                    g.setOnClickListener((View$OnClickListener)new ibb(q, 17));
                }
                final ImageView h2 = q.h;
                if (h2 != null) {
                    h2.setOnClickListener((View$OnClickListener)new ibb(q, 18));
                }
                final TextView i = q.i;
                if (i != null) {
                    i.setOnClickListener((View$OnClickListener)new ibb(q, 19));
                }
                final aaas d = ((aabo)q.b.a()).a().i().d(q.e);
                if (d != null) {
                    q.b(d.a);
                    q.f();
                }
            }
        }
        else {
            final igh p = aj.p;
            if (p != null) {
                aj.b.g((Object)p);
                p.g();
                final ajb r = p.r;
                final String e2 = p.e;
                p.k = r.x(e2, p.j, 1, (View$OnClickListener)p.q.I(e2, (amxe)null, (aicz)null, (atke)new esd(p, 12), (atke)new esd(p, 13), p.c));
                if (p.g != null) {
                    p.d(p.d == alog.a && b);
                    p.g.setEnabled(false);
                }
                final ImageView h3 = p.h;
                if (h3 != null) {
                    tpe.v((View)h3, false);
                }
                final ImageView g2 = p.g;
                if (g2 != null) {
                    g2.setOnClickListener((View$OnClickListener)new ibb(p, 14));
                }
                final ImageView h4 = p.h;
                if (h4 != null) {
                    h4.setOnClickListener((View$OnClickListener)new ibb(p, 15));
                }
                final TextView j = p.i;
                if (j != null) {
                    j.setOnClickListener((View$OnClickListener)new ibb(p, 16));
                }
                final aaas d2 = ((aabo)p.b.a()).a().i().d(p.e);
                if (d2 != null) {
                    p.c(d2.a);
                    p.h();
                }
            }
        }
        final e an = this.an;
        final String ag = this.ag;
        ag.getClass();
        this.ai = an.k(ag, (tcc)new hbr(this, 7));
        this.d.b();
    }
    
    public final void np() {
        super.np();
        this.ai.cancel(false);
        final igf aj = this.aj;
        aj.getClass();
        final tce m = aj.m;
        if (m != null && !m.e()) {
            aj.m.d();
        }
        aj.m = null;
        if (aj.o != null) {
            final ListView k = aj.k;
            k.getClass();
            k.reclaimViews((List)new ArrayList());
            final acku c = aj.c;
            final acko o = aj.o;
            o.getClass();
            c.b(o.a());
            aj.o = null;
        }
        aj.b.m((Object)aj);
        if (fal.v((Context)aj.a)) {
            final igk q = aj.q;
            if (q != null) {
                aj.b.m((Object)q);
            }
        }
        else {
            final igh p = aj.p;
            if (p != null) {
                p.a();
                aj.b.m((Object)p);
            }
        }
        this.a.m((Object)this.e);
        this.a.m((Object)this.d);
        this.a.m((Object)this);
    }
    
    public final void oq(Bundle m) {
        super.oq(m);
        m = ((br)this).m;
        m.getClass();
        final String string = m.getString("playlist_id");
        tvb.n(string);
        this.ag = string;
    }
}
