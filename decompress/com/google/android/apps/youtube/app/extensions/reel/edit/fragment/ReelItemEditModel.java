// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.edit.fragment;

import android.os.Parcel;
import com.google.android.libraries.video.editablevideo.EditableVideo;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.libraries.video.editablevideo.EditableVideoEdits;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public abstract class ReelItemEditModel implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new fzf(15);
    }
    
    public static hiq g() {
        final hiq hiq = new hiq();
        hiq.c(false);
        return hiq;
    }
    
    public abstract hiq a();
    
    public abstract EditableVideoEdits b();
    
    public abstract VideoMetaData c();
    
    public abstract RecordingInfo d();
    
    public final int describeContents() {
        return 0;
    }
    
    public abstract String e();
    
    public abstract boolean f();
    
    public final EditableVideo h() {
        return new EditableVideo(this.b(), this.c());
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.d(), n);
        parcel.writeParcelable((Parcelable)this.c(), n);
        parcel.writeParcelable((Parcelable)this.b(), n);
        parcel.writeString(this.e());
        parcel.writeByte((byte)(byte)(this.f() ? 1 : 0));
    }
}
