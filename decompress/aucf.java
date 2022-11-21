import com.google.android.libraries.blocks.runtime.BaseClient;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aucf
{
    private final ocg a;
    
    public aucf(final ocg a, final byte[] array) {
        this.a = a;
    }
    
    public final void a(final amhw amhw, final String s, final String s2) {
        final ocg a = this.a;
        final ahcr builder = ((ahcz)aqgc.a).createBuilder();
        final amhx b = amhy.b();
        ((ahcr)b).copyOnWrite();
        amhy.h((amhy)b.instance, amhw);
        ((ahcr)b).copyOnWrite();
        amhy.i((amhy)b.instance, s);
        ((ahcr)b).copyOnWrite();
        amhy.g((amhy)b.instance, s2);
        final amhy c = (amhy)((ahcr)b).build();
        builder.copyOnWrite();
        final aqgc aqgc = (aqgc)builder.instance;
        c.getClass();
        aqgc.c = c;
        aqgc.b |= 0x2;
        final aqgc aqgc2 = (aqgc)builder.build();
        a.o();
        final ahcg ahcg = (ahcg)((BaseClient)a).c(-1163456569, (MessageLite)aqgc2, ((ahcz)ahcg.a).getParserForType());
    }
}
