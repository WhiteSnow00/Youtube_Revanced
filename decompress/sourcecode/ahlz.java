import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlz extends agzi implements ahax
{
    public static final ahlz a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance((Class)ahlz.class, (agzi)(a = new ahlz()));
    }
    
    private ahlz() {
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
                if ((d = ahlz.d) == null) {
                    synchronized (ahlz.class) {
                        if (ahlz.d == null) {
                            ahlz.d = (ahbe)new agzb((agzi)ahlz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahlz.a;
            }
            case 4: {
                return new agza((agzi)ahlz.a);
            }
            case 3: {
                return new ahlz();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahlz.a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u103c\u0000", new Object[] { "c", "b", aovc.class });
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
