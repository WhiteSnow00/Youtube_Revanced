// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class SelectableItemKey implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final int b;
    
    static {
        CREATOR = (Parcelable$Creator)new f(3);
    }
    
    public SelectableItemKey(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof SelectableItemKey)) {
            return false;
        }
        final SelectableItemKey selectableItemKey = (SelectableItemKey)o;
        return this.a == selectableItemKey.a && this.b == selectableItemKey.b;
    }
    
    @Override
    public final int hashCode() {
        return (this.a + 527) * 31 + this.b;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }
}
