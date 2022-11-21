import java.util.LinkedList;
import java.util.ArrayList;
import java.util.function.Supplier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class achh implements Supplier
{
    public static final achh a;
    public static final achh b;
    public static final achh c;
    public static final achh d;
    public static final achh e;
    public static final achh f;
    public static final achh g;
    public static final achh h;
    public static final achh i;
    public static final achh j;
    public static final achh k;
    private final int l;
    
    static {
        k = new achh(10);
        j = new achh(9);
        i = new achh(8);
        h = new achh(7);
        g = new achh(6);
        f = new achh(5);
        e = new achh(4);
        d = new achh(3);
        c = new achh(2);
        b = new achh(1);
        a = new achh(0);
    }
    
    private achh(final int l) {
        this.l = l;
    }
    
    @Override
    public final Object get() {
        switch (this.l) {
            default: {
                return new afgj();
            }
            case 9: {
                return afhh.d();
            }
            case 8: {
                return afhk.i();
            }
            case 7: {
                return afgh.d();
            }
            case 6: {
                return new ArrayList();
            }
            case 5: {
                return new LinkedList();
            }
            case 4: {
                return new RuntimeException("Could not get Lifecycle owner from context");
            }
            case 3: {
                return new RuntimeException("Could not get Lifecycle owner from context");
            }
            case 2: {
                return 1;
            }
            case 1: {
                return new ArrayList();
            }
            case 0: {
                return new ArrayList();
            }
        }
    }
}
