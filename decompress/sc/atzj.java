import com.google.android.libraries.blocks.runtime.BaseClient;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atzj
{
    private final obq a;
    
    public atzj(final obq a, final byte[] array) {
        this.a = a;
    }
    
    public final void a(final amfu amfu, final String s, final String s2) {
        final obq a = this.a;
        final ahaz builder = aqdi.a.createBuilder();
        final amfv b = amfw.b();
        ((ahaz)b).copyOnWrite();
        amfw.h((amfw)b.instance, amfu);
        ((ahaz)b).copyOnWrite();
        amfw.i((amfw)b.instance, s);
        ((ahaz)b).copyOnWrite();
        amfw.g((amfw)b.instance, s2);
        final amfw c = (amfw)((ahaz)b).build();
        builder.copyOnWrite();
        final aqdi aqdi = (aqdi)builder.instance;
        c.getClass();
        aqdi.c = c;
        aqdi.b |= 0x2;
        final aqdi aqdi2 = (aqdi)builder.build();
        a.o();
        final ahao ahao = (ahao)((BaseClient)a).c(-1163456569, (MessageLite)aqdi2, ((ahbh)ahao.a).getParserForType());
    }
}
