import j$.time.Duration;
import j$.time.Instant;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adry extends adrz
{
    public adrw a;
    private final adqx h;
    
    public adry(final String s, final adqx h) {
        super(s, (Object)aguh.a, (Object)adrx.a(afim.b));
        this.h = h;
    }
    
    public final aguc a() {
        final afes h = afev.h();
        final afke k = ((adrx)this.e).a.r().k();
        while (k.hasNext()) {
            final Map.Entry entry = k.next();
            h.g(((aguk)entry.getKey()).getNumber(), entry.getValue());
        }
        final ahaz builder = ((ahbh)aguc.a).createBuilder();
        final String c = this.c;
        builder.copyOnWrite();
        final aguc aguc = (aguc)builder.instance;
        c.getClass();
        aguc.e = c;
        final ahaz builder2 = ((ahbh)agul.a).createBuilder();
        final Object d = this.d;
        builder2.copyOnWrite();
        final agul agul = (agul)builder2.instance;
        d.getClass();
        agul.b = (aguh)d;
        final afev c2 = h.c();
        builder2.copyOnWrite();
        final agul agul2 = (agul)builder2.instance;
        final ahcr d2 = agul2.d;
        if (!d2.b) {
            agul2.d = d2.a();
        }
        ((Map<Object, Object>)agul2.d).putAll(c2);
        builder.copyOnWrite();
        final aguc aguc2 = (aguc)builder.instance;
        final agul c3 = (agul)builder2.build();
        c3.getClass();
        aguc2.c = c3;
        aguc2.b = 5;
        final String f = super.f;
        builder.copyOnWrite();
        final aguc aguc3 = (aguc)builder.instance;
        f.getClass();
        aguc3.h = f;
        return (aguc)builder.build();
    }
    
    public final /* bridge */ void b(final Object o) {
        final adrw a = this.a;
        ahan ahan;
        if ((ahan = ((aguh)o).c) == null) {
            ahan = ahan.a;
        }
        final Duration ar = adyf.ar(ahan);
        final afss b = a.b;
        a.d = Instant.now();
        a.c = ar;
    }
    
    protected final /* bridge */ int c(final Object o, final Object o2) {
        int n2;
        final int n = n2 = 2;
        if (o != null) {
            final ahaz builder = ((ahbh)o).toBuilder();
            builder.copyOnWrite();
            ((aguh)builder.instance).c = null;
            final aguh aguh = (aguh)builder.build();
            final ahaz builder2 = ((ahbh)o2).toBuilder();
            builder2.copyOnWrite();
            ((aguh)builder2.instance).c = null;
            if (!((ahbh)aguh).equals((Object)builder2.build())) {
                n2 = n;
            }
            else {
                ahan ahan;
                if ((ahan = ((aguh)o).c) == null) {
                    ahan = ahan.a;
                }
                final Duration ar = adyf.ar(ahan);
                ahan ahan2;
                if ((ahan2 = ((aguh)o2).c) == null) {
                    ahan2 = ahan.a;
                }
                if (ar.minus(adyf.ar(ahan2)).abs().compareTo(this.h.e) > 0) {
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
