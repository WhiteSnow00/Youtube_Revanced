import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

final class hmd implements hna
{
    final /* synthetic */ afsz a;
    final /* synthetic */ long b;
    final /* synthetic */ hmk c;
    private final /* synthetic */ int d;
    
    public hmd(final hmk c, final afsz a, final long b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a() {
        if (this.d != 0) {
            this.a.rz((Throwable)new Exception("ReelWatchSequence has error response"));
            return;
        }
        this.a.rz((Throwable)new Exception("ReelWatchSequence has error response"));
    }
    
    @Override
    public final void b() {
        if (this.d != 0) {
            this.a.b((Object)Optional.ofNullable((Object)this.c.p.I(this.b)));
            return;
        }
        this.a.b((Object)Optional.ofNullable((Object)this.c.p.J(this.b)));
    }
}
