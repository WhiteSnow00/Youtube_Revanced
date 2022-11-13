// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.feedback;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Iterator;
import android.app.ApplicationErrorReport$CrashInfo;
import android.text.TextUtils;
import java.io.File;
import android.graphics.Bitmap;
import java.util.List;
import android.app.ApplicationErrorReport;
import com.google.android.gms.common.data.BitmapTeleporter;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ErrorReport extends AbstractSafeParcelable implements ReflectedParcelable
{
    public static final Parcelable$Creator CREATOR;
    public String A;
    public String B;
    public String C;
    public Bundle D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public String I;
    public String J;
    public int K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    @Deprecated
    public String Q;
    public String R;
    public BitmapTeleporter S;
    public String T;
    public FileTeleporter[] U;
    public String[] V;
    public boolean W;
    public String X;
    public ThemeSettings Y;
    public LogOptions Z;
    public ApplicationErrorReport a;
    @Deprecated
    public String aa;
    public boolean ab;
    public Bundle ac;
    public List ad;
    public boolean ae;
    public Bitmap af;
    public String ag;
    public List ah;
    public int ai;
    public int aj;
    public String[] ak;
    public String[] al;
    public String[] am;
    public boolean an;
    public boolean ao;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public int k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String[] q;
    public String[] r;
    public String[] s;
    public String t;
    public String u;
    public byte[] v;
    public int w;
    public int x;
    public int y;
    public int z;
    
    static {
        CREATOR = (Parcelable$Creator)new mvv(3);
    }
    
    public ErrorReport() {
        this.a = new ApplicationErrorReport();
    }
    
    public ErrorReport(final ApplicationErrorReport a, final String b, final int c, final String d, final String e, final String f, final String g, final String h, final String i, final String j, final int k, final String l, final String m, final String n, final String o, final String p67, final String[] q, final String[] r, final String[] s, final String t, final String u, final byte[] v, final int w, final int x, final int y, final int z, final String a2, final String b2, final String c2, final Bundle d2, final boolean e2, final int f2, final int g2, final boolean h2, final String i2, final String j2, final int k2, final String l2, final String m2, final String n2, final String o2, final String p68, final String q2, final String r2, final BitmapTeleporter s2, final String t2, final FileTeleporter[] u2, final String[] v2, final boolean w2, final String x2, final ThemeSettings y2, final LogOptions z2, final String aa, final boolean ab, final Bundle ac, final List ad, final boolean ae, final Bitmap af, final String ag, final List ah, final int ai, final int aj, final String[] ak, final String[] al, final String[] am, final boolean an, final boolean ao) {
        new ApplicationErrorReport();
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
        this.n = n;
        this.o = o;
        this.p = p67;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a2;
        this.B = b2;
        this.C = c2;
        this.D = d2;
        this.E = e2;
        this.F = f2;
        this.G = g2;
        this.H = h2;
        this.I = i2;
        this.J = j2;
        this.K = k2;
        this.L = l2;
        this.M = m2;
        this.N = n2;
        this.O = o2;
        this.P = p68;
        this.Q = q2;
        this.R = r2;
        this.S = s2;
        this.T = t2;
        this.U = u2;
        this.V = v2;
        this.W = w2;
        this.X = x2;
        this.Y = y2;
        this.Z = z2;
        this.aa = aa;
        this.ab = ab;
        this.ac = ac;
        this.ad = ad;
        this.ae = ae;
        this.af = af;
        this.ag = ag;
        this.ah = ah;
        this.ai = ai;
        this.aj = aj;
        this.ak = ak;
        this.al = al;
        this.am = am;
        this.an = an;
        this.ao = ao;
    }
    
    public ErrorReport(final FeedbackOptions feedbackOptions, final File d) {
        this.a = new ApplicationErrorReport();
        final Bundle b = feedbackOptions.b;
        if (b != null && !b.isEmpty()) {
            this.D = feedbackOptions.b;
        }
        if (!TextUtils.isEmpty((CharSequence)feedbackOptions.a)) {
            this.B = feedbackOptions.a;
        }
        if (!TextUtils.isEmpty((CharSequence)feedbackOptions.c)) {
            this.b = feedbackOptions.c;
        }
        final ApplicationErrorReport$CrashInfo crashInfo = feedbackOptions.d.crashInfo;
        if (crashInfo != null) {
            this.M = crashInfo.throwMethodName;
            this.K = crashInfo.throwLineNumber;
            this.L = crashInfo.throwClassName;
            this.N = crashInfo.stackTrace;
            this.I = crashInfo.exceptionClassName;
            this.O = crashInfo.exceptionMessage;
            this.J = crashInfo.throwFileName;
        }
        final ThemeSettings j = feedbackOptions.j;
        if (j != null) {
            this.Y = j;
        }
        if (!TextUtils.isEmpty((CharSequence)feedbackOptions.e)) {
            this.P = feedbackOptions.e;
        }
        final String g = feedbackOptions.g;
        if (!TextUtils.isEmpty((CharSequence)g)) {
            this.a.packageName = g;
        }
        if (!TextUtils.isEmpty((CharSequence)feedbackOptions.n)) {
            this.ag = feedbackOptions.n;
        }
        final Bitmap m = feedbackOptions.m;
        if (m != null) {
            this.af = m;
        }
        if (d != null) {
            this.S = feedbackOptions.f;
            final List h = feedbackOptions.h;
            if (h != null && !h.isEmpty()) {
                final Iterator iterator = h.iterator();
                while (iterator.hasNext()) {
                    ((FileTeleporter)iterator.next()).d = d;
                }
                this.U = h.toArray(new FileTeleporter[0]);
            }
        }
        final LogOptions k = feedbackOptions.k;
        if (k != null) {
            this.Z = k;
        }
        this.W = feedbackOptions.i;
        this.ae = feedbackOptions.l;
        this.E = feedbackOptions.o;
        this.an = feedbackOptions.q;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.af(parcel, 2, (Parcelable)this.a, n);
        khl.ag(parcel, 3, this.b);
        khl.S(parcel, 4, this.c);
        khl.ag(parcel, 5, this.d);
        khl.ag(parcel, 6, this.e);
        khl.ag(parcel, 7, this.f);
        khl.ag(parcel, 8, this.g);
        khl.ag(parcel, 9, this.h);
        khl.ag(parcel, 10, this.i);
        khl.ag(parcel, 11, this.j);
        khl.S(parcel, 12, this.k);
        khl.ag(parcel, 13, this.l);
        khl.ag(parcel, 14, this.m);
        khl.ag(parcel, 15, this.n);
        khl.ag(parcel, 16, this.o);
        khl.ag(parcel, 17, this.p);
        khl.ah(parcel, 18, this.q);
        khl.ah(parcel, 19, this.r);
        khl.ah(parcel, 20, this.s);
        khl.ag(parcel, 21, this.t);
        khl.ag(parcel, 22, this.u);
        khl.W(parcel, 23, this.v);
        khl.S(parcel, 24, this.w);
        khl.S(parcel, 25, this.x);
        khl.S(parcel, 26, this.y);
        khl.S(parcel, 27, this.z);
        khl.ag(parcel, 28, this.A);
        khl.ag(parcel, 29, this.B);
        khl.ag(parcel, 30, this.C);
        khl.V(parcel, 31, this.D);
        khl.O(parcel, 32, this.E);
        khl.S(parcel, 33, this.F);
        khl.S(parcel, 34, this.G);
        khl.O(parcel, 35, this.H);
        khl.ag(parcel, 36, this.I);
        khl.ag(parcel, 37, this.J);
        khl.S(parcel, 38, this.K);
        khl.ag(parcel, 39, this.L);
        khl.ag(parcel, 40, this.M);
        khl.ag(parcel, 41, this.N);
        khl.ag(parcel, 42, this.O);
        khl.ag(parcel, 43, this.P);
        khl.ag(parcel, 44, this.Q);
        khl.ag(parcel, 45, this.R);
        khl.af(parcel, 46, (Parcelable)this.S, n);
        khl.ag(parcel, 47, this.T);
        khl.aj(parcel, 48, (Parcelable[])this.U, n);
        khl.ah(parcel, 49, this.V);
        khl.O(parcel, 50, this.W);
        khl.ag(parcel, 51, this.X);
        khl.af(parcel, 52, (Parcelable)this.Y, n);
        khl.af(parcel, 53, (Parcelable)this.Z, n);
        khl.ag(parcel, 54, this.aa);
        khl.O(parcel, 55, this.ab);
        khl.V(parcel, 56, this.ac);
        khl.ak(parcel, 57, this.ad);
        khl.O(parcel, 58, this.ae);
        khl.af(parcel, 59, (Parcelable)this.af, n);
        khl.ag(parcel, 60, this.ag);
        khl.ai(parcel, 61, this.ah);
        khl.S(parcel, 62, this.ai);
        khl.S(parcel, 63, this.aj);
        khl.ah(parcel, 64, this.ak);
        khl.ah(parcel, 65, this.al);
        khl.ah(parcel, 66, this.am);
        khl.O(parcel, 67, this.an);
        khl.O(parcel, 68, this.ao);
        khl.N(parcel, m);
    }
}
