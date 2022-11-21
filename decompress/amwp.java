import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amwp
{
    private final vgx a;
    private final amwq b;
    
    public amwp(final amwq b, final vgx a) {
        this.b = b;
        this.a = a;
    }
    
    public static aefs b(final amwq amwq) {
        return new aefs(((ahcz)amwq).toBuilder());
    }
    
    public final afhk a() {
        final afhi afhi = new afhi();
        amwo amwo;
        if ((amwo = this.b.e) == null) {
            amwo = amwo.b;
        }
        final amwo amwo2 = (amwo)((ahcr)((ahcz)amwo).toBuilder()).build();
        afhi.j(new afhi().g());
        final afgc afgc = new afgc();
        final Iterator<Object> iterator = ((List<Object>)this.b.f).iterator();
        while (iterator.hasNext()) {
            afgc.h(b(iterator.next()).s(this.a));
        }
        final aflv d = afgc.g().D();
        while (((Iterator)d).hasNext()) {
            afhi.j(((amwp)((Iterator)d).next()).a());
        }
        final afgc afgc2 = new afgc();
        final Iterator<Object> iterator2 = ((List<Object>)this.b.g).iterator();
        while (iterator2.hasNext()) {
            afgc2.h(b(iterator2.next()).s(this.a));
        }
        final aflv d2 = afgc2.g().D();
        while (((Iterator)d2).hasNext()) {
            afhi.j(((amwp)((Iterator)d2).next()).a());
        }
        return afhi.g();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amwp && ((ahcz)this.b).equals(((amwp)o).b);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
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
