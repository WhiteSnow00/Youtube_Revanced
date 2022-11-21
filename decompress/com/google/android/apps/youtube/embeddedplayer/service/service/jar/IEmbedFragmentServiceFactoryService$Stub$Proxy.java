// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.Parcel;
import android.os.IInterface;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.j;
import android.os.IBinder;

public class IEmbedFragmentServiceFactoryService$Stub$Proxy extends eoc implements IEmbedFragmentServiceFactoryService
{
    public IEmbedFragmentServiceFactoryService$Stub$Proxy(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService");
    }
    
    public final IEmbedFragmentService a(final j j, final int n) {
        final Parcel qv = this.qV();
        eoe.j(qv, (IInterface)j);
        qv.writeInt(n);
        final Parcel qw = this.qW(1, qv);
        final IBinder strongBinder = qw.readStrongBinder();
        IEmbedFragmentService embedFragmentService;
        if (strongBinder == null) {
            embedFragmentService = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService");
            if (queryLocalInterface instanceof IEmbedFragmentService) {
                embedFragmentService = (IEmbedFragmentService)queryLocalInterface;
            }
            else {
                embedFragmentService = new IEmbedFragmentService$Stub$Proxy(strongBinder);
            }
        }
        qw.recycle();
        return embedFragmentService;
    }
}
