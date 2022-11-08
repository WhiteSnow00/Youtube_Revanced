// 
// Decompiled by Procyon v0.6.0
// 

public final class cqv
{
    public final String a;
    public final int b;
    
    public cqv(final String a, final int b) {
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof cqv)) {
            return false;
        }
        final cqv cqv = (cqv)o;
        return atnh.c((Object)this.a, (Object)cqv.a) && this.b == cqv.b;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
