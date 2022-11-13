// 
// Decompiled by Procyon v0.6.0
// 

public final class amua
{
    private final amuc a;
    
    public amua(final amuc a) {
        this.a = a;
    }
    
    public static aeea b(final amuc amuc) {
        return new aeea(((ahbh)amuc).toBuilder());
    }
    
    public final afft a() {
        final affr affr = new affr();
        amub amub;
        if ((amub = this.a.e) == null) {
            amub = amub.a;
        }
        amtz.b(amub).J();
        affr.j((Iterable)amtz.a());
        return affr.g();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amua && ((ahbh)this.a).equals((Object)((amua)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.a).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("OfflineFutureUnplayableInfoModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
