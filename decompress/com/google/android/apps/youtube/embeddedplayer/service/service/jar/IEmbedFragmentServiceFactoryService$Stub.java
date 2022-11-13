// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.h;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.j;
import android.os.Parcel;

public abstract class IEmbedFragmentServiceFactoryService$Stub extends eoa implements IEmbedFragmentServiceFactoryService
{
    public IEmbedFragmentServiceFactoryService$Stub() {
        super("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService");
    }
    
    protected final boolean dispatchTransaction(int int1, final Parcel parcel, final Parcel parcel2, final int n) {
        if (int1 == 1) {
            final IBinder strongBinder = parcel.readStrongBinder();
            Object o;
            if (strongBinder == null) {
                o = null;
            }
            else {
                final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IEmbedFragmentClient");
                if (queryLocalInterface instanceof j) {
                    o = queryLocalInterface;
                }
                else {
                    o = new h(strongBinder);
                }
            }
            int1 = parcel.readInt();
            this.enforceNoDataAvail(parcel);
            final IEmbedFragmentService a = this.a((j)o, int1);
            parcel2.writeNoException();
            eob.j(parcel2, (IInterface)a);
            return true;
        }
        return false;
    }
}
