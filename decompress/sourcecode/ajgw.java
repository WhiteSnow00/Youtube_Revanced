// 
// Decompiled by Procyon v0.6.0
// 

public final class ajgw implements vdt
{
    public static final vdu a;
    private final ajgx b;
    
    static {
        a = new ajgv();
    }
    
    public ajgw(final ajgx b) {
        this.b = b;
    }
    
    public final afdu b() {
        return new afds().g();
    }
    
    public final byte[] d() {
        return ((agxl)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajgw && ((agzi)this.b).equals(((ajgw)o).b);
    }
    
    public Boolean getShouldPersistDownloadsSectionExpandedState() {
        return this.b.e;
    }
    
    public vdu getType() {
        return ajgw.a;
    }
    
    @Override
    public final int hashCode() {
        return ((agzi)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("DownloadsPageStateEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
