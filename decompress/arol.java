// 
// Decompiled by Procyon v0.6.0
// 

public final class arol implements atnb, arna
{
    private static final Object a;
    private volatile atnb b;
    private volatile Object c;
    
    static {
        a = new Object();
    }
    
    private arol(final atnb b) {
        this.c = arol.a;
        this.b = b;
    }
    
    public static arna b(final atnb atnb) {
        if (atnb instanceof arna) {
            return (arna)atnb;
        }
        atnb.getClass();
        return new arol(atnb);
    }
    
    public static atnb c(final atnb atnb) {
        atnb.getClass();
        if (atnb instanceof arol) {
            return atnb;
        }
        return new arol(atnb);
    }
    
    @Override
    public final Object a() {
        final Object c = this.c;
        final Object a = arol.a;
        final Object o = c;
        if (c == a) {
            synchronized (this) {
                if (this.c == a) {
                    final Object a2 = this.b.a();
                    final Object c2 = this.c;
                    if (c2 != a && c2 != a2) {
                        final StringBuilder sb = new StringBuilder("Scoped provider was invoked recursively returning different results: ");
                        sb.append(c2);
                        sb.append(" & ");
                        sb.append(a2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.c = a2;
                    this.b = null;
                }
            }
        }
        return o;
    }
}
