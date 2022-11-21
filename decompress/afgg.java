import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class afgg extends afgh
{
    final transient int a;
    final transient int b;
    final afgh c;
    
    public afgg(final afgh c, final int a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final afgh b(final int n, final int n2) {
        adme.S(n, n2, this.b);
        final afgh c = this.c;
        final int a = this.a;
        return c.b(n + a, n2 + a);
    }
    
    @Override
    public final int e() {
        return this.c.f() + this.a + this.b;
    }
    
    @Override
    public final int f() {
        return this.c.f() + this.a;
    }
    
    @Override
    public final Object get(final int n) {
        adme.ab(n, this.b);
        return this.c.get(n + this.a);
    }
    
    @Override
    public final boolean l() {
        return true;
    }
    
    @Override
    public final Object[] m() {
        return this.c.m();
    }
    
    @Override
    public final int size() {
        return this.b;
    }
    
    @Override
    public final /* bridge */ List subList(final int n, final int n2) {
        return this.b(n, n2);
    }
}
