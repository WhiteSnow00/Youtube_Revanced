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
        CREATOR = (Parcelable$Creator)new fzs(12);
    }
    
    public static zze g() {
        final zze zze = new zze();
        zze.m(0);
        return zze;
    }
    
    public abstract int a();
    
    public abstract ReelEditModel$DeletedItem b();
    
    public abstract afgh c();
    
    public abstract zze d();
    
    public final int describeContents() {
        return 0;
    }
    
    public final ReelItemEditModel e() {
        return this.c().get(this.a());
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
