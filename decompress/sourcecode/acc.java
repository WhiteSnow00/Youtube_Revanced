// 
// Decompiled by Procyon v0.6.0
// 

final class acc extends Throwable
{
    public acc(final String s) {
        super(s);
    }
    
    @Override
    public final Throwable fillInStackTrace() {
        monitorenter(this);
        monitorexit(this);
        return this;
    }
}
