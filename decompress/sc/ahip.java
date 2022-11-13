import com.google.protobuf.MessageLite;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahip extends ahbh implements ahcw
{
    private static final ahbq a;
    private static final ahip b;
    private static volatile ahdd c;
    private ahbp d;
    
    static {
        a = (ahbq)new ptj(8);
        ahbh.registerDefaultInstance((Class)ahip.class, (ahbh)(b = new ahip()));
    }
    
    private ahip() {
        this.d = emptyIntList();
    }
    
    public static ahio a() {
        return (ahio)ahip.b.createBuilder();
    }
    
    static ahip b() {
        return ahip.b;
    }
    
    public static void c(final ahip ahip, final Iterable iterable) {
        ahip.d(iterable);
    }
    
    private void d(final Iterable iterable) {
        this.e();
        final Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            this.d.g(((ahin)iterator.next()).h);
        }
    }
    
    private void e() {
        final ahbp d = this.d;
        if (!d.c()) {
            this.d = ahbh.mutableCopy(d);
        }
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ahip.c) == null) {
                    synchronized (ahip.class) {
                        if (ahip.c == null) {
                            ahip.c = (ahdd)new ahba((ahbh)ahip.b);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahip.b;
            }
            case 4: {
                return new ahio();
            }
            case 3: {
                return new ahip();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahip.b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[] { "d", ahin.a() });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
