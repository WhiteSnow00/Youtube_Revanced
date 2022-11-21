// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.common;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class RecordingInfo implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final int b;
    public final String c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final apnu i;
    public final boolean j;
    
    static {
        CREATOR = (Parcelable$Creator)new ulj(4);
    }
    
    public RecordingInfo(final Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readString();
        this.d = parcel.readLong();
        final int int1 = parcel.readInt();
        final boolean b = true;
        this.e = (int1 != 0);
        this.f = (parcel.readInt() != 0);
        this.g = (parcel.readInt() != 0);
        this.h = parcel.readString();
        this.i = apnu.b(parcel.readInt());
        this.j = (parcel.readInt() != 0 && b);
    }
    
    public RecordingInfo(final String c, final boolean e, final int a, final int b, final long d, final boolean f, final boolean g, final String h, final apnu apnu, final boolean j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        apnu a2 = apnu;
        if (apnu == null) {
            a2 = apnu.a;
        }
        this.i = a2;
        this.j = j;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt((int)(this.e ? 1 : 0));
        parcel.writeInt((int)(this.f ? 1 : 0));
        parcel.writeInt((int)(this.g ? 1 : 0));
        parcel.writeString(this.h);
        parcel.writeInt(this.i.d);
        parcel.writeInt((int)(this.j ? 1 : 0));
    }
}
