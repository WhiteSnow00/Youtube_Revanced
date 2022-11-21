// 
// Decompiled by Procyon v0.6.0
// 

public final class aiqs
{
    public final vgx a;
    public final aipp b;
    
    public aiqs(final aipp b, final vgx a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aiqs && this.b.equals(((aiqs)o).b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("RestrictionModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
