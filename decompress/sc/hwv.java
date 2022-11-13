import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import android.support.v4.app.Fragment$SavedState;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneBackStack;

// 
// Decompiled by Procyon v0.6.0
// 

final class hwv
{
    public final Object a;
    public final Object b;
    public final PaneBackStack c;
    public final Fragment$SavedState d;
    public final Fragment$SavedState e;
    public final PaneDescriptor f;
    public final boolean g;
    public final boolean h;
    
    public hwv() {
    }
    
    public hwv(final Object a, final Object b, final PaneBackStack c, final Fragment$SavedState d, final Fragment$SavedState e, final PaneDescriptor f, final boolean g, final boolean h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hwv) {
            final hwv hwv = (hwv)o;
            final Object a = this.a;
            if (a == null) {
                if (hwv.a != null) {
                    return false;
                }
            }
            else if (!a.equals(hwv.a)) {
                return false;
            }
            final Object b = this.b;
            if (b == null) {
                if (hwv.b != null) {
                    return false;
                }
            }
            else if (!b.equals(hwv.b)) {
                return false;
            }
            final PaneBackStack c = this.c;
            if (c == null) {
                if (hwv.c != null) {
                    return false;
                }
            }
            else if (!c.equals(hwv.c)) {
                return false;
            }
            final Fragment$SavedState d = this.d;
            if (d == null) {
                if (hwv.d != null) {
                    return false;
                }
            }
            else if (!d.equals(hwv.d)) {
                return false;
            }
            final Fragment$SavedState e = this.e;
            if (e == null) {
                if (hwv.e != null) {
                    return false;
                }
            }
            else if (!e.equals(hwv.e)) {
                return false;
            }
            final PaneDescriptor f = this.f;
            if (f == null) {
                if (hwv.f != null) {
                    return false;
                }
            }
            else if (!f.equals(hwv.f)) {
                return false;
            }
            if (this.g == hwv.g && this.h == hwv.h) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final Object a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Object b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final PaneBackStack c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final Fragment$SavedState d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final Fragment$SavedState e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final PaneDescriptor f = this.f;
        if (f != null) {
            hashCode = f.hashCode();
        }
        final boolean g = this.g;
        int n = 1237;
        int n2;
        if (!g) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        if (this.h) {
            n = 1231;
        }
        return (((((((hashCode2 ^ 0xD5009D89) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode) * 1000003 ^ n2) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.d);
        final String value5 = String.valueOf(this.e);
        final String value6 = String.valueOf(this.f);
        final boolean g = this.g;
        final boolean h = this.h;
        final StringBuilder sb = new StringBuilder("RetainedState{superState=null, primaryState=");
        sb.append(value);
        sb.append(", detailState=");
        sb.append(value2);
        sb.append(", detailBackStack=");
        sb.append(value3);
        sb.append(", primarySavedState=");
        sb.append(value4);
        sb.append(", detailSavedState=");
        sb.append(value5);
        sb.append(", detailRetainedDescriptor=");
        sb.append(value6);
        sb.append(", showingDetail=");
        sb.append(g);
        sb.append(", startedInOfflineMode=");
        sb.append(h);
        sb.append("}");
        return sb.toString();
    }
}
