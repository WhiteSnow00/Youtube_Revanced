import java.util.function.Consumer;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ffa implements wzo
{
    public final List a;
    public boolean b;
    public boolean c;
    public boolean d;
    private final wyo e;
    private final fes f;
    private final Map g;
    private alkg h;
    
    public ffa(final wyo e, final fes f) {
        final HashMap g = new HashMap();
        this.g = g;
        this.a = new ArrayList();
        this.h = alkg.a;
        this.f = f;
        this.e = e;
        this.f(0, null, "app_l");
        this.f(3, "uiwwa_s", null);
        this.f(4, "uiwwa_r", null);
        this.f(9, "brns", "brnr");
        this.f(10, "bres", "brer");
        this.f(11, "brps", "brpe");
        this.f(12, "br_s", "br_r");
        this.f(13, "uiwwa_pr", "uiwwa_e");
        this.f(14, "uibf_c", null);
        this.f(15, "uibf_r", null);
        this.f(17, "ol", null);
        this.f(22, "aa", null);
        this.f(23, "br_e", null);
        this.f(8, "th0_ns", "thmon_e");
        g.put("f_unknown", new eot(this, 8));
        g.put("f_home", new eot(this, 9));
        g.put("f_home_c", new eot(this, 10));
    }
    
    private final void f(final int n, final String s, final String s2) {
        this.g.put(wzr.a[n], new igu(this, s, s2, 1));
    }
    
    public final void a() {
        if (this.b && this.c) {
            if (!this.d) {
                final wyn c = this.e.c(alku.f);
                final agza builder = ((agzi)alkg.a).createBuilder((agzi)this.h);
                final alku f = alku.f;
                builder.copyOnWrite();
                final alkg alkg = (alkg)builder.instance;
                alkg.e = f.cI;
                alkg.b |= 0x1;
                String i;
                if (!Boolean.TRUE.equals(this.f.c)) {
                    i = "cold";
                }
                else {
                    i = "frozen";
                }
                builder.copyOnWrite();
                final alkg alkg2 = (alkg)builder.instance;
                alkg2.b |= 0x10;
                alkg2.i = i;
                c.a((alkg)builder.build());
                c.f(this.f.d);
                for (final fez fez : this.a) {
                    c.d(fez.a, fez.b);
                }
            }
        }
    }
    
    public final void b() {
        this.b = false;
        this.c = false;
        this.d = false;
        this.h = alkg.a;
        this.a.clear();
    }
    
    public final void c(final alkg h) {
        this.h = h;
    }
    
    public final void d(final alkj alkj) {
        final Consumer consumer = this.g.get(alkj.c);
        if (consumer != null) {
            consumer.accept(alkj);
        }
    }
    
    public final void e(final long n) {
    }
}
