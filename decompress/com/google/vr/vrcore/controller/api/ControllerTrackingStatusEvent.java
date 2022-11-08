// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class ControllerTrackingStatusEvent extends ControllerEvent
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    
    static {
        CREATOR = (Parcelable$Creator)new arao(13);
    }
    
    public ControllerTrackingStatusEvent() {
        this.a = 0;
    }
    
    public ControllerTrackingStatusEvent(final Parcel parcel) {
        this.a = 0;
        this.b(parcel);
    }
    
    public int a() {
        return 20;
    }
    
    public void b(final Parcel parcel) {
        final int dataPosition = parcel.dataPosition();
        final int int1 = parcel.readInt();
        super.b(parcel);
        this.a = parcel.readInt();
        parcel.setDataPosition(dataPosition + int1);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final int dataPosition = parcel.dataPosition();
        parcel.writeInt(20);
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.a);
        if (parcel.dataPosition() - dataPosition == 20) {
            return;
        }
        throw new IllegalStateException("Parcelable implemented incorrectly, getByteSize() must return the correct size for each ControllerEvent subclass.");
    }
}
