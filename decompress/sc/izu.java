import java.util.Arrays;
import android.text.TextUtils;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

final class izu
{
    public final String a;
    public final aotp b;
    public final Bitmap c;
    
    public izu(final String a, final aotp b, final Bitmap c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof izu)) {
            return false;
        }
        final izu izu = (izu)o;
        return TextUtils.equals((CharSequence)this.a, (CharSequence)izu.a) && adkp.ae((Object)this.b, (Object)izu.b);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
}
