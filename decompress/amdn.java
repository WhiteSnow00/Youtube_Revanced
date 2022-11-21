import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amdn
{
    private final vgx a;
    private final amdo b;
    
    public amdn(final amdo b, final vgx a) {
        this.b = b;
        this.a = a;
    }
    
    public final List a() {
        final afgc afgc = new afgc();
        final Iterator<Object> iterator = ((List<Object>)this.b.b).iterator();
        while (iterator.hasNext()) {
            afgc.h(new aowp((aowq)((ahcz)iterator.next()).toBuilder().build(), this.a));
        }
        return afgc.g();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amdn && ((ahcz)this.b).equals(((amdn)o).b);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
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
