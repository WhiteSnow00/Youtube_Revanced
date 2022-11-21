// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;

final class ExtensionEmbeddingBackend$RuleTracker
{
    private final abk splitRules;
    private final HashMap tagRuleMap;
    
    public ExtensionEmbeddingBackend$RuleTracker() {
        this.splitRules = new abk();
        this.tagRuleMap = new HashMap();
    }
    
    public static void addOrUpdateRule$default(final ExtensionEmbeddingBackend$RuleTracker extensionEmbeddingBackend$RuleTracker, final EmbeddingRule embeddingRule, final boolean b, int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            n = 0;
        }
        else {
            n = 1;
        }
        extensionEmbeddingBackend$RuleTracker.addOrUpdateRule(embeddingRule, (boolean)(((b ? 1 : 0) & n) != 0x0));
    }
    
    public final void addOrUpdateRule(final EmbeddingRule embeddingRule, final boolean b) {
        embeddingRule.getClass();
        if (this.splitRules.contains(embeddingRule)) {
            return;
        }
        final String tag = embeddingRule.getTag();
        if (tag == null) {
            this.splitRules.add(embeddingRule);
            return;
        }
        if (!this.tagRuleMap.containsKey(tag)) {
            this.tagRuleMap.put(tag, embeddingRule);
            this.splitRules.add(embeddingRule);
            return;
        }
        if (!b) {
            this.splitRules.remove(this.tagRuleMap.get(tag));
            this.tagRuleMap.put(tag, embeddingRule);
            this.splitRules.add(embeddingRule);
            return;
        }
        final StringBuilder sb = new StringBuilder("Duplicated tag: ");
        sb.append(tag);
        sb.append(". Tag must be unique among all registered rules");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void clearRules() {
        this.splitRules.clear();
        this.tagRuleMap.clear();
    }
    
    public final boolean contains(final EmbeddingRule embeddingRule) {
        embeddingRule.getClass();
        return this.splitRules.contains(embeddingRule);
    }
    
    public final abk getSplitRules() {
        return this.splitRules;
    }
    
    public final void removeRule(final EmbeddingRule embeddingRule) {
        embeddingRule.getClass();
        if (!this.splitRules.contains(embeddingRule)) {
            return;
        }
        this.splitRules.remove(embeddingRule);
        if (embeddingRule.getTag() != null) {
            this.tagRuleMap.remove(embeddingRule.getTag());
        }
    }
    
    public final void setRules(final Set set) {
        set.getClass();
        this.clearRules();
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            this.addOrUpdateRule((EmbeddingRule)iterator.next(), true);
        }
    }
}
