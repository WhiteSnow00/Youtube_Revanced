// 
// Decompiled by Procyon v0.6.0
// 

public final class apsa implements vdt
{
    public static final vdu a;
    private final apsb b;
    
    static {
        a = new aprz();
    }
    
    public apsa(final apsb b) {
        this.b = b;
    }
    
    public final afdu b() {
        return new afds().g();
    }
    
    public final byte[] d() {
        return ((agxl)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof apsa && this.b.equals((Object)((apsa)o).b);
    }
    
    public Boolean getCanGoBack() {
        return this.b.j;
    }
    
    public Boolean getCanGoForward() {
        return this.b.k;
    }
    
    public String getFullUrl() {
        return this.b.d;
    }
    
    public String getHostName() {
        return this.b.e;
    }
    
    public Boolean getIsGoogleDomain() {
        return this.b.g;
    }
    
    public Boolean getIsLoaded() {
        return this.b.i;
    }
    
    public String getPageTitle() {
        return this.b.h;
    }
    
    public String getSchema() {
        return this.b.f;
    }
    
    public vdu getType() {
        return apsa.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("WebViewEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
