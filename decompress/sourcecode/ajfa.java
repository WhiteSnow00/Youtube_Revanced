// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfa implements vdt
{
    public static final vdu a;
    private final ajfb b;
    
    static {
        a = new ajez();
    }
    
    public ajfa(final ajfb b) {
        this.b = b;
    }
    
    public final afdu b() {
        return new afds().g();
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajfa && this.b.equals(((ajfa)o).b);
    }
    
    public String getButtonNavigationUrl() {
        return this.b.h;
    }
    
    public String getButtonText() {
        return this.b.g;
    }
    
    public Integer getButtonUiType() {
        return this.b.i;
    }
    
    public String getText() {
        return this.b.e;
    }
    
    public vdu getType() {
        return ajfa.a;
    }
    
    public Integer getUiType() {
        return this.b.f;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("DownloadsPageBannerEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
