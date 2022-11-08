// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.blocks;

import com.google.android.libraries.blocks.runtime.ClientCreatorProxy;
import java.util.function.Function;
import com.google.android.libraries.blocks.runtime.NativeBindingRouter;
import com.google.android.libraries.blocks.runtime.ContainerInstanceProxy;

public class Container
{
    private final ContainerInstanceProxy a;
    
    public Container(final ContainerInstanceProxy a) {
        this.a = a;
    }
    
    public static Container a(final int n) {
        return new Container(new ContainerInstanceProxy(NativeBindingRouter.a.a(n, apxu.a)));
    }
    
    private static Container fromNativeContainerInstance(final long n) {
        return new Container(new ContainerInstanceProxy(n));
    }
    
    private long getNativeContainerInstance() {
        return this.a.b;
    }
    
    public final oak b(final oaj oaj, final Function function) {
        return (oak)oaj.b(((ClientCreatorProxy)this.a).a(oaj.a(), oaj.d(function.apply(new nmo(new ClientCreatorProxy(((ClientCreatorProxy)this.a).b(oaj.a())))))));
    }
    
    public final oak c(final oai oai) {
        final ContainerInstanceProxy a = this.a;
        return (oak)oai.b(((ClientCreatorProxy)a).nativeCreateBlock(((ClientCreatorProxy)a).a, oai.a()));
    }
}
