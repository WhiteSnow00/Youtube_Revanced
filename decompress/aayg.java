// 
// Decompiled by Procyon v0.6.0
// 

public final class aayg implements abzd
{
    final Object a;
    public final Object b;
    private final int c;
    
    public aayg(final aayh b, final aans a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aayg(final elx b, final rqh a, final int c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        if (this.c != 0) {
            ((elx)this.b).a = null;
            ((rqh)this.a).m();
        }
    }
    
    public final void b(final abzg a) {
        if (this.c != 0) {
            ((elx)this.b).a = a;
            ((rqh)this.a).l();
            return;
        }
        ((aayh)this.b).a.execute((Runnable)new ztq(this, (aans)this.a, a, 16));
    }
}
