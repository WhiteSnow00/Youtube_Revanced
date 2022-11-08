import java.util.Iterator;
import android.text.TextUtils;
import java.util.concurrent.Executor;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;

// 
// Decompiled by Procyon v0.6.0
// 

public final class juz extends acpm
{
    private final e A;
    private final cxz B;
    private final avt C;
    private final avt D;
    private final bx E;
    private final bx F;
    private final bx G;
    private final auip H;
    public final avt a;
    private final vke f;
    private final acno g;
    private final ion h;
    private final hql i;
    private final jjg j;
    private final aboh k;
    private final sxv l;
    private final hvq m;
    private final ljk n;
    private final tdg o;
    private final kzl p;
    private final pgf q;
    private final kzl r;
    private final lll s;
    private final jjg t;
    private final jjg u;
    private final qbo v;
    private final abhr w;
    private final aja x;
    private final blt y;
    private final lht z;
    
    public juz(final tdz tdz, final acno g, final tny tny, final ljk n, final bx g2, final avt d, final cxz b, final avt c, final bx e, final lht z, final e a, final sxv l, final vke f, final wwv wwv, final auip auip, final acmc acmc, final acmc acmc2, final kzl r, final aboh k, final lll s, final blt y, final ion h, final kzl p43, final qbo v, final jjg t, final jjg j, final bx f2, final aja x, final abhr w, final hql i, final hvq m, final pgf q, final tdg o, final auip h2, final jjg u, final avt a2, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        super(f, tdz, g, tny, wwv, acmc, acmc2, auip, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.f = f;
        this.g = g;
        this.n = n;
        this.G = g2;
        this.D = d;
        this.B = b;
        this.C = c;
        this.E = e;
        this.z = z;
        this.A = a;
        this.r = r;
        this.k = k;
        this.l = l;
        this.s = s;
        this.y = y;
        this.h = h;
        this.p = p43;
        this.v = v;
        this.t = t;
        this.j = j;
        this.F = f2;
        this.x = x;
        this.w = w;
        this.i = i;
        this.m = m;
        this.q = q;
        this.o = o;
        this.H = h2;
        this.u = u;
        this.a = a2;
    }
    
    public final acnp a(final Object o, final acpi acpi, final acpd acpd) {
        if (o instanceof amxe) {
            this.g.b((Class)glc.class);
            final ljk n = this.n;
            final amxe amxe = (amxe)o;
            final Context context = (Context)((atjj)n.e).a();
            context.getClass();
            final Executor executor = (Executor)((atjj)n.j).a();
            executor.getClass();
            final tdz tdz = (tdz)((atjj)n.l).a();
            tdz.getClass();
            final zki zki = (zki)((atjj)n.d).a();
            zki.getClass();
            final aeim aeim = (aeim)((atjj)n.i).a();
            aeim.getClass();
            final aeim aeim2 = (aeim)((atjj)n.k).a();
            aeim2.getClass();
            final adjk adjk = (adjk)((atjj)n.g).a();
            adjk.getClass();
            final Executor executor2 = (Executor)((atjj)n.b).a();
            executor2.getClass();
            final arud arud = (arud)((atjj)n.c).a();
            arud.getClass();
            final adno adno = (adno)((atjj)n.h).a();
            adno.getClass();
            final adcr adcr = (adcr)((atjj)n.f).a();
            adcr.getClass();
            n.a.a().getClass();
            amxe.getClass();
            return (acnp)new juk(context, executor, tdz, zki, aeim, aeim2, adjk, executor2, arud, adno, adcr, amxe, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        }
        if (o instanceof almg) {
            final bx g = this.G;
            final almg almg = (almg)o;
            final acno acno = (acno)((atjj)g.a).a();
            acno.getClass();
            almg.getClass();
            return (acnp)new jte(acno, almg);
        }
        if (o instanceof aige) {
            final avt d = this.D;
            final aige aige = (aige)o;
            final acno acno2 = (acno)((atjj)d.a).a();
            acno2.getClass();
            aige.getClass();
            return (acnp)new exz(acno2, aige);
        }
        if (o instanceof aiiw) {
            final cxz b = this.B;
            final aiiw aiiw = (aiiw)o;
            final acno acno3 = (acno)((atjj)b.a).a();
            acno3.getClass();
            aiiw.getClass();
            return (acnp)new gce(acno3, aiiw);
        }
        if (o instanceof aihu) {
            final avt c = this.C;
            final aihu aihu = (aihu)o;
            final acno acno4 = (acno)((atjj)c.a).a();
            acno4.getClass();
            aihu.getClass();
            return (acnp)new eyq(acno4, aihu);
        }
        if (o instanceof ajqb || o instanceof ajoi || o instanceof aogs || o instanceof aiqx || o instanceof amge) {
            final acno acno5 = (acno)((atjj)this.E.a).a();
            acno5.getClass();
            o.getClass();
            return (acnp)new jvh(acno5, o);
        }
        if (o instanceof veq) {
            final aobk a = ((veq)o).a;
            return (acnp)this.z.b(a, actc.f(a), this.b(a), acpi);
        }
        if (o instanceof vez) {
            final aobk a2 = ((vez)o).a;
            return (acnp)this.A.d(a2, actc.g(a2), acpi, (acik)fut.c);
        }
        if (o instanceof ver) {
            final ver ver = (ver)o;
            Object a3;
            if (smm.B(ver)) {
                a3 = this.k.a(this.f, this.d, acpi);
                if (acpi == null) {
                    ((acnw)a3).j(ver);
                }
            }
            else {
                final alib a4 = ver.a;
                if ((TextUtils.equals((CharSequence)"downloads_page_downloads_item_section_identifier", (CharSequence)a4.i) || TextUtils.equals((CharSequence)"downloads_page_recommendations_item_section_identifier", (CharSequence)a4.i) || TextUtils.equals((CharSequence)"downloads_page_smart_downloads_item_section_identifier", (CharSequence)a4.i) || TextUtils.equals((CharSequence)"downloads_page_disclaimer_item_section_identifier", (CharSequence)a4.i)) && acpd instanceof ioq) {
                    final ioq ioq = (ioq)acpd;
                    final ion h = this.h;
                    final vke f = this.f;
                    final wwv d2 = this.d;
                    final grk grk = new grk(ioq, 15);
                    final acno acno6 = (acno)h.a.a();
                    acno6.getClass();
                    final tdz tdz2 = (tdz)h.b.a();
                    tdz2.getClass();
                    final tny tny = (tny)h.c.a();
                    tny.getClass();
                    final fml fml = (fml)h.d.a();
                    fml.getClass();
                    final Executor executor3 = (Executor)h.e.a();
                    executor3.getClass();
                    final acae acae = (acae)h.f.a();
                    final acae acae2 = (acae)h.g.a();
                    final avt avt = (avt)h.h.a();
                    avt.getClass();
                    h.i.a().getClass();
                    final aja aja = (aja)h.j.a();
                    final kvp kvp = (kvp)h.k.a();
                    kvp.getClass();
                    final asho asho = (asho)h.l.a();
                    asho.getClass();
                    final asho asho2 = (asho)h.m.a();
                    asho2.getClass();
                    final igq igq = (igq)h.n.a();
                    igq.getClass();
                    final igq igq2 = (igq)h.o.a();
                    igq2.getClass();
                    final uyi uyi = (uyi)h.p.a();
                    uyi.getClass();
                    a3 = new iom(acno6, tdz2, tny, fml, executor3, acae, acae2, avt, aja, kvp, asho, asho2, igq, igq2, uyi, f, d2, acpi, (ijg)ioq, (aeyr)grk, null, null, null, null, null, null);
                    if (acpi == null) {
                        ((acnw)a3).j(ver);
                    }
                }
                else if (TextUtils.equals((CharSequence)ver.a.i, (CharSequence)"library-recent")) {
                    final kzl p3 = this.p;
                    final vke f2 = this.f;
                    final wwv d3 = this.d;
                    final acno acno7 = (acno)((atjj)p3.j).a();
                    acno7.getClass();
                    final tdz tdz3 = (tdz)((atjj)p3.c).a();
                    tdz3.getClass();
                    final tny tny2 = (tny)((atjj)p3.h).a();
                    tny2.getClass();
                    final acae acae3 = (acae)((atjj)p3.g).a();
                    acae3.getClass();
                    final oas oas = (oas)((atjj)p3.e).a();
                    oas.getClass();
                    final hyw hyw = (hyw)((atjj)p3.a).a();
                    hyw.getClass();
                    final aeby aeby = (aeby)((atjj)p3.b).a();
                    aeby.getClass();
                    final avt avt2 = (avt)((atjj)p3.d).a();
                    avt2.getClass();
                    final asho asho3 = (asho)((atjj)p3.i).a();
                    asho3.getClass();
                    final aexq aexq = (aexq)((atjj)p3.f).a();
                    aexq.getClass();
                    a3 = new jup(acno7, tdz3, tny2, acae3, oas, hyw, aeby, avt2, asho3, aexq, f2, d3, acpi, (byte[])null, (byte[])null, (byte[])null);
                    if (acpi == null) {
                        ((acnw)a3).j(ver);
                    }
                }
                else {
                    final alib a5 = ver.a;
                    if (a5.e.size() > 0 && (((alie)a5.e.get(0)).d & 0x80) != 0x0) {
                        final aja x = this.x;
                        final vke f3 = this.f;
                        final wwv d4 = this.d;
                        final acno acno8 = (acno)((atjj)x.a).a();
                        acno8.getClass();
                        final tdz tdz4 = (tdz)((atjj)x.c).a();
                        tdz4.getClass();
                        final tny tny3 = (tny)((atjj)x.b).a();
                        tny3.getClass();
                        a3 = new jeb(acno8, tdz4, tny3, f3, d4, acpi);
                        if (acpi == null) {
                            ((acnw)a3).j(ver);
                        }
                    }
                    else {
                        final alib a6 = ver.a;
                        if ((a6.c & 0x8) != 0x0 && a6.i.equals("clip-create-item-section")) {
                            final hql i = this.i;
                            final vke f4 = this.f;
                            final wwv d5 = this.d;
                            final acno acno9 = (acno)i.e.a();
                            acno9.getClass();
                            final tdz tdz5 = (tdz)i.c.a();
                            tdz5.getClass();
                            final tny tny4 = (tny)i.d.a();
                            tny4.getClass();
                            final acae acae4 = (acae)i.b.a();
                            acae4.getClass();
                            final oas oas2 = (oas)i.k.a();
                            oas2.getClass();
                            final hyw hyw2 = (hyw)i.i.a();
                            hyw2.getClass();
                            final aexq aexq2 = (aexq)i.a.a();
                            aexq2.getClass();
                            final aeby aeby2 = (aeby)i.f.a();
                            aeby2.getClass();
                            final avt avt3 = (avt)i.g.a();
                            avt3.getClass();
                            final asho asho4 = (asho)i.h.a();
                            asho4.getClass();
                            a3 = new gsa(acno9, tdz5, tny4, acae4, oas2, hyw2, aexq2, aeby2, avt3, asho4, f4, d5, acpi, (aexq)i.j.a(), (byte[])null, (byte[])null, (byte[])null);
                            if (acpi == null) {
                                ((acnw)a3).j(ver);
                            }
                        }
                        else {
                            final alib a7 = ver.a;
                            if ((a7.c & 0x8) != 0x0 && a7.i.equals("clip-view-item-section")) {
                                final hvq m = this.m;
                                final vke f5 = this.f;
                                final wwv d6 = this.d;
                                final acno acno10 = (acno)((atjj)m.g).a();
                                acno10.getClass();
                                final tdz tdz6 = (tdz)((atjj)m.c).a();
                                tdz6.getClass();
                                final tny tny5 = (tny)((atjj)m.k).a();
                                tny5.getClass();
                                final acae acae5 = (acae)((atjj)m.e).a();
                                acae5.getClass();
                                final oas oas3 = (oas)((atjj)m.a).a();
                                oas3.getClass();
                                final hyw hyw3 = (hyw)((atjj)m.h).a();
                                hyw3.getClass();
                                final aexq aexq3 = (aexq)((atjj)m.d).a();
                                aexq3.getClass();
                                final aeby aeby3 = (aeby)((atjj)m.b).a();
                                aeby3.getClass();
                                final avt avt4 = (avt)((atjj)m.n).a();
                                avt4.getClass();
                                final asho asho5 = (asho)((atjj)m.l).a();
                                asho5.getClass();
                                final aexq aexq4 = (aexq)((atjj)m.j).a();
                                final vax vax = (vax)((atjj)m.i).a();
                                vax.getClass();
                                final fjp fjp = (fjp)((atjj)m.f).a();
                                fjp.getClass();
                                final wvu wvu = (wvu)((atjj)m.m).a();
                                wvu.getClass();
                                a3 = new gsc(acno10, tdz6, tny5, acae5, oas3, hyw3, aexq3, aeby3, avt4, asho5, f5, d6, acpi, aexq4, vax, fjp, wvu, (byte[])null, (byte[])null, (byte[])null);
                                if (acpi == null) {
                                    ((acnw)a3).j(ver);
                                }
                            }
                            else if (TextUtils.equals((CharSequence)ver.a.i, (CharSequence)"channel-item-section")) {
                                final pgf q = this.q;
                                final vke f6 = this.f;
                                final wwv d7 = this.d;
                                final acno acno11 = (acno)((atjj)q.g).a();
                                acno11.getClass();
                                final tdz tdz7 = (tdz)((atjj)q.e).a();
                                tdz7.getClass();
                                final tny tny6 = (tny)((atjj)q.d).a();
                                tny6.getClass();
                                final acae acae6 = (acae)((atjj)q.f).a();
                                acae6.getClass();
                                final oas oas4 = (oas)((atjj)q.a).a();
                                oas4.getClass();
                                final hyw hyw4 = (hyw)((atjj)q.b).a();
                                hyw4.getClass();
                                final aexq aexq5 = (aexq)((atjj)q.j).a();
                                aexq5.getClass();
                                final aeby aeby4 = (aeby)((atjj)q.k).a();
                                aeby4.getClass();
                                final avt avt5 = (avt)((atjj)q.h).a();
                                avt5.getClass();
                                final asho asho6 = (asho)((atjj)q.i).a();
                                asho6.getClass();
                                final e e = (e)((atjj)q.l).a();
                                final lht lht = (lht)((atjj)q.m).a();
                                final auip auip = (auip)((atjj)q.c).a();
                                auip.getClass();
                                final exx exx = new exx(acno11, tdz7, tny6, acae6, oas4, hyw4, aexq5, aeby4, avt5, asho6, e, lht, auip, f6, d7, acpi, null, null, null, null, null, null);
                                final alib a8 = ver.a;
                                if ((a8.c & 0x2) != 0x0) {
                                    final String g2 = a8.g;
                                    this.a.m(g2, (acnw)exx);
                                    ((acnw)exx).O((acnv)new juy(this, g2, 1));
                                }
                                a3 = exx;
                                if (acpi == null) {
                                    ((acnw)exx).j(ver);
                                    a3 = exx;
                                }
                            }
                            else {
                                final jtn d8 = this.r.d(this.f, this.d, acpi);
                                final alib a9 = ver.a;
                                if ((a9.c & 0x2) != 0x0) {
                                    final String g3 = a9.g;
                                    this.a.m(g3, (acnw)d8);
                                    ((acnw)d8).O((acnv)new juy(this, g3, 0));
                                }
                                a3 = d8;
                                if (acpi == null) {
                                    ((acnw)d8).j(ver);
                                    a3 = d8;
                                }
                            }
                        }
                    }
                }
            }
            ((acmv)a3).a().ni((acik)new kfe(this.b, 6));
            return (acnp)a3;
        }
        if (o instanceof aiqw) {
            return (acnp)this.l.l((aiqw)o, this.f, this.d, this.o, this.H);
        }
        if (o instanceof aifw) {
            final exy exy = new exy(this.g);
            final aifw aifw = (aifw)o;
            ((tdv)exy.a).clear();
            if (aifw != null) {
                for (final aifx aifx : aifw.c) {
                    if ((aifx.b & 0x1) != 0x0) {
                        final acjb a10 = exy.a;
                        aifv aifv;
                        if ((aifv = aifx.c) == null) {
                            aifv = aifv.a;
                        }
                        a10.add((Object)aifv);
                    }
                }
                exy.a.add((Object)aifw);
            }
            return (acnp)exy;
        }
        if (o instanceof amnu) {
            return (acnp)new jue(this.g, (amnu)o);
        }
        if (o instanceof anii) {
            final qbo v = this.v;
            final vke f7 = this.f;
            final wwv d9 = this.d;
            final acno acno12 = (acno)((atjj)v.c).a();
            acno12.getClass();
            final tdz tdz8 = (tdz)((atjj)v.b).a();
            tdz8.getClass();
            final tny tny7 = (tny)((atjj)v.a).a();
            tny7.getClass();
            final vax vax2 = (vax)((atjj)v.e).a();
            vax2.getClass();
            final abfa abfa = (abfa)((atjj)v.g).a();
            abfa.getClass();
            final fml fml2 = (fml)((atjj)v.f).a();
            fml2.getClass();
            final hyr hyr = (hyr)((atjj)v.d).a();
            hyr.getClass();
            final jtp jtp = new jtp(acno12, tdz8, tny7, vax2, abfa, fml2, hyr, f7, (acms)acpd, d9, (byte[])null, (byte[])null, (byte[])null);
            ((acoj)jtp).m((anii)o);
            return (acnp)jtp;
        }
        if (o instanceof aikw) {
            final lll s = this.s;
            final vke f8 = this.f;
            final wwv d10 = this.d;
            final Context context2 = (Context)((atjj)s.d).a();
            context2.getClass();
            final acno acno13 = (acno)((atjj)s.c).a();
            acno13.getClass();
            final Object f9 = s.f;
            final tdz tdz9 = (tdz)((atjj)s.a).a();
            tdz9.getClass();
            final tny tny8 = (tny)((atjj)s.b).a();
            tny8.getClass();
            final feq feq = (feq)((atjj)s.h).a();
            final jru jru = new jru(context2, acno13, (atjj)f9, tdz9, tny8, (atjj)s.g, (atjj)s.e, f8, d10, acpi, acpd);
            if (acpi == null) {
                jru.l((aikw)o);
            }
            return (acnp)jru;
        }
        if (o instanceof aobk) {
            final aobk aobk = (aobk)o;
            if ((aobk.b & 0x400000) != 0x0) {
                aobm aobm;
                if ((aobm = aobk.r) == null) {
                    aobm = aobm.a;
                }
                ajxm ajxm;
                if ((aobm.b & 0x2) != 0x0) {
                    aobm aobm2;
                    if ((aobm2 = aobk.r) == null) {
                        aobm2 = aobm.a;
                    }
                    if ((ajxm = aobm2.d) == null) {
                        ajxm = ajxm.a;
                    }
                }
                else {
                    ajxm = null;
                }
                return (acnp)this.y.l(aobk, ajxm, this.u.f(ajxm, this.c), acpi);
            }
        }
        if (o instanceof ajkj) {
            final jjg t = this.t;
            final ajkj ajkj = (ajkj)o;
            final acno acno14 = (acno)((atjj)t.b).a();
            acno14.getClass();
            final acae acae7 = (acae)((atjj)t.a).a();
            acae7.getClass();
            ajkj.getClass();
            return (acnp)new jvg(acno14, acae7, ajkj);
        }
        if (o instanceof ajwe) {
            final jjg j = this.j;
            final ajwe ajwe = (ajwe)o;
            final acno acno15 = (acno)((atjj)j.b).a();
            acno15.getClass();
            final vbq vbq = (vbq)((atjj)j.a).a();
            vbq.getClass();
            ajwe.getClass();
            return (acnp)new jeg(acno15, vbq, ajwe);
        }
        if (o instanceof anuy) {
            final bx f10 = this.F;
            final anuy anuy = (anuy)o;
            final acno acno16 = (acno)((atjj)f10.a).a();
            acno16.getClass();
            anuy.getClass();
            return (acnp)new juw(acno16, anuy);
        }
        if (o instanceof aogo) {
            final leb x2 = this.w.x((aogo)o);
            x2.f();
            return (acnp)x2;
        }
        return super.a(o, acpi, acpd);
    }
}
