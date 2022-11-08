import androidx.preference.DialogPreference;
import androidx.preference.PreferenceGroup;
import java.util.ArrayList;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreListPreference;
import java.util.Iterator;
import androidx.preference.PreferenceScreen;
import android.util.AttributeSet;
import androidx.preference.PreferenceCategory;
import android.text.Spanned;
import androidx.preference.ListPreference;
import androidx.preference.SwitchPreference;
import androidx.preference.Preference;
import java.util.List;
import com.google.protos.youtube.api.innertube.SetClientSettingEndpointOuterClass$SetClientSettingEndpoint;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class acxu
{
    public final Context c;
    public final vax d;
    public final wwv e;
    protected final zki f;
    final aeim g;
    public final blt h;
    public final aeby i;
    
    public acxu(final Context c, final vax d, final wwv e, final blt h, final aeim g, final zki f, final aeby i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        this.h = h;
        g.getClass();
        this.g = g;
        f.getClass();
        this.f = f;
        this.i = i;
    }
    
    public static anyv b(final Object o) {
        SetClientSettingEndpointOuterClass$SetClientSettingEndpoint setClientSettingEndpointOuterClass$SetClientSettingEndpoint = null;
        Label_0225: {
            if (o instanceof anxs) {
                final anxs anxs = (anxs)o;
                aioe aioe;
                if ((aioe = anxs.i) == null) {
                    aioe = aioe.a;
                }
                if (((agzd)aioe).rs((agyr)SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.setClientSettingEndpoint)) {
                    aioe aioe2;
                    if ((aioe2 = anxs.i) == null) {
                        aioe2 = aioe.a;
                    }
                    setClientSettingEndpointOuterClass$SetClientSettingEndpoint = (SetClientSettingEndpointOuterClass$SetClientSettingEndpoint)((agzd)aioe2).rr((agyr)SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.setClientSettingEndpoint);
                    break Label_0225;
                }
            }
            if (o instanceof anye) {
                final anye anye = (anye)o;
                aioe aioe3;
                if ((aioe3 = anye.g) == null) {
                    aioe3 = aioe.a;
                }
                if (((agzd)aioe3).rs((agyr)SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.setClientSettingEndpoint)) {
                    aioe aioe4;
                    if ((aioe4 = anye.g) == null) {
                        aioe4 = aioe.a;
                    }
                    setClientSettingEndpointOuterClass$SetClientSettingEndpoint = (SetClientSettingEndpointOuterClass$SetClientSettingEndpoint)((agzd)aioe4).rr((agyr)SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.setClientSettingEndpoint);
                    break Label_0225;
                }
            }
            if (o instanceof anyf) {
                final anyf anyf = (anyf)o;
                if (anyf.f.size() > 0) {
                    final anyb anyb = (anyb)anyf.f.get(0);
                    anya a;
                    if (anyb.b == 64166933) {
                        a = (anya)anyb.c;
                    }
                    else {
                        a = anya.a;
                    }
                    aioe aioe5;
                    if ((aioe5 = a.g) == null) {
                        aioe5 = aioe.a;
                    }
                    setClientSettingEndpointOuterClass$SetClientSettingEndpoint = (SetClientSettingEndpointOuterClass$SetClientSettingEndpoint)((agzd)aioe5).rr((agyr)SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.setClientSettingEndpoint);
                    break Label_0225;
                }
            }
            setClientSettingEndpointOuterClass$SetClientSettingEndpoint = null;
        }
        if (setClientSettingEndpointOuterClass$SetClientSettingEndpoint != null && setClientSettingEndpointOuterClass$SetClientSettingEndpoint.b.size() > 0) {
            anyw anyw;
            if ((anyw = ((anxf)setClientSettingEndpointOuterClass$SetClientSettingEndpoint.b.get(0)).d) == null) {
                anyw = anyw.a;
            }
            anyv anyv;
            if ((anyv = anyv.b(anyw.b)) == null) {
                anyv = anyv.a;
            }
            return anyv;
        }
        return anyv.a;
    }
    
    public static List c(final anyf anyf) {
        return adwd.aq((List)adwd.al(adwd.aG((Iterable)anyf.f, (aext)aacc.l)), (aexg)acrp.d);
    }
    
    public Preference a(final anxu anxu, final String s) {
        final int b = anxu.b;
        final Boolean value = true;
        final ajsq ajsq = null;
        final ajsq ajsq2 = null;
        final ajsq ajsq3 = null;
        final ajsq ajsq4 = null;
        if ((b & 0x2) != 0x0) {
            anxs anxs;
            if ((anxs = anxu.e) == null) {
                anxs = anxs.a;
            }
            final SwitchPreference switchPreference = new SwitchPreference(this.c);
            final boolean a = this.g.A(anxs);
            if ((anxs.b & 0x10) != 0x0) {
                ajsq ajsq5;
                if ((ajsq5 = anxs.d) == null) {
                    ajsq5 = ajsq.a;
                }
                ((Preference)switchPreference).N((CharSequence)abyh.b(ajsq5));
            }
            ((Preference)switchPreference).y = a;
            ((Preference)switchPreference).n = (cel)new acxt(switchPreference, this, this.g, anxs, null, null);
            ((Preference)switchPreference).G(true ^ anxs.g);
            Spanned spanned;
            if (anxs.g && (anxs.b & 0x4000) != 0x0) {
                ajsq ajsq6;
                if ((ajsq6 = anxs.l) == null) {
                    ajsq6 = ajsq.a;
                }
                spanned = abyh.b(ajsq6);
            }
            else if (!a && (anxs.b & 0x2000) != 0x0) {
                ajsq ajsq7;
                if ((ajsq7 = anxs.k) == null) {
                    ajsq7 = ajsq.a;
                }
                spanned = abyh.b(ajsq7);
            }
            else {
                ajsq ajsq8 = ajsq4;
                if ((anxs.b & 0x20) != 0x0 && (ajsq8 = anxs.e) == null) {
                    ajsq8 = ajsq.a;
                }
                spanned = abyh.b(ajsq8);
            }
            ((Preference)switchPreference).n((CharSequence)spanned);
            if (b(anxs) == anyv.G) {
                ((Preference)switchPreference).I(this.h.n(b(anxs).ct));
                ((Preference)switchPreference).y = value;
            }
            else if (b(anxs) == anyv.I) {
                ((Preference)switchPreference).I(this.h.n(b(anxs).ct));
                ((Preference)switchPreference).y = value;
            }
            else if (b(anxs) == anyv.cr) {
                ((Preference)switchPreference).I(this.h.n(b(anxs).ct));
                ((Preference)switchPreference).y = false;
            }
            ((Preference)switchPreference).aa();
            return (Preference)switchPreference;
        }
        if ((b & 0x10) != 0x0) {
            anyf anyf;
            if ((anyf = anxu.h) == null) {
                anyf = anyf.a;
            }
            final ListPreference listPreference = new ListPreference(this.c);
            this.e(listPreference, anyf, null);
            ((Preference)listPreference).aa();
            return (Preference)listPreference;
        }
        if ((b & 0x8) != 0x0) {
            anye anye;
            if ((anye = anxu.g) == null) {
                anye = anye.a;
            }
            final Preference preference = new Preference(this.c);
            ajsq ajsq9;
            if ((anye.b & 0x2) != 0x0) {
                if ((ajsq9 = anye.c) == null) {
                    ajsq9 = ajsq.a;
                }
            }
            else {
                ajsq9 = null;
            }
            preference.N((CharSequence)abyh.b(ajsq9));
            final int b2 = anye.b;
            final int n = b2 & 0x8;
            if (n != 0) {
                ajsq ajsq10 = ajsq;
                if (n != 0 && (ajsq10 = anye.d) == null) {
                    ajsq10 = ajsq.a;
                }
                preference.n((CharSequence)abyh.b(ajsq10));
            }
            else {
                final int n2 = b2 & 0x20;
                if (n2 != 0) {
                    ajsq ajsq11 = ajsq2;
                    if (n2 != 0 && (ajsq11 = anye.e) == null) {
                        ajsq11 = ajsq.a;
                    }
                    preference.n((CharSequence)abyh.b(ajsq11));
                }
            }
            if (b(anye) == anyv.K) {
                preference.n(tsi.d(this.c));
            }
            preference.o = (cem)new jpr(this, anye, 3);
            preference.aa();
            return preference;
        }
        if ((b & 0x1) != 0x0) {
            anxr anxr;
            if ((anxr = anxu.d) == null) {
                anxr = anxr.a;
            }
            final Preference preference2 = new Preference(this.c);
            ajsq ajsq12 = ajsq3;
            if ((anxr.b & 0x2) != 0x0 && (ajsq12 = anxr.d) == null) {
                ajsq12 = ajsq.a;
            }
            preference2.N((CharSequence)abyh.b(ajsq12));
            if ((anxr.b & 0x4) != 0x0) {
                ajsq ajsq13;
                if ((ajsq13 = anxr.e) == null) {
                    ajsq13 = ajsq.a;
                }
                preference2.n((CharSequence)abyh.b(ajsq13));
            }
            preference2.o = (cem)new jpr(this, anxr, 2);
            preference2.aa();
            return preference2;
        }
        return null;
    }
    
    public final void d(final cex cex, final List list) {
        final PreferenceScreen e = cex.a.e(this.c);
        for (final anxu anxu : list) {
            if ((anxu.b & 0x4) != 0x0) {
                final PreferenceCategory preferenceCategory = new PreferenceCategory(this.c, (AttributeSet)null);
                anxw anxw;
                if ((anxw = anxu.f) == null) {
                    anxw = anxw.a;
                }
                final int b = anxw.b;
                int n = 1;
                if ((b & 0x1) != 0x0) {
                    anxw anxw2;
                    if ((anxw2 = anxu.f) == null) {
                        anxw2 = anxw.a;
                    }
                    final int ba = aqql.bA(anxw2.e);
                    if (ba != 0) {
                        n = ba;
                    }
                    ((Preference)preferenceCategory).I(Integer.toString(n - 1));
                }
                ((Preference)preferenceCategory).aa();
                ((PreferenceGroup)e).af((Preference)preferenceCategory);
                anxw anxw3;
                if ((anxw3 = anxu.f) == null) {
                    anxw3 = anxw.a;
                }
                if ((anxw3.b & 0x2) != 0x0) {
                    ajsq ajsq;
                    if ((ajsq = anxw3.c) == null) {
                        ajsq = ajsq.a;
                    }
                    ((Preference)preferenceCategory).N((CharSequence)abyh.b(ajsq));
                }
                final Iterator<Object> iterator2 = ((List<Object>)anxw3.d).iterator();
                while (iterator2.hasNext()) {
                    final Preference a = this.a(iterator2.next(), ((Preference)preferenceCategory).s);
                    if (a != null) {
                        ((PreferenceGroup)preferenceCategory).af(a);
                    }
                }
            }
            else {
                final Preference a2 = this.a(anxu, "");
                if (a2 == null) {
                    continue;
                }
                ((PreferenceGroup)e).af(a2);
            }
        }
        cex.aK(e);
        for (int n2 = 0; n2 < list.size() && n2 < ((PreferenceGroup)e).k(); ++n2) {
            final Preference o = ((PreferenceGroup)e).o(n2);
            if ((((anxu)list.get(n2)).b & 0x4) != 0x0) {
                final PreferenceCategory preferenceCategory2 = (PreferenceCategory)o;
                anxw anxw4;
                if ((anxw4 = list.get(n2).f) == null) {
                    anxw4 = anxw.a;
                }
                for (int i = 0; i < ((PreferenceGroup)preferenceCategory2).k(); ++i) {
                    this.g(e, ((PreferenceGroup)preferenceCategory2).o(i), (anxu)anxw4.d.get(i));
                }
            }
            else {
                this.g(e, o, list.get(n2));
            }
        }
    }
    
    public final void e(final ListPreference listPreference, final anyf anyf, final String s) {
        if ((anyf.b & 0x2) != 0x0) {
            ajsq ajsq;
            if ((ajsq = anyf.d) == null) {
                ajsq = ajsq.a;
            }
            ((Preference)listPreference).N((CharSequence)abyh.b(ajsq));
            ajsq ajsq2;
            if ((ajsq2 = anyf.d) == null) {
                ajsq2 = ajsq.a;
            }
            ((DialogPreference)listPreference).a = (CharSequence)abyh.b(ajsq2);
        }
        if ((anyf.b & 0x4) != 0x0) {
            ajsq ajsq3;
            if ((ajsq3 = anyf.e) == null) {
                ajsq3 = ajsq.a;
            }
            ((Preference)listPreference).n((CharSequence)abyh.b(ajsq3));
        }
        final List c = c(anyf);
        final CharSequence[] array = new CharSequence[c.size()];
        final CharSequence[] h = new CharSequence[c.size()];
        int i = 0;
        int n = -1;
        int n2 = -1;
        while (i < c.size()) {
            final anya anya = c.get(i);
            array[i] = anya.c;
            h[i] = anya.e;
            int n3;
            int n4;
            if (this.g.B(anya)) {
                n3 = i;
                n4 = n2;
            }
            else {
                n3 = n;
                n4 = n2;
                if (s != null) {
                    n3 = n;
                    n4 = n2;
                    if (anya.e.equals(s)) {
                        n4 = i;
                        n3 = n;
                    }
                }
            }
            ++i;
            n = n3;
            n2 = n4;
        }
        listPreference.e(array);
        listPreference.h = h;
        Label_0325: {
            int n5;
            if ((n5 = n) == -1) {
                if (n2 == -1) {
                    break Label_0325;
                }
                n5 = -1;
            }
            if (n5 == -1) {
                n5 = n2;
            }
            listPreference.f(n5);
            ((Preference)listPreference).n(listPreference.l());
        }
        if (listPreference instanceof ProtoDataStoreListPreference) {
            ((ProtoDataStoreListPreference)listPreference).G = (tqe)new acxq(this, anyf, listPreference, 0);
            return;
        }
        ((Preference)listPreference).n = (cel)new acxr(this, anyf, listPreference);
    }
    
    public final void f(final ProtoDataStoreListPreference protoDataStoreListPreference, final anyc anyc, final String s) {
        if ((anyc.b & 0x2) != 0x0) {
            ajsq ajsq;
            if ((ajsq = anyc.d) == null) {
                ajsq = ajsq.a;
            }
            ((Preference)protoDataStoreListPreference).N((CharSequence)abyh.b(ajsq));
            ajsq ajsq2;
            if ((ajsq2 = anyc.d) == null) {
                ajsq2 = ajsq.a;
            }
            ((DialogPreference)protoDataStoreListPreference).a = (CharSequence)abyh.b(ajsq2);
        }
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final Iterator<Object> iterator = ((List<Object>)anyc.e).iterator();
        int n = -1;
        int n2 = -1;
        while (iterator.hasNext()) {
            final Iterator<Object> iterator2 = ((List<Object>)iterator.next().c).iterator();
            int n3 = n2;
            int n4 = n;
            while (true) {
                n = n4;
                n2 = n3;
                if (!iterator2.hasNext()) {
                    break;
                }
                final anyb anyb = iterator2.next();
                anya a;
                if (anyb.b == 64166933) {
                    a = (anya)anyb.c;
                }
                else {
                    a = anya.a;
                }
                final int n5 = n4 + 1;
                list.add(a.c);
                list2.add(a.e);
                if (this.f.t()) {
                    n4 = n5;
                    if (!a.f) {
                        continue;
                    }
                }
                else {
                    n4 = n5;
                    if (!a.e.equals(s)) {
                        continue;
                    }
                }
                n3 = n5;
                n4 = n5;
            }
        }
        final int size = list.size();
        final CharSequence[] array = new CharSequence[size];
        final CharSequence[] h = new CharSequence[list2.size()];
        list.toArray(array);
        list2.toArray(h);
        ((ListPreference)protoDataStoreListPreference).e(array);
        ((ListPreference)protoDataStoreListPreference).h = h;
        if (size > 0) {
            if (n2 == -1) {
                n2 = 0;
            }
            ((ListPreference)protoDataStoreListPreference).f(n2);
            ((Preference)protoDataStoreListPreference).n(((ListPreference)protoDataStoreListPreference).l());
        }
        protoDataStoreListPreference.G = (tqe)new acxq(this, anyc, protoDataStoreListPreference, 2);
    }
    
    public final void g(final PreferenceScreen preferenceScreen, final Preference preference, final anxu anxu) {
        agzy agzy;
        if ((anxu.b & 0x10) != 0x0) {
            anyf anyf;
            if ((anyf = anxu.h) == null) {
                anyf = anyf.a;
            }
            agzy = anyf.g;
        }
        else {
            anxs anxs;
            if ((anxs = anxu.e) == null) {
                anxs = anxs.a;
            }
            agzy = anxs.p;
        }
        for (final anyw anyw : agzy) {
            final blt h = this.h;
            anyv anyv;
            if ((anyv = anyv.b(anyw.b)) == null) {
                anyv = anyv.a;
            }
            final String n = h.n(anyv.ct);
            if (n != null && ((PreferenceGroup)preferenceScreen).l((CharSequence)n) instanceof SwitchPreference) {
                preference.Q();
                preference.x = n;
                preference.E();
            }
        }
    }
}
