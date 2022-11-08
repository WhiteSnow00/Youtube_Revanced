// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.settings.datasaving;

import androidx.preference.PreferenceGroup;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;
import java.util.concurrent.atomic.AtomicReference;
import androidx.preference.PreferenceCategory;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreSwitchPreference;

public class DataSavingPrefsFragment extends jpg
{
    public ProtoDataStoreSwitchPreference ae;
    public ProtoDataStoreSwitchPreference af;
    public ProtoDataStoreSwitchPreference ag;
    public thh ah;
    public SettingsDataAccess ai;
    public tku aj;
    public asho ak;
    public wwv al;
    public uyi am;
    public uyi an;
    public arud ao;
    public alm ap;
    private DataReminderPreference aq;
    private PreferenceCategory ar;
    private asic as;
    private asic at;
    public ProtoDataStoreSwitchPreference c;
    public ProtoDataStoreSwitchPreference d;
    public ProtoDataStoreSwitchPreference e;
    
    private final ProtoDataStoreSwitchPreference aS(final CharSequence charSequence) {
        final ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference = (ProtoDataStoreSwitchPreference)((cex)this).pF(charSequence);
        protoDataStoreSwitchPreference.getClass();
        return protoDataStoreSwitchPreference;
    }
    
    public final void W() {
        final asic as = this.as;
        if (as != null) {
            athh.f((AtomicReference)as);
        }
        final asic at = this.at;
        if (at != null) {
            athh.f((AtomicReference)at);
        }
        this.al.s();
        super.W();
    }
    
    public final void aM() {
        ((cex)this).p(2132213772);
        final bu od = ((br)this).od();
        if (od == null) {
            return;
        }
        ((Activity)od).setTitle((CharSequence)((br)this).P(2132017828));
        this.c = this.aS("data_saving_mode_key");
        this.d = this.aS("data_saving_pref_video_quality_key");
        this.e = this.aS("data_saving_pref_download_quality_key");
        this.ae = this.aS("data_saving_pref_download_wifi_only_key");
        this.af = this.aS("data_saving_pref_upload_wifi_only_key");
        this.ag = this.aS("data_saving_imp_wifi_only_key");
        final PreferenceCategory ar = (PreferenceCategory)((cex)this).pF((CharSequence)"data_saving_monitoring_and_control_category");
        ar.getClass();
        this.ar = ar;
        final ProtoDataStoreSwitchPreference as = this.aS("data_saving_pref_select_quality_every_video_key");
        final DataReminderPreference aq = (DataReminderPreference)((cex)this).pF((CharSequence)"data_saving_data_reminder_key");
        aq.getClass();
        this.aq = aq;
        if (!this.an.bF()) {
            ((PreferenceGroup)this.ar).ag((Preference)this.aq);
        }
        if (!kgk.A(this.am, this.an)) {
            ((PreferenceGroup)this.ar).ag((Preference)as);
        }
        this.aO();
        ((Preference)this.c).o = (cem)new joe(this, 2);
        this.at = this.aj.d().p().P(this.ak).L((asjc)new jax(this, 12)).ak();
        ((Preference)this.d).o = (cem)new joe(this, 3);
        ((Preference)this.e).o = (cem)new joe(this, 4);
        ((Preference)this.ae).o = (cem)new joe(this, 5);
        ((Preference)this.af).o = (cem)new joe(this, 6);
        ((Preference)this.ag).o = (cem)new joe(this, 7);
        ((Preference)as).o = (cem)new joe(this, 8);
        ((Preference)this.aq).o = (cem)new joe(this, 9);
    }
    
    public final void aO() {
        this.al.l((wxz)new wws(wya.c(133799)));
        this.al.l((wxz)new wws(wya.c(133804)));
        final boolean ae = gkt.aE(this.ao);
        boolean b = false;
        if (ae) {
            this.al.l((wxz)new wws(wya.c(133800)));
        }
        else {
            ((Preference)this.d).O(false);
        }
        if (gkt.aJ(this.ah, this.ao)) {
            this.al.l((wxz)new wws(wya.c(133803)));
        }
        else {
            ((Preference)this.af).O(false);
        }
        if (this.ap.Q()) {
            ((Preference)this.e).O(true);
            ((Preference)this.ae).O(true);
            this.al.l((wxz)new wws(wya.c(133801)));
            this.al.l((wxz)new wws(wya.c(133802)));
        }
        else {
            ((Preference)this.e).O(false);
            ((Preference)this.ae).O(false);
        }
        final PreferenceCategory ar = this.ar;
        if (kgk.A(this.am, this.an) || this.an.bF()) {
            b = true;
        }
        ((Preference)ar).O(b);
        if (kgk.A(this.am, this.an)) {
            this.al.l((wxz)new wws(wya.c(140146)));
        }
        if (this.an.bF()) {
            this.al.l((wxz)new wws(wya.c(158826)));
        }
    }
    
    public final void ab(final View view, final Bundle bundle) {
        super.ab(view, bundle);
        this.as = this.ai.g((Runnable)new jnu(this, 3));
        this.al.b(wya.b(133798), (aioe)null, (alff)null);
    }
    
    public final void r(final Preference preference) {
        if (preference instanceof DataReminderPreference) {
            final String s = preference.s;
            final Bundle bundle = new Bundle();
            bundle.putString("key", s);
            final jos jos = new jos();
            jos.ag(bundle);
            jos.aG((br)this);
            jos.r(((br)this).G(), jos.class.getName());
            return;
        }
        super.r(preference);
    }
}
