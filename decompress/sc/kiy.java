import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kiy
{
    public final boolean a;
    public final afeq b;
    public final afeq c;
    
    public kiy() {
    }
    
    public kiy(final boolean a, final afeq b, final afeq c) {
        this.a = a;
        if (b == null) {
            throw new NullPointerException("Null invalidInputCommands");
        }
        this.b = b;
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null validationErrors");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof kiy) {
            final kiy kiy = (kiy)o;
            if (this.a == kiy.a && agpi.V((List)this.b, kiy.b) && agpi.V((List)this.c, kiy.c)) {
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
        return ((n ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final String string = this.b.toString();
        final String string2 = this.c.toString();
        final StringBuilder sb = new StringBuilder("FormValidationResult{isValid=");
        sb.append(a);
        sb.append(", invalidInputCommands=");
        sb.append(string);
        sb.append(", validationErrors=");
        sb.append(string2);
        sb.append("}");
        return sb.toString();
    }
}
