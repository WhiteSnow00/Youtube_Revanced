// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.content.Intent;
import android.os.Parcel;

public abstract class f extends eoa implements g
{
    public f() {
        super("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IApiPlayerClient");
    }
    
    protected final boolean dispatchTransaction(int int1, final Parcel parcel, final Parcel parcel2, final int n) {
        switch (int1) {
            default: {
                return false;
            }
            case 22: {
                final String string = parcel.readString();
                this.enforceNoDataAvail(parcel);
                this.y(string);
                parcel2.writeNoException();
                break;
            }
            case 21: {
                final Intent intent = (Intent)eob.a(parcel, Intent.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.z(intent);
                parcel2.writeNoException();
                break;
            }
            case 20: {
                final String string2 = parcel.readString();
                this.enforceNoDataAvail(parcel);
                final String a = this.a(string2);
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            }
            case 19: {
                this.h();
                parcel2.writeNoException();
                break;
            }
            case 18: {
                this.i();
                parcel2.writeNoException();
                break;
            }
            case 17: {
                this.q();
                parcel2.writeNoException();
                break;
            }
            case 16: {
                final boolean k = eob.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.k(k);
                parcel2.writeNoException();
                break;
            }
            case 15: {
                final long long1 = parcel.readLong();
                this.enforceNoDataAvail(parcel);
                this.u(long1);
                parcel2.writeNoException();
                break;
            }
            case 14: {
                final boolean i = eob.k(parcel);
                final long long2 = parcel.readLong();
                this.enforceNoDataAvail(parcel);
                this.g(i, long2);
                parcel2.writeNoException();
                break;
            }
            case 13: {
                final long long3 = parcel.readLong();
                final long long4 = parcel.readLong();
                this.enforceNoDataAvail(parcel);
                this.t(long3, long4);
                parcel2.writeNoException();
                break;
            }
            case 12: {
                this.v();
                parcel2.writeNoException();
                break;
            }
            case 11: {
                final long long5 = parcel.readLong();
                this.enforceNoDataAvail(parcel);
                this.o(long5);
                parcel2.writeNoException();
                break;
            }
            case 10: {
                final long long6 = parcel.readLong();
                final long long7 = parcel.readLong();
                this.enforceNoDataAvail(parcel);
                this.p(long6, long7);
                parcel2.writeNoException();
                break;
            }
            case 9: {
                final String string3 = parcel.readString();
                this.enforceNoDataAvail(parcel);
                this.j(string3);
                parcel2.writeNoException();
                break;
            }
            case 8: {
                this.w();
                parcel2.writeNoException();
                break;
            }
            case 7: {
                this.x();
                parcel2.writeNoException();
                break;
            }
            case 6: {
                this.b();
                parcel2.writeNoException();
                break;
            }
            case 5: {
                final String string4 = parcel.readString();
                final String string5 = parcel.readString();
                final long long8 = parcel.readLong();
                final long long9 = parcel.readLong();
                final boolean j = eob.k(parcel);
                final boolean l = eob.k(parcel);
                int1 = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.l(string4, string5, long8, long9, j, l, int1);
                parcel2.writeNoException();
                break;
            }
            case 4: {
                this.m();
                parcel2.writeNoException();
                break;
            }
            case 3: {
                this.r();
                parcel2.writeNoException();
                break;
            }
            case 2: {
                this.n();
                parcel2.writeNoException();
                break;
            }
            case 1: {
                this.s();
                parcel2.writeNoException();
                break;
            }
        }
        return true;
    }
}
