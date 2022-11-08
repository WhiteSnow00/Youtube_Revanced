// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.settings;

import androidx.preference.PreferenceGroup;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.concurrent.atomic.AtomicReference;
import android.os.Bundle;
import androidx.preference.Preference;

public final class NotificationPrefsFragment extends jnz
{
    private asic ae;
    public wwu c;
    public acxu d;
    public SettingsDataAccess e;
    
    private final void aS(final CharSequence charSequence) {
        final Preference pf = ((cex)this).pF(charSequence);
        if (pf != null) {
            ((PreferenceGroup)((cex)this).o()).ag(pf);
        }
    }
    
    public final void T(final Bundle bundle) {
        super.T(bundle);
        this.ae = this.e.g((Runnable)new jmw(this, 3));
    }
    
    public final void W() {
        athh.f((AtomicReference)this.ae);
        super.W();
        this.aS("daily_digest_notification_preference");
        this.aS("quiet_hours_notification_preference");
    }
    
    public final void aM() {
        ((cex)this).a.g("youtube");
        this.c.n().b(wya.b(57173), (aioe)null, (alff)null);
    }
    
    public final RecyclerView n(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final RecyclerView n = super.n(layoutInflater, viewGroup, bundle);
        n.ae((nt)null);
        return n;
    }
}
