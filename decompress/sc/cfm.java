import android.app.AlertDialog$Builder;
import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;
import android.widget.Button;
import androidx.preference.TwoStatePreference;
import android.view.View;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import androidx.preference.Preference;
import java.util.Map;
import android.widget.CompoundButton;
import com.google.android.apps.youtube.app.wellness.WatchBreakFrequencyPickerPreference;
import com.google.android.apps.youtube.app.settings.datasaving.DataReminderPreference;
import com.google.android.apps.youtube.app.settings.OfflinePrefsFragment;
import com.google.android.apps.youtube.app.player.autonav.AutonavToggleController;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.SwitchPreference;
import androidx.preference.CheckBoxPreference;
import android.widget.CompoundButton$OnCheckedChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cfm implements CompoundButton$OnCheckedChangeListener
{
    final Object a;
    private final int b;
    
    public cfm(final agkz a, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public cfm(final CheckBoxPreference a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfm(final SwitchPreference a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfm(final SwitchPreferenceCompat a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfm(final AutonavToggleController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfm(final OfflinePrefsFragment a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfm(final DataReminderPreference a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfm(final WatchBreakFrequencyPickerPreference a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfm(final ey a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfm(final hiu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfm(final idf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfm(final isn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfm(final jbp a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public cfm(final jrf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfm(final jrv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfm(final jvm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfm(final kio a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfm(final rjh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onCheckedChanged(final CompoundButton compoundButton, final boolean b) {
        final int b2 = this.b;
        int n = 2;
        switch (b2) {
            default: {
                final adaw adaw = (adaw)((jbp)this.a).a;
                final aozy b3 = adaw.b;
                aibz aibz;
                if ((aibz = b3.d) == null) {
                    aibz = aibz.a;
                }
                aica aica;
                if ((aibz.b & 0x2) != 0x0) {
                    aibz aibz2;
                    if ((aibz2 = b3.d) == null) {
                        aibz2 = aibz.a;
                    }
                    if ((aica = aibz2.c) == null) {
                        aica = aica.a;
                    }
                }
                else {
                    aica = null;
                }
                if (aica == null) {
                    return;
                }
                aiqj aiqj;
                if (b) {
                    if ((aiqj = aica.e) == null) {
                        aiqj = aiqj.a;
                    }
                }
                else if ((aiqj = aica.f) == null) {
                    aiqj = aiqj.a;
                }
                adaw.a.c(aiqj, (Map)null);
                return;
            }
            case 18: {
                final agkz agkz = (agkz)this.a;
                final aica j = ((aekp)agkz.f).J();
                aiqj aiqj2;
                if (b) {
                    if ((aiqj2 = j.g) == null) {
                        aiqj2 = aiqj.a;
                    }
                }
                else if ((aiqj2 = j.h) == null) {
                    aiqj2 = aiqj.a;
                }
                agkz.K(aiqj2, agkz);
                return;
            }
            case 17: {
                final Button b4 = ((ey)this.a).b(-1);
                if (b4 != null) {
                    ((View)b4).setEnabled(b ^ true);
                }
                return;
            }
            case 16: {
                if (compoundButton.isChecked()) {
                    ((rjh)this.a).m();
                }
                return;
            }
            case 15: {
                if (compoundButton.isChecked()) {
                    ((rjh)this.a).m();
                }
                return;
            }
            case 14: {
                final Object a = this.a;
                ((WatchBreakFrequencyPickerPreference)a).g.d(b);
                final Preference preference = (Preference)a;
                preference.d();
                if (b) {
                    preference.k.h(preference);
                }
                return;
            }
            case 13: {
                final Object a2 = this.a;
                final ahaz builder = ((ahbh)alhi.a).createBuilder();
                final ahaz builder2 = ((ahbh)algx.a).createBuilder();
                builder2.copyOnWrite();
                final algx algx = (algx)builder2.instance;
                if (!b) {
                    n = 3;
                }
                algx.c = n - 1;
                algx.b |= 0x1;
                builder.copyOnWrite();
                final alhi alhi = (alhi)builder.instance;
                final algx n2 = (algx)builder2.build();
                n2.getClass();
                alhi.n = n2;
                alhi.b |= 0x8000;
                final alhi alhi2 = (alhi)builder.build();
                final kio kio = (kio)a2;
                kio.b.J(3, (wzz)new wyt(kio.d.l), alhi2);
                if (!kio.e) {
                    final vcy a3 = kio.a;
                    aiqj aiqj3;
                    if ((aiqj3 = kio.c.h) == null) {
                        aiqj3 = aiqj.a;
                    }
                    a3.c(aiqj3, (Map)null);
                    kio.e = true;
                }
                final kiw e = kio.e(kio.c.e);
                kio.g(e.a ^ true);
                if (!e.a) {
                    kjj.b(kio.b, new wyt(kio.d.l), e.c);
                }
                return;
            }
            case 12: {
                ((isn)this.a).f(b);
                return;
            }
            case 11: {
                final jvm jvm = (jvm)this.a;
                final boolean p2 = jvm.p;
                boolean b5 = b;
                if (p2) {
                    if (!b) {
                        if (jvm.o == null) {
                            jvm.o = ((AlertDialog$Builder)jvm.s.al((Context)jvm.a)).setMessage(2132017725).setPositiveButton(2132018939, (DialogInterface$OnClickListener)new jjm(jvm, 6)).setNegativeButton(2132017611, (DialogInterface$OnClickListener)new jjm(jvm, 5)).create();
                        }
                        jvm.o.show();
                        return;
                    }
                    b5 = true;
                }
                if (!p2 && b5) {
                    jvm.c(true);
                }
                return;
            }
            case 10: {
                final jrv jrv = (jrv)this.a;
                jrv.b.d(b);
                if (b) {
                    jrv.c.performClick();
                    return;
                }
                jrv.b();
                return;
            }
            case 9: {
                tpe.v((View)((jrf)this.a).a, b);
                return;
            }
            case 8: {
                tpe.v(((jrf)this.a).f, b);
                return;
            }
            case 7: {
                final Object a4 = this.a;
                if (!b) {
                    teu.i(((DataReminderPreference)a4).h.b((aezf)iyl.m), teu.b);
                    return;
                }
                final Preference preference2 = (Preference)a4;
                preference2.k.h(preference2);
                preference2.d();
                return;
            }
            case 6: {
                ((OfflinePrefsFragment)this.a).aA = b;
                return;
            }
            case 5: {
                final Object a5 = this.a;
                final AutonavToggleController autonavToggleController = (AutonavToggleController)a5;
                autonavToggleController.h();
                final jki jki = (jki)((fxx)a5).b;
                if (jki != null) {
                    autonavToggleController.q();
                    if (autonavToggleController.j) {
                        autonavToggleController.u(jki).J(3, (wzz)new wyt(((ahxp)jki.a).l), (alhi)null);
                        final WillAutonavInformer h = autonavToggleController.h;
                        if (h.g) {
                            h.j(b);
                        }
                        autonavToggleController.f.removeCallbacks(autonavToggleController.g);
                        autonavToggleController.f.postDelayed(autonavToggleController.g, 300L);
                        autonavToggleController.t((ahxp)jki.a);
                    }
                }
                return;
            }
            case 4: {
                final xnm e2 = ((idf)this.a).e;
                e2.getClass();
                if (!b) {
                    n = 3;
                }
                e2.ag(n);
                return;
            }
            case 3: {
                final hiu hiu = (hiu)this.a;
                hiu.B = b;
                final Context d = hiu.D;
                int n3;
                if (!b) {
                    n3 = 2130970866;
                }
                else {
                    n3 = 2130970852;
                }
                apg.c(compoundButton, tpe.ct(d, n3));
                return;
            }
            case 2: {
                if (!((Preference)this.a).R((Object)b)) {
                    compoundButton.setChecked(b ^ true);
                    return;
                }
                ((TwoStatePreference)this.a).k(b);
                return;
            }
            case 1: {
                if (!((Preference)this.a).R((Object)b)) {
                    compoundButton.setChecked(b ^ true);
                    return;
                }
                ((TwoStatePreference)this.a).k(b);
                return;
            }
            case 0: {
                if (!((Preference)this.a).R((Object)b)) {
                    compoundButton.setChecked(b ^ true);
                    return;
                }
                ((TwoStatePreference)this.a).k(b);
            }
        }
    }
}
