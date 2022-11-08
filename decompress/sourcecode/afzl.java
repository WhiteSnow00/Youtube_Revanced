import j$.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afzl extends aesy
{
    public final int a;
    public final afzk b;
    private final int c;
    private final afzj d;
    
    public afzl(final int a, final int c, final afzk b, final afzj d) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    public final int bb() {
        final afzk b = this.b;
        if (b == afzk.d) {
            return this.c;
        }
        if (b != afzk.a) {
            if (b != afzk.b) {
                if (b != afzk.c) {
                    throw new IllegalStateException("Unknown variant");
                }
            }
        }
        return this.c + 5;
    }
    
    public final boolean bc() {
        return this.b != afzk.d;
    }
    
    public final boolean equals(final Object o) {
        if (!(o instanceof afzl)) {
            return false;
        }
        final afzl afzl = (afzl)o;
        return afzl.a == this.a && afzl.bb() == this.bb() && afzl.b == this.b && afzl.d == this.d;
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
