// 
// Decompiled by Procyon v0.6.0
// 

public final class aelo
{
    public static final aelo a;
    public final aeln b;
    private final Object c;
    
    static {
        a = new aelo(null, 0L, false);
    }
    
    public aelo(final Object c, final long n, final boolean b) {
        this.c = c;
        this.b = new aeln(n, c != null, b);
    }
    
    public final boolean a() {
        return this.b.b;
    }
    
    public final boolean b() {
        agot.E(this.a(), (Object)"Cannot call isValid() for a CacheResult that does not have content");
        return this.b.c;
    }
    
    @Override
    public final String toString() {
        final aeln b = this.b;
        if (!b.b) {
            return "CacheResult.cacheMiss";
        }
        if (!b.c) {
            final String value = String.valueOf(this.c);
            final StringBuilder sb = new StringBuilder("CacheResult.cacheInvalid{data=");
            sb.append(value);
            sb.append("}");
            return sb.toString();
        }
        final String value2 = String.valueOf(this.c);
        final long a = this.b.a;
        final StringBuilder sb2 = new StringBuilder("CacheResult.cacheHit{data=");
        sb2.append(value2);
        sb2.append(", timestamp=");
        sb2.append(a);
        sb2.append("}");
        return sb2.toString();
    }
}