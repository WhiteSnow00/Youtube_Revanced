import java.io.InvalidObjectException;
import java.text.Format;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f extends Field
{
    public static final f a;
    private static final long serialVersionUID = 7510380454602616157L;
    
    static {
        a = new f();
    }
    
    protected f() {
        super("message argument field");
    }
    
    @Override
    protected Object readResolve() {
        if (this.getClass() != f.class) {
            throw new InvalidObjectException("A subclass of MessageFormat.Field must implement readResolve.");
        }
        final String name = this.getName();
        final f a = f.a;
        if (name.equals(a.getName())) {
            return a;
        }
        throw new InvalidObjectException("Unknown attribute name.");
    }
}
