// 
// Decompiled by Procyon v0.6.0
// 

public final class aeqe
{
    public final afbh a;
    public final afbh b;
    public final afbh c;
    public final afbh d;
    
    public aeqe() {
    }
    
    public aeqe(final afbh a, final afbh b, final afbh c, final afbh d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final aeqe a(final aeqi aeqi) {
        return new aeqe(this.a, this.b, afag.a, afbh.k(aeqi));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aeqe) {
            final aeqe aeqe = (aeqe)o;
            if (this.a.equals(aeqe.a) && this.b.equals(aeqe.b) && this.c.equals(aeqe.c) && this.d.equals(aeqe.d)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode();
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final String string2 = this.b.toString();
        final String string3 = this.c.toString();
        final String string4 = this.d.toString();
        final StringBuilder sb = new StringBuilder("LocalSubscriptionState{maybeLocalDataSource=");
        sb.append(string);
        sb.append(", executingLoad=");
        sb.append(string2);
        sb.append(", pendingTopicResult=");
        sb.append(string3);
        sb.append(", publishedTopicResult=");
        sb.append(string4);
        sb.append("}");
        return sb.toString();
    }
}
