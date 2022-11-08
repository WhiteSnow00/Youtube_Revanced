import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amfa extends agzi implements ahax
{
    public static final amfa a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance((Class)amfa.class, (agzi)(a = new amfa()));
    }
    
    private amfa() {
        this.b = 0;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = amfa.d) == null) {
                    synchronized (amfa.class) {
                        if (amfa.d == null) {
                            amfa.d = (ahbe)new agzb((agzi)amfa.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amfa.a;
            }
            case 4: {
                return new agza((agzi)amfa.a);
            }
            case 3: {
                return new amfa();
            }
            case 2: {
                return newMessageInfo((MessageLite)amfa.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1036\u0000\u0002\u1036\u0000", new Object[] { "c", "b" });
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
