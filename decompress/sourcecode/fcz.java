import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import android.view.View;
import android.content.Intent;
import java.util.HashMap;
import com.google.protos.youtube.api.innertube.AdsWebsiteDeepLinkCommandOuterClass;
import java.util.function.Consumer;
import j$.util.Optional;
import com.google.protos.youtube.api.innertube.GetFlowCommandOuterClass$GetFlowCommand;
import com.google.protobuf.MessageLite;
import com.google.protos.youtube.api.innertube.EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint;
import java.util.ArrayList;
import com.google.protos.youtube.api.innertube.SubmitSurveyCommandOuterClass$SubmitSurveyCommand;
import java.util.List;
import java.util.Arrays;
import com.google.protos.youtube.api.innertube.DismissalEndpointOuterClass$DismissalEndpoint;
import com.google.protos.youtube.api.innertube.ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand;
import java.util.Map;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import com.google.android.apps.youtube.app.common.endpoint.LoggingUrlsPingController;
import android.app.Activity;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fcz implements vau
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    private final /* synthetic */ int h;
    
    public fcz(final aeim d, final vup c, final zki f, final vax a, final Executor b, final vbq e, final int h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.h = h;
        this.d = d;
        this.c = c;
        this.f = f;
        this.a = a;
        this.b = b;
        this.e = e;
    }
    
    public fcz(final Activity a, final lzi e, final zki c, final Executor f, final Executor d, final atjj b, final int h, final byte[] array, final byte[] array2, final byte[] array3) {
        this.h = h;
        this.a = a;
        this.e = e;
        this.c = c;
        this.f = f;
        this.d = d;
        this.b = b;
    }
    
    public fcz(final Activity a, final vwb f, final fax e, final LoggingUrlsPingController c, final abyo b, final wwu d, final int h, final byte[] array, final byte[] array2) {
        this.h = h;
        this.a = a;
        this.f = f;
        this.e = e;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public fcz(final aum a, final atjj b, final vax c, final Executor d, final e e, final wwv f, final int h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public fcz(final vbq f, final oas a, final van van, final eg eg, final atjj d, final atjj b, final int h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.h = h;
        this.f = f;
        this.a = a;
        this.c = van.i((vfe)new gpb(0));
        this.e = eg.af();
        this.d = d;
        this.b = b;
    }
    
    public fcz(final vmt f, final tny e, final vax c, final acha b, final Context a, final zoj d, final int h) {
        this.h = h;
        f.getClass();
        this.f = f;
        e.getClass();
        this.e = e;
        c.getClass();
        this.c = c;
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
        d.getClass();
        this.d = d;
    }
    
    public fcz(final zki d, final vup f, final tny e, final vax c, final Executor b, final bu a, final int h, final byte[] array, final byte[] array2) {
        this.h = h;
        this.d = d;
        this.f = f;
        e.getClass();
        this.e = e;
        c.getClass();
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public static final ajkj b(final amwi amwi) {
        amwm a;
        if (amwi.c == 1) {
            a = (amwm)amwi.d;
        }
        else {
            a = amwm.a;
        }
        ajkj a2;
        if (a.b == 153515154) {
            a2 = (ajkj)a.c;
        }
        else {
            a2 = ajkj.a;
        }
        return a2;
    }
    
    public static boolean c(final akkz akkz) {
        return akkz.c.size() > 0;
    }
    
    private final void d(final aioe aioe, final Activity activity, final ahpb ahpb, final boolean c) {
        final int b = aioe.b;
        final boolean b2 = true;
        if ((b & 0x1) == 0x0) {
            return;
        }
        ahpc ahpc;
        if ((ahpc = ahpb.d) == null) {
            ahpc = ahpc.a;
        }
        Label_0399: {
            if (!ahpc.e) {
                ahpc ahpc2;
                if ((ahpc2 = ahpb.d) == null) {
                    ahpc2 = ahpc.a;
                }
                if (!ahpc2.d) {
                    final alff alff = null;
                    break Label_0399;
                }
            }
            final agza builder = ((agzi)aleo.a).createBuilder();
            ahpc ahpc3;
            if ((ahpc3 = ahpb.d) == null) {
                ahpc3 = ahpc.a;
            }
            if (ahpc3.e) {
                builder.copyOnWrite();
                final aleo aleo = (aleo)builder.instance;
                aleo.b |= 0x1;
                aleo.c = c;
            }
            final ahpc d = ahpb.d;
            ahpc a;
            if (d == null) {
                a = ahpc.a;
            }
            else {
                a = d;
            }
            Label_0288: {
                if (!a.d) {
                    break Label_0288;
                }
                ahpc a2;
                if ((a2 = d) == null) {
                    a2 = ahpc.a;
                }
                if ((a2.b & 0x1) == 0x0) {
                    break Label_0288;
                }
                final PackageManager packageManager = activity.getPackageManager();
                while (true) {
                    try {
                        ahpc ahpc4;
                        if ((ahpc4 = ahpb.d) == null) {
                            ahpc4 = ahpc.a;
                        }
                        final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(ahpc4.c, 0);
                        boolean d2;
                        if (applicationInfo != null && applicationInfo.enabled) {
                            d2 = b2;
                        }
                        else {
                            d2 = false;
                        }
                        builder.copyOnWrite();
                        final aleo aleo2 = (aleo)builder.instance;
                        aleo2.b |= 0x2;
                        aleo2.d = d2;
                        final agza builder2 = ((agzi)alff.a).createBuilder();
                        final agza builder3 = ((agzi)alek.a).createBuilder();
                        builder3.copyOnWrite();
                        final alek alek = (alek)builder3.instance;
                        final aleo d3 = (aleo)builder.build();
                        d3.getClass();
                        alek.d = d3;
                        alek.c = 7;
                        builder2.copyOnWrite();
                        final alff alff2 = (alff)builder2.instance;
                        final alek v = (alek)builder3.build();
                        v.getClass();
                        alff2.v = v;
                        alff2.c |= 0x400;
                        final alff alff = (alff)builder2.build();
                        ((wwu)this.d).n().J(3, (wxz)new wws(aioe.c), alff);
                    }
                    catch (final PackageManager$NameNotFoundException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public final void mE(aioe aioe, final Map map) {
        final int h = this.h;
        final aczi aczi = null;
        if (h == 0) {
            if (((agzd)aioe).rs((agyr)ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand.showMoreDrawerCommand)) {
                amwi amwi;
                if ((amwi = ((ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand)((agzd)aioe).rr((agyr)ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand.showMoreDrawerCommand)).b) == null) {
                    amwi = amwi.a;
                }
                int e;
                if ((amwi.b & 0x1) != 0x0) {
                    e = amwi.e;
                }
                else {
                    e = 160598;
                }
                ((wwv)this.f).b(wya.b(e), aioe, (alff)null);
                final int b = amwi.b;
                final ajkj b2 = b(amwi);
                final e e2 = (e)this.e;
                if (!((aqq)e2.b).o()) {
                    final aqq aqq = (aqq)e2.b;
                    final View c = aqq.c(8388611);
                    if (c == null) {
                        throw new IllegalArgumentException("No drawer view found with gravity ".concat(String.valueOf(aqq.f(8388611))));
                    }
                    aqq.s(c);
                    ((aqq)e2.b).i(0);
                }
                e2.c(b2);
                if ((b & 0x8) != 0x0) {
                    final vrr vrr = (vrr)((atjj)this.b).a();
                    amwk amwk;
                    if ((amwk = amwi.f) == null) {
                        amwk = amwk.a;
                    }
                    final vrq e3 = vrr.e(amwk);
                    byte[] array;
                    if (aioe != null && (0x1 & aioe.b) != 0x0) {
                        array = aioe.c.I();
                    }
                    else {
                        array = uyp.b;
                    }
                    ((vii)e3).k(array);
                    tcp.n((aum)this.a, vrr.f(e3, (Executor)this.d), (trb)etd.f, (trb)new fcy(this, amwi, 0));
                }
            }
            return;
        }
        if (h == 1) {
            final Object f = this.f;
            final zkh c2 = ((zki)this.d).c();
            final vup vup = (vup)f;
            final addp c3 = ((vnv)agnj.J((Context)vup.a, (Class)vnv.class, ((zjy)vup.b).a(c2))).C();
            final vnu vnu = new vnu(c3.c, ((eg)c3.e).aq(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            final DismissalEndpointOuterClass$DismissalEndpoint dismissalEndpointOuterClass$DismissalEndpoint = (DismissalEndpointOuterClass$DismissalEndpoint)((agzd)aioe).rr((agyr)DismissalEndpointOuterClass$DismissalEndpoint.dismissalEndpoint);
            vnu.a = Arrays.asList(dismissalEndpointOuterClass$DismissalEndpoint.b);
            ((vii)vnu).j(aioe.c);
            tcp.n((aum)this.a, ((vkh)c3.d).b((vjn)vnu, (Executor)this.b), (trb)new exr(this, 10, null), (trb)new etd(5));
            if (dismissalEndpointOuterClass$DismissalEndpoint.c.size() != 0) {
                ((vax)this.c).d((List)dismissalEndpointOuterClass$DismissalEndpoint.c, map);
            }
            return;
        }
        if (h == 2) {
            ashp.I((Object)aioe).J((asjc)exl.k).E((asjc)new fdc(this, 2, null)).J((asjc)exl.l).aa((asix)new fcs(this, 3, null), (asix)ezm.j);
            return;
        }
        if (h != 3) {
            if (h == 4) {
                if (((agzd)aioe).rs((agyr)SubmitSurveyCommandOuterClass$SubmitSurveyCommand.submitSurveyCommand)) {
                    final SubmitSurveyCommandOuterClass$SubmitSurveyCommand submitSurveyCommandOuterClass$SubmitSurveyCommand = (SubmitSurveyCommandOuterClass$SubmitSurveyCommand)((agzd)aioe).rr((agyr)SubmitSurveyCommandOuterClass$SubmitSurveyCommand.submitSurveyCommand);
                    final boolean b3 = submitSurveyCommandOuterClass$SubmitSurveyCommand.f ^ true;
                    if (b3) {
                        ((sjy)((atjj)this.d).a()).s();
                    }
                    ((vbq)this.f).b().f(submitSurveyCommandOuterClass$SubmitSurveyCommand.c).j((Class)akcc.class).s((asix)new fdo(this, submitSurveyCommandOuterClass$SubmitSurveyCommand, 4, null)).q((asix)gpa.d).p((asir)gep.f).ab();
                    if (b3) {
                        final ruo ruo = (ruo)((atjj)this.b).a();
                        final Object b4 = ruo.b;
                        if (b4 == null) {
                            final Object a = ruo.a;
                            qcv.A((sfh)null, "Tried to submit survey with no registered listener");
                            return;
                        }
                        final ArrayList list = new ArrayList();
                        final rxa rxa = (rxa)b4;
                        for (final sfy sfy : rxa.b.r()) {
                            final sga b5 = sfy.b;
                            if (b5 instanceof sft && ((rvv)rxa.a.a()).j().contains(((sft)b5).a)) {
                                list.add(sfy);
                            }
                        }
                        rxa.b((List)list);
                    }
                }
                return;
            }
            if (h != 5) {
                Object o = tmy.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag");
                aczi aczi2 = aczi;
                if (o instanceof aczi) {
                    aczi2 = (aczi)o;
                }
                if (aczi2 != null) {
                    if ((o = aczi2.a()) == null) {
                        o = aczi2;
                    }
                    aczi2.b();
                }
                final EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint = (EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint)((agzd)aioe).rr((agyr)EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.editConnectionStateEndpoint);
                ((vax)this.c).e((List)editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.c, (Object)new aczh(true, o));
                final aczh aczh = new aczh(false, o);
                final Object f2 = this.f;
                final String b6 = editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.b;
                final boolean d = ((zoj)this.d).d((Context)this.a);
                final aczg aczg = new aczg(this, aczh, aczi2, 0, null);
                final vmt vmt = (vmt)f2;
                ((vkm)f2).c((MessageLite)akir.a, vmt.f, (tad)vmq.e, (tac)vlh.q).e((vjn)new vmu(vmt.c, vmt.d.c(), b6, Boolean.valueOf(d), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (znj)aczg);
                return;
            }
            final GetFlowCommandOuterClass$GetFlowCommand getFlowCommandOuterClass$GetFlowCommand = (GetFlowCommandOuterClass$GetFlowCommand)((agzd)aioe).rr((agyr)GetFlowCommandOuterClass$GetFlowCommand.getFlowCommand);
            final int b7 = getFlowCommandOuterClass$GetFlowCommand.b;
            if ((b7 & 0x1) != 0x0 && (b7 & 0x2) != 0x0) {
                final List k = ((aeim)this.d).K(getFlowCommandOuterClass$GetFlowCommand.d);
                if (k != null) {
                    for (final acds acds : k) {
                        final Object c4 = this.c;
                        final zkh c5 = ((zki)this.f).c();
                        final vup vup2 = (vup)c4;
                        final vou i = ((vom)agnj.J((Context)vup2.b, (Class)vom.class, ((zjy)vup2.a).a(c5))).i();
                        final String c6 = getFlowCommandOuterClass$GetFlowCommand.c;
                        final String d2 = getFlowCommandOuterClass$GetFlowCommand.d;
                        Optional optional;
                        if ((getFlowCommandOuterClass$GetFlowCommand.b & 0x4) != 0x0) {
                            optional = Optional.of((Object)getFlowCommandOuterClass$GetFlowCommand.e);
                        }
                        else {
                            optional = Optional.empty();
                        }
                        Optional optional2;
                        if ((getFlowCommandOuterClass$GetFlowCommand.b & 0x8) != 0x0) {
                            ajrs ajrs;
                            if ((ajrs = ajrs.b(getFlowCommandOuterClass$GetFlowCommand.f)) == null) {
                                ajrs = ajrs.a;
                            }
                            optional2 = Optional.of((Object)ajrs);
                        }
                        else {
                            optional2 = Optional.empty();
                        }
                        final vol vol = new vol(i.c, ((eg)i.f).aq(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                        ((vii)vol).l = i.d;
                        vol.a = vol.g(c6);
                        vol.b = d2;
                        vol.d = vol.g(acds.f);
                        optional.ifPresent((Consumer)new abtb(vol, 6));
                        optional2.ifPresent((Consumer)new igu(this, acds, vol, 10, (byte[])null));
                        ((vii)vol).i();
                        Optional optional3;
                        if ((getFlowCommandOuterClass$GetFlowCommand.b & 0x10) != 0x0) {
                            if ((aioe = getFlowCommandOuterClass$GetFlowCommand.g) == null) {
                                aioe = aioe.a;
                            }
                            optional3 = Optional.of((Object)aioe);
                        }
                        else {
                            optional3 = Optional.empty();
                        }
                        final ListenableFuture b8 = ((vkh)i.e).b((vjn)vol, (Executor)this.b);
                        tcp.i(b8, (tco)new zmd(this, 8, (byte[])null));
                        tcp.m(b8, (tcn)new wka(this, optional3, 20, (byte[])null));
                    }
                }
            }
        }
        else {
            final Object f3 = this.f;
            if (f3 != null) {
                ((vwb)f3).p(tmy.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag"), ahpu.d);
            }
            final ahpb ahpb = (ahpb)((agzd)aioe).rr((agyr)AdsWebsiteDeepLinkCommandOuterClass.adsWebsiteDeepLinkCommand);
            if (this.e != null) {
                final HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", tmy.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag"));
                final Object e4 = this.e;
                final aijk b9 = aijk.b;
                aioe aioe2;
                if ((aioe2 = ahpb.c) == null) {
                    aioe2 = aioe.a;
                }
                ((fax)e4).a(b9, Arrays.asList(aioe2), hashMap);
            }
            final Uri j = ((LoggingUrlsPingController)this.c).j(ahpb.b, map);
            final Object b10 = this.b;
            if (b10 != null && ((abyo)b10).j((Activity)this.a, j)) {
                this.d(aioe, (Activity)this.a, ahpb, true);
                return;
            }
            this.d(aioe, (Activity)this.a, ahpb, false);
            final Intent intent = new Intent("android.intent.action.VIEW", j);
            if (!((Activity)this.a).getPackageManager().queryIntentActivities(intent, 128).isEmpty()) {
                abyh.q((Context)this.a, intent);
                tab.c((Context)this.a, intent, j);
                ((Activity)this.a).startActivity(intent.setFlags(268435456));
                return;
            }
            tmy.x((Context)this.a, 2132017997, 0);
        }
    }
}
