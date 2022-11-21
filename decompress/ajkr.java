// 
// Decompiled by Procyon v0.6.0
// 

public final class ajkr implements vhc
{
    public static final vhd a;
    private final ajks b;
    
    static {
        a = new ajkq();
    }
    
    public ajkr(final ajks b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new ajkp(this.b.toBuilder());
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
        return o instanceof ajkr && this.b.equals(((ajkr)o).b);
    }
    
    public String getLastUpdatedTimeMessage() {
        return this.b.f;
    }
    
    public String getSpaceUsedMessage() {
        return this.b.e;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return ajkr.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("DownloadsPageSmartDownloadsHeaderEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
