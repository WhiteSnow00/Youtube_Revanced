import android.os.Parcel;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

final class arxd implements Closeable
{
    private Parcel a;
    
    public arxd(final Parcel a) {
        this.a = a;
    }
    
    public static arxd c() {
        return new arxd(Parcel.obtain());
    }
    
    public final Parcel a() {
        agot.E(this.a != null, (Object)"get() after close()/release()");
        return this.a;
    }
    
    public final Parcel b() {
        final Parcel a = this.a();
        this.a = null;
        return a;
    }
    
    @Override
    public final void close() {
        final Parcel a = this.a;
        if (a != null) {
            a.recycle();
            this.a = null;
        }
    }
}
