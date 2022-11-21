// 
// Decompiled by Procyon v0.6.0
// 

public final class agnp
{
    public final String a;
    public final String b;
    public final agns c;
    public final int d;
    private final String e;
    
    public agnp() {
    }
    
    public agnp(final String e, final String a, final String b, final agns c, final int d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof agnp) {
            final agnp agnp = (agnp)o;
            final String e = this.e;
            if (e == null) {
                if (agnp.e != null) {
                    return false;
                }
            }
            else if (!e.equals(agnp.e)) {
                return false;
            }
            final String a = this.a;
            if (a == null) {
                if (agnp.a != null) {
                    return false;
                }
            }
            else if (!a.equals(agnp.a)) {
                return false;
            }
            final String b = this.b;
            if (b == null) {
                if (agnp.b != null) {
                    return false;
                }
            }
            else if (!b.equals(agnp.b)) {
                return false;
            }
            final agns c = this.c;
            if (c == null) {
                if (agnp.c != null) {
                    return false;
                }
            }
            else if (!c.equals(agnp.c)) {
                return false;
            }
            final int d = this.d;
            final int d2 = agnp.d;
            if (d == 0) {
                if (d2 != 0) {
                    return false;
                }
            }
            else if (d != d2) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final String e = this.e;
        int n = 0;
        int hashCode;
        if (e == null) {
            hashCode = 0;
        }
        else {
            hashCode = e.hashCode();
        }
        final String a = this.a;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final agns c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final int d = this.d;
        if (d != 0) {
            n = d;
        }
        return ((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String e = this.e;
        final String a = this.a;
        final String b = this.b;
        final String value = String.valueOf(this.c);
        final int d = this.d;
        String s;
        if (d != 1) {
            if (d != 2) {
                s = "null";
            }
            else {
                s = "BAD_CONFIG";
            }
        }
        else {
            s = "OK";
        }
        final StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(e);
        sb.append(", fid=");
        sb.append(a);
        sb.append(", refreshToken=");
        sb.append(b);
        sb.append(", authToken=");
        sb.append(value);
        sb.append(", responseCode=");
        sb.append(s);
        sb.append("}");
        return sb.toString();
    }
}
