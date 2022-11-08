import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import java.util.Iterator;
import com.google.protos.youtube.api.innertube.ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint;
import java.util.Locale;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.protos.youtube.api.innertube.AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint;
import com.google.protobuf.MessageLite;
import com.google.protos.youtube.api.innertube.ContactMenuEndpointOuterClass$ContactMenuEndpoint;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import j$.util.Optional;
import android.os.Bundle;
import com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity;
import com.google.protos.youtube.api.innertube.EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint;
import com.google.protos.youtube.api.innertube.LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand;
import com.google.android.apps.youtube.app.extensions.clips.ClipController;
import com.google.protos.youtube.api.innertube.LoopCommandOuterClass$LoopCommand;
import com.google.protos.youtube.api.innertube.SaveToPlaylistListEntityUpdateCommandOuterClass$SaveToPlaylistListEntityUpdateCommand;
import com.google.protos.youtube.api.innertube.SectionReloadCommandOuterClass$SectionReloadCommand;
import com.google.protos.youtube.api.innertube.RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint;
import android.view.View$OnClickListener;
import android.net.Uri;
import java.util.List;
import com.google.protos.youtube.api.innertube.FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint;
import com.google.protos.youtube.api.innertube.TimeDelayedEndpoint$CancelTimeDelayedEndpoint;
import com.google.protos.youtube.api.innertube.TimeDelayedEndpoint$CreateTimeDelayedEndpoint;
import com.google.protos.youtube.api.innertube.CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.ArrayList;
import android.content.Intent;
import com.google.android.apps.youtube.app.extensions.accountlinking.GalFlowActivity;
import com.google.common.util.concurrent.SettableFuture;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.AccountLinkCommandOuterClass$AccountLinkCommand;
import com.google.protos.youtube.api.innertube.SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.HashMap;
import android.os.Handler;
import android.content.Context;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eyv implements vau
{
    public final Object a;
    public final Object b;
    public final Object c;
    private final /* synthetic */ int e;
    
    public eyv(final aacf c, final atjj b, final aadb a, final int e) {
        this.e = e;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public eyv(final Activity c, final adcr b, final acga a, final int e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.e = e;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public eyv(final Activity c, final tdg a, final wwv b, final int e, final byte[] array) {
        this.e = e;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public eyv(final Activity c, final vax b, final gbn a, final int e) {
        this.e = e;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public eyv(final Activity c, final zki a, final abyo b, final int e) {
        this.e = e;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public eyv(final Context c, final tdg a, final tdz b, final int e, final byte[] array) {
        this.e = e;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public eyv(final Context context, final vax a, final int e) {
        this.e = e;
        this.a = a;
        this.c = new Handler(context.getMainLooper());
        this.b = new HashMap();
    }
    
    public eyv(final atjj b, final abno c, final Executor a, final int e) {
        this.e = e;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        this.a = a;
    }
    
    public eyv(final atjj a, final atjj b, final atjj c, final int e) {
        this.e = e;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
    }
    
    public eyv(final atjj a, final atjj c, final atjj b, final int e, final byte[] array) {
        this.e = e;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public eyv(final avt c, final vbq a, final zki b, final int e, final byte[] array, final byte[] array2) {
        this.e = e;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public eyv(final bu c, final gqb a, final vax b, final int e) {
        this.e = e;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public eyv(final bu c, final hnj b, final fci a, final int e) {
        this.e = e;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public eyv(final bu c, final tzg a, final wwu b, final int e) {
        this.e = e;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public eyv(final bu c, final vmt b, final tny a, final int e) {
        this.e = e;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public eyv(final bu c, final zki b, final zjy a, final int e) {
        this.e = e;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public eyv(final ggi c, final tdz b, final aja a, final int e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.e = e;
        c.getClass();
        this.c = c;
        b.getClass();
        this.b = b;
        this.a = a;
    }
    
    public eyv(final van van, final eg eg, final vax b, final int e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.e = e;
        this.a = van.i((vfe)new gpb(1));
        this.c = eg.af();
        this.b = b;
    }
    
    public eyv(final vbq c, final zki a, final int e) {
        this.e = e;
        this.c = c;
        this.a = a;
        this.b = new asib();
    }
    
    public eyv(final vrk b, final vax a, final tny c, final int e) {
        this.e = e;
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
    }
    
    public eyv(final vrk b, final vax a, final tny c, final int e, final byte[] array) {
        this.e = e;
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
    }
    
    private static Object b(final Map map, final String s, final Object o) {
        if (map != null) {
            if (map.containsKey(s)) {
                try {
                    return map.get(s);
                }
                catch (final ClassCastException ex) {
                    zjp.c(zjo.b, zjn.a, "FormfillPostSubmitCommand: This should never happen.", (Throwable)ex);
                    return null;
                }
            }
        }
        return o;
    }
    
    public final void mE(aioe aioe, final Map map) {
        final int e = this.e;
        int i = 0;
        switch (e) {
            default: {
                tcp.n((aum)this.c, ((zjy)this.a).b(((zki)this.b).c()), (trb)etd.s, (trb)new fcy(this, aioe, 12, (char[])null));
                return;
            }
            case 19: {
                agot.u(((agzd)aioe).rs((agyr)SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.sfvAudioItemSelectCommand));
                final cl supportFragmentManager = ((bu)this.c).getSupportFragmentManager();
                for (int j = supportFragmentManager.a(); j > 0; --j) {
                    supportFragmentManager.aa();
                }
                ((wwu)this.b).n().J(3, (wxz)new wws(aioe.c), (alff)null);
                ((tzg)this.a).n((SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand)((agzd)aioe).rr((agyr)SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.sfvAudioItemSelectCommand));
                return;
            }
            case 18: {
                aioe.getClass();
                final AccountLinkCommandOuterClass$AccountLinkCommand accountLinkCommandOuterClass$AccountLinkCommand = (AccountLinkCommandOuterClass$AccountLinkCommand)((agzd)aioe).rr((agyr)AccountLinkCommandOuterClass$AccountLinkCommand.accountLinkCommand);
                String e2;
                if ((accountLinkCommandOuterClass$AccountLinkCommand.b & 0x4) != 0x0) {
                    e2 = accountLinkCommandOuterClass$AccountLinkCommand.e;
                }
                else {
                    e2 = null;
                }
                if (!TextUtils.isEmpty((CharSequence)e2)) {
                    final String g = ((AccountLinkCommandOuterClass$AccountLinkCommand)((agzd)aioe).rr((agyr)AccountLinkCommandOuterClass$AccountLinkCommand.accountLinkCommand)).g;
                    final agzy f = ((AccountLinkCommandOuterClass$AccountLinkCommand)((agzd)aioe).rr((agyr)AccountLinkCommandOuterClass$AccountLinkCommand.accountLinkCommand)).f;
                    final AccountLinkCommandOuterClass$AccountLinkCommand accountLinkCommandOuterClass$AccountLinkCommand2 = (AccountLinkCommandOuterClass$AccountLinkCommand)((agzd)aioe).rr((agyr)AccountLinkCommandOuterClass$AccountLinkCommand.accountLinkCommand);
                    aioe aioe2;
                    if ((accountLinkCommandOuterClass$AccountLinkCommand2.b & 0x1) != 0x0) {
                        if ((aioe2 = accountLinkCommandOuterClass$AccountLinkCommand2.c) == null) {
                            aioe2 = aioe.a;
                        }
                    }
                    else {
                        aioe2 = null;
                    }
                    final AccountLinkCommandOuterClass$AccountLinkCommand accountLinkCommandOuterClass$AccountLinkCommand3 = (AccountLinkCommandOuterClass$AccountLinkCommand)((agzd)aioe).rr((agyr)AccountLinkCommandOuterClass$AccountLinkCommand.accountLinkCommand);
                    if ((accountLinkCommandOuterClass$AccountLinkCommand3.b & 0x2) != 0x0) {
                        if ((aioe = accountLinkCommandOuterClass$AccountLinkCommand3.d) == null) {
                            aioe = aioe.a;
                        }
                    }
                    else {
                        aioe = null;
                    }
                    final Object c = this.c;
                    final gqb gqb = (gqb)this.a;
                    final SettableFuture c2 = gqb.c;
                    Object o;
                    if (c2 != null) {
                        c2.cancel(true);
                        o = afva.k();
                    }
                    else {
                        gqb.c = SettableFuture.create();
                        final Intent intent = new Intent((Context)c, (Class)GalFlowActivity.class);
                        intent.putExtra("thirdPartyId", e2);
                        intent.putExtra("consentLanguageKeys", g);
                        if (!((Collection)f).isEmpty()) {
                            intent.putStringArrayListExtra("galCapabilities", new ArrayList((Collection<? extends E>)f));
                        }
                        ((Activity)c).startActivity(intent);
                        o = gqb.c;
                    }
                    tcp.n((aum)c, (ListenableFuture)o, (trb)new fcy(this, aioe, 6, (byte[])null), (trb)new eyc(this, aioe2, aioe, 5, null));
                    return;
                }
                trn.b("No third party id in AccountLinkCommand.");
                return;
            }
            case 17: {
                CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint;
                if (((agzd)aioe).rs((agyr)CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint.createBackstagePostDialogEndpoint)) {
                    createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint = (CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint)((agzd)aioe).rr((agyr)CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint.createBackstagePostDialogEndpoint);
                }
                else {
                    createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint = null;
                }
                ahxr a = null;
                Label_0681: {
                    if (createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint != null) {
                        aiya aiya;
                        if ((aiya = createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint.b) == null) {
                            aiya = aiya.a;
                        }
                        if (aiya.b == 118523928) {
                            aiya aiya2;
                            if ((aiya2 = createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint.b) == null) {
                                aiya2 = aiya.a;
                            }
                            if (aiya2.b == 118523928) {
                                a = (ahxr)aiya2.c;
                            }
                            else {
                                a = ahxr.a;
                            }
                            break Label_0681;
                        }
                    }
                    a = null;
                }
                if (a == null) {
                    trn.b("Executed CreateBackstagePostDialogEndpoint with no BackstagePostDialogRenderer.");
                    return;
                }
                if (((abno)this.c).f()) {
                    ((abno)this.c).a();
                }
                ((Executor)this.a).execute(aesm.h((Runnable)new gox(this, a, (smg)new gph((Runnable)tmy.O(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag", (Class)Runnable.class), (smg)tmy.O(map, (Object)"com.google.android.libraries.youtube.comment.comment_thread_created_callback", (Class)smg.class)), 2, null)));
                return;
            }
            case 16: {
                if (((agzd)aioe).rs((agyr)TimeDelayedEndpoint$CreateTimeDelayedEndpoint.createTimeDelayedEndpoint)) {
                    final TimeDelayedEndpoint$CreateTimeDelayedEndpoint timeDelayedEndpoint$CreateTimeDelayedEndpoint = (TimeDelayedEndpoint$CreateTimeDelayedEndpoint)((agzd)aioe).rr((agyr)TimeDelayedEndpoint$CreateTimeDelayedEndpoint.createTimeDelayedEndpoint);
                    final String c3 = timeDelayedEndpoint$CreateTimeDelayedEndpoint.c;
                    final gpc gpc = new gpc(this, timeDelayedEndpoint$CreateTimeDelayedEndpoint, map, c3, null);
                    if ((timeDelayedEndpoint$CreateTimeDelayedEndpoint.b & 0x1) != 0x0) {
                        ((Map<String, gpc>)this.b).put(c3, gpc);
                    }
                    ((Handler)this.c).postDelayed((Runnable)gpc, (long)timeDelayedEndpoint$CreateTimeDelayedEndpoint.d);
                    return;
                }
                if (((agzd)aioe).rs((agyr)TimeDelayedEndpoint$CancelTimeDelayedEndpoint.cancelTimeDelayedEndpoint)) {
                    final TimeDelayedEndpoint$CancelTimeDelayedEndpoint timeDelayedEndpoint$CancelTimeDelayedEndpoint = (TimeDelayedEndpoint$CancelTimeDelayedEndpoint)((agzd)aioe).rr((agyr)TimeDelayedEndpoint$CancelTimeDelayedEndpoint.cancelTimeDelayedEndpoint);
                    if ((timeDelayedEndpoint$CancelTimeDelayedEndpoint.b & 0x1) != 0x0) {
                        final Runnable runnable = ((Map<K, Runnable>)this.b).remove(timeDelayedEndpoint$CancelTimeDelayedEndpoint.c);
                        if (runnable != null) {
                            ((Handler)this.c).removeCallbacks(runnable);
                        }
                    }
                }
                return;
            }
            case 15: {
                if (((agzd)aioe).rs((agyr)FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.formfillPostSubmitEndpoint)) {
                    final FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint = (FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint)((agzd)aioe).rr((agyr)FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.formfillPostSubmitEndpoint);
                    final int k = afld.J(formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.d);
                    Label_1385: {
                        if (k != 0) {
                            if (k == 2) {
                                final ArrayList list = (ArrayList)b(map, "FORM_RESULTS_ARG", new ArrayList());
                                final agza builder = ((agzi)eiv.a).createBuilder();
                                final String c4 = formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.c;
                                builder.copyOnWrite();
                                final eiv eiv = (eiv)builder.instance;
                                c4.getClass();
                                eiv.b |= 0x1;
                                eiv.c = c4;
                                builder.copyOnWrite();
                                final eiv eiv2 = (eiv)builder.instance;
                                final agzy d = eiv2.d;
                                if (!d.c()) {
                                    eiv2.d = agzi.mutableCopy(d);
                                }
                                agxl.addAll((Iterable)list, (List)eiv2.d);
                                final byte[] byteArray = ((agxl)builder.build()).toByteArray();
                                final Object a2 = this.a;
                                ahky ahky;
                                if ((ahky = formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.b) == null) {
                                    ahky = ahky.a;
                                }
                                final Object c5 = this.c;
                                final Uri l = sgn.j(ahky);
                                if (l != null && !Uri.EMPTY.equals((Object)l)) {
                                    final sgn sgn = (sgn)a2;
                                    final Uri g2 = sgn.g(l, new znn[] { (znn)c5 });
                                    sgn.i(g2, ahky, sgn.d.d(g2, byteArray, sgn.a.c()));
                                }
                                break Label_1385;
                            }
                        }
                        final ArrayList list2 = new ArrayList();
                        final List list3 = (List)b(map, "FORM_RESULTS_ARG", new ArrayList());
                        if (list3 != null) {
                            for (final eiu eiu : list3) {
                                final String e3 = eiu.e;
                                eiw a3;
                                if (eiu.c == 4) {
                                    a3 = (eiw)eiu.d;
                                }
                                else {
                                    a3 = eiw.a;
                                }
                                final String c6 = a3.c;
                                if (!aexs.f(e3) && !aexs.f(c6)) {
                                    list2.add(ajox.S((Object)e3, (Object)c6));
                                }
                            }
                        }
                        final Object a4 = this.a;
                        ahky ahky2;
                        if ((ahky2 = formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.b) == null) {
                            ahky2 = ahky.a;
                        }
                        ((sgk)a4).d(ahky2, (List)list2, false, new znn[0]);
                    }
                    final List list4 = (List)b(map, "SUBMIT_COMMANDS_ARG", new ArrayList());
                    if (list4 != null) {
                        ((vax)this.b).d(list4, map);
                    }
                }
                return;
            }
            case 14: {
                final anrl anrl = (anrl)((agzd)aioe).rr((agyr)anrl.b);
                final String e4 = anrl.e;
                String s;
                if (!aexs.f(e4)) {
                    s = ((Activity)this.c).getString(2132019474, new Object[] { e4 });
                }
                else {
                    s = ((Activity)this.c).getString(2132019472);
                }
                final gbo d2 = gbq.d();
                d2.k((CharSequence)s);
                if ((anrl.c & 0x1) != 0x0) {
                    ((acty)d2).m(((Activity)this.c).getText(2132019473), (View$OnClickListener)new gbw(this, anrl, 8, (byte[])null));
                }
                ((Activity)this.c).runOnUiThread((Runnable)new fsa(this, d2, 11, null));
                return;
            }
            case 13: {
                ((acga)this.a).c((adfm)new snn(this, aioe, 1, (byte[])null));
                return;
            }
            case 12: {
                ((wwv)this.b).b(wya.b(18046), aioe, (alff)null);
                ((wwv)this.b).D((wxz)new wws(wya.c(22163)));
                final InteractionLoggingScreen a5 = ((wwv)this.b).a();
                agnj.A((Object)a5);
                final Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent2.putExtra("android.intent.extra.LOCAL_ONLY", true);
                intent2.setType("video/*");
                intent2.addCategory("android.intent.category.OPENABLE");
                final Intent addFlags = intent2.putExtra("android.intent.extra.MIME_TYPES", new String[] { "video/*" }).addFlags(64).addFlags(1);
                final String a6 = a5.a;
                final int f2 = a5.f;
                final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
                final agza builder2 = ((agzi)amob.a).createBuilder();
                builder2.copyOnWrite();
                final amob amob = (amob)builder2.instance;
                amob.b |= 0x2;
                amob.d = f2;
                builder2.copyOnWrite();
                final amob amob2 = (amob)builder2.instance;
                a6.getClass();
                amob2.b |= 0x1;
                amob2.c = a6;
                agzc.e((agyr)amoa.b, (Object)builder2.build());
                ((tdg)this.a).c(addFlags, 901, (szw)new fdx(this, (aioe)((agza)agzc).build(), (byte[])null));
                return;
            }
            case 11: {
                final Object b = this.b;
                final String b2 = ((RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint)((agzd)aioe).rr((agyr)RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.removeUpcomingEventReminderEndpoint)).b;
                final vrk vrk = (vrk)b;
                final vrm vrm = new vrm(vrk.c, vrk.d.c(), b2, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                ((vii)vrm).j(aioe.c);
                ((vrk)this.b).h.e((vjn)vrm, (znj)new fcd(this, 2, (short[])null));
                return;
            }
            case 10: {
                final SectionReloadCommandOuterClass$SectionReloadCommand sectionReloadCommandOuterClass$SectionReloadCommand = (SectionReloadCommandOuterClass$SectionReloadCommand)((agzd)aioe).rr((agyr)SectionReloadCommandOuterClass$SectionReloadCommand.sectionReloadCommand);
                if ((sectionReloadCommandOuterClass$SectionReloadCommand.b & 0x4) != 0x0 && sectionReloadCommandOuterClass$SectionReloadCommand.c == 3) {
                    final vbp a7 = ((vbq)this.a).a(((zki)this.b).c());
                    String s2;
                    if (sectionReloadCommandOuterClass$SectionReloadCommand.c == 3) {
                        s2 = (String)sectionReloadCommandOuterClass$SectionReloadCommand.d;
                    }
                    else {
                        s2 = "";
                    }
                    ((vdo)a7).f(s2).j((Class)aiwf.class).s((asix)new fdo(this, sectionReloadCommandOuterClass$SectionReloadCommand, 0, null)).ab();
                    return;
                }
                aiwb a8;
                if (sectionReloadCommandOuterClass$SectionReloadCommand.c == 1) {
                    a8 = (aiwb)sectionReloadCommandOuterClass$SectionReloadCommand.d;
                }
                else {
                    a8 = aiwb.a;
                }
                if (!((agzd)a8).rs((agyr)ansi.b)) {
                    return;
                }
                final Object c7 = this.c;
                final String e5 = sectionReloadCommandOuterClass$SectionReloadCommand.e;
                aiwb a9;
                if (sectionReloadCommandOuterClass$SectionReloadCommand.c == 1) {
                    a9 = (aiwb)sectionReloadCommandOuterClass$SectionReloadCommand.d;
                }
                else {
                    a9 = aiwb.a;
                }
                ((avt)c7).j(fdp.c(e5, (ansi)((agzd)a9).rr((agyr)ansi.b)));
                return;
            }
            case 9: {
                final SaveToPlaylistListEntityUpdateCommandOuterClass$SaveToPlaylistListEntityUpdateCommand saveToPlaylistListEntityUpdateCommandOuterClass$SaveToPlaylistListEntityUpdateCommand = (SaveToPlaylistListEntityUpdateCommandOuterClass$SaveToPlaylistListEntityUpdateCommand)((agzd)aioe).rr((agyr)SaveToPlaylistListEntityUpdateCommandOuterClass$SaveToPlaylistListEntityUpdateCommand.saveToPlaylistListEntityUpdateCommand);
                final vbp a10 = ((vbq)this.c).a(((zki)this.a).c());
                final String b3 = saveToPlaylistListEntityUpdateCommandOuterClass$SaveToPlaylistListEntityUpdateCommand.b;
                final String c8 = saveToPlaylistListEntityUpdateCommandOuterClass$SaveToPlaylistListEntityUpdateCommand.c;
                int ca;
                if ((ca = aqql.cA(saveToPlaylistListEntityUpdateCommandOuterClass$SaveToPlaylistListEntityUpdateCommand.d)) == 0) {
                    ca = 1;
                }
                if (--ca == 1) {
                    ((asib)this.b).c(a10.f(b3).M((ashb)asgy.B((Object)anuc.d(b3).e())).v((asjd)exd.i).j((Class)anud.class).v((asjd)new fdl(c8, 1)).c((asjc)new fdk(a10, c8, 0)).W((asir)new erx((asib)this.b, 6), (asix)ezm.h));
                    return;
                }
                if (ca != 2) {
                    return;
                }
                ((asib)this.b).c(a10.f(b3).v((asjd)exd.j).j((Class)anud.class).v((asjd)new fdl(c8, 0)).c((asjc)new fdk(a10, c8, 2)).W((asir)new erx((asib)this.b, 6), (asix)ezm.i));
                return;
            }
            case 8: {
                aioe.getClass();
                if (((agzd)aioe).rs((agyr)LoopCommandOuterClass$LoopCommand.loopCommand)) {
                    final aaxs aaxs = (aaxs)((atjj)this.a).a();
                    if (aaxs != null) {
                        final LoopCommandOuterClass$LoopCommand loopCommandOuterClass$LoopCommand = (LoopCommandOuterClass$LoopCommand)((agzd)aioe).rr((agyr)LoopCommandOuterClass$LoopCommand.loopCommand);
                        if (!loopCommandOuterClass$LoopCommand.c) {
                            aaxs.a();
                            return;
                        }
                        final afcm d3 = afcr.d();
                        if ((loopCommandOuterClass$LoopCommand.b & 0x2) == 0x0) {
                            d3.h("loop_command.start_time_ms is not filled.");
                        }
                        if ((loopCommandOuterClass$LoopCommand.b & 0x4) == 0x0) {
                            d3.h("loop_command.end_time_ms is not filled.");
                        }
                        final afcr g3 = d3.g();
                        Label_2803: {
                            if (((List)g3).isEmpty()) {
                                if (loopCommandOuterClass$LoopCommand.g) {
                                    final long d4 = loopCommandOuterClass$LoopCommand.d;
                                    final long e6 = loopCommandOuterClass$LoopCommand.e;
                                    final abtt q = ((abno)((atjj)this.b).a()).q();
                                    if (q != null) {
                                        final long c9 = q.c();
                                        if (c9 >= d4 && c9 < e6) {
                                            aaxs.c(loopCommandOuterClass$LoopCommand.d, loopCommandOuterClass$LoopCommand.e);
                                            break Label_2803;
                                        }
                                    }
                                }
                                aaxs.b(loopCommandOuterClass$LoopCommand.d, loopCommandOuterClass$LoopCommand.e);
                            }
                            else {
                                final afcm d5 = afcr.d();
                                if (map == null) {
                                    d5.h("args is null.");
                                }
                                else {
                                    if (map.containsKey("loop_command_resolver_start_time_ms")) {
                                        if (!(map.get("loop_command_resolver_start_time_ms") instanceof Long)) {
                                            d5.h("Value of loop_command_resolver_start_time_ms is not a Long.");
                                        }
                                    }
                                    else {
                                        d5.h("args does not contain key: loop_command_resolver_start_time_ms");
                                    }
                                    if (map.containsKey("loop_command_resolver_end_time_ms")) {
                                        if (!(map.get("loop_command_resolver_end_time_ms") instanceof Long)) {
                                            d5.h("Value of loop_command_resolver_end_time_ms is not a Long.");
                                        }
                                    }
                                    else {
                                        d5.h("args does not contain key: loop_command_resolver_end_time_ms");
                                    }
                                }
                                final afcr g4 = d5.g();
                                if (!((List)g4).isEmpty()) {
                                    final StringBuilder sb = new StringBuilder("There were problems with resolving LoopCommand.");
                                    while (i < 2) {
                                        for (final String s3 : (new List[] { (List)g3, (List)g4 })[i]) {
                                            sb.append(" ");
                                            sb.append(s3);
                                        }
                                        ++i;
                                    }
                                    throw new IllegalArgumentException(sb.toString());
                                }
                                aaxs.b((long)map.get("loop_command_resolver_start_time_ms"), (long)map.get("loop_command_resolver_end_time_ms"));
                            }
                        }
                        if ((loopCommandOuterClass$LoopCommand.b & 0x8) != 0x0) {
                            ((ClipController)((atjj)this.c).a()).u(loopCommandOuterClass$LoopCommand.f);
                        }
                    }
                    return;
                }
                throw new vbh();
            }
            case 7: {
                if (((agzd)aioe).rs((agyr)LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.localWatchHistoryCommand)) {
                    final LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand = (LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand)((agzd)aioe).rr((agyr)LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.localWatchHistoryCommand);
                    final String d6 = ((zzu)((atjj)this.b).a()).d();
                    int dj;
                    if ((dj = aqql.dJ(localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.b)) == 0) {
                        dj = 1;
                    }
                    if (--dj != 1) {
                        if (dj == 2) {
                            ((aadb)this.a).a();
                            return;
                        }
                        if (dj == 3) {
                            ((aacf)this.c).J(d6, true);
                            return;
                        }
                        if (dj == 4) {
                            ((aacf)this.c).J(d6, false);
                        }
                    }
                    else if (!localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.c.isEmpty()) {
                        final Object a11 = this.a;
                        final String c10 = localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.c;
                        final aadb aadb = (aadb)a11;
                        final ListenableFuture h = aadb.h;
                        if (h == null || h.isCancelled() || aadb.h.isDone()) {
                            tcp.k(aadb.h = afrp.f((ListenableFuture)aftj.m(afva.m(((zzu)aadb.e.a()).a())), (afry)new aacz(c10, 0), (Executor)aadb.a), (Executor)afsl.a, (tcn)zqg.i, (tco)new zmd(aadb, 5));
                        }
                    }
                }
                return;
            }
            case 6: {
                final Object c11 = this.c;
                final String c12 = ((EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint)((agzd)aioe).rr((agyr)EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint.editVideoMetadataEndpoint)).c;
                final agyc c13 = aioe.c;
                c12.getClass();
                final Intent intent3 = new Intent((Context)c11, (Class)EditVideoActivity.class);
                intent3.setAction("android.intent.action.EDIT");
                intent3.putExtra("video_id", c12);
                if (!c13.H()) {
                    intent3.putExtra("click_tracking_params", c13.I());
                }
                ((tdg)this.a).c(intent3, 0, (szw)new fcj(this, null));
                return;
            }
            case 5: {
                PaneDescriptor paneDescriptor;
                if (map != null && map.containsKey("com.google.android.libraries.youtube.rendering.presenter.PresentContext")) {
                    final acij acij = map.get("com.google.android.libraries.youtube.rendering.presenter.PresentContext");
                    paneDescriptor = ((aja)this.a).s(aioe, acij.j("nested_fragment_key", false), acij.j("selection_panel", false));
                }
                else {
                    paneDescriptor = ((aja)this.a).r(aioe);
                }
                ((tdz)this.b).d((Object)new fhr());
                ((ggi)this.c).d(paneDescriptor);
                return;
            }
            case 4: {
                if (!((bu)this.c).isFinishing()) {
                    final cl supportFragmentManager2 = ((bu)this.c).getSupportFragmentManager();
                    if (!supportFragmentManager2.Z()) {
                        final bi a12 = ((fci)this.a).a(aioe);
                        final Bundle bundle = (Bundle)Optional.ofNullable((Object)((br)a12).m).orElseGet((Supplier)fde.b);
                        bundle.putByteArray("navigation_endpoint", ((agxl)aioe).toByteArray());
                        ((br)a12).ag(bundle);
                        final Optional map2 = ((hnj)this.b).a().map((Function)fan.d);
                        final auh lifecycle = ((br)a12).getLifecycle();
                        lifecycle.getClass();
                        map2.ifPresent((Consumer)new eot(lifecycle, 6));
                        final ct m = supportFragmentManager2.i();
                        m.s((br)a12, "DialogFragmentFromNavigation");
                        m.e();
                    }
                }
                return;
            }
            case 3: {
                final aczf aczf = (aczf)tmy.O(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag", (Class)aczf.class);
                tmy.M(map, (Object)"contact_menu_source_model");
                final ContactMenuEndpointOuterClass$ContactMenuEndpoint contactMenuEndpointOuterClass$ContactMenuEndpoint = (ContactMenuEndpointOuterClass$ContactMenuEndpoint)((agzd)aioe).rr((agyr)ContactMenuEndpointOuterClass$ContactMenuEndpoint.contactMenuEndpoint);
                String b4;
                if ((contactMenuEndpointOuterClass$ContactMenuEndpoint.b & 0x2) != 0x0) {
                    ajaf ajaf;
                    if ((ajaf = contactMenuEndpointOuterClass$ContactMenuEndpoint.d) == null) {
                        ajaf = ajaf.a;
                    }
                    b4 = ajaf.b;
                }
                else {
                    b4 = null;
                }
                final aczw aczw = new aczw();
                final Bundle bundle2 = new Bundle();
                bundle2.putString("CONTACT_PATH_KEY", b4);
                aczw.ag(bundle2);
                aczw.aK((bu)this.c);
                if (!contactMenuEndpointOuterClass$ContactMenuEndpoint.c.isEmpty()) {
                    final String c14 = contactMenuEndpointOuterClass$ContactMenuEndpoint.c;
                    final Object b5 = this.b;
                    final fcd fcd = new fcd(this, 0, (byte[])null);
                    final vmt vmt = (vmt)b5;
                    final vmv vmv = new vmv(vmt.c, vmt.d.c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                    vmv.a = vmv.g(c14);
                    ((vkm)b5).c((MessageLite)akit.a, vmt.f, (tad)vmq.d, (tac)vlh.p).e((vjn)vmv, (znj)fcd);
                }
                return;
            }
            case 2: {
                final Object b6 = this.b;
                final String b7 = ((AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint)((agzd)aioe).rr((agyr)AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.addUpcomingEventReminderEndpoint)).b;
                final vrk vrk2 = (vrk)b6;
                final vrf vrf = new vrf(vrk2.c, vrk2.d.c(), b7, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                ((vii)vrf).j(aioe.c);
                ((vrk)this.b).g.e((vjn)vrf, (znj)new fcd(this, 1, (char[])null));
                return;
            }
            case 1: {
                if (aioe != null) {
                    if (((zki)this.a).c() instanceof AccountIdentity) {
                        final AccountIdentity accountIdentity = (AccountIdentity)((zki)this.a).c();
                        if (accountIdentity.w()) {
                            ((abyo)this.b).h((Activity)this.c, Uri.parse("https://accounts.google.com/AccountChooser").buildUpon().appendQueryParameter("hl", Locale.getDefault().getLanguage()).appendQueryParameter("continue", String.format("https://myaccount.google.com/?pageId=%s&utm_source=YouTubeAndroid&utm_medium=act&hl=%s", accountIdentity.e(), Locale.getDefault().getLanguage())).appendQueryParameter("Email", accountIdentity.a()).build());
                            return;
                        }
                        ((Activity)this.c).startActivityForResult(new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.mgoogle.android.gms").putExtra("extra.accountName", accountIdentity.a()).putExtra("extra.screenId", 217), 0);
                    }
                }
                return;
            }
            case 0: {
                aihe aihe;
                if ((aihe = ((ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint)((agzd)aioe).rr((agyr)ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.channelProfileFieldEditorEndpoint)).c) == null) {
                    aihe = aihe.a;
                }
                final int b8 = aihe.b;
                if (b8 == 372524273) {
                    final eyf eyf = (eyf)((atjj)this.a).a();
                    aihf a13;
                    if (aihe.b == 372524273) {
                        a13 = (aihf)aihe.c;
                    }
                    else {
                        a13 = aihf.a;
                    }
                    eyf.a(a13);
                    return;
                }
                if (b8 == 105915641) {
                    final eym eym = (eym)((atjj)this.b).a();
                    aihg a14;
                    if (aihe.b == 105915641) {
                        a14 = (aihg)aihe.c;
                    }
                    else {
                        a14 = aihg.a;
                    }
                    eym.a(a14);
                    return;
                }
                if (b8 == 105915776) {
                    final eyb eyb = (eyb)((atjj)this.c).a();
                    aihc a15;
                    if (aihe.b == 105915776) {
                        a15 = (aihc)aihe.c;
                    }
                    else {
                        a15 = aihc.a;
                    }
                    eyb.a(a15);
                    return;
                }
                zjp.b(zjo.a, zjn.I, "[ChannelProfileFieldEditorCommand] No supported editor in endpoint.");
            }
        }
    }
}
