import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class guh
{
    public static final guh a;
    static final guh b;
    static final guh c;
    public final boolean d;
    public final int e;
    public final String f;
    
    static {
        a = new guh(false, 0, null);
        b = a(2, "Action not supported");
        c = a(4, "Required premium account to perform action in background");
    }
    
    private guh(final boolean d, final int e, final String f) {
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static guh a(final int n, final String s) {
        return new guh(true, n, s);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final guh guh = (guh)o;
                if (this.d == guh.d && this.e == guh.e && adkp.ae((Object)this.f, (Object)guh.f)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.d, this.e, this.f });
    }
    
    @Override
    public final String toString() {
        if (!this.d) {
            return "MediaSessionResult Successful";
        }
        final int e = this.e;
        final String f = this.f;
        final StringBuilder sb = new StringBuilder("MediaSessionResult Error: ");
        sb.append(e);
        sb.append(" : ");
        sb.append(f);
        return sb.toString();
    }
}
