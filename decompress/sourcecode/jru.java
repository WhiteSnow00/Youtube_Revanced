import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Collection;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jru extends acmv implements acma
{
    public final Context a;
    public final atjj b;
    public final atjj c;
    public final acpd d;
    public final acjb e;
    public boolean f;
    public aikw g;
    public iqf h;
    private final atjj m;
    private aiku n;
    private final qpt o;
    
    public jru(final Context a, final acno acno, final atjj m, final tdz tdz, final tny tny, final atjj b, final atjj c, final vke vke, final wwv wwv, final acpi acpi, final acpd d) {
        final acjb e = new acjb();
        acno.a();
        super(vke, tdz, tny, wwv, acpi, e);
        this.a = a;
        this.m = m;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.o = new qpt(this);
        acno.b((Class)aikw.class);
        if (acpi instanceof jrt) {
            final jrt jrt = (jrt)acpi;
            this.o(jrt.a, false);
            ((tdv)e).addAll((Collection)jrt.b);
            final aikw a2 = jrt.a;
            if (a2 != null && (a2.b & 0x10) != 0x0) {
                wwv.D((wxz)new wws(a2.h));
            }
        }
    }
    
    public static aitc g(aitc aitc, final Map map) {
        aisz aisz;
        if ((aisz = aitc.k) == null) {
            aisz = aisz.a;
        }
        anft a;
        if (aisz.b == 135739232) {
            a = (anft)aisz.c;
        }
        else {
            a = anft.a;
        }
        final String c = a.c;
        if (map.containsKey(c)) {
            aitc = (aitc)map.get(c);
        }
        return aitc;
    }
    
    public static Object j(final List list, final int n) {
        if (n < list.size()) {
            return list.get(n);
        }
        return null;
    }
    
    private final void o(final aikw g, final boolean b) {
        g.getClass();
        this.g = g;
        aikv aikv;
        if ((aikv = g.d) == null) {
            aikv = aikv.a;
        }
        aiku a;
        if (aikv.b == 140080728) {
            a = (aiku)aikv.c;
        }
        else {
            a = aiku.a;
        }
        while (true) {
            for (final aiks aiks : a.d) {
                if (aiks.d) {
                    aikx aikx;
                    if ((aikx = aiks.e) == null) {
                        aikx = aikx.a;
                    }
                    int ay;
                    if ((ay = aety.ay(aikx.c)) == 0) {
                        ay = 1;
                    }
                    final iqf h = feq.i(ay, aiks.f);
                    this.h = h;
                    if (b) {
                        this.qG();
                        final aikv d = g.d;
                        aikv a2;
                        if (d == null) {
                            a2 = aikv.a;
                        }
                        else {
                            a2 = d;
                        }
                        if (a2.b == 140080728) {
                            aikv a3;
                            if ((a3 = d) == null) {
                                a3 = aikv.a;
                            }
                            aiku a4;
                            if (a3.b == 140080728) {
                                a4 = (aiku)a3.c;
                            }
                            else {
                                a4 = aiku.a;
                            }
                            this.n = a4;
                        }
                        if (g.e.size() != 0) {
                            for (final aiky aiky : g.e) {
                                if (aiky.b == 48602820) {
                                    this.E(aiky.c);
                                }
                            }
                        }
                        this.m();
                    }
                    aikr aikr;
                    if ((aikr = g.c) == null) {
                        aikr = aikr.a;
                    }
                    final int az = aety.az(aikr.c);
                    if (az != 0) {
                        if (az == 2) {
                            final ifb ifb = (ifb)this.m.a();
                            final qpt o = this.o;
                            final Set b2 = ifb.b;
                            o.getClass();
                            b2.add(o);
                            ifb.a();
                        }
                    }
                    ((achk)super.i).ni((acik)new kfe(this, 9));
                    return;
                }
            }
            final iqf h = feq.i(2, false);
            continue;
        }
    }
    
    public final void l(final aikw aikw) {
        this.o(aikw, true);
    }
    
    @Override
    public final void lH(final ansi ansi, final aioe aioe) {
        this.qG();
        this.f = false;
        this.mD(aaiy.y((Object)ansi));
    }
    
    public final void m() {
        if (this.f && ((tdv)this.e).size() == 1) {
            ((tdv)this.e).clear();
            this.f = false;
            return;
        }
        if (this.n != null && !this.f && !((tdv)this.e).isEmpty()) {
            this.F(this.n, 0);
            this.f = true;
        }
    }
    
    @Override
    public final acpi qv() {
        final ArrayList list = new ArrayList(((tdv)this.e).size());
        this.e.k((Collection)list);
        return new jrt(super.qv(), this.g, list);
    }
    
    @Override
    public final void rU() {
        final ifb ifb = (ifb)this.m.a();
        final qpt o = this.o;
        final Set b = ifb.b;
        o.getClass();
        b.remove(o);
        this.h = null;
        this.g = null;
        this.f = false;
    }
}
