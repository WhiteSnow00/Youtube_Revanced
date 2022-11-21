// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import java.util.concurrent.Executor;
import android.app.Activity;
import android.content.Context;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

public final class SplitController
{
    public static final SplitController$Companion Companion;
    private static volatile SplitController globalInstance;
    private static final ReentrantLock globalLock;
    public static final boolean sDebug = false;
    private final EmbeddingBackend embeddingBackend;
    private Set staticSplitRules;
    
    static {
        Companion = new SplitController$Companion(null);
        globalLock = new ReentrantLock();
    }
    
    private SplitController() {
        this.embeddingBackend = (EmbeddingBackend)ExtensionEmbeddingBackend.Companion.getInstance();
        this.staticSplitRules = (Set)atob.a;
    }
    
    public SplitController(final atqv atqv) {
        this();
    }
    
    public static final SplitController access$getGlobalInstance$cp() {
        return SplitController.globalInstance;
    }
    
    public static final ReentrantLock access$getGlobalLock$cp() {
        return SplitController.globalLock;
    }
    
    public static final void access$setGlobalInstance$cp(final SplitController globalInstance) {
        SplitController.globalInstance = globalInstance;
    }
    
    public static final void access$setStaticSplitRules(final SplitController splitController, final Set staticSplitRules) {
        splitController.setStaticSplitRules(staticSplitRules);
    }
    
    public static final SplitController getInstance() {
        return SplitController.Companion.getInstance();
    }
    
    public static final void initialize(final Context context, final int n) {
        SplitController.Companion.initialize(context, n);
    }
    
    private final void setStaticSplitRules(final Set set) {
        this.staticSplitRules = set;
        this.embeddingBackend.setSplitRules(set);
    }
    
    public final void addSplitListener(final Activity activity, final Executor executor, final akp akp) {
        activity.getClass();
        executor.getClass();
        akp.getClass();
        this.embeddingBackend.registerSplitListenerForActivity(activity, executor, akp);
    }
    
    public final void clearRegisteredRules() {
        this.embeddingBackend.setSplitRules(this.staticSplitRules);
    }
    
    public final void clearSplitAttributesCalculator() {
        this.embeddingBackend.clearSplitAttributesCalculator();
    }
    
    public final Set getSplitRules() {
        return this.embeddingBackend.getSplitRules();
    }
    
    public final boolean isActivityEmbedded(final Activity activity) {
        activity.getClass();
        return this.embeddingBackend.isActivityEmbedded(activity);
    }
    
    public final boolean isSplitAttributesCalculatorSupported() {
        return this.embeddingBackend.isSplitAttributesCalculatorSupported();
    }
    
    public final boolean isSplitSupported() {
        return this.embeddingBackend.isSplitSupported();
    }
    
    public final void registerRule(final EmbeddingRule embeddingRule) {
        embeddingRule.getClass();
        this.embeddingBackend.registerRule(embeddingRule);
    }
    
    public final void removeSplitListener(final akp akp) {
        akp.getClass();
        this.embeddingBackend.unregisterSplitListenerForActivity(akp);
    }
    
    public final void setSplitAttributesCalculator(final SplitAttributesCalculator splitAttributesCalculator) {
        splitAttributesCalculator.getClass();
        this.embeddingBackend.setSplitAttributesCalculator(splitAttributesCalculator);
    }
    
    public final void unregisterRule(final EmbeddingRule embeddingRule) {
        embeddingRule.getClass();
        this.embeddingBackend.unregisterRule(embeddingRule);
    }
}
