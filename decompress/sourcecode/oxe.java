// 
// Decompiled by Procyon v0.6.0
// 

public final class oxe extends afrl
{
    Object a;
    
    public oxe(final Object a) {
        this.a = a;
    }
    
    protected final void b() {
        this.a = null;
    }
    
    public final String ns() {
        final Object a = this.a;
        if (a == null) {
            return "";
        }
        return a.toString();
    }
    
    public final boolean setException(final Throwable exception) {
        return super.setException(exception);
    }
}
