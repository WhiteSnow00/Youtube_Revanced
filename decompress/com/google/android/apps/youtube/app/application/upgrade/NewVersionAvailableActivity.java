// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.application.upgrade;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.text.Spanned;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.view.View$OnClickListener;

public class NewVersionAvailableActivity extends ewx implements View$OnClickListener
{
    public xab b;
    public tsd c;
    public vbo d;
    private boolean e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private View j;
    private Intent k;
    
    private final void b() {
        final Intent k = this.k;
        if (k != null) {
            this.b.J(3, (xbe)new wzy(xbf.c(24403)), (alji)null);
            this.startActivity(k);
        }
        this.finish();
    }
    
    private final void d() {
        amkj amkj;
        if ((amkj = this.d.b().i) == null) {
            amkj = amkj.a;
        }
        apiz apiz;
        if ((apiz = amkj.e) == null) {
            apiz = apiz.a;
        }
        if ((apiz.b & 0x40) != 0x0) {
            amab amab;
            if ((amab = apiz.d) == null) {
                amab = amab.a;
            }
            ajws ajws;
            if ((ajws = amab.d) == null) {
                ajws = ajws.a;
            }
            final Spanned b = acbu.b(ajws);
            if (b != null) {
                final TextView g = this.g;
                if (g != null) {
                    g.setText((CharSequence)b);
                }
            }
            ajws ajws2;
            if ((ajws2 = amab.c) == null) {
                ajws2 = ajws.a;
            }
            final Spanned b2 = acbu.b(ajws2);
            if (b2 != null) {
                final TextView f = this.f;
                if (f != null) {
                    f.setText((CharSequence)b2);
                }
            }
            final lqi lqi = new lqi(this, 1);
            ajws ajws3;
            if ((ajws3 = amab.b) == null) {
                ajws3 = ajws.a;
            }
            final Spanned a = ven.a(ajws3, (veh)lqi, false);
            if (a != null) {
                final TextView i = this.i;
                if (i != null) {
                    i.setText((CharSequence)a);
                }
            }
            ajws ajws4;
            if ((ajws4 = amab.e) == null) {
                ajws4 = ajws.a;
            }
            final Spanned b3 = acbu.b(ajws4);
            if (b3 != null && b3.length() > 0) {
                final TextView h = this.h;
                if (h != null) {
                    h.setText((CharSequence)b3);
                }
            }
            if (amab.f) {
                final TextView f2 = this.f;
                if (f2 != null) {
                    f2.setVisibility(8);
                }
                final View j = this.j;
                if (j != null) {
                    j.setVisibility(8);
                }
            }
        }
    }
    
    public final void onBackPressed() {
        final TextView g = this.g;
        if (g != null && g.getVisibility() == 0) {
            this.b();
            return;
        }
        this.finish();
    }
    
    public final void onClick(final View view) {
        if (view == this.f) {
            this.b.J(3, (xbe)new wzy(xbf.c(24404)), (alji)null);
            String s;
            if (!this.e) {
                s = "unknown";
            }
            else {
                s = "force";
            }
            tdk.i((Activity)this, s, tvo.c((Context)this));
            this.finish();
            return;
        }
        if (view == this.g) {
            this.b();
        }
    }
    
    public final void onCreate(final Bundle bundle) {
        glg.b((Context)this);
        super.onCreate(bundle);
        ((qu)this).setContentView(2131624912);
        final Intent intent = this.getIntent();
        this.k = (Intent)intent.getParcelableExtra("forward_intent");
        this.e = intent.getBooleanExtra("show_force_upgrade", false);
        (this.f = (TextView)((fa)this).findViewById(2131429429)).setOnClickListener((View$OnClickListener)this);
        this.j = ((fa)this).findViewById(2131429430);
        this.i = (TextView)((fa)this).findViewById(2131432238);
        this.h = (TextView)((fa)this).findViewById(2131432096);
        this.g = (TextView)((fa)this).findViewById(2131429494);
        this.d();
        if (this.e) {
            this.b.b(xbf.b(24402), (aisc)null, (alji)null);
            this.b.l((xbe)new wzy(xbf.c(24404)));
            final TextView g = this.g;
            if (g != null) {
                g.setVisibility(8);
            }
        }
        else {
            this.b.b(xbf.b(24400), (aisc)null, (alji)null);
            this.b.l((xbe)new wzy(xbf.c(24404)));
            this.b.l((xbe)new wzy(xbf.c(24403)));
            final TextView g2 = this.g;
            if (g2 != null) {
                g2.setOnClickListener((View$OnClickListener)this);
            }
        }
    }
    
    protected final void onStart() {
        super.onStart();
        this.d();
    }
    
    public final void onUserInteraction() {
        final tsd c = this.c;
        if (c != null) {
            c.b();
        }
        super.onUserInteraction();
    }
}
