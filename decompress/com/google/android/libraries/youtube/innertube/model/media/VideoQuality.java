// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.innertube.model.media;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class VideoQuality implements Comparable, Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final String b;
    private final boolean c;
    
    static {
        CREATOR = (Parcelable$Creator)new ulj(15);
    }
    
    public VideoQuality(final int a, final String b, final boolean c) {
        this.a = a;
        twd.n(b);
        this.b = b;
        this.c = c;
    }
    
    public VideoQuality(final FormatStreamModel formatStreamModel) {
        this(formatStreamModel.f(), formatStreamModel.u(), formatStreamModel.J());
    }
    
    @Override
    public final /* bridge */ int compareTo(final Object o) {
        final VideoQuality videoQuality = (VideoQuality)o;
        if (videoQuality == null) {
            return 1;
        }
        return this.a - videoQuality.a;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof VideoQuality) {
            final int a = this.a;
            final VideoQuality videoQuality = (VideoQuality)o;
            if (a == videoQuality.a && this.b.equals(videoQuality.b) && this.c == videoQuality.c) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final String toString() {
        return this.b;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeInt((int)(this.c ? 1 : 0));
    }
}
