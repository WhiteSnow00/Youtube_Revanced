// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.audioswap.model;

import java.util.Arrays;
import java.util.List;
import android.content.Context;
import android.text.TextUtils;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class TrackSelection implements Parcelable
{
    public final CharSequence b;
    public final int c;
    
    protected TrackSelection(final Parcel parcel) {
        this.b = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.c = parcel.readInt();
    }
    
    public TrackSelection(final CharSequence b, final int c) {
        this.c = c;
        this.b = b;
    }
    
    public abstract List a(final Context p0);
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this != o) {
            if (o instanceof TrackSelection) {
                final CharSequence b2 = this.b;
                final TrackSelection trackSelection = (TrackSelection)o;
                if (TextUtils.equals(b2, trackSelection.b)) {
                    if (this.c == trackSelection.c) {
                        b = b;
                        return b;
                    }
                    return false;
                }
            }
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[] { this.c, this.b });
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        TextUtils.writeToParcel(this.b, parcel, 0);
        parcel.writeInt(this.c);
    }
}
