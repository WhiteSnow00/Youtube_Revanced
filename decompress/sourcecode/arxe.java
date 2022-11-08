import j$.io.DesugarInputStream;
import java.io.OutputStream;
import java.io.ByteArrayInputStream;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable$Creator;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class arxe extends InputStream implements InputStreamRetargetInterface
{
    public final Parcelable$Creator a;
    public final boolean b;
    public final Parcelable c;
    InputStream d;
    Parcelable e;
    
    public arxe(final Parcelable$Creator a, final Parcelable c) {
        this.a = a;
        this.c = c;
        agot.u(this.b = true);
    }
    
    private final InputStream b() {
        if (this.d == null) {
            final Parcel obtain = Parcel.obtain();
            obtain.writeParcelable(this.c, 0);
            final byte[] marshall = obtain.marshall();
            obtain.recycle();
            this.d = new ByteArrayInputStream(marshall);
        }
        return this.d;
    }
    
    final int a(final Parcel parcel) {
        final int dataPosition = parcel.dataPosition();
        final Parcelable c = this.c;
        parcel.writeParcelable(c, c.describeContents());
        return parcel.dataPosition() - dataPosition;
    }
    
    @Override
    public final int available() {
        return this.b().available();
    }
    
    @Override
    public final void close() {
        final InputStream d = this.d;
        if (d != null) {
            d.close();
        }
    }
    
    @Override
    public final void mark(final int n) {
        final InputStream d = this.d;
        if (d != null) {
            d.mark(n);
        }
    }
    
    @Override
    public final boolean markSupported() {
        return true;
    }
    
    @Override
    public final int read() {
        return this.b().read();
    }
    
    @Override
    public final int read(final byte[] array, final int n, final int n2) {
        return this.b().read(array, n, n2);
    }
    
    @Override
    public final void reset() {
        final InputStream d = this.d;
        if (d != null) {
            d.reset();
        }
    }
    
    @Override
    public final long skip(final long n) {
        if (n <= 0L) {
            return 0L;
        }
        return this.b().skip(n);
    }
    
    public final String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("ParcelableInputStream[V: ");
        sb.append(value);
        sb.append("]");
        return sb.toString();
    }
}
