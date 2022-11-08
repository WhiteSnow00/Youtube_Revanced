import j$.nio.charset.StandardCharsets;
import android.os.Bundle;
import android.os.Parcel;
import java.util.concurrent.Future;
import android.content.Context;
import android.os.Binder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oxk extends Binder
{
    protected final Context a;
    public Integer b;
    public final Future c;
    
    public oxk(final Context context) {
        this.c = new oxj(this);
        this.a = context.getApplicationContext();
    }
    
    protected final boolean onTransact(int n, final Parcel parcel, final Parcel parcel2, int i) {
        if (parcel == null) {
            return super.onTransact(n, (Parcel)null, parcel2, i);
        }
        final Bundle bundle = parcel.readBundle(Bundle.class.getClassLoader());
        if (n == 1) {
            if (bundle != null) {
                byte[] array = bundle.getByteArray("challenge");
                if (array != null && parcel2 != null) {
                    final int length = array.length;
                    if (length != 0) {
                        n = -2078137563;
                        for (i = 0; i < length; ++i) {
                            n = (n ^ array[i]) * 435;
                        }
                        array = Long.toHexString((long)n & 0xFFFFFFFFL).getBytes(StandardCharsets.UTF_8);
                    }
                    final Bundle bundle2 = new Bundle();
                    bundle2.putInt("version", 1);
                    bundle2.putByteArray("challenge_reply", array);
                    bundle2.putString("caller_package", this.a.getApplicationContext().getPackageName());
                    parcel2.writeNoException();
                    parcel2.writeBundle(bundle2);
                }
            }
            return true;
        }
        if (n == 2) {
            if (bundle != null) {
                synchronized (this.c) {
                    this.b = bundle.getInt("activity_result");
                    this.c.notifyAll();
                }
            }
            return true;
        }
        return super.onTransact(n, parcel, parcel2, i);
    }
}
