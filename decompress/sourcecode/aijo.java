import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aijo extends agzi implements ahax
{
    public static final aijo a;
    private static volatile ahbe d;
    public int b;
    public agyc c;
    
    static {
        agzi.registerDefaultInstance(aijo.class, a = new aijo());
    }
    
    private aijo() {
        this.c = agyc.b;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aijo.d) == null) {
                    synchronized (aijo.class) {
                        if (aijo.d == null) {
                            aijo.d = (ahbe)new agzb((agzi)aijo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aijo.a;
            }
            case 4: {
                return new agza((agzi)aijo.a);
            }
            case 3: {
                return new aijo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aijo.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "b", "c" });
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
