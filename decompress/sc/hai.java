import android.app.Dialog;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.voiceover.VoiceoverSeekBar;
import android.view.View;
import java.util.concurrent.Executor;
import j$.util.Optional;
import android.widget.ImageView;
import android.view.View$OnClickListener;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.DialogInterface$OnShowListener;
import android.content.DialogInterface$OnDismissListener;
import android.content.Context;
import android.view.ContextThemeWrapper;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.protos.youtube.api.innertube.ReelEditVideoRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint;
import com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelCameraRendererOuterClass;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hai implements ttg
{
    public final Object a;
    private final int b;
    
    public hai(final haj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hai(final hao a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hai(final hfe a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hai(final hfx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hai(final hig a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hai(final hiu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hai(final hjw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hai(final hlh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hai(final String a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hai(final shd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hai(final she a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hai(final ttg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final Object o) {
        final int b = this.b;
        int n = 5;
        apmd apmd = null;
        final boolean b2 = false;
        final int n2 = 0;
        switch (b) {
            default: {
                ((eul)o).p((she)this.a);
                return;
            }
            case 19: {
                ((eul)o).o((shd)this.a);
                return;
            }
            case 18: {
                final Object a = this.a;
                final Throwable t = (Throwable)o;
                tpe.x(((hlh)a).a, 2132017850, 1);
                return;
            }
            case 17: {
                final Object a2 = this.a;
                final akql akql = (akql)o;
                final hjw hjw = (hjw)a2;
                if (!hjw.c.get()) {
                    if (akql != null && (akql.b & 0x2) != 0x0) {
                        anuv anuv;
                        if ((anuv = akql.d) == null) {
                            anuv = anuv.a;
                        }
                        final ansc ansc = (ansc)anuv.rx((ahaq)ReelCameraRendererOuterClass.reelCameraRenderer);
                        hjw.b.aU((ansc.b & 0x80) == 0x0 || ansc.g);
                        if ((ansc.b & 0x1) != 0x0) {
                            anuv anuv2;
                            if ((anuv2 = ansc.f) == null) {
                                anuv2 = anuv.a;
                            }
                            if (anuv2.ry((ahaq)ConfirmDialogRendererOuterClass.confirmDialogRenderer)) {
                                anuv anuv3;
                                if ((anuv3 = ansc.f) == null) {
                                    anuv3 = anuv.a;
                                }
                                hjw.b.ba((aixf)anuv3.rx((ahaq)ConfirmDialogRendererOuterClass.confirmDialogRenderer));
                            }
                            final int c = ansc.c;
                            apmd apmd2;
                            aopz aopz;
                            if (c == 2) {
                                apmd2 = (apmd)ansc.d;
                                aopz = null;
                            }
                            else if (c == 6) {
                                aopz = (aopz)ansc.d;
                                apmd2 = null;
                            }
                            else {
                                apmd2 = null;
                                aopz = null;
                            }
                            aiqj aiqj;
                            if ((aiqj = ansc.e) == null) {
                                aiqj = aiqj.a;
                            }
                            anuv anuv4;
                            if ((anuv4 = ((ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint)((ahbc)aiqj).rx((ahaq)ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.reelEditVideoEndpoint)).b) == null) {
                                anuv4 = anuv.a;
                            }
                            if ((((ansh)anuv4.rx((ahaq)ReelEditVideoRendererOuterClass.reelEditVideoRenderer)).b & 0x1) != 0x0) {
                                anuv anuv5;
                                if ((anuv5 = ((ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint)((ahbc)aiqj).rx((ahaq)ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.reelEditVideoEndpoint)).b) == null) {
                                    anuv5 = anuv.a;
                                }
                                if ((apmd = ((ansh)anuv5.rx((ahaq)ReelEditVideoRendererOuterClass.reelEditVideoRenderer)).c) == null) {
                                    apmd = apmd.a;
                                }
                            }
                            hjw.b.aL(aopz, apmd2, apmd);
                            hjw.sendMessage(hjw.obtainMessage(1, (Object)aiqj));
                        }
                    }
                }
                return;
            }
            case 16: {
                final Object a3 = this.a;
                final Throwable t2 = (Throwable)o;
                final hjw hjw2 = (hjw)a3;
                if (hjw2.c.get()) {
                    return;
                }
                ttr.d("Failed to get camera info", t2);
                hjw2.sendEmptyMessage(2);
                return;
            }
            case 15: {
                final Object a4 = this.a;
                final uie uie = (uie)o;
                final hiu hiu = (hiu)a4;
                if (!hiu.p(uie) && !hiu.o(uie)) {
                    hiu.q.l((wzz)new wyt(xaa.c(36857)));
                    return;
                }
                ((YouTubeButton)hiu.x.findViewById(2131431017)).setText((CharSequence)hiu.x.getResources().getString(2132019338));
                hiu.q.l((wzz)new wyt(xaa.c(84513)));
                return;
            }
            case 14: {
                final Object a5 = this.a;
                final uie uie2 = (uie)o;
                boolean o2;
                boolean p;
                if (uie2 != null) {
                    final hiu hiu2 = (hiu)a5;
                    o2 = hiu2.o(uie2);
                    p = hiu2.p(uie2);
                }
                else {
                    p = true;
                    o2 = true;
                }
                if (!o2 && !p) {
                    ((hiu)a5).m();
                    return;
                }
                final hiu hiu3 = (hiu)a5;
                hiu3.D = hiu3.u.getContext();
                int e;
                if (hiu3.i.a() == gkv.a) {
                    e = 2132083480;
                }
                else {
                    e = 2132083481;
                }
                hiu3.E = e;
                hiu3.F = new ContextThemeWrapper(hiu3.D, e);
                (hiu3.C = (Dialog)new adts((Context)hiu3.F, hiu3.E)).setCanceledOnTouchOutside(true);
                hiu3.C.setOnDismissListener((DialogInterface$OnDismissListener)new fap(hiu3, 4));
                if (o2) {
                    hiu3.C.setOnShowListener((DialogInterface$OnShowListener)new hiq(hiu3, p));
                    final View inflate = LayoutInflater.from((Context)hiu3.F).inflate(2131625517, (ViewGroup)null);
                    ((YouTubeTextView)inflate.findViewById(2131431769)).e(true);
                    inflate.findViewById(2131431768).setOnClickListener((View$OnClickListener)new hxk(hiu3, p, 1));
                    inflate.findViewById(2131431014).setOnClickListener((View$OnClickListener)new hip(hiu3, 4));
                    inflate.findViewById(2131428234).setOnClickListener((View$OnClickListener)new hip(hiu3, 5));
                    final View viewById = inflate.findViewById(2131431768);
                    int visibility;
                    if (!p) {
                        visibility = 8;
                    }
                    else {
                        visibility = 0;
                    }
                    viewById.setVisibility(visibility);
                    final View viewById2 = inflate.findViewById(2131431014);
                    int visibility2;
                    if (!p) {
                        visibility2 = n2;
                    }
                    else {
                        visibility2 = 8;
                    }
                    viewById2.setVisibility(visibility2);
                    final ImageView imageView = (ImageView)inflate.findViewById(2131431767);
                    final ahbb ahbb = (ahbb)((ahbh)aotp.a).createBuilder();
                    final ahaz builder = ((ahbh)aoto.a).createBuilder();
                    builder.copyOnWrite();
                    final aoto aoto = (aoto)builder.instance;
                    aoto.b |= 0x1;
                    aoto.c = "https://www.gstatic.com/youtube/img/aadc/teen_uploads_mobile_1x.png";
                    builder.copyOnWrite();
                    final aoto aoto2 = (aoto)builder.instance;
                    aoto2.b |= 0x2;
                    aoto2.d = 95;
                    builder.copyOnWrite();
                    final aoto aoto3 = (aoto)builder.instance;
                    aoto3.b |= 0x4;
                    aoto3.e = 95;
                    ahbb.cJ(builder);
                    hiu3.h.g(imageView, (aotp)((ahaz)ahbb).build());
                    hiu3.C.setContentView(inflate);
                }
                else {
                    hiu3.C.setOnShowListener((DialogInterface$OnShowListener)new eyk(hiu3, 5));
                    hiu3.k();
                }
                hiu3.C.show();
                hiu3.q.J(3, (wzz)new wyt(xaa.c(84513)), (alhi)null);
                return;
            }
            case 13: {
                final Object a6 = this.a;
                final uie uie3 = (uie)o;
                if (uie3 != null && !uie3.n) {
                    final hig hig = (hig)a6;
                    apim apim;
                    if ((apim = hig.ar.b().q) == null) {
                        apim = apim.a;
                    }
                    if (apim.b) {
                        hig.am = (hkd)hig.og().f("welcomeFragment");
                        if (hig.am == null) {
                            hig.am = new hkd();
                            hig.am.b = Optional.of((Object)hig.au);
                        }
                        final hkd am = hig.am;
                        am.a = (hkc)a6;
                        hig.aS((br)am, "welcomeFragment");
                        teu.n((aun)a6, hig.at.b((aezf)glc.q, (Executor)afum.a), (ttg)hid.c, (ttg)hid.d);
                        return;
                    }
                }
                final hig hig2 = (hig)a6;
                if (hig2.bf()) {
                    hig2.aY();
                    return;
                }
                hig2.aV();
                return;
            }
            case 12: {
                final Object a7 = this.a;
                final hec hec = (hec)o;
                if (hec != null) {
                    final int c2 = hec.c;
                    if (c2 != 0) {
                        if (c2 != 1) {
                            if (c2 != 2) {
                                if (c2 != 3) {
                                    if (c2 != 4) {
                                        n = 0;
                                    }
                                    else {
                                        n = 6;
                                    }
                                }
                            }
                            else {
                                n = 4;
                            }
                        }
                        else {
                            n = 3;
                        }
                    }
                    else {
                        n = 2;
                    }
                    int n3;
                    if ((n3 = n) == 0) {
                        n3 = 1;
                    }
                    final int n4 = n3 - 2;
                    if (n4 != 1) {
                        if (n4 == 2) {
                            ((hfx)a7).c(true);
                            return;
                        }
                        if (n4 == 3) {
                            ((hfx)a7).c(false);
                        }
                    }
                    else {
                        final hfx hfx = (hfx)a7;
                        final hfw h = hfx.h;
                        if (h != null && hfx.g == null) {
                            h.e();
                            hfx.d();
                        }
                    }
                }
                return;
            }
            case 11: {
                final Object a8 = this.a;
                final Throwable t3 = (Throwable)o;
                if (t3 != null) {
                    final int k = ((hfx)a8).k;
                    String s;
                    if (k == 6) {
                        s = "[ShortsCreation][Android][ClipEdit]";
                    }
                    else if (k == 9) {
                        s = "[ShortsCreation][Android][VideoIngestion]";
                    }
                    else {
                        s = "[ShortsCreation][Android][SegmentImport]";
                    }
                    zlm.c(zll.a, zlk.f, s.concat("Failure to get protoDataStore value."), t3);
                }
                return;
            }
            case 10: {
                final Object a9 = this.a;
                final Throwable t4 = (Throwable)o;
                if (t4 != null) {
                    zlm.c(zll.a, zlk.f, ((String)a9).concat("Failure to unset protoDataStore state."), t4);
                }
                return;
            }
            case 9: {
                final Object a10 = this.a;
                final hfy hfy = (hfy)o;
                if (hfy != null) {
                    final hfe hfe = (hfe)a10;
                    hfy.i(hfe.D.a(), (hfw)new hfa(hfe, 0));
                }
                return;
            }
            case 8: {
                final Object a11 = this.a;
                final hfy hfy2 = (hfy)o;
                if (hfy2 != null) {
                    final mcb i = ((hfe)a11).I;
                    i.getClass();
                    hfy2.e((uta)i.b);
                }
                return;
            }
            case 7: {
                final Object a12 = this.a;
                final hec hec2 = (hec)o;
                final afeq a13 = hcd.a;
                boolean b3 = b2;
                if (hec2 != null) {
                    b3 = b2;
                    if (hec2.b) {
                        b3 = true;
                    }
                }
                ((ttg)a12).a((Object)b3);
                return;
            }
            case 6: {
                final Object a14 = this.a;
                ttr.d("Failed to load PDS", (Throwable)o);
                ((ttg)a14).a((Object)false);
                return;
            }
            case 5: {
                final Object a15 = this.a;
                final uie uie4 = (uie)o;
                if (uie4 != null) {
                    ((hao)a15).i(uie4.p, uie4.s);
                    return;
                }
                ((hao)a15).i(0.0f, 0.0f);
                return;
            }
            case 4: {
                final Object a16 = this.a;
                final Throwable t5 = (Throwable)o;
                ttr.b("EffectsControlInputStateManager load enhance value from data store failed");
                ((hao)a16).i(0.0f, 0.0f);
                return;
            }
            case 3: {
                final Object a17 = this.a;
                final arbo j = (arbo)o;
                final haj haj = (haj)a17;
                final hah h2 = haj.h;
                h2.getClass();
                h2.d = false;
                haj.i = j;
                final VoiceoverSeekBar f = haj.f;
                if (f != null) {
                    f.e = haj.i;
                }
                return;
            }
            case 2: {
                final Object a18 = this.a;
                final Throwable t6 = (Throwable)o;
                final aeyo a19 = aeyo.a;
                t6.getClass();
                final String message = t6.getMessage();
                message.getClass();
                ((haj)a18).i((aezp)a19, message);
                return;
            }
            case 1: {
                final Object a20 = this.a;
                final Throwable t7 = (Throwable)o;
                final haj haj2 = (haj)a20;
                final arbo l = haj2.i;
                Object o3;
                if (l == null) {
                    o3 = aeyo.a;
                }
                else {
                    arbj arbj;
                    if ((arbj = l.d) == null) {
                        arbj = arbj.a;
                    }
                    o3 = aezp.k((Object)(long)arbj.c);
                }
                t7.getClass();
                final String message2 = t7.getMessage();
                message2.getClass();
                haj2.i((aezp)o3, message2);
                haj2.d();
                return;
            }
            case 0: {
                final Object a21 = this.a;
                final Long n5 = (Long)o;
                n5.getClass();
                new StringBuilder("VoiceoverViewCtrlImpl.stopRecord - [onSuccess]: ").append(n5);
                final long longValue = n5;
                final haj haj3 = (haj)a21;
                haj3.f(longValue);
                final hah h3 = haj3.h;
                h3.getClass();
                h3.d = false;
            }
        }
    }
}
