import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Observer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicBoolean;
import com.google.protobuf.MessageLite;
import com.google.protos.youtube.api.innertube.FlowTopBarRendererOuterClass;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import j$.util.Optional;
import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class absa implements asjm
{
    public final Object a;
    private final int b;
    
    public absa(final absb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public absa(final absc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public absa(final abty a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public absa(final abue a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public absa(final abun a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public absa(final abvr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public absa(final abyp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public absa(final acfw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public absa(final acid a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public absa(final acns a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public absa(final aeea a, final int b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = b;
        this.a = a;
    }
    
    public absa(final RuntimeStreamWriter a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public absa(final ziy a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(Object g) {
        final int b = this.b;
        boolean d = false;
        final boolean b2 = false;
        switch (b) {
            default: {
                final Object a = this.a;
                final tqu tqu = (tqu)g;
                final aiqj b3 = tqu.b();
                final int a2 = tqu.a();
                final acns acns = (acns)a;
                final Object k = acns.k;
                synchronized (k) {
                    alvy alvy;
                    if ((alvy = ((acns)a).v.f().m) == null) {
                        alvy = alvy.a;
                    }
                    aliv aliv;
                    if ((aliv = alvy.d) == null) {
                        aliv = aliv.a;
                    }
                    if (aliv.k && b3 != null && a2 != 0) {
                        g = new acnp((acns)a, a2);
                        ((acns)a).u = (acnp)g;
                        ((acns)a).s = false;
                        monitorexit(k);
                    }
                    else {
                        ((acns)a).u = null;
                        ((acns)a).s = true;
                        monitorexit(k);
                    }
                    if (tqu.d().isPresent()) {
                        final anul c = tqu.c();
                        final aiqj b4 = tqu.b();
                        final ajmo ajmo = (ajmo)tqu.d().get();
                        acns.i();
                        acns.x((Object)ajmo);
                        ((acov)a).ad(aakt.x((Object)c), b4);
                        return;
                    }
                    acns.lH(tqu.c(), tqu.b());
                    return;
                }
                break;
            }
            case 19: {
                final Object a3 = this.a;
                final String d2 = ((ajtu)g).d;
                final acfw acfw = (acfw)a3;
                if (!acfw.c.containsKey(d2) || acfw.c.get(d2) == null) {
                    if (acfw.g.isPresent()) {
                        acfw.a.a((aiqj)acfw.g.get());
                    }
                    final adlp j = acfw.j;
                    if (((Optional)j.b).isPresent()) {
                        ((acfv)((Optional)j.b).get()).r();
                    }
                    acfw.i = Optional.empty();
                    return;
                }
                if (acfw.i.isPresent() && ((String)acfw.i.get()).equals(d2)) {
                    return;
                }
                final ajtw ajtw = acfw.c.get(d2);
                final adlp i = acfw.j;
                anuv anuv;
                if ((anuv = ajtw.d) == null) {
                    anuv = anuv.a;
                }
                Label_0657: {
                    if (anuv.ry((ahaq)ElementRendererOuterClass.elementRenderer)) {
                        final Object f = i.f;
                        anuv anuv2;
                        if ((anuv2 = ajtw.d) == null) {
                            anuv2 = anuv.a;
                        }
                        ((wyw)f).D((wzz)new wyt(((ajmo)anuv2.rx((ahaq)ElementRendererOuterClass.elementRenderer)).e));
                        if (((Optional)i.b).isPresent()) {
                            ((acfv)((Optional)i.b).get()).e();
                        }
                        final ackm ackm = new ackm();
                        ackm.a((wyw)i.f);
                        final Object d3 = i.d;
                        final accf accf = (accf)((arkg)i.c).a();
                        anuv anuv3;
                        if ((anuv3 = ajtw.d) == null) {
                            anuv3 = anuv.a;
                        }
                        ((acbm)d3).b(ackm, accf.d((ajmo)anuv3.rx((ahaq)ElementRendererOuterClass.elementRenderer)));
                        if ((ajtw.b & 0x4) != 0x0) {
                            final Object g2 = i.g;
                            anuv anuv4;
                            if ((anuv4 = ajtw.e) == null) {
                                anuv4 = anuv.a;
                            }
                            ((acfu)g2).t((ajtx)anuv4.rx((ahaq)FlowTopBarRendererOuterClass.flowTopBarRenderer));
                        }
                        else {
                            g = i.g;
                            ((acfu)g).t((ajtx)((ahbc)i.a).rx((ahaq)FlowTopBarRendererOuterClass.flowTopBarRenderer));
                        }
                        if ((ajtw.b & 0x8) != 0x0) {
                            anuv anuv5;
                            if ((anuv5 = ajtw.f) == null) {
                                anuv5 = anuv.a;
                            }
                            if (anuv5.ry((ahaq)ElementRendererOuterClass.elementRenderer)) {
                                final Object e = i.e;
                                anuv anuv6;
                                if ((anuv6 = ajtw.f) == null) {
                                    anuv6 = anuv.a;
                                }
                                ((acft)e).s((ajmo)anuv6.rx((ahaq)ElementRendererOuterClass.elementRenderer));
                                break Label_0657;
                            }
                        }
                        ((acft)i.e).s(null);
                    }
                }
                acfw.i = Optional.of((Object)d2);
                return;
            }
            case 18: {
                final Object a4 = this.a;
                final vfn c2 = ((vft)g).c;
                final ahaz builder = ((ahbh)aqoo.a).createBuilder();
                if (c2 != null) {
                    final ahab x = ahab.x(c2.d());
                    builder.copyOnWrite();
                    final aqoo aqoo = (aqoo)builder.instance;
                    aqoo.b |= 0x1;
                    aqoo.c = x;
                }
                ((RuntimeStreamWriter)a4).c((MessageLite)builder.build());
                return;
            }
            case 17: {
                final Object a5 = this.a;
                final zdi a6 = ((abir)g).a();
                if (a6 == null) {
                    final ziy ziy = (ziy)a5;
                    if (ziy.equals((Object)((abvm)ziy.b).b)) {
                        ((ynp)ziy.d).z((zdi)null);
                        return;
                    }
                }
                if (a6 == null) {
                    ttr.b("Trying to detachMediaView when it wasn't the most recent MediaView Setter");
                    return;
                }
                final ziy b5 = (ziy)a5;
                ((ynp)b5.d).z(a6);
                final abvm abvm = (abvm)b5.b;
                final ziy b6 = abvm.b;
                if (b6 == a5) {
                    return;
                }
                if (b6 != null) {
                    final Object c3 = b6.c;
                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                    asjv.b((AtomicReference)((vai)((abrj)c3).e).l(45377247L).aH((asjm)new abja(atomicBoolean, 6)));
                    if (atomicBoolean.get()) {
                        final zdi d4 = ((abjj)b6.a).d;
                        if (d4 != null) {
                            ((zds)d4).n();
                        }
                    }
                    final Observer a7 = abvm.a;
                    if (a7 != null) {
                        abvm.b.g().deleteObserver(a7);
                    }
                }
                abvm.b = b5;
                final zdk g3 = abvm.b.g();
                final Observer a8 = abvm.a;
                if (a8 != null) {
                    g3.addObserver(a8);
                }
                abvm.notifyObservers();
                return;
            }
            case 16: {
                final Object a9 = this.a;
                final aamh aamh = (aamh)g;
                if (aamh != null) {
                    int l;
                    if (aamh.d() == null) {
                        l = -1;
                    }
                    else {
                        l = aamh.d().i;
                    }
                    ((xsn)((aeea)a9).a).c.c = l;
                }
                return;
            }
            case 15: {
                final Object a10 = this.a;
                final aany aany = (aany)g;
                ((abyp)a10).f = false;
                return;
            }
            case 14: {
                final Object a11 = this.a;
                final abzl a12 = ((aany)g).a();
                if (a12.a() == 3) {
                    final abyp abyp = (abyp)a11;
                    abyp.y();
                    abyp.v();
                    abyp.x(a12.c(), a12.aa());
                }
                return;
            }
            case 13: {
                ((acid)this.a).c((boolean)g);
                return;
            }
            case 12: {
                ((abzj)this.a).e((aant)g);
                return;
            }
            case 11: {
                ((abzj)this.a).s((aanw)g);
                return;
            }
            case 10: {
                final Object a13 = this.a;
                final aamf aamf = (aamf)g;
                ((abvr)a13).w();
                return;
            }
            case 9: {
                ((abzj)this.a).P((aamb)g);
                return;
            }
            case 8: {
                final Object a14 = this.a;
                final aanf aanf = (aanf)g;
                final abka a15 = abka.a;
                final abke a16 = abke.a;
                final int ordinal = aanf.b().ordinal();
                if (ordinal == 1) {
                    final PlayerResponseModel a17 = aanf.a();
                    boolean e2 = b2;
                    if (a17 != null) {
                        e2 = b2;
                        if (a17.T()) {
                            e2 = true;
                        }
                    }
                    final abvr abvr = (abvr)a14;
                    if ((abvr.e = e2) && abvr.c > 1.0f) {
                        abvr.v();
                    }
                    ((abvq)abvr.a.a()).K(abvr.c);
                    return;
                }
                if (ordinal != 7) {
                    return;
                }
                ((abvr)a14).w();
                return;
            }
            case 7: {
                final Object a18 = this.a;
                if (((aany)g).a().a() != 0) {
                    d = true;
                }
                ((abvr)a18).d = d;
                return;
            }
            case 6: {
                final Object a19 = this.a;
                final aalp aalp = (aalp)g;
                final abul c4 = ((abun)a19).c;
                final lrd a20 = aalp.a();
                if (c4.q != a20) {
                    c4.q = a20;
                    c4.b(2048);
                }
                return;
            }
            case 5: {
                final Object a21 = this.a;
                final trn trn = (trn)g;
                final abue abue = (abue)a21;
                if (abue.j.equals((Object)trn.a.a)) {
                    return;
                }
                abue.j.set(trn.a.a);
                abue.requestLayout();
                return;
            }
            case 4: {
                ((abty)this.a).b((ypj)g);
                return;
            }
            case 3: {
                final Object a22 = this.a;
                if (!((aame)g).a()) {
                    ((absc)a22).a.clear();
                }
                return;
            }
            case 2: {
                final Object a23 = this.a;
                final aanl aanl = (aanl)g;
                final SubtitleTrack a24 = aanl.a();
                if (aanl.c() && a24 != null) {
                    ((absc)a23).a.add(a24.e());
                }
                return;
            }
            case 1: {
                final Object a25 = this.a;
                final aals aals = (aals)g;
                final PlayerResponseModel a26 = aals.a();
                aned aned;
                if ((aals.b().b & 0x8) != 0x0) {
                    aiep aiep;
                    if ((aiep = aals.b().e) == null) {
                        aiep = aiep.a;
                    }
                    if ((aned = aiep.b) == null) {
                        aned = aned.a;
                    }
                }
                else {
                    aned = aals.a().D();
                }
                final absb absb = (absb)a25;
                absb.f(absb.k = a26, aned);
                return;
            }
            case 0: {
                final Object a27 = this.a;
                if (!((aame)g).a()) {
                    final abqs e3 = ((absb)a27).n.e();
                    e3.b((Boolean)null);
                    e3.b = "";
                    teu.m(e3.a(), (tes)zsa.s);
                }
            }
        }
    }
}
