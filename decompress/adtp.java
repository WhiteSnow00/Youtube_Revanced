import java.util.Iterator;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adtp extends adtq
{
    public adtn a;
    private final adso h;
    
    public adtp(final String s, final adso h) {
        super(s, agvz.a, adto.a(afkc.b));
        this.h = h;
    }
    
    public final agvu a() {
        final afgj h = afgm.h();
        final aflu k = ((adto)this.e).a.r().k();
        while (((Iterator)k).hasNext()) {
            final Map.Entry entry = (Map.Entry)((Iterator)k).next();
            h.g(((agwc)entry.getKey()).getNumber(), entry.getValue());
        }
        final ahcr builder = ((ahcz)agvu.a).createBuilder();
        final String c = this.c;
        builder.copyOnWrite();
        final agvu agvu = (agvu)builder.instance;
        c.getClass();
        agvu.e = c;
        final ahcr builder2 = ((ahcz)agwd.a).createBuilder();
        final Object d = this.d;
        builder2.copyOnWrite();
        final agwd agwd = (agwd)builder2.instance;
        d.getClass();
        agwd.b = (agvz)d;
        final afgm c2 = h.c();
        builder2.copyOnWrite();
        final agwd agwd2 = (agwd)builder2.instance;
        final ahej d2 = agwd2.d;
        if (!d2.b) {
            agwd2.d = d2.a();
        }
        ((Map<Object, Object>)agwd2.d).putAll(c2);
        builder.copyOnWrite();
        final agvu agvu2 = (agvu)builder.instance;
        final agwd c3 = (agwd)builder2.build();
        c3.getClass();
        agvu2.c = c3;
        agvu2.b = 5;
        final String f = super.f;
        builder.copyOnWrite();
        final agvu agvu3 = (agvu)builder.instance;
        f.getClass();
        agvu3.h = f;
        return (agvu)builder.build();
    }
    
    @Override
    public final /* bridge */ void b(final Object o) {
        final adtn a = this.a;
        ahcf ahcf;
        if ((ahcf = ((agvz)o).c) == null) {
            ahcf = ahcf.a;
        }
        final Duration av = adzw.av(ahcf);
        final afui b = a.b;
        a.d = Instant.now();
        a.c = av;
    }
    
    @Override
    protected final /* bridge */ int c(final Object o, final Object o2) {
        int n2;
        final int n = n2 = 2;
        if (o != null) {
            final ahcr builder = ((ahcz)o).toBuilder();
            builder.copyOnWrite();
            ((agvz)builder.instance).c = null;
            final agvz agvz = (agvz)builder.build();
            final ahcr builder2 = ((ahcz)o2).toBuilder();
            builder2.copyOnWrite();
            ((agvz)builder2.instance).c = null;
            if (!((ahcz)agvz).equals(builder2.build())) {
                n2 = n;
            }
            else {
                ahcf ahcf;
                if ((ahcf = ((agvz)o).c) == null) {
                    ahcf = ahcf.a;
                }
                final Duration av = adzw.av(ahcf);
                ahcf ahcf2;
                if ((ahcf2 = ((agvz)o2).c) == null) {
                    ahcf2 = ahcf.a;
                }
                if (av.minus(adzw.av(ahcf2)).abs().compareTo(this.h.e) > 0) {
                    n2 = n;
                }
                else {
                    n2 = 1;
                }
            }
        }
        return n2;
    }
}
