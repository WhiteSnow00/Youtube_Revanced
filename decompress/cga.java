import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cga
{
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;
    
    public cga(String upperCase, final String b, final boolean c, int n, final String e, final int f) {
        this.a = upperCase;
        this.b = b;
        this.c = c;
        this.d = n;
        this.e = e;
        this.f = f;
        final Locale us = Locale.US;
        us.getClass();
        upperCase = b.toUpperCase(us);
        upperCase.getClass();
        if (asfn.l(upperCase, "INT")) {
            n = 3;
        }
        else if (!asfn.l(upperCase, "CHAR") && !asfn.l(upperCase, "CLOB") && !asfn.l(upperCase, "TEXT")) {
            if (asfn.l(upperCase, "BLOB")) {
                n = 5;
            }
            else if (!asfn.l(upperCase, "REAL") && !asfn.l(upperCase, "FLOA") && !asfn.l(upperCase, "DOUB")) {
                n = 1;
            }
            else {
                n = 4;
            }
        }
        else {
            n = 2;
        }
        this.g = n;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof cga)) {
            return false;
        }
        final int d = this.d;
        final cga cga = (cga)o;
        if (d == cga.d) {
            if (!atoc.c((Object)this.a, (Object)cga.a)) {
                return false;
            }
            if (this.c != cga.c) {
                return false;
            }
            if (this.f == 1 && cga.f == 2) {
                final String e = this.e;
                if (e != null) {
                    if (!bym.f(e, cga.e)) {
                        return false;
                    }
                }
            }
            if (this.f == 2 && cga.f == 1) {
                final String e2 = cga.e;
                if (e2 != null) {
                    if (!bym.f(e2, this.e)) {
                        return false;
                    }
                }
            }
            Label_0188: {
                if (this.f == cga.f) {
                    final String e3 = this.e;
                    if (e3 != null) {
                        if (bym.f(e3, cga.e)) {
                            break Label_0188;
                        }
                    }
                    else if (cga.e == null) {
                        break Label_0188;
                    }
                    return false;
                }
            }
            if (this.g == cga.g) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int g = this.g;
        int n;
        if (!this.c) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return ((hashCode * 31 + g) * 31 + n) * 31 + this.d;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.a);
        sb.append("', type='");
        sb.append(this.b);
        sb.append("', affinity='");
        sb.append(this.g);
        sb.append("', notNull=");
        sb.append(this.c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.d);
        sb.append(", defaultValue='");
        sb.append(this.e);
        sb.append("'}");
        return sb.toString();
    }
}
