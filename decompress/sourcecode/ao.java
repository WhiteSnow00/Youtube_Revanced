import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.IBinder;
import android.os.Looper;
import android.os.IInterface;
import android.os.Handler;
import android.os.Binder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ao extends Binder implements ap
{
    public final /* synthetic */ lk a;
    private Handler b;
    
    public ao() {
        this.attachInterface((IInterface)this, "android.support.customtabs.ICustomTabsCallback");
    }
    
    public ao(final lk a, final byte[] array) {
        this.a = a;
        this.attachInterface((IInterface)this, "android.support.customtabs.ICustomTabsCallback");
        this.b = new Handler(Looper.getMainLooper());
    }
    
    public final IBinder asBinder() {
        return (IBinder)this;
    }
    
    public final boolean onTransact(int int1, final Parcel parcel, final Parcel parcel2, final int n) {
        if (int1 > 0 && int1 <= 16777215) {
            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
        }
        if (int1 != 1598968902) {
            switch (int1) {
                default: {
                    return super.onTransact(int1, parcel, parcel2, n);
                }
                case 8: {
                    parcel.readInt();
                    final Bundle bundle = (Bundle)c.f(parcel, Bundle.CREATOR);
                    this.b.post((Runnable)new tg(0));
                    parcel2.writeNoException();
                    break;
                }
                case 7: {
                    parcel.readString();
                    final Bundle bundle2 = (Bundle)c.f(parcel, Bundle.CREATOR);
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    break;
                }
                case 6: {
                    parcel.readInt();
                    final Uri uri = (Uri)c.f(parcel, Uri.CREATOR);
                    parcel.readInt();
                    final Bundle bundle3 = (Bundle)c.f(parcel, Bundle.CREATOR);
                    this.b.post((Runnable)new tg(1));
                    parcel2.writeNoException();
                    break;
                }
                case 5: {
                    parcel.readString();
                    final Bundle bundle4 = (Bundle)c.f(parcel, Bundle.CREATOR);
                    this.b.post((Runnable)new pp(this, 15));
                    parcel2.writeNoException();
                    break;
                }
                case 4: {
                    final Bundle bundle5 = (Bundle)c.f(parcel, Bundle.CREATOR);
                    this.b.post((Runnable)new pp(this, 14));
                    parcel2.writeNoException();
                    break;
                }
                case 3: {
                    this.b.post((Runnable)new vo(this, parcel.readString(), (Bundle)c.f(parcel, Bundle.CREATOR), 1));
                    parcel2.writeNoException();
                    break;
                }
                case 2: {
                    int1 = parcel.readInt();
                    final Bundle bundle6 = (Bundle)c.f(parcel, Bundle.CREATOR);
                    this.b.post((Runnable)new ccl(this, int1, 1));
                    parcel2.writeNoException();
                    break;
                }
            }
            return true;
        }
        parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
        return true;
    }
}
