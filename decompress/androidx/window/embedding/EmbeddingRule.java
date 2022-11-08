// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

public abstract class EmbeddingRule
{
    private final String tag;
    
    public EmbeddingRule(final String tag) {
        this.tag = tag;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof EmbeddingRule && atnh.c((Object)this.tag, (Object)((EmbeddingRule)o).tag));
    }
    
    public final String getTag() {
        return this.tag;
    }
    
    @Override
    public int hashCode() {
        final String tag = this.tag;
        if (tag != null) {
            return tag.hashCode();
        }
        return 0;
    }
}
