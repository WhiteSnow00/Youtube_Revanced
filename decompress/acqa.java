// 
// Decompiled by Procyon v0.6.0
// 

public final class acqa
{
    public final boolean a;
    
    public acqa() {
    }
    
    public acqa(final boolean a) {
        this.a = a;
    }
    
    public static acqa a() {
        return new acqa(false);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof acqa && this.a == ((acqa)o).a);
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
