// 
// Decompiled by Procyon v0.6.0
// 

public final class mzz
{
    public final long a;
    public final long b;
    public final long c;
    
    public mzz() {
    }
    
    public mzz(final byte[] array) {
        this.a = -30L;
        this.b = 3L;
        this.c = 30L;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof mzz) {
            final mzz mzz = (mzz)o;
            if (this.a == mzz.a && this.b == mzz.b && this.c == mzz.c) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        return ((int)this.b ^ ((int)(a ^ a >>> 32) ^ 0xF4243) * 1000003) * -721379959 ^ (int)this.c;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final long b = this.b;
        final long c = this.c;
        final StringBuilder sb = new StringBuilder("TimestampBounds{decisionValidFromDays=");
        sb.append(a);
        sb.append(", decisionValidToDays=");
        sb.append(b);
        sb.append(", expirationValidFromDays=0, expirationValidToDays=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
