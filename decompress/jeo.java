import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class jeo extends ttt
{
    final afvt a;
    final adgj b;
    
    public jeo(final adgj b, final afvt a, final byte[] array) {
        this.b = b;
        this.a = a;
        super("onlinePlaybackRequester");
    }
    
    protected final /* bridge */ Object b() {
        return this.b.e((Executor)this.a);
    }
}
