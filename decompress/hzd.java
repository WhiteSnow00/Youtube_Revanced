import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.api.innertube.InlinePlaybackRendererOuterClass;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hzd implements vaq
{
    private final AtomicBoolean a;
    private final arkg b;
    private final vaf c;
    private final aeea d;
    
    public hzd(final vaf c, final arkg b, final aeea d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = new AtomicBoolean();
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    private final afeq b(final long n, String c, final aotp aotp) {
        if ((n & 0x40L) != 0x0L) {
            final aict a = aicu.a();
            ((ahaz)a).copyOnWrite();
            aicu.e((aicu)a.instance, c);
            ((ahaz)a).copyOnWrite();
            aicu.f((aicu)a.instance, true);
            if (aotp != null && !((List)aotp.c).isEmpty()) {
                c = ((List<aoto>)aotp.c).get(0).c;
                ((ahaz)a).copyOnWrite();
                aicu.c((aicu)a.instance, c);
                final int size = aotp.c.size();
                ((ahaz)a).copyOnWrite();
                aicu.d((aicu)a.instance, size);
            }
            final wxx wxx = (wxx)this.b.a();
            final aknr d = aknt.d();
            ((ahaz)d).copyOnWrite();
            aknt.A((aknt)d.instance, (aicu)((ahaz)a).build());
            wxx.d((aknt)((ahaz)d).build());
        }
        afeq afeq;
        if (aotp != null) {
            afeq = afeq.r((Object)aotp);
        }
        else {
            afeq = afeq.q();
        }
        return afeq;
    }
    
    public final /* bridge */ List a(Object v) {
        if (this.a.compareAndSet(false, true) && v instanceof akhz) {
            final akhz akhz = (akhz)v;
            if ((akhz.b & 0x40) != 0x0) {
                aoqn aoqn;
                if ((aoqn = this.c.b().s) == null) {
                    aoqn = aoqn.a;
                }
                final long q = aoqn.q;
                akia akia;
                if ((akia = akhz.f) == null) {
                    akia = akia.a;
                }
                if (akia.b != 58173949) {
                    final afeq afeq = afeq.q();
                    return (List)afeq;
                }
                final ahbx c = ((akii)akia.c).c;
                if (((List)c).size() <= 0) {
                    final afeq afeq = afeq.q();
                    return (List)afeq;
                }
                final akic akic = (akic)((List)c).get(0);
                aorj a;
                if (akic.b == 58174010) {
                    a = (aorj)akic.c;
                }
                else {
                    a = aorj.a;
                }
                aiqj aiqj;
                if ((aiqj = a.d) == null) {
                    aiqj = aiqj.a;
                }
                if (((ahbc)aiqj).ry((ahaq)BrowseEndpointOuterClass.browseEndpoint)) {
                    aiqj aiqj2;
                    if ((aiqj2 = a.d) == null) {
                        aiqj2 = aiqj.a;
                    }
                    if (((aicj)((ahbc)aiqj2).rx((ahaq)BrowseEndpointOuterClass.browseEndpoint)).c.equals("FEwhat_to_watch")) {
                        aorf aorf;
                        if ((aorf = a.k) == null) {
                            aorf = aorf.a;
                        }
                        if ((aorf.b & 0x1) == 0x0) {
                            final afeq afeq = afeq.q();
                            return (List)afeq;
                        }
                        aorf aorf2;
                        if ((aorf2 = a.k) == null) {
                            aorf2 = aorf.a;
                        }
                        anyv anyv;
                        if ((anyv = aorf2.c) == null) {
                            anyv = anyv.a;
                        }
                        final ahbx d = anyv.d;
                        if (((List)d).size() <= 0 || (((anyy)((List)d).get(0)).b & 0x10) == 0x0) {
                            final afeq afeq = afeq.q();
                            return (List)afeq;
                        }
                        alke alke;
                        if ((alke = ((anyy)((List)d).get(0)).j) == null) {
                            alke = alke.a;
                        }
                        final ahbx e = alke.e;
                        if (((List)e).size() <= 0) {
                            final afeq afeq = afeq.q();
                            return (List)afeq;
                        }
                        final alkh alkh = (alkh)((List)e).get(0);
                        final int f = alkh.f;
                        if ((0x800000 & f) != 0x0) {
                            if ((0x1L & q) == 0x0L) {
                                final afeq afeq = afeq.q();
                                return (List)afeq;
                            }
                            anox anox;
                            if ((anox = alkh.X) == null) {
                                anox = anox.a;
                            }
                            final String simpleName = anox.getClass().getSimpleName();
                            anov anov;
                            if ((anov = anox.c) == null) {
                                anov = anov.a;
                            }
                            aotp aotp;
                            if ((aotp = anov.d) == null) {
                                aotp = aotp.a;
                            }
                            final afeq afeq = this.b(q, simpleName, aotp);
                            return (List)afeq;
                        }
                        else {
                            final int g = alkh.g;
                            if ((g & 0x8) != 0x0) {
                                if ((0x2L & q) == 0x0L) {
                                    final afeq afeq = afeq.q();
                                    return (List)afeq;
                                }
                                anpo anpo;
                                if ((anpo = alkh.ad) == null) {
                                    anpo = anpo.a;
                                }
                                final String simpleName2 = anpo.getClass().getSimpleName();
                                anpn anpn;
                                if ((anpn = anpo.c) == null) {
                                    anpn = anpn.a;
                                }
                                aotp aotp2;
                                if ((aotp2 = anpn.c) == null) {
                                    aotp2 = aotp.a;
                                }
                                final afeq afeq = this.b(q, simpleName2, aotp2);
                                return (List)afeq;
                            }
                            else {
                                final int d2 = alkh.d;
                                if ((d2 & 0x800) != 0x0) {
                                    if ((0x4L & q) == 0x0L) {
                                        final afeq afeq = afeq.q();
                                        return (List)afeq;
                                    }
                                    anqm anqm;
                                    if ((anqm = alkh.O) == null) {
                                        anqm = anqm.a;
                                    }
                                    final String simpleName3 = anqm.getClass().getSimpleName();
                                    anuv anuv;
                                    if ((anuv = anqm.c) == null) {
                                        anuv = anuv.a;
                                    }
                                    aotp aotp3;
                                    if ((aotp3 = ((akgc)((ahbc)anuv).rx((ahaq)InlinePlaybackRendererOuterClass.inlinePlaybackRenderer)).c) == null) {
                                        aotp3 = aotp.a;
                                    }
                                    final afeq afeq = this.b(q, simpleName3, aotp3);
                                    return (List)afeq;
                                }
                                else if ((Integer.MIN_VALUE & f) != 0x0) {
                                    if ((0x8L & q) == 0x0L) {
                                        final afeq afeq = afeq.q();
                                        return (List)afeq;
                                    }
                                    anpy anpy;
                                    if ((anpy = alkh.Z) == null) {
                                        anpy = anpy.a;
                                    }
                                    final String simpleName4 = anpy.getClass().getSimpleName();
                                    anpm anpm;
                                    if ((anpm = anpy.c) == null) {
                                        anpm = anpm.a;
                                    }
                                    aotp aotp4;
                                    if ((aotp4 = anpm.c) == null) {
                                        aotp4 = aotp.a;
                                    }
                                    final afeq afeq = this.b(q, simpleName4, aotp4);
                                    return (List)afeq;
                                }
                                else if ((0x200000 & f) != 0x0) {
                                    if ((0x10L & q) == 0x0L) {
                                        final afeq afeq = afeq.q();
                                        return (List)afeq;
                                    }
                                    anot anot;
                                    if ((anot = alkh.W) == null) {
                                        anot = anot.a;
                                    }
                                    final String simpleName5 = anot.getClass().getSimpleName();
                                    anpm anpm2;
                                    if ((anpm2 = anot.c) == null) {
                                        anpm2 = anpm.a;
                                    }
                                    aotp aotp5;
                                    if ((aotp5 = anpm2.c) == null) {
                                        aotp5 = aotp.a;
                                    }
                                    final afeq afeq = this.b(q, simpleName5, aotp5);
                                    return (List)afeq;
                                }
                                else if ((alkh.h & 0x2000000) != 0x0) {
                                    if ((0x20L & q) == 0x0L) {
                                        final afeq afeq = afeq.q();
                                        return (List)afeq;
                                    }
                                    ajmo ajmo;
                                    if ((ajmo = alkh.al) == null) {
                                        ajmo = ajmo.a;
                                    }
                                    final String simpleName6 = ajmo.getClass().getSimpleName();
                                    Object o = null;
                                    try {
                                        final byte[] c2 = this.d.ak(ajmo).c;
                                        if (c2 == null) {
                                            v = o;
                                        }
                                        else {
                                            o = ((aqfw)ahbh.parseFrom((ahbh)aqfw.a, c2, ExtensionRegistryLite.getGeneratedRegistry())).c;
                                            Object a2;
                                            if ((a2 = o) == null) {
                                                a2 = aqhl.a;
                                            }
                                            o = ((aqfb)((ahbc)a2).rx((ahaq)aqfb.b)).e;
                                            ahbc a3;
                                            if ((a3 = (ahbc)o) == null) {
                                                a3 = aqfg.a;
                                            }
                                            o = ((aqkq)a3.rx((ahaq)aqkq.b)).c;
                                            Object a4;
                                            if ((a4 = o) == null) {
                                                a4 = aqkp.a;
                                            }
                                            o = ((aqkp)a4).b;
                                            Object a5;
                                            if ((a5 = o) == null) {
                                                a5 = aqkm.a;
                                            }
                                            o = ((aqkm)a5).b;
                                            Object a6;
                                            if ((a6 = o) == null) {
                                                a6 = aqko.a;
                                            }
                                            aqgi a7;
                                            if (((aqko)a6).b == 1) {
                                                a7 = (aqgi)((aqko)a6).c;
                                            }
                                            else {
                                                a7 = aqgi.a;
                                            }
                                            v = aakv.v(a7);
                                        }
                                    }
                                    catch (final ahca ahca) {
                                        ttr.b("Failed to parse ElementRenderer when crawling for first Home thumbnail");
                                        v = o;
                                    }
                                    final afeq afeq = this.b(q, simpleName6, (aotp)v);
                                    return (List)afeq;
                                }
                                else if ((g & 0x4) != 0x0) {
                                    if ((0x80L & q) == 0x0L) {
                                        final afeq afeq = afeq.q();
                                        return (List)afeq;
                                    }
                                    anpp anpp;
                                    if ((anpp = alkh.ac) == null) {
                                        anpp = anpp.a;
                                    }
                                    final String simpleName7 = anpp.getClass().getSimpleName();
                                    anpn anpn2;
                                    if ((anpn2 = anpp.c) == null) {
                                        anpn2 = anpn.a;
                                    }
                                    aotp aotp6;
                                    if ((aotp6 = anpn2.c) == null) {
                                        aotp6 = aotp.a;
                                    }
                                    final afeq afeq = this.b(q, simpleName7, aotp6);
                                    return (List)afeq;
                                }
                                else if ((g & 0x20) != 0x0) {
                                    if ((0x100L & q) == 0x0L) {
                                        final afeq afeq = afeq.q();
                                        return (List)afeq;
                                    }
                                    anpq anpq;
                                    if ((anpq = alkh.ae) == null) {
                                        anpq = anpq.a;
                                    }
                                    final String simpleName8 = anpq.getClass().getSimpleName();
                                    anpn anpn3;
                                    if ((anpn3 = anpq.c) == null) {
                                        anpn3 = anpn.a;
                                    }
                                    aotp aotp7;
                                    if ((aotp7 = anpn3.c) == null) {
                                        aotp7 = aotp.a;
                                    }
                                    final afeq afeq = this.b(q, simpleName8, aotp7);
                                    return (List)afeq;
                                }
                                else if ((g & 0x80) != 0x0) {
                                    if ((0x200L & q) == 0x0L) {
                                        final afeq afeq = afeq.q();
                                        return (List)afeq;
                                    }
                                    anpr anpr;
                                    if ((anpr = alkh.ag) == null) {
                                        anpr = anpr.a;
                                    }
                                    final String simpleName9 = anpr.getClass().getSimpleName();
                                    anpn anpn4;
                                    if ((anpn4 = anpr.c) == null) {
                                        anpn4 = anpn.a;
                                    }
                                    aotp aotp8;
                                    if ((aotp8 = anpn4.c) == null) {
                                        aotp8 = aotp.a;
                                    }
                                    final afeq afeq = this.b(q, simpleName9, aotp8);
                                    return (List)afeq;
                                }
                                else if ((g & 0x40) != 0x0) {
                                    if ((0x400L & q) == 0x0L) {
                                        final afeq afeq = afeq.q();
                                        return (List)afeq;
                                    }
                                    anps anps;
                                    if ((anps = alkh.af) == null) {
                                        anps = anps.a;
                                    }
                                    final String simpleName10 = anps.getClass().getSimpleName();
                                    anpn anpn5;
                                    if ((anpn5 = anps.c) == null) {
                                        anpn5 = anpn.a;
                                    }
                                    aotp aotp9;
                                    if ((aotp9 = anpn5.c) == null) {
                                        aotp9 = aotp.a;
                                    }
                                    final afeq afeq = this.b(q, simpleName10, aotp9);
                                    return (List)afeq;
                                }
                                else if ((f & 0x40000000) != 0x0) {
                                    if ((0x800L & q) == 0x0L) {
                                        final afeq afeq = afeq.q();
                                        return (List)afeq;
                                    }
                                    anpx anpx;
                                    if ((anpx = alkh.Y) == null) {
                                        anpx = anpx.a;
                                    }
                                    final String simpleName11 = anpx.getClass().getSimpleName();
                                    anpm anpm3;
                                    if ((anpm3 = anpx.c) == null) {
                                        anpm3 = anpm.a;
                                    }
                                    aotp aotp10;
                                    if ((aotp10 = anpm3.c) == null) {
                                        aotp10 = aotp.a;
                                    }
                                    final afeq afeq = this.b(q, simpleName11, aotp10);
                                    return (List)afeq;
                                }
                                else if ((g & 0x1) != 0x0) {
                                    if ((0x1000L & q) == 0x0L) {
                                        final afeq afeq = afeq.q();
                                        return (List)afeq;
                                    }
                                    anpz anpz;
                                    if ((anpz = alkh.aa) == null) {
                                        anpz = anpz.a;
                                    }
                                    final String simpleName12 = anpz.getClass().getSimpleName();
                                    anpm anpm4;
                                    if ((anpm4 = anpz.c) == null) {
                                        anpm4 = anpm.a;
                                    }
                                    aotp aotp11;
                                    if ((aotp11 = anpm4.c) == null) {
                                        aotp11 = aotp.a;
                                    }
                                    final afeq afeq = this.b(q, simpleName12, aotp11);
                                    return (List)afeq;
                                }
                                else if ((g & 0x2) != 0x0) {
                                    if ((0x2000L & q) == 0x0L) {
                                        final afeq afeq = afeq.q();
                                        return (List)afeq;
                                    }
                                    anqb anqb;
                                    if ((anqb = alkh.ab) == null) {
                                        anqb = anqb.a;
                                    }
                                    final String simpleName13 = anqb.getClass().getSimpleName();
                                    anqa anqa;
                                    if ((anqa = anqb.c) == null) {
                                        anqa = anqa.a;
                                    }
                                    aotp aotp12;
                                    if ((aotp12 = anqa.c) == null) {
                                        aotp12 = aotp.a;
                                    }
                                    final afeq afeq = this.b(q, simpleName13, aotp12);
                                    return (List)afeq;
                                }
                                else {
                                    if ((d2 & 0x400) == 0x0) {
                                        if ((q & 0x40L) != 0x0L) {
                                            final MessageLite j = vxg.j(alkh);
                                            String simpleName14;
                                            if (j == null) {
                                                simpleName14 = "EmptyContainer";
                                            }
                                            else {
                                                simpleName14 = j.getClass().getSimpleName();
                                            }
                                            final aict a8 = aicu.a();
                                            ((ahaz)a8).copyOnWrite();
                                            aicu.d((aicu)a8.instance, 0);
                                            ((ahaz)a8).copyOnWrite();
                                            aicu.e((aicu)a8.instance, simpleName14);
                                            ((ahaz)a8).copyOnWrite();
                                            aicu.f((aicu)a8.instance, false);
                                            final aicu aicu = (aicu)((ahaz)a8).build();
                                            final wxx wxx = (wxx)this.b.a();
                                            final aknr d3 = aknt.d();
                                            ((ahaz)d3).copyOnWrite();
                                            aknt.A((aknt)d3.instance, aicu);
                                            wxx.d((aknt)((ahaz)d3).build());
                                        }
                                        final afeq afeq = afeq.q();
                                        return (List)afeq;
                                    }
                                    if ((0x4000L & q) == 0x0L) {
                                        final afeq afeq = afeq.q();
                                        return (List)afeq;
                                    }
                                    anqp anqp;
                                    if ((anqp = alkh.N) == null) {
                                        anqp = anqp.a;
                                    }
                                    final String simpleName15 = anqp.getClass().getSimpleName();
                                    aotp aotp13;
                                    if ((aotp13 = anqp.c) == null) {
                                        aotp13 = aotp.a;
                                    }
                                    final afeq afeq = this.b(q, simpleName15, aotp13);
                                    return (List)afeq;
                                }
                            }
                        }
                    }
                }
                final afeq afeq = afeq.q();
                return (List)afeq;
            }
        }
        final afeq afeq = afeq.q();
        return (List)afeq;
    }
}
