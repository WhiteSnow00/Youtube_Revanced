import java.util.Map;
import android.text.TextUtils;
import java.util.Collection;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cek implements DialogInterface$OnClickListener
{
    public final Object a;
    private final int b;
    
    public cek(final aakp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cek(final aakp a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public cek(final aakq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cek(final cel a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cek(final eyg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cek(final gfl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cek(final gyw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cek(final hcl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cek(final hgo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cek(final hlr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cek(final hub a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cek(final hul a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cek(final huv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cek(final hxq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cek(final hyh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cek(final ifz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cek(final ifz a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public cek(final td a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cek(final xab a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onClick(final DialogInterface dialogInterface, int a) {
        final int b = this.b;
        final aacq aacq = null;
        switch (b) {
            default: {
                final aako n = ((ifz)this.a).n;
                if (n != null) {
                    n.a();
                    return;
                }
                break;
            }
            case 19: {
                ((aakp)this.a).b();
                return;
            }
            case 18: {
                ((aakp)this.a).b();
                return;
            }
            case 17: {
                ((aakq)this.a).a();
                return;
            }
            case 16: {
                final acyy t = ((ifz)this.a).t;
                if (t != null) {
                    if (a != 0) {
                        if (a == 1) {
                            ((aajm)t.b).i((String)t.a);
                        }
                    }
                    else {
                        if (!((aajm)t.b).c.o()) {
                            ((aajm)t.b).d.b();
                            return;
                        }
                        final aajm aajm = (aajm)t.b;
                        final aaju e = aajm.e;
                        final Object a2 = t.a;
                        final long t2 = aajm.f.t();
                        final int a3 = ((aajm)t.b).a();
                        a = e.a();
                        Label_0739: {
                            if (e.b.p() && e.b.b.f(45358948L) && a3 != 0 && a != 0) {
                                try {
                                    final ahcr builder = ((ahcz)amwq.a).createBuilder();
                                    builder.copyOnWrite();
                                    final amwq amwq = (amwq)builder.instance;
                                    amwq.c = 3;
                                    amwq.b |= 0x1;
                                    final String h = vht.h(a3, (String)a2);
                                    builder.copyOnWrite();
                                    final amwq amwq2 = (amwq)builder.instance;
                                    h.getClass();
                                    amwq2.b |= 0x2;
                                    amwq2.d = h;
                                    final ahct ahct = (ahct)((ahcz)amwo.b).createBuilder();
                                    final int v = ffa.v(306, 4, 2);
                                    ((ahcr)ahct).copyOnWrite();
                                    final amwo amwo = (amwo)ahct.instance;
                                    amwo.c |= 0x1;
                                    amwo.d = v;
                                    final ahcx b2 = ambg.b;
                                    final ahcr builder2 = ambg.a.createBuilder();
                                    builder2.copyOnWrite();
                                    final ambg ambg = (ambg)builder2.instance;
                                    ambg.c |= 0x20;
                                    ambg.i = false;
                                    builder2.copyOnWrite();
                                    ambg.a((ambg)builder2.instance);
                                    ahct.e((ahci)b2, (Object)builder2.build());
                                    final amwo e2 = (amwo)((ahcr)ahct).build();
                                    builder.copyOnWrite();
                                    final amwq amwq3 = (amwq)builder.instance;
                                    e2.getClass();
                                    amwq3.e = e2;
                                    amwq3.b |= 0x4;
                                    final amwq amwq4 = (amwq)builder.build();
                                    final aage a4 = e.d.a();
                                    final zxm b3 = a4.B();
                                    aacq s = aacq;
                                    if (b3 != null) {
                                        s = b3.s((String)a2);
                                    }
                                    afgh afgh;
                                    if (s != null) {
                                        afgh = afgh.o(s.b);
                                    }
                                    else {
                                        afgh = afgh.q();
                                    }
                                    zzc.f(amwq4, afgh, e.a.a(amwq4), e.c, a4, a);
                                    break Label_0739;
                                }
                                catch (final aaee aaee) {
                                    tut.f("[Offline]", "Couldn't refresh playlist through orchestration: ".concat((String)a2), (Throwable)aaee);
                                    return;
                                }
                            }
                            if (!e.d.a().i().F((String)a2, t2)) {
                                return;
                            }
                        }
                        ((aajm)t.b).e(2132019926);
                    }
                }
                return;
            }
            case 15: {
                final aakq p2 = ((ifz)this.a).p;
                if (p2 != null) {
                    p2.a();
                }
                return;
            }
            case 14: {
                final hyh hyh = (hyh)this.a;
                final String string = hyh.ar.getText().toString();
                if (TextUtils.equals((CharSequence)hyh.ao, (CharSequence)string)) {
                    return;
                }
                hyh.aP(string);
                return;
            }
            case 13: {
                ((hyh)this.a).dismiss();
                return;
            }
            case 12: {
                ((hxq)this.a).r((zrb)new fck(this, 9, (byte[])null));
                dialogInterface.dismiss();
                return;
            }
            case 11: {
                final huv huv = (huv)this.a;
                huv.z = null;
                if (huv.B.isEmpty()) {
                    huv.d();
                    return;
                }
                dialogInterface.dismiss();
                return;
            }
            case 10: {
                ((hul)this.a).C();
                return;
            }
            case 9: {
                final Object a5 = this.a;
                dialogInterface.dismiss();
                final hub hub = (hub)a5;
                hub.a.i();
                hub.e();
                return;
            }
            case 8: {
                ((hlr)this.a).c.a = true;
                return;
            }
            case 7: {
                ((hgo)this.a).aM();
                return;
            }
            case 6: {
                final hcl hcl = (hcl)this.a;
                hcl.au.J(hej.c(hcl.as));
                final udj c = hcl.aj.c();
                if (udj.af(c) && udj.ae(c)) {
                    final uda aj = hcl.aj;
                    final udj c2 = aj.c();
                    if (c2 != null) {
                        aj.l(6, c2.q, c2.ab());
                    }
                    hcl.ag.a(aefs.cn(hcl.r(), hcl.c, 135958));
                }
                else {
                    final uda aj2 = hcl.aj;
                    final udj c3 = aj2.c();
                    if (c3 != null) {
                        aj2.l(5, c3.q, c3.ab());
                    }
                    final gws gws = (gws)hcl.oc().f("cameraFragment");
                    if (gws != null) {
                        gws.a().g();
                    }
                    hcl.ai.J(3, (xbe)new wzy(xbf.c(135958)), (alji)null);
                    if (!(hcl.oc().e(2131430847) instanceof gws)) {
                        final ude ude = (ude)c;
                        if (ude != null && !ude.X()) {
                            ude.E();
                        }
                        hcl.p(-1, true, aefs.cn(hcl.r(), hcl.as, 135958));
                    }
                }
                hcl.at = null;
                hcl.aN();
                return;
            }
            case 5: {
                final Object a6 = this.a;
                final afgh a7 = hcl.a;
                if (a6 != null) {
                    ((xab)a6).J(3, (xbe)new wzy(xbf.c(31570)), (alji)null);
                }
                return;
            }
            case 4: {
                ((gyw)this.a).h();
                return;
            }
            case 3: {
                if (((gfl)this.a).d.isChecked()) {
                    ((gfl)this.a).c.c(2);
                    ((gfl)this.a).h.J(3, (xbe)new wzy(xbf.c(35087)), (alji)null);
                    return;
                }
                if (((gfl)this.a).e.isChecked()) {
                    ((gfl)this.a).c.c(1);
                    ((gfl)this.a).h.J(3, (xbe)new wzy(xbf.c(35088)), (alji)null);
                    return;
                }
                if (((gfl)this.a).f.isChecked()) {
                    ((gfl)this.a).c.c(0);
                    ((gfl)this.a).h.J(3, (xbe)new wzy(xbf.c(35086)), (alji)null);
                }
                return;
            }
            case 2: {
                final eyg eyg = (eyg)this.a;
                final aimh e3 = eyg.e;
                if ((e3.b & 0x40) != 0x0) {
                    final veh c4 = eyg.c;
                    aisc aisc;
                    if ((aisc = e3.i) == null) {
                        aisc = aisc.a;
                    }
                    c4.c(aisc, (Map)null);
                }
                return;
            }
            case 1: {
                ((td)this.a).ag.l(true);
                return;
            }
            case 0: {
                final Object a8 = this.a;
                ((cel)a8).ae = a;
                ((cev)a8).ai = -1;
                dialogInterface.dismiss();
                break;
            }
        }
    }
}
