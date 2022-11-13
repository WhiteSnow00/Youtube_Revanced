// 
// Decompiled by Procyon v0.6.0
// 

public final class acoo
{
    public final boolean a;
    
    public acoo() {
    }
    
    public acoo(final boolean a) {
        this.a = a;
    }
    
    public static acoo a() {
        return new acoo(false);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof acoo && this.a == ((acoo)o).a);
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (!this.a) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return n ^ 0xF4243;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final StringBuilder sb = new StringBuilder("ContinuationContext{wasScheduled=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
