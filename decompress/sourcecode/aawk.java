// 
// Decompiled by Procyon v0.6.0
// 

public final class aawk implements abxa
{
    final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;
    
    public aawk(final aawl b, final aaly a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aawk(final acnx b, final rod a, final int c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        if (this.c != 0) {
            ((acnx)this.b).a = null;
            ((rod)this.a).m();
        }
    }
    
    public final void b(final abxe a) {
        if (this.c != 0) {
            ((acnx)this.b).a = a;
            ((rod)this.a).l();
            return;
        }
        ((aawl)this.b).a.execute((Runnable)new zry(this, (aaly)this.a, a, 16));
    }
}
