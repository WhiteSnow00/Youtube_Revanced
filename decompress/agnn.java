// 
// Decompiled by Procyon v0.6.0
// 

public final class agnn
{
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;
    public final int g;
    
    static {
        a().a();
    }
    
    public agnn() {
    }
    
    public agnn(final String a, final int g, final String b, final String c, final long d, final long e, final String f) {
        this.a = a;
        this.g = g;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static agnm a() {
        final agnm agnm = new agnm();
        agnm.d(0L);
        agnm.c(1);
        agnm.b(0L);
        return agnm;
    }
    
    public final boolean b() {
        return this.g == 5;
    }
    
    public final boolean c() {
        final int g = this.g;
        return g == 2 || g == 1;
    }
    
    public final boolean d() {
        return this.g == 4;
    }
    
    public final boolean e() {
        return this.g == 3;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof agnn) {
            final agnn agnn = (agnn)o;
            final String a = this.a;
            if (a == null) {
                if (agnn.a != null) {
                    return false;
                }
            }
            else if (!a.equals(agnn.a)) {
                return false;
            }
            final int g = this.g;
            final int g2 = agnn.g;
            if (g == 0) {
                throw null;
            }
            if (g == g2) {
                final String b = this.b;
                if (b == null) {
                    if (agnn.b != null) {
                        return false;
                    }
                }
                else if (!b.equals(agnn.b)) {
                    return false;
                }
                final String c = this.c;
                if (c == null) {
                    if (agnn.c != null) {
                        return false;
                    }
                }
                else if (!c.equals(agnn.c)) {
                    return false;
                }
                if (this.d == agnn.d && this.e == agnn.e) {
                    final String f = this.f;
                    final String f2 = agnn.f;
                    if (f == null) {
                        if (f2 != null) {
                            return false;
                        }
                    }
                    else if (!f.equals(f2)) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }
    
    public final agnm f() {
        return new agnm(this);
    }
    
    public final agnn g() {
        final agnm f = this.f();
        f.d = "BAD CONFIG";
        f.c(5);
        return f.a();
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final int g = this.g;
        if (g != 0) {
            final String b = this.b;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final String c = this.c;
            int hashCode4;
            if (c == null) {
                hashCode4 = 0;
            }
            else {
                hashCode4 = c.hashCode();
            }
            final long d = this.d;
            final int n = (int)(d ^ d >>> 32);
            final long e = this.e;
            final int n2 = (int)(e ^ e >>> 32);
            final String f = this.f;
            if (f != null) {
                hashCode = f.hashCode();
            }
            return ((((((hashCode2 ^ 0xF4243) * 1000003 ^ g) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ n) * 1000003 ^ n2) * 1000003 ^ hashCode;
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final int g = this.g;
        String s;
        if (g != 1) {
            if (g != 2) {
                if (g != 3) {
                    if (g != 4) {
                        if (g != 5) {
                            s = "null";
                        }
                        else {
                            s = "REGISTER_ERROR";
                        }
                    }
                    else {
                        s = "REGISTERED";
                    }
                }
                else {
                    s = "UNREGISTERED";
                }
            }
            else {
                s = "NOT_GENERATED";
            }
        }
        else {
            s = "ATTEMPT_MIGRATION";
        }
        final String b = this.b;
        final String c = this.c;
        final long d = this.d;
        final long e = this.e;
        final String f = this.f;
        final StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(a);
        sb.append(", registrationStatus=");
        sb.append(s);
        sb.append(", authToken=");
        sb.append(b);
        sb.append(", refreshToken=");
        sb.append(c);
        sb.append(", expiresInSecs=");
        sb.append(d);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(e);
        sb.append(", fisError=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
