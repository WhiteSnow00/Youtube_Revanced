// 
// Decompiled by Procyon v0.6.0
// 

public final class cqk
{
    public final String a;
    public final Long b;
    
    public cqk(final String a, final Long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof cqk)) {
            return false;
        }
        final cqk cqk = (cqk)o;
        return atnh.c((Object)this.a, (Object)cqk.a) && atnh.c((Object)this.b, (Object)cqk.b);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Preference(key=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
