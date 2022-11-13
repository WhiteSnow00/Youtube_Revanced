// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.messaging;

import java.util.Arrays;
import java.util.List;

public class FirebaseMessagingRegistrar implements agje
{
    public static FirebaseMessaging lambda$getComponents$0(final agjc agjc) {
        return new FirebaseMessaging((agia)agjc.a((Class)agia.class), (aglg)agjc.a((Class)aglg.class), agjc.c((Class)agnp.class), agjc.c((Class)agku.class), (aglk)agjc.a((Class)aglk.class), (lrp)agjc.a((Class)lrp.class), (agkp)agjc.a((Class)agkp.class));
    }
    
    public List getComponents() {
        final agja a = agjb.a((Class)FirebaseMessaging.class);
        a.b(agjk.c((Class)agia.class));
        a.b(agjk.a((Class)aglg.class));
        a.b(agjk.b((Class)agnp.class));
        a.b(agjk.b((Class)agku.class));
        a.b(agjk.a((Class)lrp.class));
        a.b(agjk.c((Class)aglk.class));
        a.b(agjk.c((Class)agkp.class));
        a.c((agjd)agjw.g);
        a.e();
        return Arrays.asList(a.a(), agpc.l("fire-fcm", "23.0.6_1p"));
    }
}
