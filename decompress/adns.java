// 
// Decompiled by Procyon v0.6.0
// 

public final class adns implements Runnable
{
    public final adnx a;
    
    public adns(final adnx a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final adnx a = this.a;
        synchronized (a.l) {
            a.w();
        }
    }
}
