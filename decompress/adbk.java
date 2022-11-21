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

public class adbk
{
    public final Context c;
    public final veh d;
    public final xab e;
    protected final zoa f;
    public final blx g;
    final aheu h;
    public final aefs i;
    
    public adbk(final Context c, final veh d, final xab e, final blx g, final aheu h, final zoa f, final aefs i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.c = c;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        this.g = g;
        h.getClass();
        this.h = h;
        f.getClass();
        this.f = f;
        this.i = i;
    }
    
    public static aodf b(final Object o) {
        SetClientSettingEndpointOuterClass$SetClientSettingEndpoint setClientSettingEndpointOuterClass$SetClientSettingEndpoint = null;
        Label_0225: {
            if (o instanceof aocc) {
                final aocc aocc = (aocc)o;
                aisc aisc;
                if ((aisc = aocc.i) == null) {
                    aisc = aisc.a;
                }
                if (((ahcu)aisc).ry((ahci)SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.setClientSettingEndpoint)) {
                    aisc aisc2;
                    if ((aisc2 = aocc.i) == null) {
                        aisc2 = aisc.a;
                    }
                    setClientSettingEndpointOuterClass$SetClientSettingEndpoint = (SetClientSettingEndpointOuterClass$SetClientSettingEndpoint)((ahcu)aisc2).rx((ahci)SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.setClientSettingEndpoint);
                    break Label_0225;
                }
            }
            if (o instanceof aoco) {
                final aoco aoco = (aoco)o;
                aisc aisc3;
                if ((aisc3 = aoco.g) == null) {
                    aisc3 = aisc.a;
                }
                if (((ahcu)aisc3).ry((ahci)SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.setClientSettingEndpoint)) {
                    aisc aisc4;
                    if ((aisc4 = aoco.g) == null) {
                        aisc4 = aisc.a;
                    }
                    setClientSettingEndpointOuterClass$SetClientSettingEndpoint = (SetClientSettingEndpointOuterClass$SetClientSettingEndpoint)((ahcu)aisc4).rx((ahci)SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.setClientSettingEndpoint);
                    break Label_0225;
                }
            }
            if (o instanceof aocp) {
                final aocp aocp = (aocp)o;
                if (aocp.f.size() > 0) {
                    final aocl aocl = (aocl)aocp.f.get(0);
                    aock a;
                    if (aocl.b == 64166933) {
                        a = (aock)aocl.c;
                    }
                    else {
                        a = aock.a;
                    }
                    aisc aisc5;
                    if ((aisc5 = a.g) == null) {
                        aisc5 = aisc.a;
                    }
                    setClientSettingEndpointOuterClass$SetClientSettingEndpoint = (SetClientSettingEndpointOuterClass$SetClientSettingEndpoint)((ahcu)aisc5).rx((ahci)SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.setClientSettingEndpoint);
                    break Label_0225;
                }
            }
            setClientSettingEndpointOuterClass$SetClientSettingEndpoint = null;
        }
        if (setClientSettingEndpointOuterClass$SetClientSettingEndpoint != null && setClientSettingEndpointOuterClass$SetClientSettingEndpoint.b.size() > 0) {
            aodg aodg;
            if ((aodg = ((aobp)setClientSettingEndpointOuterClass$SetClientSettingEndpoint.b.get(0)).d) == null) {
                aodg = aodg.a;
            }
            aodf aodf;
            if ((aodf = aodf.b(aodg.b)) == null) {
                aodf = aodf.a;
            }
            return aodf;
        }
        return aodf.a;
    }
    
    public static List c(final aocp aocp) {
        return agpx.S(agpx.N(agpx.ai((Iterable)aocp.f, aafv.l)), (afax)accj.h);
    }
    
    public Preference a(final aoce aoce, final String s) {
        final int b = aoce.b;
        final Boolean value = true;
        final ajws ajws = null;
        final ajws ajws2 = null;
        final ajws ajws3 = null;
        final ajws ajws4 = null;
        if ((b & 0x2) != 0x0) {
            aocc aocc;
            if ((aocc = aoce.e) == null) {
                aocc = aocc.a;
            }
            final SwitchPreference switchPreference = new SwitchPreference(this.c);
            final boolean i = this.h.I(aocc);
            if ((aocc.b & 0x10) != 0x0) {
                ajws ajws5;
                if ((ajws5 = aocc.d) == null) {
                    ajws5 = ajws.a;
                }
                ((Preference)switchPreference).N((CharSequence)acbu.b(ajws5));
            }
            ((Preference)switchPreference).y = i;
            ((Preference)switchPreference).n = new adbj(switchPreference, this, this.h, aocc, null, null, null);
            ((Preference)switchPreference).G(true ^ aocc.g);
            Spanned spanned;
            if (aocc.g && (aocc.b & 0x4000) != 0x0) {
                ajws ajws6;
                if ((ajws6 = aocc.l) == null) {
                    ajws6 = ajws.a;
                }
                spanned = acbu.b(ajws6);
            }
            else if (!i && (aocc.b & 0x2000) != 0x0) {
                ajws ajws7;
                if ((ajws7 = aocc.k) == null) {
                    ajws7 = ajws.a;
                }
                spanned = acbu.b(ajws7);
            }
            else {
                ajws ajws8 = ajws4;
                if ((aocc.b & 0x20) != 0x0 && (ajws8 = aocc.e) == null) {
                    ajws8 = ajws.a;
                }
                spanned = acbu.b(ajws8);
            }
            ((Preference)switchPreference).n((CharSequence)spanned);
            if (b(aocc) == aodf.G) {
                ((Preference)switchPreference).I(this.g.n(b(aocc).cu));
                ((Preference)switchPreference).y = value;
            }
            else if (b(aocc) == aodf.I) {
                ((Preference)switchPreference).I(this.g.n(b(aocc).cu));
                ((Preference)switchPreference).y = value;
            }
            else if (b(aocc) == aodf.cs) {
                ((Preference)switchPreference).I(this.g.n(b(aocc).cu));
                ((Preference)switchPreference).y = false;
            }
            ((Preference)switchPreference).aa();
            return (Preference)switchPreference;
        }
        if ((b & 0x10) != 0x0) {
            aocp aocp;
            if ((aocp = aoce.h) == null) {
                aocp = aocp.a;
            }
            final ListPreference listPreference = new ListPreference(this.c);
            this.e(listPreference, aocp, null);
            ((Preference)listPreference).aa();
            return (Preference)listPreference;
        }
        if ((b & 0x8) != 0x0) {
            aoco aoco;
            if ((aoco = aoce.g) == null) {
                aoco = aoco.a;
            }
            final Preference preference = new Preference(this.c);
            ajws ajws9;
            if ((aoco.b & 0x2) != 0x0) {
                if ((ajws9 = aoco.c) == null) {
                    ajws9 = ajws.a;
                }
            }
            else {
                ajws9 = null;
            }
            preference.N((CharSequence)acbu.b(ajws9));
            final int b2 = aoco.b;
            final int n = b2 & 0x8;
            if (n != 0) {
                ajws ajws10 = ajws;
                if (n != 0 && (ajws10 = aoco.d) == null) {
                    ajws10 = ajws.a;
                }
                preference.n((CharSequence)acbu.b(ajws10));
            }
            else {
                final int n2 = b2 & 0x20;
                if (n2 != 0) {
                    ajws ajws11 = ajws2;
                    if (n2 != 0 && (ajws11 = aoco.e) == null) {
                        ajws11 = ajws.a;
                    }
                    preference.n((CharSequence)acbu.b(ajws11));
                }
            }
            if (b(aoco) == aodf.K) {
                preference.n((CharSequence)tvo.c(this.c));
            }
            preference.o = (ceq)new jra(this, aoco, 3);
            preference.aa();
            return preference;
        }
        if ((b & 0x1) != 0x0) {
            aocb aocb;
            if ((aocb = aoce.d) == null) {
                aocb = aocb.a;
            }
            final Preference preference2 = new Preference(this.c);
            ajws ajws12 = ajws3;
            if ((aocb.b & 0x2) != 0x0 && (ajws12 = aocb.d) == null) {
                ajws12 = ajws.a;
            }
            preference2.N((CharSequence)acbu.b(ajws12));
            if ((aocb.b & 0x4) != 0x0) {
                ajws ajws13;
                if ((ajws13 = aocb.e) == null) {
                    ajws13 = ajws.a;
                }
                preference2.n((CharSequence)acbu.b(ajws13));
            }
            preference2.o = (ceq)new jra(this, aocb, 2);
            preference2.aa();
            return preference2;
        }
        return null;
    }
    
    public final void d(final cfb cfb, final List list) {
        final PreferenceScreen e = cfb.a.e(this.c);
        for (final aoce aoce : list) {
            if ((aoce.b & 0x4) != 0x0) {
                final PreferenceCategory preferenceCategory = new PreferenceCategory(this.c, null);
                aocg aocg;
                if ((aocg = aoce.f) == null) {
                    aocg = aocg.a;
                }
                final int b = aocg.b;
                int n = 1;
                if ((b & 0x1) != 0x0) {
                    aocg aocg2;
                    if ((aocg2 = aoce.f) == null) {
                        aocg2 = aocg.a;
                    }
                    final int bt = aqvq.bt(aocg2.e);
                    if (bt != 0) {
                        n = bt;
                    }
                    ((Preference)preferenceCategory).I(Integer.toString(n - 1));
                }
                ((Preference)preferenceCategory).aa();
                e.af((Preference)preferenceCategory);
                aocg aocg3;
                if ((aocg3 = aoce.f) == null) {
                    aocg3 = aocg.a;
                }
                if ((aocg3.b & 0x2) != 0x0) {
                    ajws ajws;
                    if ((ajws = aocg3.c) == null) {
                        ajws = ajws.a;
                    }
                    ((Preference)preferenceCategory).N((CharSequence)acbu.b(ajws));
                }
                final Iterator<Object> iterator2 = ((List<Object>)aocg3.d).iterator();
                while (iterator2.hasNext()) {
                    final Preference a = this.a(iterator2.next(), ((Preference)preferenceCategory).s);
                    if (a != null) {
                        preferenceCategory.af(a);
                    }
                }
            }
            else {
                final Preference a2 = this.a(aoce, "");
                if (a2 == null) {
                    continue;
                }
                e.af(a2);
            }
        }
        cfb.aK(e);
        for (int n2 = 0; n2 < list.size() && n2 < e.k(); ++n2) {
            final Preference o = e.o(n2);
            if ((((aoce)list.get(n2)).b & 0x4) != 0x0) {
                final PreferenceCategory preferenceCategory2 = (PreferenceCategory)o;
                aocg aocg4;
                if ((aocg4 = list.get(n2).f) == null) {
                    aocg4 = aocg.a;
                }
                for (int i = 0; i < preferenceCategory2.k(); ++i) {
                    this.g(e, preferenceCategory2.o(i), (aoce)aocg4.d.get(i));
                }
            }
            else {
                this.g(e, o, list.get(n2));
            }
        }
    }
    
    public final void e(final ListPreference listPreference, final aocp aocp, final String s) {
        if ((aocp.b & 0x2) != 0x0) {
            ajws ajws;
            if ((ajws = aocp.d) == null) {
                ajws = ajws.a;
            }
            ((Preference)listPreference).N((CharSequence)acbu.b(ajws));
            ajws ajws2;
            if ((ajws2 = aocp.d) == null) {
                ajws2 = ajws.a;
            }
            listPreference.a = (CharSequence)acbu.b(ajws2);
        }
        if ((aocp.b & 0x4) != 0x0) {
            ajws ajws3;
            if ((ajws3 = aocp.e) == null) {
                ajws3 = ajws.a;
            }
            ((Preference)listPreference).n((CharSequence)acbu.b(ajws3));
        }
        final List c = c(aocp);
        final CharSequence[] array = new CharSequence[c.size()];
        final CharSequence[] h = new CharSequence[c.size()];
        int i = 0;
        int n = -1;
        int n2 = -1;
        while (i < c.size()) {
            final aock aock = c.get(i);
            array[i] = aock.c;
            h[i] = aock.e;
            int n3;
            int n4;
            if (this.h.J(aock)) {
                n3 = i;
                n4 = n2;
            }
            else {
                n3 = n;
                n4 = n2;
                if (s != null) {
                    n3 = n;
                    n4 = n2;
                    if (aock.e.equals(s)) {
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
            if (n5 != -1) {
                n2 = n5;
            }
            listPreference.f(n2);
            ((Preference)listPreference).n(listPreference.l());
        }
        if (listPreference instanceof ProtoDataStoreListPreference) {
            ((ProtoDataStoreListPreference)listPreference).G = (ttl)new adbg(this, aocp, listPreference, 0);
            return;
        }
        ((Preference)listPreference).n = new adbh(this, aocp, listPreference);
    }
    
    public final void f(final ProtoDataStoreListPreference protoDataStoreListPreference, final aocm aocm, final String s) {
        if ((aocm.b & 0x2) != 0x0) {
            ajws ajws;
            if ((ajws = aocm.d) == null) {
                ajws = ajws.a;
            }
            ((Preference)protoDataStoreListPreference).N((CharSequence)acbu.b(ajws));
            ajws ajws2;
            if ((ajws2 = aocm.d) == null) {
                ajws2 = ajws.a;
            }
            protoDataStoreListPreference.a = (CharSequence)acbu.b(ajws2);
        }
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final Iterator<Object> iterator = ((List<Object>)aocm.e).iterator();
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
                final aocl aocl = iterator2.next();
                aock a;
                if (aocl.b == 64166933) {
                    a = (aock)aocl.c;
                }
                else {
                    a = aock.a;
                }
                final int n5 = n3 + 1;
                list.add(a.c);
                list2.add(a.e);
                if (this.f.t()) {
                    n3 = n5;
                    if (!a.f) {
                        continue;
                    }
                }
                else {
                    n3 = n5;
                    if (!a.e.equals(s)) {
                        continue;
                    }
                }
                n4 = n5;
                n3 = n5;
            }
        }
        final int size = list.size();
        final CharSequence[] array = new CharSequence[size];
        final CharSequence[] h = new CharSequence[list2.size()];
        list.toArray(array);
        list2.toArray(h);
        protoDataStoreListPreference.e(array);
        protoDataStoreListPreference.h = h;
        if (size > 0) {
            int n6;
            if ((n6 = n) == -1) {
                n6 = 0;
            }
            protoDataStoreListPreference.f(n6);
            ((Preference)protoDataStoreListPreference).n(protoDataStoreListPreference.l());
        }
        protoDataStoreListPreference.G = (ttl)new adbg(this, aocm, protoDataStoreListPreference, 2);
    }
    
    public final void g(final PreferenceScreen preferenceScreen, final Preference preference, final aoce aoce) {
        ahdp ahdp;
        if ((aoce.b & 0x10) != 0x0) {
            aocp aocp;
            if ((aocp = aoce.h) == null) {
                aocp = aocp.a;
            }
            ahdp = aocp.g;
        }
        else {
            aocc aocc;
            if ((aocc = aoce.e) == null) {
                aocc = aocc.a;
            }
            ahdp = aocc.p;
        }
        for (final aodg aodg : ahdp) {
            final blx g = this.g;
            aodf aodf;
            if ((aodf = aodf.b(aodg.b)) == null) {
                aodf = aodf.a;
            }
            final String n = g.n(aodf.cu);
            if (n != null && preferenceScreen.l((CharSequence)n) instanceof SwitchPreference) {
                preference.Q();
                preference.x = n;
                preference.E();
            }
        }
    }
}
