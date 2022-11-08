import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Function;
import j$.util.Collection$_EL;
import j$.util.stream.Stream$_CC;
import j$.util.Optional;
import android.support.v7.widget.RecyclerView;
import java.util.Iterator;
import android.text.TextUtils;
import java.util.Map;
import java.util.IdentityHashMap;
import com.google.protobuf.MessageLite;
import android.util.Pair;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iom extends acnw implements tec
{
    private final blt I;
    private final kvp J;
    public final fml a;
    public String b;
    public final List c;
    private final ijg d;
    private final aeyr g;
    private final Executor h;
    private final acjb m;
    private final asho n;
    private final asho o;
    private final igq p;
    private final igq q;
    private final asib r;
    private final asic s;
    private asic t;
    private ajff u;
    private final uyi v;
    
    public iom(final acno acno, final tdz tdz, final tny tny, final fml a, final Executor h, final acae acae, final acae acae2, final avt avt, final aja aja, final kvp j, final asho n, final asho o, final igq p26, final igq q, final uyi v, final vke vke, final wwv wwv, final acpi acpi, final ijg d, final aeyr g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        final acjb m = new acjb();
        super(vke, acno, tdz, tny, wwv, acpi.a(acpi), m);
        this.c = new ArrayList();
        this.a = a;
        this.h = h;
        this.d = d;
        this.g = g;
        this.J = j;
        this.n = n;
        this.o = o;
        this.p = p26;
        this.q = q;
        this.v = v;
        this.r = new asib();
        this.m = m;
        final aeim e = super.e;
        final aeim f = super.f;
        final aeby aeby = (aeby)((atjj)aja.b).a();
        aeby.getClass();
        ((atjj)aja.c).a().getClass();
        final uyi uyi = (uyi)((atjj)aja.a).a();
        uyi.getClass();
        e.getClass();
        f.getClass();
        this.I = new blt(aeby, uyi, m, e, f, (byte[])null, (byte[])null, (byte[])null);
        if (acpi instanceof iol) {
            final iol iol = (iol)acpi;
            this.b = iol.a;
            m.p((Collection)iol.b);
            this.k();
            this.p();
        }
        m.ni((acik)new fut(0));
        m.ni((acik)new fas(this, 5));
        if (acae != null) {
            this.P((acpb)acae);
        }
        if (acae2 != null) {
            super.f.I((acpb)acae2);
        }
        this.s = ((ashe)avt.a).J((asjd)new fdl(this, 12)).aj(o).aa(n).aB((asix)new ign(this, 11));
    }
    
    private final asgt o(final igq igq) {
        return igq.u().ay().B((asjd)iie.n).X(this.o).P(this.n);
    }
    
    private final void p() {
        if (this.v.f(45381843L)) {
            if (iji.a.containsKey((Object)this.b)) {
                this.m.ni((acik)new fas(this, 6));
            }
            else {
                this.m.ni((acik)fut.b);
            }
        }
        if ("downloads_page_downloads_item_section_identifier".equals(this.b)) {
            this.m.ni((acik)new fas(this, 7));
            this.m.ni((acik)new fas(this, 8));
        }
    }
    
    public final void d(final abxx abxx) {
        final boolean equals = "downloads_page_downloads_item_section_identifier".equals(this.b);
        final boolean b = false;
        final boolean b2 = false;
        if (equals) {
            boolean b3 = b;
            if (abxx != null) {
                final aexq h = jfi.H(abxx);
                if (h.h()) {
                    final ajfj ajfj = (ajfj)h.c();
                    ajfg a;
                    if (ajfj.b == 2) {
                        a = (ajfg)ajfj.c;
                    }
                    else {
                        a = ajfg.a;
                    }
                    ajff u;
                    if ((u = ajff.b(a.c)) == null) {
                        u = ajff.a;
                    }
                    b3 = b2;
                    if (u.equals((Object)ajff.c)) {
                        final kvp j = this.J;
                        final wyn b4 = ((wyo)((atjj)j.b).a()).b(alku.bN);
                        b4.getClass();
                        ((wyn)(j.a = b4)).c("e_rq");
                        ((acmv)this).K((aext)new ihq(5));
                        b3 = true;
                    }
                    this.u = u;
                }
                else {
                    this.u = null;
                    b3 = b;
                }
            }
            ((acmv)this).N(b3);
            ((acms)this).mD(abxx);
            return;
        }
        if ("downloads_page_smart_downloads_item_section_identifier".equals(this.b)) {
            ((acmv)this).N(false);
            ((acms)this).mD(abxx);
        }
    }
    
    public final void j(final ver ver) {
        super.j(ver);
        final alib a = ver.a;
        this.b = a.i;
        final ijh a2 = ((ioq)this.d).a;
        if (a2 != null) {
            final String b = this.b;
            b.getClass();
            if (iji.a.containsKey((Object)b)) {
                final apni h = a2.a.h((Object)b, (wyb)iji.a.get((Object)b), a2.f++);
                a2.a.D(xkm.aq(h));
                a2.b.put(b, h);
                a2.c.put(b, new AtomicInteger(0));
                alhz alhz;
                if ((a.c & 0x1) != 0x0) {
                    if ((alhz = a.d) == null) {
                        alhz = alhz.a;
                    }
                }
                else {
                    alhz = null;
                }
                aogu aogu = null;
                Label_0278: {
                    if (alhz != null) {
                        alif alif;
                        if ((alif = alhz.g) == null) {
                            alif = alif.a;
                        }
                        alic alic;
                        if ((alic = alif.d) == null) {
                            alic = alic.a;
                        }
                        if ((alic.b & 0x1) != 0x0) {
                            alic alic2;
                            if ((alic2 = alif.d) == null) {
                                alic2 = alic.a;
                            }
                            if ((aogu = alic2.c) == null) {
                                aogu = aogu.a;
                            }
                            break Label_0278;
                        }
                    }
                    aogu = null;
                }
                if (aogu != null) {
                    final apni g = a2.a.g((Object)Pair.create((Object)h, (Object)aogu), wya.c(42355));
                    a2.a.F(xkm.aq(g), xkm.aq(h));
                    final AtomicInteger atomicInteger = a2.c.get(b);
                    if (atomicInteger != null) {
                        atomicInteger.getAndIncrement();
                    }
                    a2.c(b, (MessageLite)aogu);
                    for (final aogt aogt : aogu.c) {
                        if (!ijh.d(aogt) && !ijh.e(aogt)) {
                            trn.b("Added non-downloads page filter type to downloads page submenu.");
                        }
                        else {
                            a2.c(b, (MessageLite)aogt);
                            final Pair create = Pair.create((Object)h, (Object)aogt);
                            final wyb f = ijh.f(b, (MessageLite)aogt);
                            if (f == null) {
                                continue;
                            }
                            a2.a.F(xkm.aq(a2.a.g((Object)create, f)), xkm.aq(g));
                        }
                    }
                }
                for (final alie alie : a.e) {
                    if (alie != null) {
                        final MessageLite z = vwh.z(alie);
                        if (z == null) {
                            continue;
                        }
                        final wyb f2 = ijh.f(b, z);
                        if (f2 == null) {
                            continue;
                        }
                        h.getClass();
                        final AtomicInteger atomicInteger2 = a2.c.get(b);
                        if (atomicInteger2 == null) {
                            continue;
                        }
                        final int andIncrement = atomicInteger2.getAndIncrement();
                        Map<?, ?> map;
                        if (!a2.d.containsKey(b)) {
                            map = new IdentityHashMap<Object, Object>();
                            a2.d.put(b, map);
                        }
                        else {
                            map = a2.d.get(b);
                        }
                        map.put(z, (Object)andIncrement);
                        final agza builder = ((agzi)a2.a.h((Object)Pair.create((Object)h, (Object)z), f2, andIncrement)).toBuilder();
                        String c2 = null;
                        Object i = null;
                        Label_0915: {
                            String c = null;
                            Label_0900: {
                                if (!(z instanceof aiuh)) {
                                    if (z instanceof aitp) {
                                        final aitp aitp = (aitp)z;
                                        if ((aitp.b & 0x200000) != 0x0) {
                                            anft anft;
                                            if ((anft = aitp.p) == null) {
                                                anft = anft.a;
                                            }
                                            c = anft.c;
                                            break Label_0900;
                                        }
                                    }
                                    i = (c2 = null);
                                    break Label_0915;
                                }
                                final aiuh aiuh = (aiuh)z;
                                apin apin;
                                if ((apin = aiuh.t) == null) {
                                    apin = apin.a;
                                }
                                if ((apin.b & 0x1) != 0x0) {
                                    apin apin2;
                                    if ((apin2 = aiuh.t) == null) {
                                        apin2 = apin.a;
                                    }
                                    c2 = apin2.c;
                                }
                                else {
                                    c2 = null;
                                }
                                aiug aiug;
                                if ((aiug = aiuh.s) == null) {
                                    aiug = aiug.a;
                                }
                                amva amva;
                                if ((amva = aiug.c) == null) {
                                    amva = amva.a;
                                }
                                c = c2;
                                if (!amva.i.H()) {
                                    aiug aiug2;
                                    if ((aiug2 = aiuh.s) == null) {
                                        aiug2 = aiug.a;
                                    }
                                    amva amva2;
                                    if ((amva2 = aiug2.c) == null) {
                                        amva2 = amva.a;
                                    }
                                    i = amva2.i;
                                    break Label_0915;
                                }
                            }
                            i = null;
                            c2 = c;
                        }
                        aild h2;
                        if (TextUtils.isEmpty((CharSequence)c2) && i == null) {
                            h2 = null;
                        }
                        else {
                            final agza builder2 = aild.a.createBuilder();
                            if (!TextUtils.isEmpty((CharSequence)c2)) {
                                final agza builder3 = ailk.a.createBuilder();
                                final agyc a3 = agyc.A(c2);
                                builder3.copyOnWrite();
                                final ailk ailk = (ailk)builder3.instance;
                                ailk.b |= 0x1;
                                ailk.c = a3;
                                builder2.copyOnWrite();
                                final aild aild = (aild)builder2.instance;
                                final ailk d = (ailk)builder3.build();
                                d.getClass();
                                aild.d = d;
                                aild.b |= 0x2;
                            }
                            if (i != null) {
                                final agza builder4 = aily.a.createBuilder();
                                builder4.copyOnWrite();
                                final aily aily = (aily)builder4.instance;
                                aily.b |= 0x1;
                                aily.c = (agyc)i;
                                builder2.copyOnWrite();
                                final aild aild2 = (aild)builder2.instance;
                                final aily m = (aily)builder4.build();
                                m.getClass();
                                aild2.m = m;
                                aild2.b |= 0x400;
                            }
                            h2 = (aild)builder2.build();
                        }
                        if (h2 != null) {
                            builder.copyOnWrite();
                            final apni apni = (apni)builder.instance;
                            apni.h = h2;
                            apni.b |= 0x40;
                        }
                        else {
                            builder.copyOnWrite();
                            final apni apni2 = (apni)builder.instance;
                            apni2.h = null;
                            apni2.b &= 0xFFFFFFBF;
                        }
                        final apni apni3 = (apni)builder.build();
                        a2.a.F(xkm.aq(apni3), xkm.aq(h));
                        final apni b2 = a2.b(f2, z);
                        if (b2 == null) {
                            continue;
                        }
                        a2.a.F(xkm.aq(b2), xkm.aq(apni3));
                    }
                }
            }
        }
        if (("downloads_page_smart_downloads_item_section_identifier".equals(this.b) || "downloads_page_downloads_item_section_identifier".equals(this.b)) && this.t == null) {
            this.t = this.o(this.p).al((asix)new ign(this, 12));
        }
        else if (this.v.aj() && "downloads_page_recommendations_item_section_identifier".equals(this.b)) {
            this.r.c(this.o(this.q).al((asix)new ign(this, 13)));
        }
        this.p();
    }
    
    public final void k() {
        this.h.execute((Runnable)new ihc(this, 5));
    }
    
    public final void lH(final ansi ansi, final aioe aioe) {
        final abxx y = aaiy.y((Object)ansi);
        if (!"downloads_page_downloads_item_section_identifier".equals(this.b) && !"downloads_page_smart_downloads_item_section_identifier".equals(this.b)) {
            ((acms)this).mD(aaiy.y((Object)ansi));
            ((RecyclerView)this.g.a()).aa(0);
            return;
        }
        this.d(y);
    }
    
    public final void mD(final abxx abxx) {
        ((acms)this).rQ();
        super.mD(abxx);
    }
    
    protected final void mO(final ver ver, final abxx abxx) {
        if (ver == null) {
            ((acmv)this).qG();
        }
        else if (abxx.a() == abxw.d) {
            final blt i = this.I;
            final alib a = ver.a;
            if (((uyi)i.a).f(45381748L)) {
                final afcr o = afcr.o((Collection)i.e);
                alhz alhz;
                if ((alhz = a.d) == null) {
                    alhz = alhz.a;
                }
                final MessageLite r = whx.R(alhz);
                Optional optional;
                if (r instanceof ajkj) {
                    final Object d = i.d;
                    alhz alhz2;
                    if ((alhz2 = a.d) == null) {
                        alhz2 = alhz.a;
                    }
                    optional = Optional.of(((aeim)d).H((List)afcr.r((Object)alhz2)).get(0));
                }
                else {
                    optional = Optional.ofNullable((Object)r);
                }
                tmy.aR((List)o, (List)Stream$_CC.concat(Stream$_CC.of((Object)optional), Collection$_EL.stream((Collection)((aeim)i.b).H((List)a.e)).map((Function)iof.d)).filter((Predicate)ifl.i).map((Function)iof.c).collect(afaj.a), (trt)new iog(i, 0, null, null, null), (BiFunction)new trq(1));
            }
            else {
                final afcr afcr = (afcr)Collection$_EL.stream((Collection)i.e).map((Function)iof.b).collect(afaj.a);
                alhz alhz3;
                if ((alhz3 = a.d) == null) {
                    alhz3 = alhz.a;
                }
                tmy.aR((List)afcr, (List)Stream$_CC.concat(Stream$_CC.of((Object)whx.R(alhz3)).map((Function)iof.a), Collection$_EL.stream((Collection)a.e).map((Function)new hqf(i, 15, (byte[])null, (byte[])null, (byte[])null))).filter((Predicate)ifl.i).map((Function)iof.c).collect(afaj.a), (trt)new iog(i, 1, null, null, null), (BiFunction)trq.a);
            }
            final ajff u = this.u;
            if (u != null && u.equals((Object)ajff.c)) {
                final Object a2 = this.J.a;
                a2.getClass();
                ((wyn)a2).c("e_rd");
            }
            ((acms)this).lM(ver.a());
        }
        else {
            super.mO(ver, abxx);
        }
        final abxx e = ((acms)this).E;
        if ("downloads_page_downloads_item_section_identifier".equals(this.b) && abxx.a() == abxw.d && e != null && ((ajff)jfi.K(e, (aexg)imx.e, (Object)ajff.a)).equals((Object)ajff.b)) {
            ((RecyclerView)this.g.a()).aj(0);
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        if (clazz == iom.class) {
            Class[] array = null;
            switch (n) {
                default: {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                case 7: {
                    this.Q((acnr)o);
                    break;
                }
                case 6: {
                    final zwn zwn = (zwn)o;
                    if (!this.c.contains(zwn.a)) {
                        this.k();
                        break;
                    }
                    this.c.remove(zwn.a);
                    break;
                }
                case 5: {
                    final zwa zwa = (zwa)o;
                    this.k();
                    break;
                }
                case 4: {
                    this.R((voh)o);
                    break;
                }
                case 3: {
                    this.n((uxr)o);
                    break;
                }
                case 2: {
                    this.qO((uxq)o);
                    break;
                }
                case 1: {
                    this.c.remove(((ijc)o).a);
                    this.k();
                    break;
                }
                case 0: {
                    this.c.add(((ijb)o).a);
                    this.k();
                    break;
                }
                case -1: {
                    array = new Class[] { ijb.class, ijc.class, uxq.class, uxr.class, voh.class, zwa.class, zwn.class, acnr.class };
                    break;
                }
            }
            return array;
        }
        return super.ms(clazz, o, n);
    }
    
    public final acpi qv() {
        final acpi qv = super.qv();
        final String b = this.b;
        b.getClass();
        return new iol(qv, b, this.m);
    }
    
    public final void rU() {
        final asic s = this.s;
        if (s != null) {
            asjg.b((AtomicReference)s);
        }
        final asic t = this.t;
        if (t != null) {
            athh.f((AtomicReference)t);
        }
        if (this.v.aj()) {
            this.r.dispose();
        }
        super.rU();
    }
}
