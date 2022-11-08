// 
// Decompiled by Procyon v0.6.0
// 

public final class arjc implements atjj, arhr
{
    private static final Object a;
    private volatile atjj b;
    private volatile Object c;
    
    static {
        a = new Object();
    }
    
    private arjc(final atjj b) {
        this.c = arjc.a;
        this.b = b;
    }
    
    public static arhr b(final atjj atjj) {
        if (atjj instanceof arhr) {
            return (arhr)atjj;
        }
        atjj.getClass();
        return (arhr)new arjc(atjj);
    }
    
    public static atjj c(final atjj atjj) {
        atjj.getClass();
        if (atjj instanceof arjc) {
            return atjj;
        }
        return (atjj)new arjc(atjj);
    }
    
    public final Object a() {
        final Object c = this.c;
        final Object a = arjc.a;
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
