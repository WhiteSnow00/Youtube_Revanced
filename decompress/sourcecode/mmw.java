import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mmw extends eny implements IInterface
{
    public mmw(final IBinder binder) {
        super(binder, "com.google.android.gms.cast.internal.ICastDeviceController");
    }
    
    public final void a() {
        this.qT(1, this.qQ());
    }
    
    public final void b(final String s) {
        final Parcel qq = this.qQ();
        qq.writeString(s);
        this.qT(12, qq);
    }
}
