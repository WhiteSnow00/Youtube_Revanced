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
    public final anxr a;
    public ViewSwitcher b;
    public cem c;
    private final wwu d;
    private final asib e;
    private final asho f;
    private final aaal g;
    
    public UpdatePlaybackAreaPreference(final Context context, final wwu d, final aaal g, final asho f, final anxr a, final byte[] array) {
        super(context);
        this.e = new asib();
        this.d = d;
        this.a = a;
        this.g = g;
        this.f = f;
    }
    
    @Override
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
        this.K(2132020028);
    }
    
    public final void l() {
        final ViewSwitcher b = this.b;
        if (b == null) {
            return;
        }
        b.setDisplayedChild(0);
        ajsq ajsq;
        if ((ajsq = this.a.e) == null) {
            ajsq = ajsq.a;
        }
        this.n((CharSequence)abyh.b(ajsq));
    }
    
    @Override
    public final void rH(final cfi cfi) {
        super.rH(cfi);
        this.d.n().l((wxz)new wws(this.a.i));
        (this.b = (ViewSwitcher)cfi.E(2131432481)).setDisplayedChild(0);
        final TextView textView = (TextView)cfi.E(2131428554);
        final anxr a = this.a;
        if ((a.b & 0x10) != 0x0) {
            ajsq ajsq;
            if ((ajsq = a.f) == null) {
                ajsq = ajsq.a;
            }
            textView.setText((CharSequence)abyh.b(ajsq));
            final cem c = this.c;
            if (c != null) {
                textView.setOnClickListener((View$OnClickListener)new jjz(this, c, 7));
            }
        }
        this.e.f(new asic[] { this.g.q().P(this.f).am((asix)new jmj(this, 9), (asix)jky.e), ((asgt)this.g.b).R().J().P(this.f).B((asjd)iuc.n).am((asix)new jmj(this, 10), (asix)jky.e) });
    }
}
