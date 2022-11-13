// 
// Decompiled by Procyon v0.6.0
// 

public final class ahii
{
    private final ahik a;
    
    public ahii(final ahik a) {
        this.a = a;
    }
    
    public static agnl b(final ahik ahik) {
        return new agnl(((ahbh)ahik).toBuilder());
    }
    
    public final afft a() {
        final affr affr = new affr();
        ahim ahim;
        if ((ahim = this.a.d) == null) {
            ahim = ahim.a;
        }
        final ahim ahim2 = (ahim)((ahbh)ahim).toBuilder().build();
        affr.j((Iterable)new affr().g());
        return affr.g();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ahii && ((ahbh)this.a).equals((Object)((ahii)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.a).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("AccessibilityDataModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
