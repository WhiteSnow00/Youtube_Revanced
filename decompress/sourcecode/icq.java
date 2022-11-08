import java.util.Iterator;
import java.util.HashSet;
import java.util.Collection;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class icq extends icy
{
    private final atjj a;
    
    public icq(final atjj a) {
        this.a = a;
    }
    
    private final Map o() {
        return ((zzu)this.a.a()).a().g().f();
    }
    
    public final afdu a(final aack aack) {
        final afds i = afdu.i();
        final Map o = this.o();
        final Collection j = aack.l().j();
        final HashSet l = aesy.l();
        final Iterator iterator = j.iterator();
        while (iterator.hasNext()) {
            l.addAll((Collection)fbp.C(o, ((zzl)iterator.next()).a()));
        }
        final afie k = afdu.p((Collection)l).k();
        while (((Iterator)k).hasNext()) {
            i.h(fbp.o((String)((Iterator)k).next()));
        }
        return i.g();
    }
    
    public final void b(final vdv vdv, final zzl zzl) {
        final afdu c = fbp.C(this.o(), zzl.a());
        if (!c.isEmpty()) {
            final afie k = c.k();
            while (((Iterator)k).hasNext()) {
                vdv.j((vdj)fbp.o((String)((Iterator)k).next()));
            }
        }
    }
}
