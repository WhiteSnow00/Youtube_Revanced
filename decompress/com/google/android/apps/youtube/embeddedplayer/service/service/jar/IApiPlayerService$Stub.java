// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import java.util.ArrayList;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d;
import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.c;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import java.util.List;
import android.view.KeyEvent;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.CommandWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.prewarm.model.EmbedsPrewarmData;
import android.os.IInterface;
import android.os.Parcel;

public abstract class IApiPlayerService$Stub extends eoa implements IApiPlayerService
{
    public IApiPlayerService$Stub() {
        super("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService");
    }
    
    protected final boolean dispatchTransaction(int n, final Parcel parcel, final Parcel parcel2, int n2) {
        switch (n) {
            default: {
                return false;
            }
            case 42: {
                final c b = this.b();
                parcel2.writeNoException();
                eob.j(parcel2, (IInterface)b);
                break;
            }
            case 41: {
                final EmbedsPrewarmData embedsPrewarmData = (EmbedsPrewarmData)eob.a(parcel, EmbedsPrewarmData.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.A(embedsPrewarmData);
                parcel2.writeNoException();
                break;
            }
            case 40: {
                final CommandWrapper commandWrapper = (CommandWrapper)eob.a(parcel, CommandWrapper.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.D(commandWrapper);
                parcel2.writeNoException();
                break;
            }
            case 39: {
                final d a = this.a();
                parcel2.writeNoException();
                eob.j(parcel2, (IInterface)a);
                break;
            }
            case 38: {
                final String string = parcel.readString();
                this.enforceNoDataAvail(parcel);
                this.l(string);
                parcel2.writeNoException();
                break;
            }
            case 37: {
                this.L();
                parcel2.writeNoException();
                break;
            }
            case 36: {
                final String string2 = parcel.readString();
                this.enforceNoDataAvail(parcel);
                this.K(string2);
                parcel2.writeNoException();
                break;
            }
            case 35: {
                final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d d = this.d();
                parcel2.writeNoException();
                eob.j(parcel2, (IInterface)d);
                break;
            }
            case 34: {
                final byte[] byteArray = parcel.createByteArray();
                this.enforceNoDataAvail(parcel);
                this.t(byteArray);
                parcel2.writeNoException();
                break;
            }
            case 33: {
                final byte[] q = this.Q();
                parcel2.writeNoException();
                parcel2.writeByteArray(q);
                break;
            }
            case 32: {
                final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c e = this.e();
                parcel2.writeNoException();
                eob.j(parcel2, (IInterface)e);
                break;
            }
            case 31: {
                this.m();
                parcel2.writeNoException();
                break;
            }
            case 30: {
                this.n();
                parcel2.writeNoException();
                break;
            }
            case 29: {
                final byte[] byteArray2 = parcel.createByteArray();
                this.enforceNoDataAvail(parcel);
                final boolean p4 = this.P(byteArray2);
                parcel2.writeNoException();
                eob.f(parcel2, p4);
                break;
            }
            case 28: {
                final byte[] r = this.R();
                parcel2.writeNoException();
                parcel2.writeByteArray(r);
                break;
            }
            case 27: {
                this.w();
                parcel2.writeNoException();
                break;
            }
            case 26: {
                n = parcel.readInt();
                final KeyEvent keyEvent = (KeyEvent)eob.a(parcel, KeyEvent.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.v(n, keyEvent);
                parcel2.writeNoException();
                break;
            }
            case 25: {
                n = parcel.readInt();
                final KeyEvent keyEvent2 = (KeyEvent)eob.a(parcel, KeyEvent.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.u(n, keyEvent2);
                parcel2.writeNoException();
                break;
            }
            case 24: {
                final boolean k = eob.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.k(k);
                parcel2.writeNoException();
                break;
            }
            case 23: {
                this.f();
                parcel2.writeNoException();
                break;
            }
            case 22: {
                final boolean i = eob.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.H(i);
                parcel2.writeNoException();
                break;
            }
            case 21: {
                this.J();
                parcel2.writeNoException();
                break;
            }
            case 20: {
                final boolean j = eob.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.I(j);
                parcel2.writeNoException();
                break;
            }
            case 19: {
                final boolean l = eob.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.G(l);
                parcel2.writeNoException();
                break;
            }
            case 18: {
                n = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.E(n);
                parcel2.writeNoException();
                break;
            }
            case 17: {
                n = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.F(n);
                parcel2.writeNoException();
                break;
            }
            case 16: {
                this.z();
                parcel2.writeNoException();
                break;
            }
            case 15: {
                this.r();
                parcel2.writeNoException();
                break;
            }
            case 14: {
                final boolean m = eob.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.B(m);
                parcel2.writeNoException();
                break;
            }
            case 13: {
                final boolean o = this.O();
                parcel2.writeNoException();
                eob.f(parcel2, o);
                break;
            }
            case 12: {
                this.g();
                parcel2.writeNoException();
                break;
            }
            case 11: {
                this.N();
                parcel2.writeNoException();
                break;
            }
            case 10: {
                this.M();
                parcel2.writeNoException();
                break;
            }
            case 9: {
                this.x();
                parcel2.writeNoException();
                break;
            }
            case 8: {
                this.y();
                parcel2.writeNoException();
                break;
            }
            case 7: {
                final ArrayList stringArrayList = parcel.createStringArrayList();
                n = parcel.readInt();
                n2 = parcel.readInt();
                final boolean k2 = eob.k(parcel);
                final int int1 = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.q(stringArrayList, n, n2, k2, int1);
                parcel2.writeNoException();
                break;
            }
            case 6: {
                final ArrayList stringArrayList2 = parcel.createStringArrayList();
                n = parcel.readInt();
                n2 = parcel.readInt();
                final int int2 = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.j(stringArrayList2, n, n2, int2);
                parcel2.writeNoException();
                break;
            }
            case 5: {
                final String string3 = parcel.readString();
                n = parcel.readInt();
                n2 = parcel.readInt();
                final boolean k3 = eob.k(parcel);
                final int int3 = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.o(string3, n, n2, k3, int3);
                parcel2.writeNoException();
                break;
            }
            case 4: {
                final String string4 = parcel.readString();
                n = parcel.readInt();
                final int int4 = parcel.readInt();
                n2 = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.h(string4, n, int4, n2);
                parcel2.writeNoException();
                break;
            }
            case 3: {
                final String string5 = parcel.readString();
                final boolean k4 = eob.k(parcel);
                n2 = parcel.readInt();
                final boolean k5 = eob.k(parcel);
                n = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.p(string5, k4, n2, k5, n);
                parcel2.writeNoException();
                break;
            }
            case 2: {
                final String string6 = parcel.readString();
                n = parcel.readInt();
                n2 = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.i(string6, n, n2);
                parcel2.writeNoException();
                break;
            }
            case 1: {
                final VisibilityChangeEventData visibilityChangeEventData = (VisibilityChangeEventData)eob.a(parcel, VisibilityChangeEventData.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.s(visibilityChangeEventData);
                parcel2.writeNoException();
                break;
            }
        }
        return true;
    }
}
