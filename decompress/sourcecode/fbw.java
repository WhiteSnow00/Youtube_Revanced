import java.util.List;
import android.app.Dialog;
import java.util.Iterator;
import android.app.AlertDialog$Builder;
import com.google.protos.youtube.api.innertube.AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint;
import com.google.protos.youtube.api.innertube.SignOutEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ClearLocationCommandOuterClass$ClearLocationCommand;
import com.google.protos.youtube.api.innertube.ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand;
import com.google.protos.youtube.api.innertube.CreateSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand;
import com.google.protos.youtube.api.innertube.EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand;
import com.google.protos.youtube.api.innertube.UnsubscribeEndpointOuterClass$UnsubscribeEndpoint;
import android.content.DialogInterface$OnCancelListener;
import android.text.SpannableStringBuilder;
import com.google.protos.youtube.api.innertube.ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand;
import com.google.android.apps.youtube.app.extensions.livecreation.MainLiveCreationActivity;
import android.content.Intent;
import com.google.android.libraries.youtube.edit.gallery.GalleryActivity;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicBoolean;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand;
import com.google.android.apps.youtube.app.extensions.lens.LensController;
import java.util.Locale;
import com.google.protos.youtube.api.innertube.LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand;
import android.os.Parcelable;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import com.google.protos.youtube.api.innertube.ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand;
import com.google.protos.youtube.api.innertube.ExecuteEntityCommandOuterClass$ExecuteEntityCommand;
import com.google.protos.youtube.api.innertube.FlagEndpointOuterClass$FlagEndpoint;
import com.google.protos.youtube.api.innertube.LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint;
import com.google.protos.youtube.api.innertube.SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint;
import android.os.Bundle;
import com.google.protos.youtube.api.innertube.DynamicFlowCommandOuterClass$DynamicFlowCommand;
import java.util.Map;
import java.util.concurrent.Executor;
import android.content.Context;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fbw implements vau
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    private final /* synthetic */ int f;
    
    public fbw(final Activity a, final tdg b, final actx d, final abno c, final int f, final byte[] array) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public fbw(final Activity a, final vyn c, final vxf b, final xgc d, final int f, final byte[] array, final byte[] array2, final byte[] array3) {
        this.f = f;
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    public fbw(final Context a, final addp d, final tny b, final vax c, final int f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.f = f;
        d.getClass();
        this.d = d;
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
    }
    
    public fbw(final Context a, final gbg b, final cxz c, final aeby d, final int f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public fbw(final Context a, final vax b, final aeby c, final aeby d, final int f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.f = f;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        this.d = d;
    }
    
    public fbw(final atjj d, final ggs a, final gpr b, final gpr c, final int f, final byte[] array) {
        this.f = f;
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public fbw(final fzo b, final vax c, final hdv a, final Executor d, final int f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.f = f;
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public fbw(final gmv b, final hdv c, final wwv d, final fjp a, final int f, final byte[] array, final byte[] array2, final byte[] array3) {
        this.f = f;
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public fbw(final hrm b, final avt c, final aeyr d, final gug a, final int f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.f = f;
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public fbw(final Executor a, final atjj c, final atjj d, final atjj b, final int f) {
        this.f = f;
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    public fbw(final kvd a, final uyf c, final uvf b, final vax d, final int f) {
        this.f = f;
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    public fbw(final tku a, final abiv d, final vax b, final wuu c, final int f, final byte[] array) {
        this.f = f;
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public fbw(final tny a, final vax b, final aaca c, final acha d, final int f, final byte[] array, final byte[] array2, final byte[] array3) {
        this.f = f;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
    }
    
    public fbw(final vbq b, final zki c, final asho d, final vax a, final int f) {
        this.f = f;
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public fbw(final vqq b, final xgc c, final tny a, final Executor d, final int f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.f = f;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        a.getClass();
        this.a = a;
        this.d = d;
    }
    
    public fbw(final vqq b, final xgc c, final tny a, final Executor d, final int f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.f = f;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        a.getClass();
        this.a = a;
        this.d = d;
    }
    
    public fbw(final vup a, final zki b, final atjj d, final Executor c, final int f, final byte[] array) {
        this.f = f;
        this.a = a;
        this.b = b;
        d.getClass();
        this.d = d;
        this.c = c;
    }
    
    public fbw(final vup a, final zki b, final atjj d, final Executor c, final int f, final byte[] array, final byte[] array2) {
        this.f = f;
        this.a = a;
        this.b = b;
        d.getClass();
        this.d = d;
        this.c = c;
    }
    
    public fbw(final zkw d, final zko c, final vax b, final bu a, final int f) {
        this.f = f;
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void mE(aioe a, final Map map) {
        final int f = this.f;
        final boolean b = false;
        final Boolean value = false;
        int f2 = 1;
        final Boolean value2 = true;
        switch (f) {
            default: {
                final DynamicFlowCommandOuterClass$DynamicFlowCommand dynamicFlowCommandOuterClass$DynamicFlowCommand = (DynamicFlowCommandOuterClass$DynamicFlowCommand)((agzd)a).rr((agyr)DynamicFlowCommandOuterClass$DynamicFlowCommand.dynamicFlowCommand);
                if ((dynamicFlowCommandOuterClass$DynamicFlowCommand.b & 0x1) != 0x0) {
                    final int u = ajox.u(dynamicFlowCommandOuterClass$DynamicFlowCommand.d);
                    if (u != 0) {
                        if (u != 1) {
                            ((vdo)((vbq)this.b).a(((zki)this.c).c())).f(dynamicFlowCommandOuterClass$DynamicFlowCommand.c).E((asho)this.d).s((asix)new uqp(this, dynamicFlowCommandOuterClass$DynamicFlowCommand, 16, (byte[])null)).ab();
                        }
                    }
                }
                return;
            }
            case 18: {
                final boolean b2 = ((vyn)this.c).l() instanceof vzl;
                final cl supportFragmentManager = ((bu)this.a).getSupportFragmentManager();
                if (!b2 && !((alnz)((xgc)this.d).b).h) {
                    final Object b3 = this.b;
                    final wak wak = new wak();
                    final Bundle bundle = new Bundle();
                    bundle.putByteArray("navigation_endpoint", ((agxl)a).toByteArray());
                    wak.ag(bundle);
                    wak.ag = (vxg)b3;
                    wak.r(supportFragmentManager, "live_chat_item_context_menu_dialog");
                    return;
                }
                final Object b4 = this.b;
                b4.getClass();
                final wai wai = new wai();
                final Bundle bundle2 = new Bundle();
                bundle2.putByteArray("navigation_endpoint", ((agxl)a).toByteArray());
                wai.ag(bundle2);
                wai.aj = (vxg)b4;
                wai.r(supportFragmentManager, "live_chat_item_context_menu_bottom_sheet_fragment");
                return;
            }
            case 17: {
                final vqq vqq = (vqq)this.b;
                final vqu vqu = new vqu(vqq.c, vqq.d.c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                vqu.a = ((SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint)((agzd)a).rr((agyr)SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint.sendLiveChatVoteEndpoint)).b;
                ((vii)vqu).j(a.c);
                tcp.k(vqq.k.b((vjn)vqu, (Executor)afsl.a), (Executor)this.d, (tcn)new etc(this, map, 18, (byte[])null), (tco)new jma(this, map, 20, (char[])null));
                return;
            }
            case 16: {
                final vqq vqq2 = (vqq)this.b;
                final vqk vqk = new vqk(vqq2.c, vqq2.d.c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                vqk.a = ((LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint)((agzd)a).rr((agyr)LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint.liveChatQnaActionEndpoint)).b;
                ((vii)vqk).j(a.c);
                tcp.k(vqq2.j.b((vjn)vqk, (Executor)afsl.a), (Executor)this.d, (tcn)new tup((tny)this.a, 16), (tco)new jma(this, map, 18, (byte[])null));
                return;
            }
            case 15: {
                final voj p2 = ((addp)this.d).p();
                ((vii)p2).j(vem.c(a));
                final FlagEndpointOuterClass$FlagEndpoint flagEndpointOuterClass$FlagEndpoint = (FlagEndpointOuterClass$FlagEndpoint)((agzd)a).rr((agyr)FlagEndpointOuterClass$FlagEndpoint.flagEndpoint);
                p2.a = flagEndpointOuterClass$FlagEndpoint.b;
                final int w = afld.W(flagEndpointOuterClass$FlagEndpoint.c);
                if (w != 0) {
                    f2 = w;
                }
                p2.f = f2;
                p2.b = (String)tmy.O(map, (Object)"com.google.android.libraries.youtube.innertube.services.flags.user_comments", (Class)String.class);
                p2.c = (boolean)tmy.N(map, (Object)"com.google.android.libraries.youtube.innertube.services.flags.legal_checkbox_checked", (Object)value);
                p2.d = (akmj)tmy.O(map, (Object)"com.google.android.libraries.youtube.innertube.services.flags.legal_report_details", (Class)akmj.class);
                p2.e = (akmn)tmy.O(map, (Object)"com.google.android.libraries.youtube.innertube.services.flags.video_report_details", (Class)akmn.class);
                Object o;
                if ((o = tmy.O(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag", (Class)znj.class)) == null) {
                    o = new vok(this, map, 0, (byte[])null);
                }
                ((addp)this.d).q(p2, (znj)o);
                return;
            }
            case 14: {
                final ExecuteEntityCommandOuterClass$ExecuteEntityCommand executeEntityCommandOuterClass$ExecuteEntityCommand = (ExecuteEntityCommandOuterClass$ExecuteEntityCommand)((agzd)a).rr((agyr)ExecuteEntityCommandOuterClass$ExecuteEntityCommand.executeEntityCommand);
                if ((executeEntityCommandOuterClass$ExecuteEntityCommand.b & 0x1) != 0x0) {
                    ((vdo)((vbq)this.b).a(((zki)this.c).c())).f(executeEntityCommandOuterClass$ExecuteEntityCommand.c).E((asho)this.d).s((asix)new uqp(this, map, 4, (byte[])null)).q((asix)uwh.c).ab();
                }
                return;
            }
            case 13: {
                anqa anqa;
                if ((anqa = ((uyf)((atjj)this.d).a()).b().A) == null) {
                    anqa = anqa.a;
                }
                if (!anqa.c) {
                    ((gpr)this.b).mE(a, map);
                    return;
                }
                final ggh f3 = ((ggs)this.a).f();
                if (f3 != null && ((br)f3).og().f("reel_watch_fragment_watch_while") != null) {
                    anqa anqa2;
                    if ((anqa2 = ((uyf)((atjj)this.d).a()).b().A) == null) {
                        anqa2 = anqa.a;
                    }
                    if (!anqa2.f) {
                        ((gpr)this.c).mE(a, map);
                        return;
                    }
                }
                ((gpr)this.b).mE(a, map);
                return;
            }
            case 12: {
                agot.u(((agzd)a).rs((agyr)ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.showPendingReelUploadsCommand));
                final ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand = (ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand)((agzd)a).rr((agyr)ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.showPendingReelUploadsCommand);
                if ((a = showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.d) == null) {
                    a = aioe.a;
                }
                tcp.k(((hdv)this.a).c(), (Executor)this.d, (tcn)new gfj(this, showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand, a, map, 4, (byte[])null), (tco)new fdd(this, map, showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand, a, 6, null));
                return;
            }
            case 11: {
                agot.u(((agzd)a).rs((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
                final abhx d = PlaybackStartDescriptor.d();
                d.a = a;
                final PlaybackStartDescriptor a2 = d.a();
                final anqt anqt = (anqt)((aeyr)this.d).a();
                if (anqt != null && anqt.i) {
                    ((hrm)this.b).c(a, a2.B((avt)this.c), false, false, false, znk.a);
                }
                final aioe b5 = ((gug)this.a).b();
                if (b5 != null && ((agzd)b5).rs((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                    return;
                }
                final Object a3 = this.a;
                final Bundle bundle3 = new Bundle();
                bundle3.putParcelable("com.google.android.apps.youtube.PlaybackStartDescriptor", (Parcelable)a2);
                ((gug)a3).e(a, bundle3);
                return;
            }
            case 10: {
                if (!((agzd)a).rs((agyr)LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand.lensWatchNextRequestContinuationCommand)) {
                    throw new vbh();
                }
                final String b6 = ((LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand)((agzd)a).rr((agyr)LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand.lensWatchNextRequestContinuationCommand)).b;
                if (b6.isEmpty()) {
                    return;
                }
                String.format(Locale.US, "[LENS] Making GetWatchNext continuation request with token: %s", b6);
                final LensController lensController = (LensController)((atjj)this.b).a();
                final vuv b7 = ((vuu)((atjj)this.d).a()).b();
                b6.getClass();
                b7.d = b6;
                ((vii)b7).k(lensController.f);
                if (map != null) {
                    final Long n = map.get("player_timestamp_ms");
                    if (n != null) {
                        b7.y = n;
                    }
                }
                final vut vut = (vut)((atjj)this.c).a();
                tcp.k(((vkk)vut.d).o((vjn)b7, (Executor)afsl.a, vut.f(vut.f)), (Executor)this.a, (tcn)new fcb(lensController, 11), (tco)new erz(lensController, 14));
                return;
            }
            case 9: {
                final ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand showMiniplayerCommandOuterClass$ShowMiniplayerCommand = (ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand)((agzd)a).rr((agyr)ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand.showMiniplayerCommand);
                aioe aioe;
                if ((aioe = showMiniplayerCommandOuterClass$ShowMiniplayerCommand.c) == null) {
                    aioe = aioe.a;
                }
                if (((agzd)aioe).rs((agyr)WatchEndpointOuterClass.watchEndpoint)) {
                    final fkk j = ((fjp)this.a).j();
                    if (((0x8 & showMiniplayerCommandOuterClass$ShowMiniplayerCommand.b) != 0x0 && showMiniplayerCommandOuterClass$ShowMiniplayerCommand.e) || (!j.i() && j != fkk.b)) {
                        if ((showMiniplayerCommandOuterClass$ShowMiniplayerCommand.b & 0x2) != 0x0 && showMiniplayerCommandOuterClass$ShowMiniplayerCommand.d) {
                            ((atid)((hdv)this.c).b).tr((Object)value2);
                            final Object c = this.c;
                            final AtomicBoolean atomicBoolean = new AtomicBoolean();
                            asjg.b((AtomicReference)((uyi)((hdv)c).a).l(45382831L).aB((asix)new kxr(atomicBoolean, 16)));
                            if (atomicBoolean.get()) {
                                aioe aioe2;
                                if ((aioe2 = showMiniplayerCommandOuterClass$ShowMiniplayerCommand.c) == null) {
                                    aioe2 = aioe.a;
                                }
                                final String d2 = ((apqg)((agzd)aioe2).rr((agyr)WatchEndpointOuterClass.watchEndpoint)).d;
                                final agza builder = aild.a.createBuilder();
                                final agza builder2 = ailk.a.createBuilder();
                                final agyc a4 = agyc.A(d2);
                                builder2.copyOnWrite();
                                final ailk ailk = (ailk)builder2.instance;
                                ailk.b |= 0x1;
                                ailk.c = a4;
                                final ailk d3 = (ailk)builder2.build();
                                builder.copyOnWrite();
                                final aild aild = (aild)builder.instance;
                                d3.getClass();
                                aild.d = d3;
                                aild.b |= 0x2;
                                ((wwv)this.d).H(wya.b(164817), a, (aild)builder.build());
                                ((wwv)this.d).l((wxz)new wws(wya.c(121253)));
                            }
                        }
                        afcw afcw;
                        if (map != null) {
                            final afct afct = new afct();
                            afct.k(map);
                            afct.g((Object)"start_watch_minimized", (Object)value2);
                            afct.g((Object)"PLAYBACK_START_DESCRIPTOR_MUTATOR", (Object)new gon());
                            afcw = afct.c();
                        }
                        else {
                            afcw = afcw.n((Object)"start_watch_minimized", (Object)value2, (Object)"PLAYBACK_START_DESCRIPTOR_MUTATOR", (Object)new gon());
                        }
                        final Object b8 = this.b;
                        aioe aioe3;
                        if ((aioe3 = showMiniplayerCommandOuterClass$ShowMiniplayerCommand.c) == null) {
                            aioe3 = aioe.a;
                        }
                        ((gmv)b8).mE(aioe3, (Map)afcw);
                    }
                }
                return;
            }
            case 8: {
                final Intent addFlags = new Intent((Context)this.a, (Class)GalleryActivity.class).putExtra("navigation_endpoint", ((agxl)a).toByteArray()).putExtra("extra_gallery_secondary_action_class", MainLiveCreationActivity.class.getCanonicalName()).addFlags(536870912);
                final szw szw = (szw)tmy.O(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag", (Class)szw.class);
                if (xkm.aI((Context)this.a)) {
                    final Object d4 = this.d;
                    final acty i = ((actx)d4).j();
                    i.k(((Activity)this.a).getString(2132019539));
                    i.h(false);
                    ((actx)d4).n(i.b());
                    return;
                }
                ((abno)this.c).a();
                if (szw != null) {
                    ((tdg)this.b).c(addFlags, 1800, szw);
                    return;
                }
                ((Activity)this.a).startActivity(addFlags);
                return;
            }
            case 7: {
                final ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand showSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand = (ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand)((agzd)a).rr((agyr)ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.showSystemInfoDialogCommand);
                final aonl aonl = (aonl)tmy.O(map, (Object)"ShowSystemInfoDialogCommandResolver.SHOW_SYSTEM_INFO_DIALOG_COMMAND_ORIGIN_SURVEY_KEY", (Class)aonl.class);
                if (aonl == null) {
                    return;
                }
                ((gbg)this.b).k(aonl);
                final abyy af = ((aeby)this.d).af((Context)this.a);
                ajsq ajsq;
                if ((showSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.b & 0x1) != 0x0) {
                    if ((ajsq = showSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.c) == null) {
                        ajsq = ajsq.a;
                    }
                }
                else {
                    ajsq = null;
                }
                final AlertDialog$Builder setTitle = ((AlertDialog$Builder)af).setTitle((CharSequence)abyh.b(ajsq));
                final Object c2 = this.c;
                final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                final cxz cxz = (cxz)c2;
                ((Dialog)setTitle.setMessage((CharSequence)spannableStringBuilder.append(cxz.A(2132018148)).append(cxz.B(2132018143)).append(cxz.A(2132018142)).append(cxz.B(2132018150)).append(cxz.A(2132018149)).append(cxz.B(2132018146)).append(cxz.A(2132018145))).setOnCancelListener((DialogInterface$OnCancelListener)new aagj(this, aonl, 1, (byte[])null)).create()).show();
                return;
            }
            case 6: {
                final fwn fwn = (fwn)tmy.O(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag", (Class)fwn.class);
                if (fwn != null) {
                    final Object b9 = fwn.b;
                    if (b9 != null) {
                        ((fwm)b9).a();
                    }
                }
                final vud g = ((aaca)this.c).g();
                final Iterator<Object> iterator = ((List<Object>)((UnsubscribeEndpointOuterClass$UnsubscribeEndpoint)((agzd)a).rr((agyr)UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint)).c).iterator();
                while (iterator.hasNext()) {
                    g.w((String)iterator.next());
                }
                final String e = ((UnsubscribeEndpointOuterClass$UnsubscribeEndpoint)((agzd)a).rr((agyr)UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint)).e;
                if (!e.isEmpty()) {
                    g.b = e;
                }
                if (((agzd)a).rs((agyr)anxe.b)) {
                    final anxd anxd = (anxd)((agzd)a).rr((agyr)anxe.b);
                    if (!anxd.c.isEmpty()) {
                        ((vii)g).l(anxd.c);
                    }
                }
                if ((((UnsubscribeEndpointOuterClass$UnsubscribeEndpoint)((agzd)a).rr((agyr)UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint)).b & 0x1) != 0x0) {
                    g.a = ((UnsubscribeEndpointOuterClass$UnsubscribeEndpoint)((agzd)a).rr((agyr)UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint)).d;
                }
                ((vii)g).j(a.c);
                final accz accz = (accz)tmy.O(map, (Object)"command_status_callback", (Class)accz.class);
                aslc b10;
                if (accz != null && !accz.a()) {
                    b10 = accz.b();
                }
                else {
                    b10 = null;
                }
                ((aaca)this.c).j(g, (znj)new fwo(this, map, a, fwn, b10, null));
                return;
            }
            case 5: {
                final EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand editSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand = (EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand)((agzd)a).rr((agyr)EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand.editSubscriptionsCollectionCommand);
                if ((editSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand.b & 0x2) != 0x0) {
                    final vax vax = (vax)((atjj)this.d).a();
                    aioe aioe4;
                    if ((aioe4 = editSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand.d) == null) {
                        aioe4 = aioe.a;
                    }
                    vax.a(aioe4);
                }
                final addr h = ((vup)this.a).h(((zki)this.b).c());
                aklg aklg;
                if ((aklg = editSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand.c) == null) {
                    aklg = aklg.a;
                }
                final vtz vtz = new vtz(h.c, ((eg)h.e).aq(), aklg, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                ((vii)vtz).j(a.c);
                tcp.k(((vkh)h.d).b((vjn)vtz, (Executor)this.c), (Executor)afsl.a, (tcn)new etc(this, editSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand, 3, (byte[])null), (tco)new exa(this, editSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand, 9, null));
                return;
            }
            case 4: {
                final CreateSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand createSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand = (CreateSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand)((agzd)a).rr((agyr)CreateSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand.createSubscriptionsCollectionCommand);
                if ((createSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand.b & 0x2) != 0x0) {
                    final vax vax2 = (vax)((atjj)this.d).a();
                    aioe aioe5;
                    if ((aioe5 = createSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand.d) == null) {
                        aioe5 = aioe.a;
                    }
                    vax2.a(aioe5);
                }
                final addr h2 = ((vup)this.a).h(((zki)this.b).c());
                akjx akjx;
                if ((akjx = createSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand.c) == null) {
                    akjx = akjx.a;
                }
                final vty vty = new vty(h2.c, ((eg)h2.e).aq(), akjx, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                ((vii)vty).j(a.c);
                tcp.k(((vkh)h2.f).b((vjn)vty, (Executor)this.c), (Executor)afsl.a, (tcn)new etc(this, createSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand, 2, (byte[])null), (tco)new exa(this, createSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand, 8, null));
                return;
            }
            case 3: {
                final ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand = (ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand)((agzd)a).rr((agyr)ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.toggleEngagementPanelCommand);
                final Object a5 = this.a;
                ajng a6;
                if (toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.c == 2) {
                    a6 = (ajng)toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.d;
                }
                else {
                    a6 = ajng.a;
                }
                ajnf ajnf;
                if ((ajnf = ajnf.b(a6.c)) == null) {
                    ajnf = ajnf.a;
                }
                final utk a7 = ((kvd)a5).a(ajnf);
                final String z = vem.z(toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand);
                if (aexs.f(z)) {
                    return;
                }
                if (a7.v(z)) {
                    a7.n();
                    return;
                }
                if ((toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.b & 0x10) != 0x0) {
                    final Object d5 = this.d;
                    if ((a = toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.g) == null) {
                        a = aioe.a;
                    }
                    ((vax)d5).a(a);
                    return;
                }
                vem.E(toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.e, (uvf)this.b);
                boolean b11 = b;
                if (gkt.A((uyf)this.c)) {
                    b11 = b;
                    if (tmy.N(map, (Object)"triggered_on_ui_ready", (Object)value)) {
                        b11 = true;
                    }
                }
                a7.f(a, (usz)null, b11, true);
                return;
            }
            case 2: {
                tcp.k(((tku)this.a).b((aexg)bwn.s), (Executor)afsl.a, (tcn)etg.d, (tco)new exa(this, (ClearLocationCommandOuterClass$ClearLocationCommand)((agzd)a).rr((agyr)ClearLocationCommandOuterClass$ClearLocationCommand.clearLocationCommand), 2, null));
                return;
            }
            case 1: {
                if (((agzd)a).rs((agyr)SignOutEndpointOuterClass.signOutEndpoint) && (((aofd)((agzd)a).rr((agyr)SignOutEndpointOuterClass.signOutEndpoint)).b & 0x2) != 0x0) {
                    final aofd aofd = (aofd)((agzd)a).rr((agyr)SignOutEndpointOuterClass.signOutEndpoint);
                    final Object c3 = this.c;
                    aofc aofc;
                    if ((aofc = aofd.c) == null) {
                        aofc = aofc.a;
                    }
                    ((zko)c3).d(aofc.b);
                    if ((aofd.b & 0x4) != 0x0) {
                        tcp.n((aum)this.a, ((zko)this.c).b(), (trb)etd.b, (trb)new eyc(this, aofd, map, 1, null));
                    }
                    return;
                }
                ((zkw)this.d).c();
                return;
            }
            case 0: {
                ahiy ahiy;
                if ((ahiy = ((AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint)((agzd)a).rr((agyr)AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.adChoicesDialogEndpoint)).b) == null) {
                    ahiy = ahiy.a;
                }
                ajpr ajpr;
                if ((ajpr = ahiy.c) == null) {
                    ajpr = ajpr.a;
                }
                abyx.h((Context)this.a, ajpr, (vax)this.b, (aeby)this.c, tmy.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag"), (aeby)this.d);
            }
        }
    }
}
