import android.os.Parcel;
import android.os.Parcelable;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Binder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oxi extends Binder
{
    private final Bundle a;
    
    public oxi(final Bitmap bitmap) {
        final Bundle a = new Bundle();
        this.a = a;
        if (bitmap != null) {
            a.putParcelable("bitmap", (Parcelable)bitmap);
        }
    }
    
    protected final boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        int n3 = n;
        if (n == 1) {
            if (parcel2 != null) {
                parcel2.writeNoException();
                parcel2.writeBundle(this.a);
                return true;
            }
            n3 = 1;
        }
        return super.onTransact(n3, parcel, parcel2, n2);
    }
}
