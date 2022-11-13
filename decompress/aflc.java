import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public class aflc
{
    public final String a;
    public final boolean b;
    public final long c;
    private final Class d;
    private final boolean e;
    
    protected aflc(final String s, final Class clazz, final boolean b) {
        this(s, clazz, b, true);
    }
    
    private aflc(final String a, final Class d, final boolean b, final boolean e) {
        if (a.isEmpty()) {
            throw new IllegalArgumentException("identifier must not be empty");
        }
        int i = 0;
        if (aeuz.i(a.charAt(0))) {
            for (int j = 1; j < a.length(); ++j) {
                final char char1 = a.charAt(j);
                if (!aeuz.i(char1) && (char1 < '0' || char1 > '9') && char1 != '_') {
                    throw new IllegalArgumentException("identifier must contain only ASCII letters, digits or underscore: ".concat(a));
                }
            }
            this.a = a;
            this.d = d;
            this.b = b;
            this.e = e;
            int identityHashCode = System.identityHashCode(this);
            long c = 0L;
            while (i < 5) {
                c |= 1L << (identityHashCode & 0x3F);
                identityHashCode >>>= 6;
                ++i;
            }
            this.c = c;
            return;
        }
        throw new IllegalArgumentException("identifier must start with an ASCII letter: ".concat(a));
    }
    
    public static aflc c(final String s, final Class clazz) {
        return new aflc(s, clazz, false, false);
    }
    
    protected void a(final Iterator iterator, final aflb aflb) {
        while (iterator.hasNext()) {
            this.b(iterator.next(), aflb);
        }
    }
    
    protected void b(final Object o, final aflb aflb) {
        aflb.a(this.a, o);
    }
    
    public final Object d(final Object o) {
        return this.d.cast(o);
    }
    
    public final void e(final Object o, final aflb aflb) {
        if (this.e && afmn.a() > 20) {
            aflb.a(this.a, o);
            return;
        }
        this.b(o, aflb);
    }
    
    public final void f(final Iterator iterator, final aflb aflb) {
        if (!this.b) {
            throw new IllegalStateException("non repeating key");
        }
        if (this.e && afmn.a() > 20) {
            while (iterator.hasNext()) {
                aflb.a(this.a, iterator.next());
            }
            return;
        }
        this.a(iterator, aflb);
    }
    
    @Override
    public final String toString() {
        final String name = this.getClass().getName();
        final String a = this.a;
        final String name2 = this.d.getName();
        final StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("/");
        sb.append(a);
        sb.append("[");
        sb.append(name2);
        sb.append("]");
        return sb.toString();
    }
}
