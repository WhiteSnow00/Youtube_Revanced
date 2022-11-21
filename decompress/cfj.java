import android.util.AttributeSet;
import androidx.preference.Preference;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import android.content.Context;
import androidx.preference.PreferenceScreen;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cfj
{
    public boolean a;
    public PreferenceScreen b;
    public cfi c;
    public cfg d;
    public cfh e;
    private final Context f;
    private long g;
    private SharedPreferences h;
    private SharedPreferences$Editor i;
    private String j;
    
    public cfj(final Context f) {
        this.g = 0L;
        this.f = f;
        this.g(String.valueOf(f.getPackageName()).concat("_preferences"));
    }
    
    public final long a() {
        synchronized (this) {
            final long g = this.g;
            this.g = 1L + g;
            return g;
        }
    }
    
    public final SharedPreferences$Editor b() {
        if (this.a) {
            if (this.i == null) {
                this.i = this.c().edit();
            }
            return this.i;
        }
        return this.c().edit();
    }
    
    public final SharedPreferences c() {
        if (this.h == null) {
            this.h = this.f.getSharedPreferences(this.j, 0);
        }
        return this.h;
    }
    
    public final Preference d(final CharSequence charSequence) {
        final PreferenceScreen b = this.b;
        if (b == null) {
            return null;
        }
        return b.l(charSequence);
    }
    
    public final PreferenceScreen e(final Context context) {
        final PreferenceScreen preferenceScreen = new PreferenceScreen(context, null);
        ((Preference)preferenceScreen).A(this);
        return preferenceScreen;
    }
    
    public final void f(final boolean a) {
        if (!a) {
            final SharedPreferences$Editor i = this.i;
            if (i != null) {
                i.apply();
            }
        }
        this.a = a;
    }
    
    public final void g(final String j) {
        this.j = j;
        this.h = null;
    }
    
    public final void h(final Preference preference) {
        final cfg d = this.d;
        if (d != null) {
            d.r(preference);
        }
    }
}
