// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.settings;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.concurrent.atomic.AtomicReference;
import android.os.Bundle;
import androidx.preference.Preference;

public final class NotificationPrefsFragment extends jpl
{
    private asln ae;
    public xaa c;
    public adbk d;
    public SettingsDataAccess e;
    
    private final void aS(final CharSequence charSequence) {
        final Preference pj = ((cfb)this).pJ(charSequence);
        if (pj != null) {
            ((cfb)this).o().ag(pj);
        }
    }
    
    public final void T(final Bundle bundle) {
        super.T(bundle);
        this.ae = this.e.g((Runnable)new jin(this, 20));
    }
    
    public final void W() {
        atkw.f((AtomicReference)this.ae);
        super.W();
        this.aS("daily_digest_notification_preference");
        this.aS("quiet_hours_notification_preference");
    }
    
    public final void aM() {
        ((cfb)this).a.g("youtube");
        this.c.pE().b(xbf.b(57173), (aisc)null, (alji)null);
    }
    
    public final RecyclerView n(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final RecyclerView n = super.n(layoutInflater, viewGroup, bundle);
        n.ae((nu)null);
        return n;
    }
}
