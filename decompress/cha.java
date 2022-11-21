// 
// Decompiled by Procyon v0.6.0
// 

final class cha extends RuntimeException
{
    public final Throwable a;
    public final int b;
    
    public cha(final int b, final Throwable a) {
        super(a);
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Throwable getCause() {
        return this.a;
    }
}
