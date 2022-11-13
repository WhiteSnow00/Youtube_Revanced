// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded;

import java.util.function.Consumer;
import android.os.Handler;
import android.content.Context;
import android.text.Spanned;
import j$.util.Optional;

public final class f implements c
{
    public final b a;
    public final vcy b;
    private final Optional c;
    private anew d;
    
    public f(final b a, final Optional c, final vcy b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    private final Spanned c(final ajut ajut) {
        Optional optional;
        if (this.b != null) {
            optional = Optional.of((Object)new e(this, vdd.a(true), 0));
        }
        else {
            optional = Optional.empty();
        }
        if (optional.isPresent()) {
            return acak.c(ajut, (acaf)optional.get());
        }
        return acak.s((Context)null, ajut, 0, (acaf)null, (acah)null);
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
        this.d(new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.e(this.a, 2));
    }
    
    @Override
    public final void b(final akwz akwz, final boolean c, final Optional optional) {
        final b a = this.a;
        a.b = "";
        final boolean b = false;
        a.c = false;
        a.a = null;
        a.e = null;
        akwy akwy;
        if ((akwy = akwz.g) == null) {
            akwy = akwy.a;
        }
        anew a2;
        if (akwy.b == 58356580) {
            a2 = (anew)akwy.c;
        }
        else {
            a2 = anew.a;
        }
        if ((a2.b & 0x8) != 0x0) {
            afse.o("Watch-on-YouTube button is filled. Setting canRetry to false");
            this.a.c = false;
        }
        else {
            this.a.c = c;
        }
        optional.ifPresent((Consumer)new llh(this, 8));
        final akwy g = akwz.g;
        akwy a3;
        if (g == null) {
            a3 = akwy.a;
        }
        else {
            a3 = g;
        }
        Label_0571: {
            if (a3.b == 58356580) {
                akwy a4;
                if ((a4 = g) == null) {
                    a4 = akwy.a;
                }
                anew a5;
                if (a4.b == 58356580) {
                    a5 = (anew)a4.c;
                }
                else {
                    a5 = anew.a;
                }
                this.d = a5;
                if (a5 != null) {
                    final b a6 = this.a;
                    ajut ajut;
                    if ((ajut = a5.c) == null) {
                        ajut = ajut.a;
                    }
                    a6.b = (CharSequence)this.c(ajut);
                    final anew d = this.d;
                    if (d != null) {
                        aida aida;
                        if ((aida = d.e) == null) {
                            aida = aida.a;
                        }
                        if ((aida.b & 0x1) != 0x0) {
                            aida aida2;
                            if ((aida2 = this.d.e) == null) {
                                aida2 = aida.a;
                            }
                            aicz aicz;
                            if ((aicz = aida2.c) == null) {
                                aicz = aicz.a;
                            }
                            if ((aicz.b & 0x10000) != 0x0) {
                                final ajut i = aicz.i;
                                ajut a7;
                                if (i == null) {
                                    a7 = ajut.a;
                                }
                                else {
                                    a7 = i;
                                }
                                if ((a7.b & 0x1) != 0x0) {
                                    final b a8 = this.a;
                                    ajut a9;
                                    if ((a9 = i) == null) {
                                        a9 = ajut.a;
                                    }
                                    adkp.H(0x1 == (a9.b & 0x1) || b);
                                    ajut ajut2;
                                    if ((ajut2 = aicz.i) == null) {
                                        ajut2 = ajut.a;
                                    }
                                    final String d2 = ajut2.d;
                                    aiqj m;
                                    if ((m = aicz.p) == null) {
                                        m = aiqj.a;
                                    }
                                    final ahbb ahbb = (ahbb)((ahbh)ajuv.a).createBuilder();
                                    ((ahaz)ahbb).copyOnWrite();
                                    final ajuv ajuv = (ajuv)ahbb.instance;
                                    d2.getClass();
                                    ajuv.b |= 0x1;
                                    ajuv.c = d2;
                                    ((ahaz)ahbb).copyOnWrite();
                                    final ajuv ajuv2 = (ajuv)ahbb.instance;
                                    m.getClass();
                                    ajuv2.m = m;
                                    ajuv2.b |= 0x400;
                                    final ajuv ajuv3 = (ajuv)((ahaz)ahbb).build();
                                    final ahbb ahbb2 = (ahbb)((ahbh)ajut.a).createBuilder();
                                    ahbb2.i(ajuv3);
                                    a8.a = this.c((ajut)((ahaz)ahbb2).build());
                                    break Label_0571;
                                }
                            }
                            afse.p("Error UI not filled with link to YouTube app");
                        }
                    }
                }
            }
            else {
                this.a.b = akwz.d;
            }
        }
        this.d(new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.e(this.a, 3));
    }
}
