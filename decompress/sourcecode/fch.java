import android.app.AlertDialog$Builder;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import android.content.DialogInterface$OnClickListener;
import com.google.protos.youtube.api.innertube.AdFeedbackEndpointOuterClass$AdFeedbackEndpoint;
import com.google.android.apps.youtube.app.extensions.reel.edit.activity.ReelCameraActivity;
import com.google.protos.youtube.api.innertube.CreatePostCommandOuterClass;
import com.google.protos.youtube.api.innertube.GetSurveyCommandOuterClass$GetSurveyCommand;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.GetWatchNextQueueAddCommandOuterClass$GetWatchNextQueueAddCommand;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.AccountUnlinkCommandOuterClass$AccountUnlinkCommand;
import android.accounts.Account;
import android.net.Uri;
import android.os.RemoteException;
import com.google.protos.youtube.api.innertube.CreateGpgProfileCommand$CreateGPGProfileCommand;
import android.content.Intent;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.activity.ShortsCreationActivity;
import com.google.protos.youtube.api.innertube.ShortsCreationEndpointOuterClass$ShortsCreationEndpoint;
import com.google.protos.youtube.api.innertube.ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import j$.util.Optional;
import com.google.protos.youtube.api.innertube.ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand;
import com.google.protos.youtube.api.innertube.CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint;
import java.util.List;
import com.google.protos.youtube.api.innertube.PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint;
import com.google.protos.youtube.api.innertube.YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint;
import com.google.protos.youtube.api.innertube.SetSettingEndpointOuterClass$SetSettingEndpoint;
import com.google.protos.youtube.api.innertube.LiveChatActionEndpointOuterClass$LiveChatActionEndpoint;
import com.google.protos.youtube.api.innertube.ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint;
import com.google.protos.youtube.api.innertube.UpsellDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.LiveChatAction$ShowLiveChatDialogAction;
import com.google.protobuf.MessageLite;
import java.util.concurrent.TimeUnit;
import com.google.protos.youtube.api.innertube.CreateLivestreamHighlightClipCommandOuterClass;
import java.util.Map;
import com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.PlayerRotationLatencyLoggerController;
import android.content.Context;
import android.app.Activity;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fch implements vau
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    private final /* synthetic */ int g;
    
    public fch(final addp c, final gbg e, final Executor d, final wwu a, final sli b, final int g, final byte[] array, final byte[] array2, final byte[] array3) {
        this.g = g;
        this.c = c;
        this.e = e;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public fch(final adjo e, final wwu a, final zki d, final vbq c, final vax b, final int g, final byte[] array, final byte[] array2, final byte[] array3) {
        this.g = g;
        this.e = e;
        this.a = a;
        this.d = d;
        this.c = c;
        this.b = b;
    }
    
    public fch(final Activity e, final gqn b, final lzi c, final zki d, final vax a, final int g, final byte[] array, final byte[] array2, final byte[] array3) {
        this.g = g;
        this.e = e;
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public fch(final Activity e, final vax c, final tdz b, final aeby a, final aeby d, final int g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.g = g;
        e.getClass();
        this.e = e;
        c.getClass();
        this.c = c;
        b.getClass();
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    public fch(final Activity e, final xgc c, final aceo d, final vax b, final wwv a, final int g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.g = g;
        this.e = e;
        this.c = c;
        this.d = d;
        this.b = b;
        this.a = a;
    }
    
    public fch(final Context e, final addr a, final wha c, final vax b, final Executor d, final int g, final byte[] array, final byte[] array2, final byte[] array3) {
        this.g = g;
        e.getClass();
        this.e = e;
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
    }
    
    public fch(final Context e, final ktd c, final abno d, final fjq b, final arud a, final int g, final byte[] array, final byte[] array2) {
        this.g = g;
        this.e = e;
        this.c = c;
        this.d = d;
        this.b = b;
        this.a = a;
    }
    
    public fch(final Context e, final vax b, final wwv c, final acng d, final aeby a, final int g, final byte[] array, final byte[] array2, final byte[] array3) {
        this.g = g;
        e.getClass();
        this.e = e;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public fch(final bu e, final abno d, final abno a, final zki c, final zjy b, final int g) {
        this.g = g;
        this.e = e;
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public fch(final bu e, final nod b, final lzi c, final zki d, final vax a, final int g, final byte[] array, final byte[] array2, final byte[] array3) {
        this.g = g;
        this.e = e;
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public fch(final bu e, final thh a, final jro c, final hru b, final uyi d, final int g) {
        this.g = g;
        this.e = e;
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    public fch(final ghb e, final abrx d, final ghg b, final uyi a, final PlayerRotationLatencyLoggerController c, final int g) {
        this.g = g;
        this.e = e;
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public fch(final rkw c, final Activity e, final rjq b, final vkv a, final zki d, final int g) {
        this.g = g;
        this.c = c;
        this.e = e;
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    public fch(final vax b, final auip d, final agls c, final elw e, final abit a, final int g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.g = g;
        this.b = b;
        this.d = d;
        this.c = c;
        this.e = e;
        this.a = a;
    }
    
    public fch(final vmh a, final tny b, final vax c, final Executor d, final bu e, final int g) {
        this.g = g;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public fch(final vne a, final adcr c, final zki d, final vax b, final tny e, final int g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.g = g;
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
        this.e = e;
    }
    
    public fch(final vne c, final atjj d, final smn e, final uyf b, final Executor a, final int g) {
        this.g = g;
        this.e = e;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        b.getClass();
        this.b = b;
        this.a = a;
    }
    
    public fch(final vqq b, final xgc c, final vxz a, final tny e, final Executor d, final int g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.g = g;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        a.getClass();
        this.a = a;
        e.getClass();
        this.e = e;
        this.d = d;
    }
    
    public fch(final vqq b, final xgc c, final vxz a, final tny e, final Executor d, final int g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.g = g;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        a.getClass();
        this.a = a;
        e.getClass();
        this.e = e;
        this.d = d;
    }
    
    public fch(final vup b, final atjj d, final tny e, final Executor a, final zki c, final int g, final byte[] array, final byte[] array2) {
        this.g = g;
        this.b = b;
        this.d = d;
        this.e = e;
        this.a = a;
        this.c = c;
    }
    
    public fch(final vvq a, final bu e, final sxv c, final Executor d, final int g, final byte[] array) {
        this.g = g;
        this.a = a;
        this.e = e;
        this.c = c;
        this.d = d;
        this.b = new svm();
    }
    
    public static aioe c(final CommandExecutorCommandOuterClass$CommandExecutorCommand commandExecutorCommandOuterClass$CommandExecutorCommand) {
        final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
        agzc.e((agyr)CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand, (Object)commandExecutorCommandOuterClass$CommandExecutorCommand);
        return (aioe)((agza)agzc).build();
    }
    
    private final wwv d() {
        return ((wwu)this.a).n();
    }
    
    public final void mE(aioe mpc, Map a) {
        final mpc a2 = mpc;
        final int g = this.g;
        int n = 2;
        int b = 1;
        final ajsq ajsq = null;
        final aiva aiva = null;
        switch (g) {
            default: {
                ((Map)a).getClass();
                agot.u(((Map)a).containsKey((Object)"callback"));
                agot.u(((Map)a).get("callback") instanceof whr);
                agot.u(((Map)a).containsKey((Object)"menuIndex"));
                agot.u(((Map)a).get("menuIndex") instanceof Integer);
                final whb k = ((wha)this.c).k();
                if (k == null) {
                    trn.b("HighlightFrontendIdGenerator null - livestream not in progress?");
                    return;
                }
                akke akke;
                if ((akke = ((aiyf)((agzd)a2).rr((agyr)CreateLivestreamHighlightClipCommandOuterClass.createLivestreamHighlightClipCommand)).b) == null) {
                    akke = akke.a;
                }
                final addr addr = (addr)this.a;
                final wji wji = new wji(addr.c, ((zki)addr.d).c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                wji.a = akke.b;
                wji.b = ((wqr)k).aE.m.b();
                wji.c = TimeUnit.SECONDS.convert(akke.c, TimeUnit.MILLISECONDS);
                wji.d = (int)TimeUnit.NANOSECONDS.convert(akke.c % 1000L, TimeUnit.MILLISECONDS);
                wji.e = 3;
                final Object a3 = this.a;
                final akkg a4 = akkg.a;
                final addr addr2 = (addr)a3;
                final ListenableFuture b2 = ((vkm)a3).c((MessageLite)a4, (vjh)addr2.e, (tad)vvi.f, (tac)vux.r).b((vjn)wji, (Executor)addr2.f);
                tmy.x((Context)this.e, 2132018265, 0);
                afva.w(b2, (afsz)new nom(this, (Map)a, 2, (byte[])null), (Executor)this.d);
                return;
            }
            case 19: {
                final LiveChatAction$ShowLiveChatDialogAction liveChatAction$ShowLiveChatDialogAction = (LiveChatAction$ShowLiveChatDialogAction)((agzd)a2).rr((agyr)LiveChatAction$ShowLiveChatDialogAction.showLiveChatDialogAction);
                if (((agzd)a2).rs((agyr)LiveChatAction$ShowLiveChatDialogAction.showLiveChatDialogAction) && (liveChatAction$ShowLiveChatDialogAction.b & 0x1) != 0x0) {
                    anss anss;
                    if ((anss = liveChatAction$ShowLiveChatDialogAction.c) == null) {
                        anss = anss.a;
                    }
                    if (((agzd)anss).rs((agyr)UpsellDialogRendererOuterClass.upsellDialogRenderer)) {
                        anss anss2;
                        if ((anss2 = liveChatAction$ShowLiveChatDialogAction.c) == null) {
                            anss2 = anss.a;
                        }
                        new wci((apgl)((agzd)anss2).rr((agyr)UpsellDialogRendererOuterClass.upsellDialogRenderer), (Activity)this.e, (xgc)this.c, (aceo)this.d, (vax)this.b, (wwv)this.a, (byte[])null, (byte[])null, (byte[])null, (byte[])null).a();
                        return;
                    }
                }
                throw new vbh();
            }
            case 18: {
                final vqq vqq = (vqq)this.b;
                final vqr vqr = new vqr(vqq.c, vqq.d.c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                vqr.a = ((ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint)((agzd)a2).rr((agyr)ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint.manageLiveChatUserEndpoint)).b;
                ((vii)vqr).j(((aioe)a2).c);
                tcp.k(vqq.h.b((vjn)vqr, (Executor)afsl.a), (Executor)this.d, (tcn)new tup((tny)this.e, 17), (tco)new jma(this, (Map)a, 19, (byte[])null));
                return;
            }
            case 17: {
                final vqq vqq2 = (vqq)this.b;
                final vqj vqj = new vqj(vqq2.c, vqq2.d.c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                vqj.a = ((LiveChatActionEndpointOuterClass$LiveChatActionEndpoint)((agzd)a2).rr((agyr)LiveChatActionEndpointOuterClass$LiveChatActionEndpoint.liveChatActionEndpoint)).b;
                ((vii)vqj).j(((aioe)a2).c);
                tcp.k(vqq2.i.b((vjn)vqj, (Executor)afsl.a), (Executor)this.d, (tcn)new tup((tny)this.e, 15), (tco)new tuq(this, 17, (byte[])null));
                return;
            }
            case 16: {
                final vtn a5 = ((vup)this.b).a(((zki)this.c).c());
                final vtm b3 = a5.b();
                ((vii)b3).j(vem.c((aioe)mpc));
                b3.w((SetSettingEndpointOuterClass$SetSettingEndpoint)((agzd)a2).rr((agyr)SetSettingEndpointOuterClass$SetSettingEndpoint.setSettingEndpoint));
                tcp.l(a5.e((vjn)b3), (Executor)this.a, (tcn)new tup(this, 12, (byte[])null), (tco)new vac(this, (Map)a, (aioe)mpc, 2, (byte[])null), afua.a);
                return;
            }
            case 15: {
                ((svm)this.b).show(((bu)this.e).getFragmentManager(), svm.a);
                final vvk a6 = ((vvq)this.a).a();
                final YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint = (YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint)((agzd)a2).rr((agyr)YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.ypcCompleteTransactionEndpoint);
                a6.y = vvk.g(ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.b);
                ((vii)a6).j(((aioe)a2).c);
                final Object c = this.c;
                final Object e = this.e;
                final Object b4 = this.b;
                final swp swp = (swp)tmy.O((Map)a, (Object)"PostTransactionCallback", (Class)swp.class);
                final sxv sxv = (sxv)c;
                final wvu wvu = (wvu)((atjj)sxv.c).a();
                wvu.getClass();
                final tny tny = (tny)((atjj)sxv.f).a();
                tny.getClass();
                final mck mck = (mck)((atjj)sxv.e).a();
                mck.getClass();
                final Object a7 = sxv.a;
                final wwv wwv = (wwv)((atjj)sxv.d).a();
                wwv.getClass();
                e.getClass();
                ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.getClass();
                final aeby aeby = (aeby)((atjj)sxv.b).a();
                aeby.getClass();
                final abhr abhr = new abhr(wvu, tny, mck, (atjj)a7, wwv, (bu)e, (svm)b4, ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint, swp, aeby, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                tcp.n((aum)this.e, ((vvq)this.a).d(a6, (Executor)this.d), (trb)new snq(abhr, 7, (byte[])null), (trb)new snq(abhr, 8, (byte[])null));
                return;
            }
            case 14: {
                Object o;
                if ((o = tmy.O((Map)a, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag", (Class)znj.class)) == null) {
                    o = this.e;
                    if (o == null) {
                        o = znk.a((dbe)new xdh((Class)akhw.class, 2), (dbd)new wtj((Class)akhw.class, 3));
                    }
                    else {
                        ((smn)o).a = (Map)a;
                    }
                }
                final Object m = tmy.M((Map)a, (Object)"com.google.android.libraries.youtube.comment.action_tag");
                final PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint performCommentActionEndpointOuterClass$PerformCommentActionEndpoint = (PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint)((agzd)a2).rr((agyr)PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.performCommentActionEndpoint);
                Object o2;
                if (performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.c.size() > 0) {
                    o2 = performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.c;
                }
                else {
                    o2 = afcr.r((Object)performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.b);
                }
                final Object c2 = this.c;
                final agza builder = ((agzi)akhv.a).createBuilder();
                builder.copyOnWrite();
                final akhv akhv = (akhv)builder.instance;
                final agzy d = akhv.d;
                if (!d.c()) {
                    akhv.d = agzi.mutableCopy(d);
                }
                agxl.addAll((Iterable)o2, (List)akhv.d);
                final vne vne = (vne)c2;
                final vnb vnb = new vnb(vne.c, vne.d.c(), builder, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                ((vii)vnb).j(((aioe)a2).c);
                if (((agzd)a2).rs((agyr)anxe.b)) {
                    final anxd anxd = (anxd)((agzd)a2).rr((agyr)anxe.b);
                    if (!anxd.c.isEmpty()) {
                        ((vii)vnb).l(anxd.c);
                    }
                }
                final ListenableFuture b5 = ((vne)this.c).g.b((vjn)vnb, (Executor)this.a);
                final Object a8 = this.a;
                final htl htl = new htl((znj)o, 17);
                o.getClass();
                tcp.k(b5, (Executor)a8, (tcn)htl, (tco)new jor((znj)o, 16));
                if (performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.d.size() > 0) {
                    if (m == null) {
                        aior aior;
                        if ((aior = ((uyf)this.b).b().v) == null) {
                            aior = aior.a;
                        }
                        if (aior.c) {
                            ((vax)((atjj)this.d).a()).b((List)performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.d);
                        }
                    }
                    else {
                        ((vax)((atjj)this.d).a()).e((List)performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.d, m);
                    }
                }
                return;
            }
            case 13: {
                final CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint = (CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint)((agzd)a2).rr((agyr)CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.createCommentReplyDialogEndpoint);
                final vbp a9 = ((vbq)this.c).a(((zki)this.d).c());
                if ((createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.b & 0x40) != 0x0 && !createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.g.isEmpty()) {
                    final ahge ahge = (ahge)((vdo)a9).f(createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.g).j((Class)ahge.class).af();
                    if (ahge != null && ahge.getShouldRequireViewerAck()) {
                        final Object b6 = this.b;
                        if ((mpc = (mpc)createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.h) == null) {
                            mpc = (mpc)aioe.a;
                        }
                        ((vax)b6).a((aioe)mpc);
                        return;
                    }
                }
                final boolean f = createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.f;
                final boolean b7 = f || createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.i;
                if (f && this.d() != null) {
                    this.d().o((wxz)new wws(wya.c(103918)), (alff)null);
                    this.d().J(3, (wxz)new wws(wya.c(104381)), (alff)null);
                }
                final Object e2 = this.e;
                final smb smb = (smb)tmy.O((Map)a, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag", (Class)smb.class);
                aiye aiye;
                if ((aiye = createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.c) == null) {
                    aiye = aiye.a;
                }
                aiok aiok;
                if ((aiok = createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.d) == null) {
                    aiok = aiok.a;
                }
                aiok aiok2;
                if ((aiok2 = createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.e) == null) {
                    aiok2 = aiok.a;
                }
                ((adjo)e2).J(smb, aiye, aiok, aiok2, b7);
                return;
            }
            case 12: {
                ((rkw)this.c).k((Activity)this.e, new rxr((rjq)this.b, (vkv)this.a, (zki)this.d, (aioe)null));
                return;
            }
            case 11: {
                final boolean g2 = ((abrx)this.d).g();
                final boolean f2 = gej.f(((ghb)this.e).a());
                final boolean b8 = f2 && !g2;
                final boolean b9 = !f2 && g2;
                if (((uyi)this.a).cG()) {
                    final Object c3 = this.c;
                    if (b8) {
                        n = 3;
                    }
                    final PlayerRotationLatencyLoggerController playerRotationLatencyLoggerController = (PlayerRotationLatencyLoggerController)c3;
                    if (playerRotationLatencyLoggerController.f) {
                        playerRotationLatencyLoggerController.l = true;
                        playerRotationLatencyLoggerController.c.c(n);
                    }
                }
                if (!((uyi)this.a).cH()) {
                    final Object e3 = this.e;
                    int n2;
                    if (b8) {
                        n2 = 5;
                    }
                    else if (b9) {
                        n2 = 3;
                    }
                    else {
                        n2 = 0;
                    }
                    ((ghb)e3).d(n2);
                    return;
                }
                if (b8) {
                    ((ghg)this.b).m();
                    return;
                }
                if (b9) {
                    ((ghg)this.b).n();
                }
                return;
            }
            case 10: {
                agot.u(((agzd)a2).rs((agyr)ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.showSfvElementsBottomSheetCommand));
                if (((uyi)this.d).f(45378344L) && ((bu)this.e).getSupportFragmentManager().Z()) {
                    return;
                }
                if (!((thh)this.a).o()) {
                    ((jro)this.c).b();
                    return;
                }
                final ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand showSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand = (ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand)((agzd)a2).rr((agyr)ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.showSfvElementsBottomSheetCommand);
                if (((usa)this.b).M()) {
                    ((usa)this.b).E();
                }
                Optional optional;
                if (a != null) {
                    optional = Optional.ofNullable((Object)((Map<K, Object>)a).get("com.google.android.libraries.youtube.rendering.presenter.PresentContext"));
                }
                else {
                    optional = Optional.empty();
                }
                final Object b10 = this.b;
                anss anss3;
                if ((anss3 = showSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.b) == null) {
                    anss3 = anss.a;
                }
                ajsq g3;
                if ((g3 = showSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.c) == null) {
                    g3 = ajsq.a;
                }
                final float d2 = showSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.d;
                final float e4 = showSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.e;
                if (anss3 == null || !((agzd)anss3).rs((agyr)ElementRendererOuterClass.elementRenderer)) {
                    zjp.b(zjo.b, zjn.x, "Creation bottom sheet without valid renderer");
                    return;
                }
                if (g3 == null) {
                    zjp.b(zjo.b, zjn.x, "Creation bottom sheet without valid title");
                    return;
                }
                final hru hru = (hru)b10;
                if (hru.i == 0) {
                    hru.i = hru.d.b();
                }
                final usa usa = (usa)b10;
                usa.H(d2);
                usa.G(e4);
                usa.I(hru.f);
                usa.E.aw = Optional.of((Object)hru.j);
                hru.g = g3;
                usa.K();
                final abzh d3 = hru.a.d((ajkj)((agzd)anss3).rr((agyr)ElementRendererOuterClass.elementRenderer));
                Optional of = optional;
                if (optional.isEmpty()) {
                    of = Optional.of((Object)actc.q(hru.b.a()));
                }
                if (of.isPresent() && ((wwx)of.get()).a == wwv.k) {
                    ((wwx)of.get()).a(hru.e.n());
                }
                hru.b.b((acij)of.get(), d3);
                hru.c.removeAllViews();
                hru.c.addView(hru.b.a());
                return;
            }
            case 9: {
                final Object e5 = this.e;
                if (e5 instanceof Activity && ((Activity)e5).isFinishing()) {
                    return;
                }
                final ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint confirmDialogEndpointOuterClass$ConfirmDialogEndpoint = (ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint)((agzd)a2).rr((agyr)ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint.confirmDialogEndpoint);
                final Object e6 = this.e;
                aiuz aiuz;
                if ((aiuz = confirmDialogEndpointOuterClass$ConfirmDialogEndpoint.c) == null) {
                    aiuz = aiuz.a;
                }
                aiva aiva2 = aiva;
                if ((0x1 & aiuz.b) != 0x0) {
                    aiuz aiuz2;
                    if ((aiuz2 = confirmDialogEndpointOuterClass$ConfirmDialogEndpoint.c) == null) {
                        aiuz2 = aiuz.a;
                    }
                    if ((aiva2 = aiuz2.c) == null) {
                        aiva2 = aiva.a;
                    }
                }
                abyv.m((Context)e6, aiva2, (vax)this.b, (wwv)this.c, true, (abyu)null, tmy.M((Map)a, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag"), (acng)this.d, (aeby)this.a);
                return;
            }
            case 8: {
                Object o3 = a2;
                if (((agzd)a2).rs((agyr)ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint)) {
                    String i;
                    if ((i = ((abno)this.a).s()) == null) {
                        i = ((abno)this.d).s();
                    }
                    o3 = a2;
                    if (i != null) {
                        final ShortsCreationEndpointOuterClass$ShortsCreationEndpoint shortsCreationEndpointOuterClass$ShortsCreationEndpoint = (ShortsCreationEndpointOuterClass$ShortsCreationEndpoint)((agzd)a2).rr((agyr)ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint);
                        final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
                        final agzg shortsCreationEndpoint = ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint;
                        final agza builder2 = ((agzi)shortsCreationEndpointOuterClass$ShortsCreationEndpoint).toBuilder();
                        builder2.copyOnWrite();
                        final ShortsCreationEndpointOuterClass$ShortsCreationEndpoint shortsCreationEndpointOuterClass$ShortsCreationEndpoint2 = (ShortsCreationEndpointOuterClass$ShortsCreationEndpoint)builder2.instance;
                        shortsCreationEndpointOuterClass$ShortsCreationEndpoint2.b |= 0x20;
                        shortsCreationEndpointOuterClass$ShortsCreationEndpoint2.i = i;
                        agzc.e((agyr)shortsCreationEndpoint, (Object)builder2.build());
                        o3 = ((agza)agzc).build();
                    }
                }
                tcp.n((aum)this.e, ((zjy)this.b).b(((zki)this.c).c()), (trb)etd.o, (trb)new eyc(this, new Intent((Context)this.e, (Class)ShortsCreationActivity.class).putExtra("navigation_endpoint", ((agxl)o3).toByteArray()).setFlags(536870912), (aioe)o3, 6, null));
                return;
            }
            case 7: {
                mpc.getClass();
                a = ((agzd)a2).rr((agyr)CreateGpgProfileCommand$CreateGPGProfileCommand.createGpgProfileCommand);
                Label_2865: {
                    try {
                        final Object c4 = this.c;
                        mpc = (mpc)((zki)this.d).c();
                        mpc = (mpc)((lzi)c4).o((zkh)mpc);
                        break Label_2865;
                    }
                    catch (final mpc mpc) {}
                    catch (final mpb mpc) {}
                    catch (final RemoteException ex) {}
                    trn.d("exception occurred while trying to get account", (Throwable)mpc);
                    mpc = null;
                }
                if (mpc == null) {
                    final Object a10 = this.a;
                    CommandExecutorCommandOuterClass$CommandExecutorCommand commandExecutorCommandOuterClass$CommandExecutorCommand;
                    if ((commandExecutorCommandOuterClass$CommandExecutorCommand = ((CreateGpgProfileCommand$CreateGPGProfileCommand)a).d) == null) {
                        commandExecutorCommandOuterClass$CommandExecutorCommand = CommandExecutorCommandOuterClass$CommandExecutorCommand.a;
                    }
                    ((vax)a10).b((List)commandExecutorCommandOuterClass$CommandExecutorCommand.b);
                    return;
                }
                final Object b11 = this.b;
                final Uri parse = Uri.parse(((CreateGpgProfileCommand$CreateGPGProfileCommand)a).b);
                final gqn gqn = (gqn)b11;
                gqn.b = Long.toString(gqn.a.nextLong());
                zke.a((Activity)this.e, (Account)mpc, parse.buildUpon().appendQueryParameter("token", gqn.b).build().toString()).L(atio.c()).E(ashw.a()).ad((asix)new fdo(this, (CreateGpgProfileCommand$CreateGPGProfileCommand)a, 7, null), (asix)new fdo(this, (CreateGpgProfileCommand$CreateGPGProfileCommand)a, 8, null));
                return;
            }
            case 6: {
                mpc.getClass();
                final AccountUnlinkCommandOuterClass$AccountUnlinkCommand accountUnlinkCommandOuterClass$AccountUnlinkCommand = (AccountUnlinkCommandOuterClass$AccountUnlinkCommand)((agzd)a2).rr((agyr)AccountUnlinkCommandOuterClass$AccountUnlinkCommand.accountUnlinkCommand);
                String e7;
                if ((accountUnlinkCommandOuterClass$AccountUnlinkCommand.b & 0x4) != 0x0) {
                    e7 = accountUnlinkCommandOuterClass$AccountUnlinkCommand.e;
                }
                else {
                    e7 = null;
                }
                if (!TextUtils.isEmpty((CharSequence)e7)) {
                    final AccountUnlinkCommandOuterClass$AccountUnlinkCommand accountUnlinkCommandOuterClass$AccountUnlinkCommand2 = (AccountUnlinkCommandOuterClass$AccountUnlinkCommand)((agzd)a2).rr((agyr)AccountUnlinkCommandOuterClass$AccountUnlinkCommand.accountUnlinkCommand);
                    if ((0x1 & accountUnlinkCommandOuterClass$AccountUnlinkCommand2.b) != 0x0) {
                        if ((mpc = (mpc)accountUnlinkCommandOuterClass$AccountUnlinkCommand2.c) == null) {
                            mpc = (mpc)aioe.a;
                        }
                    }
                    else {
                        mpc = null;
                    }
                    final AccountUnlinkCommandOuterClass$AccountUnlinkCommand accountUnlinkCommandOuterClass$AccountUnlinkCommand3 = (AccountUnlinkCommandOuterClass$AccountUnlinkCommand)((agzd)a2).rr((agyr)AccountUnlinkCommandOuterClass$AccountUnlinkCommand.accountUnlinkCommand);
                    if ((accountUnlinkCommandOuterClass$AccountUnlinkCommand3.b & 0x2) != 0x0) {
                        if ((a = accountUnlinkCommandOuterClass$AccountUnlinkCommand3.d) == null) {
                            a = aioe.a;
                        }
                    }
                    else {
                        a = null;
                    }
                    if (!((zki)this.d).t()) {
                        ((vax)this.a).a((aioe)a);
                        ((nod)this.b).d();
                        return;
                    }
                    try {
                        final Account o4 = ((lzi)this.c).o(((zki)this.d).c());
                        final Object e8 = this.e;
                        final npf c5 = ((nod)this.b).c;
                        final int a11 = nod.a();
                        agnj.a(2);
                        tcp.n((aum)e8, afrp.e(c5.a(a11, o4, e7, 0), (aexg)lkj.l, (Executor)afsl.a), (trb)new fcy(this, (aioe)a, 7, null), (trb)new fcy(this, (aioe)mpc, 8, null));
                        return;
                    }
                    catch (final RemoteException | mpb | mpc remoteException | mpb | mpc) {
                        ((vax)this.a).a((aioe)a);
                        ((nod)this.b).d();
                        return;
                    }
                }
                trn.b("No third party id in AccountUnlinkCommand.");
                ((nod)this.b).d();
                return;
            }
            case 5: {
                final GetWatchNextQueueAddCommandOuterClass$GetWatchNextQueueAddCommand getWatchNextQueueAddCommandOuterClass$GetWatchNextQueueAddCommand = (GetWatchNextQueueAddCommandOuterClass$GetWatchNextQueueAddCommand)((agzd)a2).rr((agyr)GetWatchNextQueueAddCommandOuterClass$GetWatchNextQueueAddCommand.getWatchNextQueueAddCommand);
                PlaybackStartDescriptor.d().a = (aioe)a2;
                ((auip)this.d).N("", "", -1, getWatchNextQueueAddCommandOuterClass$GetWatchNextQueueAddCommand.b, ((aioe)a2).c.I(), (znj)new fcd(this, 5, null), (wyn)null, (Optional)((agls)this.c).b, Optional.empty(), Optional.empty());
                final Object b12 = this.b;
                if ((mpc = (mpc)getWatchNextQueueAddCommandOuterClass$GetWatchNextQueueAddCommand.c) == null) {
                    mpc = (mpc)aioe.a;
                }
                ((vax)b12).a((aioe)mpc);
                return;
            }
            case 4: {
                if (!((agzd)a2).rs((agyr)GetSurveyCommandOuterClass$GetSurveyCommand.getSurveyCommand)) {
                    return;
                }
                final GetSurveyCommandOuterClass$GetSurveyCommand getSurveyCommandOuterClass$GetSurveyCommand = (GetSurveyCommandOuterClass$GetSurveyCommand)((agzd)a2).rr((agyr)GetSurveyCommandOuterClass$GetSurveyCommand.getSurveyCommand);
                akyt a12;
                if ((a12 = getSurveyCommandOuterClass$GetSurveyCommand.c) == null) {
                    a12 = akyt.a;
                }
                final vuf h = ((addp)this.c).h();
                ((vii)h).i();
                h.a = a12;
                final int j = alhb.m(getSurveyCommandOuterClass$GetSurveyCommand.d);
                if (j != 0) {
                    b = j;
                }
                h.b = b;
                tcp.k(((addp)this.c).i(h), (Executor)this.d, (tcn)gnh.c, (tco)new exa(this, getSurveyCommandOuterClass$GetSurveyCommand, 10, null));
                return;
            }
            case 3: {
                if (((agzd)a2).rs((agyr)CreatePostCommandOuterClass.createPostCommand)) {
                    final aiyh aiyh = (aiyh)((agzd)a2).rr((agyr)CreatePostCommandOuterClass.createPostCommand);
                    if ((aiyh.b & 0x1) != 0x0) {
                        akic akic;
                        if ((akic = aiyh.c) == null) {
                            akic = akic.a;
                        }
                        final vng vng = new vng((adcr)this.c, ((zki)this.d).c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                        final int b13 = akic.b;
                        if ((b13 & 0x20) != 0x0) {
                            vng.e = akic.h;
                        }
                        if ((b13 & 0x4) != 0x0) {
                            vng.w(akic.g);
                        }
                        if ((akic.b & 0x2) != 0x0) {
                            vng.x(akic.f);
                        }
                        final int c6 = akic.c;
                        if (c6 == 9) {
                            final akhp akhp = (akhp)akic.d;
                            final int b14 = akhp.b;
                            if ((b14 & 0x1) != 0x0) {
                                vng.b = akhp.c;
                            }
                            if ((b14 & 0x4) != 0x0) {
                                akbt g4;
                                if ((g4 = akhp.e) == null) {
                                    g4 = akbt.a;
                                }
                                vng.g = g4;
                            }
                            final int c7 = akic.c;
                            akhp a13;
                            if (c7 == 9) {
                                a13 = (akhp)akic.d;
                            }
                            else {
                                a13 = akhp.a;
                            }
                            if ((a13.b & 0x2) != 0x0) {
                                akhp a14;
                                if (c7 == 9) {
                                    a14 = (akhp)akic.d;
                                }
                                else {
                                    a14 = akhp.a;
                                }
                                vng.f = a14.d;
                            }
                        }
                        else if (c6 == 10) {
                            final akhq akhq = (akhq)akic.d;
                            if ((0x1 & akhq.b) != 0x0) {
                                vng.d = akhq.c;
                            }
                        }
                        else if (c6 == 8) {
                            vng.a = (List)((akhs)akic.d).b;
                        }
                        else if (c6 == 7) {
                            final akhu akhu = (akhu)akic.d;
                            if ((0x1 & akhu.b) != 0x0) {
                                vng.c = akhu.c;
                            }
                        }
                        else if (c6 == 14) {
                            vng.y = (akho)akic.d;
                        }
                        else if (c6 == 15) {
                            vng.z = ((akht)akic.d).c;
                        }
                        final gmt gmt = new gmt(this, (vnh)tmy.O((Map)a, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag", (Class)vnh.class), 2, null);
                        final Object a15 = this.a;
                        final fcd fcd = new fcd((znj)gmt, 19);
                        final vne vne2 = (vne)a15;
                        vne2.b.a((tjr)vne2.f.a((vjn)vng, (MessageLite)akid.a, (znj)fcd, (tad)vmq.j, (tac)vnc.a));
                    }
                }
                return;
            }
            case 2: {
                final akak f3 = ((arud)this.a).f();
                Label_4135: {
                    if (f3 != null) {
                        anqh anqh;
                        if ((anqh = f3.u) == null) {
                            anqh = anqh.a;
                        }
                        if (anqh.c) {
                            ((abno)this.d).t();
                            break Label_4135;
                        }
                    }
                    ((ktd)this.c).f();
                }
                if (!((fjq)this.b).a((aioe)a2)) {
                    final Intent intent = new Intent((Context)this.e, (Class)ReelCameraActivity.class);
                    intent.putExtra("navigation_endpoint", ((agxl)mpc).toByteArray());
                    ((Context)this.e).startActivity(intent);
                }
                return;
            }
            case 1: {
                final Object e9 = this.e;
                ahji ahji;
                if ((ahji = ((AdFeedbackEndpointOuterClass$AdFeedbackEndpoint)((agzd)a2).rr((agyr)AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.adFeedbackEndpoint)).b) == null) {
                    ahji = ahji.a;
                }
                ahjk ahjk;
                if ((ahjk = ahji.b) == null) {
                    ahjk = ahjk.a;
                }
                final Object c8 = this.c;
                final Object b15 = this.b;
                final Object a16 = this.a;
                final Object l = tmy.M((Map)a, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag");
                final Object d4 = this.d;
                final aeby aeby2 = (aeby)a16;
                final tdz tdz = (tdz)b15;
                final Context context = (Context)e9;
                final sgq sgq = new sgq(context, ahjk, (vax)c8, tdz, aeby2, l, (byte[])null, (byte[])null, (byte[])null);
                final abyy af = ((aeby)d4).af(context);
                ajsq ajsq2;
                if ((ahjk.b & 0x1) != 0x0) {
                    if ((ajsq2 = ahjk.c) == null) {
                        ajsq2 = ajsq.a;
                    }
                }
                else {
                    ajsq2 = null;
                }
                ((AlertDialog$Builder)af).setTitle((CharSequence)abyh.b(ajsq2));
                if (ahjk.g.size() > 0) {
                    final CharSequence[] array = new CharSequence[ahjk.g.size()];
                    for (int n3 = 0; n3 < ahjk.g.size(); ++n3) {
                        ajsq ajsq3;
                        if ((((ahjj)ahjk.g.get(n3)).b & 0x1) != 0x0) {
                            if ((ajsq3 = ((ahjj)ahjk.g.get(n3)).c) == null) {
                                ajsq3 = ajsq.a;
                            }
                        }
                        else {
                            ajsq3 = null;
                        }
                        array[n3] = (CharSequence)abyh.b(ajsq3);
                    }
                    ((AlertDialog$Builder)af).setSingleChoiceItems(array, -1, (DialogInterface$OnClickListener)sgq);
                }
                ajsq ajsq4;
                if ((ahjk.b & 0x4) != 0x0) {
                    if ((ajsq4 = ahjk.e) == null) {
                        ajsq4 = ajsq.a;
                    }
                }
                else {
                    ajsq4 = null;
                }
                ((AlertDialog$Builder)af).setNegativeButton((CharSequence)abyh.b(ajsq4), (DialogInterface$OnClickListener)sgq);
                ajsq ajsq5 = ajsq;
                if ((ahjk.b & 0x2) != 0x0 && (ajsq5 = ahjk.d) == null) {
                    ajsq5 = ajsq.a;
                }
                ((AlertDialog$Builder)af).setPositiveButton((CharSequence)abyh.b(ajsq5), (DialogInterface$OnClickListener)sgq);
                ((AlertDialog$Builder)af).setCancelable(false);
                if ((ahjk.b & 0x40) != 0x0) {
                    final HashMap hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", l);
                    if ((mpc = (mpc)ahjk.i) == null) {
                        mpc = (mpc)aioe.a;
                    }
                    ((vax)c8).c((aioe)mpc, (Map)hashMap);
                }
                ((abyt)sgq).j(((AlertDialog$Builder)af).create());
                ((abyt)sgq).k();
                ((abyt)sgq).j.getButton(-1).setEnabled(false);
                return;
            }
            case 0: {
                final vmh vmh = (vmh)this.a;
                final vlz vlz = new vlz(vmh.c, vmh.d.c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                final ajbn ajbn = (ajbn)((agzd)a2).rr((agyr)ajbn.b);
                vlz.a = ajbn.c;
                ((vii)vlz).j(((aioe)a2).c);
                final Object e10 = this.e;
                final Object a17 = this.a;
                final Object d5 = this.d;
                final vmh vmh2 = (vmh)a17;
                if (vmh2.f == null) {
                    vmh2.f = new vma(vmh2.e, vmh2.b);
                }
                tcp.n((aum)e10, ((vkk)vmh2.f).g((vjn)vlz, (Executor)d5), (trb)new exr((tny)this.b, 9), (trb)new eyc(this, ajbn, (Map)a, 2));
            }
        }
    }
}
