import java.util.Iterator;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esi implements tge
{
    public final Object a;
    private final int b;
    
    public esi(final adht a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esi(final esm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esi(final fvx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esi(final rqz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esi(final sor a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esi(final vlk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esi(final vzo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esi(final zkb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void lT(final Object o) {
        switch (this.b) {
            default: {
                ((adht)this.a).b((adhn)o);
                return;
            }
            case 12: {
                ((adhu)((adht)this.a).d.a()).a(((adhm)o).a());
                return;
            }
            case 11: {
                final Object a = this.a;
                final adhl adhl = (adhl)o;
                final adhu adhu = (adhu)((adht)a).d.a();
                adhl.b();
                adhu.b(adhl.a());
                return;
            }
            case 10: {
                final Object a2 = this.a;
                final zmu zmu = (zmu)o;
                ((zkb)a2).s();
                return;
            }
            case 9: {
                final Object a3 = this.a;
                final zms zms = (zms)o;
                ((zkb)a3).s();
                return;
            }
            case 8: {
                final Object a4 = this.a;
                final aant aant = (aant)o;
                final vzo vzo = (vzo)a4;
                if (!vzo.n.V()) {
                    final long e = aant.e();
                    vzo.r = e;
                    final vyp c = vzo.c;
                    if (c instanceof vyr) {
                        ((vyr)c).g(e);
                    }
                }
                return;
            }
            case 7: {
                final Object a5 = this.a;
                final zmu zmu2 = (zmu)o;
                ((vlk)a5).t();
                return;
            }
            case 6: {
                final Object a6 = this.a;
                final zms zms2 = (zms)o;
                ((vlk)a6).s();
                return;
            }
            case 5: {
                final Object a7 = this.a;
                final uzq uzq = (uzq)o;
                if ((uzq.a().b & 0x40) != 0x0) {
                    ajmo ajmo;
                    if ((ajmo = uzq.a().i) == null) {
                        ajmo = ajmo.a;
                    }
                    final sor sor = (sor)a7;
                    sor.a.D((wzz)new wyt(ajmo.e.I()));
                    sor.A(ajmo);
                    return;
                }
                if ((uzq.a().b & 0x4) != 0x0) {
                    aitc aitc;
                    if ((aitc = uzq.a().e) == null) {
                        aitc = aitc.a;
                    }
                    final sor sor2 = (sor)a7;
                    sor2.a.D((wzz)new wyt(aitc.e.I()));
                    sor2.z(aitc);
                }
                return;
            }
            case 4: {
                final Object a8 = this.a;
                final uzl uzl = (uzl)o;
                ((acqa)a8).lG(uzl.b(), uzl.a());
                return;
            }
            case 3: {
                final Object a9 = this.a;
                final sba sba = (sba)o;
                final Iterator iterator = ((rqz)a9).d.iterator();
                while (iterator.hasNext()) {
                    ((ska)iterator.next()).m(sba);
                }
                return;
            }
            case 2: {
                ((fvx)this.a).b((aant)o);
                return;
            }
            case 1: {
                final Object a10 = this.a;
                final zms zms3 = (zms)o;
                final esm esm = (esm)a10;
                ((dax)esm.bH.a()).b();
                ((zsg)esm.F.a()).b(zsf.a);
                ((acyi)esm.G.a()).b();
                ((acyl)esm.H.a()).b();
                esm.a.execute(aeun.h((Runnable)new ese(esm, 1)));
                return;
            }
            case 0: {
                final Object a11 = this.a;
                final zmu zmu3 = (zmu)o;
                final esm esm2 = (esm)a11;
                ((dax)esm2.bH.a()).b();
                ((zsg)esm2.F.a()).b(zsf.a);
                ((acyi)esm2.G.a()).b();
                ((acyl)esm2.H.a()).b();
                zvf.f((Context)esm2.h);
                esm2.a.execute(aeun.h((Runnable)new erw(esm2, 19)));
            }
        }
    }
}
