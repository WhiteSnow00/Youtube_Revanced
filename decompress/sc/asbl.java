import java.net.URI;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asbl extends arwv
{
    public final /* bridge */ arwu a(final URI uri, final arwp arwp) {
        if ("dns".equals(uri.getScheme())) {
            final String path = uri.getPath();
            path.getClass();
            adkp.O(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", (Object)path, (Object)uri);
            final String substring = path.substring(1);
            uri.getAuthority();
            return new asbk(substring, arwp, asby.l, afam.c(), arva.h(this.getClass().getClassLoader()));
        }
        return null;
    }
    
    public final String b() {
        return "dns";
    }
    
    protected final void c() {
    }
    
    public final void d() {
    }
}
