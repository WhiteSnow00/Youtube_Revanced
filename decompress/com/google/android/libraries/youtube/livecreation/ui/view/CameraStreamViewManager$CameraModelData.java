// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.livecreation.ui.view;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class CameraStreamViewManager$CameraModelData implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    public int b;
    public int c;
    public boolean d;
    
    static {
        CREATOR = (Parcelable$Creator)new vjo(7);
    }
    
    public CameraStreamViewManager$CameraModelData() {
    }
    
    public CameraStreamViewManager$CameraModelData(final Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = (parcel.readByte() != 0);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeByte((byte)(byte)(this.d ? 1 : 0));
    }
}
