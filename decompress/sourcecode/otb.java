import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class otb
{
    public final atjj a;
    public final String b;
    public final osx c;
    public final otg d;
    public final boolean e;
    public final Object f;
    public final otr g;
    public final boolean h;
    public final afcr i;
    public final boolean j;
    
    public otb() {
    }
    
    public otb(final atjj a, final String b, final osx c, final otg d, final boolean e, final Object f, final otr g, final boolean h, final afcr i, final boolean j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public static ota a(final osu osu) {
        final jex a = new jex(osu, 9);
        final ota ota = new ota();
        ota.a = (atjj)a;
        ota.d(true);
        ota.c = osx.a;
        ota.c(true);
        ota.b(false);
        ota.b = "Elements";
        return ota;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof otb) {
            final otb otb = (otb)o;
            if (this.a.equals(otb.a) && this.b.equals(otb.b) && this.c.equals(otb.c)) {
                final otg d = this.d;
                if (d == null) {
                    if (otb.d != null) {
                        return false;
                    }
                }
                else if (!d.equals(otb.d)) {
                    return false;
                }
                if (this.e == otb.e) {
                    final Object f = this.f;
                    if (f == null) {
                        if (otb.f != null) {
                            return false;
                        }
                    }
                    else if (!f.equals(otb.f)) {
                        return false;
                    }
                    final otr g = this.g;
                    if (g == null) {
                        if (otb.g != null) {
                            return false;
                        }
                    }
                    else if (!g.equals(otb.g)) {
                        return false;
                    }
                    if (this.h == otb.h) {
                        final afcr i = this.i;
                        if (i == null) {
                            if (otb.i != null) {
                                return false;
                            }
                        }
                        else if (!adwd.ar((List)i, otb.i)) {
                            return false;
                        }
                        if (this.j == otb.j) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final int hashCode3 = this.c.hashCode();
        final otg d = this.d;
        int hashCode4 = 0;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final boolean e = this.e;
        int n = 1237;
        int n2;
        if (!e) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        final Object f = this.f;
        int hashCode6;
        if (f == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = f.hashCode();
        }
        final otr g = this.g;
        int hashCode7;
        if (g == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = g.hashCode();
        }
        int n3;
        if (!this.h) {
            n3 = 1237;
        }
        else {
            n3 = 1231;
        }
        final afcr i = this.i;
        if (i != null) {
            hashCode4 = i.hashCode();
        }
        if (this.j) {
            n = 1231;
        }
        return (((((((((hashCode ^ 0xF4243) * -721379959 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode5) * 1000003 ^ n2) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ n3) * 1000003 ^ hashCode4) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String b = this.b;
        final String value2 = String.valueOf(this.c);
        final String value3 = String.valueOf(this.d);
        final boolean e = this.e;
        final String value4 = String.valueOf(this.f);
        final String value5 = String.valueOf(this.g);
        final boolean h = this.h;
        final String value6 = String.valueOf(this.i);
        final boolean j = this.j;
        final StringBuilder sb = new StringBuilder("ElementsConfig{converterProvider=");
        sb.append(value);
        sb.append(", layoutExecutor=null, logTag=");
        sb.append(b);
        sb.append(", perfLoggerFactory=");
        sb.append(value2);
        sb.append(", elementsInteractionLogger=");
        sb.append(value3);
        sb.append(", useIncrementalMount=");
        sb.append(e);
        sb.append(", userData=");
        sb.append(value4);
        sb.append(", recyclerConfig=");
        sb.append(value5);
        sb.append(", nestedScrollingEnabled=");
        sb.append(h);
        sb.append(", globalCommandDataDecorators=");
        sb.append(value6);
        sb.append(", clearComponentOnDetach=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
