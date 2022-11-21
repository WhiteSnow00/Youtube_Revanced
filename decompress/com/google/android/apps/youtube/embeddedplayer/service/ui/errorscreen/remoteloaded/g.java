// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded;

import java.util.function.Consumer;
import android.os.Handler;
import android.content.Context;
import android.text.Spanned;
import j$.util.Optional;

public final class g implements c
{
    public final b a;
    public final veh b;
    private final Optional c;
    private anhd d;
    
    public g(final b a, final Optional c, final veh b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    private final Spanned c(final ajws ajws) {
        Optional optional;
        if (this.b != null) {
            optional = Optional.of((Object)new e(this, vem.a(true), 0));
        }
        else {
            optional = Optional.empty();
        }
        if (optional.isPresent()) {
            return acbu.c(ajws, (acbp)optional.get());
        }
        return acbu.s((Context)null, ajws, 0, (acbp)null, (acbr)null);
    }
    
    private final void d(final Runnable runnable) {
        if (this.c.isPresent()) {
            ((Handler)this.c.get()).post(runnable);
            return;
        }
        runnable.run();
    }
    
    @Override
    public final void a() {
        this.d(new f(this.a, 1));
    }
    
    @Override
    public final void b(final akyz akyz, final boolean c, final Optional optional) {
        final b a = this.a;
        a.b = "";
        a.c = false;
        a.a = null;
        a.e = null;
        akyy akyy;
        if ((akyy = akyz.g) == null) {
            akyy = akyy.a;
        }
        anhd a2;
        if (akyy.b == 58356580) {
            a2 = (anhd)akyy.c;
        }
        else {
            a2 = anhd.a;
        }
        if ((a2.b & 0x8) != 0x0) {
            aftr.k("Watch-on-YouTube button is filled. Setting canRetry to false");
            this.a.c = false;
        }
        else {
            this.a.c = c;
        }
        optional.ifPresent((Consumer)new llr(this, 9));
        final akyy g = akyz.g;
        akyy a3;
        if (g == null) {
            a3 = akyy.a;
        }
        else {
            a3 = g;
        }
        Label_0567: {
            if (a3.b == 58356580) {
                akyy a4;
                if ((a4 = g) == null) {
                    a4 = akyy.a;
                }
                anhd a5;
                if (a4.b == 58356580) {
                    a5 = (anhd)a4.c;
                }
                else {
                    a5 = anhd.a;
                }
                this.d = a5;
                if (a5 != null) {
                    final b a6 = this.a;
                    ajws ajws;
                    if ((ajws = a5.c) == null) {
                        ajws = ajws.a;
                    }
                    a6.b = (CharSequence)this.c(ajws);
                    final anhd d = this.d;
                    if (d != null) {
                        aiet aiet;
                        if ((aiet = d.e) == null) {
                            aiet = aiet.a;
                        }
                        if ((aiet.b & 0x1) != 0x0) {
                            aiet aiet2;
                            if ((aiet2 = this.d.e) == null) {
                                aiet2 = aiet.a;
                            }
                            aies aies;
                            if ((aies = aiet2.c) == null) {
                                aies = aies.a;
                            }
                            if ((aies.b & 0x10000) != 0x0) {
                                final ajws i = aies.i;
                                ajws a7;
                                if (i == null) {
                                    a7 = ajws.a;
                                }
                                else {
                                    a7 = i;
                                }
                                if ((a7.b & 0x1) != 0x0) {
                                    final b a8 = this.a;
                                    ajws a9;
                                    if ((a9 = i) == null) {
                                        a9 = ajws.a;
                                    }
                                    adme.K(0x1 == (a9.b & 0x1));
                                    ajws ajws2;
                                    if ((ajws2 = aies.i) == null) {
                                        ajws2 = ajws.a;
                                    }
                                    final String d2 = ajws2.d;
                                    aisc m;
                                    if ((m = aies.p) == null) {
                                        m = aisc.a;
                                    }
                                    final ahct ahct = (ahct)((ahcz)ajwu.a).createBuilder();
                                    ((ahcr)ahct).copyOnWrite();
                                    final ajwu ajwu = (ajwu)ahct.instance;
                                    d2.getClass();
                                    ajwu.b |= 0x1;
                                    ajwu.c = d2;
                                    ((ahcr)ahct).copyOnWrite();
                                    final ajwu ajwu2 = (ajwu)ahct.instance;
                                    m.getClass();
                                    ajwu2.m = m;
                                    ajwu2.b |= 0x400;
                                    final ajwu ajwu3 = (ajwu)((ahcr)ahct).build();
                                    final ahct ahct2 = (ahct)((ahcz)ajws.a).createBuilder();
                                    ahct2.i(ajwu3);
                                    a8.a = this.c((ajws)((ahcr)ahct2).build());
                                    break Label_0567;
                                }
                            }
                            aftr.l("Error UI not filled with link to YouTube app");
                        }
                    }
                }
            }
            else {
                this.a.b = akyz.d;
            }
        }
        this.d(new f(this.a, 0));
    }
}
