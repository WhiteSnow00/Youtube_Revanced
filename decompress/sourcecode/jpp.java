import androidx.preference.TwoStatePreference;
import java.util.function.Predicate;
import java.util.Collection;
import j$.util.Collection$_EL;
import androidx.preference.Preference;
import androidx.activity.result.ActivityResult;
import com.google.apps.tiktok.account.AccountId;
import com.google.android.apps.youtube.app.settings.offline.activity.SmartDownloadsStorageControlsActivity;
import android.content.Intent;
import android.content.Context;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreSwitchPreference;
import androidx.preference.ListPreference;
import j$.util.Optional;
import android.content.res.Resources;
import com.google.android.apps.youtube.app.settings.offline.SmartDownloadsStorageUseRadioButton;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jpp
{
    public static final wxz a;
    public static final wxz b;
    public final zki c;
    public final tlk d;
    public final SharedPreferences e;
    public final thh f;
    public final alm g;
    public final alm h;
    private final fml i;
    private final aacf j;
    private final asho k;
    private final uyi l;
    private final uyi m;
    private final blt n;
    private final bhu o;
    
    static {
        a = (wxz)new wws(wya.c(128287));
        b = (wxz)new wws(wya.c(128286));
    }
    
    public jpp(final fml i, final alm g, final zki c, final aacf j, final alm h, final tlk d, final SharedPreferences e, final asho k, final thh f, final blt n, final bhu o, final uyi l, final uyi m, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.i = i;
        this.g = g;
        this.c = c;
        this.j = j;
        this.h = h;
        this.d = d;
        this.e = e;
        this.k = k;
        this.f = f;
        this.n = n;
        this.o = o;
        this.l = l;
        this.m = m;
    }
    
    public static final void o(final SmartDownloadsStorageUseRadioButton smartDownloadsStorageUseRadioButton, final Long n, final Resources resources) {
        if (smartDownloadsStorageUseRadioButton != null && n != null) {
            ((Preference)smartDownloadsStorageUseRadioButton).n(resources.getString(2132019258, new Object[] { tsx.h(resources, tmy.V((long)n), true) }));
        }
    }
    
    public static void p(final wwv wwv, final elw elw, final boolean b) {
        elw.a = Optional.of((Object)b);
        wxz wxz;
        if (b) {
            wxz = jpp.a;
        }
        else {
            wxz = jpp.b;
        }
        wwv.l(wxz);
    }
    
    private static final void q(final SmartDownloadsStorageUseRadioButton smartDownloadsStorageUseRadioButton) {
        if (smartDownloadsStorageUseRadioButton != null && ((TwoStatePreference)smartDownloadsStorageUseRadioButton).a) {
            ((TwoStatePreference)smartDownloadsStorageUseRadioButton).k(false);
        }
    }
    
    public final asic a(final ListPreference listPreference, final ashe ashe, final Resources resources) {
        return ashe.m((ashh)ashe, (ashh)this.g.E(this.c.c().b()).p().ai(), (asit)iun.o).aa(this.k).aB((asix)new jpm(listPreference, resources, 2));
    }
    
    public final asic b(final ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference) {
        return this.g.E(this.c.c().b()).p().ay().B((asjd)iuc.p).az().al((asix)new jpm(this, protoDataStoreSwitchPreference, 0));
    }
    
    public final void c(final SmartDownloadsStorageUseRadioButton smartDownloadsStorageUseRadioButton) {
        if (smartDownloadsStorageUseRadioButton != null) {
            ((Preference)smartDownloadsStorageUseRadioButton).n = (cel)jpk.a;
        }
    }
    
    public final void d(final SmartDownloadsStorageUseRadioButton smartDownloadsStorageUseRadioButton, final wwv wwv) {
        this.g(wwv, 149984);
        aejp.b(this.g.A(this.c.c().b(), 0L), "Failed to reset the smart downloads max storage bytes to 0", new Object[0]);
        q(smartDownloadsStorageUseRadioButton);
    }
    
    public final void e(final Context context, final atjj atjj, final SmartDownloadsStorageUseRadioButton smartDownloadsStorageUseRadioButton, final rf rf, final wwv wwv) {
        this.g(wwv, 149986);
        q(smartDownloadsStorageUseRadioButton);
        final Intent setClass = new Intent().setClass(context, (Class)SmartDownloadsStorageControlsActivity.class);
        aehb.a(setClass, (AccountId)atjj.a());
        rf.b((Object)setClass);
        q(smartDownloadsStorageUseRadioButton);
    }
    
    public final void f(final SmartDownloadsStorageUseRadioButton smartDownloadsStorageUseRadioButton, final ActivityResult activityResult, final Resources resources) {
        if (activityResult.a != -1) {
            trn.b("SmartDownloadsStorageControlsActivity failed");
            return;
        }
        final Intent b = activityResult.b;
        if (b == null) {
            return;
        }
        final long longExtra = b.getLongExtra("smart_downloads_max_storage_tag", -1L);
        if (longExtra == -1L) {
            return;
        }
        aejp.b(this.g.A(this.c.c().b(), longExtra), "Failed to save smart downloads max storage.", new Object[0]);
        o(smartDownloadsStorageUseRadioButton, longExtra, resources);
    }
    
    public final void g(final wwv wwv, final int n) {
        wwv.J(3, (wxz)new wws(wya.c(n)), (alff)null);
    }
    
    public final void h(final aum aum, final wwv wwv, final ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference) {
        final elw elw = new elw((byte[])null, (byte[])null);
        tcp.n(aum, protoDataStoreSwitchPreference.af(), (trb)jpn.d, (trb)new jnf(wwv, elw, 6, (byte[])null, (byte[])null, (byte[])null));
        ((Preference)protoDataStoreSwitchPreference).n = (cel)new jpo(elw, wwv, null, null, null);
    }
    
    public final void i(final aum aum, final Preference preference) {
        if (this.m.am() && preference != null) {
            tcp.n(aum, this.n.k(), (trb)jpn.c, (trb)new jly(preference, 15));
        }
    }
    
    public final void j(final aum aum, final SmartDownloadsStorageUseRadioButton smartDownloadsStorageUseRadioButton, final Resources resources) {
        if (smartDownloadsStorageUseRadioButton != null && ((TwoStatePreference)smartDownloadsStorageUseRadioButton).a) {
            tcp.n(aum, this.g.v(this.c.c().b()), (trb)jmg.t, (trb)new jnf(smartDownloadsStorageUseRadioButton, resources, 4));
        }
    }
    
    public final void k(final aum aum, final ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference, final Resources resources) {
        tcp.n(aum, this.i.b(), (trb)jpn.a, (trb)new eyc(this, resources, protoDataStoreSwitchPreference, 16));
    }
    
    public final boolean l(final ListPreference listPreference) {
        return listPreference.i.equals("-1");
    }
    
    public final boolean m(final ListPreference listPreference, final Resources resources) {
        return this.n(listPreference, resources, amuv.a, true);
    }
    
    public final boolean n(final ListPreference listPreference, final Resources resources, final amuv amuv, final boolean b) {
        if (this.j.K()) {
            final vtl m = this.h.M();
            if (m != null) {
                if (!m.d) {
                    alvl alvl;
                    if ((alvl = ((uyf)this.o.a).b().e) == null) {
                        alvl = alvl.a;
                    }
                    if (alvl.aV) {
                        return false;
                    }
                }
            }
            final afcr d = this.j.d();
            final vtl i = this.h.M();
            afcr afcr;
            if (i != null && !i.f.isEmpty()) {
                final vtl j = this.h.M();
                if (j != null) {
                    afcr = j.f;
                }
                else {
                    afcr = afcr.q();
                }
            }
            else {
                final vtl k = this.h.M();
                if (k != null && k.b) {
                    final afcm d2 = afcr.d();
                    d2.h(amuv.h);
                    d2.j((Iterable)d);
                    afcr = d2.g();
                }
                else {
                    afcr = d;
                    if (this.l.f(45351910L)) {
                        afcr = (afcr)Collection$_EL.stream((Collection)d).filter((Predicate)ifl.n).collect(afaj.a);
                    }
                }
            }
            int size;
            if (b) {
                size = afcr.size() + 1;
            }
            else {
                size = afcr.size();
            }
            final String[] array = new String[size];
            int n;
            if (b) {
                array[0] = resources.getString(2132018913);
                n = 1;
            }
            else {
                n = 0;
            }
            for (int l = 0; l < afcr.size(); ++l) {
                final int b2 = aahf.b((amuv)afcr.get(l));
                if (b2 != -1) {
                    array[n] = resources.getString(b2);
                    ++n;
                }
                else {
                    array[n] = "";
                    ++n;
                }
            }
            listPreference.e((CharSequence[])array);
            int size2;
            if (b) {
                size2 = afcr.size() + 1;
            }
            else {
                size2 = afcr.size();
            }
            final String[] h = new String[size2];
            int n2;
            if (b) {
                h[0] = "-1";
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            for (int n3 = 0; n3 < afcr.size(); ++n3, ++n2) {
                h[n2] = String.valueOf(aahf.a((amuv)afcr.get(n3), -1));
            }
            listPreference.h = h;
            if (listPreference.l() == null) {
                final int a = aahf.a(amuv, -1);
                if (listPreference.k(String.valueOf(a)) != -1) {
                    listPreference.o(String.valueOf(a));
                }
                else {
                    listPreference.f(0);
                }
            }
            ((Preference)listPreference).n(listPreference.l());
            return true;
        }
        return false;
    }
}
