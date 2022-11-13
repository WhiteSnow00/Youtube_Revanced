// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import android.app.Activity;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

public final class ExtensionEmbeddingBackend implements EmbeddingBackend
{
    public static final ExtensionEmbeddingBackend$Companion Companion;
    private static final String TAG = "EmbeddingBackend";
    private static volatile ExtensionEmbeddingBackend globalInstance;
    private static final ReentrantLock globalLock;
    private EmbeddingInterfaceCompat embeddingExtension;
    private final ExtensionEmbeddingBackend$RuleTracker ruleTracker;
    private final CopyOnWriteArrayList splitChangeCallbacks;
    private final ExtensionEmbeddingBackend$EmbeddingCallbackImpl splitInfoEmbeddingCallback;
    
    static {
        Companion = new ExtensionEmbeddingBackend$Companion((atny)null);
        globalLock = new ReentrantLock();
    }
    
    public ExtensionEmbeddingBackend(EmbeddingInterfaceCompat embeddingExtension) {
        this.embeddingExtension = embeddingExtension;
        final ExtensionEmbeddingBackend$EmbeddingCallbackImpl extensionEmbeddingBackend$EmbeddingCallbackImpl = new ExtensionEmbeddingBackend$EmbeddingCallbackImpl(this);
        this.splitInfoEmbeddingCallback = extensionEmbeddingBackend$EmbeddingCallbackImpl;
        this.splitChangeCallbacks = new CopyOnWriteArrayList();
        embeddingExtension = this.embeddingExtension;
        if (embeddingExtension != null) {
            embeddingExtension.setEmbeddingCallback((EmbeddingInterfaceCompat$EmbeddingCallbackInterface)extensionEmbeddingBackend$EmbeddingCallbackImpl);
        }
        this.ruleTracker = new ExtensionEmbeddingBackend$RuleTracker();
    }
    
    public static final ExtensionEmbeddingBackend access$getGlobalInstance$cp() {
        return ExtensionEmbeddingBackend.globalInstance;
    }
    
    public static final ReentrantLock access$getGlobalLock$cp() {
        return ExtensionEmbeddingBackend.globalLock;
    }
    
    public static final void access$setGlobalInstance$cp(final ExtensionEmbeddingBackend globalInstance) {
        ExtensionEmbeddingBackend.globalInstance = globalInstance;
    }
    
    public static void getSplitChangeCallbacks$annotations() {
    }
    
    public void clearSplitAttributesCalculator() {
        final EmbeddingInterfaceCompat embeddingExtension = this.embeddingExtension;
        if (embeddingExtension != null) {
            embeddingExtension.clearSplitAttributesCalculator();
        }
    }
    
    public final EmbeddingInterfaceCompat getEmbeddingExtension() {
        return this.embeddingExtension;
    }
    
    public final CopyOnWriteArrayList getSplitChangeCallbacks() {
        return this.splitChangeCallbacks;
    }
    
    public Set getSplitRules() {
        final ReentrantLock globalLock = ExtensionEmbeddingBackend.globalLock;
        globalLock.lock();
        try {
            return (Set)this.ruleTracker.getSplitRules();
        }
        finally {
            globalLock.unlock();
        }
    }
    
    public boolean isActivityEmbedded(final Activity activity) {
        activity.getClass();
        final EmbeddingInterfaceCompat embeddingExtension = this.embeddingExtension;
        return embeddingExtension != null && embeddingExtension.isActivityEmbedded(activity);
    }
    
    public boolean isSplitAttributesCalculatorSupported() {
        final EmbeddingInterfaceCompat embeddingExtension = this.embeddingExtension;
        return embeddingExtension != null && embeddingExtension.isSplitAttributesCalculatorSupported();
    }
    
    public boolean isSplitSupported() {
        return this.embeddingExtension != null;
    }
    
    public void registerRule(final EmbeddingRule embeddingRule) {
        embeddingRule.getClass();
        final ReentrantLock globalLock = ExtensionEmbeddingBackend.globalLock;
        globalLock.lock();
        try {
            if (!this.ruleTracker.contains(embeddingRule)) {
                ExtensionEmbeddingBackend$RuleTracker.addOrUpdateRule$default(this.ruleTracker, embeddingRule, false, 2, (Object)null);
                final EmbeddingInterfaceCompat embeddingExtension = this.embeddingExtension;
                if (embeddingExtension != null) {
                    embeddingExtension.setSplitRules(this.getSplitRules());
                }
            }
        }
        finally {
            globalLock.unlock();
        }
    }
    
    public void registerSplitListenerForActivity(final Activity activity, final Executor executor, final ako ako) {
        activity.getClass();
        executor.getClass();
        ako.getClass();
        final ReentrantLock globalLock = ExtensionEmbeddingBackend.globalLock;
        globalLock.lock();
        try {
            if (this.embeddingExtension == null) {
                ako.accept((Object)atlc.a);
                return;
            }
            final ExtensionEmbeddingBackend$SplitListenerWrapper extensionEmbeddingBackend$SplitListenerWrapper = new ExtensionEmbeddingBackend$SplitListenerWrapper(activity, executor, ako);
            this.splitChangeCallbacks.add(extensionEmbeddingBackend$SplitListenerWrapper);
            if (this.splitInfoEmbeddingCallback.getLastInfo() != null) {
                final List lastInfo = this.splitInfoEmbeddingCallback.getLastInfo();
                lastInfo.getClass();
                extensionEmbeddingBackend$SplitListenerWrapper.accept(lastInfo);
            }
            else {
                extensionEmbeddingBackend$SplitListenerWrapper.accept((List)atlc.a);
            }
        }
        finally {
            globalLock.unlock();
        }
    }
    
    public final void setEmbeddingExtension(final EmbeddingInterfaceCompat embeddingExtension) {
        this.embeddingExtension = embeddingExtension;
    }
    
    public void setSplitAttributesCalculator(final SplitAttributesCalculator splitAttributesCalculator) {
        splitAttributesCalculator.getClass();
        final EmbeddingInterfaceCompat embeddingExtension = this.embeddingExtension;
        if (embeddingExtension != null) {
            embeddingExtension.setSplitAttributesCalculator(splitAttributesCalculator);
        }
    }
    
    public void setSplitRules(final Set rules) {
        rules.getClass();
        final ReentrantLock globalLock = ExtensionEmbeddingBackend.globalLock;
        globalLock.lock();
        try {
            this.ruleTracker.setRules(rules);
            final EmbeddingInterfaceCompat embeddingExtension = this.embeddingExtension;
            if (embeddingExtension != null) {
                embeddingExtension.setSplitRules(this.getSplitRules());
            }
        }
        finally {
            globalLock.unlock();
        }
    }
    
    public void unregisterRule(final EmbeddingRule embeddingRule) {
        embeddingRule.getClass();
        final ReentrantLock globalLock = ExtensionEmbeddingBackend.globalLock;
        globalLock.lock();
        try {
            if (this.ruleTracker.contains(embeddingRule)) {
                this.ruleTracker.removeRule(embeddingRule);
                final EmbeddingInterfaceCompat embeddingExtension = this.embeddingExtension;
                if (embeddingExtension != null) {
                    embeddingExtension.setSplitRules(this.getSplitRules());
                }
            }
        }
        finally {
            globalLock.unlock();
        }
    }
    
    public void unregisterSplitListenerForActivity(final ako ako) {
        ako.getClass();
        final ReentrantLock globalLock = ExtensionEmbeddingBackend.globalLock;
        globalLock.lock();
        try {
            for (final ExtensionEmbeddingBackend$SplitListenerWrapper extensionEmbeddingBackend$SplitListenerWrapper : this.splitChangeCallbacks) {
                if (atoc.c((Object)extensionEmbeddingBackend$SplitListenerWrapper.getCallback(), (Object)ako)) {
                    this.splitChangeCallbacks.remove(extensionEmbeddingBackend$SplitListenerWrapper);
                    break;
                }
            }
            globalLock.unlock();
        }
        finally {
            globalLock.unlock();
            while (true) {}
        }
    }
}
