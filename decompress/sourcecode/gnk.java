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

public final class gnk implements vau
{
    private final /* synthetic */ int a;
    private final Object b;
    
    public gnk(final abyn b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public gnk(final Context b, final int a) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public gnk(final Context b, final int a, final byte[] array) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public gnk(final atjj b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public gnk(final atjj b, final int a, final byte[] array) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public gnk(final avt b, final int a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public gnk(final bx b, final int a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
    }
    
    public gnk(final YouTubeControlsOverlay b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public gnk(final YpcOffersListDialogFragmentController b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public gnk(final elw b, final int a, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
    }
    
    public gnk(final ise b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public gnk(final tdz b, final int a) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public gnk(final tdz b, final int a, final byte[] array) {
        this.a = a;
        this.b = b;
    }
    
    public gnk(final wvu b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public gnk(final wwu b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void mE(final aioe aioe, final Map map) {
        final int a = this.a;
        final ajug ajug = null;
        switch (a) {
            default: {
                aioe.getClass();
                final LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand logAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand = (LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand)((agzd)aioe).rr((agyr)LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.logAccountLinkingEventCommand);
                ajug ajug2 = ajug;
                if ((logAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.b & 0x1) != 0x0 && (ajug2 = logAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.c) == null) {
                    ajug2 = ajug.a;
                }
                if (ajug2 == null) {
                    trn.b("Could not get event to log");
                    return;
                }
                final Object b = this.b;
                final aklo d = aklq.d();
                ((agza)d).copyOnWrite();
                aklq.bn((aklq)d.instance, ajug2);
                ((wvu)b).d((aklq)((agza)d).build());
                return;
            }
            case 19: {
                final Object a2 = ((elw)this.b).a;
                if (a2 == null) {
                    return;
                }
                final utk d2 = ((DefaultWatchPanelViewController)a2).d;
                final String s = (String)tmy.O(map, (Object)"engagement_panel_id_key", (Class)String.class);
                if (s != null && s.equals(d2.h())) {
                    d2.B(aioe);
                    return;
                }
                d2.C(aioe);
                return;
            }
            case 18: {
                if (((agzd)aioe).rs((agyr)CloseSponsorshipsDialogCommandOuterClass$CloseSponsorshipsDialogCommand.closeSponsorshipsDialogCommand)) {
                    ((tdz)this.b).f((Object)new syf());
                }
                return;
            }
            case 17: {
                if (((agzd)aioe).rs((agyr)LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand.logAdVisualElementNoOpClickCommand)) {
                    final wwv n = ((wwu)this.b).n();
                    if (n != null) {
                        Map map2;
                        if ((map2 = map) == null) {
                            map2 = new HashMap();
                        }
                        alff alff;
                        if ((alff = www.f(aioe, map2)) == null) {
                            alff = alff.a;
                        }
                        final agza builder = ((agzi)alff).toBuilder();
                        alek alek;
                        if ((alek = alff.v) == null) {
                            alek = alek.a;
                        }
                        final agza builder2 = ((agzi)alek).toBuilder();
                        alek alek2;
                        if ((alek2 = alff.v) == null) {
                            alek2 = alek.a;
                        }
                        alef alef;
                        if ((alef = alek2.g) == null) {
                            alef = alef.a;
                        }
                        final agza builder3 = ((agzi)alef).toBuilder();
                        builder3.copyOnWrite();
                        final alef alef2 = (alef)builder3.instance;
                        alef2.b |= 0x1;
                        alef2.c = true;
                        final alef g = (alef)builder3.build();
                        builder2.copyOnWrite();
                        final alek alek3 = (alek)builder2.instance;
                        g.getClass();
                        alek3.g = g;
                        alek3.b |= 0x2000;
                        final alek v = (alek)builder2.build();
                        builder.copyOnWrite();
                        final alff alff2 = (alff)builder.instance;
                        v.getClass();
                        alff2.v = v;
                        alff2.c |= 0x400;
                        n.J(3, (wxz)new wws(aioe.c), (alff)builder.build());
                        return;
                    }
                    zjp.b(zjo.b, zjn.a, "The LogAdVisualElementNoOpClickCommandResolver does not get interactionLogger.");
                }
                return;
            }
            case 16: {
                if (!((agzd)aioe).rs((agyr)LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand.logAdClickTerminationCommand)) {
                    return;
                }
                if (map != null && map.containsKey(fax.a)) {
                    final wwv n2 = ((wwu)this.b).n();
                    final String s2 = map.get(fax.a);
                    final wws wws = new wws(aioe.c);
                    final agza builder4 = ((agzi)alff.a).createBuilder();
                    final agza builder5 = ((agzi)alek.a).createBuilder();
                    final agza builder6 = ((agzi)aled.a).createBuilder();
                    builder6.copyOnWrite();
                    aled.a((aled)builder6.instance);
                    final aled d3 = (aled)builder6.build();
                    builder5.copyOnWrite();
                    final alek alek4 = (alek)builder5.instance;
                    d3.getClass();
                    alek4.d = d3;
                    alek4.c = 10;
                    builder4.copyOnWrite();
                    final alff alff3 = (alff)builder4.instance;
                    final alek v2 = (alek)builder5.build();
                    v2.getClass();
                    alff3.v = v2;
                    alff3.c |= 0x400;
                    n2.x(s2, (wxz)wws, (alff)builder4.build());
                    return;
                }
                final wwv n3 = ((wwu)this.b).n();
                final wws wws2 = new wws(aioe.c);
                final agza builder7 = ((agzi)alff.a).createBuilder();
                final agza builder8 = ((agzi)alek.a).createBuilder();
                final agza builder9 = ((agzi)aled.a).createBuilder();
                builder9.copyOnWrite();
                aled.a((aled)builder9.instance);
                final aled d4 = (aled)builder9.build();
                builder8.copyOnWrite();
                final alek alek5 = (alek)builder8.instance;
                d4.getClass();
                alek5.d = d4;
                alek5.c = 10;
                builder7.copyOnWrite();
                final alff alff4 = (alff)builder7.instance;
                final alek v3 = (alek)builder8.build();
                v3.getClass();
                alff4.v = v3;
                alff4.c |= 0x400;
                n3.w((wxz)wws2, (alff)builder7.build());
                return;
            }
            case 15: {
                if (!((agzd)aioe).rs((agyr)AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.adsControlFlowOpportunityReceivedCommand)) {
                    return;
                }
                final rnl rnl = (rnl)((atjj)this.b).a();
                if (rnl == null) {
                    qcv.w((sfh)null, "No listener set for AdsControlFlowOpportunityReceivedCommandResolver");
                    return;
                }
                rnl.a((AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand)((agzd)aioe).rr((agyr)AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.adsControlFlowOpportunityReceivedCommand));
                return;
            }
            case 14: {
                if (((agzd)aioe).rs((agyr)TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand.triggerOfferAdsEnrollmentEventCommand)) {
                    final TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand triggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand = (TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand)((agzd)aioe).rr((agyr)TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand.triggerOfferAdsEnrollmentEventCommand);
                    if ((triggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand.b & 0x1) != 0x0) {
                        final aklo d5 = aklq.d();
                        amqs amqs;
                        if ((amqs = triggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand.c) == null) {
                            amqs = amqs.b();
                        }
                        ((agza)d5).copyOnWrite();
                        aklq.k((aklq)d5.instance, amqs);
                        ((wvu)((atjj)this.b).a()).d((aklq)((agza)d5).build());
                    }
                }
                return;
            }
            case 13: {
                final uxb uxb = (uxb)((atjj)this.b).a();
                if (uxb != null) {
                    final ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint = (ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint)((agzd)aioe).rr((agyr)ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.shoppingDrawerEndpoint);
                    final int b2 = shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.b;
                    final int bu = aqql.bu(b2);
                    int i = 0;
                    if (bu != 0) {
                        if (bu == 3) {
                            if (uxb.i) {
                                uxb.l();
                                return;
                            }
                            if (uxb.c != null) {
                                while (i < uxb.c.b().size()) {
                                    if (((ardu)uxb.c.b().get(i)).a == 5) {
                                        uxb.j(i);
                                        return;
                                    }
                                    ++i;
                                }
                                uxb.j(uxb.e);
                            }
                            return;
                        }
                    }
                    final int bu2 = aqql.bu(b2);
                    if (bu2 != 0 && bu2 == 2) {
                        if (!(boolean)tmy.N(map, (Object)"shopping_drawer_ad_playing", (Object)false)) {
                            final int c = shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.c;
                            if (uxb.d != null) {
                                if (!uxb.j) {
                                    final String h = uxb.h;
                                    if (h != null) {
                                        uxb.t.F("CPN", h);
                                    }
                                    uxb.c(uxb.d);
                                    uxb.g();
                                    uxb.i = true;
                                    uxb.j = true;
                                    return;
                                }
                                uxb.l();
                            }
                        }
                        else {
                            uxb.i(shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.c, true);
                        }
                    }
                }
                return;
            }
            case 12: {
                if (((agzd)aioe).rs((agyr)ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.replaceCompanionEndpoint)) {
                    ((tdz)this.b).d((Object)new rmu(((ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint)((agzd)aioe).rr((agyr)ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.replaceCompanionEndpoint)).b));
                }
                return;
            }
            case 11: {
                if (((agzd)aioe).rs((agyr)OpenAdsWebViewInBrowserCommandOuterClass.openAdsWebViewInBrowserCommand)) {
                    final faw faw = ((Map<K, faw>)((avt)this.b).a).get(((amvo)((agzd)aioe).rr((agyr)OpenAdsWebViewInBrowserCommandOuterClass.openAdsWebViewInBrowserCommand)).b);
                    if (faw != null) {
                        faw.b();
                    }
                }
                return;
            }
            case 10: {
                ((euf)((atjj)this.b).a()).a((ahtg)((agzd)aioe).rr((agyr)AppStoreOverlayCommandOuterClass.appStoreOverlayCommand));
                return;
            }
            case 9: {
                if (aioe != null && ((agzd)aioe).rs((agyr)AppBrowserPrewarmAndPreconnectCommandOuterClass.appBrowserPrewarmAndPreconnectCommand)) {
                    final ListenableFuture a3 = ((abyn)this.b).a();
                    if (a3 != null) {
                        a3.isCancelled();
                    }
                }
                return;
            }
            case 8: {
                ((ise)this.b).f();
                return;
            }
            case 7: {
                final SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand setPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand = (SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand)((agzd)aioe).rr((agyr)SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand.setPlayerControlsOverlayVisibilityCommand);
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
                final SendSmsEndpointOuterClass$SendSmsEndpoint sendSmsEndpointOuterClass$SendSmsEndpoint = (SendSmsEndpointOuterClass$SendSmsEndpoint)((agzd)aioe).rr((agyr)SendSmsEndpointOuterClass$SendSmsEndpoint.sendSmsEndpoint);
                final String join = TextUtils.join((CharSequence)", ", (Iterable)sendSmsEndpointOuterClass$SendSmsEndpoint.b);
                final Object b3 = this.b;
                final Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("sms", join, (String)null));
                abyh.q((Context)b3, intent);
                intent.putExtra("android.intent.extra.SUBJECT", sendSmsEndpointOuterClass$SendSmsEndpoint.d);
                intent.putExtra("android.intent.extra.TEXT", sendSmsEndpointOuterClass$SendSmsEndpoint.c);
                intent.putExtra("sms_body", sendSmsEndpointOuterClass$SendSmsEndpoint.c);
                if (tab.g((Context)this.b, intent)) {
                    ((Context)this.b).startActivity(intent.setFlags(268435456));
                    return;
                }
                tmy.x((Context)this.b, 2132018001, 1);
                return;
            }
            case 5: {
                final Intent intent2 = new Intent("android.intent.action.DIAL", Uri.fromParts("tel", ((PhoneDialerEndpointOuterClass$PhoneDialerEndpoint)((agzd)aioe).rr((agyr)PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.phoneDialerEndpoint)).b, (String)null));
                abyh.q((Context)this.b, intent2);
                if (tab.g((Context)this.b, intent2)) {
                    zjp.b(zjo.a, zjn.a, "PhoneDialerCommand succeeds to open phone apps.");
                    ((Context)this.b).startActivity(intent2.setFlags(268435456));
                    return;
                }
                zjp.b(zjo.a, zjn.a, "PhoneDialerCommand fails to open phone apps.");
                tmy.x((Context)this.b, 2132018002, 1);
                return;
            }
            case 4: {
                ((YpcOffersListDialogFragmentController)this.b).g(aioe);
                ((DialogFragmentController)this.b).n();
                return;
            }
            case 3: {
                if (((agzd)aioe).rs((agyr)allc.b)) {
                    final Object b4 = this.b;
                    final allc allc = (allc)((agzd)aioe).rr((agyr)allc.b);
                    final bx bx = (bx)b4;
                    if (bx.P().h()) {
                        ((jxj)bx.P().c()).g(allc);
                    }
                }
                return;
            }
            case 2: {
                ((jrl)((atjj)this.b).a()).p();
                return;
            }
            case 1: {
                if (((agzd)aioe).rs((agyr)FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.filterBarContentInsertionCommand)) {
                    final Object b5 = this.b;
                    final FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand = (FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand)((agzd)aioe).rr((agyr)FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.filterBarContentInsertionCommand);
                    final bx bx2 = (bx)b5;
                    if (bx2.P().h()) {
                        ((jxj)bx2.P().c()).e(filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand);
                    }
                }
                return;
            }
            case 0: {
                if (((agzd)aioe).rs((agyr)FilterChipTransformCommandOuterClass$FilterChipTransformCommand.filterChipTransformCommand)) {
                    final Object b6 = this.b;
                    final FilterChipTransformCommandOuterClass$FilterChipTransformCommand filterChipTransformCommandOuterClass$FilterChipTransformCommand = (FilterChipTransformCommandOuterClass$FilterChipTransformCommand)((agzd)aioe).rr((agyr)FilterChipTransformCommandOuterClass$FilterChipTransformCommand.filterChipTransformCommand);
                    final bx bx3 = (bx)b6;
                    if (bx3.P().h()) {
                        ((jxj)bx3.P().c()).f(filterChipTransformCommandOuterClass$FilterChipTransformCommand);
                    }
                }
            }
        }
    }
}
