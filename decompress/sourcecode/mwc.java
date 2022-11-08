import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mwc extends eny implements IInterface
{
    public mwc(final IBinder binder) {
        super(binder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }
    
    public final int a() {
        final Parcel qr = this.qR(6, this.qQ());
        final int int1 = qr.readInt();
        qr.recycle();
        return int1;
    }
}
