// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.upload.util;

import j$.util.Objects;
import android.os.Parcel;
import android.net.Uri;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class UploadThumbnailExtractor$ThumbnailFileInfo implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final Uri a;
    public final Long b;
    public final String c;
    
    static {
        CREATOR = (Parcelable$Creator)new acao(3);
    }
    
    public UploadThumbnailExtractor$ThumbnailFileInfo(final Uri a, final Long b) {
        this.a = a;
        this.b = b;
        this.c = null;
    }
    
    public UploadThumbnailExtractor$ThumbnailFileInfo(final Parcel parcel) {
        this.a = (Uri)parcel.readValue(Uri.class.getClassLoader());
        this.b = (Long)parcel.readValue(Long.class.getClassLoader());
        this.c = (String)parcel.readValue(String.class.getClassLoader());
    }
    
    public UploadThumbnailExtractor$ThumbnailFileInfo(final String c) {
        this.a = null;
        this.b = null;
        this.c = c;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UploadThumbnailExtractor$ThumbnailFileInfo)) {
            return false;
        }
        final UploadThumbnailExtractor$ThumbnailFileInfo uploadThumbnailExtractor$ThumbnailFileInfo = (UploadThumbnailExtractor$ThumbnailFileInfo)o;
        return Objects.equals((Object)this.a, (Object)uploadThumbnailExtractor$ThumbnailFileInfo.a) && Objects.equals((Object)this.b, (Object)uploadThumbnailExtractor$ThumbnailFileInfo.b) && Objects.equals((Object)this.c, (Object)uploadThumbnailExtractor$ThumbnailFileInfo.c);
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.a, this.b, this.c });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeValue((Object)this.a);
        parcel.writeValue((Object)this.b);
        parcel.writeValue((Object)this.c);
    }
}
