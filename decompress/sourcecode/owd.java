// 
// Decompiled by Procyon v0.6.0
// 

public final class owd
{
    public final String a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Integer e;
    public final owb f;
    
    public owd() {
    }
    
    public owd(final String a, final Long b, final Long c, final Long d, final Integer e, final owb f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static ovz a() {
        return new ovz();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof owd) {
            final owd owd = (owd)o;
            if (this.a.equals(owd.a)) {
                final Long b = this.b;
                if (b == null) {
                    if (owd.b != null) {
                        return false;
                    }
                }
                else if (!b.equals(owd.b)) {
                    return false;
                }
                final Long c = this.c;
                if (c == null) {
                    if (owd.c != null) {
                        return false;
                    }
                }
                else if (!c.equals(owd.c)) {
                    return false;
                }
                final Long d = this.d;
                if (d == null) {
                    if (owd.d != null) {
                        return false;
                    }
                }
                else if (!d.equals(owd.d)) {
                    return false;
                }
                final Integer e = this.e;
                if (e == null) {
                    if (owd.e != null) {
                        return false;
                    }
                }
                else if (!e.equals(owd.e)) {
                    return false;
                }
                final owb f = this.f;
                final owb f2 = owd.f;
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
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final Long b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Long c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final Long d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final Integer e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final owb f = this.f;
        if (f != null) {
            hashCode2 = f.hashCode();
        }
        return (((((hashCode ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode2;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final Long b = this.b;
        final Long c = this.c;
        final Long d = this.d;
        final Integer e = this.e;
        final String value = String.valueOf(this.f);
        final StringBuilder sb = new StringBuilder("TimeSpan{name=");
        sb.append(a);
        sb.append(", startTimeUs=");
        sb.append(b);
        sb.append(", endTimeUs=");
        sb.append(c);
        sb.append(", spanLengthTimeUs=");
        sb.append(d);
        sb.append(", parentId=");
        sb.append(e);
        sb.append(", spanInfo=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
