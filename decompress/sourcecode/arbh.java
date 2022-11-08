import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class arbh extends enz implements arbi
{
    public arbh() {
        super("com.google.vr.vrcore.library.api.IGvrUiLayout");
    }
    
    public static arbi asInterface(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.vr.vrcore.library.api.IGvrUiLayout");
        if (queryLocalInterface instanceof arbi) {
            return (arbi)queryLocalInterface;
        }
        return (arbi)new arbg(binder);
    }
    
    protected boolean dispatchTransaction(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        final arbl arbl = null;
        final arbl arbl2 = null;
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
                    if (queryLocalInterface instanceof arbl) {
                        settingsButtonListener = queryLocalInterface;
                    }
                    else {
                        settingsButtonListener = new arbj(strongBinder);
                    }
                }
                this.enforceNoDataAvail(parcel);
                this.setSettingsButtonListener((arbl)settingsButtonListener);
                parcel2.writeNoException();
                break;
            }
            case 8: {
                final boolean k = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.setSettingsButtonEnabled(k);
                parcel2.writeNoException();
                break;
            }
            case 7: {
                final IBinder strongBinder2 = parcel.readStrongBinder();
                Object transitionViewListener;
                if (strongBinder2 == null) {
                    transitionViewListener = arbl;
                }
                else {
                    final IInterface queryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface2 instanceof arbl) {
                        transitionViewListener = queryLocalInterface2;
                    }
                    else {
                        transitionViewListener = new arbj(strongBinder2);
                    }
                }
                this.enforceNoDataAvail(parcel);
                this.setTransitionViewListener((arbl)transitionViewListener);
                parcel2.writeNoException();
                break;
            }
            case 6: {
                final boolean i = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.setTransitionViewEnabled(i);
                parcel2.writeNoException();
                break;
            }
            case 5: {
                final IBinder strongBinder3 = parcel.readStrongBinder();
                Object closeButtonListener;
                if (strongBinder3 == null) {
                    closeButtonListener = arbl2;
                }
                else {
                    final IInterface queryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface3 instanceof arbl) {
                        closeButtonListener = queryLocalInterface3;
                    }
                    else {
                        closeButtonListener = new arbj(strongBinder3);
                    }
                }
                this.enforceNoDataAvail(parcel);
                this.setCloseButtonListener((arbl)closeButtonListener);
                parcel2.writeNoException();
                break;
            }
            case 4: {
                final boolean enabled = this.isEnabled();
                parcel2.writeNoException();
                eoa.f(parcel2, enabled);
                break;
            }
            case 3: {
                final boolean j = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.setEnabled(j);
                parcel2.writeNoException();
                break;
            }
            case 2: {
                final arbl rootView = this.getRootView();
                parcel2.writeNoException();
                eoa.j(parcel2, (IInterface)rootView);
                break;
            }
        }
        return true;
    }
}
