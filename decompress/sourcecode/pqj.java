// 
// Decompiled by Procyon v0.6.0
// 

public final class pqj
{
    public final String a;
    public final String b;
    public final pqi c;
    public final pqk d;
    public final String e;
    public final Long f;
    public final Integer g;
    public final boolean h;
    public final boolean i;
    public final Integer j;
    private final String k;
    
    public pqj() {
    }
    
    public pqj(final String a, final String b, final pqi c, final pqk d, final String e, final Long f, final String k, final Integer g, final boolean h, final boolean i, final Integer j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.k = k;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof pqj) {
            final pqj pqj = (pqj)o;
            if (this.a.equals(pqj.a)) {
                final String b = this.b;
                if (b == null) {
                    if (pqj.b != null) {
                        return false;
                    }
                }
                else if (!b.equals(pqj.b)) {
                    return false;
                }
                final pqi c = this.c;
                if (c == null) {
                    if (pqj.c != null) {
                        return false;
                    }
                }
                else if (!c.equals(pqj.c)) {
                    return false;
                }
                final pqk d = this.d;
                if (d == null) {
                    if (pqj.d != null) {
                        return false;
                    }
                }
                else if (!d.equals(pqj.d)) {
                    return false;
                }
                if (this.e.equals(pqj.e) && this.f.equals(pqj.f)) {
                    final String k = this.k;
                    if (k == null) {
                        if (pqj.k != null) {
                            return false;
                        }
                    }
                    else if (!k.equals(pqj.k)) {
                        return false;
                    }
                    final Integer g = this.g;
                    if (g == null) {
                        if (pqj.g != null) {
                            return false;
                        }
                    }
                    else if (!g.equals(pqj.g)) {
                        return false;
                    }
                    if (this.h == pqj.h && this.i == pqj.i) {
                        final Integer j = this.j;
                        final Integer i = pqj.j;
                        if (j == null) {
                            if (i != null) {
                                return false;
                            }
                        }
                        else if (!j.equals(i)) {
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final pqi c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final pqk d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final int hashCode6 = this.e.hashCode();
        final int hashCode7 = this.f.hashCode();
        final String k = this.k;
        int hashCode8;
        if (k == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = k.hashCode();
        }
        final Integer g = this.g;
        int hashCode9;
        if (g == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = g.hashCode();
        }
        int n = 1237;
        int n2;
        if (!this.h) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        if (this.i) {
            n = 1231;
        }
        final Integer j = this.j;
        if (j != null) {
            hashCode2 = j.hashCode();
        }
        return (((((((((((hashCode ^ 0xF4243) * -721379959 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ hashCode8) * 583896283 ^ hashCode9) * -721379959 ^ 0x4D5) * 1000003 ^ n2) * 1000003 ^ n) * 1000003 ^ hashCode2;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final String value = String.valueOf(this.c);
        final String value2 = String.valueOf(this.d);
        final String e = this.e;
        final Long f = this.f;
        final String k = this.k;
        final Integer g = this.g;
        final boolean h = this.h;
        final boolean i = this.i;
        final Integer j = this.j;
        final StringBuilder sb = new StringBuilder("GnpConfig{clientId=");
        sb.append(a);
        sb.append(", selectionTokens=null, gcmSenderProjectId=");
        sb.append(b);
        sb.append(", environment=");
        sb.append(value);
        sb.append(", systemTrayNotificationConfig=");
        sb.append(value2);
        sb.append(", deviceName=");
        sb.append(e);
        sb.append(", registrationStalenessTimeMs=");
        sb.append(f);
        sb.append(", scheduledTaskService=");
        sb.append(k);
        sb.append(", apiKey=null, gnpApiKey=null, jobSchedulerAllowedIDsRange=");
        sb.append(g);
        sb.append(", firebaseOptions=null, forceLogging=false, disableEntrypoints=");
        sb.append(h);
        sb.append(", useDefaultFirebaseApp=");
        sb.append(i);
        sb.append(", timeToLiveDays=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
