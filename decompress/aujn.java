// 
// Decompiled by Procyon v0.6.0
// 

public final class aujn implements aujr, aujq
{
    public volatile aujr a;
    public volatile aujq b;
    private final String c;
    private final aujr d;
    
    public aujn(final aujr d) {
        this.c = "T";
        this.d = d;
    }
    
    public final int a(final augh augh) {
        final aujr d = this.d;
        final aujr a = this.a;
        int n = d.a(augh) + a.a(augh);
        if (a.b(augh, 1) > 0) {
            n += this.c.length();
        }
        return n;
    }
    
    public final int b(final augh augh, final int n) {
        int b;
        final int n2 = b = this.d.b(augh, n);
        if (n2 < n) {
            b = n2 + this.a.b(augh, n);
        }
        return b;
    }
    
    public final void c(final StringBuffer sb, final augh augh) {
        final aujr d = this.d;
        final aujr a = this.a;
        d.c(sb, augh);
        if (a.b(augh, 1) > 0) {
            sb.append(this.c);
        }
        a.c(sb, augh);
    }
}
