// 
// Decompiled by Procyon v0.6.0
// 

public final class glx implements abka
{
    private final arhr a;
    
    public glx(final arhr a) {
        this.a = a;
    }
    
    public final void pO(final agza agza) {
        if (((tul)this.a.a()).a() == tuj.g) {
            final agza builder = ((agzi)anaj.a).createBuilder();
            builder.copyOnWrite();
            final anaj anaj = (anaj)builder.instance;
            anaj.b |= 0x1;
            anaj.c = true;
            agza.copyOnWrite();
            final anak anak = (anak)agza.instance;
            final anaj w = (anaj)builder.build();
            final anak a = anak.a;
            w.getClass();
            anak.w = w;
            anak.c |= 0x4000;
        }
    }
}
