import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Arrays;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class agcm extends afyi
{
    public agcm(final Class clazz) {
        super(clazz);
    }
    
    public final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put("ED25519", new ardu(agay.a, 1));
        hashMap.put("ED25519_RAW", new ardu(agay.a, 3));
        hashMap.put("ED25519WithRawOutput", new ardu(agay.a, 3));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
}
