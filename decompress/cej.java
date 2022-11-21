import androidx.preference.ListPreference;
import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cej implements ces
{
    public static cej a;
    public static cej b;
    private final int c;
    
    public cej(final int c) {
        this.c = c;
    }
    
    @Override
    public final CharSequence a(final Preference preference) {
        if (this.c != 0) {
            final EditTextPreference editTextPreference = (EditTextPreference)preference;
            String s;
            if (TextUtils.isEmpty((CharSequence)editTextPreference.g)) {
                s = ((Preference)editTextPreference).j.getString(2132018811);
            }
            else {
                s = editTextPreference.g;
            }
            return s;
        }
        final ListPreference listPreference = (ListPreference)preference;
        CharSequence charSequence;
        if (TextUtils.isEmpty(listPreference.l())) {
            charSequence = ((Preference)listPreference).j.getString(2132018811);
        }
        else {
            charSequence = listPreference.l();
        }
        return charSequence;
    }
}
