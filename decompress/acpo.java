import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acpo
{
    public final TextView a;
    public final TextView b;
    public final View c;
    public final int d;
    public final ColorStateList e;
    public final int f;
    public final ColorStateList g;
    public final int h;
    public final ColorStateList i;
    
    public acpo() {
    }
    
    public acpo(final TextView a, final TextView b, final View c, final int d, final ColorStateList e, final int f, final ColorStateList g, final int h, final ColorStateList i) {
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
    
    public final void a(final aicx aicx) {
        final TextView a = this.a;
        if (a != null) {
            final ColorStateList e = this.e;
            if (e != null) {
                if (aicx != null && (aicx.b & 0x2) != 0x0) {
                    a.setTextColor(aicx.d);
                }
                else {
                    a.setTextColor(e);
                }
            }
            else {
                final int d = this.d;
                if (aicx != null && (aicx.b & 0x2) != 0x0) {
                    a.setTextColor(aicx.d);
                }
                else {
                    a.setTextColor(d);
                }
            }
        }
        final TextView b = this.b;
        if (b != null) {
            final ColorStateList g = this.g;
            if (g != null) {
                if (aicx != null && (aicx.b & 0x4) != 0x0) {
                    b.setTextColor(aicx.e);
                }
                else {
                    b.setTextColor(g);
                }
            }
            else {
                final int f = this.f;
                if (aicx != null && (aicx.b & 0x4) != 0x0) {
                    b.setTextColor(aicx.e);
                }
                else {
                    b.setTextColor(f);
                }
            }
            final ColorStateList i = this.i;
            if (i != null) {
                final TextView b2 = this.b;
                if (b2 != null) {
                    if (aicx != null && (aicx.b & 0x8) != 0x0) {
                        b2.setLinkTextColor(aicx.f);
                    }
                    else {
                        b2.setLinkTextColor(i);
                    }
                }
            }
            else {
                final TextView b3 = this.b;
                final int h = this.h;
                if (b3 != null) {
                    int f2 = h;
                    if (aicx != null) {
                        f2 = h;
                        if ((aicx.b & 0x8) != 0x0) {
                            f2 = aicx.f;
                        }
                    }
                    b3.setLinkTextColor(f2);
                }
            }
        }
        final View c = this.c;
        if (c != null) {
            int c2 = 0;
            if (aicx != null) {
                c2 = c2;
                if ((aicx.b & 0x1) != 0x0) {
                    c2 = aicx.c;
                }
            }
            c.setBackgroundColor(c2);
        }
    }
    
    public final acpn b() {
        return new acpn(this);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof acpo) {
            final acpo acpo = (acpo)o;
            final TextView a = this.a;
            if (a == null) {
                if (acpo.a != null) {
                    return false;
                }
            }
            else if (!a.equals(acpo.a)) {
                return false;
            }
            final TextView b = this.b;
            if (b == null) {
                if (acpo.b != null) {
                    return false;
                }
            }
            else if (!b.equals(acpo.b)) {
                return false;
            }
            final View c = this.c;
            if (c == null) {
                if (acpo.c != null) {
                    return false;
                }
            }
            else if (!c.equals(acpo.c)) {
                return false;
            }
            if (this.d == acpo.d) {
                final ColorStateList e = this.e;
                if (e == null) {
                    if (acpo.e != null) {
                        return false;
                    }
                }
                else if (!e.equals(acpo.e)) {
                    return false;
                }
                if (this.f == acpo.f) {
                    final ColorStateList g = this.g;
                    if (g == null) {
                        if (acpo.g != null) {
                            return false;
                        }
                    }
                    else if (!g.equals(acpo.g)) {
                        return false;
                    }
                    if (this.h == acpo.h) {
                        final ColorStateList i = this.i;
                        final ColorStateList j = acpo.i;
                        if (i == null) {
                            if (j != null) {
                                return false;
                            }
                        }
                        else if (!i.equals(j)) {
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final TextView a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final TextView b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final View c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final int d = this.d;
        final ColorStateList e = this.e;
        int hashCode5;
        if (e == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = e.hashCode();
        }
        final int f = this.f;
        final ColorStateList g = this.g;
        int hashCode6;
        if (g == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = g.hashCode();
        }
        final int h = this.h;
        final ColorStateList i = this.i;
        if (i != null) {
            hashCode = i.hashCode();
        }
        return ((((((((hashCode2 ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * -721379959 ^ d) * 1000003 ^ hashCode5) * 1000003 ^ f) * 1000003 ^ hashCode6) * 1000003 ^ h) * 1000003 ^ hashCode;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final int d = this.d;
        final String value4 = String.valueOf(this.e);
        final int f = this.f;
        final String value5 = String.valueOf(this.g);
        final int h = this.h;
        final String value6 = String.valueOf(this.i);
        final StringBuilder sb = new StringBuilder("BasicColorPaletteDecorator{title=");
        sb.append(value);
        sb.append(", body=");
        sb.append(value2);
        sb.append(", background=");
        sb.append(value3);
        sb.append(", fallbackBackgroundColor=0, fallbackTitleColor=");
        sb.append(d);
        sb.append(", fallbackTitleColorList=");
        sb.append(value4);
        sb.append(", fallbackBodyColor=");
        sb.append(f);
        sb.append(", fallbackBodyColorList=");
        sb.append(value5);
        sb.append(", fallbackLinkColor=");
        sb.append(h);
        sb.append(", fallbackLinkColorList=");
        sb.append(value6);
        sb.append("}");
        return sb.toString();
    }
}
