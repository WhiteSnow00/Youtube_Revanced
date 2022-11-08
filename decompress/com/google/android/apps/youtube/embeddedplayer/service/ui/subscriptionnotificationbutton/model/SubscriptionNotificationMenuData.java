// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model;

import android.os.Parcel;
import java.util.Collection;
import com.google.android.apps.youtube.embeddedplayer.service.model.f;
import java.util.List;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class SubscriptionNotificationMenuData implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public static final SubscriptionNotificationMenuData a;
    public final afcr b;
    
    static {
        a = new SubscriptionNotificationMenuData(new ArrayList());
        CREATOR = (Parcelable$Creator)new f(13);
    }
    
    public SubscriptionNotificationMenuData(final List list) {
        this.b = afcr.o((Collection)list);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof SubscriptionNotificationMenuData && adwd.ar((List)this.b, ((SubscriptionNotificationMenuData)o).b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeTypedArray((Parcelable[])((afci)this.b).toArray(new SubscriptionNotificationMenuItem[0]), n);
    }
}
