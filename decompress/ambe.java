// 
// Decompiled by Procyon v0.6.0
// 

public final class ambe implements vhc
{
    public static final vhd a;
    private final ambf b;
    
    static {
        a = new ambd();
    }
    
    public ambe(final ambf b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new ambc(this.b.toBuilder());
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
        return o instanceof ambe && this.b.equals(((ambe)o).b);
    }
    
    public Long getAddedTimestampMillis() {
        return this.b.e;
    }
    
    public ahbt getClickTrackingParams() {
        return this.b.h;
    }
    
    public Long getLastModifiedTimestampSeconds() {
        return this.b.g;
    }
    
    public Long getLastSyncedTimestampMillis() {
        return this.b.f;
    }
    
    public amze getMaximumDownloadQuality() {
        amze amze;
        if ((amze = amze.b(this.b.i)) == null) {
            amze = amze.a;
        }
        return amze;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return ambe.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("MainPlaylistDownloadStateEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
