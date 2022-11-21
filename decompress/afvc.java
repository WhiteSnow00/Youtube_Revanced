// 
// Decompiled by Procyon v0.6.0
// 

final class afvc
{
    static final afvc a;
    volatile afvc next;
    volatile Thread thread;
    
    static {
        a = new afvc(null);
    }
    
    public afvc() {
        afvd.h.d(this, Thread.currentThread());
    }
    
    public afvc(final byte[] array) {
    }
    
    final void a(final afvc afvc) {
        afvd.h.c(this, afvc);
    }
}
