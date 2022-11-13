// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.audioswap.model;

import java.util.Arrays;
import android.text.TextUtils;
import android.os.Parcel;
import android.net.Uri;
import android.text.Spanned;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class Track implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final Spanned a;
    public final Spanned b;
    public final int c;
    public final Uri d;
    public final aotp e;
    public final Spanned f;
    private final Spanned g;
    
    static {
        CREATOR = (Parcelable$Creator)new ukg(1);
    }
    
    public Track(final Parcel parcel) {
        final Spanned a = (Spanned)parcel.readValue(Spanned.class.getClassLoader());
        a.getClass();
        this.a = a;
        final Spanned b = (Spanned)parcel.readValue(Spanned.class.getClassLoader());
        b.getClass();
        this.b = b;
        this.c = parcel.readInt();
        final Uri d = (Uri)parcel.readValue(Uri.class.getClassLoader());
        d.getClass();
        this.d = d;
        aotp e = null;
        try {
            try {
                final int int1 = parcel.readInt();
                final byte[] array = new byte[int1];
                parcel.readByteArray(array);
                if (int1 > 0) {
                    e = (aotp)ahbh.parseFrom((ahbh)aotp.a, array);
                }
                this.e = e;
            }
            finally {}
        }
        catch (final ahca ahca) {
            ttr.d("Cannot deserialize thumbnail details", (Throwable)ahca);
            this.e = null;
        }
        this.g = (Spanned)parcel.readValue(Spanned.class.getClassLoader());
        this.f = (Spanned)parcel.readValue(Spanned.class.getClassLoader());
        adkp.H(this.c > 0);
        return;
        this.e = null;
    }
    
    public Track(final Spanned a, final Spanned b, final int c, final Uri d, final aotp e, final Spanned g, final Spanned f) {
        adkp.H(c > 0);
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        this.c = c;
        d.getClass();
        this.d = d;
        this.e = e;
        this.g = g;
        this.f = f;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Track)) {
            return false;
        }
        final Track track = (Track)o;
        return TextUtils.equals((CharSequence)this.b, (CharSequence)track.b) && TextUtils.equals((CharSequence)this.a, (CharSequence)track.a) && this.c == track.c && adkp.ae(this.d, track.d) && adkp.ae(this.e, track.e) && TextUtils.equals((CharSequence)this.g, (CharSequence)track.g) && TextUtils.equals((CharSequence)this.f, (CharSequence)track.f);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.d, this.e, this.g, this.f });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeValue((Object)this.a);
        parcel.writeValue((Object)this.b);
        parcel.writeInt(this.c);
        parcel.writeValue((Object)this.d);
        final aotp e = this.e;
        byte[] byteArray;
        if (e != null) {
            byteArray = ((agzk)e).toByteArray();
        }
        else {
            byteArray = new byte[0];
        }
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
        parcel.writeValue((Object)this.g);
        parcel.writeValue((Object)this.f);
    }
}
