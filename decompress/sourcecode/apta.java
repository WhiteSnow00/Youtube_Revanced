import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apta extends agzi implements ahax
{
    public static final apta a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance((Class)apta.class, (agzi)(a = new apta()));
    }
    
    private apta() {
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
                if ((c = apta.c) == null) {
                    synchronized (apta.class) {
                        if (apta.c == null) {
                            apta.c = (ahbe)new agzb((agzi)apta.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apta.a;
            }
            case 4: {
                return new agza((agzi)apta.a);
            }
            case 3: {
                return new apta();
            }
            case 2: {
                return newMessageInfo((MessageLite)apta.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", apsy.class });
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
