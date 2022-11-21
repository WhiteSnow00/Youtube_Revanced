import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;

// 
// Decompiled by Procyon v0.6.0
// 

final class cfc implements ceq
{
    final PreferenceGroup a;
    final cfe b;
    
    public cfc(final cfe b, final PreferenceGroup a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean b(final Preference preference) {
        this.a.ad(Integer.MAX_VALUE);
        this.b.b();
        return true;
    }
}
