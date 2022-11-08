// 
// Decompiled by Procyon v0.6.0
// 

public final class aeml
{
    public final aexq a;
    public final aexq b;
    public final aexq c;
    public final aexq d;
    
    public aeml() {
    }
    
    public aeml(final aexq a, final aexq b, final aexq c, final aexq d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final aeml a(final aemp aemp) {
        return new aeml(this.a, this.b, (aexq)aewp.a, aexq.k(aemp));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aeml) {
            final aeml aeml = (aeml)o;
            if (this.a.equals(aeml.a) && this.b.equals(aeml.b) && this.c.equals(aeml.c) && this.d.equals(aeml.d)) {
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
