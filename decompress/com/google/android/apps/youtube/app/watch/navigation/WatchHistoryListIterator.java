// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.watch.navigation;

import java.util.ArrayDeque;
import java.util.Deque;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.Collection;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class WatchHistoryListIterator extends gfz implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new hxf(4);
    }
    
    public WatchHistoryListIterator() {
    }
    
    public WatchHistoryListIterator(final Parcel parcel) {
        PlaybackStartDescriptor e;
        if (parcel.readByte() != 0) {
            e = e(parcel);
        }
        else {
            e = null;
        }
        final Deque f = f(parcel);
        final Deque f2 = f(parcel);
        if (e == null) {
            agot.D(f.isEmpty());
            agot.D(f2.isEmpty());
        }
        this.a();
        super.c = e;
        super.a.addAll(f);
        super.b.addAll(f2);
    }
    
    static final PlaybackStartDescriptor e(final Parcel parcel) {
        return (PlaybackStartDescriptor)parcel.readParcelable(PlaybackStartDescriptor.class.getClassLoader());
    }
    
    static final Deque f(final Parcel parcel) {
        final int int1 = parcel.readInt();
        int i = 0;
        final int max = Math.max(int1, 0);
        final ArrayDeque arrayDeque = new ArrayDeque<PlaybackStartDescriptor>(max);
        if (max != 0) {
            while (i < max) {
                arrayDeque.offerLast(e(parcel));
                ++i;
            }
        }
        return arrayDeque;
    }
    
    static void g(final Parcel parcel, final int n, final Deque deque) {
        final ArrayDeque arrayDeque = new ArrayDeque(deque);
        final int size = arrayDeque.size();
        parcel.writeInt(size);
        if (size != 0) {
            for (int i = 0; i < size; ++i) {
                parcel.writeParcelable((Parcelable)arrayDeque.pollFirst(), n);
            }
        }
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final PlaybackStartDescriptor playbackStartDescriptor = (PlaybackStartDescriptor)super.c;
        if (playbackStartDescriptor != null) {
            parcel.writeByte((byte)1);
            parcel.writeParcelable((Parcelable)playbackStartDescriptor, n);
        }
        else {
            parcel.writeByte((byte)0);
        }
        final ArrayDeque arrayDeque = new ArrayDeque(super.a);
        while (arrayDeque.size() > 10) {
            arrayDeque.pollLast();
        }
        g(parcel, n, arrayDeque);
        final ArrayDeque arrayDeque2 = new ArrayDeque(super.b);
        while (arrayDeque2.size() > 10) {
            arrayDeque2.pollLast();
        }
        g(parcel, n, arrayDeque2);
    }
}
