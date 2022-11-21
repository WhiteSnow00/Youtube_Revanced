import java.util.Set;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atj
{
    private static final ati a;
    
    static {
        a = ati.a;
    }
    
    public static final void a(final br br, final String s) {
        br.getClass();
        final atg atg = new atg(br, s);
        j((atr)atg);
        final ati h = h(br);
        if (h.b.contains(ath.c) && k(h, br.getClass(), ((atr)atg).getClass())) {
            i(h, (atr)atg);
        }
    }
    
    public static final void b(final br br, final ViewGroup viewGroup) {
        br.getClass();
        final atk atk = new atk(br, viewGroup);
        j((atr)atk);
        final ati h = h(br);
        if (h.b.contains(ath.d) && k(h, br.getClass(), ((atr)atk).getClass())) {
            i(h, (atr)atk);
        }
    }
    
    public static final void c(final br br) {
        final atl atl = new atl(br);
        j((atr)atl);
        final ati h = h(br);
        if (h.b.contains(ath.g) && k(h, br.getClass(), ((atr)atl).getClass())) {
            i(h, (atr)atl);
        }
    }
    
    public static final void d(final br br) {
        final atn atn = new atn(br);
        j((atr)atn);
        final ati h = h(br);
        if (h.b.contains(ath.e) && k(h, br.getClass(), ((atr)atn).getClass())) {
            i(h, (atr)atn);
        }
    }
    
    public static final void e(final br br, final boolean b) {
        final atp atp = new atp(br, b);
        j((atr)atp);
        final ati h = h(br);
        if (h.b.contains(ath.f) && k(h, br.getClass(), ((atr)atp).getClass())) {
            i(h, (atr)atp);
        }
    }
    
    public static final void f(final br br, final ViewGroup viewGroup) {
        br.getClass();
        final ats ats = new ats(br, viewGroup);
        j(ats);
        final ati h = h(br);
        if (h.b.contains(ath.h) && k(h, br.getClass(), ats.getClass())) {
            i(h, ats);
        }
    }
    
    public static final void g(final br br, final br br2) {
        final ato ato = new ato(br, br2);
        j((atr)ato);
        final ati h = h(br);
        if (h.b.contains(ath.g) && k(h, br.getClass(), ((atr)ato).getClass())) {
            i(h, (atr)ato);
        }
    }
    
    private static final ati h(br c) {
        while (c != null) {
            if (c.ar()) {
                c.G();
            }
            c = c.C;
        }
        return atj.a;
    }
    
    private static final void i(final ati ati, final atr atr) {
        final br a = atr.a;
        final String name = a.getClass().getName();
        ati.b.contains(ath.a);
        if (ati.b.contains(ath.b)) {
            final vt vt = new vt(name, atr, 15);
            if (a.ar()) {
                final Handler d = a.G().l.d;
                if (atqz.c(d.getLooper(), Looper.myLooper())) {
                    ((Runnable)vt).run();
                    return;
                }
                d.post((Runnable)vt);
            }
            else {
                ((Runnable)vt).run();
            }
        }
    }
    
    private static final void j(final atr atr) {
        if (cl.W(3)) {
            atr.a.getClass().getName();
        }
    }
    
    private static final boolean k(final ati ati, final Class clazz, final Class clazz2) {
        final Set set = ati.c.get(clazz.getName());
        return set == null || ((atqz.c(clazz2.getSuperclass(), atr.class) || !atzd.k((Iterable)set, (Object)clazz2.getSuperclass())) && !set.contains(clazz2));
    }
}
