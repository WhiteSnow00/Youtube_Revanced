import androidx.preference.ListPreference;
import android.view.View;
import android.content.Context;
import java.util.function.Consumer;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;
import android.os.Parcelable;
import com.google.protobuf.MessageLite;
import com.google.apps.tiktok.account.AccountId;
import android.os.Bundle;
import java.util.List;
import android.content.Intent;
import android.content.res.Resources;
import com.google.android.apps.youtube.app.settings.offline.SmartDownloadsStorageUseRadioButton;
import androidx.preference.Preference;
import com.google.android.apps.youtube.app.settings.OfflinePrefsFragment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ifz implements ttg
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public ifz(final OfflinePrefsFragment b, final Preference a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ifz(final SmartDownloadsStorageUseRadioButton b, final Resources a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ifz(final ibf b, final ibe a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ifz(final iga a, final zyo b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ifz(final jov b, final Intent a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ifz(final jqd b, final Intent a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ifz(final jqq b, final Preference a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ifz(final jvn a, final Object b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ifz(final jxp a, final kdj b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ifz(final kvo b, final bu a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ifz(final kvr b, final bu a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ifz(final kwk a, final aiqj b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ifz(final lkg a, final List b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ifz(final llm a, final ttg b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ifz(final rgr b, final Bundle a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ifz(final sql a, final aiqj b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ifz(final sxz a, final aknt b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ifz(final wyw b, final elx a, final int c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void a(Object o) {
        final int c = this.c;
        boolean b = true;
        final boolean b2 = true;
        switch (c) {
            default: {
                final Object a = this.a;
                final Object b3 = this.b;
                final Throwable t = (Throwable)o;
                final sxz sxz = (sxz)a;
                sxz.d.a();
                if (b3 != null) {
                    sxz.e.d((aknt)b3);
                }
                sxz.e(t);
                return;
            }
            case 19: {
                final Object a2 = this.a;
                final Object b4 = this.b;
                final AccountId accountId = (AccountId)o;
                accountId.getClass();
                final sqv sqv = new sqv();
                final Bundle bundle = new Bundle();
                bundle.putParcelable("navigation_endpoint", (Parcelable)adyf.ax((MessageLite)b4));
                sqv.ag(bundle);
                aepz.e((br)sqv, accountId);
                sqv.ae = (sqt)a2;
                ((sql)a2).d((br)sqv, false);
                return;
            }
            case 18: {
                final Object b5 = this.b;
                final Object a3 = this.a;
                final aeea aeea = (aeea)o;
                aeea.getClass();
                final aeea aeea2 = new aeea((akja)aeea.a);
                final rgr rgr = (rgr)b5;
                if (rgr.ar != null && aeea.bU() != null) {
                    rgr.ar.D((wzz)new wyt(aeea.bU()));
                }
                aigk af;
                if ((af = ((akja)aeea2.a).d) == null) {
                    af = aigk.a;
                }
                rgr.af = af;
                final akja akja = (akja)aeea2.a;
                aiqj as;
                if ((akja.b & 0x4) != 0x0) {
                    if ((as = akja.e) == null) {
                        as = aiqj.a;
                    }
                }
                else {
                    as = null;
                }
                rgr.as = as;
                rgr.aM(rgr.af, (Bundle)a3);
                return;
            }
            case 17: {
                final Object a4 = this.a;
                final Object b6 = this.b;
                final llq llq = (llq)o;
                final llm llm = (llm)a4;
                ((ttg)b6).a((Object)(llm.d >= 6 && llq != null && llq.e != 0L && !llq.d && llm.a.c() >= llq.e + TimeUnit.HOURS.toMillis(24L) && b2));
                return;
            }
            case 16: {
                final Object a5 = this.a;
                final Object b7 = this.b;
                final llq llq2 = (llq)o;
                if (((llm)a5).d < 3 || llq2 == null || llq2.c) {
                    b = false;
                }
                ((ttg)b7).a((Object)b);
                return;
            }
            case 15: {
                Optional.ofNullable((Object)o).ifPresent((Consumer)new iok((lkg)this.a, (List)this.b, 7));
                return;
            }
            case 14: {
                final Object a6 = this.a;
                final Object b8 = this.b;
                if (Boolean.TRUE.equals(o)) {
                    ((kwk)a6).a = true;
                    return;
                }
                ((kwk)a6).f((aiqj)b8);
                return;
            }
            case 13: {
                final Object a7 = this.a;
                final Object b9 = this.b;
                final Throwable t2 = (Throwable)o;
                if (t2 != null) {
                    zlm.b(zll.a, zlk.a, "[InlineCustomTab]Could not launch custom tabs with OnStopAwareCallback:".concat(String.valueOf(t2.getMessage())));
                }
                final kwk kwk = (kwk)a7;
                if (qdw.I(kwk.b)) {
                    kwk.f((aiqj)b9);
                }
                return;
            }
            case 12: {
                final Object b10 = this.b;
                final Object a8 = this.a;
                final AccountId accountId2 = (AccountId)o;
                if (accountId2 != null) {
                    final Intent g = fwc.g((Context)a8);
                    aejc.a(g, accountId2);
                    afpo.f((br)b10, g);
                }
                return;
            }
            case 11: {
                final Object b11 = this.b;
                final Object a9 = this.a;
                final AccountId accountId3 = (AccountId)o;
                if (accountId3 != null) {
                    final Intent g2 = fwc.g((Context)a9);
                    aejc.a(g2, accountId3);
                    afpo.f((br)((kvo)b11).a, g2);
                }
                return;
            }
            case 10: {
                final Object a10 = this.a;
                final Object b12 = this.b;
                final Boolean b13 = (Boolean)o;
                if (b13 != null && b13) {
                    final jxp jxp = (jxp)a10;
                    ((kdj)b12).f((View)jxp.c, jxp.a);
                }
                return;
            }
            case 9: {
                final Object a11 = this.a;
                final Object b14 = this.b;
                if (!(boolean)o) {
                    o = ((lkx)((jvn)a11).a).f;
                    ((hmw)o).c((apny)b14);
                }
                return;
            }
            case 8: {
                final Object a12 = this.a;
                final Object b15 = this.b;
                final Throwable t3 = (Throwable)o;
                o = ((lkx)((jvn)a12).a).f;
                ((hmw)o).c((apny)b15);
                return;
            }
            case 7: {
                final Object b16 = this.b;
                final Object a13 = this.a;
                final Boolean b17 = (Boolean)o;
                final wzz a14 = jqq.a;
                if (b17 == null) {
                    return;
                }
                jqq.p((wyw)b16, (elx)a13, (boolean)b17);
                return;
            }
            case 6: {
                final Object b18 = this.b;
                final Object a15 = this.a;
                final amwz amwz = (amwz)o;
                if (amwz != null && amwz.equals((Object)amwz.a)) {
                    final ListPreference listPreference = (ListPreference)a15;
                    final jqq jqq = (jqq)b18;
                    aelq.b(jqq.g.C(jqq.c.c().b(), aaiz.c(Integer.parseInt(listPreference.i))), "Failed to save smart downloads quality value", new Object[0]);
                }
                return;
            }
            case 5: {
                jqq.o((SmartDownloadsStorageUseRadioButton)this.b, (Long)o, (Resources)this.a);
                return;
            }
            case 4: {
                final Object b19 = this.b;
                final Object a16 = this.a;
                final AccountId accountId4 = (AccountId)o;
                accountId4.getClass();
                final Intent intent = (Intent)a16;
                aejc.a(intent, accountId4);
                ((jqd)b19).c.startActivity(intent);
                return;
            }
            case 3: {
                final Object b20 = this.b;
                final Object a17 = this.a;
                final AccountId accountId5 = (AccountId)o;
                accountId5.getClass();
                final Intent intent2 = (Intent)a17;
                aejc.a(intent2, accountId5);
                final jov jov = (jov)b20;
                jov.a.startActivity(intent2.putExtra("show_offline_items", jov.b.a));
                return;
            }
            case 2: {
                final Object b21 = this.b;
                final Object a18 = this.a;
                final Boolean b22 = (Boolean)o;
                if (b22 == null) {
                    return;
                }
                String s;
                if (b22) {
                    s = ((OfflinePrefsFragment)b21).nZ().getString(2132019264);
                }
                else {
                    s = ((OfflinePrefsFragment)b21).nZ().getString(2132019263);
                }
                final Preference preference = (Preference)a18;
                final String value = String.valueOf(preference.q);
                final StringBuilder sb = new StringBuilder();
                sb.append(value);
                sb.append(" · ");
                sb.append(s);
                preference.N((CharSequence)sb.toString());
                return;
            }
            case 1: {
                final Object b23 = this.b;
                final Object a19 = this.a;
                final Optional optional = (Optional)o;
                final ibf ibf = (ibf)b23;
                Label_1485: {
                    if (ibf.b(ibf.m).isPresent()) {
                        if (optional == null || !optional.isPresent()) {
                            break Label_1485;
                        }
                    }
                    else if (ibf.d.m().isEmpty()) {
                        break Label_1485;
                    }
                    Optional empty;
                    if ((empty = optional) == null) {
                        empty = Optional.empty();
                    }
                    ((ibe)a19).b(empty);
                    return;
                }
                ((ibe)a19).a();
                return;
            }
            case 0: {
                final Object a20 = this.a;
                final Object b24 = this.b;
                if (!Boolean.TRUE.equals(o)) {
                    final iga iga = (iga)a20;
                    if (!iga.d.f(45379172L) || ((zyo)b24).a.m.b() != 6) {
                        final aabe j = ((zyo)b24).a.j;
                        if (j != null) {
                            final int n = (int)TimeUnit.SECONDS.toDays(j.a());
                            final acwc i = iga.c.j();
                            i.k((CharSequence)iga.b.getQuantityString(2131886122, n, new Object[] { n }));
                            i.h(false);
                            iga.c.n(i.b());
                            teu.n((aun)iga.a, ((tmx)iga.e.a).b((aezf)new fng(1)), (ttg)ify.b, (ttg)teu.b);
                        }
                    }
                }
            }
        }
    }
}
