// 
// Decompiled by Procyon v0.6.0
// 

public final class aeol
{
    public final aezp a;
    public final aezp b;
    public final aezp c;
    public final aezp d;
    
    public aeol() {
    }
    
    public aeol(final aezp a, final aezp b, final aezp c, final aezp d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final aeol a(final aeop aeop) {
        return new aeol(this.a, this.b, (aezp)aeyo.a, aezp.k((Object)aeop));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aeol) {
            final aeol aeol = (aeol)o;
            if (this.a.equals((Object)aeol.a) && this.b.equals((Object)aeol.b) && this.c.equals((Object)aeol.c) && this.d.equals((Object)aeol.d)) {
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
