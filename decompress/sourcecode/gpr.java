import android.view.View;
import android.text.Spanned;
import android.widget.TextView;
import android.os.Bundle;
import com.google.protos.youtube.api.innertube.YpcOffersEndpoint$YPCOffersEndpoint;
import com.google.protos.youtube.api.innertube.ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand;
import com.google.protos.youtube.api.innertube.ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand;
import com.google.protos.youtube.api.innertube.ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand;
import com.google.protos.youtube.api.innertube.DeleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand;
import com.google.protos.youtube.api.innertube.SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand;
import com.google.protos.youtube.api.innertube.MenuEndpointOuterClass$MenuEndpoint;
import com.google.protos.youtube.api.innertube.ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction;
import com.google.protos.youtube.api.innertube.SetAppThemeCommandOuterClass$SetAppThemeCommand;
import com.google.protos.youtube.api.innertube.BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import com.google.protos.youtube.api.innertube.LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint;
import com.google.protos.youtube.api.innertube.RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint;
import com.google.protos.youtube.api.innertube.KeyMomentsPlayerScrimOverlayRendererOuterClass;
import j$.util.Optional;
import com.google.protos.youtube.api.innertube.ChapterMarkerMessagePlayerScrimOverlayRendererOuterClass;
import com.google.protos.youtube.api.innertube.ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand;
import com.google.protos.youtube.api.innertube.LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand;
import com.google.protos.youtube.api.innertube.ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint;
import com.google.protos.youtube.api.innertube.CommentSectionRendererOuterClass;
import com.google.protos.youtube.api.innertube.AddRendererToItemSectionActionOuterClass;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReplaceBackstagePostActionOuterClass;
import com.google.protos.youtube.api.innertube.UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint;
import android.widget.SeekBar$OnSeekBarChangeListener;
import java.util.List;
import android.content.DialogInterface$OnCancelListener;
import android.content.DialogInterface$OnShowListener;
import com.google.protos.youtube.api.innertube.UnpluggedPauseMembershipDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand;
import java.util.Map;
import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;
import java.util.concurrent.Executor;
import android.content.Context;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gpr implements vau
{
    public final Object a;
    private final /* synthetic */ int c;
    private final Object d;
    
    public gpr(final acha d, final tdz a, final int c) {
        this.c = c;
        d.getClass();
        this.d = d;
        a.getClass();
        this.a = a;
    }
    
    public gpr(final addr d, final bu a, final int c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        d.getClass();
        this.d = d;
        this.a = a;
    }
    
    public gpr(final addr d, final bu a, final int c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.c = c;
        d.getClass();
        this.d = d;
        this.a = a;
    }
    
    public gpr(final Activity a, final gko d, final int c) {
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public gpr(final Activity a, final vax d, final int c) {
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public gpr(final Context a, final xlv d, final int c) {
        this.c = c;
        a.getClass();
        this.a = a;
        d.getClass();
        this.d = d;
    }
    
    public gpr(final atjj d, final abpj a, final int c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public gpr(final atjj a, final atjj d, final int c) {
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public gpr(final atjj d, final kyp a, final int c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public gpr(final bu a, final abno d, final int c) {
        this.c = c;
        this.a = a;
        d.getClass();
        this.d = d;
    }
    
    public gpr(final hlk a, final wwu d, final int c) {
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public gpr(final hnj d, final gnv a, final int c) {
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public gpr(final Executor d, final SfvAudioItemPlaybackController a, final int c) {
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public gpr(final jbg a, final jcm d, final int c) {
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public gpr(final ozg a, final vax d, final int c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public gpr(final rhz a, final aeby d, final int c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public gpr(final slt a, final wwu d, final int c) {
        this.c = c;
        a.getClass();
        this.a = a;
        this.d = d;
    }
    
    public gpr(final tdz a, final aeby d, final int c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public gpr(final vax d, final grv a, final int c) {
        this.c = c;
        d.getClass();
        this.d = d;
        this.a = a;
    }
    
    public gpr(final wvu a, final wwu d, final int c) {
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public gpr(final wwu d, final svo a, final int c) {
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    private final wwv b() {
        return ((wwu)this.d).n();
    }
    
    public final void mE(aioe aioe, final Map map) {
        final int c = this.c;
        int n = -1;
        boolean b = false;
        final ahmt ahmt = null;
        final antc antc = null;
        final int n2 = 1;
        switch (c) {
            default: {
                anss anss;
                if ((anss = ((YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand)((agzd)aioe).rr((agyr)YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand.ypcPauseMembershipDialogCommand)).b) == null) {
                    anss = anss.a;
                }
                final apbw j = (apbw)((agzd)anss).rr((agyr)UnpluggedPauseMembershipDialogRendererOuterClass.unpluggedPauseMembershipDialogRenderer);
                final acij acij = new acij();
                acij.a(((wwu)this.d).n());
                final svo svo = (svo)this.a;
                svo.j = j;
                svo.i.setOnShowListener((DialogInterface$OnShowListener)new stl(svo, 2));
                svo.i.setOnCancelListener((DialogInterface$OnCancelListener)new fak(svo, 5));
                final TextView c2 = svo.c;
                ajsq ajsq;
                if ((ajsq = svo.j.b) == null) {
                    ajsq = ajsq.a;
                }
                tmy.t(c2, (CharSequence)abyh.b(ajsq));
                final Spanned[] n3 = abyh.n((List)svo.j.c);
                tmy.t(svo.d, (CharSequence)svo.a(n3, 0));
                tmy.t(svo.e, (CharSequence)svo.a(n3, 1));
                svo.f.setMax(svo.j.d.size() - 1);
                svo.f.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new hfq(svo, 2));
                final int e = svo.j.e;
                svo.k = e;
                svo.f.setProgress(e);
                svo.b();
                final wwv a = acij.a;
                final acqu g = svo.g;
                aibc aibc;
                if ((aibc = svo.j.f) == null) {
                    aibc = aibc.a;
                }
                aibb aibb;
                if ((aibc.b & 0x1) != 0x0) {
                    aibc aibc2;
                    if ((aibc2 = svo.j.f) == null) {
                        aibc2 = aibc.a;
                    }
                    if ((aibb = aibc2.c) == null) {
                        aibb = aibb.a;
                    }
                }
                else {
                    aibb = null;
                }
                ((acqt)g).b(aibb, a);
                ((acqt)svo.g).c = (acqs)new stb(svo, 2);
                final acqu h = svo.h;
                final aibc g2 = svo.j.g;
                aibc a2;
                if (g2 == null) {
                    a2 = aibc.a;
                }
                else {
                    a2 = g2;
                }
                aibb aibb2;
                if ((a2.b & 0x1) != 0x0) {
                    aibc a3;
                    if ((a3 = g2) == null) {
                        a3 = aibc.a;
                    }
                    if ((aibb2 = a3.c) == null) {
                        aibb2 = aibb.a;
                    }
                }
                else {
                    aibb2 = null;
                }
                ((acqt)h).b(aibb2, a);
                ((acqt)svo.h).c = (acqs)new rfk(svo, a, 4);
                ((acqt)svo.g).d = (acqr)new jec(svo, 3);
                a.t((wxz)new wws(j.h), (alff)null);
                final View viewById = svo.b.findViewById(2131431270);
                final double n4 = svo.i.getContext().getResources().getDisplayMetrics().heightPixels;
                Double.isNaN(n4);
                final int height = (int)(n4 * 0.5);
                viewById.getLayoutParams().height = -2;
                if (viewById.getMeasuredHeight() > height) {
                    viewById.getLayoutParams().height = height;
                }
                svo.i.show();
                return;
            }
            case 19: {
                final UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint = (UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint)((agzd)aioe).rr((agyr)UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.updateCommentReplyDialogEndpoint);
                if (updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.c && this.b() != null) {
                    this.b().J(3, (wxz)new wws(wya.c(104381)), (alff)null);
                }
                apdt apdt;
                if ((apdt = updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.b) == null) {
                    apdt = apdt.a;
                }
                if (apdt.b != 97806346) {
                    trn.b("Executed UpdateCommentReplyDialogEndpoint with no CommentReplyDialogRenderer.");
                    return;
                }
                final boolean c3 = updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.c;
                final Object m = tmy.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag");
                if (m instanceof smc && m instanceof slk) {
                    final Object a4 = this.a;
                    apdt apdt2;
                    if ((apdt2 = updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.b) == null) {
                        apdt2 = apdt.a;
                    }
                    aiqc a5;
                    if (apdt2.b == 97806346) {
                        a5 = (aiqc)apdt2.c;
                    }
                    else {
                        a5 = aiqc.a;
                    }
                    ((slt)a4).q(a5, ((smc)m).e(), ((slk)m).d(), false);
                    return;
                }
                final Object a6 = this.a;
                apdt apdt3;
                if ((apdt3 = updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.b) == null) {
                    apdt3 = apdt.a;
                }
                aiqc a7;
                if (apdt3.b == 97806346) {
                    a7 = (aiqc)apdt3.c;
                }
                else {
                    a7 = aiqc.a;
                }
                ((slt)a6).q(a7, (smh)null, (aipu)null, c3);
                return;
            }
            case 18: {
                antc antc2 = antc;
                if (((agzd)aioe).rs((agyr)ReplaceBackstagePostActionOuterClass.replaceBackstagePostAction)) {
                    antc2 = (antc)((agzd)aioe).rr((agyr)ReplaceBackstagePostActionOuterClass.replaceBackstagePostAction);
                }
                if (antc2 == null) {
                    trn.b("ReplaceBackstagePostActionResolver received an action other than ReplaceBackstagePostAction.");
                    return;
                }
                if ((antc2.b & 0x1) != 0x0) {
                    anss anss2;
                    if ((anss2 = antc2.d) == null) {
                        anss2 = anss.a;
                    }
                    if (((agzd)anss2).rs((agyr)ElementRendererOuterClass.elementRenderer)) {
                        final Object d = this.d;
                        anss anss3;
                        if ((anss3 = antc2.d) == null) {
                            anss3 = anss.a;
                        }
                        ((vup)((rhz)this.a).a).C((Object)new uxs((Object)((aeby)d).ae((ajkj)((agzd)anss3).rr((agyr)ElementRendererOuterClass.elementRenderer)), (aext)new qwc(antc2, 6)));
                    }
                }
                return;
            }
            case 17: {
                ahmt ahmt2 = ahmt;
                if (((agzd)aioe).rs((agyr)AddRendererToItemSectionActionOuterClass.addRendererToItemSectionAction)) {
                    ahmt2 = (ahmt)((agzd)aioe).rr((agyr)AddRendererToItemSectionActionOuterClass.addRendererToItemSectionAction);
                }
                if (ahmt2 == null) {
                    trn.b("AddRendererToItemSectionActionResolver received an action other than AddRendererToItemSectionAction.");
                    return;
                }
                final int b2 = ahmt2.b;
                if ((b2 & 0x1) == 0x0) {
                    trn.b("AddRendererToItemSectionAction has no renderer.");
                    return;
                }
                if ((b2 & 0x2) != 0x0) {
                    anss anss4;
                    if ((anss4 = ahmt2.c) == null) {
                        anss4 = anss.a;
                    }
                    Object o;
                    if (((agzd)anss4).rs((agyr)ElementRendererOuterClass.elementRenderer)) {
                        o = ((aeby)this.d).ae((ajkj)((agzd)anss4).rr((agyr)ElementRendererOuterClass.elementRenderer));
                    }
                    else if (((agzd)anss4).rs((agyr)CommentSectionRendererOuterClass.commentThreadRenderer)) {
                        o = ((agzd)anss4).rr((agyr)CommentSectionRendererOuterClass.commentThreadRenderer);
                    }
                    else {
                        if (!((agzd)anss4).rs((agyr)anir.a)) {
                            trn.b("AddRendererToItemSectionAction contains an unsupported renderer.");
                            return;
                        }
                        o = ((agzd)anss4).rr((agyr)anir.a);
                    }
                    final Object a8 = this.a;
                    final String d2 = ahmt2.d;
                    final int d3 = alhb.d(ahmt2.e);
                    if (d3 == 0 || d3 != 3) {
                        n = 0;
                    }
                    ((tdz)a8).e((Object)d2, (Object)new uxo(o, n, d2));
                    return;
                }
                trn.b("AddRendererToItemSectionAction has no target item section.");
                return;
            }
            case 16: {
                final addr addr = (addr)this.d;
                final vlc vlc = new vlc(addr.c, ((zki)addr.d).c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                final vlb vlb = (vlb)tmy.O(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag", (Class)vlb.class);
                vlc.a = (long)tmy.O(map, (Object)"KEY_IDV_REQUEST_ID", (Class)Long.class);
                vlc.b = (String)tmy.O(map, (Object)"KEY_VERIFICATION_CODE", (Class)String.class);
                vlc.c = (String)tmy.O(map, (Object)"KEY_PARAMS", (Class)String.class);
                final Object a9 = this.a;
                final addr addr2 = (addr)this.d;
                tcp.n((aum)a9, ((vkh)addr2.f).b((vjn)vlc, (Executor)addr2.e), (trb)new kpx(vlb, 18), (trb)new kpx(vlb, 19));
                return;
            }
            case 15: {
                final addr addr3 = (addr)this.d;
                final vla vla = new vla(addr3.c, ((zki)addr3.d).c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                final vkz vkz = (vkz)tmy.O(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag", (Class)vkz.class);
                akwg a10;
                if ((a10 = (akwg)tmy.O(map, (Object)"KEY_CODE_DELIVERY_METHOD", (Class)akwg.class)) == null) {
                    a10 = akwg.a;
                }
                vla.b = (String)tmy.O(map, (Object)"KEY_PHONE_NUMBER", (Class)String.class);
                vla.c = (String)tmy.O(map, (Object)"KEY_COUNTRY_CODE", (Class)String.class);
                vla.a = a10;
                final Object a11 = this.a;
                final addr addr4 = (addr)this.d;
                tcp.n((aum)a11, ((vkh)addr4.f).b((vjn)vla, (Executor)addr4.e), (trb)new kpx(vkz, 16), (trb)new kpx(vkz, 17));
                return;
            }
            case 14: {
                final ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint = (ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint)((agzd)aioe).rr((agyr)ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.channelCreationServiceEndpoint);
                if ((channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.b & 0x2) == 0x0) {
                    ((req)((atjj)this.d).a()).aL(aioe);
                    return;
                }
                apxj apxj;
                if ((apxj = channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.d) == null) {
                    apxj = apxj.a;
                }
                final int b3 = apxj.b;
                if (b3 == 1) {
                    final Object a12 = this.a;
                    final vnh vnh = (vnh)tmy.O(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag", (Class)vnh.class);
                    apxj apxj2;
                    if ((apxj2 = channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.d) == null) {
                        apxj2 = apxj.a;
                    }
                    final agza builder = ((agzi)apxj2).toBuilder();
                    final abpj abpj = (abpj)a12;
                    final vlx u = ((addp)abpj.e).u();
                    u.a = channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.c;
                    if (vnh != null) {
                        final apxj apxj3 = (apxj)builder.instance;
                        apxk a13;
                        if (apxj3.b == 1) {
                            a13 = (apxk)apxj3.c;
                        }
                        else {
                            a13 = apxk.a;
                        }
                        final agza builder2 = ((agzi)a13).toBuilder();
                        final String c4 = vnh.c();
                        builder2.copyOnWrite();
                        final apxk apxk = (apxk)builder2.instance;
                        c4.getClass();
                        apxk.b |= 0x1;
                        apxk.c = c4;
                        final apxk c5 = (apxk)builder2.build();
                        builder.copyOnWrite();
                        final apxj apxj4 = (apxj)builder.instance;
                        c5.getClass();
                        apxj4.c = c5;
                        apxj4.b = 1;
                    }
                    u.d = (apxj)builder.build();
                    tcp.k(((addp)abpj.e).v(u, (Executor)abpj.h), (Executor)abpj.h, (tcn)new fwj(abpj, vnh, builder, 3, (byte[])null, (byte[])null), (tco)new fct(abpj, vnh, builder, 16, (byte[])null, (byte[])null));
                    return;
                }
                if (b3 == 3) {
                    final abpj abpj2 = (abpj)this.a;
                    final vlx u2 = ((addp)abpj2.e).u();
                    u2.a = channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.c;
                    final apxj d4 = channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.d;
                    apxj a14;
                    if (d4 == null) {
                        a14 = apxj.a;
                    }
                    else {
                        a14 = d4;
                    }
                    u2.d = a14;
                    apxj a15 = d4;
                    if (d4 == null) {
                        a15 = apxj.a;
                    }
                    apxl a16;
                    if (a15.b == 3) {
                        a16 = (apxl)a15.c;
                    }
                    else {
                        a16 = apxl.a;
                    }
                    tcp.k(((addp)abpj2.e).v(u2, (Executor)abpj2.h), (Executor)abpj2.h, (tcn)new htl(abpj2, 14, (byte[])null, (byte[])null), (tco)new fct(abpj2, a16.c, channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint, 15, (byte[])null, (byte[])null));
                    return;
                }
                throw new vbh("Zero step parameters not set.");
            }
            case 13: {
                final LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand logBackToAppEventCommandOuterClass$LogBackToAppEventCommand = (LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand)((agzd)aioe).rr((agyr)LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand.logBackToAppEventCommand);
                final aklo d5 = aklq.d();
                final ahwf a17 = ahwg.a();
                int dh;
                if ((dh = aqql.dH(logBackToAppEventCommandOuterClass$LogBackToAppEventCommand.b)) == 0) {
                    dh = 1;
                }
                int n5;
                if (--dh != 1) {
                    if (dh != 2) {
                        if (dh != 3) {
                            n5 = 83769;
                        }
                        else {
                            n5 = 3832;
                        }
                    }
                    else {
                        n5 = 6827;
                    }
                }
                else {
                    n5 = 4724;
                }
                ((agza)a17).copyOnWrite();
                ahwg.c((ahwg)a17.instance, n5);
                final ahwg ahwg = (ahwg)((agza)a17).build();
                ((agza)d5).copyOnWrite();
                aklq.ad((aklq)d5.instance, ahwg);
                ((wvu)this.a).d((aklq)((agza)d5).build());
                final wwv n6 = ((wwu)this.d).n();
                final agza builder3 = ((agzi)alff.a).createBuilder();
                final agza builder4 = ((agzi)alfj.a).createBuilder();
                final agza builder5 = ((agzi)alfi.a).createBuilder();
                final long currentTimeMillis = System.currentTimeMillis();
                builder5.copyOnWrite();
                final alfi alfi = (alfi)builder5.instance;
                alfi.b |= 0x1;
                alfi.c = currentTimeMillis;
                builder4.copyOnWrite();
                final alfj alfj = (alfj)builder4.instance;
                final alfi alfi2 = (alfi)builder5.build();
                alfi2.getClass();
                final agzy b4 = alfj.b;
                if (!b4.c()) {
                    alfj.b = agzi.mutableCopy(b4);
                }
                alfj.b.add(alfi2);
                builder3.copyOnWrite();
                final alff alff = (alff)builder3.instance;
                final alfj h2 = (alfj)builder4.build();
                h2.getClass();
                alff.H = h2;
                alff.c |= 0x2000000;
                n6.w((wxz)new wws(aioe.c), (alff)builder3.build());
                return;
            }
            case 12: {
                if (((agzd)aioe).rs((agyr)ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand.showTransientPlayerScrimOverlayCommand)) {
                    final ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand showTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand = (ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand)((agzd)aioe).rr((agyr)ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand.showTransientPlayerScrimOverlayCommand);
                    final int c6 = showTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand.c;
                    final int d6 = showTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand.d;
                    final int e2 = showTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand.e;
                    anss anss5;
                    if ((anss5 = showTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand.b) == null) {
                        anss5 = anss.a;
                    }
                    Optional optional;
                    if (((agzd)anss5).rs((agyr)ChapterMarkerMessagePlayerScrimOverlayRendererOuterClass.chapterMarkerMessagePlayerScrimOverlayRenderer)) {
                        final aiir aiir = (aiir)((agzd)anss5).rr((agyr)ChapterMarkerMessagePlayerScrimOverlayRendererOuterClass.chapterMarkerMessagePlayerScrimOverlayRenderer);
                        if ((0x4 & aiir.b) != 0x0) {
                            final Object a18 = this.a;
                            ajsq ajsq2;
                            if ((ajsq2 = aiir.c) == null) {
                                ajsq2 = ajsq.a;
                            }
                            final Spanned b5 = abyh.b(ajsq2);
                            ajsq ajsq3;
                            if ((ajsq3 = aiir.d) == null) {
                                ajsq3 = ajsq.a;
                            }
                            final Spanned b6 = abyh.b(ajsq3);
                            final int f = aiir.f;
                            final int e3 = aiir.e;
                            final agyc g3 = aiir.g;
                            final jbg jbg = (jbg)a18;
                            final qpt e4 = jbg.e;
                            final jbh jbh = new jbh(b5, b6, (jbc)new jbe((aays)((epq)e4.a).b.ax.a(), (asho)((epq)e4.a).a.bf.a(), (asho)((epq)e4.a).a.dO.a(), e3, f), (wxz)new wws(g3));
                            jbg.b.tr((Object)jbh);
                            optional = Optional.of((Object)jbh);
                        }
                        else {
                            final Object a19 = this.a;
                            ajsq ajsq4;
                            if ((ajsq4 = aiir.c) == null) {
                                ajsq4 = ajsq.a;
                            }
                            final Spanned b7 = abyh.b(ajsq4);
                            ajsq ajsq5;
                            if ((ajsq5 = aiir.d) == null) {
                                ajsq5 = ajsq.a;
                            }
                            optional = Optional.of((Object)((jbg)a19).e(b7, abyh.b(ajsq5), aiir.g));
                        }
                    }
                    else if (((agzd)anss5).rs((agyr)KeyMomentsPlayerScrimOverlayRendererOuterClass.keyMomentsPlayerScrimOverlayRenderer)) {
                        final alip alip = (alip)((agzd)anss5).rr((agyr)KeyMomentsPlayerScrimOverlayRendererOuterClass.keyMomentsPlayerScrimOverlayRenderer);
                        final Object a20 = this.a;
                        ajsq ajsq6;
                        if ((ajsq6 = alip.b) == null) {
                            ajsq6 = ajsq.a;
                        }
                        final Spanned b8 = abyh.b(ajsq6);
                        ajsq ajsq7;
                        if ((ajsq7 = alip.c) == null) {
                            ajsq7 = ajsq.a;
                        }
                        optional = Optional.of((Object)((jbg)a20).e(b8, abyh.b(ajsq7), alip.d));
                    }
                    else {
                        optional = Optional.empty();
                    }
                    if (optional.isPresent()) {
                        ((jcm)this.d).l((long)c6, (long)d6, (long)e2, (jbh)optional.get());
                    }
                }
                return;
            }
            case 11: {
                final String b9 = ((RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint)((agzd)aioe).rr((agyr)RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.removeFromRemoteQueueEndpoint)).b;
                final xlo g4 = ((xlv)this.d).g();
                if (g4 != null && g4.a() == 1) {
                    g4.M(b9);
                    tmy.x((Context)this.a, 2132020155, 0);
                }
                return;
            }
            case 10: {
                if (((agzd)aioe).rs((agyr)LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.liveChatDialogEndpoint)) {
                    final LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint liveChatDialogEndpointOuterClass$LiveChatDialogEndpoint = (LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint)((agzd)aioe).rr((agyr)LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.liveChatDialogEndpoint);
                    alnq alnq;
                    if ((alnq = liveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.b) == null) {
                        alnq = alnq.a;
                    }
                    if ((alnq.b & 0x1) != 0x0) {
                        alnq alnq2;
                        if ((alnq2 = liveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.b) == null) {
                            alnq2 = alnq.a;
                        }
                        alns alns;
                        if ((alns = alnq2.c) == null) {
                            alns = alns.a;
                        }
                        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)this.a);
                        ajsq ajsq8;
                        if ((alns.b & 0x1) != 0x0) {
                            if ((ajsq8 = alns.c) == null) {
                                ajsq8 = ajsq.a;
                            }
                        }
                        else {
                            ajsq8 = null;
                        }
                        final AlertDialog$Builder setMessage = alertDialog$Builder.setTitle((CharSequence)abyh.b(ajsq8)).setMessage(abyh.k((CharSequence)"\n\n", (CharSequence[])vbd.c((ajsq[])alns.d.toArray(new ajsq[0]), (vax)this.d, true)));
                        alnr alnr;
                        if ((alnr = alns.e) == null) {
                            alnr = alnr.a;
                        }
                        if (alnr.b == 65153809) {
                            alnr alnr2;
                            if ((alnr2 = alns.e) == null) {
                                alnr2 = alnr.a;
                            }
                            aibb a21;
                            if (alnr2.b == 65153809) {
                                a21 = (aibb)alnr2.c;
                            }
                            else {
                                a21 = aibb.a;
                            }
                            ajsq ajsq9;
                            if ((a21.b & 0x200) != 0x0) {
                                if ((ajsq9 = a21.i) == null) {
                                    ajsq9 = ajsq.a;
                                }
                            }
                            else {
                                ajsq9 = null;
                            }
                            setMessage.setPositiveButton((CharSequence)abyh.b(ajsq9), (DialogInterface$OnClickListener)null);
                        }
                        else {
                            setMessage.setPositiveButton(2132018938, (DialogInterface$OnClickListener)null);
                        }
                        setMessage.create().show();
                    }
                }
                return;
            }
            case 9: {
                final BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand backgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand = (BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand)((agzd)aioe).rr((agyr)BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand.backgroundFetchBrowseCommand);
                final String b10 = backgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand.b;
                if (!b10.equals("FEwhat_to_watch")) {
                    trn.b("BackgroundFetchBrowse command tried executing with an unexpected browse id: ".concat(String.valueOf(b10)));
                    return;
                }
                final uyi uyi = (uyi)((atjj)this.d).a();
                if (uyi != null && uyi.bB()) {
                    final hyc hyc = (hyc)((atjj)this.a).a();
                    anuh anuh;
                    if ((anuh = backgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand.c) == null) {
                        anuh = anuh.a;
                    }
                    anui anui;
                    if ((anui = anuh.b) == null) {
                        anui = anui.a;
                    }
                    ahtm ahtm;
                    if ((ahtm = anuh.c) == null) {
                        ahtm = ahtm.a;
                    }
                    hyc.a(5, (long)anuh.d, 0L, anui.c, (long)anui.b, ahtm.b, ahtm.c);
                    return;
                }
                trn.b("BackgroundFetchBrowse command tried executing when prefetch is disabled");
                return;
            }
            case 8: {
                if (((agzd)aioe).rs((agyr)SetAppThemeCommandOuterClass$SetAppThemeCommand.setAppThemeCommand)) {
                    final SetAppThemeCommandOuterClass$SetAppThemeCommand setAppThemeCommandOuterClass$SetAppThemeCommand = (SetAppThemeCommandOuterClass$SetAppThemeCommand)((agzd)aioe).rr((agyr)SetAppThemeCommandOuterClass$SetAppThemeCommand.setAppThemeCommand);
                    final gkm a22 = ((gko)this.d).a();
                    int bd = aqql.bD(setAppThemeCommandOuterClass$SetAppThemeCommand.b);
                    if (bd == 0) {
                        bd = n2;
                    }
                    if (--bd != 2) {
                        if (bd != 3) {
                            if (a22 == gkm.a) {
                                return;
                            }
                            ((gko)this.d).d(gkm.a);
                        }
                        else {
                            final gkm c7 = ((gko)this.d).c();
                            ((gko)this.d).e();
                            if (a22 == c7) {
                                return;
                            }
                        }
                    }
                    else {
                        if (a22 == gkm.b) {
                            return;
                        }
                        ((gko)this.d).d(gkm.b);
                    }
                    ((Activity)this.a).recreate();
                    return;
                }
                throw new vbh("Expected a SetAppThemeCommand, but did not find one.");
            }
            case 7: {
                final Object i = tmy.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag");
                antd antd;
                if ((antd = ((ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction)((agzd)aioe).rr((agyr)ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.replaceEnclosingAction)).c) == null) {
                    antd = antd.a;
                }
                if (i != null) {
                    ((tdz)this.a).d((Object)hxz.a(i, antd));
                }
                if ((antd.b & 0x10) != 0x0) {
                    aifv aifv;
                    if ((aifv = antd.g) == null) {
                        aifv = aifv.a;
                    }
                    final hsm hsm = new hsm(aifv);
                    ((acha)this.d).c(hsm.b, (acgy)hsm);
                }
                return;
            }
            case 6: {
                final Object a23 = this.a;
                aioe = ((wwu)this.d).n().f(aioe);
                ((hlk)a23).d(aioe, kfe.b(map), false);
                return;
            }
            case 5: {
                final Optional a24 = ((hnj)this.d).a();
                amer amer;
                if ((amer = ((MenuEndpointOuterClass$MenuEndpoint)((agzd)aioe).rr((agyr)MenuEndpointOuterClass$MenuEndpoint.menuEndpoint)).c) == null) {
                    amer = amer.a;
                }
                ameo ameo;
                if ((ameo = amer.c) == null) {
                    ameo = ameo.a;
                }
                if (ameo.k && a24.isPresent()) {
                    ((hnk)a24.get()).B(ameo);
                    return;
                }
                ((gnv)this.a).mE(aioe, map);
                return;
            }
            case 4: {
                agot.u(((agzd)aioe).rs((agyr)SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.sfvAudioItemPlaybackCommand));
                if (0x1 == (((SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand)((agzd)aioe).rr((agyr)SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.sfvAudioItemPlaybackCommand)).b & 0x1)) {
                    b = true;
                }
                agot.u(b);
                ((Executor)this.d).execute(aesm.h((Runnable)new fsa(this, aioe, 18, (byte[])null)));
                return;
            }
            case 3: {
                aioe.getClass();
                if (((agzd)aioe).rs((agyr)DeleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand.deleteClipEngagementPanelCommand)) {
                    ((grv)this.a).o();
                    final DeleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand deleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand = (DeleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand)((agzd)aioe).rr((agyr)DeleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand.deleteClipEngagementPanelCommand);
                    if ((deleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand.b & 0x1) != 0x0) {
                        final Object d7 = this.d;
                        if ((aioe = deleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand.c) == null) {
                            aioe = aioe.a;
                        }
                        ((vax)d7).a(aioe);
                    }
                    return;
                }
                throw new vbh();
            }
            case 2: {
                final ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand showAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand = (ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand)((agzd)aioe).rr((agyr)ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand.showAccountLinkDialogFromDeepLinkCommand);
                final int b11 = showAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand.b;
                if ((b11 & 0x2) != 0x0) {
                    if (((ozg)this.a).a != showAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand.d) {
                        if ((b11 & 0x1) != 0x0) {
                            final Object d8 = this.d;
                            if ((aioe = showAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand.c) == null) {
                                aioe = aioe.a;
                            }
                            ((vax)d8).a(aioe);
                            ((ozg)this.a).a = showAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand.d;
                        }
                    }
                }
                return;
            }
            case 1: {
                final utk utk = (utk)((kvd)((atjj)this.d).a()).b().aG();
                final ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand = (ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand)((agzd)aioe).rr((agyr)ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.showCommentRepliesEngagementPanelCommand);
                String k;
                if ((showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.b & 0x40) != 0x0) {
                    k = showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.i;
                }
                else {
                    k = (String)tmy.O(map, (Object)"engagement_panel_id_key", (Class)String.class);
                }
                vem.G(aioe, utk, (usz)null, k, false, map);
                return;
            }
            case 0: {
                if (((agzd)aioe).rs((agyr)ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.showSponsorshipsDialogCommand)) {
                    final ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand showSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand = (ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand)((agzd)aioe).rr((agyr)ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.showSponsorshipsDialogCommand);
                    if ((aioe = showSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.b) == null) {
                        aioe = aioe.a;
                    }
                    if (((agzd)aioe).rs((agyr)YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint)) {
                        if (((abno)this.d).f()) {
                            ((abno)this.d).a();
                        }
                        if ((aioe = showSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.b) == null) {
                            aioe = aioe.a;
                        }
                        final sys sys = new sys();
                        final Bundle bundle = new Bundle();
                        bundle.putByteArray("get_offers_command", ((agxl)aioe).toByteArray());
                        sys.ag(bundle);
                        sys.rD(((bu)this.a).getSupportFragmentManager(), "sponsorships_offer_dialog");
                    }
                }
            }
        }
    }
}
