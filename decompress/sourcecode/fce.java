import android.view.ViewGroup;
import java.util.Iterator;
import android.content.ClipData;
import android.content.ClipboardManager;
import com.google.protos.youtube.api.innertube.CopyTextEndpointOuterClass$CopyTextEndpoint;
import com.google.android.apps.youtube.app.player.controls.ReportVideoController;
import com.google.protos.youtube.api.innertube.FlagVideoEndpointOuterClass$FlagVideoEndpoint;
import com.google.protos.youtube.api.innertube.LocationCollectionCommandOuterClass$LocationCollectionCommand;
import com.google.protos.youtube.api.innertube.MuteAdEndpointOuterClass$MuteAdEndpoint;
import android.content.Intent;
import com.google.protos.youtube.api.innertube.OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand;
import java.util.Collections;
import java.util.HashMap;
import com.google.protos.youtube.api.innertube.SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand;
import com.google.protos.youtube.api.innertube.InAppUpdateCommandOuterClass;
import com.google.protos.youtube.api.innertube.ShowMealbarActionOuterClass$ShowMealbarAction;
import android.content.ActivityNotFoundException;
import com.google.protos.youtube.api.innertube.AndroidApplicationEndpointOuterClass;
import com.google.protos.youtube.api.innertube.QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand;
import com.google.protos.youtube.api.innertube.QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand;
import com.google.protos.youtube.api.innertube.SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand;
import com.google.protos.youtube.api.innertube.FeedbackEndpointOuterClass;
import java.util.Set;
import android.view.View;
import j$.util.Objects;
import com.google.protos.youtube.api.innertube.WatchPlayerOverflowMenuCommandOuterClass$WatchPlayerOverflowMenuCommand;
import j$.util.Optional;
import java.util.List;
import java.util.ArrayList;
import com.google.protos.youtube.api.innertube.MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand;
import com.google.protos.youtube.api.innertube.PreloadAppStoreCommandOuterClass;
import com.google.protobuf.MessageLite;
import android.os.Bundle;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.BackstageRepostCreationRendererOuterClass;
import com.google.protos.youtube.api.innertube.CreateBackstageRepostCommandOuterClass$CreateBackstageRepostCommand;
import java.util.Map;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController;
import android.content.Context;
import android.app.Activity;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fce implements vau
{
    public final Object a;
    private final /* synthetic */ int c;
    private final Object d;
    
    public fce(final abno a, final abpb d, final int c) {
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public fce(final abno a, final absi d, final int c) {
        this.c = c;
        a.getClass();
        this.a = a;
        d.getClass();
        this.d = d;
    }
    
    public fce(final abno d, final vax a, final int c) {
        this.c = c;
        d.getClass();
        this.d = d;
        a.getClass();
        this.a = a;
    }
    
    public fce(final aeby d, final ewl ewl, final Executor executor, final asho asho, final int c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.a = new vja(ewl);
        this.d = d;
        executor.execute(aesm.h((Runnable)new fsa(this, asho, 13, null)));
    }
    
    public fce(final Activity a, final vax d, final int c) {
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public fce(final Context context, final int c) {
        this.c = c;
        this.a = mwq.e(context);
        this.d = new mwr(context);
    }
    
    public fce(final Context a, final vax d, final int c) {
        this.c = c;
        a.getClass();
        this.a = a;
        d.getClass();
        this.d = d;
    }
    
    public fce(final Context a, final vax d, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public fce(final atjj d, final abno a, final int c) {
        this.c = c;
        d.getClass();
        this.d = d;
        a.getClass();
        this.a = a;
    }
    
    public fce(final atjj a, final atjj d, final int c) {
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public fce(final atjj d, final hnj a, final int c) {
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public fce(final atjj d, final uyf a, final int c) {
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public fce(final bu a, final atjj d, final int c) {
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public fce(final bu a, final gko d, final int c) {
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public fce(final MealbarPromoController a, final wwu d, final int c) {
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public fce(final YouTubeControlsOverlay a, final kti d, final int c) {
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public fce(final tdz a, final vax d, final int c) {
        this.c = c;
        a.getClass();
        this.a = a;
        d.getClass();
        this.d = d;
    }
    
    public fce(final vax a, final agls d, final int c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public fce(final vax d, final fjp a, final int c) {
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public fce(final vbq d, final oas a, final int c) {
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    private final void b(final ahpv ahpv, final Map map) {
        if ((ahpv.b & 0x4) != 0x0) {
            final Object d = this.d;
            aioe aioe;
            if ((aioe = ahpv.f) == null) {
                aioe = aioe.a;
            }
            ((vax)d).c(aioe, map);
            return;
        }
        tmy.x((Context)this.a, 2132017992, 0);
    }
    
    public final void mE(aioe aioe, final Map map) {
        final int c = this.c;
        int n = 1;
        final SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand setPlaybackStateCommandOuterClass$SetPlaybackStateCommand = null;
        final aosi aosi = null;
        switch (c) {
            default: {
                CreateBackstageRepostCommandOuterClass$CreateBackstageRepostCommand createBackstageRepostCommandOuterClass$CreateBackstageRepostCommand;
                if (((agzd)aioe).rs((agyr)CreateBackstageRepostCommandOuterClass$CreateBackstageRepostCommand.createBackstageRepostCommand)) {
                    createBackstageRepostCommandOuterClass$CreateBackstageRepostCommand = (CreateBackstageRepostCommandOuterClass$CreateBackstageRepostCommand)((agzd)aioe).rr((agyr)CreateBackstageRepostCommandOuterClass$CreateBackstageRepostCommand.createBackstageRepostCommand);
                }
                else {
                    createBackstageRepostCommandOuterClass$CreateBackstageRepostCommand = null;
                }
                anss anss;
                if ((anss = createBackstageRepostCommandOuterClass$CreateBackstageRepostCommand.b) == null) {
                    anss = anss.a;
                }
                ahxz ahxz;
                if (((agzd)anss).rs((agyr)BackstageRepostCreationRendererOuterClass.backstageRepostCreationRenderer)) {
                    ahxz = (ahxz)((agzd)anss).rr((agyr)BackstageRepostCreationRendererOuterClass.backstageRepostCreationRenderer);
                }
                else {
                    ahxz = null;
                }
                if (ahxz == null) {
                    trn.b("Executed createBackstageRepostCommand with no BackstageRepostCreationRenderer.");
                    return;
                }
                if (((abno)this.a).f()) {
                    ((abno)this.a).a();
                }
                final gpi b = new gpi((smg)tmy.O(map, (Object)"com.google.android.libraries.youtube.comment.comment_thread_created_callback", (Class)smg.class));
                final tix tix = (tix)((atjj)this.d).a();
                anss anss2;
                if ((anss2 = ahxz.d) == null) {
                    anss2 = anss.a;
                }
                if ((((aibb)((agzd)anss2).rr((agyr)ButtonRendererOuterClass.buttonRenderer)).b & 0x4000) != 0x0) {
                    final ct i = ((bu)tix.b).getSupportFragmentManager().i();
                    final br f = ((bu)tix.b).getSupportFragmentManager().f("backstage_repost_fragment");
                    if (f != null) {
                        i.n(f);
                    }
                    i.t((String)null);
                    tix.f = null;
                    final Object d = tix.d;
                    final srx f2 = new srx();
                    final Bundle bundle = new Bundle();
                    aeda.av(bundle, "renderer", (MessageLite)ahxz);
                    f2.ag(bundle);
                    tix.f = f2;
                    final slj slj = (slj)tix.e;
                    slj.b = (smg)b;
                    final Object f3 = tix.f;
                    final bi c2 = (bi)f3;
                    slj.c = c2;
                    ((srx)f3).aq = new ugu(tix, ahxz, (byte[])null, (byte[])null);
                    c2.s(i, "backstage_repost_fragment");
                    return;
                }
                trn.b("Command for repost button is missing in BackstageRepostCreationRenderer");
                return;
            }
            case 19: {
                if (((agzd)aioe).rs((agyr)PreloadAppStoreCommandOuterClass.preloadAppStoreCommand)) {
                    if (((vja)this.a).a) {
                        final anks anks = (anks)((agzd)aioe).rr((agyr)PreloadAppStoreCommandOuterClass.preloadAppStoreCommand);
                        final aeby aeby = new aeby((byte[])null);
                        if ((anks.b & 0x4) != 0x0) {
                            ((List<String>)aeby.a).add(anks.c);
                        }
                        final Object d2 = this.d;
                        final aeby aeby2 = new aeby(aeby, null, (char[])null);
                        final aeam aeam = (aeam)((aeby)d2).a;
                        if (aeam.a == null) {
                            aeam.c.k("error: %s", "Play Store not found.");
                            return;
                        }
                        final nmo nmo = new nmo();
                        aeam.a.f((aeau)new aeal(aeam, nmo, aeby2, nmo, (byte[])null, (byte[])null, (byte[])null), nmo);
                    }
                }
                return;
            }
            case 18: {
                if (!((agzd)aioe).rs((agyr)MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand.markBelowPlayerSurveyDisplayedCommand)) {
                    return;
                }
                final MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand markBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand = (MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand)((agzd)aioe).rr((agyr)MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand.markBelowPlayerSurveyDisplayedCommand);
                final vbp b2 = ((vbq)this.d).b();
                ((vdo)b2).f(markBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand.b).j((Class)akcc.class).p((asir)gep.d).c((asjc)new fdk(this, (vdo)b2, 14, null)).r((asix)gpa.b).U();
                return;
            }
            case 17: {
                if (!((agzd)aioe).rs((agyr)ajcv.b)) {
                    return;
                }
                ((sjy)((atjj)this.a).a()).s();
                final ruo ruo = (ruo)((atjj)this.d).a();
                final Object b3 = ruo.b;
                if (b3 == null) {
                    final Object a = ruo.a;
                    qcv.A((sfh)null, "Tried to dismiss survey with no registered listener");
                    return;
                }
                final ArrayList list = new ArrayList();
                final rxa rxa = (rxa)b3;
                for (final sfy sfy : rxa.b.r()) {
                    final sga b4 = sfy.b;
                    if (b4 instanceof sfr && ((rvv)rxa.a.a()).j().contains(((sfr)b4).a)) {
                        list.add(sfy);
                    }
                }
                rxa.b((List)list);
                return;
            }
            case 16: {
                Optional optional2;
                final Optional optional = optional2 = Optional.empty();
                if (((agzd)aioe).rs((agyr)WatchPlayerOverflowMenuCommandOuterClass$WatchPlayerOverflowMenuCommand.watchPlayerOverflowMenuCommand)) {
                    final WatchPlayerOverflowMenuCommandOuterClass$WatchPlayerOverflowMenuCommand watchPlayerOverflowMenuCommandOuterClass$WatchPlayerOverflowMenuCommand = (WatchPlayerOverflowMenuCommandOuterClass$WatchPlayerOverflowMenuCommand)((agzd)aioe).rr((agyr)WatchPlayerOverflowMenuCommandOuterClass$WatchPlayerOverflowMenuCommand.watchPlayerOverflowMenuCommand);
                    optional2 = optional;
                    if ((watchPlayerOverflowMenuCommandOuterClass$WatchPlayerOverflowMenuCommand.b & 0x1) != 0x0) {
                        final String c3 = watchPlayerOverflowMenuCommandOuterClass$WatchPlayerOverflowMenuCommand.c;
                        if (Objects.equals((Object)c3, (Object)"menu_item_single_video_playback_loop")) {
                            optional2 = Optional.of((Object)0);
                        }
                        else if (Objects.equals((Object)c3, (Object)"menu_item_cinematic_lighting")) {
                            optional2 = Optional.of((Object)1);
                        }
                        else {
                            optional2 = Optional.empty();
                        }
                    }
                }
                final ViewGroup a2 = ((YouTubeControlsOverlay)this.a).A();
                if (optional2.isPresent()) {
                    ((kti)this.d).k((View)a2, (Set)afdu.s((Object)optional2.get()));
                    return;
                }
                ((kti)this.d).j((View)a2);
                return;
            }
            case 15: {
                aosi aosi2 = aosi;
                if (((agzd)aioe).rs((agyr)aosj.a)) {
                    aosi2 = (aosi)((agzd)aioe).rr((agyr)aosj.a);
                }
                if (aosi2 != null && (aosi2.b & 0x1) != 0x0) {
                    final abtt p2 = ((abno)this.d).p();
                    if (p2 != null) {
                        ajqo ajqo;
                        if ((ajqo = aosi2.c) == null) {
                            ajqo = ajqo.a;
                        }
                        final agza builder = ((agzi)ajqo.a).createBuilder((agzi)ajqo);
                        final long c4 = p2.c();
                        builder.copyOnWrite();
                        final ajqo ajqo2 = (ajqo)builder.instance;
                        ajqo2.c = 7;
                        ajqo2.d = c4;
                        final ajqo ajqo3 = (ajqo)builder.build();
                        final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
                        agzc.e((agyr)FeedbackEndpointOuterClass.feedbackEndpoint, (Object)ajqo3);
                        aioe = (aioe)((agza)agzc).build();
                        ((vax)this.a).a(aioe);
                    }
                }
                return;
            }
            case 14: {
                SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand setPlaybackStateCommandOuterClass$SetPlaybackStateCommand2 = setPlaybackStateCommandOuterClass$SetPlaybackStateCommand;
                if (((agzd)aioe).rs((agyr)SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.setPlaybackStateCommand)) {
                    setPlaybackStateCommandOuterClass$SetPlaybackStateCommand2 = (SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand)((agzd)aioe).rr((agyr)SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.setPlaybackStateCommand);
                }
                if (setPlaybackStateCommandOuterClass$SetPlaybackStateCommand2 != null && (setPlaybackStateCommandOuterClass$SetPlaybackStateCommand2.b & 0x1) != 0x0) {
                    final int bc = aqql.bC(setPlaybackStateCommandOuterClass$SetPlaybackStateCommand2.c);
                    if (bc != 0) {
                        n = bc;
                    }
                    switch (n - 1) {
                        case 7: {
                            ((abno)this.a).G();
                            return;
                        }
                        case 6: {
                            ((absi)this.d).j();
                            return;
                        }
                        case 5: {
                            ((absi)this.d).i();
                            return;
                        }
                        case 4: {
                            ((absi)this.d).g(-10000L);
                            return;
                        }
                        case 3: {
                            ((absi)this.d).g(10000L);
                            return;
                        }
                        case 2: {
                            if (((abno)this.a).f()) {
                                ((abno)this.a).a();
                                return;
                            }
                            break;
                        }
                        case 1: {
                            if (!((abno)this.a).f()) {
                                ((abno)this.a).D();
                                break;
                            }
                            break;
                        }
                    }
                }
                return;
            }
            case 13: {
                final QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand queueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand = (QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand)((agzd)aioe).rr((agyr)QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand.queueAwarePlaylistWatchCommand);
                if (((agls)this.d).a == 5) {
                    final Object a3 = this.a;
                    if ((aioe = queueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand.b) == null) {
                        aioe = aioe.a;
                    }
                    ((vax)a3).a(aioe);
                    return;
                }
                final Object a4 = this.a;
                if ((aioe = queueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand.c) == null) {
                    aioe = aioe.a;
                }
                ((vax)a4).a(aioe);
                return;
            }
            case 12: {
                final QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand queueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand = (QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand)((agzd)aioe).rr((agyr)QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand.queueAddMenuItemCommand);
                if (((fjp)this.a).j().i()) {
                    final Object d3 = this.d;
                    if ((aioe = queueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand.b) == null) {
                        aioe = aioe.a;
                    }
                    ((vax)d3).a(aioe);
                    return;
                }
                final Object d4 = this.d;
                if ((aioe = queueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand.c) == null) {
                    aioe = aioe.a;
                }
                ((vax)d4).a(aioe);
                return;
            }
            case 11: {
                final Intent ah = tmy.ah();
                final ahpv ahpv = (ahpv)((agzd)aioe).rr((agyr)AndroidApplicationEndpointOuterClass.androidAppEndpoint);
                ah.setClassName(ahpv.c, ahpv.d);
                for (final aliq aliq : ahpv.e) {
                    final String e = aliq.e;
                    String s;
                    if (aliq.c == 2) {
                        s = (String)aliq.d;
                    }
                    else {
                        s = "";
                    }
                    ah.putExtra(e, s);
                }
                if (!((Activity)this.a).getPackageManager().queryIntentActivities(ah, 128).isEmpty()) {
                    try {
                        ((Activity)this.a).startActivity(ah);
                        return;
                    }
                    catch (final ActivityNotFoundException ex) {
                        this.b(ahpv, map);
                        return;
                    }
                }
                this.b(ahpv, map);
                return;
            }
            case 10: {
                if (((agzd)aioe).rs((agyr)ShowMealbarActionOuterClass$ShowMealbarAction.showMealbarAction)) {
                    final ShowMealbarActionOuterClass$ShowMealbarAction showMealbarActionOuterClass$ShowMealbarAction = (ShowMealbarActionOuterClass$ShowMealbarAction)((agzd)aioe).rr((agyr)ShowMealbarActionOuterClass$ShowMealbarAction.showMealbarAction);
                    aoel aoel;
                    if ((aoel = showMealbarActionOuterClass$ShowMealbarAction.b) == null) {
                        aoel = aoel.a;
                    }
                    if ((aoel.b & 0x1) != 0x0) {
                        aoel aoel2;
                        if ((aoel2 = showMealbarActionOuterClass$ShowMealbarAction.b) == null) {
                            aoel2 = aoel.a;
                        }
                        amdk amdk;
                        if ((amdk = aoel2.c) == null) {
                            amdk = amdk.a;
                        }
                        ((MealbarPromoController)this.a).k(amdk, ((wwu)this.d).n());
                    }
                }
                return;
            }
            case 9: {
                aook aook;
                if ((aook = ((uyf)this.a).b().s) == null) {
                    aook = aook.a;
                }
                if (!aook.k) {
                    return;
                }
                ((fjf)((atjj)this.d).a()).j((akcd)((agzd)aioe).rr((agyr)InAppUpdateCommandOuterClass.inAppUpdateCommand));
                return;
            }
            case 8: {
                final String b5 = (String)tmy.O(map, (Object)"SilentSubmitUserFeedbackCommandResolver.DESCRIPTION_KEY", (Class)String.class);
                if (b5 != null) {
                    if (b5.length() != 0) {
                        final SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand silentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand = (SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand)((agzd)aioe).rr((agyr)SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.silentSubmitUserFeedbackCommand);
                        final HashMap hashMap = new HashMap();
                        for (final Map.Entry entry : Collections.unmodifiableMap((Map<?, ?>)silentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.c).entrySet()) {
                            hashMap.put(entry.getKey(), entry.getValue());
                        }
                        final mwr mwr = (mwr)this.d;
                        mwr.b = b5;
                        mwr.c = silentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.b;
                        mwr.c();
                        mwr.b(true);
                        for (final Map.Entry<String, V> entry2 : hashMap.entrySet()) {
                            mwr.a.putString((String)entry2.getKey(), (String)entry2.getValue());
                        }
                        ((mpr)this.a).y(mwr.a());
                    }
                }
                return;
            }
            case 7: {
                final Object d5 = this.d;
                final long j = ((abno)this.a).j();
                for (final yyg yyg : ((abpx)d5).b.values()) {
                    final yye f4 = yyg.f;
                    final String e2 = yyg.e();
                    final String c5 = yyg.c(j);
                    final StringBuilder sb = new StringBuilder();
                    sb.append(e2);
                    sb.append(":feedback:");
                    sb.append(c5);
                    f4.a("error", sb.toString());
                    yyg.f.h();
                }
                return;
            }
            case 6: {
                final OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand openMyGooglePageCommandOuterClass$OpenMyGooglePageCommand = (OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand)((agzd)aioe).rr((agyr)OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand.openMyGooglePageCommand);
                final Intent intent = new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS");
                for (final Map.Entry entry3 : Collections.unmodifiableMap((Map<?, ?>)openMyGooglePageCommandOuterClass$OpenMyGooglePageCommand.d).entrySet()) {
                    intent.putExtra("extra.screen.".concat(String.valueOf(entry3.getKey())), (String)entry3.getValue());
                }
                if ((openMyGooglePageCommandOuterClass$OpenMyGooglePageCommand.b & 0x1) != 0x0) {
                    intent.putExtra("extra.screenId", openMyGooglePageCommandOuterClass$OpenMyGooglePageCommand.c);
                }
                intent.putExtra("extra.themeChoice", ((gko)this.d).a().c);
                aesm.l((Activity)this.a, intent);
                return;
            }
            case 5: {
                final Optional a5 = ((hnj)this.a).a();
                if (a5.isPresent()) {
                    ((hnk)a5.get()).D();
                    return;
                }
                ((irz)((atjj)this.d).a()).d();
                return;
            }
            case 4: {
                final Object m = tmy.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag");
                final MuteAdEndpointOuterClass$MuteAdEndpoint muteAdEndpointOuterClass$MuteAdEndpoint = (MuteAdEndpointOuterClass$MuteAdEndpoint)((agzd)aioe).rr((agyr)MuteAdEndpointOuterClass$MuteAdEndpoint.muteAdEndpoint);
                ((tdz)this.a).d((Object)new shi(muteAdEndpointOuterClass$MuteAdEndpoint, m));
                ((vax)this.d).e((List)muteAdEndpointOuterClass$MuteAdEndpoint.c, m);
                return;
            }
            case 3: {
                if (!((agzd)aioe).rs((agyr)LocationCollectionCommandOuterClass$LocationCollectionCommand.locationCollectionCommand)) {
                    throw new vbh();
                }
                final LocationCollectionCommandOuterClass$LocationCollectionCommand locationCollectionCommandOuterClass$LocationCollectionCommand = (LocationCollectionCommandOuterClass$LocationCollectionCommand)((agzd)aioe).rr((agyr)LocationCollectionCommandOuterClass$LocationCollectionCommand.locationCollectionCommand);
                if (acsm.g((Context)this.a)) {
                    if ((locationCollectionCommandOuterClass$LocationCollectionCommand.b & 0x4) != 0x0) {
                        final Object d6 = this.d;
                        if ((aioe = locationCollectionCommandOuterClass$LocationCollectionCommand.d) == null) {
                            aioe = aioe.a;
                        }
                        ((vax)d6).a(aioe);
                        return;
                    }
                    zjp.b(zjo.b, zjn.e, "Rendering data missing for GetLocationCommand");
                    throw new vbh("Rendering data missing for GetLocationCommand");
                }
                else {
                    if ((locationCollectionCommandOuterClass$LocationCollectionCommand.b & 0x1) != 0x0) {
                        final Object d7 = this.d;
                        if ((aioe = locationCollectionCommandOuterClass$LocationCollectionCommand.c) == null) {
                            aioe = aioe.a;
                        }
                        ((vax)d7).a(aioe);
                        return;
                    }
                    zjp.b(zjo.b, zjn.e, "Rendering data missing for OpenCollectionDialogAction");
                    throw new vbh("Rendering data missing for OpenCollectionDialogAction");
                }
                break;
            }
            case 2: {
                final Optional a6 = ((hnj)this.a).a();
                if (a6.isPresent()) {
                    ((hnk)a6.get()).A(((FlagVideoEndpointOuterClass$FlagVideoEndpoint)((agzd)aioe).rr((agyr)FlagVideoEndpointOuterClass$FlagVideoEndpoint.flagVideoEndpoint)).b);
                    return;
                }
                final ReportVideoController reportVideoController = (ReportVideoController)((atjj)this.d).a();
                final alcc f5 = reportVideoController.f;
                if (f5 == null) {
                    trn.b("Reporting options have never been set.");
                    tmy.x((Context)reportVideoController.a, 2132018403, 1);
                    return;
                }
                reportVideoController.e.c();
                if (reportVideoController.b.t()) {
                    reportVideoController.j(f5);
                    return;
                }
                reportVideoController.d.b(reportVideoController.a, (byte[])null, (zku)new gmr(reportVideoController, f5, 3));
                return;
            }
            case 1: {
                ((irr)((atjj)this.d).a()).c((bu)this.a);
                return;
            }
            case 0: {
                final CopyTextEndpointOuterClass$CopyTextEndpoint copyTextEndpointOuterClass$CopyTextEndpoint = (CopyTextEndpointOuterClass$CopyTextEndpoint)((agzd)aioe).rr((agyr)CopyTextEndpointOuterClass$CopyTextEndpoint.copyTextEndpoint);
                final ClipboardManager clipboardManager = (ClipboardManager)((Context)this.a).getSystemService("clipboard");
                if (clipboardManager == null) {
                    if (copyTextEndpointOuterClass$CopyTextEndpoint.d.size() > 0) {
                        ((vax)this.d).b((List)copyTextEndpointOuterClass$CopyTextEndpoint.d);
                    }
                    return;
                }
                clipboardManager.setPrimaryClip(ClipData.newPlainText((CharSequence)"text/plain", (CharSequence)copyTextEndpointOuterClass$CopyTextEndpoint.b));
                ((vax)this.d).b((List)copyTextEndpointOuterClass$CopyTextEndpoint.c);
            }
        }
    }
}
