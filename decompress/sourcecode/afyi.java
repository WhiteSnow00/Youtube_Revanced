import java.util.Collections;
import java.util.Map;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afyi
{
    public final Class a;
    
    public afyi(final Class a) {
        this.a = a;
    }
    
    public abstract MessageLite a(final MessageLite p0);
    
    public abstract MessageLite b(final agyc p0);
    
    public Map c() {
        return Collections.emptyMap();
    }
    
    public abstract void d(final MessageLite p0);
}
