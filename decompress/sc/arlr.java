// 
// Decompiled by Procyon v0.6.0
// 

public final class arlr implements atke, arkg
{
    private static final Object a;
    private volatile atke b;
    private volatile Object c;
    
    static {
        a = new Object();
    }
    
    private arlr(final atke b) {
        this.c = arlr.a;
        this.b = b;
    }
    
    public static arkg b(final atke atke) {
        if (atke instanceof arkg) {
            return (arkg)atke;
        }
        atke.getClass();
        return (arkg)new arlr(atke);
    }
    
    public static atke c(final atke atke) {
        atke.getClass();
        if (atke instanceof arlr) {
            return atke;
        }
        return (atke)new arlr(atke);
    }
    
    public final Object a() {
        final Object c = this.c;
        final Object a = arlr.a;
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
