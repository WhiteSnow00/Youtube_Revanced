// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.settings;

import android.view.ViewGroup;
import android.content.Context;
import androidx.preference.Preference;

public class QuietHoursNotificationPreference extends Preference
{
    private final jrx a;
    private final aocc b;
    private final xaa c;
    private jrw d;
    
    public QuietHoursNotificationPreference(final Context context, final jrx a, final xaa c, final aocc b) {
        super(context);
        this.a = a;
        this.c = c;
        this.b = b;
        this.I("quiet_hours_notification_preference");
        super.B = 2131625364;
    }
    
    protected final void C() {
        super.Q();
        final jrw d = this.d;
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
        this.d.g(new aclz(), (jsb)jsd.a(this.b));
        this.c.pE().l((xbe)new wzy(this.b.q));
    }
}
