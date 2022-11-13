import java.util.function.Consumer;
import java.util.Collection;
import j$.util.Collection$_EL;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gyt extends rco
{
    public final gyu a;
    
    public gyt(final gyu a) {
        this.a = a;
    }
    
    public final void a(final boolean b) {
        this.a.Q((ttg)new jnh(this, b, 1));
    }
    
    public final void b(final atzi atzi) {
        ttr.d("VideoPlaybackC: Error from MediaEngine", (Throwable)atzi);
        zlm.c(zll.b, zlk.f, "[ShortsCreation][Android][Edit]Error from MediaEngine", (Throwable)atzi);
        Collection$_EL.forEach((Collection)this.a.k, (Consumer)gyr.c);
    }
}
