// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.settings;

import android.view.ViewGroup;
import android.content.Context;
import androidx.preference.Preference;

public class QuietHoursNotificationPreference extends Preference
{
    private final jqn a;
    private final anxs b;
    private final wwu c;
    private jqm d;
    
    public QuietHoursNotificationPreference(final Context context, final jqn a, final wwu c, final anxs b) {
        super(context);
        this.a = a;
        this.c = c;
        this.b = b;
        this.I("quiet_hours_notification_preference");
        super.B = 2131625357;
    }
    
    @Override
    protected final void C() {
        super.Q();
        final jqm d = this.d;
        if (d != null) {
            d.c((acir)null);
            this.d = null;
        }
    }
    
    @Override
    public final void rH(final cfi cfi) {
        super.rH(cfi);
        if (this.d == null) {
            this.d = this.a.b((ViewGroup)cfi.a);
            ((ViewGroup)cfi.a).addView(this.d.a());
        }
        this.d.g(new acij(), (jqr)jqt.a(this.b));
        this.c.n().l((wxz)new wws(this.b.q));
    }
}
