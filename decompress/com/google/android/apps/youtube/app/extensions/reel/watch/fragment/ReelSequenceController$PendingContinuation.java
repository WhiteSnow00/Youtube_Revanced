// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.watch.fragment;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class ReelSequenceController$PendingContinuation implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public boolean a;
    public String b;
    public int c;
    
    static {
        CREATOR = (Parcelable$Creator)new fzf(16);
    }
    
    public ReelSequenceController$PendingContinuation() {
        this.a = false;
        this.b = null;
        this.c = 1;
    }
    
    public ReelSequenceController$PendingContinuation(final Parcel parcel) {
        this.a = (parcel.readByte() != 0);
        this.b = parcel.readString();
        final int int1 = parcel.readInt();
        if (int1 >= 0) {
            hor.a();
            if (int1 < 2) {
                this.c = hor.a()[int1];
                return;
            }
        }
        this.c = 1;
    }
    
    public final boolean a() {
        return !aexs.f(this.b);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, int c) {
        parcel.writeByte((byte)(byte)(this.a ? 1 : 0));
        parcel.writeString(this.b);
        c = this.c;
        if (c != 0) {
            parcel.writeInt(c - 1);
            return;
        }
        throw null;
    }
}
