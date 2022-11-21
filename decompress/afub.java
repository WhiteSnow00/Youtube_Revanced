import java.util.Arrays;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afub implements Serializable
{
    private static final afub c;
    public final int[] a;
    public final int b;
    
    static {
        c = new afub(new int[0]);
    }
    
    public afub(final int[] a) {
        final int length = a.length;
        this.a = a;
        this.b = length;
    }
    
    public final int a(final int n) {
        adme.ab(n, this.b);
        return this.a[n];
    }
    
    public final boolean b() {
        return this.b == 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof afub)) {
            return false;
        }
        final afub afub = (afub)o;
        if (this.b == afub.b) {
            for (int i = 0; i < this.b; ++i) {
                if (this.a(i) != afub.a(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int i = 0;
        int n = 1;
        while (i < this.b) {
            n = n * 31 + this.a[i];
            ++i;
        }
        return n;
    }
    
    Object readResolve() {
        if (this.b()) {
            return afub.c;
        }
        return this;
    }
    
    @Override
    public final String toString() {
        if (this.b()) {
            return "[]";
        }
        final StringBuilder sb = new StringBuilder(this.b * 5);
        sb.append('[');
        sb.append(this.a[0]);
        for (int i = 1; i < this.b; ++i) {
            sb.append(", ");
            sb.append(this.a[i]);
        }
        sb.append(']');
        return sb.toString();
    }
    
    Object writeReplace() {
        final int b = this.b;
        final int[] a = this.a;
        if (b < a.length) {
            return new afub(Arrays.copyOfRange(a, 0, b));
        }
        return this;
    }
}
