// 
// Decompiled by Procyon v0.6.0
// 

package io.grpc.binder;

public class LifecycleOnDestroyHelper$2 implements auk
{
    final /* synthetic */ arvd a;
    
    public LifecycleOnDestroyHelper$2(final arvd a) {
        this.a = a;
    }
    
    @Override
    public final void a(final aum aum, final auf auf) {
        if (auf == auf.ON_DESTROY) {
            aum.getLifecycle().c((aul)this);
            this.a.a();
        }
    }
}
