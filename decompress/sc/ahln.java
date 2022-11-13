import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahln extends ahbh implements ahcw
{
    public static final ahln a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private int e;
    private ahhu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)ahln.class, (ahbh)(a = new ahln()));
    }
    
    private ahln() {
        this.b = 0;
        this.g = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ahln.d) == null) {
                    synchronized (ahln.class) {
                        if (ahln.d == null) {
                            ahln.d = (ahdd)new ahba((ahbh)ahln.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahln.a;
            }
            case 4: {
                return new ahaz((ahbh)ahln.a);
            }
            case 3: {
                return new ahln();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahln.a, "\u0001\u0003\u0001\u0001\u0001\t\u0003\u0000\u0000\u0001\u0001\u103d\u0000\u0006\u1409\u0002\t\u103b\u0000", new Object[] { "c", "b", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
