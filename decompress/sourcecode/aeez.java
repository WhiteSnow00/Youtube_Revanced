import java.util.ArrayList;
import android.os.IBinder;
import android.os.IInterface;
import java.util.List;
import android.os.Parcelable;
import android.os.Bundle;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aeez extends enz implements aefa
{
    public aeez() {
        super("com.google.android.youtube.player.internal.IEmbedFragment");
    }
    
    protected final boolean dispatchTransaction(int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        final aeew aeew = null;
        final aefg aefg = null;
        aeew aeew2 = null;
        switch (n) {
            default: {
                return false;
            }
            case 32: {
                final IBinder strongBinder = parcel.readStrongBinder();
                this.enforceNoDataAvail(parcel);
                this.h(strongBinder);
                parcel2.writeNoException();
                break;
            }
            case 31: {
                final IBinder strongBinder2 = parcel.readStrongBinder();
                this.enforceNoDataAvail(parcel);
                this.g(strongBinder2);
                parcel2.writeNoException();
                break;
            }
            case 30: {
                final String string = parcel.readString();
                n = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.n(string, n);
                parcel2.writeNoException();
                break;
            }
            case 29: {
                final String string2 = parcel.readString();
                this.enforceNoDataAvail(parcel);
                this.e(string2);
                parcel2.writeNoException();
                break;
            }
            case 28: {
                n = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.o(n);
                parcel2.writeNoException();
                break;
            }
            case 27: {
                n = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.p(n);
                parcel2.writeNoException();
                break;
            }
            case 26: {
                this.D();
                parcel2.writeNoException();
                break;
            }
            case 25: {
                final String string3 = parcel.readString();
                this.enforceNoDataAvail(parcel);
                this.C(string3);
                parcel2.writeNoException();
                break;
            }
            case 24: {
                final String string4 = parcel.readString();
                final IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    final IInterface queryLocalInterface = strongBinder3.queryLocalInterface("com.google.android.youtube.player.internal.IAsyncResultCallback");
                    if (queryLocalInterface instanceof aeew) {
                        aeew2 = (aeew)queryLocalInterface;
                    }
                    else {
                        aeew2 = new aeew(strongBinder3);
                    }
                }
                this.enforceNoDataAvail(parcel);
                this.G(string4, aeew2);
                parcel2.writeNoException();
                break;
            }
            case 23: {
                final IBinder strongBinder4 = parcel.readStrongBinder();
                aeew aeew3;
                if (strongBinder4 == null) {
                    aeew3 = aeew;
                }
                else {
                    final IInterface queryLocalInterface2 = strongBinder4.queryLocalInterface("com.google.android.youtube.player.internal.IAsyncResultCallback");
                    if (queryLocalInterface2 instanceof aeew) {
                        aeew3 = (aeew)queryLocalInterface2;
                    }
                    else {
                        aeew3 = new aeew(strongBinder4);
                    }
                }
                this.enforceNoDataAvail(parcel);
                this.F(aeew3);
                parcel2.writeNoException();
                break;
            }
            case 22: {
                final boolean k = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.t(k);
                parcel2.writeNoException();
                break;
            }
            case 21: {
                final boolean i = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.s(i);
                parcel2.writeNoException();
                break;
            }
            case 20: {
                final String string5 = parcel.readString();
                this.enforceNoDataAvail(parcel);
                this.r(string5);
                parcel2.writeNoException();
                break;
            }
            case 19: {
                final String string6 = parcel.readString();
                this.enforceNoDataAvail(parcel);
                this.x(string6);
                parcel2.writeNoException();
                break;
            }
            case 18: {
                this.l();
                parcel2.writeNoException();
                break;
            }
            case 17: {
                this.m();
                parcel2.writeNoException();
                break;
            }
            case 16: {
                this.d();
                parcel2.writeNoException();
                break;
            }
            case 15: {
                this.c();
                parcel2.writeNoException();
                break;
            }
            case 14: {
                final String string7 = parcel.readString();
                this.enforceNoDataAvail(parcel);
                this.A(string7);
                parcel2.writeNoException();
                break;
            }
            case 13: {
                parcel2.writeNoException();
                break;
            }
            case 12: {
                final IBinder strongBinder5 = parcel.readStrongBinder();
                Object o;
                if (strongBinder5 == null) {
                    o = aefg;
                }
                else {
                    final IInterface queryLocalInterface3 = strongBinder5.queryLocalInterface("com.google.android.youtube.player.internal.IJarEmbedFragmentClient");
                    if (queryLocalInterface3 instanceof aefg) {
                        o = queryLocalInterface3;
                    }
                    else {
                        o = new aefe(strongBinder5);
                    }
                }
                this.enforceNoDataAvail(parcel);
                this.u((aefg)o);
                parcel2.writeNoException();
                break;
            }
            case 11: {
                this.q();
                parcel2.writeNoException();
                break;
            }
            case 10: {
                final Bundle bundle = (Bundle)eoa.a(parcel, Bundle.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.k(bundle);
                parcel2.writeNoException();
                break;
            }
            case 9: {
                final Bundle a = this.a();
                parcel2.writeNoException();
                eoa.i(parcel2, (Parcelable)a);
                break;
            }
            case 8: {
                n = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.v(n);
                parcel2.writeNoException();
                break;
            }
            case 7: {
                this.E();
                parcel2.writeNoException();
                break;
            }
            case 6: {
                final ArrayList stringArrayList = parcel.createStringArrayList();
                final boolean j = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.B((List)stringArrayList, j);
                parcel2.writeNoException();
                break;
            }
            case 5: {
                final String string8 = parcel.readString();
                final boolean l = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.w(string8, l);
                parcel2.writeNoException();
                break;
            }
            case 4: {
                final String string9 = parcel.readString();
                final boolean m = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.z(string9, m);
                parcel2.writeNoException();
                break;
            }
            case 3: {
                this.j();
                parcel2.writeNoException();
                break;
            }
            case 2: {
                parcel2.writeNoException();
                break;
            }
            case 1: {
                final aefw b = this.b();
                parcel2.writeNoException();
                eoa.j(parcel2, (IInterface)b);
                break;
            }
        }
        return true;
    }
}
