import java.util.Set;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public class ozm
{
    private ozo a;
    private final ozk b;
    public final agzc c;
    private final agza d;
    
    protected ozm(final php php, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = ozo.c;
        this.a = null;
        this.c = (agzc)((agzi)ozr.a).createBuilder();
        this.d = (agza)php.a;
        this.a(((afpc)((agza)php.a).instance).d);
    }
    
    private final void a(final int n) {
        final agzc c = this.c;
        final long g = ((ozr)c.instance).g;
        c.copyOnWrite();
        final ozr ozr = (ozr)c.instance;
        ozr.b |= 0x8;
        ozr.g = g + n;
    }
    
    private final void b(final int n) {
        final agzc c = this.c;
        final long h = ((ozr)c.instance).h;
        c.copyOnWrite();
        final ozr ozr = (ozr)c.instance;
        ozr.b |= 0x10;
        ozr.h = h + n;
    }
    
    public final void d(final ozn ozn) {
        final ozo a = this.a;
        boolean b = false;
        agot.G(a == null, "CVE %s has already been built.", (Object)a);
        afpc afpc;
        if ((afpc = ((ozr)this.c.instance).d) == null) {
            afpc = afpc.a;
        }
        if ((afpc.b & 0x800) != 0x0) {
            b = true;
        }
        agot.D(b ^ true);
        if (!this.c.rs(ozn.a)) {
            final agzc c = this.c;
            final int a2 = ozn.a.a();
            c.copyOnWrite();
            final ozr ozr = (ozr)c.instance;
            final agzq c2 = ozr.c;
            if (!c2.c()) {
                ozr.c = agzi.mutableCopy(c2);
            }
            ozr.c.g(a2);
        }
        this.c.e(ozn.a, ozn.b);
        this.a(ozn.a.a());
        this.a(ozn.a.hashCode());
        this.a(ozn.b.hashCode());
    }
    
    public final ozo e(php e) {
        agot.E(this.a == null, (Object)"Cannot create CVE twice.");
        final agzc c = this.c;
        final agza d = this.d;
        c.copyOnWrite();
        final ozr ozr = (ozr)c.instance;
        final afpc d2 = (afpc)d.build();
        final ozr a = ozr.a;
        d2.getClass();
        ozr.d = d2;
        ozr.b |= 0x1;
        final ozo a2 = new ozo((agzc)((agzi)this.c.build()).toBuilder(), this.b, e, null, null);
        this.a = a2;
        e = a2.e;
        if (!((Set)e.a).isEmpty()) {
            final Iterator<Object> iterator = ((Set<Object>)e.a).iterator();
            while (iterator.hasNext()) {
                iterator.next().f();
            }
        }
        return this.a;
    }
    
    public final void f(final phq phq) {
        final ozo a = this.a;
        agot.G(a == null, "CVE %s has already been built.", (Object)a);
        this.c.e((agyr)phq.a, phq.b);
        this.b(((agyr)phq.a).a());
        this.b(phq.a.hashCode());
        this.b(phq.b.hashCode());
    }
}
