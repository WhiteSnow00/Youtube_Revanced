import androidx.preference.DialogPreference;
import androidx.preference.Preference;
import android.text.Spanned;
import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreListPreference;
import androidx.preference.ListPreference;
import com.google.android.apps.youtube.app.settings.IntListPreference;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jnb
{
    private static final afcw b;
    
    static {
        b = afcw.o((Object)"1", (Object)"2", (Object)"2", (Object)"1", (Object)"3", (Object)"0");
    }
    
    public static void a(final int n, final wwu wwu) {
        final wwv n2 = wwu.n();
        n2.D((wxz)new wws(wya.c(35087)));
        n2.D((wxz)new wws(wya.c(35088)));
        n2.D((wxz)new wws(wya.c(35086)));
        if (n == 0) {
            n2.J(3, (wxz)new wws(wya.c(35086)), (alff)null);
            return;
        }
        if (n == 2) {
            n2.J(3, (wxz)new wws(wya.c(35087)), (alff)null);
            return;
        }
        if (n == 1) {
            n2.J(3, (wxz)new wws(wya.c(35088)), (alff)null);
        }
    }
    
    public static void b(final SharedPreferences sharedPreferences, final wwu wwu) {
        a(sharedPreferences.getInt("inline_global_play_pause", -1), wwu);
    }
    
    static void c(final arud arud, final IntListPreference intListPreference, final Object o) {
        if (!(o instanceof anyf)) {
            return;
        }
        final jna e = e((anyf)o);
        f((ListPreference)intListPreference, arud, e);
        intListPreference.G = (Map)e.c;
    }
    
    public static void d(final arud arud, final ProtoDataStoreListPreference protoDataStoreListPreference, final Object o, final wwu wwu) {
        if (!(o instanceof anyf)) {
            return;
        }
        final jna e = e((anyf)o);
        f((ListPreference)protoDataStoreListPreference, arud, e);
        ((Preference)protoDataStoreListPreference).n((CharSequence)e.c.get((Object)String.valueOf(gel.h(arud))));
        protoDataStoreListPreference.G = (tqe)new acxq(wwu, protoDataStoreListPreference, e, 1);
    }
    
    private static jna e(final anyf anyf) {
        final int size = anyf.f.size();
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final HashMap hashMap = new HashMap();
        for (int i = 0; i < size; ++i) {
            final anyb anyb = anyf.f.get(i);
            anya a;
            if (anyb.b == 64166933) {
                a = (anya)anyb.c;
            }
            else {
                a = anya.a;
            }
            list.add(a.c);
            list2.add(jnb.b.get((Object)a.e));
            if ((a.b & 0x2) != 0x0) {
                hashMap.put(list2.get(i), a.d);
            }
        }
        final int b = anyf.b;
        final ajsq ajsq = null;
        ajsq ajsq2;
        if ((b & 0x2) != 0x0) {
            if ((ajsq2 = anyf.d) == null) {
                ajsq2 = ajsq.a;
            }
        }
        else {
            ajsq2 = null;
        }
        final Spanned b2 = abyh.b(ajsq2);
        ajsq ajsq3 = ajsq;
        if ((anyf.b & 0x4) != 0x0 && (ajsq3 = anyf.e) == null) {
            ajsq3 = ajsq.a;
        }
        return new jna((CharSequence)b2, (CharSequence)abyh.b(ajsq3), afcw.k((Map)hashMap), afcr.o((Collection)list), afcr.o((Collection)list2));
    }
    
    private static void f(final ListPreference listPreference, final arud arud, final jna jna) {
        ((Preference)listPreference).I("inline_global_play_pause");
        ((Preference)listPreference).N(jna.a);
        ((DialogPreference)listPreference).a = jna.a;
        ((Preference)listPreference).n(jna.b);
        listPreference.e((CharSequence[])((afci)jna.d).toArray(new CharSequence[0]));
        listPreference.h = (CharSequence[])((afci)jna.e).toArray(new CharSequence[0]);
        ((Preference)listPreference).F((Object)String.valueOf(gel.h(arud)));
    }
}
