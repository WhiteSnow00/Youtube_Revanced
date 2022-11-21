// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.settings;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.view.View;
import android.content.SharedPreferences;
import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;

public final class AutoplayPrefsFragment extends jpi implements SharedPreferences$OnSharedPreferenceChangeListener
{
    public SettingsDataAccess ae;
    public WillAutonavInformer af;
    public isw ag;
    public veh ah;
    public askz ai;
    public boolean aj;
    public arzb ak;
    private final aslm al;
    public SharedPreferences c;
    public xaa d;
    public adbk e;
    
    public AutoplayPrefsFragment() {
        this.al = new aslm();
        this.aj = false;
    }
    
    public final void W() {
        this.c.unregisterOnSharedPreferenceChangeListener((SharedPreferences$OnSharedPreferenceChangeListener)this);
        this.al.b();
        super.W();
    }
    
    public final void aM() {
        ((cfb)this).a.g("youtube");
        this.c.registerOnSharedPreferenceChangeListener((SharedPreferences$OnSharedPreferenceChangeListener)this);
    }
    
    public final void ab(final View view, final Bundle bundle) {
        super.ab(view, bundle);
        this.al.b();
        this.al.f(((aske)this.ae.c).p().R().P(this.ai).an((asmi)new jnd(this, 8), (asmi)jmn.c), this.ae.g((Runnable)new joh(this)));
    }
    
    public final RecyclerView n(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final RecyclerView n = super.n(layoutInflater, viewGroup, bundle);
        n.ae((nu)null);
        return n;
    }
    
    public final void onSharedPreferenceChanged(final SharedPreferences sharedPreferences, final String s) {
        if ("inline_global_play_pause".equals(s)) {
            jon.b(this.c, this.d);
        }
    }
}
