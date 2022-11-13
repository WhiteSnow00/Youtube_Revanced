import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ggs
{
    public final PaneDescriptor a;
    public final int b;
    public final boolean c;
    
    public ggs() {
    }
    
    public ggs(final PaneDescriptor a, final int b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static ski b() {
        return new ski();
    }
    
    public final ski a() {
        final ski ski = new ski();
        ski.a = this.a;
        ski.g(this.b);
        ski.f(this.c);
        return ski;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ggs) {
            final ggs ggs = (ggs)o;
            final PaneDescriptor a = this.a;
            if (a == null) {
                if (ggs.a != null) {
                    return false;
                }
            }
            else if (!a.equals(ggs.a)) {
                return false;
            }
            if (this.b == ggs.b && this.c == ggs.c) {
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
