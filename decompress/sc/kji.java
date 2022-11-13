// 
// Decompiled by Procyon v0.6.0
// 

public final class kji
{
    public final boolean a;
    public final ajut b;
    public final aiqj c;
    public final algl d;
    
    public kji() {
    }
    
    public kji(final boolean a, final ajut b, final aiqj c, final algl d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static kji a() {
        return new kji(true, null, null, null);
    }
    
    public static kji b(final ajut ajut, final aiqj aiqj, final algl algl) {
        return new kji(false, ajut, aiqj, algl);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof kji) {
            final kji kji = (kji)o;
            if (this.a == kji.a) {
                final ajut b = this.b;
                if (b == null) {
                    if (kji.b != null) {
                        return false;
                    }
                }
                else if (!((ahbh)b).equals((Object)kji.b)) {
                    return false;
                }
                final aiqj c = this.c;
                if (c == null) {
                    if (kji.c != null) {
                        return false;
                    }
                }
                else if (!((ahbh)c).equals((Object)kji.c)) {
                    return false;
                }
                final algl d = this.d;
                final algl d2 = kji.d;
                if (d == null) {
                    if (d2 != null) {
                        return false;
                    }
                }
                else if (!((ahbh)d).equals((Object)d2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (!this.a) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        final ajut b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = ((ahbh)b).hashCode();
        }
        final aiqj c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = ((ahbh)c).hashCode();
        }
        final algl d = this.d;
        if (d != null) {
            hashCode = ((ahbh)d).hashCode();
        }
        return (((n ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final String value3 = String.valueOf(this.d);
        final StringBuilder sb = new StringBuilder("RulesetValidationResult{isValid=");
        sb.append(a);
        sb.append(", errorText=");
        sb.append(value);
        sb.append(", errorCommand=");
        sb.append(value2);
        sb.append(", validationError=");
        sb.append(value3);
        sb.append("}");
        return sb.toString();
    }
}
