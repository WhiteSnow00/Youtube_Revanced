import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class arbe extends enz implements arbf
{
    public arbe() {
        super("com.google.vr.vrcore.library.api.IGvrLayout");
    }
    
    public static arbf asInterface(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.vr.vrcore.library.api.IGvrLayout");
        if (queryLocalInterface instanceof arbf) {
            return (arbf)queryLocalInterface;
        }
        return (arbf)new arbd(binder);
    }
    
    protected boolean dispatchTransaction(int int1, final Parcel parcel, final Parcel parcel2, final int n) {
        final arbl arbl = null;
        final arbl arbl2 = null;
        final arbl arbl3 = null;
        Object onDonNotNeededListener = null;
        switch (int1) {
            default: {
                return false;
            }
            case 14: {
                final IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface instanceof arbl) {
                        onDonNotNeededListener = queryLocalInterface;
                    }
                    else {
                        onDonNotNeededListener = new arbj(strongBinder);
                    }
                }
                this.enforceNoDataAvail(parcel);
                final boolean setOnDonNotNeededListener = this.setOnDonNotNeededListener((arbl)onDonNotNeededListener);
                parcel2.writeNoException();
                eoa.f(parcel2, setOnDonNotNeededListener);
                break;
            }
            case 13: {
                final IBinder strongBinder2 = parcel.readStrongBinder();
                Object reentryIntent;
                if (strongBinder2 == null) {
                    reentryIntent = arbl;
                }
                else {
                    final IInterface queryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface2 instanceof arbl) {
                        reentryIntent = queryLocalInterface2;
                    }
                    else {
                        reentryIntent = new arbj(strongBinder2);
                    }
                }
                this.enforceNoDataAvail(parcel);
                this.setReentryIntent((arbl)reentryIntent);
                parcel2.writeNoException();
                break;
            }
            case 12: {
                this.onBackPressed();
                parcel2.writeNoException();
                break;
            }
            case 11: {
                final boolean k = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.setStereoModeEnabled(k);
                parcel2.writeNoException();
                break;
            }
            case 10: {
                final IBinder strongBinder3 = parcel.readStrongBinder();
                Object o;
                if (strongBinder3 == null) {
                    o = arbl2;
                }
                else {
                    final IInterface queryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface3 instanceof arbl) {
                        o = queryLocalInterface3;
                    }
                    else {
                        o = new arbj(strongBinder3);
                    }
                }
                this.enforceNoDataAvail(parcel);
                final boolean enableCardboardTriggerEmulation = this.enableCardboardTriggerEmulation((arbl)o);
                parcel2.writeNoException();
                eoa.f(parcel2, enableCardboardTriggerEmulation);
                break;
            }
            case 9: {
                int1 = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                final boolean enableAsyncReprojection = this.enableAsyncReprojection(int1);
                parcel2.writeNoException();
                eoa.f(parcel2, enableAsyncReprojection);
                break;
            }
            case 8: {
                final IBinder strongBinder4 = parcel.readStrongBinder();
                Object presentationView;
                if (strongBinder4 == null) {
                    presentationView = arbl3;
                }
                else {
                    final IInterface queryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface4 instanceof arbl) {
                        presentationView = queryLocalInterface4;
                    }
                    else {
                        presentationView = new arbj(strongBinder4);
                    }
                }
                this.enforceNoDataAvail(parcel);
                this.setPresentationView((arbl)presentationView);
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
                final arbi uiLayout = this.getUiLayout();
                parcel2.writeNoException();
                eoa.j(parcel2, (IInterface)uiLayout);
                break;
            }
            case 3: {
                final arbl rootView = this.getRootView();
                parcel2.writeNoException();
                eoa.j(parcel2, (IInterface)rootView);
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
