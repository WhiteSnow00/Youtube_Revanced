import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class afyz extends afyi
{
    public afyz(final Class clazz) {
        super(clazz);
    }
    
    public final Map c() {
        final HashMap hashMap = new HashMap();
        final agza builder = ((agzi)afzw.a).createBuilder();
        builder.copyOnWrite();
        afzw.a((afzw)builder.instance);
        final agza builder2 = ((agzi)afzx.a).createBuilder();
        builder2.copyOnWrite();
        afzx.a((afzx)builder2.instance);
        final afzx c = (afzx)builder2.build();
        builder.copyOnWrite();
        final afzw afzw = (afzw)builder.instance;
        c.getClass();
        afzw.c = c;
        hashMap.put("AES_CMAC", new ardu(builder.build(), 1));
        final agza builder3 = ((agzi)afzw.a).createBuilder();
        builder3.copyOnWrite();
        afzw.a((afzw)builder3.instance);
        final agza builder4 = ((agzi)afzx.a).createBuilder();
        builder4.copyOnWrite();
        afzx.a((afzx)builder4.instance);
        final afzx c2 = (afzx)builder4.build();
        builder3.copyOnWrite();
        final afzw afzw2 = (afzw)builder3.instance;
        c2.getClass();
        afzw2.c = c2;
        hashMap.put("AES256_CMAC", new ardu(builder3.build(), 1));
        final agza builder5 = ((agzi)afzw.a).createBuilder();
        builder5.copyOnWrite();
        afzw.a((afzw)builder5.instance);
        final agza builder6 = ((agzi)afzx.a).createBuilder();
        builder6.copyOnWrite();
        afzx.a((afzx)builder6.instance);
        final afzx c3 = (afzx)builder6.build();
        builder5.copyOnWrite();
        final afzw afzw3 = (afzw)builder5.instance;
        c3.getClass();
        afzw3.c = c3;
        hashMap.put("AES256_CMAC_RAW", new ardu(builder5.build(), 3));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
}
