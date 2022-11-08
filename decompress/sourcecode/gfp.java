import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

final class gfp extends gfw
{
    private final PaneDescriptor a;
    private final ggh b;
    private final PaneDescriptor c;
    
    public gfp(final PaneDescriptor a, final ggh b, final PaneDescriptor c) {
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
    public ggh c() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gfw) {
            final gfw gfw = (gfw)o;
            final PaneDescriptor a = this.a;
            if (a == null) {
                if (gfw.a() != null) {
                    return false;
                }
            }
            else if (!a.equals(gfw.a())) {
                return false;
            }
            final ggh b = this.b;
            if (b == null) {
                if (gfw.c() != null) {
                    return false;
                }
            }
            else if (!b.equals((Object)gfw.c())) {
                return false;
            }
            if (this.c.equals(gfw.b())) {
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
        final ggh b = this.b;
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
