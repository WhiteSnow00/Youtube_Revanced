import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arxz
{
    private static final AtomicLong b;
    public final long a;
    private final String c;
    private final String d;
    
    static {
        b = new AtomicLong();
    }
    
    public arxz(final String c, final String d, final long a) {
        c.getClass();
        adme.L(c.isEmpty() ^ true, "empty type");
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public static arxz a(final Class clazz, final String s) {
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
    
    public static arxz b(final String s, final String s2) {
        return new arxz(s, s2, arxz.b.incrementAndGet());
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
