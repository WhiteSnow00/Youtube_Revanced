// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.settings;

import android.view.ViewGroup;
import android.content.Context;
import androidx.preference.Preference;

public class DigestNotificationPreference extends Preference
{
    private final jqj a;
    private final anxs b;
    private final wwu c;
    private jqi d;
    
    public DigestNotificationPreference(final Context context, final jqj a, final wwu c, final anxs b) {
        super(context);
        this.a = a;
        this.c = c;
        this.b = b;
        this.I("daily_digest_notification_preference");
        super.B = 2131625357;
    }
    
    @Override
    protected final void C() {
        super.Q();
        final jqi d = this.d;
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
        this.d.g(new acij(), (jqq)jqt.a(this.b));
        this.c.n().l((wxz)new wws(this.b.q));
    }
}
