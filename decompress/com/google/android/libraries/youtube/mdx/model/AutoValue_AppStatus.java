// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.mdx.model;

import android.net.Uri;
import java.util.Map;

public final class AutoValue_AppStatus extends AppStatus
{
    public final int a;
    public final boolean b;
    public final String c;
    public final Map d;
    private final boolean e;
    private final boolean f;
    private final Uri g;
    private final ScreenId h;
    private final xiz i;
    private final String j;
    
    public AutoValue_AppStatus(final int a, final boolean e, final boolean f, final boolean b, final Uri g, final ScreenId h, final xiz i, final String c, final Map d, final String j) {
        this.a = a;
        this.e = e;
        this.f = f;
        this.b = b;
        this.g = g;
        this.h = h;
        this.i = i;
        this.c = c;
        this.d = d;
        this.j = j;
    }
    
    public final int a() {
        return this.a;
    }
    
    public final Uri b() {
        return this.g;
    }
    
    public final xiz e() {
        return this.i;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof AppStatus) {
            final AppStatus appStatus = (AppStatus)o;
            if (this.a == appStatus.a() && this.e == appStatus.l() && this.f == appStatus.k() && this.b == appStatus.j()) {
                final Uri g = this.g;
                if (g == null) {
                    if (appStatus.b() != null) {
                        return false;
                    }
                }
                else if (!g.equals((Object)appStatus.b())) {
                    return false;
                }
                final ScreenId h = this.h;
                if (h == null) {
                    if (appStatus.f() != null) {
                        return false;
                    }
                }
                else if (!((xjr)h).equals((Object)appStatus.f())) {
                    return false;
                }
                final xiz i = this.i;
                if (i == null) {
                    if (appStatus.e() != null) {
                        return false;
                    }
                }
                else if (!((xjr)i).equals((Object)appStatus.e())) {
                    return false;
                }
                final String c = this.c;
                if (c == null) {
                    if (appStatus.g() != null) {
                        return false;
                    }
                }
                else if (!c.equals(appStatus.g())) {
                    return false;
                }
                if (this.d.equals(appStatus.i())) {
                    final String j = this.j;
                    if (j == null) {
                        if (appStatus.h() != null) {
                            return false;
                        }
                    }
                    else if (!j.equals(appStatus.h())) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }
    
    public final ScreenId f() {
        return this.h;
    }
    
    public final String g() {
        return this.c;
    }
    
    public final String h() {
        return this.j;
    }
    
    public final int hashCode() {
        final int a = this.a;
        final boolean e = this.e;
        int n = 1237;
        int n2;
        if (!e) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        int n3;
        if (!this.f) {
            n3 = 1237;
        }
        else {
            n3 = 1231;
        }
        if (this.b) {
            n = 1231;
        }
        final Uri g = this.g;
        int hashCode = 0;
        int hashCode2;
        if (g == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = g.hashCode();
        }
        final ScreenId h = this.h;
        int hashCode3;
        if (h == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = ((xjr)h).hashCode();
        }
        final xiz i = this.i;
        int hashCode4;
        if (i == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = ((xjr)i).hashCode();
        }
        final String c = this.c;
        int hashCode5;
        if (c == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = c.hashCode();
        }
        final int hashCode6 = this.d.hashCode();
        final String j = this.j;
        if (j != null) {
            hashCode = j.hashCode();
        }
        return (((((((((a ^ 0xF4243) * 1000003 ^ n2) * 1000003 ^ n3) * 1000003 ^ n) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode;
    }
    
    public final Map i() {
        return this.d;
    }
    
    public final boolean j() {
        return this.b;
    }
    
    public final boolean k() {
        return this.f;
    }
    
    public final boolean l() {
        return this.e;
    }
    
    public final String toString() {
        final int a = this.a;
        final boolean e = this.e;
        final boolean f = this.f;
        final boolean b = this.b;
        final String value = String.valueOf(this.g);
        final String value2 = String.valueOf(this.h);
        final String value3 = String.valueOf(this.i);
        final String c = this.c;
        final String string = this.d.toString();
        final String j = this.j;
        final StringBuilder sb = new StringBuilder("AppStatus{status=");
        sb.append(a);
        sb.append(", stopAllowed=");
        sb.append(e);
        sb.append(", inAppDial=");
        sb.append(f);
        sb.append(", castSupported=");
        sb.append(b);
        sb.append(", installUrl=");
        sb.append(value);
        sb.append(", screenId=");
        sb.append(value2);
        sb.append(", loungeDeviceId=");
        sb.append(value3);
        sb.append(", runningPathSegment=");
        sb.append(c);
        sb.append(", additionalData=");
        sb.append(string);
        sb.append(", theme=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
