import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fzb
{
    public final CharSequence a;
    public final View b;
    public final afdu c;
    public final ActionBarColor d;
    public final int e;
    
    public fzb() {
    }
    
    public fzb(final CharSequence a, final View b, final afdu c, final ActionBarColor d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static too a() {
        final too too = new too();
        too.f((afdu)afgq.a);
        too.c(ezp.u());
        too.d(0);
        return too;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof fzb) {
            final fzb fzb = (fzb)o;
            final CharSequence a = this.a;
            if (a == null) {
                if (fzb.a != null) {
                    return false;
                }
            }
            else if (!a.equals(fzb.a)) {
                return false;
            }
            final View b = this.b;
            if (b == null) {
                if (fzb.b != null) {
                    return false;
                }
            }
            else if (!b.equals(fzb.b)) {
                return false;
            }
            if (this.c.equals((Object)fzb.c) && this.d.equals(fzb.d) && this.e == fzb.e) {
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
