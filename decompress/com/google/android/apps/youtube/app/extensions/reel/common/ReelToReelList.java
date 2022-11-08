// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.common;

import com.google.protobuf.MessageLite;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import android.os.Parcel;
import com.google.protos.youtube.api.innertube.ReelNonVideoContentRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint;
import android.os.Bundle;
import java.util.HashMap;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;
import j$.util.Optional;
import java.util.Collections;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class ReelToReelList implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final List a;
    public final List b;
    
    static {
        CREATOR = (Parcelable$Creator)new fzf(9);
    }
    
    public ReelToReelList(final aioe aioe) {
        agot.D(iba.y(aioe));
        this.a = Collections.unmodifiableList((List<?>)adwd.an(aioe));
        this.b = Collections.unmodifiableList((List<?>)adwd.an(Optional.empty()));
    }
    
    public ReelToReelList(final List a) {
        a.getClass();
        this.a = a;
        final ArrayList list = new ArrayList(a.size());
        final Iterator iterator = a.iterator();
        while (iterator.hasNext()) {
            agot.D(iba.y((aioe)iterator.next()));
            list.add(Optional.empty());
        }
        this.b = Collections.unmodifiableList((List<?>)list);
    }
    
    public ReelToReelList(final List a, final List b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        agot.D(a.size() == b.size());
        final Iterator iterator = a.iterator();
        while (iterator.hasNext()) {
            agot.D(iba.y((aioe)iterator.next()));
        }
    }
    
    public static Map a(final aioe aioe, final ReelToReelList list, final Map map) {
        if (aioe != null && ((agzd)aioe).rs((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            final int bz = aqql.bZ(((ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)aioe).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).n);
            if (bz != 0) {
                if (bz == 3) {
                    return map;
                }
            }
        }
        Map map2;
        if (map == null) {
            map2 = new HashMap();
        }
        else {
            map2 = map;
            if (!(map instanceof HashMap)) {
                map2 = new HashMap(map);
            }
        }
        Bundle bundle;
        if ((bundle = (Bundle)tmy.O(map2, (Object)"com.google.android.libraries.youtube.innertube.bundle", (Class)Bundle.class)) == null) {
            bundle = new Bundle();
            map2.put("com.google.android.libraries.youtube.innertube.bundle", bundle);
        }
        bundle.putParcelable("ReelToReelListBundleKey", (Parcelable)list);
        return map2;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("[ReelToReelList size=");
        sb.append(this.a.size());
        for (final aioe aioe : this.a) {
            if (((agzd)aioe).rs((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)aioe).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                sb.append(" video[");
                sb.append(reelWatchEndpointOuterClass$ReelWatchEndpoint.f);
                sb.append("]=");
                sb.append(reelWatchEndpointOuterClass$ReelWatchEndpoint.e);
            }
            else {
                if (!((agzd)aioe).rs((agyr)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint)) {
                    continue;
                }
                anss anss;
                if ((anss = ((ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint)((agzd)aioe).rr((agyr)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint)).b) == null) {
                    anss = anss.a;
                }
                final anqm anqm = (anqm)((agzd)anss).rr((agyr)ReelNonVideoContentRendererOuterClass.reelNonVideoContentRenderer);
                sb.append(" non-video content [screen_ve_type=");
                anuk anuk;
                if ((anuk = anqm.b) == null) {
                    anuk = anuk.a;
                }
                sb.append(anuk.c);
                sb.append(", id=");
                sb.append(anqm.e);
                sb.append("]");
            }
        }
        sb.append(']');
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int n) {
        final ParcelableMessageLite[] array = new ParcelableMessageLite[this.a.size()];
        final Iterator iterator = this.a.iterator();
        n = 0;
        while (iterator.hasNext()) {
            array[n] = new ParcelableMessageLite((MessageLite)iterator.next());
            ++n;
        }
        parcel.writeParcelableArray((Parcelable[])array, 0);
        for (final Optional optional : this.b) {
            if (optional.isPresent()) {
                parcel.writeByteArray(((agyc)optional.get()).I());
            }
            else {
                parcel.writeByteArray(new byte[0]);
            }
        }
    }
}
