// 
// Decompiled by Procyon v0.6.0
// 

public final class apuk implements vfu
{
    public static final vfv a;
    private final apul b;
    
    static {
        a = new apuj();
    }
    
    public apuk(final apul b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return new apui(this.b.toBuilder());
    }
    
    public final afft b() {
        return new affr().g();
    }
    
    public final byte[] d() {
        return ((agzk)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof apuk && this.b.equals((Object)((apuk)o).b);
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
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return apuk.a;
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
