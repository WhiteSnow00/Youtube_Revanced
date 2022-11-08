// 
// Decompiled by Procyon v0.6.0
// 

public final class gcz
{
    public final CharSequence a;
    public final akbe b;
    public final aexq c;
    public final aexq d;
    public final aexq e;
    public final aoqe f;
    public final int g;
    public final int h;
    public final int i;
    
    public gcz() {
    }
    
    public gcz(final CharSequence a, final akbe b, final int g, final int h, final aexq c, final aexq d, final aexq e, final aoqe f, final int i) {
        this.a = a;
        this.b = b;
        this.g = g;
        this.h = h;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.i = i;
    }
    
    static acss a() {
        final acss acss = new acss((byte[])null, (byte[])null);
        acss.f(aoqe.a);
        acss.c = 1;
        return acss;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gcz) {
            final gcz gcz = (gcz)o;
            if (this.a.equals(gcz.a) && this.b.equals((Object)gcz.b)) {
                final int g = this.g;
                final int g2 = gcz.g;
                if (g == 0) {
                    throw null;
                }
                if (g == g2) {
                    final int h = this.h;
                    final int h2 = gcz.h;
                    if (h == 0) {
                        throw null;
                    }
                    if (h == h2 && this.c.equals(gcz.c) && this.d.equals(gcz.d) && this.e.equals(gcz.e) && ((agzi)this.f).equals((Object)gcz.f)) {
                        final int i = this.i;
                        final int j = gcz.i;
                        if (i == 0) {
                            throw null;
                        }
                        if (i == j) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final int g = this.g;
        if (g == 0) {
            throw null;
        }
        final int h = this.h;
        if (h == 0) {
            throw null;
        }
        final int hashCode3 = this.c.hashCode();
        final int hashCode4 = this.d.hashCode();
        final int hashCode5 = this.e.hashCode();
        final int hashCode6 = ((agzi)this.f).hashCode();
        final int i = this.i;
        if (i != 0) {
            return ((((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ g) * 1000003 ^ h) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ i;
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final int g = this.g;
        String string = "null";
        String string2;
        if (g != 0) {
            string2 = Integer.toString(g - 1);
        }
        else {
            string2 = "null";
        }
        final int h = this.h;
        String string3;
        if (h != 0) {
            string3 = Integer.toString(h - 1);
        }
        else {
            string3 = "null";
        }
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.d);
        final String value5 = String.valueOf(this.e);
        final String value6 = String.valueOf(this.f);
        final int i = this.i;
        if (i != 0) {
            string = Integer.toString(i - 1);
        }
        final StringBuilder sb = new StringBuilder("ContentPillModel{text=");
        sb.append(value);
        sb.append(", iconType=");
        sb.append(value2);
        sb.append(", position=");
        sb.append(string2);
        sb.append(", behavior=");
        sb.append(string3);
        sb.append(", onClickedCommand=");
        sb.append(value3);
        sb.append(", transientUiCallback=");
        sb.append(value4);
        sb.append(", actionListener=");
        sb.append(value5);
        sb.append(", colorPalette=");
        sb.append(value6);
        sb.append(", presentationStyle=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
