import java.util.Arrays;
import android.text.TextUtils;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

final class iyv
{
    public final String a;
    public final aorm b;
    public final Bitmap c;
    
    public iyv(final String a, final aorm b, final Bitmap c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof iyv)) {
            return false;
        }
        final iyv iyv = (iyv)o;
        return TextUtils.equals((CharSequence)this.a, (CharSequence)iyv.a) && aeda.v(this.b, iyv.b);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
}
