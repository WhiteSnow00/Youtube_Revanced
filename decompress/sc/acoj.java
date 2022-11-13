import java.util.TimerTask;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acoj extends TimerTask
{
    final Object a;
    public final acaa b;
    public final acov c;
    
    public acoj(final acov c, final Object a, final acaa b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        this.c.F.remove(this.a);
        this.c.w.execute((Runnable)new abuv(this, 10));
    }
}
