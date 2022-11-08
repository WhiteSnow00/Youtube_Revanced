// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.common;

import java.util.NoSuchElementException;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class ReelWatchBackstack$BackstackEntryStack implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final List a;
    
    static {
        CREATOR = (Parcelable$Creator)new fzf(11);
    }
    
    public ReelWatchBackstack$BackstackEntryStack() {
        this.a = new ArrayList();
    }
    
    public ReelWatchBackstack$BackstackEntryStack(final Parcel parcel) {
        this();
        parcel.readTypedList(this.a, ReelWatchBackstack$BackstackEntry.CREATOR);
    }
    
    public final int a() {
        return this.a.size();
    }
    
    public final ReelWatchBackstack$BackstackEntry b(final int n) {
        return this.a.get(n);
    }
    
    public final ReelWatchBackstack$BackstackEntry c() {
        if (this.a.isEmpty()) {
            return null;
        }
        return (ReelWatchBackstack$BackstackEntry)adwd.aK(this.a);
    }
    
    public final ReelWatchBackstack$BackstackEntry d() {
        if (!this.a.isEmpty()) {
            final List a = this.a;
            return (ReelWatchBackstack$BackstackEntry)a.remove(a.size() - 1);
        }
        throw new NoSuchElementException();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void e(final ReelWatchBackstack$BackstackEntry reelWatchBackstack$BackstackEntry) {
        this.a.add(reelWatchBackstack$BackstackEntry);
    }
    
    public final boolean f() {
        return this.a.isEmpty();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeTypedList(this.a);
    }
}
