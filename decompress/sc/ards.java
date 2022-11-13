import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ards extends eoa implements ardt
{
    public ards() {
        super("com.google.vr.vrcore.library.api.IGvrLayout");
    }
    
    public static ardt asInterface(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.vr.vrcore.library.api.IGvrLayout");
        if (queryLocalInterface instanceof ardt) {
            return (ardt)queryLocalInterface;
        }
        return (ardt)new ardr(binder);
    }
    
    protected boolean dispatchTransaction(int int1, final Parcel parcel, final Parcel parcel2, final int n) {
        final ardz ardz = null;
        final ardz ardz2 = null;
        Object presentationView = null;
        final ardz ardz3 = null;
        switch (int1) {
            default: {
                return false;
            }
            case 14: {
                final IBinder strongBinder = parcel.readStrongBinder();
                Object onDonNotNeededListener;
                if (strongBinder == null) {
                    onDonNotNeededListener = ardz3;
                }
                else {
                    final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface instanceof ardz) {
                        onDonNotNeededListener = queryLocalInterface;
                    }
                    else {
                        onDonNotNeededListener = new ardx(strongBinder);
                    }
                }
                this.enforceNoDataAvail(parcel);
                final boolean setOnDonNotNeededListener = this.setOnDonNotNeededListener((ardz)onDonNotNeededListener);
                parcel2.writeNoException();
                eob.f(parcel2, setOnDonNotNeededListener);
                break;
            }
            case 13: {
                final IBinder strongBinder2 = parcel.readStrongBinder();
                Object reentryIntent;
                if (strongBinder2 == null) {
                    reentryIntent = ardz;
                }
                else {
                    final IInterface queryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface2 instanceof ardz) {
                        reentryIntent = queryLocalInterface2;
                    }
                    else {
                        reentryIntent = new ardx(strongBinder2);
                    }
                }
                this.enforceNoDataAvail(parcel);
                this.setReentryIntent((ardz)reentryIntent);
                parcel2.writeNoException();
                break;
            }
            case 12: {
                this.onBackPressed();
                parcel2.writeNoException();
                break;
            }
            case 11: {
                final boolean k = eob.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.setStereoModeEnabled(k);
                parcel2.writeNoException();
                break;
            }
            case 10: {
                final IBinder strongBinder3 = parcel.readStrongBinder();
                Object o;
                if (strongBinder3 == null) {
                    o = ardz2;
                }
                else {
                    final IInterface queryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface3 instanceof ardz) {
                        o = queryLocalInterface3;
                    }
                    else {
                        o = new ardx(strongBinder3);
                    }
                }
                this.enforceNoDataAvail(parcel);
                final boolean enableCardboardTriggerEmulation = this.enableCardboardTriggerEmulation((ardz)o);
                parcel2.writeNoException();
                eob.f(parcel2, enableCardboardTriggerEmulation);
                break;
            }
            case 9: {
                int1 = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                final boolean enableAsyncReprojection = this.enableAsyncReprojection(int1);
                parcel2.writeNoException();
                eob.f(parcel2, enableAsyncReprojection);
                break;
            }
            case 8: {
                final IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    final IInterface queryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface4 instanceof ardz) {
                        presentationView = queryLocalInterface4;
                    }
                    else {
                        presentationView = new ardx(strongBinder4);
                    }
                }
                this.enforceNoDataAvail(parcel);
                this.setPresentationView((ardz)presentationView);
                parcel2.writeNoException();
                break;
            }
            case 7: {
                this.shutdown();
                parcel2.writeNoException();
                break;
            }
            case 6: {
                this.onResume();
                parcel2.writeNoException();
                break;
            }
            case 5: {
                this.onPause();
                parcel2.writeNoException();
                break;
            }
            case 4: {
                final ardw uiLayout = this.getUiLayout();
                parcel2.writeNoException();
                eob.j(parcel2, (IInterface)uiLayout);
                break;
            }
            case 3: {
                final ardz rootView = this.getRootView();
                parcel2.writeNoException();
                eob.j(parcel2, (IInterface)rootView);
                break;
            }
            case 2: {
                final long nativeGvrContext = this.getNativeGvrContext();
                parcel2.writeNoException();
                parcel2.writeLong(nativeGvrContext);
                break;
            }
        }
        return true;
    }
}
