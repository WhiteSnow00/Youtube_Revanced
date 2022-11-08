// 
// Decompiled by Procyon v0.6.0
// 

public final class cpa
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    
    public cpa(final boolean a, final boolean b, final boolean c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof cpa)) {
            return false;
        }
        final cpa cpa = (cpa)o;
        return this.a == cpa.a && this.b == cpa.b && this.c == cpa.c && this.d == cpa.d;
    }
    
    @Override
    public final int hashCode() {
        return (((this.a ? 1 : 0) * 31 + (this.b ? 1 : 0)) * 31 + (this.c ? 1 : 0)) * 31 + (this.d ? 1 : 0);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("NetworkState(isConnected=");
        sb.append(this.a);
        sb.append(", isValidated=");
        sb.append(this.b);
        sb.append(", isMetered=");
        sb.append(this.c);
        sb.append(", isNotRoaming=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
