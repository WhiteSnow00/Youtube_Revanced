// 
// Decompiled by Procyon v0.6.0
// 

public final class amak implements vhc
{
    public static final vhd a;
    private final amal b;
    
    static {
        a = new amaj();
    }
    
    public amak(final amal b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new amai(this.b.toBuilder());
    }
    
    public final afhk b() {
        return new afhi().g();
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amak && this.b.equals(((amak)o).b);
    }
    
    public String getTitle() {
        return this.b.d;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return amak.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("MainDownloadablePlaylistMetadataEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
