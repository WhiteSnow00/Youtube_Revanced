// 
// Decompiled by Procyon v0.6.0
// 

final class bve implements bud
{
    final bud a;
    final bvf b;
    
    public bve(final bvf b, final bud a) {
        this.b = b;
        this.a = a;
    }
    
    public final long a() {
        return this.a.a();
    }
    
    public final bub b(final long n) {
        final bub b = this.a.b(n);
        final bue a = b.a;
        final bue bue = new bue(a.b, a.c + this.b.a);
        final bue b2 = b.b;
        return new bub(bue, new bue(b2.b, b2.c + this.b.a));
    }
    
    public final boolean c() {
        return this.a.c();
    }
}
