import java.util.Iterator;
import com.google.android.libraries.lens.sdk.intent.LensImage;
import com.google.android.apps.youtube.app.extensions.lens.OpenLensForFrameController;
import com.google.protos.youtube.api.innertube.SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand;
import com.google.protos.youtube.api.innertube.ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand;
import com.google.protos.youtube.api.innertube.LightweightCameraEndpointOuterClass$LightweightCameraEndpoint;
import android.os.Parcelable;
import android.os.Bundle;
import com.google.protos.youtube.api.innertube.ReelEditVideoRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import com.google.protos.youtube.api.innertube.DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand;
import android.content.Intent;
import j$.util.Optional;
import com.google.protos.youtube.api.innertube.DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand;
import java.util.function.Consumer;
import com.google.protos.youtube.api.innertube.SectionListRendererOuterClass;
import com.google.protos.youtube.api.innertube.ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand;
import java.util.Collection;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.ArrayList;
import com.google.protos.youtube.api.innertube.HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction;
import com.google.protos.youtube.api.innertube.ShowContentPillActionOuterClass$ShowContentPillAction;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gvh implements vcv
{
    public static final int a = 0;
    private final int b;
    private final Object c;
    
    public gvh(final abrj c, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.c = c;
    }
    
    public gvh(final Context c, final int b) {
        this.b = b;
        this.c = c;
    }
    
    public gvh(final atke c, final int b) {
        this.b = b;
        this.c = c;
    }
    
    public gvh(final bu c, final int b) {
        this.b = b;
        this.c = c;
    }
    
    public gvh(final cyb c, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.c = c;
    }
    
    public gvh(final fzw c, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.c = c;
    }
    
    public gvh(final gdh c, final int b) {
        this.b = b;
        this.c = c;
    }
    
    public gvh(final heo c, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.c = c;
    }
    
    public gvh(final hmd c, final int b) {
        this.b = b;
        this.c = c;
    }
    
    public gvh(final hmg c, final int b) {
        this.b = b;
        this.c = c;
    }
    
    public gvh(final hof c, final int b) {
        this.b = b;
        this.c = c;
    }
    
    public gvh(final hsp c, final int b) {
        this.b = b;
        this.c = c;
    }
    
    public gvh(final hsq c, final int b) {
        this.b = b;
        this.c = c;
    }
    
    public gvh(final htp c, final int b) {
        this.b = b;
        this.c = c;
    }
    
    public gvh(final huc c, final int b) {
        this.b = b;
        this.c = c;
    }
    
    public gvh(final uwx c, final int b) {
        this.b = b;
        this.c = c;
    }
    
    public final void mE(aiqj aiqj, final Map map) {
        final int b = this.b;
        final anyv anyv = null;
        final String s = null;
        switch (b) {
            default: {
                aoga aoga;
                if ((aoga = ((ShowContentPillActionOuterClass$ShowContentPillAction)((ahbc)aiqj).rx((ahaq)ShowContentPillActionOuterClass$ShowContentPillAction.showContentPillAction)).c) == null) {
                    aoga = aoga.a;
                }
                if (aoga.b == 127508420 && ((gdh)this.c).g()) {
                    final Object c = this.c;
                    aiyd a;
                    if (aoga.b == 127508420) {
                        a = (aiyd)aoga.c;
                    }
                    else {
                        a = aiyd.a;
                    }
                    ((gdh)this.c).i(((gdh)c).j(a), true);
                }
                return;
            }
            case 19: {
                ((heo)this.c).s(((RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction)((ahbc)aiqj).rx((ahaq)RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction.recordUserEventTokenAction)).b);
                return;
            }
            case 18: {
                if ((((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint)((ahbc)aiqj).rx((ahaq)ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)).b & 0x4) != 0x0) {
                    ((abrj)this.c).Y(aiqj);
                    return;
                }
                throw new IllegalArgumentException("Only Global Commands are supported right now.");
            }
            case 17: {
                final amid amid = (amid)((ahbc)aiqj).rx((ahaq)amid.b);
                akui a2;
                if (amid.c == 1) {
                    a2 = (akui)amid.d;
                }
                else {
                    a2 = akui.a;
                }
                ((huc)this.c).y(((ahbh)a2).toBuilder());
                return;
            }
            case 16: {
                final HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint = (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint)((ahbc)aiqj).rx((ahaq)HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.hideEngagementPanelEndpoint);
                String a3 = s;
                if (((ahbc)aiqj).ry((ahaq)HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.hideEngagementPanelEndpoint)) {
                    a3 = vdh.A(hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint);
                }
                if (!aezr.f(a3)) {
                    uve a4;
                    if (hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.g) {
                        a4 = (uve)((uwx)this.c).b().aM();
                    }
                    else {
                        final Object c2 = this.c;
                        ajpl a5;
                        if (hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c == 4) {
                            a5 = (ajpl)hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.d;
                        }
                        else {
                            a5 = ajpl.a;
                        }
                        ajpk ajpk;
                        if ((ajpk = ajpk.b(a5.c)) == null) {
                            ajpk = ajpk.a;
                        }
                        a4 = ((uwx)c2).a(ajpk);
                    }
                    if (!a4.x(hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint)) {
                        a3.getClass();
                        a4.l((aezs)new etr(a3, 7));
                    }
                }
                return;
            }
            case 15: {
                adkp.H(((ahbc)aiqj).ry((ahaq)ajli.b));
                final ajli ajli = (ajli)((ahbc)aiqj).rx((ahaq)ajli.b);
                if ((ajli.c & 0x8) != 0x0) {
                    anuv anuv;
                    if ((anuv = ajli.f) == null) {
                        anuv = anuv.a;
                    }
                    if (anuv.ry((ahaq)amcp.a)) {
                        ((htp)this.c).f(ajli);
                    }
                }
                return;
            }
            case 14: {
                adkp.H(((ahbc)aiqj).ry((ahaq)aolk.b));
                final aolk aolk = (aolk)((ahbc)aiqj).rx((ahaq)aolk.b);
                final int c3 = aolk.c;
                adkp.H((c3 & 0x2) != 0x0 && (c3 & 0x1) != 0x0);
                final Object c4 = this.c;
                final String e = aolk.e;
                int be;
                if ((be = aqsx.be(aolk.d)) == 0) {
                    be = 1;
                }
                final kmi w = ((fzw)c4).W(e);
                if (be == 2) {
                    w.b = true;
                    return;
                }
                if (be == 3) {
                    w.b = false;
                }
                return;
            }
            case 13: {
                adkp.H(((ahbc)aiqj).ry((ahaq)aolf.b));
                final aolf aolf = (aolf)((ahbc)aiqj).rx((ahaq)aolf.b);
                final ahbx c5 = aolf.c;
                final Object c6 = this.c;
                final String d = aolf.d;
                final fzw fzw = (fzw)c6;
                if (((Map)fzw.b).containsKey(d)) {
                    return;
                }
                final ArrayList list = new ArrayList();
                for (final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint : c5) {
                    if (fzw.O(reelWatchEndpointOuterClass$ReelWatchEndpoint)) {
                        list.add(reelWatchEndpointOuterClass$ReelWatchEndpoint.f);
                    }
                }
                ((Map<String, afeq>)fzw.b).put(d, afeq.o((Collection)list));
                return;
            }
            case 12: {
                if (((ahbc)aiqj).ry((ahaq)ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.showReelsCommentsOverlayCommand)) {
                    anyv anyv2 = anyv;
                    if (((ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand)((ahbc)aiqj).rx((ahaq)ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.showReelsCommentsOverlayCommand)).b == 1) {
                        final ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand showReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand = (ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand)((ahbc)aiqj).rx((ahaq)ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.showReelsCommentsOverlayCommand);
                        anuv a6;
                        if (showReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.b == 1) {
                            a6 = (anuv)showReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.c;
                        }
                        else {
                            a6 = anuv.a;
                        }
                        anyv2 = (anyv)a6.rx((ahaq)SectionListRendererOuterClass.sectionListRenderer);
                    }
                    final hmd hmd = (hmd)this.c;
                    if (!hmd.h.ar()) {
                        if (hmd.i == null) {
                            hmd.f.A(hmd.e.pF());
                            ((acns)hmd.g).i();
                            hmd.d.e();
                            ((acns)hmd.g).N(new vgu(anyv2));
                            (hmd.i = hmd.a.getSupportFragmentManager().i()).x((Runnable)new hdh(hmd, 15));
                            hmd.h.aN(hmd.i, hmd.b, "REEL_COMMENT_VIEW_TAG");
                            hmd.c.a();
                            if (!hmd.j.f(45367465L)) {
                                ((acns)hmd.g).m();
                            }
                        }
                    }
                }
                return;
            }
            case 11: {
                adkp.H(((ahbc)aiqj).ry((ahaq)anso.b));
                ((hof)this.c).a().ifPresent((Consumer)new gga((anso)((ahbc)aiqj).rx((ahaq)anso.b), 20));
                return;
            }
            case 10: {
                ((hof)this.c).a().ifPresent((Consumer)gyr.d);
                return;
            }
            case 9: {
                ((hof)this.c).a().ifPresent((Consumer)new gga(aiqj, 19));
                return;
            }
            case 8: {
                adkp.H(((ahbc)aiqj).ry((ahaq)DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.dismissSfvElementsBottomSheetCommand));
                final DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand dismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand = (DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand)((ahbc)aiqj).rx((ahaq)DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.dismissSfvElementsBottomSheetCommand);
                final Object c7 = this.c;
                Optional h;
                if ((dismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.b & 0x2) != 0x0) {
                    if ((aiqj = dismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.c) == null) {
                        aiqj = aiqj.a;
                    }
                    h = Optional.of((Object)aiqj);
                }
                else {
                    h = Optional.empty();
                }
                ((hsq)c7).h = h;
                ((utv)c7).E();
                return;
            }
            case 7: {
                final Intent intent = new Intent();
                intent.setClassName((Context)this.c, "com.google.android.apps.youtube.app.extensions.reel.edit.activity.ReelCameraActivity");
                intent.putExtra("navigation_endpoint", ((agzk)aiqj).toByteArray());
                ((Context)this.c).startActivity(intent);
                return;
            }
            case 6: {
                adkp.H(((ahbc)aiqj).ry((ahaq)akbe.b));
                ((hmg)this.c).b();
                return;
            }
            case 5: {
                adkp.H(((ahbc)aiqj).ry((ahaq)DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand.dismissBrowseElementsBottomSheetCommand));
                final DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand dismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand = (DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand)((ahbc)aiqj).rx((ahaq)DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand.dismissBrowseElementsBottomSheetCommand);
                final Object c8 = this.c;
                Optional e2;
                if ((dismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand.b & 0x1) != 0x0) {
                    if ((aiqj = dismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand.c) == null) {
                        aiqj = aiqj.a;
                    }
                    e2 = Optional.of((Object)aiqj);
                }
                else {
                    e2 = Optional.empty();
                }
                final hsp hsp = (hsp)c8;
                hsp.e = e2;
                hsp.c.dispose();
                ((utv)c8).E();
                return;
            }
            case 4: {
                final RecordingInfo recordingInfo = (RecordingInfo)tpe.O(map, (Object)"recording_info", (Class)RecordingInfo.class);
                final aiqj aiqj2 = (aiqj)tpe.O(map, (Object)"destination_endpoint", (Class)aiqj.class);
                final String s2 = (String)tpe.O(map, (Object)"fragment_tag", (Class)String.class);
                final uqb uqb = (uqb)tpe.O(map, (Object)"kazoo_effects_loader", (Class)uqb.class);
                final aqzt aqzt = (aqzt)tpe.O(map, (Object)"comment_sticker", (Class)aqzt.class);
                final Object c9 = this.c;
                anuv anuv2;
                if ((anuv2 = ((ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint)((ahbc)aiqj).rx((ahaq)ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.reelEditVideoEndpoint)).b) == null) {
                    anuv2 = anuv.a;
                }
                final ansh ansh = (ansh)anuv2.rx((ahaq)ReelEditVideoRendererOuterClass.reelEditVideoRenderer);
                final cyb cyb = (cyb)c9;
                if (cyb.a != null) {
                    final hiz hiz = new hiz();
                    uqb.getClass();
                    final Bundle bundle = new Bundle();
                    bundle.putParcelable("RECORDING_INFO", (Parcelable)recordingInfo);
                    if (aiqj2 != null) {
                        bundle.putByteArray("NAVIGATION_ENDPOINT", ((agzk)aiqj2).toByteArray());
                    }
                    if (aiqj != null) {
                        bundle.putByteArray("REEL_EDIT_VIDEO_ENDPOINT_KEY", ((agzk)aiqj).toByteArray());
                    }
                    if (ansh != null) {
                        bundle.putByteArray("VIDEO_EDIT_RENDERER", ((agzk)ansh).toByteArray());
                    }
                    if (aqzt != null) {
                        bundle.putByteArray("comment_sticker", ((agzk)aqzt).toByteArray());
                    }
                    if (uqb.k() == null) {
                        uqb.g((apmd)null);
                    }
                    hiz.be(uqb.a(aplj.e), uqb.a(aplj.f), uqb.a(aplj.h));
                    hiz.a = uqb.a(aplj.g);
                    hiz.bC((ulh)uqb);
                    hiz.bB((uli)uqb);
                    hiz.bJ(uqb.k(), uqb.a);
                    ((uss)hiz).aO = true;
                    ((uss)hiz).aP = 2;
                    ((uss)hiz).aN = 1;
                    if (aiqj2 != null && ((ahbc)aiqj2).ry((ahaq)LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint)) {
                        hiz.bD(((LightweightCameraEndpointOuterClass$LightweightCameraEndpoint)((ahbc)aiqj2).rx((ahaq)LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint)).c * 1000000L);
                    }
                    hiz.ag(bundle);
                    final ct i = ((cl)cyb.a).i();
                    i.w(2131430847, (br)hiz, s2);
                    i.a();
                    return;
                }
                ttr.b("fragmentManager is null");
                return;
            }
            case 3: {
                adkp.H(((ahbc)aiqj).ry((ahaq)ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.shortsCreationVideoIngestionCommand));
                final Optional ofNullable = Optional.ofNullable((Object)((bu)this.c).getSupportFragmentManager().e(2131430850));
                if (!ofNullable.isEmpty() && ofNullable.get() instanceof hgo) {
                    ((hgo)ofNullable.get()).aY(aiqj);
                    return;
                }
                ttr.b("ShortsCreationVideoIngestionCommandResolver: Invalid fragment");
                return;
            }
            case 2: {
                adkp.H(((ahbc)aiqj).ry((ahaq)SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand.sfvSuggestFillCommand));
                final cl supportFragmentManager = ((bu)this.c).getSupportFragmentManager();
                if (supportFragmentManager.f("SFV_AUDIO_SEARCH_FRAGMENT_TAG") instanceof hdt) {
                    ((hdt)supportFragmentManager.f("SFV_AUDIO_SEARCH_FRAGMENT_TAG")).a(((SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand)((ahbc)aiqj).rx((ahaq)SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand.sfvSuggestFillCommand)).b);
                }
                return;
            }
            case 1: {
                if (!((ahbc)aiqj).ry((ahaq)amxv.b)) {
                    throw new vdj();
                }
                final amxv amxv = (amxv)((ahbc)aiqj).rx((ahaq)amxv.b);
                final OpenLensForFrameController openLensForFrameController = (OpenLensForFrameController)((atke)this.c).a();
                openLensForFrameController.h = aezp.k((Object)amxv);
                openLensForFrameController.f = false;
                final abpq abpq = (abpq)openLensForFrameController.a.a();
                if (abpq.f()) {
                    abpq.a();
                    openLensForFrameController.i = 2;
                    return;
                }
                if (openLensForFrameController.e.h()) {
                    openLensForFrameController.j((LensImage)openLensForFrameController.e.c());
                    return;
                }
                openLensForFrameController.g();
                return;
            }
            case 0: {
                adkp.H(((ahbc)aiqj).ry((ahaq)aoey.b));
                final cl supportFragmentManager2 = ((bu)this.c).getSupportFragmentManager();
                final Optional ofNullable2 = Optional.ofNullable((Object)supportFragmentManager2.e(2131430850));
                if (!ofNullable2.isEmpty()) {
                    final br e3 = ((br)ofNullable2.get()).og().e(2131430847);
                    hdc hdc;
                    if (e3 instanceof hdc) {
                        hdc = (hdc)e3;
                    }
                    else {
                        if (!(e3 instanceof aeou)) {
                            return;
                        }
                        final aeou aeou = (aeou)e3;
                        if (!(aeou.aN() instanceof hdc)) {
                            return;
                        }
                        hdc = (hdc)aeou.aN();
                    }
                    if (supportFragmentManager2.f("OverlayDialogFragment") == null && hdc.L()) {
                        hdc.d().v();
                    }
                }
            }
        }
    }
}
