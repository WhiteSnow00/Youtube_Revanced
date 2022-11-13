// 
// Decompiled by Procyon v0.6.0
// 

final class fds extends fdv
{
    private final String a;
    private final amrc b;
    
    public fds(final String a, final amrc b) {
        if (a == null) {
            throw new NullPointerException("Null targetId");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null nextContinuationData");
    }
    
    public amrc a() {
        return this.b;
    }
    
    public String b() {
        return this.a;
    }
    
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof fdv) {
            final fdv fdv = (fdv)o;
            if (this.a.equals(fdv.b()) && ((ahbh)this.b).equals((Object)fdv.a())) {
                return true;
            }
        }
        return false;
    }
    
    public int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ ((ahbh)this.b).hashCode();
    }
    
    public String toString() {
        final String a = this.a;
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("LoadNextEvent{targetId=");
        sb.append(a);
        sb.append(", nextContinuationData=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
