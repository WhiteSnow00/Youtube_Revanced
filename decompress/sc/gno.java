import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gno
{
    public final Optional a;
    public final boolean b;
    
    public gno() {
    }
    
    public gno(final Optional a, final boolean b) {
        if (a != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("Null downloadedVideo");
    }
    
    public static gno a(final Optional optional, final boolean b) {
        return new gno(optional, b);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gno) {
            final gno gno = (gno)o;
            if (this.a.equals((Object)gno.a) && this.b == gno.b) {
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
        final String string = this.a.toString();
        final boolean b = this.b;
        final StringBuilder sb = new StringBuilder("AsyncResolutionResult{downloadedVideo=");
        sb.append(string);
        sb.append(", shouldCompleteResolve=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
