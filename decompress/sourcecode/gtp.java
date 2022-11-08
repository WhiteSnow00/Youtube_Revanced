import java.util.Map;
import java.util.LinkedHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gtp extends LinkedHashMap
{
    @Override
    protected final boolean removeEldestEntry(final Map.Entry entry) {
        return this.size() > 50;
    }
}
