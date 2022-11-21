// 
// Decompiled by Procyon v0.6.0
// 

public final class agns
{
    public final String a;
    public final long b;
    public final int c;
    
    public agns() {
    }
    
    public agns(final String a, final long b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static agnr a() {
        final agnr agnr = new agnr();
        agnr.b(0L);
        return agnr;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof agns) {
            final agns agns = (agns)o;
            final String a = this.a;
            if (a == null) {
                if (agns.a != null) {
                    return false;
                }
            }
            else if (!a.equals(agns.a)) {
                return false;
            }
            if (this.b == agns.b) {
                final int c = this.c;
                final int c2 = agns.c;
                if (c == 0) {
                    if (c2 != 0) {
                        return false;
                    }
                }
                else if (c != c2) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int n = 0;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final long b = this.b;
        final int c = this.c;
        if (c != 0) {
            n = c;
        }
        return ((hashCode ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32)) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final long b = this.b;
        final int c = this.c;
        String s;
        if (c != 1) {
            if (c != 2) {
                if (c != 3) {
                    s = "null";
                }
                else {
                    s = "AUTH_ERROR";
                }
            }
            else {
                s = "BAD_CONFIG";
            }
        }
        else {
            s = "OK";
        }
        final StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(b);
        sb.append(", responseCode=");
        sb.append(s);
        sb.append("}");
        return sb.toString();
    }
}
