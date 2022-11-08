// 
// Decompiled by Procyon v0.6.0
// 

public final class ajhg implements vdt
{
    public static final vdu a;
    private final ajhh b;
    
    static {
        a = new ajhf();
    }
    
    public ajhg(final ajhh b) {
        this.b = b;
    }
    
    public final afdu b() {
        final afds afds = new afds();
        this.getSmartDownloadsOptInBannerVisibilityModel();
        afds.j((Iterable)new afds().g());
        return afds.g();
    }
    
    public final byte[] d() {
        return ((agxl)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajhg && ((agzi)this.b).equals(((ajhg)o).b);
    }
    
    public ajfp getSmartDownloadsOptInBannerVisibility() {
        ajfp ajfp;
        if ((ajfp = this.b.e) == null) {
            ajfp = ajfp.a;
        }
        return ajfp;
    }
    
    public ajfo getSmartDownloadsOptInBannerVisibilityModel() {
        ajfp ajfp;
        if ((ajfp = this.b.e) == null) {
            ajfp = ajfp.a;
        }
        return new ajfo((ajfp)((agza)((agzi)ajfp).toBuilder()).build());
    }
    
    public vdu getType() {
        return ajhg.a;
    }
    
    @Override
    public final int hashCode() {
        return ((agzi)this.b).hashCode() ^ 0xF6181;
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
