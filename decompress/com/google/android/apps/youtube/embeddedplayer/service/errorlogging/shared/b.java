// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared;

import java.util.HashMap;
import java.util.Map;
import com.google.android.apps.youtube.embeddedplayer.service.model.RemoteEmbedExceptionData;
import android.os.Parcel;

public abstract class b extends eoa implements c
{
    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.IEmbedsErrorLoggingService");
    }
    
    protected final boolean dispatchTransaction(int n, final Parcel parcel, final Parcel parcel2, int n2) {
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            return false;
                        }
                        n2 = parcel.readInt();
                        n = parcel.readInt();
                        final String string = parcel.readString();
                        final String string2 = parcel.readString();
                        this.enforceNoDataAvail(parcel);
                        this.e(n2, n, string, string2);
                    }
                    else {
                        n = parcel.readInt();
                        n2 = parcel.readInt();
                        final RemoteEmbedExceptionData remoteEmbedExceptionData = (RemoteEmbedExceptionData)eob.a(parcel, RemoteEmbedExceptionData.CREATOR);
                        final String string3 = parcel.readString();
                        final HashMap d = eob.d(parcel);
                        this.enforceNoDataAvail(parcel);
                        this.b(n, n2, remoteEmbedExceptionData, string3, (Map)d);
                    }
                }
                else {
                    n2 = parcel.readInt();
                    n = parcel.readInt();
                    final RemoteEmbedExceptionData remoteEmbedExceptionData2 = (RemoteEmbedExceptionData)eob.a(parcel, RemoteEmbedExceptionData.CREATOR);
                    final String string4 = parcel.readString();
                    this.enforceNoDataAvail(parcel);
                    this.a(n2, n, remoteEmbedExceptionData2, string4);
                }
            }
            else {
                n = parcel.readInt();
                n2 = parcel.readInt();
                final String string5 = parcel.readString();
                this.enforceNoDataAvail(parcel);
                this.d(n, n2, string5);
            }
        }
        else {
            final RemoteEmbedExceptionData remoteEmbedExceptionData3 = (RemoteEmbedExceptionData)eob.a(parcel, RemoteEmbedExceptionData.CREATOR);
            this.enforceNoDataAvail(parcel);
            this.c(remoteEmbedExceptionData3);
        }
        return true;
    }
}
