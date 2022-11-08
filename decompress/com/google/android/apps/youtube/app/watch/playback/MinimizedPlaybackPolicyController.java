// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.watch.playback;

import java.util.Map;
import app.revanced.integrations.patches.MinimizedPlaybackPatch;
import com.google.protos.youtube.api.innertube.MiniplayerRendererOuterClass;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

public class MinimizedPlaybackPolicyController implements tff, fjo, tec
{
    public amgd a;
    public int b;
    public fkk c;
    private final tdz d;
    private final fjp e;
    private final vax f;
    private final ktf g;
    private final abno h;
    private boolean i;
    
    public MinimizedPlaybackPolicyController(final tdz d, final fjp e, final vax f, final ktf g, final abno h) {
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public static amgd j(final PlayerResponseModel playerResponseModel) {
        if (playerResponseModel == null) {
            return null;
        }
        final akve z = playerResponseModel.z();
        if (z != null) {
            akuv akuv;
            if ((akuv = z.f) == null) {
                akuv = akuv.a;
            }
            if ((akuv.b & 0x400) != 0x0) {
                akuv akuv2;
                if ((akuv2 = z.f) == null) {
                    akuv2 = akuv.a;
                }
                anss anss;
                if ((anss = akuv2.i) == null) {
                    anss = anss.a;
                }
                if (((agzd)anss).rs((agyr)MiniplayerRendererOuterClass.miniplayerRenderer)) {
                    akuv akuv3;
                    if ((akuv3 = z.f) == null) {
                        akuv3 = akuv.a;
                    }
                    anss anss2;
                    if ((anss2 = akuv3.i) == null) {
                        anss2 = anss.a;
                    }
                    return (amgd)((agzd)anss2).rr((agyr)MiniplayerRendererOuterClass.miniplayerRenderer);
                }
            }
        }
        return null;
    }
    
    public final void k(final int n, final fkk fkk, final amgd amgd) {
        if (MinimizedPlaybackPatch.isMinimizedPlaybackEnabled()) {
            return;
        }
        if (fkk == null || fkk == fkk.a) {
            this.i = false;
        }
        if (amgd != null) {
            final int ce = aqql.cE(amgd.b);
            if (ce != 0) {
                if (ce == 5 && n == 2 && fkk == fkk.c) {
                    if (this.b == 3 && this.c == fkk.c) {
                        this.g.s();
                        return;
                    }
                    this.h.a();
                    if (!this.i) {
                        final vax f = this.f;
                        aioe aioe;
                        if ((aioe = amgd.c) == null) {
                            aioe = aioe.a;
                        }
                        f.c(aioe, (Map)null);
                        this.i = true;
                    }
                }
            }
        }
    }
    
    public final void mM(final aum aum) {
        this.d.m((Object)this);
        this.e.n((fjo)this);
    }
    
    public final void mq(final aum aum) {
        this.d.g((Object)this);
        this.e.l((fjo)this);
        final abtt q = this.h.q();
        if (q != null) {
            this.a = j(q.d());
            int b;
            if (!this.h.f()) {
                b = 0;
            }
            else {
                b = 2;
            }
            this.b = b;
            this.c = this.e.j();
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, int b) {
        Class[] array2;
        if (b != -1) {
            final Class[] array = null;
            if (b != 0) {
                if (b == 1) {
                    final int a = ((aamc)o).a();
                    if ((b = a) != 2) {
                        array2 = array;
                        if (a != 3) {
                            return array2;
                        }
                        b = 3;
                    }
                    this.k(b, this.c, this.a);
                    this.b = b;
                    return null;
                }
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(b);
                throw new IllegalStateException(sb.toString());
            }
            else {
                final aaly aaly = (aaly)o;
                amgd j;
                if (aaly.c() == abim.a) {
                    j = null;
                }
                else {
                    j = j(aaly.b());
                }
                this.k(this.b, this.c, j);
                this.a = j;
                array2 = array;
            }
        }
        else {
            array2 = new Class[] { aaly.class, aamc.class };
        }
        return array2;
    }
    
    public final void oK(final fkk c) {
        this.k(this.b, c, this.a);
        this.c = c;
    }
}
