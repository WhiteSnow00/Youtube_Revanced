import java.util.function.Function;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acub implements acuf
{
    public Optional a;
    private final xab b;
    private final xaa c;
    private final acua d;
    
    public acub(final xab b, final xaa c, final acua d) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = Optional.empty();
    }
    
    public final xab a() {
        if (this.a.isPresent()) {
            return (xab)this.a.get();
        }
        return this.b;
    }
    
    public final void b() {
    }
    
    public final void c() {
        final ahct ahct = (ahct)this.d.b.map((Function)acdy.h).orElse((Object)((ahcz)aisc.a).createBuilder());
        final ahcx b = amsk.b;
        if ((((amsl)ahct.rx((ahci)b)).b & 0x1) == 0x0) {
            ahcr ahcr;
            if (ahct.ry((ahci)b)) {
                ahcr = ((ahcz)ahct.rx((ahci)b)).toBuilder();
            }
            else {
                ahcr = ((ahcz)amsl.a).createBuilder();
            }
            final String i = this.c.pE().i();
            ahcr.copyOnWrite();
            final amsl amsl = (amsl)ahcr.instance;
            i.getClass();
            amsl.b |= 0x1;
            amsl.c = i;
            ahct.e((ahci)b, (Object)ahcr.build());
        }
        this.a().b(xbf.b((int)this.d.a.orElse((Object)123695)), (aisc)((ahcr)ahct).build(), (alji)null);
    }
    
    public final void d() {
        this.a().s();
    }
}
