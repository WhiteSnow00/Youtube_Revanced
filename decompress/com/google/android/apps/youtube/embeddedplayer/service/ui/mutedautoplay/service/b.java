// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.service;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.protos.youtube.api.innertube.PlayerMutedAutoplayOverlayRendererOuterClass;
import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import com.google.android.apps.youtube.embeddedplayer.service.model.MutedAutoplayState;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.k;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.c;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.e;

public final class b implements tgg
{
    public final e a;
    public final c b;
    public a c;
    public aanw d;
    public abke e;
    public anfu f;
    public anft g;
    public anfv h;
    public final atjm i;
    private final Context j;
    
    public b(final Context j, final e a, final c b, final elx elx, final byte[] array, final byte[] array2, final byte[] array3) {
        final atjm e = atjm.e();
        this.i = e;
        this.j = j;
        this.a = a;
        this.b = b;
        ((asht)e).aH((asjm)new k(elx, 17, (byte[])null, (byte[])null, (byte[])null));
    }
    
    public final void a(final int n) {
        final atjm i = this.i;
        final anfu f = this.f;
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
            final anft g = this.g;
            SelectableItemKey selectableItemKey;
            if (g == null) {
                selectableItemKey = c2.a;
            }
            else {
                c2.d.append(2, (Object)g);
                selectableItemKey = c2.b;
            }
            final a c3 = this.c;
            final anfv h = this.h;
            SelectableItemKey selectableItemKey2;
            if (h == null) {
                selectableItemKey2 = c3.a;
            }
            else {
                c3.d.append(3, (Object)h);
                selectableItemKey2 = c3.c;
            }
            final anft g2 = this.g;
            Object o;
            if (g2 != null) {
                ajut ajut;
                if ((g2.b & 0x1) != 0x0) {
                    if ((ajut = g2.c) == null) {
                        ajut = ajut.a;
                    }
                }
                else {
                    ajut = null;
                }
                o = acak.b(ajut);
            }
            else {
                o = this.j.getString(2132017788);
            }
            final anfv h2 = this.h;
            long n2;
            if (h2 != null) {
                n2 = h2.c;
            }
            else {
                n2 = 3000L;
            }
            a = new MutedAutoplayState(a2, selectableItemKey, selectableItemKey2, (CharSequence)o, n2, n);
        }
        i.tu((Object)a);
        if (n == 1) {
            final anfu f2 = this.f;
            if (f2 != null) {
                this.a.q(f2.f.I());
            }
        }
        else if (n == 2) {
            final anft g3 = this.g;
            if (g3 != null) {
                this.a.q(g3.d.I());
            }
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, int ordinal) {
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
                        final aanw d = (aanw)o;
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
                        this.c.e = ((aant)o).e();
                        array2 = array;
                    }
                }
                else {
                    final aans aans = (aans)o;
                    final PlayerResponseModel b = aans.b();
                    anfu f = null;
                    Label_0287: {
                        if (b != null) {
                            final akxi z = b.z();
                            akxc akxc;
                            if ((akxc = z.D) == null) {
                                akxc = akxc.a;
                            }
                            if ((akxc.b & 0x1) != 0x0) {
                                akxc akxc2;
                                if ((akxc2 = z.D) == null) {
                                    akxc2 = akxc.a;
                                }
                                anej anej;
                                if ((anej = akxc2.c) == null) {
                                    anej = anej.a;
                                }
                                anuv anuv;
                                if ((anuv = anej.g) == null) {
                                    anuv = anuv.a;
                                }
                                if (anuv.ry((ahaq)PlayerMutedAutoplayOverlayRendererOuterClass.playerMutedAutoplayOverlayRenderer)) {
                                    anuv anuv2;
                                    if ((anuv2 = anej.g) == null) {
                                        anuv2 = anuv.a;
                                    }
                                    f = (anfu)anuv2.rx((ahaq)PlayerMutedAutoplayOverlayRendererOuterClass.playerMutedAutoplayOverlayRenderer);
                                    break Label_0287;
                                }
                            }
                        }
                        f = null;
                    }
                    this.f = f;
                    anft g = null;
                    Label_0358: {
                        if (f != null) {
                            anuv anuv3;
                            if ((anuv3 = f.e) == null) {
                                anuv3 = anuv.a;
                            }
                            if (anuv3.ry((ahaq)PlayerMutedAutoplayOverlayRendererOuterClass.b)) {
                                anuv anuv4;
                                if ((anuv4 = f.e) == null) {
                                    anuv4 = anuv.a;
                                }
                                g = (anft)anuv4.rx((ahaq)PlayerMutedAutoplayOverlayRendererOuterClass.b);
                                break Label_0358;
                            }
                        }
                        g = null;
                    }
                    this.g = g;
                    final anfu f2 = this.f;
                    anfv h = null;
                    Label_0435: {
                        if (f2 != null) {
                            anuv anuv5;
                            if ((anuv5 = f2.d) == null) {
                                anuv5 = anuv.a;
                            }
                            if (anuv5.ry((ahaq)PlayerMutedAutoplayOverlayRendererOuterClass.a)) {
                                anuv anuv6;
                                if ((anuv6 = f2.d) == null) {
                                    anuv6 = anuv.a;
                                }
                                h = (anfv)anuv6.rx((ahaq)PlayerMutedAutoplayOverlayRendererOuterClass.a);
                                break Label_0435;
                            }
                        }
                        h = null;
                    }
                    this.h = h;
                    this.e = aans.c();
                    final abke a = abke.a;
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
                if (((aani)o).c() == abkb.e) {
                    final aanw d2 = this.d;
                    array2 = array;
                    if (d2 != null) {
                        array2 = array;
                        if (d2.a() == 4) {
                            final abke e = this.e;
                            array2 = array;
                            if (e != null) {
                                if (e != abke.a) {
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
            array2 = new Class[] { aani.class, aans.class, aant.class, aanw.class };
        }
        return array2;
    }
}
