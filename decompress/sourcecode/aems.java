import com.google.apps.tiktok.tracing.contrib.androidx.TracedDefaultLifecycleObserver;
import com.google.apps.tiktok.dataservice.local.ViewLifecycleLocalSubscriptionMixinImpl$1;
import com.google.apps.tiktok.dataservice.local.LocalSubscriptionMixinResultPropagator;
import com.google.apps.tiktok.dataservice.local.LocalSubscriptionMixinImpl;
import com.google.apps.tiktok.lifecycle.LifecycleMemoizingObserver;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aems extends aely
{
    public aely a;
    private final br b;
    private final aelv c;
    private final Executor d;
    
    public aems(final br b, final aelv c, final Executor d) {
        this.a = null;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final ahbz g(final xpb xpb, final aelx aelx) {
        qcj.s();
        final br b = this.b;
        try {
            final aug b2 = ((aun)b.mK().getLifecycle()).b;
            final aug b3 = aug.b;
            final boolean b4 = true;
            agot.E(b2 == b3, (Object)"A @ViewLifecycle LocalSubscriptionMixin may only register callbacks in `onCreateView()`. Please refer to the `@ViewLifecycle` annotation's Javadoc for a full description of how to use this LocalSubscriptionMixin correctly.");
            if (this.a == null) {
                try {
                    final aum mk = this.b.mK();
                    final LifecycleMemoizingObserver lifecycleMemoizingObserver = (LifecycleMemoizingObserver)new alm(((avu)this.b).getViewModelStore(), (avq)new aeoh()).h((Class)LifecycleMemoizingObserver.class);
                    final auh lifecycle = mk.getLifecycle();
                    agot.E(lifecycleMemoizingObserver.a == null && b4, (Object)"LifecycleMemoizingObserver is already observing a lifecycle.");
                    (lifecycleMemoizingObserver.a = lifecycle).b((aul)lifecycleMemoizingObserver);
                    final adcr adcr = new adcr(lifecycleMemoizingObserver);
                    this.a = new aemf(new LocalSubscriptionMixinResultPropagator(new LocalSubscriptionMixinImpl(this.b.mK().getLifecycle(), adcr, this.d, null, null, null, null), adcr, this.c, this.d, this.b.mK().getLifecycle(), null, null, null, null));
                    this.b.mK().getLifecycle().b((aul)TracedDefaultLifecycleObserver.g((atz)new ViewLifecycleLocalSubscriptionMixinImpl$1(this)));
                }
                catch (final IllegalStateException ex) {
                    throw new IllegalStateException("Both an unqualified and a `@ViewLifecycle LocalSubscriptionMixin` have been injectedin this Fragment scope. Only one of the two LocalSubscriptionMixins may be used in a given Fragment - either the unqualified or `@ViewLifecycle`LocalSubscriptionMixin exclusively.", ex);
                }
            }
            return this.a.g(xpb, aelx);
        }
        catch (final IllegalStateException ex2) {
            throw new IllegalStateException("A @ViewLifecycle LocalSubscriptionMixin may only register callbacks in `onCreateView()`. Please refer to the `@ViewLifecycle` annotation's Javadoc for a full description of how to use this LocalSubscriptionMixin correctly.", ex2);
        }
    }
}
