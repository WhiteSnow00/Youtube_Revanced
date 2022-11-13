// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcelable;
import android.text.TextUtils;
import android.os.Parcel;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import android.os.Parcelable$Creator;

public class RelatedVideosScreen implements BusSupported$Data
{
    public static final Parcelable$Creator CREATOR;
    public static final RelatedVideosScreen a;
    public final CharSequence b;
    public final afeq c;
    
    static {
        a = new RelatedVideosScreen("", new ArrayList());
        CREATOR = (Parcelable$Creator)new f(0);
    }
    
    public RelatedVideosScreen(final CharSequence b, final List list) {
        this.b = b;
        this.c = afeq.o((Collection)list);
    }
    
    @Override
    public final b d() {
        return com.google.android.apps.youtube.embeddedplayer.service.model.b.i;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof RelatedVideosScreen)) {
            return false;
        }
        final RelatedVideosScreen relatedVideosScreen = (RelatedVideosScreen)o;
        return relatedVideosScreen.b.toString().contentEquals(this.b) && agpi.V((List)this.c, (Object)relatedVideosScreen.c);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.b, this.c });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        TextUtils.writeToParcel(this.b, parcel, n);
        parcel.writeTypedArray((Parcelable[])((afeh)this.c).toArray(new RelatedVideoItem[0]), n);
    }
}
