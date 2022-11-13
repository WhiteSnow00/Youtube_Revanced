import java.util.NoSuchElementException;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.function.Supplier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ihv implements Supplier
{
    public static final ihv a;
    public static final ihv b;
    public static final ihv c;
    public static final ihv d;
    public static final ihv e;
    public static final ihv f;
    public static final ihv g;
    public static final ihv h;
    public static final ihv i;
    public static final ihv j;
    public static final ihv k;
    public static final ihv l;
    public static final ihv m;
    public static final ihv n;
    public static final ihv o;
    public static final ihv p;
    public static final ihv q;
    public static final ihv r;
    public static final ihv s;
    public static final ihv t;
    public static final ihv u;
    private final int v;
    
    static {
        u = new ihv(20);
        t = new ihv(19);
        s = new ihv(18);
        r = new ihv(17);
        q = new ihv(16);
        p = new ihv(15);
        o = new ihv(14);
        n = new ihv(13);
        m = new ihv(12);
        l = new ihv(11);
        k = new ihv(10);
        j = new ihv(9);
        i = new ihv(8);
        h = new ihv(7);
        g = new ihv(6);
        f = new ihv(5);
        e = new ihv(4);
        d = new ihv(3);
        c = new ihv(2);
        b = new ihv(1);
        a = new ihv(0);
    }
    
    private ihv(final int v) {
        this.v = v;
    }
    
    @Override
    public final Object get() {
        switch (this.v) {
            default: {
                return new ArrayList();
            }
            case 19: {
                return new ArrayList();
            }
            case 18: {
                return new ArrayList();
            }
            case 17: {
                return new HashSet();
            }
            case 16: {
                return new ArrayList();
            }
            case 15: {
                return new ArrayList();
            }
            case 14: {
                return new IllegalStateException("ThumbnailEditorStateEntity missing.");
            }
            case 13: {
                return new ArrayList();
            }
            case 12: {
                return new ArrayList();
            }
            case 11: {
                return new ArrayList();
            }
            case 10: {
                return new TreeSet();
            }
            case 9: {
                return new ArrayList();
            }
            case 8: {
                return new ArrayList();
            }
            case 7: {
                return new ArrayList();
            }
            case 6: {
                return new NoSuchElementException("tabs.size() > 0 but tabbedViewController is absent.");
            }
            case 5: {
                return new NoSuchElementException("tabs.size() > 0 but tabbedViewController is absent.");
            }
            case 4: {
                return new ArrayList();
            }
            case 3: {
                return afeq.q();
            }
            case 2: {
                return alem.a;
            }
            case 1: {
                return new ArrayList();
            }
            case 0: {
                return new HashSet();
            }
        }
    }
}
