// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.os.Binder;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetServiceRequest extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public static final Scope[] a;
    public static final Feature[] b;
    public final int c;
    public final int d;
    public int e;
    public String f;
    public IBinder g;
    public Scope[] h;
    public Bundle i;
    public Account j;
    public Feature[] k;
    public Feature[] l;
    public boolean m;
    public int n;
    public boolean o;
    public String p;
    
    static {
        CREATOR = (Parcelable$Creator)new mpg(16);
        a = new Scope[0];
        b = new Feature[0];
    }
    
    public GetServiceRequest(final int c, final int d, final int e, final String f, final IBinder g, Scope[] i, Bundle b, Account j, Feature[] b2, final Feature[] array, final boolean m, final int n, final boolean o, final String p14) {
        Scope[] a = i;
        if (i == null) {
            a = GetServiceRequest.a;
        }
        if ((i = (Scope[])(Object)b) == null) {
            i = (Scope[])(Object)new Bundle();
        }
        if ((b = (Bundle)(Object)b2) == null) {
            b = (Bundle)(Object)GetServiceRequest.b;
        }
        if ((b2 = array) == null) {
            b2 = GetServiceRequest.b;
        }
        this.c = c;
        this.d = d;
        this.e = e;
        if ("com.mgoogle.android.gms".equals(f)) {
            this.f = "com.mgoogle.android.gms";
        }
        else {
            this.f = f;
        }
        if (c < 2) {
            Account k;
            j = (k = null);
            Label_0249: {
                if (g != null) {
                    final IInterface queryLocalInterface = g.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                    mup mup;
                    if (queryLocalInterface instanceof mup) {
                        mup = (mup)queryLocalInterface;
                    }
                    else {
                        mup = new mup(g);
                    }
                    k = j;
                    if (mup != null) {
                        final long clearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            try {
                                final Parcel qx = ((enz)mup).qX(2, ((enz)mup).qW());
                                final Account account = (Account)eob.a(qx, Account.CREATOR);
                                qx.recycle();
                                Binder.restoreCallingIdentity(clearCallingIdentity);
                            }
                            finally {}
                        }
                        catch (final RemoteException ex) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                            k = j;
                            break Label_0249;
                        }
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            }
            this.j = k;
        }
        else {
            this.g = g;
            this.j = j;
        }
        this.h = a;
        this.i = (Bundle)(Object)i;
        this.k = (Feature[])(Object)b;
        this.l = b2;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p14;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        mpg.a(this, parcel, n);
    }
}
