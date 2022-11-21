import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import java.util.function.UnaryOperator;
import java.util.function.Supplier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adtb implements Supplier
{
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;
    
    public adtb(final adtd a, final adsb b, final adtp c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public adtb(final adte b, final UnaryOperator c, final agwc a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public final Object get() {
        if (this.d != 0) {
            final Object b = this.b;
            final Object c = this.c;
            final Object a = this.a;
            final adtq c2 = ((adte)b).c;
            final adsq adsq = new adsq((UnaryOperator)c, 0);
            Object o = ((adtp)c2).b;
            synchronized (o) {
                final int e = c2.e(adsq.apply(((adtp)c2).d), 1);
                final agvu a2 = ((adtp)c2).a();
                monitorexit(o);
                o = ((ahcz)agwd.a).createBuilder();
                ((ahcr)o).copyOnWrite();
                ((agwd)((ahcr)o).instance).c = ((agwc)a).getNumber();
                final agwd agwd = (agwd)((ahcr)o).buildPartial();
                o = ((ahcz)a2).toBuilder();
                ((ahcr)o).ap(agwd);
                return new adts(e, (agvu)((ahcr)o).build());
            }
        }
        return afvh.e(afxr.p((Callable)new zms((adsb)this.b, 17), ((adtd)this.a).b.c), (afax)new ablz((adtp)this.c, 16), (Executor)afwd.a);
    }
}
