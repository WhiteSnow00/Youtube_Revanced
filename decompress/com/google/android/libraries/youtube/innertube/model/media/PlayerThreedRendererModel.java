// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.innertube.model.media;

import android.os.Parcel;
import java.util.Locale;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class PlayerThreedRendererModel implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    
    static {
        CREATOR = (Parcelable$Creator)new uik(14);
    }
    
    public PlayerThreedRendererModel() {
        this(0);
    }
    
    public PlayerThreedRendererModel(final int a) {
        this.a = a;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof PlayerThreedRendererModel && this.a == ((PlayerThreedRendererModel)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        final Locale us = Locale.US;
        final int a = this.a;
        String s;
        if (a != 0) {
            if (a != 1) {
                if (a != 3) {
                    s = "Invalid";
                }
                else {
                    s = "TOP_BOTTOM";
                }
            }
            else {
                s = "SBS_LR";
            }
        }
        else {
            s = "MONO";
        }
        return String.format(us, "PlayerThreedRendererModel{layout=%s}", s);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
    }
}
