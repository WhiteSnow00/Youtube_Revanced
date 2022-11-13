import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aauw implements aaut, abps, tgg
{
    public final aaqz a;
    public boolean b;
    private final Set c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private final iwa h;
    
    public aauw(final iwa h, final aaqz a) {
        h.getClass();
        this.h = h;
        a.getClass();
        this.a = a;
        this.c = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        h.a.a = (aaut)this;
    }
    
    private final void d() {
        final boolean d = this.d;
        boolean b2;
        final boolean b = b2 = false;
        if (d) {
            b2 = b;
            if (this.e) {
                b2 = b;
                if (!this.f) {
                    b2 = true;
                }
            }
        }
        if (this.b = b2) {
            this.h.a.b = this.g;
        }
        final Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            ((aauv)iterator.next()).pB(this.b);
        }
    }
    
    public final void a(final aauv aauv) {
        this.c.add(aauv);
    }
    
    final void b(final aamh aamh) {
        this.d = aamh.f();
        this.d();
    }
    
    final void c(final aans aans) {
        final PlayerResponseModel b = aans.b();
        final boolean b2 = true;
        this.e = (b != null && aans.b().n() != null && aans.b().n().B());
        this.f = (aans.b() != null && !aans.b().m().ac() && aans.b().m().ap());
        boolean g = false;
        Label_0162: {
            if (aans.b() != null) {
                final aneh c = aans.b().m().c;
                if ((c.c & 0x1) != 0x0) {
                    appt appt;
                    if ((appt = c.u) == null) {
                        appt = appt.a;
                    }
                    if (appt.m) {
                        g = b2;
                        break Label_0162;
                    }
                }
            }
            g = false;
        }
        this.g = g;
        this.d();
    }
    
    public final asir[] lX(final abpu abpu) {
        final asir an = ((ashi)abpu.p().a).j(aale.s(abpu.bM(), 64L)).j(aale.q(1)).an((asjm)new aauu(this, 1), (asjm)aaof.h);
        asir asir;
        if (((vai)abpu.ci().g).bw()) {
            asir = ((ashi)abpu.cc().a).an((asjm)new aauu(this, 0), (asjm)aaof.h);
        }
        else {
            asir = abpu.cc().c().j(aale.s(abpu.bM(), 64L)).j(aale.q(0)).an((asjm)new aauu(this, 0), (asjm)aaof.h);
        }
        return new asir[] { an, asir };
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                this.c((aans)o);
            }
            else {
                this.b((aamh)o);
            }
        }
        else {
            array = new Class[] { aamh.class, aans.class };
        }
        return array;
    }
}
