// 
// Decompiled by Procyon v0.6.0
// 

public final class ajkn implements vhc
{
    public static final vhd a;
    public final ajko b;
    
    static {
        a = new ajkm();
    }
    
    public ajkn(final ajko b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new ajkl(this.b.toBuilder());
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
        return o instanceof ajkn && this.b.equals(((ajkn)o).b);
    }
    
    public ahbt getTokenBytes() {
        return this.b.e;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return ajkn.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("DownloadsPageRefreshTokenEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
