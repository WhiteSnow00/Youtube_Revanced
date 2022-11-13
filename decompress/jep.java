// 
// Decompiled by Procyon v0.6.0
// 

final class jep extends ttt
{
    final aadd a;
    final aadj b;
    
    public jep(final aadd a, final aadj b) {
        this.a = a;
        this.b = b;
        super("offlinePlaybackRequester");
    }
    
    protected final /* bridge */ Object b() {
        return new aack(this.a, this.b);
    }
}
