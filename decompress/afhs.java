// 
// Decompiled by Procyon v0.6.0
// 

public final class afhs
{
    public final Object a;
    int b;
    final afhz c;
    
    public afhs() {
    }
    
    public afhs(final afhz c, final int b) {
        this.c = c;
        this.a = c.a[b];
        this.b = b;
    }
    
    public final int a() {
        final int b = this.b;
        Label_0054: {
            if (b != -1) {
                final afhz c = this.c;
                if (b < c.c && adkp.ae(this.a, c.a[b])) {
                    break Label_0054;
                }
            }
            this.b = this.c.d(this.a);
        }
        final int b2 = this.b;
        if (b2 == -1) {
            return 0;
        }
        return this.c.b[b2];
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof afhs) {
            final afhs afhs = (afhs)o;
            if (this.a() == afhs.a() && adkp.ae(this.a, afhs.a)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final Object a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return hashCode ^ this.a();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final int a = this.a();
        if (a == 1) {
            return value;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.append(" x ");
        sb.append(a);
        return sb.toString();
    }
}
