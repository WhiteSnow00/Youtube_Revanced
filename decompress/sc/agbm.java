import j$.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agbm extends aeuz
{
    public final int a;
    public final agbl b;
    private final int c;
    private final agbk d;
    
    public agbm(final int a, final int c, final agbl b, final agbk d) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    public final int aG() {
        final agbl b = this.b;
        if (b == agbl.d) {
            return this.c;
        }
        if (b != agbl.a) {
            if (b != agbl.b) {
                if (b != agbl.c) {
                    throw new IllegalStateException("Unknown variant");
                }
            }
        }
        return this.c + 5;
    }
    
    public final boolean aH() {
        return this.b != agbl.d;
    }
    
    public final boolean equals(final Object o) {
        if (!(o instanceof agbm)) {
            return false;
        }
        final agbm agbm = (agbm)o;
        return agbm.a == this.a && agbm.aG() == this.aG() && agbm.b == this.b && agbm.d == this.d;
    }
    
    public final int hashCode() {
        return Objects.hash(new Object[] { this.c, this.b, this.d });
    }
    
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
