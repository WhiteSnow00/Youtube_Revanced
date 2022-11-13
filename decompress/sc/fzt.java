import android.text.TextUtils;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fzt
{
    public final String a;
    public final asht b;
    public final boolean c;
    public final fzu d;
    public final frk e;
    public final RecyclerView f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    
    public fzt() {
    }
    
    public fzt(final String a, final asht b, final boolean c, final fzu d, final frk e, final RecyclerView f, final boolean g, final boolean h, final boolean i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public static fzs a() {
        final fzs fzs = new fzs();
        fzs.f(false);
        fzs.d(false);
        return fzs;
    }
    
    public final boolean b() {
        return TextUtils.equals((CharSequence)this.a, (CharSequence)"FEhashtag");
    }
    
    public final boolean c() {
        return TextUtils.equals((CharSequence)this.a, (CharSequence)"FEwhat_to_watch");
    }
    
    public final boolean d() {
        return TextUtils.equals((CharSequence)this.a, (CharSequence)"FEsubscriptions");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof fzt) {
            final fzt fzt = (fzt)o;
            final String a = this.a;
            if (a == null) {
                if (fzt.a != null) {
                    return false;
                }
            }
            else if (!a.equals(fzt.a)) {
                return false;
            }
            if (this.b.equals(fzt.b) && this.c == fzt.c && this.d.equals(fzt.d) && this.e.equals(fzt.e) && this.f.equals(fzt.f) && this.g == fzt.g && this.h == fzt.h && this.i == fzt.i) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final int hashCode2 = this.b.hashCode();
        final boolean c = this.c;
        int n = 1237;
        int n2;
        if (!c) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        final int hashCode3 = this.d.hashCode();
        final int hashCode4 = this.e.hashCode();
        final int hashCode5 = this.f.hashCode();
        int n3;
        if (!this.g) {
            n3 = 1237;
        }
        else {
            n3 = 1231;
        }
        int n4;
        if (!this.h) {
            n4 = 1237;
        }
        else {
            n4 = 1231;
        }
        if (this.i) {
            n = 1231;
        }
        return ((((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ n2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String value = String.valueOf(this.b);
        final boolean c = this.c;
        final String value2 = String.valueOf(this.d);
        final String value3 = String.valueOf(this.e);
        final String value4 = String.valueOf(this.f);
        final boolean g = this.g;
        final boolean h = this.h;
        final boolean i = this.i;
        final StringBuilder sb = new StringBuilder("FeedFilterBarModel{feedId=");
        sb.append(a);
        sb.append(", isFilterAppliedObservable=");
        sb.append(value);
        sb.append(", isFilterApplied=");
        sb.append(c);
        sb.append(", shownCallback=");
        sb.append(value2);
        sb.append(", swipeRefreshUiController=");
        sb.append(value3);
        sb.append(", recyclerView=");
        sb.append(value4);
        sb.append(", isAccessibilityEnabled=");
        sb.append(g);
        sb.append(", shouldSkipHideAnimationOnAppStart=");
        sb.append(h);
        sb.append(", isGhostFeed=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
