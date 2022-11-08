// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.settings.accessibility;

import androidx.preference.Preference;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreListPreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreSwitchPreference;
import android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener;

public final class AccessibilityPrefsFragment extends joj implements AccessibilityManager$AccessibilityStateChangeListener
{
    private ProtoDataStoreSwitchPreference ae;
    public ProtoDataStoreListPreference c;
    public wwu d;
    public bx e;
    
    private final void aQ() {
        this.ae.ag(Boolean.valueOf(this.e.Y()));
        final ListenableFuture af = this.ae.af();
        final jmg r = jmg.r;
        final ProtoDataStoreListPreference c = this.c;
        c.getClass();
        tcp.n((aum)this, af, (trb)r, (trb)new jly(c, 14));
    }
    
    public final void aM() {
        ((br)this).od().setTitle(2132017398);
        this.d.n().b(wya.b(85013), (aioe)null, (alff)null);
        this.d.n().l((wxz)new wws(wya.c(85014)));
    }
    
    public final void no() {
        super.no();
        tqt.g(((br)this).nT(), (AccessibilityManager$AccessibilityStateChangeListener)this);
        this.aQ();
    }
    
    public final void np() {
        super.np();
        tqt.h(((br)this).nT(), (AccessibilityManager$AccessibilityStateChangeListener)this);
    }
    
    public final void onAccessibilityStateChanged(final boolean b) {
        this.aQ();
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        ((cex)this).a.g("youtube");
        ((cex)this).p(2132213760);
        final ProtoDataStoreSwitchPreference ae = (ProtoDataStoreSwitchPreference)((cex)this).pF((CharSequence)"accessibility_player_setting_key");
        ae.getClass();
        this.ae = ae;
        final ProtoDataStoreListPreference c = (ProtoDataStoreListPreference)((cex)this).pF((CharSequence)"accessibility_hide_player_controls_setting_key");
        c.getClass();
        this.c = c;
        this.ae.c = (tqe)new jmx(this, 5);
        final ProtoDataStoreListPreference c2 = this.c;
        ((Preference)c2).o = (cem)new joe(this, 0);
        c2.G = (tqe)new jmx(this, 6);
    }
}
