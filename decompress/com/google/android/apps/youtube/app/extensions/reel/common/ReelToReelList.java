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
        CREATOR = (Parcelable$Creator)new fzn(9);
    }
    
    public ReelToReelList(final aiqj aiqj) {
        adkp.Q(hko.o(aiqj));
        this.a = Collections.unmodifiableList((List<?>)agpi.R((Object[])new aiqj[] { aiqj }));
        this.b = Collections.unmodifiableList((List<?>)agpi.R((Object[])new Optional[] { Optional.empty() }));
    }
    
    public ReelToReelList(final List a) {
        a.getClass();
        this.a = a;
        final ArrayList list = new ArrayList(a.size());
        final Iterator iterator = a.iterator();
        while (iterator.hasNext()) {
            adkp.Q(hko.o((aiqj)iterator.next()));
            list.add(Optional.empty());
        }
        this.b = Collections.unmodifiableList((List<?>)list);
    }
    
    public ReelToReelList(final List a, final List b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        adkp.Q(a.size() == b.size());
        final Iterator iterator = a.iterator();
        while (iterator.hasNext()) {
            adkp.Q(hko.o((aiqj)iterator.next()));
        }
    }
    
    public static Map a(final aiqj aiqj, final ReelToReelList list, final Map map) {
        if (aiqj != null && ((ahbc)aiqj).ry((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            final int ca = aqsx.ca(((ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)aiqj).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).n);
            if (ca != 0) {
                if (ca == 3) {
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
        if ((bundle = (Bundle)tpe.O(map2, (Object)"com.google.android.libraries.youtube.innertube.bundle", (Class)Bundle.class)) == null) {
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
        for (final aiqj aiqj : this.a) {
            if (((ahbc)aiqj).ry((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)aiqj).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                sb.append(" video[");
                sb.append(reelWatchEndpointOuterClass$ReelWatchEndpoint.f);
                sb.append("]=");
                sb.append(reelWatchEndpointOuterClass$ReelWatchEndpoint.e);
            }
            else {
                if (!((ahbc)aiqj).ry((ahaq)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint)) {
                    continue;
                }
                anuv anuv;
                if ((anuv = ((ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint)((ahbc)aiqj).rx((ahaq)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint)).b) == null) {
                    anuv = anuv.a;
                }
                final ansq ansq = (ansq)((ahbc)anuv).rx((ahaq)ReelNonVideoContentRendererOuterClass.reelNonVideoContentRenderer);
                sb.append(" non-video content [screen_ve_type=");
                anwn anwn;
                if ((anwn = ansq.b) == null) {
                    anwn = anwn.a;
                }
                sb.append(anwn.c);
                sb.append(", id=");
                sb.append(ansq.e);
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
                parcel.writeByteArray(((ahab)optional.get()).I());
            }
            else {
                parcel.writeByteArray(new byte[0]);
            }
        }
    }
}
