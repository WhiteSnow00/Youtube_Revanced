// 
// Decompiled by Procyon v0.6.0
// 

public final class aacp implements aacr
{
    public final aaco a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    private final int g;
    
    public aacp(final aaco a, final int g, final int b, final int c, final int d, final int e, final boolean f) {
        this.a = a;
        this.g = g;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final int a() {
        return this.a.e - this.g;
    }
    
    public final int b() {
        return this.d;
    }
    
    public final int c() {
        return this.a.e;
    }
    
    public final String d() {
        return this.a.a;
    }
    
    public final boolean e() {
        return !this.f() && this.g == 0;
    }
    
    public final boolean f() {
        return this.a.g;
    }
}
