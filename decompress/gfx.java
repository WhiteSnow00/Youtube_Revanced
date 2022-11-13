import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

final class gfx extends ggd
{
    private final PaneDescriptor a;
    private final ggq b;
    private final PaneDescriptor c;
    
    public gfx(final PaneDescriptor a, final ggq b, final PaneDescriptor c) {
        this.a = a;
        this.b = b;
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null newDescriptor");
    }
    
    @Override
    public PaneDescriptor a() {
        return this.a;
    }
    
    @Override
    public PaneDescriptor b() {
        return this.c;
    }
    
    @Override
    public ggq c() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ggd) {
            final ggd ggd = (ggd)o;
            final PaneDescriptor a = this.a;
            if (a == null) {
                if (ggd.a() != null) {
                    return false;
                }
            }
            else if (!a.equals(ggd.a())) {
                return false;
            }
            final ggq b = this.b;
            if (b == null) {
                if (ggd.c() != null) {
                    return false;
                }
            }
            else if (!b.equals(ggd.c())) {
                return false;
            }
            if (this.c.equals(ggd.b())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final PaneDescriptor a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final ggq b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return ((hashCode2 ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("FragmentReplaceEvent{currentDescriptor=");
        sb.append(value);
        sb.append(", currentFragment=");
        sb.append(value2);
        sb.append(", newDescriptor=");
        sb.append(value3);
        sb.append("}");
        return sb.toString();
    }
}
