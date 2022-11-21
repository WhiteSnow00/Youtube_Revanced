import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afws implements Runnable
{
    final Future a;
    final Object b;
    private final int c;
    
    public afws(final Future a, final aae b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public afws(final Future a, final afwr b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        if (this.c != 0) {
            try {
                Object o = this.a;
                final boolean done = ((Future)o).isDone();
                new StringBuilder("Future was expected to be done, ").append(o);
                afc.f(done, "Future was expected to be done, ".concat(String.valueOf(o)));
                o = sg.g((Future)o);
                ((aae)this.b).b(o);
                return;
            }
            catch (final Error o) {
                goto Label_0069;
            }
            catch (final RuntimeException ex) {}
            catch (final ExecutionException ex2) {
                final Throwable cause = ex2.getCause();
                if (cause == null) {
                    ((aae)this.b).a((Throwable)ex2);
                    return;
                }
                ((aae)this.b).a(cause);
                return;
            }
        }
        Object o2 = this.a;
        if (o2 instanceof afye) {
            o2 = ((afye)o2).h();
            if (o2 != null) {
                ((afwr)this.b).rF((Throwable)o2);
                return;
            }
        }
        try {
            o2 = afxr.t(this.a);
            ((afwr)this.b).b(o2);
        }
        catch (final Error o2) {
            goto Label_0174;
        }
        catch (final RuntimeException ex3) {}
        catch (final ExecutionException ex4) {
            ((afwr)this.b).rF(ex4.getCause());
        }
    }
    
    @Override
    public final String toString() {
        if (this.c != 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.getClass().getSimpleName());
            sb.append(",");
            sb.append(this.b);
            return sb.toString();
        }
        final afbg ae = adme.ae(this);
        ae.a(this.b);
        return ae.toString();
    }
}
