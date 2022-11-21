// 
// Decompiled by Procyon v0.6.0
// 

public final class amym implements vhc
{
    public static final vhd a;
    private final amyn b;
    
    static {
        a = new amyl();
    }
    
    public amym(final amyn b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new amyk(((ahcz)this.b).toBuilder());
    }
    
    public final afhk b() {
        return new afhi().g();
    }
    
    public final byte[] d() {
        return ((ahbc)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amym && ((ahcz)this.b).equals(((amym)o).b);
    }
    
    public Long getBytesDownloaded() {
        return this.b.f;
    }
    
    public apoq getDownloadState() {
        apoq apoq;
        if ((apoq = apoq.b(this.b.e)) == null) {
            apoq = apoq.a;
        }
        return apoq;
    }
    
    public Long getTotalBytes() {
        return this.b.g;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return amym.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("OfflineVideoStatusEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
