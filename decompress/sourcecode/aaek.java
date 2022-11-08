// 
// Decompiled by Procyon v0.6.0
// 

public final class aaek
{
    public final asgt a;
    public final asgt b;
    public asic c;
    public asic d;
    private final thh e;
    private final aaha f;
    private volatile boolean g;
    private volatile boolean h;
    private volatile boolean i;
    private volatile boolean j;
    
    public aaek(final thh e, final asgt a, final asgt b, final aaha f) {
        this.c = null;
        this.d = null;
        this.e = e;
        this.a = a;
        this.b = b;
        this.f = f;
    }
    
    public final void a(final aaei aaei) {
        if (this.b()) {
            ((aaeb)aaei).m();
        }
    }
    
    public final boolean b() {
        final boolean o = this.e.o();
        final boolean h = this.e.o() && this.e.m();
        final boolean i = this.e.o() && this.e.r() && !this.e.i();
        final boolean j = this.f.e() && this.e.q();
        if (this.g == o && this.i == i && this.h == h && this.j == j) {
            return false;
        }
        this.g = o;
        this.i = i;
        this.h = h;
        this.j = j;
        return true;
    }
}
