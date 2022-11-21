// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.settings;

import android.view.View$OnClickListener;
import android.widget.TextView;
import android.content.Context;
import android.widget.ViewSwitcher;
import androidx.preference.Preference;

public class UpdatePlaybackAreaPreference extends Preference
{
    public final aocb a;
    public ViewSwitcher b;
    public ceq c;
    private final xaa d;
    private final aslm e;
    private final askz f;
    private final aaec g;
    
    public UpdatePlaybackAreaPreference(final Context context, final xaa d, final aaec g, final askz f, final aocb a, final byte[] array) {
        super(context);
        this.e = new aslm();
        this.d = d;
        this.a = a;
        this.g = g;
        this.f = f;
    }
    
    protected final void C() {
        super.Q();
        this.e.b();
    }
    
    public final void k() {
        final ViewSwitcher b = this.b;
        if (b == null) {
            return;
        }
        b.setDisplayedChild(1);
        this.K(2132020032);
    }
    
    public final void l() {
        final ViewSwitcher b = this.b;
        if (b == null) {
            return;
        }
        b.setDisplayedChild(0);
        ajws ajws;
        if ((ajws = this.a.e) == null) {
            ajws = ajws.a;
        }
        this.n((CharSequence)acbu.b(ajws));
    }
    
    public final void rN(final cfm cfm) {
        super.rN(cfm);
        this.d.pE().l((xbe)new wzy(this.a.i));
        (this.b = (ViewSwitcher)cfm.E(2131432485)).setDisplayedChild(0);
        final TextView textView = (TextView)cfm.E(2131428554);
        final aocb a = this.a;
        if ((a.b & 0x10) != 0x0) {
            ajws ajws;
            if ((ajws = a.f) == null) {
                ajws = ajws.a;
            }
            textView.setText((CharSequence)acbu.b(ajws));
            final ceq c = this.c;
            if (c != null) {
                textView.setOnClickListener((View$OnClickListener)new jln(this, c, 8));
            }
        }
        this.e.f(this.g.q().P(this.f).an((asmi)new jnd(this, 14), (asmi)jmn.d), ((aske)this.g.b).R().J().P(this.f).B((asmo)iuv.p).an((asmi)new jqd(this, 1), (asmi)jmn.d));
    }
}
