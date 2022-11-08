// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service;

import com.google.protos.youtube.api.innertube.ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint;
import java.util.List;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.AutoValue_SubscriptionNotificationMenuItem;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.ArrayList;
import java.util.Iterator;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.c;

public final class a implements c
{
    public final vax a;
    public aokt b;
    public b c;
    private final thh d;
    private final zki e;
    private final vrk f;
    private boolean g;
    
    public a(final vax a, final thh d, final zki e, final vrk f) {
        this.b = aokt.a;
        this.c = com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b.S;
        this.a = a;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static SubscriptionNotificationButtonData a(final aoku aoku) {
        aokv aokv;
        if ((aokv = aoku.e) == null) {
            aokv = aokv.a;
        }
        aibb a;
        if (aokv.b == 65153809) {
            a = (aibb)aokv.c;
        }
        else {
            a = aibb.a;
        }
        final qdp e = SubscriptionNotificationButtonData.e();
        e.f(aoku.c);
        akbf akbf;
        if ((akbf = a.g) == null) {
            akbf = akbf.a;
        }
        akbe akbe;
        if ((akbe = akbe.b(akbf.c)) == null) {
            akbe = akbe.a;
        }
        e.e(f(akbe));
        ahgm ahgm;
        if ((ahgm = a.s) == null) {
            ahgm = ahgm.a;
        }
        e.d = ahgm.c;
        e.g(a.w);
        return e.d();
    }
    
    private static int f(final akbe akbe) {
        final akbe a = akbe.a;
        final int ordinal = akbe.ordinal();
        if (ordinal == 262) {
            return 1;
        }
        if (ordinal == 268) {
            return 2;
        }
        if (ordinal != 269) {
            return 0;
        }
        return 3;
    }
    
    public final aoku b(final int n) {
        for (final aoku aoku : this.b.c) {
            if (aoku.c == n) {
                return aoku;
            }
        }
        zjp.b(zjo.b, zjn.d, "SubscriptionNotificationToggleState not found for given id.");
        return aoku.a;
    }
    
    public final void c() {
        szc.f();
        this.c.z(SubscriptionNotificationButtonData.a);
        this.b = aokt.a;
    }
    
    public final void d(final aokt b) {
        szc.f();
        b.getClass();
        this.b = b;
        if ((b.b & 0x1) != 0x0 && b.c.size() != 0) {
            this.c.z(a(this.b(b.d)));
            final b c = this.c;
            final ArrayList list = new ArrayList();
            for (final aoku aoku : this.b.c) {
                if ((aoku.b & 0x20) != 0x0) {
                    anss anss;
                    if ((anss = aoku.f) == null) {
                        anss = anss.a;
                    }
                    final aibb aibb = (aibb)((agzd)anss).rr((agyr)ButtonRendererOuterClass.buttonRenderer);
                    ajsq ajsq;
                    if ((ajsq = aibb.i) == null) {
                        ajsq = ajsq.a;
                    }
                    final String string = abyh.b(ajsq).toString();
                    final com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.a g = SubscriptionNotificationMenuItem.g();
                    g.d(aoku.c);
                    g.c(aibb.h);
                    akbf akbf;
                    if ((akbf = aibb.g) == null) {
                        akbf = akbf.a;
                    }
                    akbe akbe;
                    if ((akbe = akbe.b(akbf.c)) == null) {
                        akbe = akbe.a;
                    }
                    g.b(f(akbe));
                    g.a = string;
                    g.b = string;
                    g.e(aibb.w);
                    final SubscriptionNotificationMenuItem a = g.a();
                    if (((AutoValue_SubscriptionNotificationMenuItem)a).a) {
                        continue;
                    }
                    list.add(a);
                }
            }
            c.A(new SubscriptionNotificationMenuData((List)list));
            return;
        }
        this.c();
    }
    
    public final void i(final SubscriptionNotificationMenuItem subscriptionNotificationMenuItem) {
        szc.f();
        if (this.g) {
            return;
        }
        if (!this.e.t()) {
            zjp.b(zjo.b, zjn.d, "Subscription notification button click but no user signed in.");
            return;
        }
        final aoku b = this.b(subscriptionNotificationMenuItem.b());
        anss anss;
        if ((anss = b.f) == null) {
            anss = anss.a;
        }
        aioe aioe;
        if ((aioe = ((aibb)((agzd)anss).rr((agyr)ButtonRendererOuterClass.buttonRenderer)).n) == null) {
            aioe = aioe.a;
        }
        final vrg a = this.f.a();
        a.a = ((ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint)((agzd)aioe).rr((agyr)ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.modifyChannelNotificationPreferenceEndpoint)).b;
        ((vii)a).k(aioe.c.I());
        this.g = true;
        if (this.d.p()) {
            this.c.z(a(b));
        }
        this.f.b(a, (znj)new fcd(this, 14));
    }
}
