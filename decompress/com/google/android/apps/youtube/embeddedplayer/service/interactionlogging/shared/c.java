// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared;

import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import android.os.Parcel;

public abstract class c extends eoa implements d
{
    public c() {
        super("com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.IEmbedInteractionLoggingService");
    }
    
    protected final boolean dispatchTransaction(int n, final Parcel parcel, final Parcel parcel2, int n2) {
        switch (n) {
            default: {
                return false;
            }
            case 12: {
                n = parcel.readInt();
                final byte[] byteArray = parcel.createByteArray();
                this.enforceNoDataAvail(parcel);
                this.e(n, byteArray);
                parcel2.writeNoException();
                break;
            }
            case 11: {
                n = parcel.readInt();
                n2 = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.d(n, n2);
                parcel2.writeNoException();
                break;
            }
            case 10: {
                n = parcel.readInt();
                final byte[] byteArray2 = parcel.createByteArray();
                this.enforceNoDataAvail(parcel);
                this.k(n, byteArray2);
                parcel2.writeNoException();
                break;
            }
            case 9: {
                n2 = parcel.readInt();
                n = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.j(n2, n);
                parcel2.writeNoException();
                break;
            }
            case 8: {
                final byte[] byteArray3 = parcel.createByteArray();
                this.enforceNoDataAvail(parcel);
                this.c(byteArray3);
                parcel2.writeNoException();
                break;
            }
            case 7: {
                n = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.b(n);
                parcel2.writeNoException();
                break;
            }
            case 6: {
                final byte[] byteArray4 = parcel.createByteArray();
                this.enforceNoDataAvail(parcel);
                this.i(byteArray4);
                parcel2.writeNoException();
                break;
            }
            case 5: {
                n = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.h(n);
                parcel2.writeNoException();
                break;
            }
            case 4: {
                n = parcel.readInt();
                final SimplePlaybackDescriptor simplePlaybackDescriptor = (SimplePlaybackDescriptor)eob.a(parcel, SimplePlaybackDescriptor.CREATOR);
                final boolean k = eob.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.f(n, simplePlaybackDescriptor, k);
                parcel2.writeNoException();
                break;
            }
            case 3: {
                n = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.g(n);
                parcel2.writeNoException();
                break;
            }
            case 2: {
                n = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.l(n);
                parcel2.writeNoException();
                break;
            }
            case 1: {
                n = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                n = this.a(n);
                parcel2.writeNoException();
                parcel2.writeInt(n);
                break;
            }
        }
        return true;
    }
}
