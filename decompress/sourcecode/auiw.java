// 
// Decompiled by Procyon v0.6.0
// 

public final class auiw implements auja, auiz
{
    public volatile auja a;
    public volatile auiz b;
    private final String c;
    private final auja d;
    
    public auiw(final auja d) {
        this.c = "T";
        this.d = d;
    }
    
    public final int a(final aufq aufq) {
        final auja d = this.d;
        final auja a = this.a;
        int n = d.a(aufq) + a.a(aufq);
        if (a.b(aufq, 1) > 0) {
            n += this.c.length();
        }
        return n;
    }
    
    public final int b(final aufq aufq, final int n) {
        int b;
        final int n2 = b = this.d.b(aufq, n);
        if (n2 < n) {
            b = n2 + this.a.b(aufq, n);
        }
        return b;
    }
    
    public final void c(final StringBuffer sb, final aufq aufq) {
        final auja d = this.d;
        final auja a = this.a;
        d.c(sb, aufq);
        if (a.b(aufq, 1) > 0) {
            sb.append(this.c);
        }
        a.c(sb, aufq);
    }
}
