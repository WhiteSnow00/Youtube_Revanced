import androidx.preference.Preference;
import androidx.preference.ListPreference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adbh implements cep
{
    public final adbk a;
    public final aocp b;
    public final ListPreference c;
    
    public adbh(final adbk a, final aocp b, final ListPreference c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean a(final Preference preference, final Object o) {
        final adbk a = this.a;
        final aocp b = this.b;
        final ListPreference c = this.c;
        final aheu h = a.h;
        c.getClass();
        adfe.W(o, b, a, h, new adzx(c));
        return true;
    }
}
