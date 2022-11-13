// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ilo implements imb
{
    private final Class a;
    private final Class b;
    
    protected ilo(final Class a, final Class b) {
        this.a = a;
        this.b = b;
    }
    
    protected static final Object e(final afev afev, final String s) {
        if (afev == null) {
            final StringBuilder sb = new StringBuilder("Args not specified, `");
            sb.append(s);
            sb.append("` not available.");
            throw new IllegalStateException(sb.toString());
        }
        if (afev.containsKey(s)) {
            final Object value = afev.get(s);
            value.getClass();
            return value;
        }
        final StringBuilder sb2 = new StringBuilder("`");
        sb2.append(s);
        sb2.append("` not specified.");
        throw new IllegalStateException(sb2.toString());
    }
    
    public final Class c() {
        return this.a;
    }
    
    public final Class d() {
        return this.b;
    }
}
