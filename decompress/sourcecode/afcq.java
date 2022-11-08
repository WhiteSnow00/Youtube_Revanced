import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class afcq extends afcr
{
    final transient int a;
    final transient int b;
    final /* synthetic */ afcr c;
    
    public afcq(final afcr c, final int a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final afcr b(final int n, final int n2) {
        agot.C(n, n2, this.b);
        final afcr c = this.c;
        final int a = this.a;
        return c.b(n + a, n2 + a);
    }
    
    public final int e() {
        return ((afci)this.c).f() + this.a + this.b;
    }
    
    public final int f() {
        return ((afci)this.c).f() + this.a;
    }
    
    public final Object get(final int n) {
        agot.L(n, this.b);
        return this.c.get(n + this.a);
    }
    
    public final boolean l() {
        return true;
    }
    
    public final Object[] m() {
        return ((afci)this.c).m();
    }
    
    public final int size() {
        return this.b;
    }
}
