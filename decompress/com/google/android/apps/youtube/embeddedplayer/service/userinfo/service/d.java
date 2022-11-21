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

public final class d implements zri
{
    public final SharedPreferences a;
    public String b;
    public final vbs c;
    private final atnb d;
    private final atnb e;
    private final Executor f;
    private boolean g;
    
    public d(final SharedPreferences a, final atnb e, final atnb d, final Executor f, final com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.d d2, final vbs c) {
        this.b = "";
        this.d = d;
        this.a = a;
        this.c = c;
        if (c.M()) {
            this.b = d2.a;
        }
        this.e = e;
        this.f = f;
    }
    
    public final void a(final String s, final znz znz) {
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
            final adhd adhd = (adhd)this.e.a();
            final vso n = adhd.n();
            ((vls)n).k(vby.b);
            try {
                aknj aknj;
                if ((aknj = ((alfu)adhd.o(n, this.f).get(4L, TimeUnit.SECONDS)).b) == null) {
                    aknj = aknj.a;
                }
                final String c = aknj.c;
                if (!TextUtils.isEmpty((CharSequence)c)) {
                    if (this.c.M()) {
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
        final aefs aefs = (aefs)this.d.a();
        final ahcr builder = aidl.a.createBuilder();
        builder.copyOnWrite();
        final aidl aidl = (aidl)builder.instance;
        aidl.c = n - 1;
        aidl.b |= 0x1;
        final aidl aidl2 = (aidl)builder.build();
        final akps d = akpu.d();
        ((ahcr)d).copyOnWrite();
        akpu.ck((akpu)d.instance, aidl2);
        aefs.bn((akpu)((ahcr)d).build());
    }
}
