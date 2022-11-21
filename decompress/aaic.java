// 
// Decompiled by Procyon v0.6.0
// 

public final class aaic
{
    public final aske a;
    public final aske b;
    public asln c;
    public asln d;
    private final tkq e;
    private final aaks f;
    private volatile boolean g;
    private volatile boolean h;
    private volatile boolean i;
    private volatile boolean j;
    
    public aaic(final tkq e, final aske a, final aske b, final aaks f) {
        this.c = null;
        this.d = null;
        this.e = e;
        this.a = a;
        this.b = b;
        this.f = f;
    }
    
    public final void a(final aaia aaia) {
        if (this.b()) {
            ((aahu)aaia).m();
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
