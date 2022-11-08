import com.google.protos.youtube.api.innertube.OfflineabilityRendererOuterClass;
import java.util.Map;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fdf implements vau
{
    public final flg a;
    public final vax b;
    public final eg c;
    private final aagt d;
    private final fml e;
    private final atjj f;
    private final aaam g;
    private final Executor h;
    private final Executor i;
    
    public fdf(final aagt d, final fml e, final atjj f, final aaam g, final Executor h, final Executor i, final flg a, final vax b, final eg c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private final void d(final String s, final boolean b) {
        if (this.e.i()) {
            final zzl e = ((zzu)this.f.a()).a().l().e(s);
            zzk j;
            if (e == null) {
                j = null;
            }
            else {
                j = e.j;
            }
            if (e != null && j != null) {
                this.d.e(j, b);
            }
            return;
        }
        final StringBuilder sb = new StringBuilder("Trying to renew download (id=");
        sb.append(s);
        sb.append(") but user does not have downloads.");
        trn.l(sb.toString());
    }
    
    private final void e(final OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint, final boolean b) {
        final int c = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c;
        if (c != 7) {
            final aagt d = this.d;
            String s;
            if (c == 1) {
                s = (String)offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d;
            }
            else {
                s = "";
            }
            d.c(s, b);
            return;
        }
        this.d.d((String)offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d, b);
    }
    
    private final void f(final int n, String by) {
        final aaam g = this.g;
        final agza builder = amsh.a.createBuilder();
        builder.copyOnWrite();
        final amsh amsh = (amsh)builder.instance;
        amsh.c = 4;
        amsh.b |= 0x1;
        by = gkt.by(by);
        builder.copyOnWrite();
        final amsh amsh2 = (amsh)builder.instance;
        by.getClass();
        amsh2.b |= 0x2;
        amsh2.d = by;
        final agzc agzc = (agzc)((agzi)amsf.b).createBuilder();
        final agzg b = aouu.b;
        final agza builder2 = aouu.a.createBuilder();
        builder2.copyOnWrite();
        final aouu aouu = (aouu)builder2.instance;
        aouu.i = n - 1;
        aouu.c |= 0x200;
        agzc.e((agyr)b, (Object)builder2.build());
        final amsf e = (amsf)((agza)agzc).build();
        builder.copyOnWrite();
        final amsh amsh3 = (amsh)builder.instance;
        e.getClass();
        amsh3.e = e;
        amsh3.b |= 0x4;
        g.a((amsh)builder.build());
    }
    
    public final void c(final Map map, final OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint, String e, final amtq amtq) {
        final iio a = iio.a;
        final amtq a2 = amtq.a;
        final int ordinal = amtq.ordinal();
        String s = "";
        final amqx amqx = null;
        switch (ordinal) {
            default: {
                amtq amtq2;
                if ((amtq2 = amtq.b(offlineVideoEndpointOuterClass$OfflineVideoEndpoint.f)) == null) {
                    amtq2 = amtq.a;
                }
                trn.l("Unsupported Offline Video Action: ".concat(String.valueOf(String.valueOf(amtq2))));
                return;
            }
            case 10: {
                this.d(e, true);
                return;
            }
            case 9: {
                this.d(e, false);
                return;
            }
            case 8: {
                final int c = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c;
                if (c != 7) {
                    final aagt d = this.d;
                    e = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.e;
                    if (c == 1) {
                        s = (String)offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d;
                    }
                    d.n(e, s, (aags)null, true);
                    return;
                }
                this.d.s(offlineVideoEndpointOuterClass$OfflineVideoEndpoint.e, (String)offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d);
                return;
            }
            case 6: {
                if (this.e.i()) {
                    try {
                        this.f(3, e);
                        return;
                    }
                    catch (final aaan aaan) {
                        trn.b("Couldn't resume: ".concat(aaan.toString()));
                        return;
                    }
                }
                final StringBuilder sb = new StringBuilder("Trying to resume download (id=");
                sb.append(e);
                sb.append(") but user does not have downloads.");
                trn.l(sb.toString());
                return;
            }
            case 5: {
                this.d.r();
                return;
            }
            case 4: {
                if (this.e.i()) {
                    try {
                        this.f(2, e);
                        return;
                    }
                    catch (final aaan aaan2) {
                        trn.b("Couldn't pause: ".concat(aaan2.toString()));
                        return;
                    }
                }
                final StringBuilder sb2 = new StringBuilder("Trying to pause download (id=");
                sb2.append(e);
                sb2.append(") but user does not have downloads");
                trn.l(sb2.toString());
                return;
            }
            case 3: {
                this.e(offlineVideoEndpointOuterClass$OfflineVideoEndpoint, true);
                return;
            }
            case 2: {
                this.e(offlineVideoEndpointOuterClass$OfflineVideoEndpoint, false);
                return;
            }
            case 1: {
                final Object m = tmy.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag");
                final int b = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.b;
                if ((b & 0x80) != 0x0) {
                    final vax b2 = this.b;
                    aioe aioe;
                    if ((aioe = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.i) == null) {
                        aioe = aioe.a;
                    }
                    b2.a(aioe);
                    return;
                }
                amva amva;
                if ((b & 0x20) != 0x0) {
                    anss anss;
                    if ((anss = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.g) == null) {
                        anss = anss.a;
                    }
                    amva = (amva)((agzd)anss).rr((agyr)OfflineabilityRendererOuterClass.offlineabilityRenderer);
                }
                else {
                    amva = null;
                }
                amva amva2 = amva;
                Label_1107: {
                    if (amva == null) {
                        if (m instanceof aiuh) {
                            final aiuh aiuh = (aiuh)m;
                            aiug aiug;
                            if ((aiug = aiuh.s) == null) {
                                aiug = aiug.a;
                            }
                            if ((aiug.b & 0x1) != 0x0) {
                                aiug aiug2;
                                if ((aiug2 = aiuh.s) == null) {
                                    aiug2 = aiug.a;
                                }
                                if ((amva2 = aiug2.c) == null) {
                                    amva2 = amva.a;
                                }
                                break Label_1107;
                            }
                        }
                        else if (m instanceof anhb) {
                            final anhb anhb = (anhb)m;
                            anha anha;
                            if ((anha = anhb.v) == null) {
                                anha = anha.a;
                            }
                            if (anha.b == 60572968) {
                                anha anha2;
                                if ((anha2 = anhb.v) == null) {
                                    anha2 = anha.a;
                                }
                                if (anha2.b == 60572968) {
                                    amva2 = (amva)anha2.c;
                                    break Label_1107;
                                }
                                amva2 = amva.a;
                                break Label_1107;
                            }
                        }
                        else if (m instanceof ajxs) {
                            final ajxs ajxs = (ajxs)m;
                            ajxr ajxr;
                            if ((ajxr = ajxs.t) == null) {
                                ajxr = ajxr.a;
                            }
                            if ((ajxr.b & 0x1) != 0x0) {
                                ajxr ajxr2;
                                if ((ajxr2 = ajxs.t) == null) {
                                    ajxr2 = ajxr.a;
                                }
                                if ((amva2 = ajxr2.c) == null) {
                                    amva2 = amva.a;
                                }
                                break Label_1107;
                            }
                        }
                        else if (m instanceof anip) {
                            final anip anip = (anip)m;
                            anio anio;
                            if ((anio = anip.r) == null) {
                                anio = anio.a;
                            }
                            if ((anio.b & 0x1) != 0x0) {
                                anio anio2;
                                if ((anio2 = anip.r) == null) {
                                    anio2 = anio.a;
                                }
                                if ((amva2 = anio2.c) == null) {
                                    amva2 = amva.a;
                                }
                                break Label_1107;
                            }
                        }
                        else if (m instanceof apmz) {
                            final apmz apmz = (apmz)m;
                            if ((apmz.b & 0x400) != 0x0) {
                                apmy apmy;
                                if ((apmy = apmz.m) == null) {
                                    apmy = apmy.a;
                                }
                                if ((amva2 = apmy.b) == null) {
                                    amva2 = amva.a;
                                }
                                break Label_1107;
                            }
                        }
                        else if (m instanceof apmc) {
                            final apmc apmc = (apmc)m;
                            apmb apmb;
                            if ((apmb = apmc.u) == null) {
                                apmb = apmb.a;
                            }
                            if ((apmb.b & 0x1) != 0x0) {
                                apmb apmb2;
                                if ((apmb2 = apmc.u) == null) {
                                    apmb2 = apmb.a;
                                }
                                if ((amva2 = apmb2.c) == null) {
                                    amva2 = amva.a;
                                }
                                break Label_1107;
                            }
                        }
                        else if (m instanceof hys) {
                            final hys hys = (hys)m;
                            apmb apmb3;
                            if ((apmb3 = hys.a().u) == null) {
                                apmb3 = apmb.a;
                            }
                            if ((apmb3.b & 0x1) != 0x0) {
                                apmb apmb4;
                                if ((apmb4 = hys.a().u) == null) {
                                    apmb4 = apmb.a;
                                }
                                if ((amva2 = apmb4.c) == null) {
                                    amva2 = amva.a;
                                }
                                break Label_1107;
                            }
                        }
                        else if (m instanceof apil) {
                            final apil apil = (apil)m;
                            apik apik;
                            if ((apik = apil.n) == null) {
                                apik = apik.a;
                            }
                            if (apik.b == 60572968) {
                                apik apik2;
                                if ((apik2 = apil.n) == null) {
                                    apik2 = apik.a;
                                }
                                if (apik2.b == 60572968) {
                                    amva2 = (amva)apik2.c;
                                    break Label_1107;
                                }
                                amva2 = amva.a;
                                break Label_1107;
                            }
                        }
                        amva2 = null;
                    }
                }
                if (amva2 == null) {
                    trn.b("Object is not an offlineable video: ".concat(String.valueOf(String.valueOf(m))));
                    return;
                }
                final wwv wwv = (wwv)tmy.O(map, (Object)"com.google.android.libraries.youtube.logging.interaction_logger", (Class)wwv.class);
                amqx amqx2 = amqx;
                if ((offlineVideoEndpointOuterClass$OfflineVideoEndpoint.b & 0x40) != 0x0 && (amqx2 = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.h) == null) {
                    amqx2 = amqx.a;
                }
                final int c2 = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c;
                if (c2 != 7) {
                    final aagt d2 = this.d;
                    if (c2 == 1) {
                        s = (String)offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d;
                    }
                    d2.o(s, amva2, (aags)null, wwv, amqx2);
                    return;
                }
                this.d.t((String)offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d, amva2, wwv, amqx2);
            }
        }
    }
    
    public final void mE(final aioe aioe, final Map map) {
        final OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint)((agzd)aioe).rr((agyr)OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint);
        final int c = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c;
        String i;
        if (c == 1) {
            i = (String)offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d;
        }
        else {
            String s;
            if (c == 7) {
                s = (String)offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d;
            }
            else {
                s = "";
            }
            i = vek.i(s);
        }
        amtq amtq;
        if ((amtq = amtq.b(offlineVideoEndpointOuterClass$OfflineVideoEndpoint.f)) == null) {
            amtq = amtq.a;
        }
        if (amtq == amtq.l) {
            tcp.k(afld.l((afrx)new fdq(this, i, 1), this.i), this.h, (tcn)etg.f, (tco)new fdd(this, offlineVideoEndpointOuterClass$OfflineVideoEndpoint, map, i, 0));
            return;
        }
        this.c(map, offlineVideoEndpointOuterClass$OfflineVideoEndpoint, i, amtq);
    }
}
