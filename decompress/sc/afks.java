// 
// Decompiled by Procyon v0.6.0
// 

final class afks extends afkt
{
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private int f;
    
    public afks(final String b, final String c, final int d, final String e) {
        this.f = 0;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final int a() {
        return (char)this.d;
    }
    
    public final String b() {
        return this.b.replace('/', '.');
    }
    
    public final String c() {
        return this.e;
    }
    
    public final String d() {
        return this.c;
    }
    
    public final boolean equals(final Object o) {
        if (o instanceof afks) {
            final afks afks = (afks)o;
            if (this.b.equals(afks.b) && this.c.equals(afks.c) && this.d == afks.d) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        int f;
        if ((f = this.f) == 0) {
            f = ((this.b.hashCode() + 4867) * 31 + this.c.hashCode()) * 31 + this.d;
            this.f = f;
        }
        return f;
    }
}
