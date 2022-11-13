// 
// Decompiled by Procyon v0.6.0
// 

public final class asit extends asis
{
    private static final long serialVersionUID = -8219729196779211169L;
    
    public asit(final Runnable runnable) {
        super(runnable);
    }
    
    @Override
    protected final /* bridge */ void a(final Object o) {
        ((Runnable)o).run();
    }
    
    @Override
    public final String toString() {
        final boolean ta = this.tA();
        final String value = String.valueOf(this.get());
        final StringBuilder sb = new StringBuilder("RunnableDisposable(disposed=");
        sb.append(ta);
        sb.append(", ");
        sb.append(value);
        sb.append(")");
        return sb.toString();
    }
}
