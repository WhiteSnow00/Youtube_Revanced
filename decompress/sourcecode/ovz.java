// 
// Decompiled by Procyon v0.6.0
// 

public final class ovz
{
    public Long a;
    public Long b;
    public Long c;
    public Integer d;
    public owb e;
    private String f;
    
    public final owd a() {
        final String f = this.f;
        if (f != null) {
            return new owd(f, this.a, this.b, this.c, this.d, this.e);
        }
        throw new IllegalStateException("Missing required properties: name");
    }
    
    public final void b(final String f) {
        if (f != null) {
            this.f = f;
            return;
        }
        throw new NullPointerException("Null name");
    }
}
