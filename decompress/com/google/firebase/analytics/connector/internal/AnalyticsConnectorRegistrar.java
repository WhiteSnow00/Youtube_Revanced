// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.analytics.connector.internal;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import android.os.Bundle;
import android.content.Context;

public class AnalyticsConnectorRegistrar implements agje
{
    public static agig lambda$getComponents$0(final agjc agjc) {
        final agia agia = (agia)agjc.a((Class)agia.class);
        final Context context = (Context)agjc.a((Class)Context.class);
        final agkp agkp = (agkp)agjc.a((Class)agkp.class);
        khl.aP(agia);
        khl.aP(context);
        khl.aP(agkp);
        khl.aP(context.getApplicationContext());
        if (agii.a == null) {
            synchronized (agii.class) {
                if (agii.a == null) {
                    final Bundle bundle = new Bundle(1);
                    if (agia.k()) {
                        agkp.c((Class)aghv.class, (Executor)rr.f, (agkn)agih.a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", agia.j());
                    }
                    agii.a = (agig)new agii(neg.d(context, bundle).f, null, null);
                }
            }
        }
        return agii.a;
    }
    
    public List getComponents() {
        final agja a = agjb.a((Class)agig.class);
        a.b(agjk.c((Class)agia.class));
        a.b(agjk.c((Class)Context.class));
        a.b(agjk.c((Class)agkp.class));
        a.c((agjd)agjw.b);
        a.d(2);
        return Arrays.asList(a.a(), agpc.l("fire-analytics", "21.2.1"));
    }
}
