import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arcs extends ahcz implements aheo
{
    private static final arcs a;
    private static volatile ahev b;
    private int c;
    private aram d;
    
    static {
        ahcz.registerDefaultInstance(arcs.class, a = new arcs());
    }
    
    private arcs() {
    }
    
    public static arcr a() {
        return (arcr)arcs.a.createBuilder();
    }
    
    static arcs b() {
        return arcs.a;
    }
    
    public static void c(final arcs arcs, final aram aram) {
        arcs.d(aram);
    }
    
    private void d(final aram d) {
        d.getClass();
        this.d = d;
        this.c |= 0x1;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = arcs.b) == null) {
                    synchronized (arcs.class) {
                        if (arcs.b == null) {
                            arcs.b = (ahev)new ahcs((ahcz)arcs.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return arcs.a;
            }
            case 4: {
                return new arcr();
            }
            case 3: {
                return new arcs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arcs.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "c", "d" });
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
