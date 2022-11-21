// 
// Decompiled by Procyon v0.6.0
// 

public final class aiqu
{
    public final vgx a;
    public final aipv b;
    
    public aiqu(final aipv b, final vgx a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aiqu && this.b.equals(((aiqu)o).b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("VideoRestrictionDataModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
