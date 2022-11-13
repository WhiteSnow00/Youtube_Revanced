// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.iid;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

public final class Registrar implements agje
{
    public static FirebaseInstanceId lambda$getComponents$0(final agjc agjc) {
        final agia agia = (agia)agjc.a((Class)agia.class);
        return new FirebaseInstanceId(agia, new agla(agia.a()), agkw.a(), agkw.a(), agjc.c((Class)agnp.class), agjc.c((Class)agku.class), (aglk)agjc.a((Class)aglk.class));
    }
    
    public static aglg lambda$getComponents$1(final agjc agjc) {
        return (aglg)new aglb((FirebaseInstanceId)agjc.a((Class)FirebaseInstanceId.class));
    }
    
    public List getComponents() {
        final agja a = agjb.a((Class)FirebaseInstanceId.class);
        a.b(agjk.c((Class)agia.class));
        a.b(agjk.b((Class)agnp.class));
        a.b(agjk.b((Class)agku.class));
        a.b(agjk.c((Class)aglk.class));
        a.c((agjd)agjw.d);
        a.e();
        final agjb a2 = a.a();
        final agja a3 = agjb.a((Class)aglg.class);
        a3.b(agjk.c((Class)FirebaseInstanceId.class));
        a3.c((agjd)agjw.e);
        return Arrays.asList(a2, a3.a(), agpc.l("fire-iid", "21.1.1"));
    }
}
