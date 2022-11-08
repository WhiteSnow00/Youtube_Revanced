import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardb extends agzi implements ahax
{
    public static final ardb a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance((Class)ardb.class, (agzi)(a = new ardb()));
    }
    
    private ardb() {
        this.b = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ardb.c) == null) {
                    synchronized (ardb.class) {
                        if (ardb.c == null) {
                            ardb.c = (ahbe)new agzb((agzi)ardb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ardb.a;
            }
            case 4: {
                return new agza((agzi)ardb.a);
            }
            case 3: {
                return new ardb();
            }
            case 2: {
                return newMessageInfo((MessageLite)ardb.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", arda.class });
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
