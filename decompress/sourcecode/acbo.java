// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class acbo
{
    private final Object a;
    private volatile acca b;
    private final atjj c;
    
    public acbo(final atjj c) {
        this.a = new Object();
        this.b = null;
        this.c = c;
    }
    
    public final acca a() {
        final acca b;
        if ((b = this.b) == null) {
            synchronized (this.a) {
                this.b = ((acbn)this.c).b();
            }
        }
        return b;
    }
}
