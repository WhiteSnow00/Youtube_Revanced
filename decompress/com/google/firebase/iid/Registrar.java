// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.iid;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

public final class Registrar implements aghd
{
    public List getComponents() {
        final aggz a = agha.a((Class)FirebaseInstanceId.class);
        a.b(aghi.c((Class)agfz.class));
        a.b(aghi.b((Class)aglo.class));
        a.b(aghi.b((Class)agit.class));
        a.b(aghi.c((Class)agjj.class));
        a.c((aghc)aghv.d);
        a.e();
        final agha a2 = a.a();
        final aggz a3 = agha.a((Class)agjf.class);
        a3.b(aghi.c((Class)FirebaseInstanceId.class));
        a3.c((aghc)aghv.e);
        return Arrays.asList(a2, a3.a(), agnj.l("fire-iid", "21.1.1"));
    }
}
