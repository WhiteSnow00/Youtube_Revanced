import com.google.android.libraries.blocks.runtime.BaseClient;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atyt
{
    private final oak a;
    
    public atyt(final oak a, final byte[] array) {
        this.a = a;
    }
    
    public final void a(final amdq amdq, final String s, final String s2) {
        final oak a = this.a;
        final agza builder = aqaw.a.createBuilder();
        final amdr b = amds.b();
        b.copyOnWrite();
        amds.h((amds)b.instance, amdq);
        b.copyOnWrite();
        amds.i((amds)b.instance, s);
        b.copyOnWrite();
        amds.g((amds)b.instance, s2);
        final amds c = (amds)b.build();
        builder.copyOnWrite();
        final aqaw aqaw = (aqaw)builder.instance;
        c.getClass();
        aqaw.c = c;
        aqaw.b |= 0x2;
        final aqaw aqaw2 = (aqaw)builder.build();
        a.o();
        final agyp agyp = (agyp)((BaseClient)a).c(-1163456569, (MessageLite)aqaw2, ((agzi)agyp.a).getParserForType());
    }
}
