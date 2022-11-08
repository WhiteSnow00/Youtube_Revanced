import java.util.List;
import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class krv
{
    public final ActionBarColor a;
    public final ActionBarColor b;
    public final ActionBarColor c;
    public final ActionBarColor d;
    public final ActionBarColor e;
    private final afcr f;
    
    public krv() {
    }
    
    public krv(final ActionBarColor a, final ActionBarColor b, final ActionBarColor c, final ActionBarColor d, final ActionBarColor e, final afcr f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static kru a() {
        final kru kru = new kru();
        final afcr q = afcr.q();
        if (q != null) {
            kru.a = q;
            return kru;
        }
        throw new NullPointerException("Null menuItems");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof krv) {
            final krv krv = (krv)o;
            if (this.a.equals(krv.a) && this.b.equals(krv.b) && this.c.equals(krv.c) && this.d.equals(krv.d) && this.e.equals(krv.e) && adwd.ar((List)this.f, (Object)krv.f)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.d);
        final String value5 = String.valueOf(this.e);
        final String value6 = String.valueOf(this.f);
        final StringBuilder sb = new StringBuilder("ActionBarState{primaryText=");
        sb.append(value);
        sb.append(", secondaryText=");
        sb.append(value2);
        sb.append(", background=");
        sb.append(value3);
        sb.append(", statusBar=");
        sb.append(value4);
        sb.append(", iconTint=");
        sb.append(value5);
        sb.append(", menuItems=");
        sb.append(value6);
        sb.append("}");
        return sb.toString();
    }
}
