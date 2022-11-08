// 
// Decompiled by Procyon v0.6.0
// 

public final class aeol
{
    public final int a;
    public final int b;
    
    public aeol() {
    }
    
    public aeol(final int a) {
        this.a = a;
        this.b = 2;
    }
    
    public static aeol a(final int n) {
        return new aeol(n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aeol) {
            final aeol aeol = (aeol)o;
            if (this.a == aeol.a && this.b == aeol.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a ^ 0xF4243) * 1000003 ^ this.b;
    }
    
    @Override
    public final String toString() {
        String s;
        if (this.a != 1) {
            s = "CACHE";
        }
        else {
            s = "FILES";
        }
        String s2;
        if (this.b != 1) {
            s2 = "CREDENTIAL";
        }
        else {
            s2 = "DEVICE";
        }
        final StringBuilder sb = new StringBuilder("StorageSpec{type=");
        sb.append(s);
        sb.append(", directBoot=");
        sb.append(s2);
        sb.append("}");
        return sb.toString();
    }
}
