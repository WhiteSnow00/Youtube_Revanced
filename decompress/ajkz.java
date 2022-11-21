// 
// Decompiled by Procyon v0.6.0
// 

public final class ajkz implements vhc
{
    public static final vhd a;
    private final ajla b;
    
    static {
        a = new ajky();
    }
    
    public ajkz(final ajla b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new ajkx(this.b.toBuilder());
    }
    
    public final afhk b() {
        return new afhi().g();
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajkz && this.b.equals(((ajkz)o).b);
    }
    
    public Boolean getShouldPersistDownloadsSectionExpandedState() {
        return this.b.e;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return ajkz.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
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
