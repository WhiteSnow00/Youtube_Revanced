// 
// Decompiled by Procyon v0.6.0
// 

public final class ahij
{
    private final vfp a;
    private final ahil b;
    
    public ahij(final ahil b, final vfp a) {
        this.b = b;
        this.a = a;
    }
    
    public static agnl b(final ahil ahil) {
        return new agnl(((ahbh)ahil).toBuilder());
    }
    
    public final afft a() {
        final affr affr = new affr();
        ahik ahik;
        if ((ahik = this.b.c) == null) {
            ahik = ahik.a;
        }
        affr.j((Iterable)ahii.b(ahik).c().a());
        return affr.g();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ahij && ((ahbh)this.b).equals((Object)((ahij)o).b);
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("AccessibilitySupportedDatasModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
