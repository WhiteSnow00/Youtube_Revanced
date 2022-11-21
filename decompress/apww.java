// 
// Decompiled by Procyon v0.6.0
// 

public final class apww implements vhc
{
    public static final vhd a;
    private final apwx b;
    
    static {
        a = new apwv();
    }
    
    public apww(final apwx b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new apwu(this.b.toBuilder());
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
        return o instanceof apww && this.b.equals(((apww)o).b);
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
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return apww.a;
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
