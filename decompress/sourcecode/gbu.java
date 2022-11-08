// 
// Decompiled by Procyon v0.6.0
// 

public final class gbu implements gav
{
    public final boolean a;
    public final int b;
    public final aonl c;
    public final aong d;
    public final aomx e;
    public final aomz f;
    public final CharSequence g;
    public final int h;
    public final aioe i;
    public final String j;
    public final int k;
    public final int l;
    public final hez m;
    
    public gbu() {
    }
    
    public gbu(final boolean a, final int b, final aonl c, final aong d, final aomx e, final aomz f, final hez m, final CharSequence g, final int k, final int l, final int h, final aioe i, final String j, final byte[] array) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.m = m;
        this.g = g;
        this.k = k;
        this.l = l;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final int a() {
        return 3;
    }
    
    public final boolean b() {
        return this.a;
    }
    
    public final boolean c() {
        return false;
    }
    
    public final gbu d(final String h) {
        final gbt f = this.f();
        f.h = h;
        return f.a();
    }
    
    public final boolean e(final aonl aonl) {
        final int b = this.b;
        if (b == 1) {
            final aong d = this.d;
            if (d != null) {
                aong aong;
                if ((aong = aonl.c) == null) {
                    aong = aong.a;
                }
                if (d.equals((Object)aong)) {
                    return true;
                }
            }
            return false;
        }
        if (b == 2) {
            final aomx e = this.e;
            if (e != null) {
                aomx aomx;
                if ((aomx = aonl.d) == null) {
                    aomx = aomx.a;
                }
                if (e.equals((Object)aomx)) {
                    return true;
                }
            }
            return false;
        }
        if (b != 3) {
            return false;
        }
        final aomz f = this.f;
        if (f != null) {
            aomz aomz;
            if ((aomz = aonl.f) == null) {
                aomz = aomz.a;
            }
            if (f.equals((Object)aomz)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gbu) {
            final gbu gbu = (gbu)o;
            if (this.a == gbu.a && this.b == gbu.b && this.c.equals((Object)gbu.c)) {
                final aong d = this.d;
                if (d == null) {
                    if (gbu.d != null) {
                        return false;
                    }
                }
                else if (!d.equals((Object)gbu.d)) {
                    return false;
                }
                final aomx e = this.e;
                if (e == null) {
                    if (gbu.e != null) {
                        return false;
                    }
                }
                else if (!e.equals((Object)gbu.e)) {
                    return false;
                }
                final aomz f = this.f;
                if (f == null) {
                    if (gbu.f != null) {
                        return false;
                    }
                }
                else if (!f.equals((Object)gbu.f)) {
                    return false;
                }
                final hez m = this.m;
                if (m == null) {
                    if (gbu.m != null) {
                        return false;
                    }
                }
                else if (!m.equals((Object)gbu.m)) {
                    return false;
                }
                final CharSequence g = this.g;
                if (g == null) {
                    if (gbu.g != null) {
                        return false;
                    }
                }
                else if (!g.equals(gbu.g)) {
                    return false;
                }
                final int k = this.k;
                final int i = gbu.k;
                if (k == 0) {
                    throw null;
                }
                if (k == i) {
                    final int l = this.l;
                    final int j = gbu.l;
                    if (l == 0) {
                        throw null;
                    }
                    if (l == j && this.h == gbu.h) {
                        final aioe i2 = this.i;
                        if (i2 == null) {
                            if (gbu.i != null) {
                                return false;
                            }
                        }
                        else if (!((agzi)i2).equals((Object)gbu.i)) {
                            return false;
                        }
                        final String j2 = this.j;
                        final String j3 = gbu.j;
                        if (j2 == null) {
                            if (j3 != null) {
                                return false;
                            }
                        }
                        else if (!j2.equals(j3)) {
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public final gbt f() {
        return new gbt(this);
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (!this.a) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        final int b = this.b;
        final int hashCode = this.c.hashCode();
        final aong d = this.d;
        int hashCode2 = 0;
        int hashCode3;
        if (d == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d.hashCode();
        }
        final aomx e = this.e;
        int hashCode4;
        if (e == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e.hashCode();
        }
        final aomz f = this.f;
        int hashCode5;
        if (f == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = f.hashCode();
        }
        final hez m = this.m;
        int hashCode6;
        if (m == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = m.hashCode();
        }
        final CharSequence g = this.g;
        int hashCode7;
        if (g == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = g.hashCode();
        }
        final int k = this.k;
        if (k == 0) {
            throw null;
        }
        final int l = this.l;
        if (l != 0) {
            final int h = this.h;
            final aioe i = this.i;
            int hashCode8;
            if (i == null) {
                hashCode8 = 0;
            }
            else {
                hashCode8 = ((agzi)i).hashCode();
            }
            final String j = this.j;
            if (j != null) {
                hashCode2 = j.hashCode();
            }
            return ((((((((((((((n ^ 0xF4243) * 1000003 ^ 0x4D5) * 1000003 ^ 0x4D5) * 1000003 ^ b) * 1000003 ^ hashCode) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ k) * 1000003 ^ l) * 1000003 ^ h) * 1000003 ^ hashCode8) * 1000003 ^ hashCode2;
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final int b = this.b;
        final String value = String.valueOf(this.c);
        final String value2 = String.valueOf(this.d);
        final String value3 = String.valueOf(this.e);
        final String value4 = String.valueOf(this.f);
        final String value5 = String.valueOf(this.m);
        final String value6 = String.valueOf(this.g);
        final int k = this.k;
        String string = "null";
        String string2;
        if (k != 0) {
            string2 = Integer.toString(k - 1);
        }
        else {
            string2 = "null";
        }
        final int l = this.l;
        if (l != 0) {
            string = Integer.toString(l - 1);
        }
        final int h = this.h;
        final String value7 = String.valueOf(this.i);
        final String j = this.j;
        final StringBuilder sb = new StringBuilder("SurveyBottomUiModel{rateLimited=");
        sb.append(a);
        sb.append(", shownOnFullscreen=false, counterfactual=false, surveyType=");
        sb.append(b);
        sb.append(", surveySupportedRenderers=");
        sb.append(value);
        sb.append(", singleOptionSurvey=");
        sb.append(value2);
        sb.append(", checkboxSurvey=");
        sb.append(value3);
        sb.append(", freeTextSurvey=");
        sb.append(value4);
        sb.append(", responseListener=");
        sb.append(value5);
        sb.append(", question=");
        sb.append(value6);
        sb.append(", displayTime=");
        sb.append(string2);
        sb.append(", displayStart=");
        sb.append(string);
        sb.append(", displayDelaySec=");
        sb.append(h);
        sb.append(", dismissalEndpoint=");
        sb.append(value7);
        sb.append(", cpn=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
