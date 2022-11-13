import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor;
import android.support.v4.app.Fragment$SavedState;
import com.google.android.apps.youtube.app.fragments.panels.PanelsBackStack;

// 
// Decompiled by Procyon v0.6.0
// 

final class hye
{
    public final Object a;
    public final Object b;
    public final PanelsBackStack c;
    public final Fragment$SavedState d;
    public final Fragment$SavedState e;
    public final PanelDescriptor f;
    public final PanelDescriptor g;
    
    public hye() {
    }
    
    public hye(final Object a, final Object b, final PanelsBackStack c, final Fragment$SavedState d, final Fragment$SavedState e, final PanelDescriptor f, final PanelDescriptor g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hye) {
            final hye hye = (hye)o;
            final Object a = this.a;
            if (a == null) {
                if (hye.a != null) {
                    return false;
                }
            }
            else if (!a.equals(hye.a)) {
                return false;
            }
            final Object b = this.b;
            if (b == null) {
                if (hye.b != null) {
                    return false;
                }
            }
            else if (!b.equals(hye.b)) {
                return false;
            }
            final PanelsBackStack c = this.c;
            if (c == null) {
                if (hye.c != null) {
                    return false;
                }
            }
            else if (!c.equals(hye.c)) {
                return false;
            }
            final Fragment$SavedState d = this.d;
            if (d == null) {
                if (hye.d != null) {
                    return false;
                }
            }
            else if (!d.equals(hye.d)) {
                return false;
            }
            final Fragment$SavedState e = this.e;
            if (e == null) {
                if (hye.e != null) {
                    return false;
                }
            }
            else if (!e.equals(hye.e)) {
                return false;
            }
            final PanelDescriptor f = this.f;
            if (f == null) {
                if (hye.f != null) {
                    return false;
                }
            }
            else if (!f.equals(hye.f)) {
                return false;
            }
            final PanelDescriptor g = this.g;
            final PanelDescriptor g2 = hye.g;
            if (g == null) {
                if (g2 != null) {
                    return false;
                }
            }
            else if (!g.equals(g2)) {
                return false;
            }
            return true;
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
        final PanelsBackStack c = this.c;
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
        final PanelDescriptor f = this.f;
        int hashCode7;
        if (f == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = f.hashCode();
        }
        final PanelDescriptor g = this.g;
        if (g != null) {
            hashCode = g.hashCode();
        }
        return ((((((hashCode2 ^ 0xD5009D89) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ hashCode;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.d);
        final String value5 = String.valueOf(this.e);
        final String value6 = String.valueOf(this.f);
        final String value7 = String.valueOf(this.g);
        final StringBuilder sb = new StringBuilder("RetainedState{superState=null, selectionPanelRetainedState=");
        sb.append(value);
        sb.append(", detailPanelRetainedState=");
        sb.append(value2);
        sb.append(", detailPanelsBackStack=");
        sb.append(value3);
        sb.append(", selectionPanelSavedState=");
        sb.append(value4);
        sb.append(", detailPanelSavedState=");
        sb.append(value5);
        sb.append(", detailPanelRetainedDescriptor=");
        sb.append(value6);
        sb.append(", selectionPanelRetainedDescriptor=");
        sb.append(value7);
        sb.append("}");
        return sb.toString();
    }
}
