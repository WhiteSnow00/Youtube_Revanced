import android.text.TextUtils;
import androidx.preference.Preference;

// 
// Decompiled by Procyon v0.6.0
// 

final class cfd
{
    final int a;
    final int b;
    final String c;
    
    public cfd(final Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.B;
        this.b = preference.C;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof cfd)) {
            return false;
        }
        final cfd cfd = (cfd)o;
        return this.a == cfd.a && this.b == cfd.b && TextUtils.equals((CharSequence)this.c, (CharSequence)cfd.c);
    }
    
    @Override
    public final int hashCode() {
        return ((this.a + 527) * 31 + this.b) * 31 + this.c.hashCode();
    }
}
