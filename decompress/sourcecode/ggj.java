import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ggj
{
    public final PaneDescriptor a;
    public final int b;
    public final boolean c;
    
    public ggj() {
    }
    
    public ggj(final PaneDescriptor a, final int b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static sic b() {
        return new sic();
    }
    
    public final sic a() {
        final sic sic = new sic();
        sic.a = this.a;
        sic.g(this.b);
        sic.f(this.c);
        return sic;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ggj) {
            final ggj ggj = (ggj)o;
            final PaneDescriptor a = this.a;
            if (a == null) {
                if (ggj.a != null) {
                    return false;
                }
            }
            else if (!a.equals(ggj.a)) {
                return false;
            }
            if (this.b == ggj.b && this.c == ggj.c) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final PaneDescriptor a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final int b = this.b;
        int n;
        if (!this.c) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return ((hashCode ^ 0xF4243) * 1000003 ^ b) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final int b = this.b;
        final boolean c = this.c;
        final StringBuilder sb = new StringBuilder("PaneNavigationAction{targetDescriptor=");
        sb.append(value);
        sb.append(", navigationType=");
        sb.append(b);
        sb.append(", clearHistory=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
