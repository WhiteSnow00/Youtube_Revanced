import java.util.Iterator;
import com.google.protos.youtube.api.innertube.RefreshAppActionOuterClass$RefreshAppAction;
import com.google.protos.youtube.api.innertube.RefreshCommandOuterClass$RefreshCommand;
import com.google.protos.youtube.api.innertube.ResizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint;
import j$.util.Objects;
import com.google.protos.youtube.api.innertube.ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint;
import com.google.protos.youtube.api.innertube.ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint;
import com.google.protos.youtube.api.innertube.SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand;
import com.google.protos.youtube.api.innertube.ShowModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint;
import com.google.protos.youtube.api.innertube.ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand;
import com.google.protos.youtube.api.innertube.CommandWrapperPromoRendererOuterClass;
import com.google.protos.youtube.api.innertube.ShowPromoCommandOuterClass$ShowPromoCommand;
import com.google.protos.youtube.api.innertube.SignalServiceEndpointOuterClass$SignalServiceEndpoint;
import com.google.protos.youtube.api.innertube.SurveyEndpointOuterClass$SurveyEndpoint;
import com.google.protos.youtube.api.innertube.SurveyRenderer;
import com.google.protos.youtube.api.innertube.LiveChatAction;
import android.net.Uri;
import com.google.protos.youtube.api.innertube.TextMessageEndpointOuterClass$TextMessageEndpoint;
import java.util.List;
import com.google.protos.youtube.api.innertube.UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint;
import com.google.protos.youtube.api.innertube.UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint;
import j$.util.Optional;
import com.google.protos.youtube.api.innertube.BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.AuthorizedUrlEndpointOuterClass;
import java.util.Map;
import android.widget.Toast;
import java.util.Set;
import com.google.android.apps.youtube.app.common.subscriptions.controller.SubscriptionNotificationOptionsDialogFragmentControllerImpl;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fdm implements vau
{
    public final Object a;
    private final /* synthetic */ int b;
    
    public fdm(final abft a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fdm(final acts a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fdm(final Context a, final int b) {
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public fdm(final Context a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public fdm(final atjj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fdm(final atjj a, final int b, final byte[] array) {
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public fdm(final aujp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fdm(final SubscriptionNotificationOptionsDialogFragmentControllerImpl a, final int b) {
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public fdm(final SubscriptionNotificationOptionsDialogFragmentControllerImpl a, final int b, final byte[] array) {
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public fdm(final fyt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fdm(final gbg a, final int b) {
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public fdm(final ggv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fdm(final irp a, final int b) {
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public fdm(final irp a, final int b, final byte[] array) {
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public fdm(final Set a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fdm(final kvd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fdm(final toi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fdm(final utk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fdm(final vax a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    private final void b(final int n) {
        Toast.makeText((Context)this.a, (CharSequence)((Context)this.a).getString(n), 1).show();
    }
    
    public final void mE(aioe d, final Map map) {
        final int b = this.b;
        int n = 1;
        final aokx aokx = null;
        final aokx aokx2 = null;
        final String s = null;
        final Runnable runnable = null;
        final String s2 = null;
        final Object o = null;
        switch (b) {
            default: {
                ((irp)this.a).f(true);
                return;
            }
            case 19: {
                ((irp)this.a).f(false);
                return;
            }
            case 18: {
                final String b2 = ((ahuy)((agzd)d).rr((agyr)AuthorizedUrlEndpointOuterClass.authorizedUrlEndpoint)).b;
                if (TextUtils.isEmpty((CharSequence)b2)) {
                    this.b(2132017997);
                    return;
                }
                final Uri ch = tmy.cH(b2);
                final Object a = this.a;
                final Intent intent = new Intent("android.intent.action.VIEW", ch);
                abyh.q((Context)a, intent);
                try {
                    ((Context)this.a).startActivity(intent.setFlags(268435456));
                    return;
                }
                catch (final ActivityNotFoundException ex) {
                    this.b(2132017519);
                    return;
                }
            }
            case 17: {
                final BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint = (BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint)((agzd)d).rr((agyr)BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.browseSectionListReloadEndpoint);
                aiat aiat;
                if ((aiat = browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.c) == null) {
                    aiat = aiat.a;
                }
                if ((aiat.b & 0x1) != 0x0) {
                    final acmw acmw = (acmw)tmy.O(map, (Object)"sectionListController", (Class)acmw.class);
                    if (acmw == null) {
                        if ((browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.b & 0x4) == 0x0 || !browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.e) {
                            d = null;
                        }
                        final Object a2 = this.a;
                        final too f = top.f();
                        final String d2 = browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.d;
                        if (d2 == null) {
                            throw new NullPointerException("Null targetId");
                        }
                        f.f = d2;
                        f.d = d;
                        aiat aiat2;
                        if ((aiat2 = browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.c) == null) {
                            aiat2 = aiat.a;
                        }
                        ansi c;
                        if ((c = aiat2.c) == null) {
                            c = ansi.a;
                        }
                        if (c != null) {
                            f.c = c;
                            f.a(browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.f);
                            Object a3 = o;
                            if ((browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.b & 0x10) != 0x0) {
                                akfx akfx;
                                if ((akfx = browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.g) == null) {
                                    akfx = akfx.a;
                                }
                                if (akfx.b == 153515154) {
                                    a3 = akfx.c;
                                }
                                else {
                                    a3 = ajkj.a;
                                }
                            }
                            f.e = Optional.ofNullable(a3);
                            if (f.b == 1) {
                                final Object f2 = f.f;
                                if (f2 != null) {
                                    final Object c2 = f.c;
                                    if (c2 != null) {
                                        ((aujp)a2).tr((Object)new tmz((String)f2, (ansi)c2, (aioe)f.d, (Optional)f.e, f.a, (tmy)null));
                                        return;
                                    }
                                }
                            }
                            final StringBuilder sb = new StringBuilder();
                            if (f.f == null) {
                                sb.append(" targetId");
                            }
                            if (f.c == null) {
                                sb.append(" reloadContinuationData");
                            }
                            if (f.b == 0) {
                                sb.append(" pageType");
                            }
                            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                        }
                        throw new NullPointerException("Null reloadContinuationData");
                    }
                    else {
                        if (acmw instanceof acma) {
                            final acma acma = (acma)acmw;
                            aiat aiat3;
                            if ((aiat3 = browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.c) == null) {
                                aiat3 = aiat.a;
                            }
                            ansi ansi;
                            if ((ansi = aiat3.c) == null) {
                                ansi = ansi.a;
                            }
                            acma.lH(ansi, d);
                            return;
                        }
                        aiat aiat4;
                        if ((aiat4 = browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.c) == null) {
                            aiat4 = aiat.a;
                        }
                        ansi ansi2;
                        if ((ansi2 = aiat4.c) == null) {
                            ansi2 = ansi.a;
                        }
                        acmw.ad(aaiy.y((Object)ansi2), d);
                    }
                }
                return;
            }
            case 16: {
                ((fyt)this.a).e((UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint)((agzd)d).rr((agyr)UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint.updatedMetadataEndpoint));
                return;
            }
            case 15: {
                ((req)((atjj)this.a).a()).k(d);
                return;
            }
            case 14: {
                ((isk)((atjj)this.a).a()).d();
                return;
            }
            case 13: {
                ((vax)this.a).d((List)((UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint)((agzd)d).rr((agyr)UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint.updateHorizontalCardListActionEndpoint)).b, map);
                return;
            }
            case 12: {
                if (((TextMessageEndpointOuterClass$TextMessageEndpoint)((agzd)d).rr((agyr)TextMessageEndpointOuterClass$TextMessageEndpoint.textMessageEndpoint)).b.isEmpty()) {
                    trn.b("Cannot send SMS without body.");
                    return;
                }
                final TextMessageEndpointOuterClass$TextMessageEndpoint textMessageEndpointOuterClass$TextMessageEndpoint = (TextMessageEndpointOuterClass$TextMessageEndpoint)((agzd)d).rr((agyr)TextMessageEndpointOuterClass$TextMessageEndpoint.textMessageEndpoint);
                final Intent intent2 = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:".concat(String.valueOf(TextUtils.join((CharSequence)";", (Iterable)textMessageEndpointOuterClass$TextMessageEndpoint.c)))));
                intent2.putExtra("sms_body", textMessageEndpointOuterClass$TextMessageEndpoint.b);
                ((Context)this.a).startActivity(intent2);
                return;
            }
            case 11: {
                final alnf alnf = (alnf)((agzd)d).rr((agyr)LiveChatAction.showLiveChatSurveyCommand);
                anss anss;
                if ((anss = alnf.b) == null) {
                    anss = anss.a;
                }
                if (((agzd)anss).rs((agyr)SurveyRenderer.surveyTriggerRenderer)) {
                    anss anss2;
                    if ((anss2 = alnf.b) == null) {
                        anss2 = anss.a;
                    }
                    final aonm aonm = (aonm)((agzd)anss2).rr((agyr)SurveyRenderer.surveyTriggerRenderer);
                    if ((aonm.b & 0x10) != 0x0) {
                        final Object a4 = this.a;
                        aonl aonl;
                        if ((aonl = aonm.c) == null) {
                            aonl = aonl.a;
                        }
                        ((gbg)a4).q(aonl);
                    }
                }
                else if (((agzd)d).rs((agyr)SurveyEndpointOuterClass$SurveyEndpoint.surveyEndpoint)) {
                    final Object a5 = this.a;
                    aonl aonl2;
                    if ((aonl2 = ((SurveyEndpointOuterClass$SurveyEndpoint)((agzd)d).rr((agyr)SurveyEndpointOuterClass$SurveyEndpoint.surveyEndpoint)).b) == null) {
                        aonl2 = aonl.a;
                    }
                    ((gbg)a5).q(aonl2);
                }
                return;
            }
            case 10: {
                if (!((agzd)d).rs((agyr)SignalServiceEndpointOuterClass$SignalServiceEndpoint.signalServiceEndpoint)) {
                    return;
                }
                ((vax)this.a).d((List)((SignalServiceEndpointOuterClass$SignalServiceEndpoint)((agzd)d).rr((agyr)SignalServiceEndpointOuterClass$SignalServiceEndpoint.signalServiceEndpoint)).b, map);
                return;
            }
            case 9: {
                final aoet aoet = (aoet)((agzd)d).rr((agyr)aoet.b);
                aoeu aoeu;
                if ((aoeu = aoet.c) == null) {
                    aoeu = aoeu.a;
                }
                aokx a6 = aokx;
                if (aoeu.b == 119226798) {
                    aoeu aoeu2;
                    if ((aoeu2 = aoet.c) == null) {
                        aoeu2 = aoeu.a;
                    }
                    if (aoeu2.b == 119226798) {
                        a6 = (aokx)aoeu2.c;
                    }
                    else {
                        a6 = aokx.a;
                    }
                }
                if (a6 != null) {
                    ((SubscriptionNotificationOptionsDialogFragmentControllerImpl)this.a).g(a6);
                }
                return;
            }
            case 8: {
                final ShowPromoCommandOuterClass$ShowPromoCommand showPromoCommandOuterClass$ShowPromoCommand = (ShowPromoCommandOuterClass$ShowPromoCommand)((agzd)d).rr((agyr)ShowPromoCommandOuterClass$ShowPromoCommand.showPromoCommand);
                if (showPromoCommandOuterClass$ShowPromoCommand.b == 2) {
                    final aioh aioh = (aioh)aaiy.w((anss)showPromoCommandOuterClass$ShowPromoCommand.c, (agyr)CommandWrapperPromoRendererOuterClass.commandWrapperPromoRenderer);
                    if (aioh != null && (aioh.b & 0x1) != 0x0) {
                        final Object a7 = this.a;
                        if ((d = aioh.c) == null) {
                            d = aioe.a;
                        }
                        ((vax)a7).a(d);
                    }
                }
                return;
            }
            case 7: {
                if (((agzd)d).rs((agyr)ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.showNoConnectionBarCommand)) {
                    ((toi)this.a).b();
                    return;
                }
                throw new vbh("Expected a ShowNoConnectionBarCommand, but did not find one.");
            }
            case 6: {
                final ShowModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint showModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint = (ShowModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint)((agzd)d).rr((agyr)ShowModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint.showModifyChannelNotificationOptionsEndpoint);
                aoeo aoeo;
                if ((aoeo = showModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint.b) == null) {
                    aoeo = aoeo.a;
                }
                aokx a8 = aokx2;
                if (aoeo.b == 119226798) {
                    aoeo aoeo2;
                    if ((aoeo2 = showModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint.b) == null) {
                        aoeo2 = aoeo.a;
                    }
                    if (aoeo2.b == 119226798) {
                        a8 = (aokx)aoeo2.c;
                    }
                    else {
                        a8 = aokx.a;
                    }
                }
                if (a8 != null) {
                    ((SubscriptionNotificationOptionsDialogFragmentControllerImpl)this.a).g(a8);
                }
                return;
            }
            case 5: {
                if (!((abft)this.a).b.f()) {
                    return;
                }
                ((abft)this.a).n(2, 0);
                return;
            }
            case 4: {
                final SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand = (SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand)((agzd)d).rr((agyr)SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.setEngagementPanelActivelyEngagingCommand);
                ajng a9;
                if (setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.c == 3) {
                    a9 = (ajng)setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.d;
                }
                else {
                    a9 = ajng.a;
                }
                String d3;
                if ((a9.b & 0x2) != 0x0) {
                    ajng a10;
                    if (setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.c == 3) {
                        a10 = (ajng)setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.d;
                    }
                    else {
                        a10 = ajng.a;
                    }
                    d3 = a10.d;
                }
                else {
                    d3 = s;
                    if (setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.c == 1) {
                        d3 = (String)setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.d;
                    }
                }
                if (d3 != null && (setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.b & 0x4) != 0x0) {
                    final Object a11 = this.a;
                    ajng a12;
                    if (setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.c == 3) {
                        a12 = (ajng)setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.d;
                    }
                    else {
                        a12 = ajng.a;
                    }
                    ajnf ajnf;
                    if ((ajnf = ajnf.b(a12.c)) == null) {
                        ajnf = ajnf.a;
                    }
                    ((kvd)a11).a(ajnf).t(d3, setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.e);
                }
                return;
            }
            case 3: {
                final acpd acpd = (acpd)tmy.O(map, (Object)"sectionListController", (Class)acpd.class);
                if (acpd != null) {
                    final ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint = (ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint)((agzd)d).rr((agyr)ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.scrollToSectionEndpoint);
                    Object o2 = runnable;
                    if ((scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.b & 0x2) != 0x0) {
                        o2 = new cog(this, scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint, 19, (byte[])null);
                    }
                    if (!acpd.mB(scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.c, scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.e, (Runnable)o2) && o2 != null) {
                        ((Runnable)o2).run();
                    }
                }
                return;
            }
            case 2: {
                if (((utk)this.a).w()) {
                    final Object a13 = this.a;
                    aexq aexq;
                    if (!((agzd)d).rs((agyr)ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.resizeEngagementPanelToFullBleedEndpoint)) {
                        aexq = aewp.a;
                    }
                    else {
                        final ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint = (ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint)((agzd)d).rr((agyr)ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.resizeEngagementPanelToFullBleedEndpoint);
                        ajng a14;
                        if (resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.b == 2) {
                            a14 = (ajng)resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.c;
                        }
                        else {
                            a14 = ajng.a;
                        }
                        String d4;
                        if ((a14.b & 0x2) != 0x0) {
                            ajng a15;
                            if (resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.b == 2) {
                                a15 = (ajng)resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.c;
                            }
                            else {
                                a15 = ajng.a;
                            }
                            d4 = a15.d;
                        }
                        else if (resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.b == 1) {
                            d4 = (String)resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.c;
                        }
                        else {
                            d4 = null;
                        }
                        aexq = aexq.j((Object)d4);
                    }
                    aexq aexq2;
                    if (aexq.h() && Objects.equals((Object)((utk)a13).h(), aexq.c())) {
                        aexq2 = aexq.k((Object)uwc.a);
                    }
                    else {
                        aexq aexq3;
                        if (!((agzd)d).rs((agyr)ResizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint.resizeEngagementPanelToMaximizedEndpoint)) {
                            aexq3 = aewp.a;
                        }
                        else {
                            final ResizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint resizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint = (ResizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint)((agzd)d).rr((agyr)ResizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint.resizeEngagementPanelToMaximizedEndpoint);
                            ajng a16;
                            if (resizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint.b == 2) {
                                a16 = (ajng)resizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint.c;
                            }
                            else {
                                a16 = ajng.a;
                            }
                            String d5;
                            if ((a16.b & 0x2) != 0x0) {
                                ajng a17;
                                if (resizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint.b == 2) {
                                    a17 = (ajng)resizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint.c;
                                }
                                else {
                                    a17 = ajng.a;
                                }
                                d5 = a17.d;
                            }
                            else {
                                d5 = s2;
                                if (resizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint.b == 1) {
                                    d5 = (String)resizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint.c;
                                }
                            }
                            aexq3 = aexq.j((Object)d5);
                        }
                        if (aexq3.h() && Objects.equals((Object)((utk)a13).h(), aexq3.c())) {
                            aexq2 = aexq.k((Object)uwc.b);
                        }
                        else {
                            aexq2 = aewp.a;
                        }
                    }
                    if (aexq2.h()) {
                        ((utk)this.a).g().e.a((uwc)aexq2.c());
                    }
                }
                return;
            }
            case 1: {
                final RefreshCommandOuterClass$RefreshCommand refreshCommandOuterClass$RefreshCommand = (RefreshCommandOuterClass$RefreshCommand)((agzd)d).rr((agyr)RefreshCommandOuterClass$RefreshCommand.refreshCommand);
                if (refreshCommandOuterClass$RefreshCommand != null) {
                    final int bq = aqql.bQ(refreshCommandOuterClass$RefreshCommand.c);
                    if (bq != 0) {
                        n = bq;
                    }
                    if (n == 2) {
                        ((ggv)this.a).p();
                        return;
                    }
                    if (n == 3) {
                        ((ggv)this.a).q();
                    }
                }
                return;
            }
            case 0: {
                if (((agzd)d).rs((agyr)RefreshAppActionOuterClass$RefreshAppAction.refreshAppAction)) {
                    final Iterator<Object> iterator = ((Set<Object>)this.a).iterator();
                    while (iterator.hasNext()) {
                        iterator.next().run();
                    }
                    return;
                }
                throw new vbh();
            }
        }
    }
}
