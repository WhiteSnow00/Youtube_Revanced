// 
// Decompiled by Procyon v0.6.0
// 

public final class amwe
{
    private final amwg a;
    
    public amwe(final amwg a) {
        this.a = a;
    }
    
    public static final afhk a() {
        return new afhi().g();
    }
    
    public static aefs b(final amwg amwg) {
        return new aefs(((ahcz)amwg).toBuilder());
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amwe && ((ahcz)this.a).equals(((amwe)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.a).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("ClientEndpointBuilderDataModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
