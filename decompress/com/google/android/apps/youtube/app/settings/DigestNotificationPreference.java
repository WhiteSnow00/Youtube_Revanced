// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.settings;

import android.view.ViewGroup;
import android.content.Context;
import androidx.preference.Preference;

public class DigestNotificationPreference extends Preference
{
    private final jrt a;
    private final aocc b;
    private final xaa c;
    private jrs d;
    
    public DigestNotificationPreference(final Context context, final jrt a, final xaa c, final aocc b) {
        super(context);
        this.a = a;
        this.c = c;
        this.b = b;
        this.I("daily_digest_notification_preference");
        super.B = 2131625364;
    }
    
    protected final void C() {
        super.Q();
        final jrs d = this.d;
        if (d != null) {
            d.c((acmh)null);
            this.d = null;
        }
    }
    
    public final void rN(final cfm cfm) {
        super.rN(cfm);
        if (this.d == null) {
            this.d = this.a.b((ViewGroup)cfm.a);
            ((ViewGroup)cfm.a).addView(this.d.a());
        }
        this.d.g(new aclz(), (jsa)jsd.a(this.b));
        this.c.pE().l((xbe)new wzy(this.b.q));
    }
}
