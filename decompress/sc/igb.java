// 
// Decompiled by Procyon v0.6.0
// 

public final class igb implements ttg
{
    public final igd a;
    public final afeq b;
    public final afeq c;
    public final String d;
    public final String e;
    public final String f;
    public final aezp g;
    private final int h;
    
    public igb(final igd a, final afeq b, final afeq c, final String d, final String e, final String f, final aezp g, final int h) {
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final void a(final Object o) {
        if (this.h != 0) {
            final igd a = this.a;
            final afeq b = this.b;
            final afeq c = this.c;
            final String d = this.d;
            final String e = this.e;
            final String f = this.f;
            final aezp g = this.g;
            ttr.b("Failed to read the offlineStreamSelection value.".concat(String.valueOf(String.valueOf(o))));
            a.b(b, c, d, e, false, f, g);
            return;
        }
        this.a.b(this.b, this.c, this.d, this.e, Boolean.TRUE.equals(o), this.f, this.g);
    }
}
