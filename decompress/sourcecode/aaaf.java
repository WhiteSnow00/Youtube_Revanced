import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaaf
{
    public static final aaaf a;
    public static final aaaf b;
    public static final aaaf c;
    private static final afcr h;
    public final boolean d;
    public final afcr e;
    public final int f;
    public final int g;
    
    static {
        h = afcr.q();
        final aaae a2 = a();
        a2.a = 2;
        a = a2.a();
        final aaae a3 = a();
        a3.a = 3;
        a3.c(true);
        b = a3.a();
        final aaae a4 = a();
        a4.a = 3;
        c = a4.a();
    }
    
    public aaaf() {
    }
    
    public aaaf(final int f, final int g, final boolean d, final afcr e) {
        this.f = f;
        this.g = g;
        this.d = d;
        this.e = e;
    }
    
    public static aaae a() {
        final aaae aaae = new aaae();
        aaae.c(false);
        aaae.b(aaaf.h);
        aaae.b = 1;
        return aaae;
    }
    
    public final aaae b() {
        return new aaae(this);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof aaaf)) {
            return false;
        }
        final aaaf aaaf = (aaaf)o;
        final int f = this.f;
        final int f2 = aaaf.f;
        if (f != 0) {
            if (f == f2) {
                final int g = this.g;
                final int g2 = aaaf.g;
                if (g == 0) {
                    throw null;
                }
                if (g == g2 && this.d == aaaf.d && adwd.ar((List)this.e, (Object)aaaf.e)) {
                    return true;
                }
            }
            return false;
        }
        throw null;
    }
    
    @Override
    public final int hashCode() {
        final int f = this.f;
        if (f == 0) {
            throw null;
        }
        final int g = this.g;
        if (g != 0) {
            int n;
            if (!this.d) {
                n = 1237;
            }
            else {
                n = 1231;
            }
            return (((f ^ 0xF4243) * 1000003 ^ g) * 1000003 ^ n) * 1000003 ^ this.e.hashCode();
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        final int f = this.f;
        String string = "null";
        String string2;
        if (f != 0) {
            string2 = Integer.toString(f - 1);
        }
        else {
            string2 = "null";
        }
        final int g = this.g;
        if (g != 0) {
            string = Integer.toString(g - 1);
        }
        final boolean d = this.d;
        final String value = String.valueOf(this.e);
        final StringBuilder sb = new StringBuilder("EntityControllerResult{orchestrationActionResult=");
        sb.append(string2);
        sb.append(", orchestrationFailureReason=");
        sb.append(string);
        sb.append(", retryable=");
        sb.append(d);
        sb.append(", additionalActions=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
