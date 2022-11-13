import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ambn
{
    private final vfp a;
    private final ambo b;
    
    public ambn(final ambo b, final vfp a) {
        this.b = b;
        this.a = a;
    }
    
    public final List a() {
        final afel afel = new afel();
        final Iterator<Object> iterator = ((List<Object>)this.b.b).iterator();
        while (iterator.hasNext()) {
            afel.h(new aoud((aoue)((ahbh)iterator.next()).toBuilder().build(), this.a));
        }
        return (List)afel.g();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ambn && ((ahbh)this.b).equals((Object)((ambn)o).b);
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("MarkersDecorationModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
