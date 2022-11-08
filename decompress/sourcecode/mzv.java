// 
// Decompiled by Procyon v0.6.0
// 

public final class mzv
{
    public final mzs a;
    public final mzu b;
    public final long c;
    private final mzy d;
    private final mzt e;
    
    public mzv() {
    }
    
    public mzv(final mzs a, final mzy d, final mzu b, final mzt e, final long c) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.e = e;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof mzv) {
            final mzv mzv = (mzv)o;
            if (this.a.equals(mzv.a) && this.d.equals(mzv.d) && this.b.equals(mzv.b) && this.e.equals(mzv.e) && this.c == mzv.c) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.d.hashCode();
        final int hashCode3 = this.b.hashCode();
        final int hashCode4 = this.e.hashCode();
        final long c = this.c;
        return ((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ (int)(c >>> 32 ^ c);
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.d);
        final String value3 = String.valueOf(this.b);
        final String value4 = String.valueOf(this.e);
        final long c = this.c;
        final StringBuilder sb = new StringBuilder("Signals{buildInfo=");
        sb.append(value);
        sb.append(", systemProperties=");
        sb.append(value2);
        sb.append(", identifiers=");
        sb.append(value3);
        sb.append(", callerInfo=");
        sb.append(value4);
        sb.append(", signalCollectionTimeMillis=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
