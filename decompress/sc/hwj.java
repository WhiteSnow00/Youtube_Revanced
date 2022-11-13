import java.util.Arrays;
import java.util.List;
import j$.time.Instant;
import j$.util.Optional;
import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

final class hwj
{
    public final afeq a;
    public final int b;
    public final byte[] c;
    public final BrowseResponseModel d;
    public final CharSequence e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final ActionBarColor i;
    public final ActionBarColor j;
    public final ActionBarColor k;
    public final ActionBarColor l;
    public final ActionBarColor m;
    public final boolean n;
    public final boolean o;
    public final aiqj p;
    public final Optional q;
    public final acrm r;
    public final acrm s;
    public final acrm t;
    public final afeq u;
    public final afeq v;
    public final Instant w;
    private final afeq x;
    
    protected hwj() {
    }
    
    public hwj(final afeq a, final int b, final byte[] c, final BrowseResponseModel d, final CharSequence e, final boolean f, final boolean g, final long h, final ActionBarColor i, final ActionBarColor j, final ActionBarColor k, final ActionBarColor l, final ActionBarColor m, final boolean n, final boolean o, final aiqj p24, final Optional q, final acrm r, final acrm s, final acrm t, final afeq u, final afeq v, final afeq x, final Instant w) {
        if (a == null) {
            throw new NullPointerException("Null tabsAndSectionListControllerStates");
        }
        this.a = a;
        this.b = b;
        if (c == null) {
            throw new NullPointerException("Null responseTrackingParams");
        }
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
        this.n = n;
        this.o = o;
        if (p24 == null) {
            throw new NullPointerException("Null backgroundResponseReceivedCommand");
        }
        this.p = p24;
        if (q == null) {
            throw new NullPointerException("Null viewScrolledBeyondThresholdCommand");
        }
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        if (u == null) {
            throw new NullPointerException("Null homeAdsPanelRenderers");
        }
        this.u = u;
        if (v == null) {
            throw new NullPointerException("Null engagementPanelRenderers");
        }
        this.v = v;
        if (x == null) {
            throw new NullPointerException("Null observedStateTags");
        }
        this.x = x;
        if (w != null) {
            this.w = w;
            return;
        }
        throw new NullPointerException("Null retainedInstant");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hwj) {
            final hwj hwj = (hwj)o;
            if (agpi.V((List)this.a, (Object)hwj.a) && this.b == hwj.b) {
                final byte[] c = this.c;
                byte[] array;
                if (hwj instanceof hwj) {
                    array = hwj.c;
                }
                else {
                    array = hwj.c;
                }
                if (Arrays.equals(c, array)) {
                    final BrowseResponseModel d = this.d;
                    if (d == null) {
                        if (hwj.d != null) {
                            return false;
                        }
                    }
                    else if (!d.equals(hwj.d)) {
                        return false;
                    }
                    final CharSequence e = this.e;
                    if (e == null) {
                        if (hwj.e != null) {
                            return false;
                        }
                    }
                    else if (!e.equals(hwj.e)) {
                        return false;
                    }
                    if (this.f == hwj.f && this.g == hwj.g && this.h == hwj.h) {
                        final ActionBarColor i = this.i;
                        if (i == null) {
                            if (hwj.i != null) {
                                return false;
                            }
                        }
                        else if (!i.equals(hwj.i)) {
                            return false;
                        }
                        final ActionBarColor j = this.j;
                        if (j == null) {
                            if (hwj.j != null) {
                                return false;
                            }
                        }
                        else if (!j.equals(hwj.j)) {
                            return false;
                        }
                        final ActionBarColor k = this.k;
                        if (k == null) {
                            if (hwj.k != null) {
                                return false;
                            }
                        }
                        else if (!k.equals(hwj.k)) {
                            return false;
                        }
                        final ActionBarColor l = this.l;
                        if (l == null) {
                            if (hwj.l != null) {
                                return false;
                            }
                        }
                        else if (!l.equals(hwj.l)) {
                            return false;
                        }
                        final ActionBarColor m = this.m;
                        if (m == null) {
                            if (hwj.m != null) {
                                return false;
                            }
                        }
                        else if (!m.equals(hwj.m)) {
                            return false;
                        }
                        if (this.n == hwj.n && this.o == hwj.o && ((ahbh)this.p).equals((Object)hwj.p) && this.q.equals((Object)hwj.q)) {
                            final acrm r = this.r;
                            if (r == null) {
                                if (hwj.r != null) {
                                    return false;
                                }
                            }
                            else if (!r.equals(hwj.r)) {
                                return false;
                            }
                            final acrm s = this.s;
                            if (s == null) {
                                if (hwj.s != null) {
                                    return false;
                                }
                            }
                            else if (!s.equals(hwj.s)) {
                                return false;
                            }
                            final acrm t = this.t;
                            if (t == null) {
                                if (hwj.t != null) {
                                    return false;
                                }
                            }
                            else if (!t.equals(hwj.t)) {
                                return false;
                            }
                            if (agpi.V((List)this.u, (Object)hwj.u) && agpi.V((List)this.v, (Object)hwj.v) && agpi.V((List)this.x, (Object)hwj.x) && this.w.equals((Object)hwj.w)) {
                                return true;
                            }
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
        final int b = this.b;
        final int hashCode2 = Arrays.hashCode(this.c);
        final BrowseResponseModel d = this.d;
        int hashCode3 = 0;
        int hashCode4;
        if (d == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = d.hashCode();
        }
        final CharSequence e = this.e;
        int hashCode5;
        if (e == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = e.hashCode();
        }
        final boolean f = this.f;
        int n = 1237;
        int n2;
        if (!f) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        int n3;
        if (!this.g) {
            n3 = 1237;
        }
        else {
            n3 = 1231;
        }
        final long h = this.h;
        final int n4 = (int)(h ^ h >>> 32);
        final ActionBarColor i = this.i;
        int hashCode6;
        if (i == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = i.hashCode();
        }
        final ActionBarColor j = this.j;
        int hashCode7;
        if (j == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = j.hashCode();
        }
        final ActionBarColor k = this.k;
        int hashCode8;
        if (k == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = k.hashCode();
        }
        final ActionBarColor l = this.l;
        int hashCode9;
        if (l == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = l.hashCode();
        }
        final ActionBarColor m = this.m;
        int hashCode10;
        if (m == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = m.hashCode();
        }
        int n5;
        if (!this.n) {
            n5 = 1237;
        }
        else {
            n5 = 1231;
        }
        if (this.o) {
            n = 1231;
        }
        final int hashCode11 = ((ahbh)this.p).hashCode();
        final int hashCode12 = this.q.hashCode();
        final acrm r = this.r;
        int hashCode13;
        if (r == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = r.hashCode();
        }
        final acrm s = this.s;
        int hashCode14;
        if (s == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = s.hashCode();
        }
        final acrm t = this.t;
        if (t != null) {
            hashCode3 = t.hashCode();
        }
        return (((((((((((((((((((((((hashCode ^ 0xD5009D89) * 1000003 ^ b) * 1000003 ^ hashCode2) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ n2) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ hashCode8) * 1000003 ^ hashCode9) * 1000003 ^ hashCode10) * 1000003 ^ n5) * 1000003 ^ n) * 1000003 ^ hashCode11) * 1000003 ^ hashCode12) * 1000003 ^ hashCode13) * 1000003 ^ hashCode14) * 1000003 ^ hashCode3) * 1000003 ^ this.u.hashCode()) * 1000003 ^ this.v.hashCode()) * 1000003 ^ this.x.hashCode()) * 1000003 ^ this.w.hashCode();
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final int b = this.b;
        final String string2 = Arrays.toString(this.c);
        final String value = String.valueOf(this.d);
        final String value2 = String.valueOf(this.e);
        final boolean f = this.f;
        final boolean g = this.g;
        final long h = this.h;
        final String value3 = String.valueOf(this.i);
        final String value4 = String.valueOf(this.j);
        final String value5 = String.valueOf(this.k);
        final String value6 = String.valueOf(this.l);
        final String value7 = String.valueOf(this.m);
        final boolean n = this.n;
        final boolean o = this.o;
        final String string3 = this.p.toString();
        final String string4 = this.q.toString();
        final String value8 = String.valueOf(this.r);
        final String value9 = String.valueOf(this.s);
        final String value10 = String.valueOf(this.t);
        final String string5 = this.u.toString();
        final String string6 = this.v.toString();
        final String string7 = this.x.toString();
        final String string8 = this.w.toString();
        final StringBuilder sb = new StringBuilder("RetainedState{superState=null, tabsAndSectionListControllerStates=");
        sb.append(string);
        sb.append(", lastSelectedTabIndex=");
        sb.append(b);
        sb.append(", responseTrackingParams=");
        sb.append(string2);
        sb.append(", browseResponseModel=");
        sb.append(value);
        sb.append(", title=");
        sb.append(value2);
        sb.append(", enableTranslucentActionBar=");
        sb.append(f);
        sb.append(", hideTitleOnTranslucentHeader=");
        sb.append(g);
        sb.append(", responseExpiryElapsedTimeMillis=");
        sb.append(h);
        sb.append(", backgroundColor=");
        sb.append(value3);
        sb.append(", statusBarColor=");
        sb.append(value4);
        sb.append(", primaryTextColor=");
        sb.append(value5);
        sb.append(", secondaryTextColor=");
        sb.append(value6);
        sb.append(", iconTintColor=");
        sb.append(value7);
        sb.append(", restrictedModeEnabled=");
        sb.append(n);
        sb.append(", dataSavingQualityPickerWasEnabled=");
        sb.append(o);
        sb.append(", backgroundResponseReceivedCommand=");
        sb.append(string3);
        sb.append(", viewScrolledBeyondThresholdCommand=");
        sb.append(string4);
        sb.append(", libraryLinksTransientState=");
        sb.append(value8);
        sb.append(", feedFilterBarState=");
        sb.append(value9);
        sb.append(", mySubsFeedFilterBarState=");
        sb.append(value10);
        sb.append(", homeAdsPanelRenderers=");
        sb.append(string5);
        sb.append(", engagementPanelRenderers=");
        sb.append(string6);
        sb.append(", observedStateTags=");
        sb.append(string7);
        sb.append(", retainedInstant=");
        sb.append(string8);
        sb.append("}");
        return sb.toString();
    }
}
