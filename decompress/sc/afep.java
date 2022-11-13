import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class afep extends afeq
{
    final transient int a;
    final transient int b;
    final afeq c;
    
    public afep(final afeq c, final int a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final afeq b(final int n, final int n2) {
        adkp.P(n, n2, this.b);
        final afeq c = this.c;
        final int a = this.a;
        return c.b(n + a, n2 + a);
    }
    
    public final int e() {
        return ((afeh)this.c).f() + this.a + this.b;
    }
    
    public final int f() {
        return ((afeh)this.c).f() + this.a;
    }
    
    public final Object get(final int n) {
        adkp.Y(n, this.b);
        return this.c.get(n + this.a);
    }
    
    public final boolean l() {
        return true;
    }
    
    public final Object[] m() {
        return ((afeh)this.c).m();
    }
    
    public final int size() {
        return this.b;
    }
    
    public final /* bridge */ List subList(final int n, final int n2) {
        return (List)this.b(n, n2);
    }
}
