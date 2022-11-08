// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;

final class ExtensionEmbeddingBackend$RuleTracker
{
    private final abi splitRules;
    private final HashMap tagRuleMap;
    
    public ExtensionEmbeddingBackend$RuleTracker() {
        this.splitRules = new abi();
        this.tagRuleMap = new HashMap();
    }
    
    public final void addOrUpdateRule(final EmbeddingRule embeddingRule, final boolean b) {
        embeddingRule.getClass();
        if (this.splitRules.contains((Object)embeddingRule)) {
            return;
        }
        final String tag = embeddingRule.getTag();
        if (tag == null) {
            this.splitRules.add((Object)embeddingRule);
            return;
        }
        if (!this.tagRuleMap.containsKey(tag)) {
            this.tagRuleMap.put(tag, embeddingRule);
            this.splitRules.add((Object)embeddingRule);
            return;
        }
        if (!b) {
            this.splitRules.remove((Object)this.tagRuleMap.get(tag));
            this.tagRuleMap.put(tag, embeddingRule);
            this.splitRules.add((Object)embeddingRule);
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
        return this.splitRules.contains((Object)embeddingRule);
    }
    
    public final abi getSplitRules() {
        return this.splitRules;
    }
    
    public final void removeRule(final EmbeddingRule embeddingRule) {
        embeddingRule.getClass();
        if (!this.splitRules.contains((Object)embeddingRule)) {
            return;
        }
        this.splitRules.remove((Object)embeddingRule);
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
