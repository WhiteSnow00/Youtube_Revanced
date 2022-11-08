import java.util.Set;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atg
{
    private static final atf a;
    
    static {
        a = atf.a;
    }
    
    public static final void a(final br br, final String s) {
        br.getClass();
        final atd atd = new atd(br, s);
        j((ato)atd);
        final atf h = h(br);
        if (h.b.contains(ate.c) && k(h, br.getClass(), ((ato)atd).getClass())) {
            i(h, (ato)atd);
        }
    }
    
    public static final void b(final br br, final ViewGroup viewGroup) {
        br.getClass();
        final ath ath = new ath(br, viewGroup);
        j(ath);
        final atf h = h(br);
        if (h.b.contains(ate.d) && k(h, br.getClass(), ath.getClass())) {
            i(h, ath);
        }
    }
    
    public static final void c(final br br) {
        final ati ati = new ati(br);
        j((ato)ati);
        final atf h = h(br);
        if (h.b.contains(ate.g) && k(h, br.getClass(), ((ato)ati).getClass())) {
            i(h, (ato)ati);
        }
    }
    
    public static final void d(final br br) {
        final atk atk = new atk(br);
        j((ato)atk);
        final atf h = h(br);
        if (h.b.contains(ate.e) && k(h, br.getClass(), ((ato)atk).getClass())) {
            i(h, (ato)atk);
        }
    }
    
    public static final void e(final br br, final boolean b) {
        final atm atm = new atm(br, b);
        j(atm);
        final atf h = h(br);
        if (h.b.contains(ate.f) && k(h, br.getClass(), atm.getClass())) {
            i(h, atm);
        }
    }
    
    public static final void f(final br br, final ViewGroup viewGroup) {
        br.getClass();
        final atp atp = new atp(br, viewGroup);
        j(atp);
        final atf h = h(br);
        if (h.b.contains(ate.h) && k(h, br.getClass(), atp.getClass())) {
            i(h, atp);
        }
    }
    
    public static final void g(final br br, final br br2) {
        final atl atl = new atl(br, br2);
        j((ato)atl);
        final atf h = h(br);
        if (h.b.contains(ate.g) && k(h, br.getClass(), ((ato)atl).getClass())) {
            i(h, (ato)atl);
        }
    }
    
    private static final atf h(br c) {
        while (c != null) {
            if (c.ar()) {
                c.G();
            }
            c = c.C;
        }
        return atg.a;
    }
    
    private static final void i(final atf atf, final ato ato) {
        final br a = ato.a;
        final String name = a.getClass().getName();
        atf.b.contains(ate.a);
        if (atf.b.contains(ate.b)) {
            final vs vs = new vs(name, ato, 15);
            if (a.ar()) {
                final Handler d = a.G().l.d;
                if (atnh.c(d.getLooper(), Looper.myLooper())) {
                    ((Runnable)vs).run();
                    return;
                }
                d.post((Runnable)vs);
            }
            else {
                ((Runnable)vs).run();
            }
        }
    }
    
    private static final void j(final ato ato) {
        if (cl.W(3)) {
            ato.a.getClass().getName();
        }
    }
    
    private static final boolean k(final atf atf, final Class clazz, final Class clazz2) {
        final Set set = atf.c.get(clazz.getName());
        return set == null || ((atnh.c(clazz2.getSuperclass(), ato.class) || !aqzg.K((Iterable)set, (Object)clazz2.getSuperclass())) && !set.contains(clazz2));
    }
}
