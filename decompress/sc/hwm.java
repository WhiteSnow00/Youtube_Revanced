import java.util.List;
import j$.util.Optional;
import java.util.Set;
import com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hwm
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    
    public hwm(final Context a, final tqd b, final ksi c, final gbo d, final MealbarPromoController e, final wyv f, final acwn g, final vcy h, final glf k, final fjt fjt, final Set j, final kuf b2, final tbh n, final actt l, final aeea m, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = fjt;
        this.j = j;
        this.k = k;
        this.n = n;
        this.l = l;
        this.m = m;
        k.b = b2;
        k.c = fjt;
    }
    
    public hwm(final atke j, final atke c, final atke k, final atke e, final atke a, final atke b, final atke i, final atke n, final atke l, final atke h, final atke g, final atke m, final atke f, final atke d) {
        j.getClass();
        this.j = j;
        c.getClass();
        this.c = c;
        this.k = k;
        e.getClass();
        this.e = e;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        i.getClass();
        this.i = i;
        n.getClass();
        this.n = n;
        l.getClass();
        this.l = l;
        h.getClass();
        this.h = h;
        g.getClass();
        this.g = g;
        this.m = m;
        this.f = f;
        d.getClass();
        this.d = d;
    }
    
    public static Optional a(final akhz akhz) {
        akhw akhw;
        if ((akhw = akhz.h) == null) {
            akhw = akhw.a;
        }
        if (akhw.b == 152873793) {
            akhw akhw2;
            if ((akhw2 = akhz.h) == null) {
                akhw2 = akhw.a;
            }
            aovi a;
            if (akhw2.b == 152873793) {
                a = (aovi)akhw2.c;
            }
            else {
                a = aovi.a;
            }
            return Optional.of((Object)a);
        }
        return Optional.empty();
    }
    
    public final void b(final akhz akhz) {
        final Optional a = a(akhz);
        if (!a.isEmpty()) {
            final String a2 = glb.a(a.get());
            ((Set<String>)this.j).add(a2);
            final Object g = this.g;
            final aovi aovi = (aovi)a.get();
            final etr etr = new etr(this, 8);
            final boolean equals = a2.equals("music_app_button");
            boolean b = false;
            if (!equals) {
                b = b;
                if (!a2.equals("youtube_originals_button")) {
                    b = true;
                }
            }
            ((acwn)g).f(aovi, (aezs)etr, b);
        }
        if (!((fjt)this.i).k()) {
            akhw akhw;
            if ((akhw = akhz.h) == null) {
                akhw = akhw.a;
            }
            if (akhw.b == 86135402) {
                final Object c = this.c;
                akhw akhw2;
                if ((akhw2 = akhz.h) == null) {
                    akhw2 = akhw.a;
                }
                aljh a3;
                if (akhw2.b == 86135402) {
                    a3 = (aljh)akhw2.c;
                }
                else {
                    a3 = aljh.a;
                }
                final ksi ksi = (ksi)c;
                ksi.e();
                ksi.c.a(a3);
                ksi.a.b((fxg)ksi.c);
                return;
            }
            akib akib;
            if ((akib = akhz.g) == null) {
                akib = akib.a;
            }
            aopp a4;
            if (akib.b == 84469052) {
                a4 = (aopp)akib.c;
            }
            else {
                a4 = aopp.a;
            }
            if ((a4.b & 0x10) != 0x0) {
                final Object d = this.d;
                akib akib2;
                if ((akib2 = akhz.g) == null) {
                    akib2 = akib.a;
                }
                aopp a5;
                if (akib2.b == 84469052) {
                    a5 = (aopp)akib2.c;
                }
                else {
                    a5 = aopp.a;
                }
                aopo aopo;
                if ((aopo = a5.c) == null) {
                    aopo = aopo.a;
                }
                ((gbo)d).q(aopo);
                return;
            }
            final akib g2 = akhz.g;
            akib a6;
            if (g2 == null) {
                a6 = akib.a;
            }
            else {
                a6 = g2;
            }
            if (a6.b == 364669234) {
                akib a7;
                if ((a7 = g2) == null) {
                    a7 = akib.a;
                }
                aiql a8;
                if (a7.b == 364669234) {
                    a8 = (aiql)a7.c;
                }
                else {
                    a8 = aiql.a;
                }
                if ((a8.b & 0x1) != 0x0) {
                    final Object h = this.h;
                    aiqj aiqj;
                    if ((aiqj = a8.c) == null) {
                        aiqj = aiqj.a;
                    }
                    ((vcy)h).a(aiqj);
                    return;
                }
            }
            final akhw h2 = akhz.h;
            akhw a9;
            if (h2 == null) {
                a9 = akhw.a;
            }
            else {
                a9 = h2;
            }
            if (a9.b == 96907215) {
                final Object e = this.e;
                akhw a10;
                if ((a10 = h2) == null) {
                    a10 = akhw.a;
                }
                amfo a11;
                if (a10.b == 96907215) {
                    a11 = (amfo)a10.c;
                }
                else {
                    a11 = amfo.a;
                }
                ((MealbarPromoController)e).k(a11, ((wyv)this.f).pF());
                return;
            }
            akhw a12;
            if (h2 == null) {
                a12 = akhw.a;
            }
            else {
                a12 = h2;
            }
            if (a12.b == 64099105) {
                final Object a13 = this.a;
                akhw a14;
                if ((a14 = h2) == null) {
                    a14 = akhw.a;
                }
                aixf a15;
                if (a14.b == 64099105) {
                    a15 = (aixf)a14.c;
                }
                else {
                    a15 = aixf.a;
                }
                acax.h((Context)a13, a15, (vcy)this.h, ((wyv)this.f).pF(), (Object)null, (aeea)this.m);
                return;
            }
            akhw a16;
            if (h2 == null) {
                a16 = akhw.a;
            }
            else {
                a16 = h2;
            }
            if (a16.b == 182224395) {
                akhw a17;
                if ((a17 = h2) == null) {
                    a17 = akhw.a;
                }
                aiqm a18;
                if (a17.b == 182224395) {
                    a18 = (aiqm)a17.c;
                }
                else {
                    a18 = aiqm.a;
                }
                if (((actt)this.l).c((List)a18.g)) {
                    final int b2 = a18.b;
                    if ((b2 & 0x1) != 0x0) {
                        final Object h3 = this.h;
                        aiqj aiqj2;
                        if ((aiqj2 = a18.c) == null) {
                            aiqj2 = aiqj.a;
                        }
                        ((vcy)h3).a(aiqj2);
                    }
                    else if ((b2 & 0x2) != 0x0) {
                        final Object h4 = this.h;
                        aiqj aiqj3;
                        if ((aiqj3 = a18.d) == null) {
                            aiqj3 = aiqj.a;
                        }
                        ((vcy)h4).a(aiqj3);
                        ((wyv)this.f).pF().t((wzz)new wyt(a18.f), (alhi)null);
                    }
                    ((actt)this.l).a((List)a18.g);
                    return;
                }
            }
            akhw akhw3;
            if ((akhw3 = akhz.h) == null) {
                akhw3 = akhw.a;
            }
            ajvp a19;
            if (akhw3.b == 162801955) {
                a19 = (ajvp)akhw3.c;
            }
            else {
                a19 = ajvp.a;
            }
            this.c(a19);
        }
    }
    
    public final boolean c(final ajvp ajvp) {
        if (ajvp != null && (ajvp.b & 0x1) != 0x0) {
            ((szk)this.k).e((Object)ajvp);
            return true;
        }
        return false;
    }
}
