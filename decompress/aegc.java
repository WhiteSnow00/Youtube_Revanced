import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aegc
{
    public static final aegc a;
    public final Integer b;
    public final Map c;
    
    static {
        a = a().g();
    }
    
    public aegc() {
    }
    
    public aegc(final Integer b, final Map c) {
        this.b = b;
        this.c = c;
    }
    
    static agmu a() {
        final agmu agmu = new agmu((byte[])null);
        agmu.i(new HashMap());
        return agmu;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aegc) {
            final aegc aegc = (aegc)o;
            final Integer b = this.b;
            if (b == null) {
                if (aegc.b != null) {
                    return false;
                }
            }
            else if (!b.equals(aegc.b)) {
                return false;
            }
            if (this.c.equals(aegc.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final Integer b = this.b;
        int hashCode;
        if (b == null) {
            hashCode = 0;
        }
        else {
            hashCode = b.hashCode();
        }
        return (hashCode ^ 0xF4243) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final Integer b = this.b;
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("LocalTestingConfig{defaultSplitInstallErrorCode=");
        sb.append(b);
        sb.append(", splitInstallErrorCodeByModule=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
