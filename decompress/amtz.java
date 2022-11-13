// 
// Decompiled by Procyon v0.6.0
// 

public final class amtz
{
    private final amub a;
    
    public amtz(final amub a) {
        this.a = a;
    }
    
    public static final afft a() {
        return new affr().g();
    }
    
    public static aeea b(final amub amub) {
        return new aeea(((ahbh)amub).toBuilder());
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amtz && ((ahbh)this.a).equals((Object)((amtz)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.a).hashCode() ^ 0xF6181;
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
