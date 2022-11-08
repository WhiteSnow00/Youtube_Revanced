// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.edit.fragment;

import java.util.List;
import android.os.Parcel;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public abstract class ReelEditModel implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new fzf(13);
    }
    
    public static zvm g() {
        final zvm zvm = new zvm();
        zvm.l(0);
        return zvm;
    }
    
    public abstract int a();
    
    public abstract ReelEditModel$DeletedItem b();
    
    public abstract afcr c();
    
    public abstract zvm d();
    
    public final int describeContents() {
        return 0;
    }
    
    public final ReelItemEditModel e() {
        return (ReelItemEditModel)this.c().get(this.a());
    }
    
    public final RecordingInfo f() {
        return this.e().d();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeTypedList((List)this.c());
        parcel.writeInt(this.a());
        parcel.writeParcelable((Parcelable)this.b(), n);
    }
}
