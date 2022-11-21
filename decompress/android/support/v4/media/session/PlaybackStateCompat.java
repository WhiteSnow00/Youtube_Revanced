// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media.session;

import java.util.Iterator;
import android.media.session.PlaybackState$CustomAction;
import android.text.TextUtils;
import android.os.Parcel;
import java.util.Collection;
import java.util.ArrayList;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class PlaybackStateCompat implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final long b;
    public final long c;
    public final float d;
    public final long e;
    public final int f;
    public final CharSequence g;
    public final long h;
    public final List i;
    public final long j;
    public final Bundle k;
    public PlaybackState l;
    
    static {
        CREATOR = (Parcelable$Creator)new aw(13);
    }
    
    public PlaybackStateCompat(final int a, final long b, final long c, final float d, final long e, final int f, final CharSequence g, final long h, final List list, final long j, final Bundle k) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = new ArrayList(list);
        this.j = j;
        this.k = k;
    }
    
    public PlaybackStateCompat(final Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readLong();
        this.d = parcel.readFloat();
        this.h = parcel.readLong();
        this.c = parcel.readLong();
        this.e = parcel.readLong();
        this.g = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.i = parcel.createTypedArrayList(PlaybackStateCompat$CustomAction.CREATOR);
        this.j = parcel.readLong();
        this.k = parcel.readBundle(eg.class.getClassLoader());
        this.f = parcel.readInt();
    }
    
    public static PlaybackStateCompat a(Object next) {
        PlaybackStateCompat playbackStateCompat = null;
        if (next != null) {
            final PlaybackState l = (PlaybackState)next;
            final List q = eh.q(l);
            ArrayList list2;
            if (q != null) {
                final ArrayList list = new ArrayList(q.size());
                final Iterator iterator = q.iterator();
                while (iterator.hasNext()) {
                    next = iterator.next();
                    PlaybackStateCompat$CustomAction playbackStateCompat$CustomAction;
                    if (next != null) {
                        final PlaybackState$CustomAction e = (PlaybackState$CustomAction)next;
                        final Bundle m = eh.m(e);
                        eg.c(m);
                        playbackStateCompat$CustomAction = new PlaybackStateCompat$CustomAction(eh.p(e), eh.o(e), eh.b(e), m);
                        playbackStateCompat$CustomAction.e = e;
                    }
                    else {
                        playbackStateCompat$CustomAction = null;
                    }
                    list.add((Object)playbackStateCompat$CustomAction);
                }
                list2 = list;
            }
            else {
                list2 = null;
            }
            final Bundle a = ei.a(l);
            eg.c(a);
            playbackStateCompat = new PlaybackStateCompat(eh.c(l), eh.h(l), eh.f(l), eh.a(l), eh.d(l), 0, eh.n(l), eh.g(l), list2, eh.e(l), a);
            playbackStateCompat.l = l;
        }
        return playbackStateCompat;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", buffered position=");
        sb.append(this.c);
        sb.append(", speed=");
        sb.append(this.d);
        sb.append(", updated=");
        sb.append(this.h);
        sb.append(", actions=");
        sb.append(this.e);
        sb.append(", error code=");
        sb.append(this.f);
        sb.append(", error message=");
        sb.append(this.g);
        sb.append(", custom actions=");
        sb.append(this.i);
        sb.append(", active item id=");
        sb.append(this.j);
        sb.append("}");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.h);
        parcel.writeLong(this.c);
        parcel.writeLong(this.e);
        TextUtils.writeToParcel(this.g, parcel, n);
        parcel.writeTypedList(this.i);
        parcel.writeLong(this.j);
        parcel.writeBundle(this.k);
        parcel.writeInt(this.f);
    }
}
