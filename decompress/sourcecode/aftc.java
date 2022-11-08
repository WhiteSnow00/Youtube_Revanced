// 
// Decompiled by Procyon v0.6.0
// 

public final class aftc extends afrl
{
    private aftd a;
    
    public aftc(final aftd a) {
        this.a = a;
    }
    
    @Override
    protected final void b() {
        this.a = null;
    }
    
    @Override
    public final boolean cancel(final boolean b) {
        final aftd a = this.a;
        if (super.cancel(b)) {
            a.getClass();
            a.a = true;
            if (!b) {
                a.b = false;
            }
            a.a();
            return true;
        }
        return false;
    }
    
    @Override
    protected final String ns() {
        final aftd a = this.a;
        if (a != null) {
            final int length = a.d.length;
            final int value = a.c.get();
            final StringBuilder sb = new StringBuilder("inputCount=[");
            sb.append(length);
            sb.append("], remaining=[");
            sb.append(value);
            sb.append("]");
            return sb.toString();
        }
        return null;
    }
}
