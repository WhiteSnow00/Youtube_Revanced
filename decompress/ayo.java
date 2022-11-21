import java.util.List;
import java.util.Arrays;
import android.net.Uri;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ayo
{
    public final UUID a;
    public final Uri b;
    public final afgm c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final afgh g;
    public final byte[] h;
    
    public ayo(final elw elw, final byte[] array, final byte[] array2) {
        bad.f(true);
        final Object d = elw.d;
        bad.b(d);
        this.a = (UUID)d;
        final byte[] array3 = null;
        this.b = null;
        this.c = (afgm)elw.e;
        this.d = false;
        this.f = false;
        this.e = false;
        this.g = (afgh)elw.c;
        final Object b = elw.b;
        byte[] copy = array3;
        if (b != null) {
            final byte[] array4 = (byte[])b;
            copy = Arrays.copyOf(array4, array4.length);
        }
        this.h = copy;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ayo)) {
            return false;
        }
        final ayo ayo = (ayo)o;
        if (this.a.equals(ayo.a)) {
            final Uri b = ayo.b;
            if (baz.aa(null, null) && baz.aa(this.c, ayo.c)) {
                final boolean d = ayo.d;
                final boolean f = ayo.f;
                final boolean e = ayo.e;
                if (agpx.T(this.g, ayo.g) && Arrays.equals(this.h, ayo.h)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() * 961 + this.c.hashCode()) * 923521 + this.g.hashCode()) * 31 + Arrays.hashCode(this.h);
    }
}
