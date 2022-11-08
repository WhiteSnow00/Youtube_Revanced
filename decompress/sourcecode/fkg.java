import android.view.View;
import java.lang.ref.WeakReference;
import android.graphics.Bitmap;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fkg
{
    public final WatchDescriptor a;
    public final aorm b;
    public final Bitmap c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    private final WeakReference h;
    
    public fkg() {
    }
    
    public fkg(final WatchDescriptor a, final WeakReference h, final aorm b, final Bitmap c, final int d, final boolean e, final boolean f, final boolean g) {
        this.a = a;
        this.h = h;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static fkf b() {
        final fkf fkf = new fkf();
        fkf.a = aorm.a;
        fkf.c(false);
        fkf.e(false);
        fkf.d(0);
        fkf.b(false);
        fkf.g(null);
        return fkf;
    }
    
    public final View a() {
        return (View)this.h.get();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof fkg) {
            final fkg fkg = (fkg)o;
            if (this.a.equals(fkg.a) && this.h.equals(fkg.h)) {
                final aorm b = this.b;
                if (b == null) {
                    if (fkg.b != null) {
                        return false;
                    }
                }
                else if (!((agzi)b).equals((Object)fkg.b)) {
                    return false;
                }
                final Bitmap c = this.c;
                if (c == null) {
                    if (fkg.c != null) {
                        return false;
                    }
                }
                else if (!c.equals(fkg.c)) {
                    return false;
                }
                if (this.d == fkg.d && this.e == fkg.e && this.f == fkg.f && this.g == fkg.g) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.h.hashCode();
        final aorm b = this.b;
        int hashCode3 = 0;
        int hashCode4;
        if (b == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = ((agzi)b).hashCode();
        }
        final Bitmap c = this.c;
        if (c != null) {
            hashCode3 = c.hashCode();
        }
        final int d = this.d;
        final boolean e = this.e;
        int n = 1237;
        int n2;
        if (!e) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        int n3;
        if (!this.f) {
            n3 = 1237;
        }
        else {
            n3 = 1231;
        }
        if (this.g) {
            n = 1231;
        }
        return (((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode4) * 1000003 ^ hashCode3) * 1000003 ^ d) * 1000003 ^ n2) * 1000003 ^ n3) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.h);
        final String value3 = String.valueOf(this.b);
        final String value4 = String.valueOf(this.c);
        final int d = this.d;
        final boolean e = this.e;
        final boolean f = this.f;
        final boolean g = this.g;
        final StringBuilder sb = new StringBuilder("AppWatchDescriptor{watchDescriptor=");
        sb.append(value);
        sb.append(", sourceViewWeakReference=");
        sb.append(value2);
        sb.append(", thumbnailDetails=");
        sb.append(value3);
        sb.append(", thumbnailBitmap=");
        sb.append(value4);
        sb.append(", playbackStartFlag=");
        sb.append(d);
        sb.append(", shouldStartWatchShuffled=");
        sb.append(e);
        sb.append(", overrideExitFullscreenToMaximized=");
        sb.append(f);
        sb.append(", persistCurrentPlayerViewMode=");
        sb.append(g);
        sb.append("}");
        return sb.toString();
    }
}
