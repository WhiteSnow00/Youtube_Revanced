// 
// Decompiled by Procyon v0.6.0
// 

public final class ajua implements vhc
{
    public static final vhd a;
    private final ajub b;
    
    static {
        a = new ajtz();
    }
    
    public ajua(final ajub b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new ajty(((ahcz)this.b).toBuilder());
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
        return o instanceof ajua && ((ahcz)this.b).equals(((ajua)o).b);
    }
    
    public Boolean getIsEndscreenOverlayVisible() {
        return this.b.e;
    }
    
    public Boolean getIsRelatedVideosCarouselVisible() {
        return this.b.f;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return ajua.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("FeaturePlayerOverlayStateEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
