import j$.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agcv extends aewr
{
    public final int a;
    public final agcu b;
    private final int c;
    
    public agcv(final int a, final int c, final agcu b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public final int at() {
        final agcu b = this.b;
        if (b == agcu.d) {
            return this.c;
        }
        if (b != agcu.a) {
            if (b != agcu.b) {
                if (b != agcu.c) {
                    throw new IllegalStateException("Unknown variant");
                }
            }
        }
        return this.c + 5;
    }
    
    public final boolean au() {
        return this.b != agcu.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof agcv)) {
            return false;
        }
        final agcv agcv = (agcv)o;
        return agcv.a == this.a && agcv.at() == this.at() && agcv.b == this.b;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.c, this.b });
    }
    
    @Override
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
