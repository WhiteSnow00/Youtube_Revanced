// 
// Decompiled by Procyon v0.6.0
// 

public final class frh implements chr
{
    public final Object a;
    private final int b;
    
    public frh(final ashj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public frh(final dun a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public frh(final frk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a() {
        final int b = this.b;
        if (b == 0) {
            ((frk)this.a).a();
            return;
        }
        if (b != 1) {
            ((ashj)this.a).c(lni.a);
            return;
        }
        final Object a = this.a;
        final edb edb = new edb();
        final dun dun = (dun)a;
        final Boolean b2 = (Boolean)dun.b.l().P(dun, edb);
    }
}
