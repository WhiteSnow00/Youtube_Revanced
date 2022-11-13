import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amuk
{
    private final vfp a;
    private final amul b;
    
    public amuk(final amul b, final vfp a) {
        this.b = b;
        this.a = a;
    }
    
    public static aeea b(final amul amul) {
        return new aeea(((ahbh)amul).toBuilder());
    }
    
    public final afft a() {
        final affr affr = new affr();
        amuj amuj;
        if ((amuj = this.b.e) == null) {
            amuj = amuj.b;
        }
        final amuj amuj2 = (amuj)((ahaz)((ahbh)amuj).toBuilder()).build();
        affr.j((Iterable)new affr().g());
        final afel afel = new afel();
        final Iterator<Object> iterator = ((List<Object>)this.b.f).iterator();
        while (iterator.hasNext()) {
            afel.h(b(iterator.next()).H(this.a));
        }
        final afkf d = afel.g().D();
        while (((Iterator)d).hasNext()) {
            affr.j((Iterable)((amuk)((Iterator)d).next()).a());
        }
        final afel afel2 = new afel();
        final Iterator<Object> iterator2 = ((List<Object>)this.b.g).iterator();
        while (iterator2.hasNext()) {
            afel2.h(b(iterator2.next()).H(this.a));
        }
        final afkf d2 = afel2.g().D();
        while (((Iterator)d2).hasNext()) {
            affr.j((Iterable)((amuk)((Iterator)d2).next()).a());
        }
        return affr.g();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amuk && ((ahbh)this.b).equals((Object)((amuk)o).b);
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("OfflineOrchestrationActionModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
