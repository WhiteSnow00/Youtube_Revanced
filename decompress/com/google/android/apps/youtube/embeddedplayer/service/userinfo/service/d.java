// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.userinfo.service;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import android.content.SharedPreferences;

public final class d implements znq
{
    public final SharedPreferences a;
    public String b;
    public final uyi c;
    private final atjj d;
    private final atjj e;
    private final Executor f;
    private boolean g;
    
    public d(final SharedPreferences a, final atjj e, final atjj d, final Executor f, final com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.d d2, final uyi c) {
        this.b = "";
        this.d = d;
        this.a = a;
        this.c = c;
        if (c.L()) {
            this.b = d2.a;
        }
        this.e = e;
        this.f = f;
    }
    
    public final void a(final String s, final zkh zkh) {
        if (this.a.getString("visitor_id", (String)null) != null) {
            return;
        }
        if (s.contains("visitor_id")) {
            return;
        }
        this.b();
    }
    
    protected final void b() {
        synchronized (this) {
            if (this.g) {
                return;
            }
            final addp addp = (addp)this.e.a();
            final vpd n = addp.n();
            ((vii)n).k(uyp.b);
            try {
                akjf akjf;
                if ((akjf = ((albr)addp.o(n, this.f).get(4L, TimeUnit.SECONDS)).b) == null) {
                    akjf = akjf.a;
                }
                final String c = akjf.c;
                if (!TextUtils.isEmpty((CharSequence)c)) {
                    if (this.c.L()) {
                        this.a.edit().putString(String.valueOf(this.b).concat("_visitor_id"), c).apply();
                    }
                    else {
                        this.a.edit().putString("visitor_id", c).apply();
                    }
                }
            }
            catch (final ExecutionException ex) {
                this.c(22);
            }
            catch (final InterruptedException ex2) {
                this.c(21);
            }
            catch (final TimeoutException ex3) {
                this.c(4);
            }
            this.g = true;
        }
    }
    
    public final void c(final int n) {
        final adcr adcr = (adcr)this.d.a();
        final agza builder = ((agzi)ahzu.a).createBuilder();
        builder.copyOnWrite();
        final ahzu ahzu = (ahzu)builder.instance;
        ahzu.c = n - 1;
        ahzu.b |= 0x1;
        final ahzu ahzu2 = (ahzu)builder.build();
        final aklo d = aklq.d();
        ((agza)d).copyOnWrite();
        aklq.cj((aklq)d.instance, ahzu2);
        adcr.aM((aklq)((agza)d).build());
    }
}
