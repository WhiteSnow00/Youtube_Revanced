import java.util.ArrayList;
import java.util.function.Supplier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acoe implements Supplier
{
    public static final acoe a;
    public static final acoe b;
    public static final acoe c;
    public static final acoe d;
    public static final acoe e;
    public static final acoe f;
    public static final acoe g;
    public static final acoe h;
    public static final acoe i;
    private final int j;
    
    static {
        i = new acoe(8);
        h = new acoe(7);
        g = new acoe(6);
        f = new acoe(5);
        e = new acoe(4);
        d = new acoe(3);
        c = new acoe(2);
        b = new acoe(1);
        a = new acoe(0);
    }
    
    private acoe(final int j) {
        this.j = j;
    }
    
    @Override
    public final Object get() {
        switch (this.j) {
            default: {
                return new afes();
            }
            case 7: {
                return affq.d();
            }
            case 6: {
                return afft.i();
            }
            case 5: {
                return afeq.d();
            }
            case 4: {
                return new ArrayList();
            }
            case 3: {
                return new RuntimeException("Could not get Lifecycle owner from context");
            }
            case 2: {
                return new RuntimeException("Could not get Lifecycle owner from context");
            }
            case 1: {
                return new ArrayList();
            }
            case 0: {
                return 1;
            }
        }
    }
}
