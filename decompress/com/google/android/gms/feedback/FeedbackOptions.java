// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.feedback;

import android.os.Parcel;
import java.util.ArrayList;
import android.graphics.Bitmap;
import java.util.List;
import com.google.android.gms.common.data.BitmapTeleporter;
import android.app.ApplicationErrorReport;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class FeedbackOptions extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public String a;
    public Bundle b;
    public String c;
    public ApplicationErrorReport d;
    public String e;
    public BitmapTeleporter f;
    public String g;
    public List h;
    public boolean i;
    public ThemeSettings j;
    public LogOptions k;
    public boolean l;
    public Bitmap m;
    public String n;
    public boolean o;
    public long p;
    public boolean q;
    public nbr r;
    
    static {
        CREATOR = (Parcelable$Creator)new mxx();
    }
    
    public FeedbackOptions(final ApplicationErrorReport applicationErrorReport) {
        this(null, null, null, applicationErrorReport, null, null, null, null, true, null, null, false, null, null, false, 0L, false);
    }
    
    public FeedbackOptions(final String a, Bundle b, final String c, ApplicationErrorReport d, final String e, final BitmapTeleporter f, final String g, List h, final boolean i, final ThemeSettings j, final LogOptions k, final boolean l, final Bitmap m, final String n, final boolean o, final long p17, final boolean q) {
        this.a = a;
        if (b == null) {
            b = new Bundle();
        }
        this.b = b;
        this.c = c;
        if (d == null) {
            d = new ApplicationErrorReport();
        }
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        if (h == null) {
            h = new ArrayList();
        }
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p17;
        this.q = q;
    }
    
    public static FeedbackOptions a() {
        return new FeedbackOptions(new ApplicationErrorReport());
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        mxx.a(this, parcel, n);
    }
}
