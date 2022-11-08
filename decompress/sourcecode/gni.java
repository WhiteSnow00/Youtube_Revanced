import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gni
{
    public final Optional a;
    public final boolean b;
    
    public gni() {
    }
    
    public gni(final Optional a, final boolean b) {
        if (a != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("Null downloadedVideo");
    }
    
    public static gni a(final Optional optional, final boolean b) {
        return new gni(optional, b);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gni) {
            final gni gni = (gni)o;
            if (this.a.equals((Object)gni.a) && this.b == gni.b) {
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
