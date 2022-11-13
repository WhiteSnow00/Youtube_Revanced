// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.c;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem;
import android.os.IInterface;
import android.os.Parcel;

public abstract class IEmbedFragmentService$Stub extends eoa implements IEmbedFragmentService
{
    public IEmbedFragmentService$Stub() {
        super("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService");
    }
    
    protected final boolean dispatchTransaction(int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return false;
            }
            case 12: {
                final d d = this.d();
                parcel2.writeNoException();
                eob.j(parcel2, (IInterface)d);
                break;
            }
            case 11: {
                final c b = this.b();
                parcel2.writeNoException();
                eob.j(parcel2, (IInterface)b);
                break;
            }
            case 10: {
                this.f();
                parcel2.writeNoException();
                break;
            }
            case 9: {
                this.g();
                parcel2.writeNoException();
                break;
            }
            case 8: {
                this.k();
                parcel2.writeNoException();
                break;
            }
            case 7: {
                final SubscriptionNotificationMenuItem subscriptionNotificationMenuItem = (SubscriptionNotificationMenuItem)eob.a(parcel, SubscriptionNotificationMenuItem.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.i(subscriptionNotificationMenuItem);
                parcel2.writeNoException();
                break;
            }
            case 6: {
                this.h();
                parcel2.writeNoException();
                break;
            }
            case 5: {
                this.j();
                parcel2.writeNoException();
                break;
            }
            case 4: {
                n = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.e(n);
                parcel2.writeNoException();
                break;
            }
            case 3: {
                n = this.a();
                parcel2.writeNoException();
                parcel2.writeInt(n);
                break;
            }
            case 2: {
                this.l();
                parcel2.writeNoException();
                break;
            }
            case 1: {
                final SimplePlaybackDescriptor simplePlaybackDescriptor = (SimplePlaybackDescriptor)eob.a(parcel, SimplePlaybackDescriptor.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.u(simplePlaybackDescriptor);
                parcel2.writeNoException();
                break;
            }
        }
        return true;
    }
}
