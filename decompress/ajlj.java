// 
// Decompiled by Procyon v0.6.0
// 

public final class ajlj implements vhc
{
    public static final vhd a;
    private final ajlk b;
    
    static {
        a = new ajli();
    }
    
    public ajlj(final ajlk b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new ajlh(this.b.toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        this.getSmartDownloadsOptInBannerVisibilityModel();
        afhi.j(new afhi().g());
        return afhi.g();
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajlj && this.b.equals(((ajlj)o).b);
    }
    
    public ajjs getSmartDownloadsOptInBannerVisibility() {
        ajjs ajjs;
        if ((ajjs = this.b.e) == null) {
            ajjs = ajjs.a;
        }
        return ajjs;
    }
    
    public ajjr getSmartDownloadsOptInBannerVisibilityModel() {
        ajjs ajjs;
        if ((ajjs = this.b.e) == null) {
            ajjs = ajjs.a;
        }
        return new ajjr((ajjs)((ahcr)((ahcz)ajjs).toBuilder()).build());
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return ajlj.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("DownloadsPageViewConfigurationEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
