// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.flexbox;

import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.model.f;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class FlexboxLayoutManager$SavedState implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    public int b;
    
    static {
        CREATOR = (Parcelable$Creator)new f(20);
    }
    
    public FlexboxLayoutManager$SavedState() {
    }
    
    public FlexboxLayoutManager$SavedState(final Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
    }
    
    public FlexboxLayoutManager$SavedState(final FlexboxLayoutManager$SavedState flexboxLayoutManager$SavedState) {
        this.a = flexboxLayoutManager$SavedState.a;
        this.b = flexboxLayoutManager$SavedState.b;
    }
    
    public final void a() {
        this.a = -1;
    }
    
    public final boolean b(final int n) {
        final int a = this.a;
        return a >= 0 && a < n;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("SavedState{mAnchorPosition=");
        sb.append(this.a);
        sb.append(", mAnchorOffset=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }
}
