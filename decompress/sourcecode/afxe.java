import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class afxe extends afyi
{
    public afxe(final Class clazz) {
        super(clazz);
    }
    
    @Override
    public final Map c() {
        final HashMap hashMap = new HashMap();
        final agza builder = agal.a.createBuilder();
        builder.copyOnWrite();
        agal.a((agal)builder.instance);
        hashMap.put("AES256_SIV", new ardu((Object)builder.build(), 1));
        final agza builder2 = agal.a.createBuilder();
        builder2.copyOnWrite();
        agal.a((agal)builder2.instance);
        hashMap.put("AES256_SIV_RAW", new ardu((Object)builder2.build(), 3));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
}
