import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class orr
{
    public final View a;
    public final View b;
    public final ouj c;
    public final Object d;
    public final SenderStateOuterClass$SenderState e;
    public final ost f;
    public final String g;
    public final otb h;
    public final orz i;
    
    public orr() {
    }
    
    public orr(final View a, final View b, final ouj c, final Object d, final SenderStateOuterClass$SenderState e, final ost f, final String g, final otb h, final orz i) {
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
    
    public static ves a() {
        final ves ves = new ves();
        ves.g(orz.a);
        return ves;
    }
    
    public final ves b() {
        return new ves(this);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof orr) {
            final orr orr = (orr)o;
            final View a = this.a;
            if (a == null) {
                if (orr.a != null) {
                    return false;
                }
            }
            else if (!a.equals(orr.a)) {
                return false;
            }
            final View b = this.b;
            if (b == null) {
                if (orr.b != null) {
                    return false;
                }
            }
            else if (!b.equals(orr.b)) {
                return false;
            }
            final ouj c = this.c;
            if (c == null) {
                if (orr.c != null) {
                    return false;
                }
            }
            else if (!c.equals(orr.c)) {
                return false;
            }
            final Object d = this.d;
            if (d == null) {
                if (orr.d != null) {
                    return false;
                }
            }
            else if (!d.equals(orr.d)) {
                return false;
            }
            final SenderStateOuterClass$SenderState e = this.e;
            if (e == null) {
                if (orr.e != null) {
                    return false;
                }
            }
            else if (!((agzi)e).equals((Object)orr.e)) {
                return false;
            }
            final ost f = this.f;
            if (f == null) {
                if (orr.f != null) {
                    return false;
                }
            }
            else if (!f.equals(orr.f)) {
                return false;
            }
            final String g = this.g;
            if (g == null) {
                if (orr.g != null) {
                    return false;
                }
            }
            else if (!g.equals(orr.g)) {
                return false;
            }
            final otb h = this.h;
            if (h == null) {
                if (orr.h != null) {
                    return false;
                }
            }
            else if (!h.equals(orr.h)) {
                return false;
            }
            if (this.i.equals(orr.i)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final View a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final View b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final ouj c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final Object d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final SenderStateOuterClass$SenderState e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = ((agzi)e).hashCode();
        }
        final ost f = this.f;
        int hashCode7;
        if (f == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = f.hashCode();
        }
        final String g = this.g;
        int hashCode8;
        if (g == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = g.hashCode();
        }
        final otb h = this.h;
        if (h != null) {
            hashCode = h.hashCode();
        }
        return ((((((((hashCode2 ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ hashCode8) * 1000003 ^ hashCode) * 1000003 ^ this.i.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.d);
        final String value5 = String.valueOf(this.e);
        final String value6 = String.valueOf(this.f);
        final String g = this.g;
        final String value7 = String.valueOf(this.h);
        final String value8 = String.valueOf(this.i);
        final StringBuilder sb = new StringBuilder("CommandEventData{view=");
        sb.append(value);
        sb.append(", anchorView=");
        sb.append(value2);
        sb.append(", touchLocation=");
        sb.append(value3);
        sb.append(", customData=");
        sb.append(value4);
        sb.append(", senderState=");
        sb.append(value5);
        sb.append(", elementBuilder=");
        sb.append(value6);
        sb.append(", identifier=");
        sb.append(g);
        sb.append(", elementsConfig=");
        sb.append(value7);
        sb.append(", conversionContext=");
        sb.append(value8);
        sb.append("}");
        return sb.toString();
    }
}
