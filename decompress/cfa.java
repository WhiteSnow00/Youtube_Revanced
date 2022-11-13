import android.text.TextUtils;
import androidx.preference.Preference;

// 
// Decompiled by Procyon v0.6.0
// 

final class cfa
{
    final int a;
    final int b;
    final String c;
    
    public cfa(final Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.B;
        this.b = preference.C;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof cfa)) {
            return false;
        }
        final cfa cfa = (cfa)o;
        return this.a == cfa.a && this.b == cfa.b && TextUtils.equals((CharSequence)this.c, (CharSequence)cfa.c);
    }
    
    @Override
    public final int hashCode() {
        return ((this.a + 527) * 31 + this.b) * 31 + this.c.hashCode();
    }
}
