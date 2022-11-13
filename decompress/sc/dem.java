import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dem implements dea
{
    private final ParcelFileDescriptorRewinder$InternalRewinder a;
    
    public dem(final ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }
    
    public static boolean d() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }
    
    public final /* bridge */ Object a() {
        return this.c();
    }
    
    public final void b() {
    }
    
    public final ParcelFileDescriptor c() {
        return this.a.rewind();
    }
}
