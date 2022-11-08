import j$.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afzc extends aesy
{
    public final int a;
    public final afzb b;
    private final int c;
    
    public afzc(final int a, final int c, final afzb b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public final int bb() {
        final afzb b = this.b;
        if (b == afzb.d) {
            return this.c;
        }
        if (b != afzb.a) {
            if (b != afzb.b) {
                if (b != afzb.c) {
                    throw new IllegalStateException("Unknown variant");
                }
            }
        }
        return this.c + 5;
    }
    
    public final boolean bc() {
        return this.b != afzb.d;
    }
    
    public final boolean equals(final Object o) {
        if (!(o instanceof afzc)) {
            return false;
        }
        final afzc afzc = (afzc)o;
        return afzc.a == this.a && afzc.bb() == this.bb() && afzc.b == this.b;
    }
    
    public final int hashCode() {
        return Objects.hash(new Object[] { this.c, this.b });
    }
    
    public final String toString() {
        final String e = this.b.e;
        final int c = this.c;
        final int a = this.a;
        final StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(e);
        sb.append(", ");
        sb.append(c);
        sb.append("-byte tags, and ");
        sb.append(a);
        sb.append("-byte key)");
        return sb.toString();
    }
}
