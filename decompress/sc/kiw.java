// 
// Decompiled by Procyon v0.6.0
// 

public final class kiw
{
    public final boolean a;
    public final aiqj b;
    public final algl c;
    
    public kiw() {
    }
    
    public kiw(final boolean a, final aiqj b, final algl c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static kiw a(final boolean b, final aiqj aiqj, final algl algl) {
        return new kiw(b, aiqj, algl);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof kiw) {
            final kiw kiw = (kiw)o;
            if (this.a == kiw.a) {
                final aiqj b = this.b;
                if (b == null) {
                    if (kiw.b != null) {
                        return false;
                    }
                }
                else if (!((ahbh)b).equals((Object)kiw.b)) {
                    return false;
                }
                final algl c = this.c;
                final algl c2 = kiw.c;
                if (c == null) {
                    if (c2 != null) {
                        return false;
                    }
                }
                else if (!((ahbh)c).equals((Object)c2)) {
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
        final aiqj b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = ((ahbh)b).hashCode();
        }
        final algl c = this.c;
        if (c != null) {
            hashCode = ((ahbh)c).hashCode();
        }
        return ((n ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("InputValidationResult{isValid=");
        sb.append(a);
        sb.append(", errorCommand=");
        sb.append(value);
        sb.append(", validationError=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
