import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acly
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
    
    public acly() {
    }
    
    public acly(final TextView a, final TextView b, final View c, final int d, final ColorStateList e, final int f, final ColorStateList g, final int h, final ColorStateList i) {
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
    
    public final void a(final ahzg ahzg) {
        final TextView a = this.a;
        if (a != null) {
            final ColorStateList e = this.e;
            if (e != null) {
                if (ahzg != null && (ahzg.b & 0x2) != 0x0) {
                    a.setTextColor(ahzg.d);
                }
                else {
                    a.setTextColor(e);
                }
            }
            else {
                final int d = this.d;
                if (ahzg != null && (ahzg.b & 0x2) != 0x0) {
                    a.setTextColor(ahzg.d);
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
                if (ahzg != null && (ahzg.b & 0x4) != 0x0) {
                    b.setTextColor(ahzg.e);
                }
                else {
                    b.setTextColor(g);
                }
            }
            else {
                final int f = this.f;
                if (ahzg != null && (ahzg.b & 0x4) != 0x0) {
                    b.setTextColor(ahzg.e);
                }
                else {
                    b.setTextColor(f);
                }
            }
            final ColorStateList i = this.i;
            if (i != null) {
                final TextView b2 = this.b;
                if (b2 != null) {
                    if (ahzg != null && (ahzg.b & 0x8) != 0x0) {
                        b2.setLinkTextColor(ahzg.f);
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
                    if (ahzg != null) {
                        f2 = h;
                        if ((ahzg.b & 0x8) != 0x0) {
                            f2 = ahzg.f;
                        }
                    }
                    b3.setLinkTextColor(f2);
                }
            }
        }
        final View c = this.c;
        if (c != null) {
            int c2 = 0;
            if (ahzg != null) {
                c2 = c2;
                if ((ahzg.b & 0x1) != 0x0) {
                    c2 = ahzg.c;
                }
            }
            c.setBackgroundColor(c2);
        }
    }
    
    public final aclx b() {
        return new aclx(this);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof acly) {
            final acly acly = (acly)o;
            final TextView a = this.a;
            if (a == null) {
                if (acly.a != null) {
                    return false;
                }
            }
            else if (!a.equals(acly.a)) {
                return false;
            }
            final TextView b = this.b;
            if (b == null) {
                if (acly.b != null) {
                    return false;
                }
            }
            else if (!b.equals(acly.b)) {
                return false;
            }
            final View c = this.c;
            if (c == null) {
                if (acly.c != null) {
                    return false;
                }
            }
            else if (!c.equals(acly.c)) {
                return false;
            }
            if (this.d == acly.d) {
                final ColorStateList e = this.e;
                if (e == null) {
                    if (acly.e != null) {
                        return false;
                    }
                }
                else if (!e.equals(acly.e)) {
                    return false;
                }
                if (this.f == acly.f) {
                    final ColorStateList g = this.g;
                    if (g == null) {
                        if (acly.g != null) {
                            return false;
                        }
                    }
                    else if (!g.equals(acly.g)) {
                        return false;
                    }
                    if (this.h == acly.h) {
                        final ColorStateList i = this.i;
                        final ColorStateList j = acly.i;
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
