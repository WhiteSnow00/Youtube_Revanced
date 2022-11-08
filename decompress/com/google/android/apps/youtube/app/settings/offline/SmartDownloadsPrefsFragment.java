// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.settings.offline;

import androidx.preference.PreferenceGroup;
import android.os.Bundle;
import androidx.preference.PreferenceScreen;
import android.app.Activity;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreSwitchPreference;
import android.content.Context;
import androidx.preference.Preference;
import android.content.SharedPreferences;
import androidx.preference.ListPreference;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;

public class SmartDownloadsPrefsFragment extends jpy implements SharedPreferences$OnSharedPreferenceChangeListener
{
    public SmartDownloadsStorageUseRadioButton ae;
    public uyi af;
    private SmartDownloadsStorageUseRadioButton ag;
    private ListPreference ah;
    private ListPreference ai;
    private SharedPreferences aj;
    private atir ak;
    private asib al;
    private rf am;
    public jpp c;
    public atjj d;
    public wwu e;
    
    public SmartDownloadsPrefsFragment() {
        this.al = new asib();
    }
    
    private final void aQ(final int n) {
        this.e.n().l((wxz)new wws(wya.c(n)));
    }
    
    public final void W() {
        super.W();
        final SharedPreferences aj = this.aj;
        if (aj != null) {
            aj.unregisterOnSharedPreferenceChangeListener((SharedPreferences$OnSharedPreferenceChangeListener)this);
        }
        if (!this.al.b) {
            this.al.dispose();
        }
        final atir ak = this.ak;
        if (ak != null) {
            ak.tu();
            this.ak = null;
        }
    }
    
    public final boolean aL(final Preference preference) {
        final String s = preference.s;
        if ("smart_downloads_auto_storage".equals(s)) {
            this.c.d(this.ae, this.e.n());
        }
        else if ("smart_downloads_custom_storage".equals(s)) {
            final jpp c = this.c;
            final Context nt = ((br)this).nT();
            final atjj d = this.d;
            final SmartDownloadsStorageUseRadioButton ag = this.ag;
            final rf am = this.am;
            am.getClass();
            c.e(nt, d, ag, am, this.e.n());
        }
        return super.aL(preference);
    }
    
    public final void aM() {
        ((cex)this).a.g("youtube");
        final bu od = ((br)this).od();
        if (od == null) {
            return;
        }
        ((Activity)od).setTitle((CharSequence)((br)this).nT().getResources().getString(2132019246));
        this.e.n().b(wya.b(149968), (aioe)null, (alff)null);
        final SharedPreferences c = ((cex)this).a.c();
        if ((this.aj = c) != null) {
            c.registerOnSharedPreferenceChangeListener((SharedPreferences$OnSharedPreferenceChangeListener)this);
        }
        if (this.af.ai()) {
            ((cex)this).p(2132213761);
        }
        else {
            ((cex)this).p(2132213786);
        }
        final ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference = (ProtoDataStoreSwitchPreference)((cex)this).pF((CharSequence)"smart_downloads_opted_in");
        if (protoDataStoreSwitchPreference != null) {
            this.c.h((aum)this, this.e.n(), protoDataStoreSwitchPreference);
            this.c.k((aum)this, protoDataStoreSwitchPreference, ((br)this).nZ());
            this.al.c(this.c.b(protoDataStoreSwitchPreference));
        }
        final ListPreference ah = (ListPreference)((cex)this).pF((CharSequence)"offline_quality");
        if ((this.ah = ah) != null) {
            this.c.m(ah, ((br)this).nZ());
            this.ak = atir.aR((Object)this.c.l(this.ah));
            final asib al = this.al;
            final jpp c2 = this.c;
            final ListPreference ah2 = this.ah;
            ah2.getClass();
            al.c(c2.a(ah2, (ashe)this.ak, ((br)this).nZ()));
        }
        final PreferenceScreen o = ((cex)this).o();
        this.ai = (ListPreference)((cex)this).pF((CharSequence)"smart_downloads_quality");
        if (this.af.an()) {
            final ListPreference ai = this.ai;
            if (ai != null) {
                final jpp c3 = this.c;
                tcp.n((aum)this, c3.g.x(c3.c.c().b()), (trb)jpn.b, (trb)new eyc(c3, ai, ((br)this).nZ(), 15));
                final ListPreference ai2 = this.ai;
                ((Preference)ai2).o = (cem)new jpr(this, (Activity)od, 0);
                ((Preference)ai2).n = (cel)new jng(this, 2);
                this.aQ(164528);
                final ListPreference ah3 = this.ah;
                if (ah3 != null) {
                    ((PreferenceGroup)o).ag((Preference)ah3);
                }
            }
        }
        else {
            final ListPreference ai3 = this.ai;
            if (ai3 != null) {
                ((PreferenceGroup)o).ag((Preference)ai3);
            }
        }
        this.c.i((aum)this, ((cex)this).pF((CharSequence)"smart_downloads_low_disk_space"));
        final SmartDownloadsStorageUseRadioButton ag = (SmartDownloadsStorageUseRadioButton)((cex)this).pF((CharSequence)"smart_downloads_auto_storage");
        this.ag = ag;
        this.c.c(ag);
        if (this.ag != null) {
            this.aQ(149984);
        }
        final SmartDownloadsStorageUseRadioButton ae = (SmartDownloadsStorageUseRadioButton)((cex)this).pF((CharSequence)"smart_downloads_custom_storage");
        this.ae = ae;
        this.c.c(ae);
        this.c.j((aum)this, this.ae, ((br)this).nZ());
        if (this.ae != null) {
            this.aQ(149986);
        }
    }
    
    public final void onSharedPreferenceChanged(final SharedPreferences sharedPreferences, final String s) {
        if ("offline_quality".equals(s)) {
            final ListPreference listPreference = (ListPreference)((cex)this).pF((CharSequence)s);
            if (listPreference != null) {
                ((Preference)listPreference).n(listPreference.l());
                final atir ak = this.ak;
                if (ak != null) {
                    ak.tr((Object)this.c.l(listPreference));
                }
            }
        }
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        this.am = ((br)this).registerForActivityResult((rl)new ro(), (rd)new gtr(this, 5));
    }
}
