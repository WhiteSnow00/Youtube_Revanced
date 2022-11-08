import java.util.Arrays;
import java.math.BigInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class argo
{
    public byte[] a;
    public argj[] b;
    
    public argo() {
        this.a = new byte[0];
        this.b = null;
    }
    
    public final int a() {
        final int length = this.a.length;
        final argj[] b = this.b;
        int n = length;
        if (b != null) {
            final int length2 = b.length;
            n = length;
            if (length2 > 0) {
                n = length + 2 + length2 * 6;
            }
        }
        return n;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final argo argo = (argo)o;
        if (!new BigInteger(this.a).equals(new BigInteger(argo.a))) {
            return false;
        }
        final argj[] b = this.b;
        if (b != null) {
            if (Arrays.equals(b, argo.b)) {
                return true;
            }
        }
        else if (argo.b == null) {
            return true;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final byte[] a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = Arrays.hashCode(a);
        }
        else {
            hashCode2 = 0;
        }
        final argj[] b = this.b;
        if (b != null) {
            hashCode = Arrays.hashCode(b);
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final String a = dpr.a(this.a);
        final String string = Arrays.toString(this.b);
        final StringBuilder sb = new StringBuilder(a.length() + 18 + String.valueOf(string).length());
        sb.append("Entry{iv=");
        sb.append(a);
        sb.append(", pairs=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
