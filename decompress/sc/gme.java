// 
// Decompiled by Procyon v0.6.0
// 

public final class gme implements abmc
{
    private final arkg a;
    
    public gme(final arkg a) {
        this.a = a;
    }
    
    public final void pT(final ahaz ahaz) {
        if (((twn)this.a.a()).a() == twl.g) {
            final ahaz builder = ancn.a.createBuilder();
            builder.copyOnWrite();
            final ancn ancn = (ancn)builder.instance;
            ancn.b |= 0x1;
            ancn.c = true;
            ahaz.copyOnWrite();
            final anco anco = (anco)ahaz.instance;
            final ancn w = (ancn)builder.build();
            final anco a = anco.a;
            w.getClass();
            anco.w = w;
            anco.c |= 0x4000;
        }
    }
}
