// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.databus.shared;

import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data;
import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupportedDataWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.a;

public final class b extends eoa implements c
{
    private final a a;
    
    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.databus.shared.IDataBusClient");
    }
    
    public b(final a a, final byte[] array) {
        super("com.google.android.apps.youtube.embeddedplayer.service.databus.shared.IDataBusClient");
        this.a = a;
    }
    
    public final void a(final BusSupportedDataWrapper busSupportedDataWrapper) {
        final a a = this.a;
        final BusSupported$Data a2 = busSupportedDataWrapper.a;
        if (a2 == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a.a(a2);
            return;
        }
        ((Handler)a.a).post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.a(a, a2, 1, (byte[])null));
    }
    
    protected final boolean dispatchTransaction(int i, final Parcel parcel, final Parcel parcel2, int length) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            final BusSupportedDataWrapper[] array = (BusSupportedDataWrapper[])parcel.createTypedArray(BusSupportedDataWrapper.CREATOR);
            this.enforceNoDataAvail(parcel);
            length = array.length;
            final BusSupported$Data[] array2 = new BusSupported$Data[length];
            for (i = 0; i < array.length; ++i) {
                array2[i] = array[i].a;
            }
            final a a = this.a;
            if (length != 0) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    a.b(array2);
                }
                else {
                    ((Handler)a.a).post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.a(a, array2, 0, (byte[])null));
                }
            }
        }
        else {
            final BusSupportedDataWrapper busSupportedDataWrapper = (BusSupportedDataWrapper)eob.a(parcel, BusSupportedDataWrapper.CREATOR);
            this.enforceNoDataAvail(parcel);
            this.a(busSupportedDataWrapper);
        }
        parcel2.writeNoException();
        return true;
    }
}
