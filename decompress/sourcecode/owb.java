import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class owb
{
    public final afdu a;
    public final String b;
    public final Integer c;
    public final Status d;
    public final String e;
    public final String f;
    public final Integer g;
    public final Boolean h;
    public final int i;
    public final adgk j;
    
    public owb() {
    }
    
    public owb(final afdu a, final adgk j, final String b, final Integer c, final Status d, final String e, final String f, final Integer g, final Boolean h, final int i, final byte[] array) {
        this.a = a;
        this.j = j;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public static owa a() {
        final owa owa = new owa();
        owa.b(1);
        return owa;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof owb) {
            final owb owb = (owb)o;
            if (this.a.equals((Object)owb.a)) {
                final adgk j = this.j;
                if (j == null) {
                    if (owb.j != null) {
                        return false;
                    }
                }
                else if (!j.equals(owb.j)) {
                    return false;
                }
                final String b = this.b;
                if (b == null) {
                    if (owb.b != null) {
                        return false;
                    }
                }
                else if (!b.equals(owb.b)) {
                    return false;
                }
                final Integer c = this.c;
                if (c == null) {
                    if (owb.c != null) {
                        return false;
                    }
                }
                else if (!c.equals(owb.c)) {
                    return false;
                }
                final Status d = this.d;
                if (d == null) {
                    if (owb.d != null) {
                        return false;
                    }
                }
                else if (!d.equals((Object)owb.d)) {
                    return false;
                }
                final String e = this.e;
                if (e == null) {
                    if (owb.e != null) {
                        return false;
                    }
                }
                else if (!e.equals(owb.e)) {
                    return false;
                }
                final String f = this.f;
                if (f == null) {
                    if (owb.f != null) {
                        return false;
                    }
                }
                else if (!f.equals(owb.f)) {
                    return false;
                }
                final Integer g = this.g;
                if (g == null) {
                    if (owb.g != null) {
                        return false;
                    }
                }
                else if (!g.equals(owb.g)) {
                    return false;
                }
                final Boolean h = this.h;
                if (h == null) {
                    if (owb.h != null) {
                        return false;
                    }
                }
                else if (!h.equals(owb.h)) {
                    return false;
                }
                if (this.i == owb.i) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final adgk j = this.j;
        int hashCode2 = 0;
        int hashCode3;
        if (j == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = j.hashCode();
        }
        final String b = this.b;
        int hashCode4;
        if (b == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = b.hashCode();
        }
        final Integer c = this.c;
        int hashCode5;
        if (c == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = c.hashCode();
        }
        final Status d = this.d;
        int hashCode6;
        if (d == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = d.hashCode();
        }
        final String e = this.e;
        int hashCode7;
        if (e == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = e.hashCode();
        }
        final String f = this.f;
        int hashCode8;
        if (f == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = f.hashCode();
        }
        final Integer g = this.g;
        int hashCode9;
        if (g == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = g.hashCode();
        }
        final Boolean h = this.h;
        if (h != null) {
            hashCode2 = h.hashCode();
        }
        return (((((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ hashCode8) * 1000003 ^ hashCode9) * 1000003 ^ hashCode2) * 1000003 ^ this.i;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.j);
        final String b = this.b;
        final Integer c = this.c;
        final String value3 = String.valueOf(this.d);
        final String e = this.e;
        final String f = this.f;
        final Integer g = this.g;
        final Boolean h = this.h;
        final int i = this.i;
        final StringBuilder sb = new StringBuilder("SpanInfo{templateUris=");
        sb.append(value);
        sb.append(", threadInfo=");
        sb.append(value2);
        sb.append(", nodeId=");
        sb.append(b);
        sb.append(", commandExtensionId=");
        sb.append(c);
        sb.append(", commandExecutionStatus=");
        sb.append(value3);
        sb.append(", jsModuleIdentifier=");
        sb.append(e);
        sb.append(", jsFunctionName=");
        sb.append(f);
        sb.append(", jsBindingExtensionId=");
        sb.append(g);
        sb.append(", jsIsSynchronous=");
        sb.append(h);
        sb.append(", materializationCount=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
