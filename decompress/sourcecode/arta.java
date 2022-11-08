import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arta
{
    private static final AtomicLong b;
    public final long a;
    private final String c;
    private final String d;
    
    static {
        b = new AtomicLong();
    }
    
    public arta(final String c, final String d, final long a) {
        c.getClass();
        agot.v(c.isEmpty() ^ true, (Object)"empty type");
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public static arta a(final Class clazz, final String s) {
        clazz.getClass();
        final String simpleName = clazz.getSimpleName();
        String substring;
        if (!simpleName.isEmpty()) {
            substring = simpleName;
        }
        else {
            substring = clazz.getName().substring(clazz.getPackage().getName().length() + 1);
        }
        return b(substring, s);
    }
    
    public static arta b(final String s, final String s2) {
        return new arta(s, s2, arta.b.incrementAndGet());
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        final String c = this.c;
        final long a = this.a;
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(c);
        sb2.append("<");
        sb2.append(a);
        sb2.append(">");
        sb.append(sb2.toString());
        if (this.d != null) {
            sb.append(": (");
            sb.append(this.d);
            sb.append(')');
        }
        return sb.toString();
    }
}
