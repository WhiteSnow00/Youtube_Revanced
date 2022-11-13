// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.mdisync.internal;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.mdisync.SyncOptions;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SyncRequest extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final byte[] a;
    public final SyncOptions b;
    public final int c;
    
    static {
        CREATOR = (Parcelable$Creator)new nbu(10);
    }
    
    public SyncRequest(int c, final byte[] a, final SyncOptions b) {
        final int n = 1;
        int n2;
        if (c != 0) {
            n2 = 2;
            if (c != 1) {
                if (c != 2) {
                    n2 = 4;
                    if (c != 3) {
                        if (c != 4) {
                            n2 = 0;
                        }
                        else {
                            n2 = 5;
                        }
                    }
                }
                else {
                    n2 = 3;
                }
            }
        }
        else {
            n2 = 1;
        }
        if (n2 == 0) {
            c = n;
        }
        else {
            c = n2;
        }
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.S(parcel, 1, this.c - 1);
        khl.W(parcel, 2, this.a);
        khl.af(parcel, 3, (Parcelable)this.b, n);
        khl.N(parcel, m);
    }
}
