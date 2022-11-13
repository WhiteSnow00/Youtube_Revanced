import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afiq extends afft
{
    public static final afiq a;
    private static final Object[] f;
    final transient Object[] b;
    public final transient int c;
    final transient Object[] d;
    public final transient int e;
    private final transient int g;
    
    static {
        final Object[] array = f = new Object[0];
        a = new afiq(array, 0, array, 0, 0);
    }
    
    public afiq(final Object[] b, final int c, final Object[] d, final int g, final int e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = g;
        this.e = e;
    }
    
    public final boolean a() {
        return true;
    }
    
    public final int c(final Object[] array, final int n) {
        System.arraycopy(this.b, 0, array, n, this.e);
        return n + this.e;
    }
    
    public final boolean contains(final Object o) {
        final Object[] d = this.d;
        if (o == null || d.length == 0) {
            return false;
        }
        int ah = agpc.ah(o);
        while (true) {
            ah &= this.g;
            final Object o2 = d[ah];
            if (o2 == null) {
                return false;
            }
            if (o2.equals(o)) {
                return true;
            }
            ++ah;
        }
    }
    
    public final int e() {
        return this.e;
    }
    
    public final int f() {
        return 0;
    }
    
    public final afeq h() {
        return afeq.j(this.b, this.e);
    }
    
    public final int hashCode() {
        return this.c;
    }
    
    public final /* bridge */ Iterator iterator() {
        return this.k();
    }
    
    public final afke k() {
        return (afke)((afeh)this).g().D();
    }
    
    public final boolean l() {
        return false;
    }
    
    public final Object[] m() {
        return this.b;
    }
    
    public final int size() {
        return this.e;
    }
}
