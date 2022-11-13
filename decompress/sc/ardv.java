import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ardv extends eoa implements ardw
{
    public ardv() {
        super("com.google.vr.vrcore.library.api.IGvrUiLayout");
    }
    
    public static ardw asInterface(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.vr.vrcore.library.api.IGvrUiLayout");
        if (queryLocalInterface instanceof ardw) {
            return (ardw)queryLocalInterface;
        }
        return (ardw)new ardu(binder);
    }
    
    protected boolean dispatchTransaction(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        final ardz ardz = null;
        final ardz ardz2 = null;
        Object settingsButtonListener = null;
        switch (n) {
            default: {
                return false;
            }
            case 10: {
                final String string = parcel.readString();
                this.enforceNoDataAvail(parcel);
                this.setViewerName(string);
                parcel2.writeNoException();
                break;
            }
            case 9: {
                final IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface instanceof ardz) {
                        settingsButtonListener = queryLocalInterface;
                    }
                    else {
                        settingsButtonListener = new ardx(strongBinder);
                    }
                }
                this.enforceNoDataAvail(parcel);
                this.setSettingsButtonListener((ardz)settingsButtonListener);
                parcel2.writeNoException();
                break;
            }
            case 8: {
                final boolean k = eob.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.setSettingsButtonEnabled(k);
                parcel2.writeNoException();
                break;
            }
            case 7: {
                final IBinder strongBinder2 = parcel.readStrongBinder();
                Object transitionViewListener;
                if (strongBinder2 == null) {
                    transitionViewListener = ardz;
                }
                else {
                    final IInterface queryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface2 instanceof ardz) {
                        transitionViewListener = queryLocalInterface2;
                    }
                    else {
                        transitionViewListener = new ardx(strongBinder2);
                    }
                }
                this.enforceNoDataAvail(parcel);
                this.setTransitionViewListener((ardz)transitionViewListener);
                parcel2.writeNoException();
                break;
            }
            case 6: {
                final boolean i = eob.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.setTransitionViewEnabled(i);
                parcel2.writeNoException();
                break;
            }
            case 5: {
                final IBinder strongBinder3 = parcel.readStrongBinder();
                Object closeButtonListener;
                if (strongBinder3 == null) {
                    closeButtonListener = ardz2;
                }
                else {
                    final IInterface queryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface3 instanceof ardz) {
                        closeButtonListener = queryLocalInterface3;
                    }
                    else {
                        closeButtonListener = new ardx(strongBinder3);
                    }
                }
                this.enforceNoDataAvail(parcel);
                this.setCloseButtonListener((ardz)closeButtonListener);
                parcel2.writeNoException();
                break;
            }
            case 4: {
                final boolean enabled = this.isEnabled();
                parcel2.writeNoException();
                eob.f(parcel2, enabled);
                break;
            }
            case 3: {
                final boolean j = eob.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.setEnabled(j);
                parcel2.writeNoException();
                break;
            }
            case 2: {
                final ardz rootView = this.getRootView();
                parcel2.writeNoException();
                eob.j(parcel2, (IInterface)rootView);
                break;
            }
        }
        return true;
    }
}
