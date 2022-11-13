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

public class NewVersionAvailableActivity extends ewv implements View$OnClickListener
{
    public wyw b;
    public trc c;
    public vaf d;
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
            this.b.J(3, (wzz)new wyt(xaa.c(24403)), (alhi)null);
            this.startActivity(k);
        }
        this.finish();
    }
    
    private final void d() {
        amie amie;
        if ((amie = this.d.b().i) == null) {
            amie = amie.a;
        }
        apgn apgn;
        if ((apgn = amie.e) == null) {
            apgn = apgn.a;
        }
        if ((apgn.b & 0x40) != 0x0) {
            alyb alyb;
            if ((alyb = apgn.d) == null) {
                alyb = alyb.a;
            }
            ajut ajut;
            if ((ajut = alyb.d) == null) {
                ajut = ajut.a;
            }
            final Spanned b = acak.b(ajut);
            if (b != null) {
                final TextView g = this.g;
                if (g != null) {
                    g.setText((CharSequence)b);
                }
            }
            ajut ajut2;
            if ((ajut2 = alyb.c) == null) {
                ajut2 = ajut.a;
            }
            final Spanned b2 = acak.b(ajut2);
            if (b2 != null) {
                final TextView f = this.f;
                if (f != null) {
                    f.setText((CharSequence)b2);
                }
            }
            final lpt lpt = new lpt(this, 1);
            ajut ajut3;
            if ((ajut3 = alyb.b) == null) {
                ajut3 = ajut.a;
            }
            final Spanned a = vde.a(ajut3, (vcy)lpt, false);
            if (a != null) {
                final TextView i = this.i;
                if (i != null) {
                    i.setText((CharSequence)a);
                }
            }
            ajut ajut4;
            if ((ajut4 = alyb.e) == null) {
                ajut4 = ajut.a;
            }
            final Spanned b3 = acak.b(ajut4);
            if (b3 != null && b3.length() > 0) {
                final TextView h = this.h;
                if (h != null) {
                    h.setText((CharSequence)b3);
                }
            }
            if (alyb.f) {
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
            this.b.J(3, (wzz)new wyt(xaa.c(24404)), (alhi)null);
            String s;
            if (!this.e) {
                s = "unknown";
            }
            else {
                s = "force";
            }
            tcg.i((Activity)this, s, tum.d((Context)this));
            this.finish();
            return;
        }
        if (view == this.g) {
            this.b();
        }
    }
    
    public final void onCreate(final Bundle bundle) {
        glb.c((Context)this);
        super.onCreate(bundle);
        ((qt)this).setContentView(2131624910);
        final Intent intent = this.getIntent();
        this.k = (Intent)intent.getParcelableExtra("forward_intent");
        this.e = intent.getBooleanExtra("show_force_upgrade", false);
        (this.f = (TextView)((fa)this).findViewById(2131429429)).setOnClickListener((View$OnClickListener)this);
        this.j = ((fa)this).findViewById(2131429430);
        this.i = (TextView)((fa)this).findViewById(2131432237);
        this.h = (TextView)((fa)this).findViewById(2131432095);
        this.g = (TextView)((fa)this).findViewById(2131429494);
        this.d();
        if (this.e) {
            this.b.b(xaa.b(24402), (aiqj)null, (alhi)null);
            this.b.l((wzz)new wyt(xaa.c(24404)));
            final TextView g = this.g;
            if (g != null) {
                g.setVisibility(8);
            }
        }
        else {
            this.b.b(xaa.b(24400), (aiqj)null, (alhi)null);
            this.b.l((wzz)new wyt(xaa.c(24404)));
            this.b.l((wzz)new wyt(xaa.c(24403)));
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
        final trc c = this.c;
        if (c != null) {
            c.b();
        }
        super.onUserInteraction();
    }
}
