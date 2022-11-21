import j$.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agde extends aewr
{
    public final int a;
    public final agdd b;
    private final int c;
    private final agdc d;
    
    public agde(final int a, final int c, final agdd b, final agdc d) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    public final int at() {
        final agdd b = this.b;
        if (b == agdd.d) {
            return this.c;
        }
        if (b != agdd.a) {
            if (b != agdd.b) {
                if (b != agdd.c) {
                    throw new IllegalStateException("Unknown variant");
                }
            }
        }
        return this.c + 5;
    }
    
    public final boolean au() {
        return this.b != agdd.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof agde)) {
            return false;
        }
        final agde agde = (agde)o;
        return agde.a == this.a && agde.at() == this.at() && agde.b == this.b && agde.d == this.d;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.c, this.b, this.d });
    }
    
    @Override
    public final String toString() {
        final String e = this.b.e;
        final String f = this.d.f;
        final int c = this.c;
        final int a = this.a;
        final StringBuilder sb = new StringBuilder("HMAC Parameters (variant: ");
        sb.append(e);
        sb.append(", hashType: ");
        sb.append(f);
        sb.append(", ");
        sb.append(c);
        sb.append("-byte tags, and ");
        sb.append(a);
        sb.append("-byte key)");
        return sb.toString();
    }
}
