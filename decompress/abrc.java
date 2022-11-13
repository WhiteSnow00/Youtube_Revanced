import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abrc
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final float i;
    public final int j;
    public final String k;
    public final String l;
    public final Optional m;
    
    public abrc() {
    }
    
    public abrc(final String a, final String b, final String c, final String d, final String e, final String f, final String g, final String h, final float i, final int j, final String k, final String l, final Optional m) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof abrc) {
            final abrc abrc = (abrc)o;
            if (this.a.equals(abrc.a)) {
                final String b = this.b;
                if (b == null) {
                    if (abrc.b != null) {
                        return false;
                    }
                }
                else if (!b.equals(abrc.b)) {
                    return false;
                }
                final String c = this.c;
                if (c == null) {
                    if (abrc.c != null) {
                        return false;
                    }
                }
                else if (!c.equals(abrc.c)) {
                    return false;
                }
                final String d = this.d;
                if (d == null) {
                    if (abrc.d != null) {
                        return false;
                    }
                }
                else if (!d.equals(abrc.d)) {
                    return false;
                }
                final String e = this.e;
                if (e == null) {
                    if (abrc.e != null) {
                        return false;
                    }
                }
                else if (!e.equals(abrc.e)) {
                    return false;
                }
                final String f = this.f;
                if (f == null) {
                    if (abrc.f != null) {
                        return false;
                    }
                }
                else if (!f.equals(abrc.f)) {
                    return false;
                }
                final String g = this.g;
                if (g == null) {
                    if (abrc.g != null) {
                        return false;
                    }
                }
                else if (!g.equals(abrc.g)) {
                    return false;
                }
                final String h = this.h;
                if (h == null) {
                    if (abrc.h != null) {
                        return false;
                    }
                }
                else if (!h.equals(abrc.h)) {
                    return false;
                }
                if (Float.floatToIntBits(this.i) == Float.floatToIntBits(abrc.i) && this.j == abrc.j) {
                    final String k = this.k;
                    if (k == null) {
                        if (abrc.k != null) {
                            return false;
                        }
                    }
                    else if (!k.equals(abrc.k)) {
                        return false;
                    }
                    final String l = this.l;
                    if (l == null) {
                        if (abrc.l != null) {
                            return false;
                        }
                    }
                    else if (!l.equals(abrc.l)) {
                        return false;
                    }
                    if (this.m.equals((Object)abrc.m)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final String c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final String d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final String e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final String f = this.f;
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
        final String h = this.h;
        int hashCode9;
        if (h == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = h.hashCode();
        }
        final int floatToIntBits = Float.floatToIntBits(this.i);
        final int j = this.j;
        final String k = this.k;
        int hashCode10;
        if (k == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = k.hashCode();
        }
        final String l = this.l;
        if (l != null) {
            hashCode2 = l.hashCode();
        }
        return ((((((((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ hashCode8) * 1000003 ^ hashCode9) * 1000003 ^ floatToIntBits) * 1000003 ^ j) * 1000003 ^ hashCode10) * 1000003 ^ hashCode2) * 1000003 ^ this.m.hashCode();
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final String c = this.c;
        final String d = this.d;
        final String e = this.e;
        final String f = this.f;
        final String g = this.g;
        final String h = this.h;
        final float i = this.i;
        final int j = this.j;
        final String k = this.k;
        final String l = this.l;
        final String value = String.valueOf(this.m);
        final StringBuilder sb = new StringBuilder("WatchtimeSegment{startTimeString=");
        sb.append(a);
        sb.append(", endTimeString=");
        sb.append(b);
        sb.append(", connectionType=");
        sb.append(c);
        sb.append(", playerVisibility=");
        sb.append(d);
        sb.append(", subtitleId=");
        sb.append(e);
        sb.append(", userinducedAudioOnly=");
        sb.append(f);
        sb.append(", isBlackout=");
        sb.append(g);
        sb.append(", muted=");
        sb.append(h);
        sb.append(", playbackRate=");
        sb.append(i);
        sb.append(", volume=");
        sb.append(j);
        sb.append(", clipId=");
        sb.append(k);
        sb.append(", als=");
        sb.append(l);
        sb.append(", multiAudioTrackId=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
