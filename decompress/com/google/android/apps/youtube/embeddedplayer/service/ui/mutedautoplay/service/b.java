// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.service;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.protos.youtube.api.innertube.PlayerMutedAutoplayOverlayRendererOuterClass;
import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import com.google.android.apps.youtube.embeddedplayer.service.model.MutedAutoplayState;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.d;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.c;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.e;

public final class b implements thj
{
    public final e a;
    public final c b;
    public a c;
    public aapt d;
    public abll e;
    public anib f;
    public ania g;
    public anic h;
    public final atmj i;
    private final Context j;
    
    public b(final Context j, final e a, final c b, final ema ema, final byte[] array, final byte[] array2) {
        final atmj e = atmj.e();
        this.i = e;
        this.j = j;
        this.a = a;
        this.b = b;
        ((askp)e).aH(new d(ema, 1, null, null));
    }
    
    public final void a(final int n) {
        final atmj i = this.i;
        final anib f = this.f;
        MutedAutoplayState a;
        if (f == null) {
            a = MutedAutoplayState.a;
        }
        else {
            final a c = this.c;
            c.f = f;
            c.d.append(1, (Object)f);
            final SelectableItemKey a2 = c.a;
            final a c2 = this.c;
            final ania g = this.g;
            SelectableItemKey selectableItemKey;
            if (g == null) {
                selectableItemKey = c2.a;
            }
            else {
                c2.d.append(2, (Object)g);
                selectableItemKey = c2.b;
            }
            final a c3 = this.c;
            final anic h = this.h;
            SelectableItemKey selectableItemKey2;
            if (h == null) {
                selectableItemKey2 = c3.a;
            }
            else {
                c3.d.append(3, (Object)h);
                selectableItemKey2 = c3.c;
            }
            final ania g2 = this.g;
            Object o;
            if (g2 != null) {
                ajws ajws;
                if ((g2.b & 0x1) != 0x0) {
                    if ((ajws = g2.c) == null) {
                        ajws = ajws.a;
                    }
                }
                else {
                    ajws = null;
                }
                o = acbu.b(ajws);
            }
            else {
                o = this.j.getString(2132017788);
            }
            final anic h2 = this.h;
            long n2;
            if (h2 != null) {
                n2 = h2.c;
            }
            else {
                n2 = 3000L;
            }
            a = new MutedAutoplayState(a2, selectableItemKey, selectableItemKey2, (CharSequence)o, n2, n);
        }
        i.tt((Object)a);
        if (n == 1) {
            final anib f2 = this.f;
            if (f2 != null) {
                this.a.q(f2.f.I());
            }
        }
        else if (n == 2) {
            final ania g3 = this.g;
            if (g3 != null) {
                this.a.q(g3.d.I());
            }
        }
    }
    
    public final Class[] mr(final Class clazz, final Object o, int ordinal) {
        Class[] array2;
        if (ordinal != -1) {
            final Class[] array = null;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            final StringBuilder sb = new StringBuilder("unsupported op code: ");
                            sb.append(ordinal);
                            throw new IllegalStateException(sb.toString());
                        }
                        final aapt d = (aapt)o;
                        this.d = d;
                        if (!d.e() && d.a() != 7 && d.a() != 4) {
                            if (d.f()) {
                                this.a(1);
                                return null;
                            }
                            array2 = array;
                        }
                        else {
                            this.a(2);
                            array2 = array;
                        }
                    }
                    else {
                        this.c.e = ((aapq)o).e();
                        array2 = array;
                    }
                }
                else {
                    final aapp aapp = (aapp)o;
                    final PlayerResponseModel b = aapp.b();
                    anib f = null;
                    Label_0287: {
                        if (b != null) {
                            final akzi z = b.z();
                            akzc akzc;
                            if ((akzc = z.D) == null) {
                                akzc = akzc.a;
                            }
                            if ((akzc.b & 0x1) != 0x0) {
                                akzc akzc2;
                                if ((akzc2 = z.D) == null) {
                                    akzc2 = akzc.a;
                                }
                                angq angq;
                                if ((angq = akzc2.c) == null) {
                                    angq = angq.a;
                                }
                                anxb anxb;
                                if ((anxb = angq.g) == null) {
                                    anxb = anxb.a;
                                }
                                if (((ahcu)anxb).ry((ahci)PlayerMutedAutoplayOverlayRendererOuterClass.playerMutedAutoplayOverlayRenderer)) {
                                    anxb anxb2;
                                    if ((anxb2 = angq.g) == null) {
                                        anxb2 = anxb.a;
                                    }
                                    f = (anib)((ahcu)anxb2).rx((ahci)PlayerMutedAutoplayOverlayRendererOuterClass.playerMutedAutoplayOverlayRenderer);
                                    break Label_0287;
                                }
                            }
                        }
                        f = null;
                    }
                    this.f = f;
                    ania g = null;
                    Label_0358: {
                        if (f != null) {
                            anxb anxb3;
                            if ((anxb3 = f.e) == null) {
                                anxb3 = anxb.a;
                            }
                            if (((ahcu)anxb3).ry((ahci)PlayerMutedAutoplayOverlayRendererOuterClass.b)) {
                                anxb anxb4;
                                if ((anxb4 = f.e) == null) {
                                    anxb4 = anxb.a;
                                }
                                g = (ania)((ahcu)anxb4).rx((ahci)PlayerMutedAutoplayOverlayRendererOuterClass.b);
                                break Label_0358;
                            }
                        }
                        g = null;
                    }
                    this.g = g;
                    final anib f2 = this.f;
                    anic h = null;
                    Label_0435: {
                        if (f2 != null) {
                            anxb anxb5;
                            if ((anxb5 = f2.d) == null) {
                                anxb5 = anxb.a;
                            }
                            if (((ahcu)anxb5).ry((ahci)PlayerMutedAutoplayOverlayRendererOuterClass.a)) {
                                anxb anxb6;
                                if ((anxb6 = f2.d) == null) {
                                    anxb6 = anxb.a;
                                }
                                h = (anic)((ahcu)anxb6).rx((ahci)PlayerMutedAutoplayOverlayRendererOuterClass.a);
                                break Label_0435;
                            }
                        }
                        h = null;
                    }
                    this.h = h;
                    this.e = aapp.c();
                    final abll a = abll.a;
                    ordinal = this.e.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 2) {
                            switch (ordinal) {
                                default: {
                                    this.a(4);
                                    array2 = array;
                                    return array2;
                                }
                                case 9: {
                                    this.a(2);
                                    array2 = array;
                                    return array2;
                                }
                                case 6:
                                case 7:
                                case 8: {
                                    break;
                                }
                            }
                        }
                        this.a(1);
                        array2 = array;
                    }
                    else {
                        this.d = null;
                        this.e = null;
                        this.f = null;
                        this.c.e = 0L;
                        this.a(4);
                        array2 = array;
                    }
                }
            }
            else {
                array2 = array;
                if (((aapf)o).c() == abli.e) {
                    final aapt d2 = this.d;
                    array2 = array;
                    if (d2 != null) {
                        array2 = array;
                        if (d2.a() == 4) {
                            final abll e = this.e;
                            array2 = array;
                            if (e != null) {
                                if (e != abll.a) {
                                    this.a(2);
                                    return null;
                                }
                                array2 = array;
                            }
                        }
                    }
                }
            }
        }
        else {
            array2 = new Class[] { aapf.class, aapp.class, aapq.class, aapt.class };
        }
        return array2;
    }
}
