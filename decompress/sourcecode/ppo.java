// 
// Decompiled by Procyon v0.6.0
// 

public final class ppo
{
    public final String a;
    public final boolean b;
    
    public ppo() {
    }
    
    public ppo(final String a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public final agsu a() {
        final agza builder = ((agzi)agsu.a).createBuilder();
        final String a = this.a;
        builder.copyOnWrite();
        final agsu agsu = (agsu)builder.instance;
        a.getClass();
        agsu.b |= 0x1;
        agsu.c = a;
        int n;
        if (!this.b) {
            n = 2;
        }
        else {
            n = 3;
        }
        builder.copyOnWrite();
        final agsu agsu2 = (agsu)builder.instance;
        agsu2.d = n - 1;
        agsu2.b |= 0x2;
        return (agsu)builder.build();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ppo) {
            final ppo ppo = (ppo)o;
            if (this.a.equals(ppo.a) && this.b == ppo.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int n;
        if (!this.b) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return (hashCode ^ 0xF4243) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final boolean b = this.b;
        final StringBuilder sb = new StringBuilder("ChimeNotificationChannelGroup{id=");
        sb.append(a);
        sb.append(", blocked=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
