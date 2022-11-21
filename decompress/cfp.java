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

public final class cfp implements CompoundButton$OnCheckedChangeListener
{
    final Object a;
    private final int b;
    
    public cfp(final agmq a, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public cfp(final CheckBoxPreference a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfp(final SwitchPreference a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfp(final SwitchPreferenceCompat a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfp(final AutonavToggleController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfp(final OfflinePrefsFragment a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfp(final DataReminderPreference a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfp(final WatchBreakFrequencyPickerPreference a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfp(final ey a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfp(final hjc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfp(final ido a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfp(final isw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfp(final jby a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public cfp(final jro a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfp(final jse a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfp(final jvu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfp(final kix a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cfp(final rkf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onCheckedChanged(final CompoundButton compoundButton, final boolean b) {
        final int b2 = this.b;
        int n = 2;
        switch (b2) {
            default: {
                final adcj adcj = (adcj)((jby)this.a).a;
                final apck b3 = adcj.b;
                aids aids;
                if ((aids = b3.d) == null) {
                    aids = aids.a;
                }
                aidt aidt;
                if ((aids.b & 0x2) != 0x0) {
                    aids aids2;
                    if ((aids2 = b3.d) == null) {
                        aids2 = aids.a;
                    }
                    if ((aidt = aids2.c) == null) {
                        aidt = aidt.a;
                    }
                }
                else {
                    aidt = null;
                }
                if (aidt == null) {
                    return;
                }
                aisc aisc;
                if (b) {
                    if ((aisc = aidt.e) == null) {
                        aisc = aisc.a;
                    }
                }
                else if ((aisc = aidt.f) == null) {
                    aisc = aisc.a;
                }
                adcj.a.c(aisc, (Map)null);
                return;
            }
            case 18: {
                final agmq agmq = (agmq)this.a;
                final aidt r = ((aheu)agmq.f).R();
                aisc aisc2;
                if (b) {
                    if ((aisc2 = r.g) == null) {
                        aisc2 = aisc.a;
                    }
                }
                else if ((aisc2 = r.h) == null) {
                    aisc2 = aisc.a;
                }
                agmq.K(aisc2, agmq);
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
                    ((rkf)this.a).m();
                }
                return;
            }
            case 15: {
                if (compoundButton.isChecked()) {
                    ((rkf)this.a).m();
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
                final ahcr builder = ((ahcz)alji.a).createBuilder();
                final ahcr builder2 = ((ahcz)alix.a).createBuilder();
                builder2.copyOnWrite();
                final alix alix = (alix)builder2.instance;
                if (!b) {
                    n = 3;
                }
                alix.c = n - 1;
                alix.b |= 0x1;
                builder.copyOnWrite();
                final alji alji = (alji)builder.instance;
                final alix n2 = (alix)builder2.build();
                n2.getClass();
                alji.n = n2;
                alji.b |= 0x8000;
                final alji alji2 = (alji)builder.build();
                final kix kix = (kix)a2;
                kix.b.J(3, (xbe)new wzy(kix.d.l), alji2);
                if (!kix.e) {
                    final veh a3 = kix.a;
                    aisc aisc3;
                    if ((aisc3 = kix.c.h) == null) {
                        aisc3 = aisc.a;
                    }
                    a3.c(aisc3, (Map)null);
                    kix.e = true;
                }
                final kjg e = kix.e(kix.c.e);
                kix.g(e.a ^ true);
                if (!e.a) {
                    kjt.b(kix.b, new wzy(kix.d.l), e.c);
                }
                return;
            }
            case 12: {
                ((isw)this.a).f(b);
                return;
            }
            case 11: {
                final jvu jvu = (jvu)this.a;
                final boolean p2 = jvu.p;
                boolean b5 = b;
                if (p2) {
                    if (!b) {
                        if (jvu.o == null) {
                            jvu.o = ((AlertDialog$Builder)jvu.s.V((Context)jvu.a)).setMessage(2132017725).setPositiveButton(2132018941, (DialogInterface$OnClickListener)new jjy(jvu, 6)).setNegativeButton(2132017611, (DialogInterface$OnClickListener)new jjy(jvu, 5)).create();
                        }
                        jvu.o.show();
                        return;
                    }
                    b5 = true;
                }
                if (!p2 && b5) {
                    jvu.c(true);
                }
                return;
            }
            case 10: {
                final jse jse = (jse)this.a;
                jse.b.d(b);
                if (b) {
                    jse.c.performClick();
                    return;
                }
                jse.b();
                return;
            }
            case 9: {
                tqf.v((View)((jro)this.a).a, b);
                return;
            }
            case 8: {
                tqf.v(((jro)this.a).f, b);
                return;
            }
            case 7: {
                final Object a4 = this.a;
                if (!b) {
                    tfx.i(((DataReminderPreference)a4).h.b((afax)iyu.m), tfx.b);
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
                final gab gab = (gab)((fyc)a5).b;
                if (gab != null) {
                    autonavToggleController.q();
                    if (autonavToggleController.j) {
                        autonavToggleController.u(gab).J(3, (xbe)new wzy(((ahzi)gab.a).l), (alji)null);
                        final WillAutonavInformer h = autonavToggleController.h;
                        if (h.g) {
                            h.j(b);
                        }
                        autonavToggleController.f.removeCallbacks(autonavToggleController.g);
                        autonavToggleController.f.postDelayed(autonavToggleController.g, 300L);
                        autonavToggleController.t((ahzi)gab.a);
                    }
                }
                return;
            }
            case 4: {
                final xoy e2 = ((ido)this.a).e;
                e2.getClass();
                if (!b) {
                    n = 3;
                }
                e2.ag(n);
                return;
            }
            case 3: {
                final hjc hjc = (hjc)this.a;
                hjc.B = b;
                final Context d = hjc.D;
                int n3;
                if (!b) {
                    n3 = 2130970864;
                }
                else {
                    n3 = 2130970850;
                }
                aph.c(compoundButton, tqf.ct(d, n3));
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
