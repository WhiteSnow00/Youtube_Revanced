import java.util.TimerTask;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acmg extends TimerTask
{
    final /* synthetic */ Object a;
    public final /* synthetic */ abxx b;
    public final /* synthetic */ acms c;
    
    public acmg(final acms c, final Object a, final abxx b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        this.c.F.remove(this.a);
        this.c.w.execute((Runnable)new abxb(this, 8));
    }
}
