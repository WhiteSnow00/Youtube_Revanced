// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.cloudmessaging;

import android.os.Parcel;
import android.os.Message;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class CloudMessagingMessengerCompat implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    Messenger a;
    
    static {
        CREATOR = (Parcelable$Creator)new mob(2);
    }
    
    public CloudMessagingMessengerCompat(final IBinder binder) {
        this.a = new Messenger(binder);
    }
    
    public final IBinder a() {
        final Messenger a = this.a;
        a.getClass();
        return a.getBinder();
    }
    
    public final void b(final Message message) {
        final Messenger a = this.a;
        a.getClass();
        a.send(message);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        try {
            return this.a().equals(((CloudMessagingMessengerCompat)o).a());
        }
        catch (final ClassCastException ex) {
            return false;
        }
    }
    
    @Override
    public final int hashCode() {
        return this.a().hashCode();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final Messenger a = this.a;
        a.getClass();
        parcel.writeStrongBinder(a.getBinder());
    }
}
