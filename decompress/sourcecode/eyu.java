import android.view.View;
import java.util.Iterator;
import com.google.protos.youtube.api.innertube.ChannelPageContinuationCommandOuterClass$ChannelPageContinuationCommand;
import com.google.protos.youtube.api.innertube.ProfileCardCommandOuterClass$ProfileCardCommand;
import com.google.protos.youtube.api.innertube.HomeAdsPanelHideCommandOuterClass;
import com.google.protos.youtube.api.innertube.HomeAdsPanelShowCommandOuterClass;
import android.app.PendingIntent;
import android.os.Build$VERSION;
import com.google.android.apps.youtube.app.common.command.androidshareintent.ShareLoggingBroadcastReceiver;
import com.google.protos.youtube.api.innertube.DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint;
import com.google.protos.youtube.api.innertube.HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.GetLocationCommandOuterClass$GetLocationCommand;
import com.google.protos.youtube.api.innertube.OfflineabilityRendererOuterClass;
import com.google.protos.youtube.api.innertube.OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint;
import com.google.protos.youtube.api.innertube.RefreshPanelEndpointOuterClass$RefreshPanelEndpoint;
import com.google.protos.youtube.api.innertube.PivotBarNavigationCommandOuterClass$PivotBarNavigationCommand;
import com.google.protos.youtube.api.innertube.UpdatePlayerErrorMessageCommandOuterClass$UpdatePlayerErrorMessageCommand;
import com.google.protos.youtube.api.innertube.PlayerToastCommandOuterClass;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import android.os.RemoteException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.List;
import android.net.Uri;
import java.util.ArrayList;
import android.os.Bundle;
import java.util.Map;
import com.google.protos.youtube.api.innertube.AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint;
import android.content.Intent;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eyu implements vau
{
    private final /* synthetic */ int a;
    private final Object b;
    
    public eyu(final aagt b, final int a) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public eyu(final abns b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public eyu(final abyn b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public eyu(final aja b, final int a, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
    }
    
    public eyu(final Context b, final int a) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public eyu(final atjj b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public eyu(final avt b, final int a, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
    }
    
    public eyu(final e b, final int a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
    }
    
    public eyu(final ete b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public eyu(final fcr b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public eyu(final fpp b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public eyu(final gtx b, final int a, final byte[] array) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public eyu(final jzg b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public eyu(final ljz b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public eyu(final rgs b, final int a) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public eyu(final uvc b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public eyu(final xlv b, final int a) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    private final void b(Intent chooser, final AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint) {
        final Object b = this.b;
        chooser = Intent.createChooser(chooser, (CharSequence)androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.e);
        ((Context)b).startActivity(chooser);
    }
    
    public final void mE(final aioe aioe, Map oar) {
        final int a = this.a;
        final Object o = null;
        final List list = null;
        final String s = null;
        switch (a) {
            default: {
                if (!((agzd)aioe).rs((agyr)ankr.b)) {
                    return;
                }
                if (this.b == null) {
                    return;
                }
                final ankr ankr = (ankr)((agzd)aioe).rr((agyr)ankr.b);
                final Bundle bundle = new Bundle();
                final ArrayList list2 = new ArrayList();
                final Iterator<Object> iterator = ((List<Object>)ankr.d).iterator();
                while (iterator.hasNext()) {
                    list2.add(Uri.parse((String)iterator.next()));
                }
                final Uri parse = Uri.parse(ankr.c);
                final Object b = this.b;
                oar = new oar(parse, (List)list2, bundle);
                final abyn abyn = (abyn)b;
                if (abyn.b == null || abyn.b.isCancelled()) {
                    abyn.a();
                }
                agjt agjt;
                try {
                    final ListenableFuture b2 = ((abyn)b).b;
                    b2.getClass();
                    agjt = (agjt)afva.u((Future)b2);
                }
                catch (final ExecutionException ex) {
                    zjp.c(zjo.a, zjn.a, "Unable to get cctClientWrapper.", (Throwable)ex);
                    agjt = null;
                }
                if (agjt == null) {
                    return;
                }
                final oap p = agjt.p();
                if (p == null || (oar.a == null && !p.b.l(3))) {
                    return;
                }
                p.c.b(p);
                p.d.b(p);
                final aja a2 = p.a;
                final Uri a3 = oar.a;
                final Bundle c = oar.c;
                final List b3 = oar.b;
                List<Bundle> list3 = list;
                if (b3 != null) {
                    if (b3.isEmpty()) {
                        list3 = list;
                    }
                    else {
                        final ArrayList<Bundle> list4 = new ArrayList<Bundle>();
                        final Iterator iterator2 = b3.iterator();
                        while (true) {
                            list3 = list4;
                            if (!iterator2.hasNext()) {
                                break;
                            }
                            final Parcelable parcelable = (Parcelable)iterator2.next();
                            final Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("android.support.customtabs.otherurls.URL", parcelable);
                            list4.add(bundle2);
                        }
                    }
                }
                final Bundle bundle3 = new Bundle();
                if (c != null) {
                    bundle3.putAll(c);
                }
                try {
                    final Object c2 = a2.c;
                    final Object a4 = a2.a;
                    final Parcel obtain = Parcel.obtain();
                    final Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                        obtain.writeStrongInterface((IInterface)a4);
                        c.e(obtain, (Parcelable)a3);
                        c.e(obtain, (Parcelable)bundle3);
                        obtain.writeTypedList((List)list3);
                        ((aq)c2).a.transact(4, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain2.readInt();
                    }
                    finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                    return;
                }
                catch (final RemoteException ex2) {
                    return;
                }
                break;
            }
            case 19: {
                final aoii aoii = (aoii)((agzd)aioe).rr((agyr)aoii.b);
                final Object b4 = this.b;
                final String c3 = aoii.c;
                aorm aorm;
                if ((aorm = aoii.d) == null) {
                    aorm = aorm.a;
                }
                final long n = aoii.e;
                szc.f();
                final aja aja = (aja)b4;
                if (((Map)aja.a).containsKey(c3)) {
                    return;
                }
                final fzo fzo = (fzo)aja.b;
                final afts afts = (afts)((atjj)fzo.a).a();
                afts.getClass();
                final aceo aceo = (aceo)((atjj)fzo.b).a();
                aceo.getClass();
                aorm.getClass();
                final fje fje = new fje(afts, aceo, aorm, n);
                ((Map<String, fje>)aja.a).put(c3, fje);
                tcp.n((aum)aja.c, (ListenableFuture)(fje.e = fje.a.f((Callable)new csh(fje, 8), fje.d, TimeUnit.MILLISECONDS)), (trb)new fcy(aja, c3, 3, null, null), (trb)new fcy(aja, c3, 4, null, null));
                return;
            }
            case 18: {
                final aich aich = (aich)((agzd)aioe).rr((agyr)aich.b);
                final Object b5 = this.b;
                final String c4 = aich.c;
                szc.f();
                final aja aja2 = (aja)b5;
                if (!((Map)aja2.a).containsKey(c4)) {
                    return;
                }
                final fje fje2 = ((Map<K, fje>)aja2.a).get(c4);
                fje2.getClass();
                final aftq e = fje2.e;
                if (e != null) {
                    e.cancel(false);
                }
                ((Map<Object, Object>)aja2.a).remove(c4);
                return;
            }
            case 17: {
                final anfn anfn = (anfn)((agzd)aioe).rr((agyr)PlayerToastCommandOuterClass.playerToastCommand);
                final Object b6 = this.b;
                ajsq ajsq;
                if ((ajsq = anfn.b) == null) {
                    ajsq = ajsq.a;
                }
                ((fpp)b6).b(new fpo((CharSequence)abyh.b(ajsq), anfn.c));
                return;
            }
            case 16: {
                agot.u(((agzd)aioe).rs((agyr)UpdatePlayerErrorMessageCommandOuterClass$UpdatePlayerErrorMessageCommand.updatePlayerErrorMessageCommand));
                final UpdatePlayerErrorMessageCommandOuterClass$UpdatePlayerErrorMessageCommand updatePlayerErrorMessageCommandOuterClass$UpdatePlayerErrorMessageCommand = (UpdatePlayerErrorMessageCommandOuterClass$UpdatePlayerErrorMessageCommand)((agzd)aioe).rr((agyr)UpdatePlayerErrorMessageCommandOuterClass$UpdatePlayerErrorMessageCommand.updatePlayerErrorMessageCommand);
                final adbl ce = ((abns)this.b).ce();
                final String s2 = ((abns)this.b).o().s();
                akuu akuu;
                if ((akuu = updatePlayerErrorMessageCommandOuterClass$UpdatePlayerErrorMessageCommand.b) == null) {
                    akuu = akuu.a;
                }
                ancs a5;
                if (akuu.b == 58356580) {
                    a5 = (ancs)akuu.c;
                }
                else {
                    a5 = ancs.a;
                }
                ce.f(new abip(3, false, 3, (String)null, (Throwable)null, s2, (String)null, a5));
                return;
            }
            case 15: {
                final PivotBarNavigationCommandOuterClass$PivotBarNavigationCommand pivotBarNavigationCommandOuterClass$PivotBarNavigationCommand = (PivotBarNavigationCommandOuterClass$PivotBarNavigationCommand)((agzd)aioe).rr((agyr)PivotBarNavigationCommandOuterClass$PivotBarNavigationCommand.pivotBarNavigationCommand);
                ((ljz)this.b).r(pivotBarNavigationCommandOuterClass$PivotBarNavigationCommand.b, pivotBarNavigationCommandOuterClass$PivotBarNavigationCommand.c);
                return;
            }
            case 14: {
                String b7;
                if (aexs.f(b7 = ((RefreshPanelEndpointOuterClass$RefreshPanelEndpoint)((agzd)aioe).rr((agyr)RefreshPanelEndpointOuterClass$RefreshPanelEndpoint.refreshPanelEndpoint)).b)) {
                    b7 = (String)tmy.O((Map)oar, (Object)"engagement_panel_id_key", (Class)String.class);
                }
                if (!aexs.f(b7)) {
                    final utd b8 = ((utk)((uvc)this.b).b().aG()).b(b7);
                    if (b8 instanceof utc) {
                        ((utc)b8).u();
                    }
                }
                return;
            }
            case 13: {
                final OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint = (OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint)((agzd)aioe).rr((agyr)OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.offlineVideoWithOfflineabilityEndpoint);
                final amtq a6 = amtq.a;
                amtq amtq;
                if ((amtq = amtq.b(offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.c)) == null) {
                    amtq = amtq.a;
                }
                final int ordinal = amtq.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        amtq amtq2;
                        if ((amtq2 = amtq.b(offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.c)) == null) {
                            amtq2 = amtq.a;
                        }
                        trn.l("Unsupported Offline Video Action: ".concat(String.valueOf(String.valueOf(amtq2))));
                        return;
                    }
                    ((aagt)this.b).c(offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.b, false);
                    return;
                }
                else {
                    anss anss;
                    if ((anss = offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.d) == null) {
                        anss = anss.a;
                    }
                    final amva amva = (amva)aaiy.w(anss, (agyr)OfflineabilityRendererOuterClass.offlineabilityRenderer);
                    if (amva == null) {
                        trn.b("Object is not an offlineable video");
                        return;
                    }
                    ((aagt)this.b).o(offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.b, amva, (aags)null, (wwv)tmy.O((Map)oar, (Object)"com.google.android.libraries.youtube.logging.interaction_logger", (Class)wwv.class), (amqx)null);
                    return;
                }
                break;
            }
            case 12: {
                if (((agzd)aioe).rs((agyr)ajza.b)) {
                    final e e2 = (e)this.b;
                    if (((aqq)e2.b).o()) {
                        final aqq aqq = (aqq)e2.b;
                        final View c5 = aqq.c(8388611);
                        if (c5 != null) {
                            aqq.p(c5);
                            ((aqq)e2.b).i(1);
                            return;
                        }
                        throw new IllegalArgumentException("No drawer view found with gravity ".concat(String.valueOf(aqq.f(8388611))));
                    }
                }
                return;
            }
            case 11: {
                if (((agzd)aioe).rs((agyr)GetLocationCommandOuterClass$GetLocationCommand.getLocationCommand)) {
                    ((fcr)this.b).b((GetLocationCommandOuterClass$GetLocationCommand)((agzd)aioe).rr((agyr)GetLocationCommandOuterClass$GetLocationCommand.getLocationCommand));
                    return;
                }
                throw new vbh();
            }
            case 10: {
                final HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint = (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint)((agzd)aioe).rr((agyr)HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.hideEngagementPanelEndpoint);
                String x = s;
                if (((agzd)aioe).rs((agyr)HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.hideEngagementPanelEndpoint)) {
                    x = vem.x(hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint);
                }
                String s3 = x;
                if (aexs.f(x)) {
                    s3 = (String)tmy.O((Map)oar, (Object)"engagement_panel_id_key", (Class)String.class);
                }
                if (!aexs.f(s3)) {
                    utk a7;
                    if (hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.g) {
                        a7 = (utk)((uvc)this.b).b().aG();
                    }
                    else {
                        final Object b9 = this.b;
                        ajng a8;
                        if (hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c == 4) {
                            a8 = (ajng)hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.d;
                        }
                        else {
                            a8 = ajng.a;
                        }
                        ajnf ajnf;
                        if ((ajnf = ajnf.b(a8.c)) == null) {
                            ajnf = ajnf.a;
                        }
                        a7 = ((uvc)b9).a(ajnf);
                    }
                    if (!a7.x(hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint)) {
                        s3.getClass();
                        a7.l((aext)new eto(s3, 3));
                    }
                }
                return;
            }
            case 9: {
                ((rgs)this.b).e(aioe);
                return;
            }
            case 8: {
                ((abni)((atjj)this.b).a()).j(2);
                return;
            }
            case 7: {
                ((abni)((atjj)this.b).a()).j(0);
                return;
            }
            case 6: {
                ((gtx)this.b).b(((DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint)((agzd)aioe).rr((agyr)DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint.deletePlaylistEndpoint)).b).show();
                return;
            }
            case 5: {
                final xlo g = ((xlv)this.b).g();
                if (g != null && g.a() == 1) {
                    g.z();
                }
                return;
            }
            case 4: {
                final Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                final AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint = (AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint)((agzd)aioe).rr((agyr)AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.androidShareIntentEndpoint);
                for (final aliq aliq : androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.c) {
                    final String e3 = aliq.e;
                    String s4;
                    if (aliq.c == 2) {
                        s4 = (String)aliq.d;
                    }
                    else {
                        s4 = "";
                    }
                    intent.putExtra(e3, s4);
                }
                intent.setType(androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.d);
                if ((androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.b & 0x4) == 0x0) {
                    this.b(intent, androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint);
                    return;
                }
                final Intent putExtra = new Intent((Context)this.b, (Class)ShareLoggingBroadcastReceiver.class).putExtra("YTShare_Logging_Share_Intent_Endpoint_Byte_Array", ((agxl)aioe).toByteArray());
                final Object b10 = this.b;
                int n2;
                if (Build$VERSION.SDK_INT >= 31) {
                    n2 = 33554432;
                }
                else {
                    n2 = 0;
                }
                final int n3 = n2 | 0x8000000;
                final PendingIntent broadcast = PendingIntent.getBroadcast((Context)b10, 0, qjs.a(putExtra, n3, 1), n3);
                if (broadcast == null) {
                    this.b(intent, androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint);
                    return;
                }
                ((Context)this.b).startActivity(Intent.createChooser(intent, (CharSequence)androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.e, broadcast.getIntentSender()));
                return;
            }
            case 3: {
                if (this.b != null) {
                    if (((agzd)aioe).rs((agyr)HomeAdsPanelShowCommandOuterClass.homeAdsPanelShowCommand)) {
                        final ajzr ajzr = (ajzr)((agzd)aioe).rr((agyr)HomeAdsPanelShowCommandOuterClass.homeAdsPanelShowCommand);
                        if ((ajzr.b & 0x1) != 0x0) {
                            final Object b11 = this.b;
                            final String c6 = ajzr.c;
                            final jzg jzg = (jzg)b11;
                            if (jzg.a.containsKey(c6)) {
                                final ajzq ajzq = jzg.a.get(c6);
                                jzg.c.push(ajzq);
                                if (jzg.c.size() == 1) {
                                    jzg.d.a();
                                    final jjg c7 = jzg.c();
                                    ((jzf)c7.b).r(((bu)c7.a).getSupportFragmentManager(), (String)null);
                                }
                                jzg.c().c(ajzq);
                            }
                        }
                    }
                }
                return;
            }
            case 2: {
                if (this.b != null) {
                    if (((agzd)aioe).rs((agyr)HomeAdsPanelHideCommandOuterClass.homeAdsPanelHideCommand)) {
                        final ajzp ajzp = (ajzp)((agzd)aioe).rr((agyr)HomeAdsPanelHideCommandOuterClass.homeAdsPanelHideCommand);
                        if ((ajzp.b & 0x1) != 0x0) {
                            final Object b12 = this.b;
                            final String c8 = ajzp.c;
                            final jzg jzg2 = (jzg)b12;
                            final ajzq ajzq2 = jzg2.c.peek();
                            if (ajzq2 != null && ajzq2.c.equals(c8)) {
                                jzg2.c.pop();
                                if (jzg2.c.isEmpty()) {
                                    ((jzf)jzg2.c().b).dismiss();
                                    return;
                                }
                                jzg2.c().c((ajzq)jzg2.c.peek());
                            }
                        }
                    }
                }
                return;
            }
            case 1: {
                final ProfileCardCommandOuterClass$ProfileCardCommand profileCardCommandOuterClass$ProfileCardCommand = (ProfileCardCommandOuterClass$ProfileCardCommand)((agzd)aioe).rr((agyr)ProfileCardCommandOuterClass$ProfileCardCommand.profileCardCommand);
                ((ete)this.b).h(profileCardCommandOuterClass$ProfileCardCommand.b, profileCardCommandOuterClass$ProfileCardCommand.c, profileCardCommandOuterClass$ProfileCardCommand.e, profileCardCommandOuterClass$ProfileCardCommand.d, aioe);
                return;
            }
            case 0: {
                final ChannelPageContinuationCommandOuterClass$ChannelPageContinuationCommand channelPageContinuationCommandOuterClass$ChannelPageContinuationCommand = (ChannelPageContinuationCommandOuterClass$ChannelPageContinuationCommand)((agzd)aioe).rr((agyr)ChannelPageContinuationCommandOuterClass$ChannelPageContinuationCommand.channelPageContinuationCommand);
                if ((channelPageContinuationCommandOuterClass$ChannelPageContinuationCommand.b & 0x1) == 0x0) {
                    zjp.b(zjo.b, zjn.I, "[ChannelPageContinuationCommand] target_id missing.");
                    throw new UnsupportedOperationException("[ChannelPageContinuationCommand] target_id missing.");
                }
                final acnw acnw = ((Map<K, acnw>)((avt)this.b).a).get(channelPageContinuationCommandOuterClass$ChannelPageContinuationCommand.c);
                if (acnw == null) {
                    zjp.b(zjo.b, zjn.I, "[ChannelPageContinuationCommand] No matching ItemSectionController found for target_id.");
                    throw new IllegalArgumentException("[ChannelPageContinuationCommand] No matching ItemSectionController found for target_id.");
                }
                if (!channelPageContinuationCommandOuterClass$ChannelPageContinuationCommand.f) {
                    ((acmv)acnw).N(false);
                }
                if ((channelPageContinuationCommandOuterClass$ChannelPageContinuationCommand.b & 0x4) != 0x0) {
                    aigp aigp;
                    if ((aigp = channelPageContinuationCommandOuterClass$ChannelPageContinuationCommand.e) == null) {
                        aigp = aigp.a;
                    }
                    alib alib;
                    if ((alib = aigp.b) == null) {
                        alib = alib.a;
                    }
                    acnw.j(new ver(alib));
                }
                Object o2 = o;
                if ((channelPageContinuationCommandOuterClass$ChannelPageContinuationCommand.b & 0x2) != 0x0) {
                    aigo aigo;
                    if ((aigo = channelPageContinuationCommandOuterClass$ChannelPageContinuationCommand.d) == null) {
                        aigo = aigo.a;
                    }
                    o2 = o;
                    if ((aigo.b & 0x2) != 0x0 && (o2 = aigo.c) == null) {
                        o2 = ansi.a;
                    }
                }
                if (o2 != null) {
                    ((acms)acnw).mD(aaiy.y(o2));
                    return;
                }
                zjp.b(zjo.b, zjn.I, "[ChannelPageContinuationCommand] Missing reload continuation.");
                throw new UnsupportedOperationException("[ChannelPageContinuationCommand] Missing reload continuation.");
            }
        }
    }
}
