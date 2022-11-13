import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.FilterChipTransformCommandOuterClass$FilterChipTransformCommand;
import com.google.protos.youtube.api.innertube.FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand;
import com.google.android.apps.youtube.app.common.dialog.DialogFragmentController;
import com.google.protos.youtube.api.innertube.PhoneDialerEndpointOuterClass$PhoneDialerEndpoint;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.SendSmsEndpointOuterClass$SendSmsEndpoint;
import com.google.protos.youtube.api.innertube.SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand;
import com.google.protos.youtube.api.innertube.AppBrowserPrewarmAndPreconnectCommandOuterClass;
import com.google.protos.youtube.api.innertube.AppStoreOverlayCommandOuterClass;
import com.google.protos.youtube.api.innertube.OpenAdsWebViewInBrowserCommandOuterClass;
import com.google.protos.youtube.api.innertube.ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint;
import com.google.protos.youtube.api.innertube.ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint;
import com.google.protos.youtube.api.innertube.TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand;
import com.google.protos.youtube.api.innertube.AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand;
import com.google.protos.youtube.api.innertube.LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand;
import java.util.HashMap;
import com.google.protos.youtube.api.innertube.LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand;
import com.google.protos.youtube.api.innertube.CloseSponsorshipsDialogCommandOuterClass$CloseSponsorshipsDialogCommand;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.protos.youtube.api.innertube.LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand;
import java.util.Map;
import com.google.android.apps.youtube.app.ui.YpcOffersListDialogFragmentController;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gnq implements vcv
{
    private final int a;
    private final Object b;
    
    public gnq(final acaq b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public gnq(final Context b, final int a) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public gnq(final Context b, final int a, final byte[] array) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public gnq(final atke b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public gnq(final atke b, final int a, final byte[] array) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public gnq(final avu b, final int a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public gnq(final bx b, final int a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
    }
    
    public gnq(final YouTubeControlsOverlay b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public gnq(final YpcOffersListDialogFragmentController b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public gnq(final elx b, final int a, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
    }
    
    public gnq(final itd b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public gnq(final tgd b, final int a) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public gnq(final tgd b, final int a, final byte[] array) {
        this.a = a;
        this.b = b;
    }
    
    public gnq(final wxx b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public gnq(final wyv b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void mE(final aiqj aiqj, final Map map) {
        final int a = this.a;
        final ajwj ajwj = null;
        switch (a) {
            default: {
                aiqj.getClass();
                final LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand logAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand = (LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand)((ahbc)aiqj).rx((ahaq)LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.logAccountLinkingEventCommand);
                ajwj ajwj2 = ajwj;
                if ((logAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.b & 0x1) != 0x0 && (ajwj2 = logAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.c) == null) {
                    ajwj2 = ajwj.a;
                }
                if (ajwj2 == null) {
                    ttr.b("Could not get event to log");
                    return;
                }
                final Object b = this.b;
                final aknr d = aknt.d();
                ((ahaz)d).copyOnWrite();
                aknt.bo((aknt)d.instance, ajwj2);
                ((wxx)b).d((aknt)((ahaz)d).build());
                return;
            }
            case 19: {
                final Object a2 = ((elx)this.b).a;
                if (a2 == null) {
                    return;
                }
                final uve d2 = ((DefaultWatchPanelViewController)a2).d;
                final String s = (String)tpe.O(map, (Object)"engagement_panel_id_key", (Class)String.class);
                if (s != null && s.equals(d2.h())) {
                    d2.B(aiqj);
                    return;
                }
                d2.C(aiqj);
                return;
            }
            case 18: {
                if (((ahbc)aiqj).ry((ahaq)CloseSponsorshipsDialogCommandOuterClass$CloseSponsorshipsDialogCommand.closeSponsorshipsDialogCommand)) {
                    ((tgd)this.b).f((Object)new tak());
                }
                return;
            }
            case 17: {
                if (((ahbc)aiqj).ry((ahaq)LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand.logAdVisualElementNoOpClickCommand)) {
                    final wyw pf = ((wyv)this.b).pF();
                    if (pf != null) {
                        Map map2;
                        if ((map2 = map) == null) {
                            map2 = new HashMap();
                        }
                        alhi alhi;
                        if ((alhi = wyx.f(aiqj, map2)) == null) {
                            alhi = alhi.a;
                        }
                        final ahaz builder = ((ahbh)alhi).toBuilder();
                        algn algn;
                        if ((algn = alhi.v) == null) {
                            algn = algn.a;
                        }
                        final ahaz builder2 = ((ahbh)algn).toBuilder();
                        algn algn2;
                        if ((algn2 = alhi.v) == null) {
                            algn2 = algn.a;
                        }
                        algi algi;
                        if ((algi = algn2.g) == null) {
                            algi = algi.a;
                        }
                        final ahaz builder3 = ((ahbh)algi).toBuilder();
                        builder3.copyOnWrite();
                        final algi algi2 = (algi)builder3.instance;
                        algi2.b |= 0x1;
                        algi2.c = true;
                        final algi g = (algi)builder3.build();
                        builder2.copyOnWrite();
                        final algn algn3 = (algn)builder2.instance;
                        g.getClass();
                        algn3.g = g;
                        algn3.b |= 0x2000;
                        final algn v = (algn)builder2.build();
                        builder.copyOnWrite();
                        final alhi alhi2 = (alhi)builder.instance;
                        v.getClass();
                        alhi2.v = v;
                        alhi2.c |= 0x400;
                        pf.J(3, (wzz)new wyt(aiqj.c), (alhi)builder.build());
                        return;
                    }
                    zlm.b(zll.b, zlk.a, "The LogAdVisualElementNoOpClickCommandResolver does not get interactionLogger.");
                }
                return;
            }
            case 16: {
                if (!((ahbc)aiqj).ry((ahaq)LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand.logAdClickTerminationCommand)) {
                    return;
                }
                if (map != null && map.containsKey(fbb.a)) {
                    final wyw pf2 = ((wyv)this.b).pF();
                    final String s2 = map.get(fbb.a);
                    final wyt wyt = new wyt(aiqj.c);
                    final ahaz builder4 = ((ahbh)alhi.a).createBuilder();
                    final ahaz builder5 = ((ahbh)algn.a).createBuilder();
                    final ahaz builder6 = ((ahbh)algg.a).createBuilder();
                    builder6.copyOnWrite();
                    algg.a((algg)builder6.instance);
                    final algg d3 = (algg)builder6.build();
                    builder5.copyOnWrite();
                    final algn algn4 = (algn)builder5.instance;
                    d3.getClass();
                    algn4.d = d3;
                    algn4.c = 10;
                    builder4.copyOnWrite();
                    final alhi alhi3 = (alhi)builder4.instance;
                    final algn v2 = (algn)builder5.build();
                    v2.getClass();
                    alhi3.v = v2;
                    alhi3.c |= 0x400;
                    pf2.x(s2, (wzz)wyt, (alhi)builder4.build());
                    return;
                }
                final wyw pf3 = ((wyv)this.b).pF();
                final wyt wyt2 = new wyt(aiqj.c);
                final ahaz builder7 = ((ahbh)alhi.a).createBuilder();
                final ahaz builder8 = ((ahbh)algn.a).createBuilder();
                final ahaz builder9 = ((ahbh)algg.a).createBuilder();
                builder9.copyOnWrite();
                algg.a((algg)builder9.instance);
                final algg d4 = (algg)builder9.build();
                builder8.copyOnWrite();
                final algn algn5 = (algn)builder8.instance;
                d4.getClass();
                algn5.d = d4;
                algn5.c = 10;
                builder7.copyOnWrite();
                final alhi alhi4 = (alhi)builder7.instance;
                final algn v3 = (algn)builder8.build();
                v3.getClass();
                alhi4.v = v3;
                alhi4.c |= 0x400;
                pf3.w((wzz)wyt2, (alhi)builder7.build());
                return;
            }
            case 15: {
                if (!((ahbc)aiqj).ry((ahaq)AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.adsControlFlowOpportunityReceivedCommand)) {
                    return;
                }
                final rpp rpp = (rpp)((atke)this.b).a();
                if (rpp == null) {
                    qdw.s((shm)null, "No listener set for AdsControlFlowOpportunityReceivedCommandResolver");
                    return;
                }
                rpp.a((AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand)((ahbc)aiqj).rx((ahaq)AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.adsControlFlowOpportunityReceivedCommand));
                return;
            }
            case 14: {
                if (((ahbc)aiqj).ry((ahaq)TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand.triggerOfferAdsEnrollmentEventCommand)) {
                    final TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand triggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand = (TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand)((ahbc)aiqj).rx((ahaq)TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand.triggerOfferAdsEnrollmentEventCommand);
                    if ((triggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand.b & 0x1) != 0x0) {
                        final aknr d5 = aknt.d();
                        amsw amsw;
                        if ((amsw = triggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand.c) == null) {
                            amsw = amsw.b();
                        }
                        ((ahaz)d5).copyOnWrite();
                        aknt.l((aknt)d5.instance, amsw);
                        ((wxx)((atke)this.b).a()).d((aknt)((ahaz)d5).build());
                    }
                }
                return;
            }
            case 13: {
                final uyy uyy = (uyy)((atke)this.b).a();
                if (uyy != null) {
                    final ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint = (ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint)((ahbc)aiqj).rx((ahaq)ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.shoppingDrawerEndpoint);
                    final int b2 = shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.b;
                    final int bv = aqsx.bv(b2);
                    int i = 0;
                    if (bv != 0) {
                        if (bv == 3) {
                            if (uyy.i) {
                                uyy.l();
                                return;
                            }
                            if (uyy.c != null) {
                                while (i < uyy.c.b().size()) {
                                    if (((argj)uyy.c.b().get(i)).a == 5) {
                                        uyy.j(i);
                                        return;
                                    }
                                    ++i;
                                }
                                uyy.j(uyy.e);
                            }
                            return;
                        }
                    }
                    final int bv2 = aqsx.bv(b2);
                    if (bv2 != 0 && bv2 == 2) {
                        if (!(boolean)tpe.N(map, (Object)"shopping_drawer_ad_playing", (Object)false)) {
                            final int c = shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.c;
                            if (uyy.d != null) {
                                if (!uyy.j) {
                                    final String h = uyy.h;
                                    if (h != null) {
                                        uyy.t.D("CPN", h);
                                    }
                                    uyy.c(uyy.d);
                                    uyy.g();
                                    uyy.i = true;
                                    uyy.j = true;
                                    return;
                                }
                                uyy.l();
                            }
                        }
                        else {
                            uyy.i(shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.c, true);
                        }
                    }
                }
                return;
            }
            case 12: {
                if (((ahbc)aiqj).ry((ahaq)ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.replaceCompanionEndpoint)) {
                    ((tgd)this.b).d((Object)new roy(((ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint)((ahbc)aiqj).rx((ahaq)ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.replaceCompanionEndpoint)).b));
                }
                return;
            }
            case 11: {
                if (((ahbc)aiqj).ry((ahaq)OpenAdsWebViewInBrowserCommandOuterClass.openAdsWebViewInBrowserCommand)) {
                    final fba fba = ((Map<K, fba>)((avu)this.b).a).get(((amxs)((ahbc)aiqj).rx((ahaq)OpenAdsWebViewInBrowserCommandOuterClass.openAdsWebViewInBrowserCommand)).b);
                    if (fba != null) {
                        fba.b();
                    }
                }
                return;
            }
            case 10: {
                ((eui)((atke)this.b).a()).a((ahve)((ahbc)aiqj).rx((ahaq)AppStoreOverlayCommandOuterClass.appStoreOverlayCommand));
                return;
            }
            case 9: {
                if (aiqj != null && ((ahbc)aiqj).ry((ahaq)AppBrowserPrewarmAndPreconnectCommandOuterClass.appBrowserPrewarmAndPreconnectCommand)) {
                    final ListenableFuture a3 = ((acaq)this.b).a();
                    if (a3 != null) {
                        a3.isCancelled();
                    }
                }
                return;
            }
            case 8: {
                ((itd)this.b).f();
                return;
            }
            case 7: {
                final SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand setPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand = (SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand)((ahbc)aiqj).rx((ahaq)SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand.setPlayerControlsOverlayVisibilityCommand);
                if ((setPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand.b & 0x1) != 0x0) {
                    if (setPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand.c) {
                        ((YouTubeControlsOverlay)this.b).R();
                        return;
                    }
                    ((YouTubeControlsOverlay)this.b).oE();
                }
                return;
            }
            case 6: {
                final SendSmsEndpointOuterClass$SendSmsEndpoint sendSmsEndpointOuterClass$SendSmsEndpoint = (SendSmsEndpointOuterClass$SendSmsEndpoint)((ahbc)aiqj).rx((ahaq)SendSmsEndpointOuterClass$SendSmsEndpoint.sendSmsEndpoint);
                final String join = TextUtils.join((CharSequence)", ", (Iterable)sendSmsEndpointOuterClass$SendSmsEndpoint.b);
                final Object b3 = this.b;
                final Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("sms", join, (String)null));
                acak.q((Context)b3, intent);
                intent.putExtra("android.intent.extra.SUBJECT", sendSmsEndpointOuterClass$SendSmsEndpoint.d);
                intent.putExtra("android.intent.extra.TEXT", sendSmsEndpointOuterClass$SendSmsEndpoint.c);
                intent.putExtra("sms_body", sendSmsEndpointOuterClass$SendSmsEndpoint.c);
                if (tcg.g((Context)this.b, intent)) {
                    ((Context)this.b).startActivity(intent.setFlags(268435456));
                    return;
                }
                tpe.x((Context)this.b, 2132018002, 1);
                return;
            }
            case 5: {
                final Intent intent2 = new Intent("android.intent.action.DIAL", Uri.fromParts("tel", ((PhoneDialerEndpointOuterClass$PhoneDialerEndpoint)((ahbc)aiqj).rx((ahaq)PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.phoneDialerEndpoint)).b, (String)null));
                acak.q((Context)this.b, intent2);
                if (tcg.g((Context)this.b, intent2)) {
                    zlm.b(zll.a, zlk.a, "PhoneDialerCommand succeeds to open phone apps.");
                    ((Context)this.b).startActivity(intent2.setFlags(268435456));
                    return;
                }
                zlm.b(zll.a, zlk.a, "PhoneDialerCommand fails to open phone apps.");
                tpe.x((Context)this.b, 2132018003, 1);
                return;
            }
            case 4: {
                ((YpcOffersListDialogFragmentController)this.b).g(aiqj);
                ((DialogFragmentController)this.b).n();
                return;
            }
            case 3: {
                if (((ahbc)aiqj).ry((ahaq)alng.b)) {
                    final Object b4 = this.b;
                    final alng alng = (alng)((ahbc)aiqj).rx((ahaq)alng.b);
                    final bx bx = (bx)b4;
                    if (bx.P().h()) {
                        ((jyk)bx.P().c()).g(alng);
                    }
                }
                return;
            }
            case 2: {
                ((jsm)((atke)this.b).a()).p();
                return;
            }
            case 1: {
                if (((ahbc)aiqj).ry((ahaq)FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.filterBarContentInsertionCommand)) {
                    final Object b5 = this.b;
                    final FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand = (FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand)((ahbc)aiqj).rx((ahaq)FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.filterBarContentInsertionCommand);
                    final bx bx2 = (bx)b5;
                    if (bx2.P().h()) {
                        ((jyk)bx2.P().c()).e(filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand);
                    }
                }
                return;
            }
            case 0: {
                if (((ahbc)aiqj).ry((ahaq)FilterChipTransformCommandOuterClass$FilterChipTransformCommand.filterChipTransformCommand)) {
                    final Object b6 = this.b;
                    final FilterChipTransformCommandOuterClass$FilterChipTransformCommand filterChipTransformCommandOuterClass$FilterChipTransformCommand = (FilterChipTransformCommandOuterClass$FilterChipTransformCommand)((ahbc)aiqj).rx((ahaq)FilterChipTransformCommandOuterClass$FilterChipTransformCommand.filterChipTransformCommand);
                    final bx bx3 = (bx)b6;
                    if (bx3.P().h()) {
                        ((jyk)bx3.P().c()).f(filterChipTransformCommandOuterClass$FilterChipTransformCommand);
                    }
                }
            }
        }
    }
}
