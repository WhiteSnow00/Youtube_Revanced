import java.util.concurrent.ExecutionException;

// 
// Decompiled by Procyon v0.6.0
// 

public class aah extends aak
{
    private final Throwable a;
    
    public aah(final Throwable a) {
        this.a = a;
    }
    
    @Override
    public final Object get() {
        throw new ExecutionException(this.a);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=FAILURE, cause=[");
        sb.append(this.a);
        sb.append("]]");
        return sb.toString();
    }
}
