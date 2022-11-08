// 
// Decompiled by Procyon v0.6.0
// 

public final class cqp
{
    public final String a;
    public final int b;
    public final int c;
    
    public cqp(final String a, final int b, final int c) {
        a.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof cqp)) {
            return false;
        }
        final cqp cqp = (cqp)o;
        return atnh.c((Object)this.a, (Object)cqp.a) && this.b == cqp.b && this.c == cqp.c;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 31 + this.b) * 31 + this.c;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        sb.append(this.b);
        sb.append(", systemId=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
