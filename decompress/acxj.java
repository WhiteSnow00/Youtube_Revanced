import android.util.Pair;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;
import android.content.Context;
import android.view.View;
import java.lang.ref.Reference;
import java.util.HashMap;
import java.util.HashSet;
import java.lang.ref.ReferenceQueue;
import java.util.Map;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acxj implements acxk
{
    public final veh a;
    public final boolean b;
    public final Set c;
    public final Map d;
    public final ReferenceQueue e;
    public final gab f;
    private final acxv g;
    
    public acxj(final acxv g, final veh a, final gab f, final vbo vbo, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        f.getClass();
        this.f = f;
        a.getClass();
        this.a = a;
        g.getClass();
        this.g = g;
        boolean b = false;
        if (vbo != null) {
            alzp alzp;
            if ((alzp = vbo.b().e) == null) {
                alzp = alzp.a;
            }
            b = b;
            if (alzp.aK) {
                b = true;
            }
        }
        this.b = b;
        this.c = new HashSet();
        this.d = new HashMap();
        this.e = new ReferenceQueue();
    }
    
    private static aies g(final akdj akdj) {
        final aisc aisc = null;
        if (akdj == null) {
            return null;
        }
        final ahct ahct = (ahct)((ahcz)aies.a).createBuilder();
        ajws i;
        if ((i = akdj.f) == null) {
            i = ajws.a;
        }
        ((ahcr)ahct).copyOnWrite();
        final aies aies = (aies)ahct.instance;
        i.getClass();
        aies.i = i;
        aies.b |= 0x200;
        final boolean d = akdj.d;
        ((ahcr)ahct).copyOnWrite();
        final aies aies2 = (aies)ahct.instance;
        aies2.b |= 0x40;
        aies2.h = d;
        akfj g;
        if ((g = akdj.e) == null) {
            g = akfj.a;
        }
        ((ahcr)ahct).copyOnWrite();
        final aies aies3 = (aies)ahct.instance;
        g.getClass();
        aies3.g = g;
        aies3.b |= 0x20;
        final int b = akdj.b;
        final int n = 16;
        aisc n2;
        if ((b & 0x10) != 0x0) {
            if ((n2 = akdj.g) == null) {
                n2 = aisc.a;
            }
        }
        else {
            n2 = null;
        }
        if (n2 != null) {
            ((ahcr)ahct).copyOnWrite();
            final aies aies4 = (aies)ahct.instance;
            aies4.n = n2;
            aies4.b |= 0x4000;
        }
        aisc o = aisc;
        if ((akdj.b & 0x20) != 0x0 && (o = akdj.h) == null) {
            o = aisc.a;
        }
        if (o != null) {
            ((ahcr)ahct).copyOnWrite();
            final aies aies5 = (aies)ahct.instance;
            aies5.o = o;
            aies5.b |= 0x8000;
        }
        ahkc t;
        if ((t = akdj.i) == null) {
            t = ahkc.a;
        }
        ((ahcr)ahct).copyOnWrite();
        final aies aies6 = (aies)ahct.instance;
        t.getClass();
        aies6.t = t;
        aies6.b |= 0x100000;
        final ahbt j = akdj.j;
        ((ahcr)ahct).copyOnWrite();
        final aies aies7 = (aies)ahct.instance;
        j.getClass();
        aies7.b |= 0x800000;
        aies7.w = j;
        int n3 = n;
        if ((akdj.b & 0x1) != 0x0) {
            akdk akdk;
            if ((akdk = akdj.c) == null) {
                akdk = akdk.a;
            }
            final int bi = adzw.bI(akdk.b);
            if (bi == 0) {
                n3 = n;
            }
            else {
                n3 = n;
                if (bi == 2) {
                    n3 = 14;
                }
            }
        }
        ((ahcr)ahct).copyOnWrite();
        final aies aies8 = (aies)ahct.instance;
        aies8.d = n3 - 1;
        aies8.c = 1;
        return (aies)((ahcr)ahct).build();
    }
    
    public final void a() {
        while (true) {
            final Reference poll = this.e.poll();
            if (poll != null) {
                synchronized (this.e) {
                    this.d.remove(((acxz)poll).a);
                    continue;
                }
                break;
            }
            break;
        }
    }
    
    @Override
    public final void b(final akdp akdp, final View view, final Object o, final xab xab) {
        this.e(akdp, view, o, xab, this.b, false, null);
    }
    
    @Override
    public final void c(final akdp akdp, final View view, final Object o, final xab xab, final acxb acxb) {
        this.e(akdp, view, o, xab, this.b, false, acxb);
    }
    
    public final void d(final akdp akdp, final View a, final Object o, final xab xab, final boolean b, final boolean b2, final acxb acxb) {
        final acxv g = this.g;
        final acxi f = new acxi(this, acxb, akdp, o, xab, b2);
        final acxw a2 = g.a();
        a2.a = a;
        akdq akdq;
        if ((akdq = akdp.h) == null) {
            akdq = akdq.a;
        }
        int n = 0;
        Label_0137: {
            Label_0061: {
                if (akdq != null) {
                    int bf;
                    if ((bf = adzw.bF(akdq.c)) == 0) {
                        bf = 1;
                    }
                    if (--bf != 2) {
                        if (bf != 3) {
                            if (bf != 4) {
                                break Label_0061;
                            }
                            if (b) {
                                n = 4;
                                break Label_0137;
                            }
                        }
                        else if (b) {
                            n = 3;
                            break Label_0137;
                        }
                    }
                    n = 2;
                    break Label_0137;
                }
            }
            n = 1;
        }
        a2.m(n);
        a2.f(2);
        a2.f = f;
        int bg;
        if ((akdp.b & 0x4) != 0x0) {
            akdn akdn;
            if ((akdn = akdp.e) == null) {
                akdn = akdn.a;
            }
            if ((bg = adzw.bG(akdn.b)) == 0) {
                bg = 1;
            }
        }
        else {
            bg = 2;
        }
        int n2;
        if (bg == 3) {
            n2 = 0;
        }
        else {
            n2 = 1;
        }
        a2.o(n2);
        int n3;
        if (bg == 2) {
            n3 = -2;
        }
        else {
            n3 = (int)akdp.f;
        }
        a2.k(n3);
        final int b3 = akdp.b;
        final akdj akdj = null;
        akdi a3;
        if ((b3 & 0x2) != 0x0) {
            akdm akdm;
            if ((akdm = akdp.d) == null) {
                akdm = akdm.a;
            }
            if (akdm.b == 106514900) {
                a3 = (akdi)akdm.c;
            }
            else {
                a3 = akdi.a;
            }
        }
        else {
            a3 = null;
        }
        if (a3 != null) {
            a2.h(true ^ a3.e);
            ajws ajws;
            if ((a3.b & 0x2) != 0x0) {
                if ((ajws = a3.f) == null) {
                    ajws = ajws.a;
                }
            }
            else {
                ajws = null;
            }
            a2.b = (CharSequence)acbu.b(ajws);
            ajws ajws2;
            if ((a3.b & 0x4) != 0x0) {
                if ((ajws2 = a3.g) == null) {
                    ajws2 = ajws.a;
                }
            }
            else {
                ajws2 = null;
            }
            a2.c = (CharSequence)acbu.b(ajws2);
            akdj a4;
            if ((a3.b & 0x400) != 0x0) {
                akdh akdh;
                if ((akdh = a3.l) == null) {
                    akdh = akdh.a;
                }
                if (akdh.b == 47244396) {
                    a4 = (akdj)akdh.c;
                }
                else {
                    a4 = akdj.a;
                }
            }
            else {
                a4 = null;
            }
            final acxw a5 = a2.a(g(a4));
            akdj a6 = akdj;
            if ((a3.b & 0x200) != 0x0) {
                akdh akdh2;
                if ((akdh2 = a3.k) == null) {
                    akdh2 = akdh.a;
                }
                if (akdh2.b == 47244396) {
                    a6 = (akdj)akdh2.c;
                }
                else {
                    a6 = akdj.a;
                }
            }
            final acxw b4 = a5.b(g(a6));
            float j;
            if ((j = a3.j) <= 0.0f) {
                j = 1.0f;
            }
            b4.l(j);
            aout a7;
            if (a3.c == 13) {
                a7 = (aout)a3.d;
            }
            else {
                a7 = aout.a;
            }
            if ((a7.b & 0x4) != 0x0) {
                final Context context = a.getContext();
                aout a8;
                if (a3.c == 13) {
                    a8 = (aout)a3.d;
                }
                else {
                    a8 = aout.a;
                }
                aouq aouq;
                if ((aouq = aouq.b(a8.e)) == null) {
                    aouq = aouq.a;
                }
                a2.g(acww.b(context, aouq));
            }
        }
        g.c(a2.c());
    }
    
    public final void e(final akdp akdp, final View view, final Object o, final xab xab, final boolean b, final boolean b2, final acxb acxb) {
        this.a();
        if (view != null) {
            if (akdp != null) {
                Label_0303: {
                    if (!b2) {
                        this.d.put(akdp.c, new acjq(this, akdp, view, xab, acxb));
                        if ((akdp.b & 0x40) != 0x0) {
                            akdl akdl;
                            if ((akdl = akdp.i) == null) {
                                akdl = akdl.a;
                            }
                            final int bh = adzw.bH(akdl.b);
                            if (bh != 0) {
                                if (bh == 3) {
                                    return;
                                }
                            }
                        }
                        final gab f = this.f;
                        long d;
                        if ((akdp.b & 0x10) != 0x0) {
                            akdo akdo;
                            if ((akdo = akdp.g) == null) {
                                akdo = akdo.a;
                            }
                            d = akdo.d;
                        }
                        else {
                            d = 0L;
                        }
                        long c;
                        if ((akdp.b & 0x10) != 0x0) {
                            akdo akdo2;
                            if ((akdo2 = akdp.g) == null) {
                                akdo2 = akdo.a;
                            }
                            c = akdo2.c;
                        }
                        else {
                            c = 0L;
                        }
                        final boolean e = adix.e((SharedPreferences)f.a, gab.ae(akdp), TimeUnit.SECONDS.toMillis(c), ((oco)f.b).c());
                        int n = 0;
                        if (e) {
                            n = n;
                            if (((SharedPreferences)f.a).getLong(gab.af(akdp), 0L) < d) {
                                n = 1;
                            }
                        }
                        if (!this.c.contains(new Pair((Object)akdp, o)) && n != 0) {
                            break Label_0303;
                        }
                        return;
                    }
                }
                if (view.isShown() && view.isAttachedToWindow()) {
                    this.d(akdp, view, o, xab, b, b2, acxb);
                    return;
                }
                view.post((Runnable)new acxh(this, view, akdp, o, xab, b, b2, acxb, 0));
            }
        }
    }
    
    @Override
    public final void f(final akdp akdp, final View view, final xab xab) {
        this.e(akdp, view, null, xab, this.b, true, null);
    }
}
