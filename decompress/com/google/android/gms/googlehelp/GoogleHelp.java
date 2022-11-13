// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.googlehelp;

import android.os.Parcel;
import java.io.File;
import com.google.android.gms.feedback.FeedbackOptions;
import android.os.Parcelable;
import android.content.Intent;
import java.util.ArrayList;
import android.text.TextUtils;
import android.app.PendingIntent;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import android.net.Uri;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.accounts.Account;
import java.util.List;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GoogleHelp extends AbstractSafeParcelable implements ReflectedParcelable
{
    public static final Parcelable$Creator CREATOR;
    boolean A;
    public boolean B;
    int C;
    String D;
    boolean E;
    String F;
    boolean G;
    ND4CSettings H;
    boolean I;
    List J;
    String K;
    public nbr L;
    final int a;
    String b;
    public Account c;
    Bundle d;
    String e;
    String f;
    Bitmap g;
    boolean h;
    boolean i;
    List j;
    @Deprecated
    Bundle k;
    @Deprecated
    Bitmap l;
    @Deprecated
    byte[] m;
    @Deprecated
    int n;
    @Deprecated
    int o;
    String p;
    public Uri q;
    List r;
    public ThemeSettings s;
    List t;
    public boolean u;
    ErrorReport v;
    public TogglingData w;
    int x;
    PendingIntent y;
    public int z;
    
    static {
        CREATOR = (Parcelable$Creator)new mzs();
    }
    
    public GoogleHelp(final int a, final String b, final Account c, final Bundle d, final String e, final String f, final Bitmap g, final boolean h, final boolean i, final List j, final Bundle k, final Bitmap l, final byte[] m, final int n, final int o, final String p38, final Uri q, final List r, final int a2, ThemeSettings s, final List t, final boolean u, final ErrorReport v, final TogglingData w, final int x, final PendingIntent y, final int z, final boolean a3, final boolean b2, final int c2, final String d2, final boolean e2, final String f2, final boolean g2, final ND4CSettings h2, final boolean i2, final List j2, final String k2) {
        this.v = new ErrorReport();
        if (!TextUtils.isEmpty((CharSequence)b)) {
            this.a = a;
            this.z = z;
            this.A = a3;
            this.B = b2;
            this.C = c2;
            this.D = d2;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.E = e2;
            this.j = j;
            this.y = y;
            this.k = k;
            this.l = l;
            this.m = m;
            this.n = n;
            this.o = o;
            this.p = p38;
            this.q = q;
            this.r = r;
            if (a < 4) {
                final ThemeSettings s2 = new ThemeSettings();
                s2.a = a2;
                this.s = s2;
            }
            else {
                if (s == null) {
                    s = new ThemeSettings();
                }
                this.s = s;
            }
            this.t = t;
            this.u = u;
            this.v = v;
            if (v != null) {
                v.X = "GoogleHelp";
            }
            this.w = w;
            this.x = x;
            this.F = f2;
            this.G = g2;
            this.H = h2;
            this.I = i2;
            this.J = j2;
            this.K = k2;
            return;
        }
        throw new IllegalStateException("Help requires a non-empty appContext");
    }
    
    public static GoogleHelp b(final String s) {
        return new GoogleHelp(19, s, null, null, null, null, null, true, true, new ArrayList(), null, null, null, 0, 0, null, null, new ArrayList(), 3, null, new ArrayList(), false, new ErrorReport(), null, 0, null, -1, false, false, 200, null, false, null, false, null, false, new ArrayList(), null);
    }
    
    public final Intent a() {
        return new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.mgoogle.android.gms").putExtra("EXTRA_GOOGLE_HELP", (Parcelable)this);
    }
    
    public final void c(final FeedbackOptions feedbackOptions, final File file) {
        this.L = feedbackOptions.r;
        final ErrorReport v = new ErrorReport(feedbackOptions, file);
        this.v = v;
        v.X = "GoogleHelp";
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.S(parcel, 1, this.a);
        khl.ag(parcel, 2, this.b);
        khl.af(parcel, 3, (Parcelable)this.c, n);
        khl.V(parcel, 4, this.d);
        khl.O(parcel, 5, this.h);
        khl.O(parcel, 6, this.i);
        khl.ai(parcel, 7, this.j);
        khl.V(parcel, 10, this.k);
        khl.af(parcel, 11, (Parcelable)this.l, n);
        khl.ag(parcel, 14, this.p);
        khl.af(parcel, 15, (Parcelable)this.q, n);
        khl.ak(parcel, 16, this.r);
        khl.S(parcel, 17, 0);
        khl.ak(parcel, 18, this.t);
        khl.W(parcel, 19, this.m);
        khl.S(parcel, 20, this.n);
        khl.S(parcel, 21, this.o);
        khl.O(parcel, 22, this.u);
        khl.af(parcel, 23, (Parcelable)this.v, n);
        khl.af(parcel, 25, (Parcelable)this.s, n);
        khl.ag(parcel, 28, this.e);
        khl.af(parcel, 31, (Parcelable)this.w, n);
        khl.S(parcel, 32, this.x);
        khl.af(parcel, 33, (Parcelable)this.y, n);
        khl.ag(parcel, 34, this.f);
        khl.af(parcel, 35, (Parcelable)this.g, n);
        khl.S(parcel, 36, this.z);
        khl.O(parcel, 37, this.A);
        khl.O(parcel, 38, this.B);
        khl.S(parcel, 39, this.C);
        khl.ag(parcel, 40, this.D);
        khl.O(parcel, 41, this.E);
        khl.ag(parcel, 42, this.F);
        khl.O(parcel, 43, this.G);
        khl.af(parcel, 44, (Parcelable)this.H, n);
        khl.O(parcel, 45, this.I);
        khl.ak(parcel, 46, this.J);
        khl.ag(parcel, 47, this.K);
        khl.N(parcel, m);
    }
}
