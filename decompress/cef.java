import java.util.Iterator;
import android.text.TextUtils;
import androidx.preference.PreferenceGroup;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import androidx.preference.Preference;

// 
// Decompiled by Procyon v0.6.0
// 

final class cef extends Preference
{
    private long a;
    
    public cef(final Context context, final List list, final long n) {
        super(context);
        super.B = 2131624418;
        this.H(fc.b(super.j, 2131231424));
        super.r = 2131231424;
        this.M(2132018030);
        this.J(999);
        final ArrayList list2 = new ArrayList();
        final Iterator iterator = list.iterator();
        CharSequence string = null;
        while (iterator.hasNext()) {
            final Preference preference = (Preference)iterator.next();
            final CharSequence q = preference.q;
            final boolean b = preference instanceof PreferenceGroup;
            if (b && !TextUtils.isEmpty(q)) {
                list2.add(preference);
            }
            if (list2.contains(preference.E)) {
                if (!b) {
                    continue;
                }
                list2.add(preference);
            }
            else {
                if (TextUtils.isEmpty(q)) {
                    continue;
                }
                if (string == null) {
                    string = q;
                }
                else {
                    string = super.j.getString(2132019916, new Object[] { string, q });
                }
            }
        }
        this.n(string);
        this.a = n + 1000000L;
    }
    
    public final long lk() {
        return this.a;
    }
    
    public final void rN(final cfj cfj) {
        super.rN(cfj);
        cfj.v = false;
    }
}
