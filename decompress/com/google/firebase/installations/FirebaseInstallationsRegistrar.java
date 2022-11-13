// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.installations;

import java.util.Arrays;
import java.util.List;

public class FirebaseInstallationsRegistrar implements agje
{
    public static aglk lambda$getComponents$0(final agjc agjc) {
        return (aglk)new aglj((agia)agjc.a((Class)agia.class), agjc.c((Class)agkt.class));
    }
    
    public List getComponents() {
        final agja a = agjb.a((Class)aglk.class);
        a.b(agjk.c((Class)agia.class));
        a.b(agjk.b((Class)agkt.class));
        a.c((agjd)agjw.f);
        return Arrays.asList(a.a(), agjb.d((Object)new agks(), (Class)agkr.class), agpc.l("fire-installations", "17.0.2_1p"));
    }
}
