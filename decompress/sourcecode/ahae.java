import com.google.protobuf.MessageLite;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahae implements Entry
{
    public final Entry a;
    
    public ahae(final Entry a) {
        this.a = a;
    }
    
    @Override
    public final Object getKey() {
        return this.a.getKey();
    }
    
    @Override
    public final Object getValue() {
        if (this.a.getValue() == null) {
            return null;
        }
        throw null;
    }
    
    @Override
    public final Object setValue(final Object o) {
        if (o instanceof MessageLite) {
            final ahag ahag = this.a.getValue();
            final MessageLite a = (MessageLite)o;
            final MessageLite a2 = ((ahah)ahag).a;
            ((ahah)ahag).b = null;
            ((ahah)ahag).a = a;
            return a2;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
