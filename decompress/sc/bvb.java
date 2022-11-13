// 
// Decompiled by Procyon v0.6.0
// 

final class bvb implements bua
{
    final bua a;
    final bvc b;
    
    public bvb(final bvc b, final bua a) {
        this.b = b;
        this.a = a;
    }
    
    public final long a() {
        return this.a.a();
    }
    
    public final bty b(final long n) {
        final bty b = this.a.b(n);
        final bub a = b.a;
        final bub bub = new bub(a.b, a.c + this.b.a);
        final bub b2 = b.b;
        return new bty(bub, new bub(b2.b, b2.c + this.b.a));
    }
    
    public final boolean c() {
        return this.a.c();
    }
}
