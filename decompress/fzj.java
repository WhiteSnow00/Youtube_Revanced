import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fzj
{
    public final CharSequence a;
    public final View b;
    public final afft c;
    public final ActionBarColor d;
    public final int e;
    
    public fzj() {
    }
    
    public fzj(final CharSequence a, final View b, final afft c, final ActionBarColor d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static tqt a() {
        final tqt tqt = new tqt();
        tqt.f((afft)afiq.a);
        tqt.c(ezt.u());
        tqt.d(0);
        return tqt;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof fzj) {
            final fzj fzj = (fzj)o;
            final CharSequence a = this.a;
            if (a == null) {
                if (fzj.a != null) {
                    return false;
                }
            }
            else if (!a.equals(fzj.a)) {
                return false;
            }
            final View b = this.b;
            if (b == null) {
                if (fzj.b != null) {
                    return false;
                }
            }
            else if (!b.equals(fzj.b)) {
                return false;
            }
            if (this.c.equals((Object)fzj.c) && this.d.equals(fzj.d) && this.e == fzj.e) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final CharSequence a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final View b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return ((((hashCode2 ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.d);
        final int e = this.e;
        final StringBuilder sb = new StringBuilder("ActionBarModel{title=");
        sb.append(value);
        sb.append(", customView=");
        sb.append(value2);
        sb.append(", menuItems=");
        sb.append(value3);
        sb.append(", iconTintColor=");
        sb.append(value4);
        sb.append(", homeAction=");
        sb.append(e);
        sb.append("}");
        return sb.toString();
    }
}
