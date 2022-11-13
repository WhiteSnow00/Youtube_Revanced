import java.util.Map;
import android.text.TextUtils;
import java.util.Collection;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ceh implements DialogInterface$OnClickListener
{
    public final Object a;
    private final int b;
    
    public ceh(final aaiq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ceh(final aaiq a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public ceh(final aair a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ceh(final cei a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ceh(final eyd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ceh(final gfg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ceh(final gyo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ceh(final hcd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ceh(final hgg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ceh(final hlj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ceh(final hts a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ceh(final huc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ceh(final hun a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ceh(final hxi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ceh(final hyb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ceh(final ifr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ceh(final ifr a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public ceh(final tc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ceh(final wyw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onClick(final DialogInterface dialogInterface, int a) {
        final int b = this.b;
        final aaat aaat = null;
        switch (b) {
            default: {
                final aaip n = ((ifr)this.a).n;
                if (n != null) {
                    n.a();
                    return;
                }
                break;
            }
            case 19: {
                ((aaiq)this.a).b();
                return;
            }
            case 18: {
                ((aaiq)this.a).b();
                return;
            }
            case 17: {
                ((aair)this.a).a();
                return;
            }
            case 16: {
                final acxl t = ((ifr)this.a).t;
                if (t != null) {
                    if (a != 0) {
                        if (a == 1) {
                            ((aahn)t.b).i((String)t.a);
                        }
                    }
                    else {
                        if (!((aahn)t.b).c.o()) {
                            ((aahn)t.b).d.b();
                            return;
                        }
                        final aahn aahn = (aahn)t.b;
                        final aahv e = aahn.e;
                        final Object a2 = t.a;
                        final long t2 = aahn.f.t();
                        final int a3 = ((aahn)t.b).a();
                        a = e.a();
                        Label_0739: {
                            if (e.b.p() && e.b.b.f(45358948L) && a3 != 0 && a != 0) {
                                try {
                                    final ahaz builder = ((ahbh)amul.a).createBuilder();
                                    builder.copyOnWrite();
                                    final amul amul = (amul)builder.instance;
                                    amul.c = 3;
                                    amul.b |= 0x1;
                                    final String h = vgl.h(a3, (String)a2);
                                    builder.copyOnWrite();
                                    final amul amul2 = (amul)builder.instance;
                                    h.getClass();
                                    amul2.b |= 0x2;
                                    amul2.d = h;
                                    final ahbb ahbb = (ahbb)((ahbh)amuj.b).createBuilder();
                                    final int j = fex.j(306, 4, 2);
                                    ((ahaz)ahbb).copyOnWrite();
                                    final amuj amuj = (amuj)ahbb.instance;
                                    amuj.c |= 0x1;
                                    amuj.d = j;
                                    final ahbf b2 = alzg.b;
                                    final ahaz builder2 = ((ahbh)alzg.a).createBuilder();
                                    builder2.copyOnWrite();
                                    final alzg alzg = (alzg)builder2.instance;
                                    alzg.c |= 0x20;
                                    alzg.i = false;
                                    builder2.copyOnWrite();
                                    alzg.a((alzg)builder2.instance);
                                    ahbb.e((ahaq)b2, (Object)builder2.build());
                                    final amuj e2 = (amuj)((ahaz)ahbb).build();
                                    builder.copyOnWrite();
                                    final amul amul3 = (amul)builder.instance;
                                    e2.getClass();
                                    amul3.e = e2;
                                    amul3.b |= 0x4;
                                    final amul amul4 = (amul)builder.build();
                                    final aaeh a4 = e.d.a();
                                    final zvo b3 = a4.B();
                                    aaat s = aaat;
                                    if (b3 != null) {
                                        s = b3.s((String)a2);
                                    }
                                    afeq afeq;
                                    if (s != null) {
                                        afeq = afeq.o((Collection)s.b);
                                    }
                                    else {
                                        afeq = afeq.q();
                                    }
                                    zxf.c(amul4, afeq, e.a.a(amul4), e.c, a4, a);
                                    break Label_0739;
                                }
                                catch (final aach aach) {
                                    ttr.f("[Offline]", "Couldn't refresh playlist through orchestration: ".concat((String)a2), (Throwable)aach);
                                    return;
                                }
                            }
                            if (!e.d.a().i().F((String)a2, t2)) {
                                return;
                            }
                        }
                        ((aahn)t.b).e(2132019923);
                    }
                }
                return;
            }
            case 15: {
                final aair p2 = ((ifr)this.a).p;
                if (p2 != null) {
                    p2.a();
                }
                return;
            }
            case 14: {
                final hyb hyb = (hyb)this.a;
                final String string = hyb.ar.getText().toString();
                if (TextUtils.equals((CharSequence)hyb.ao, (CharSequence)string)) {
                    return;
                }
                hyb.aP(string);
                return;
            }
            case 13: {
                ((hyb)this.a).dismiss();
                return;
            }
            case 12: {
                ((hxi)this.a).r((zpf)new fch(this, 9, (byte[])null));
                dialogInterface.dismiss();
                return;
            }
            case 11: {
                final hun hun = (hun)this.a;
                hun.z = null;
                if (hun.B.isEmpty()) {
                    hun.d();
                    return;
                }
                dialogInterface.dismiss();
                return;
            }
            case 10: {
                ((huc)this.a).C();
                return;
            }
            case 9: {
                final Object a5 = this.a;
                dialogInterface.dismiss();
                final hts hts = (hts)a5;
                hts.a.i();
                hts.e();
                return;
            }
            case 8: {
                ((hlj)this.a).c.a = true;
                return;
            }
            case 7: {
                ((hgg)this.a).aM();
                return;
            }
            case 6: {
                final Object a6 = this.a;
                final afeq a7 = hcd.a;
                if (a6 != null) {
                    ((wyw)a6).J(3, (wzz)new wyt(xaa.c(31570)), (alhi)null);
                }
                return;
            }
            case 5: {
                final hcd hcd = (hcd)this.a;
                hcd.au.J(hcc.a(hcd.as));
                final ucd b4 = hcd.aj.b();
                if (ucd.ae(b4) && ucd.ad(b4)) {
                    final ubu aj = hcd.aj;
                    final ucd b5 = aj.b();
                    if (b5 != null) {
                        aj.k(6, b5.p, b5.aa());
                    }
                    hcd.ag.a(aeea.cE(hcd.r(), hcd.c, 135958));
                }
                else {
                    final ubu aj2 = hcd.aj;
                    final ucd b6 = aj2.b();
                    if (b6 != null) {
                        aj2.k(5, b6.p, b6.aa());
                    }
                    final gwh gwh = (gwh)hcd.og().f("cameraFragment");
                    if (gwh != null) {
                        gwh.a().g();
                    }
                    hcd.ai.J(3, (wzz)new wyt(xaa.c(135958)), (alhi)null);
                    if (!(hcd.og().e(2131430847) instanceof gwh)) {
                        final uby uby = (uby)b4;
                        if (uby != null && !uby.W()) {
                            uby.D();
                        }
                        hcd.p(-1, true, aeea.cE(hcd.r(), hcd.as, 135958));
                    }
                }
                hcd.at = null;
                hcd.aN();
                return;
            }
            case 4: {
                ((gyo)this.a).h();
                return;
            }
            case 3: {
                if (((gfg)this.a).d.isChecked()) {
                    ((gfg)this.a).c.c(2);
                    ((gfg)this.a).h.J(3, (wzz)new wyt(xaa.c(35087)), (alhi)null);
                    return;
                }
                if (((gfg)this.a).e.isChecked()) {
                    ((gfg)this.a).c.c(1);
                    ((gfg)this.a).h.J(3, (wzz)new wyt(xaa.c(35088)), (alhi)null);
                    return;
                }
                if (((gfg)this.a).f.isChecked()) {
                    ((gfg)this.a).c.c(0);
                    ((gfg)this.a).h.J(3, (wzz)new wyt(xaa.c(35086)), (alhi)null);
                }
                return;
            }
            case 2: {
                final eyd eyd = (eyd)this.a;
                final aiko e3 = eyd.e;
                if ((e3.b & 0x40) != 0x0) {
                    final vcy c = eyd.c;
                    aiqj aiqj;
                    if ((aiqj = e3.i) == null) {
                        aiqj = aiqj.a;
                    }
                    c.c(aiqj, (Map)null);
                }
                return;
            }
            case 1: {
                ((tc)this.a).ag.l(true);
                return;
            }
            case 0: {
                final Object a8 = this.a;
                ((cei)a8).ae = a;
                ((ces)a8).ai = -1;
                dialogInterface.dismiss();
                break;
            }
        }
    }
}
