// 
// Decompiled by Procyon v0.6.0
// 

final class aapd extends abvy
{
    private final Runnable a;
    
    public aapd(final long n, final abpq abpq) {
        super(n, n + 1000L, 1, 1, "PausingCueRange");
        this.a = (Runnable)new aaog(abpq, 2);
    }
    
    protected final void b(final boolean b, final boolean b2, final boolean b3) {
        this.a.run();
    }
}
