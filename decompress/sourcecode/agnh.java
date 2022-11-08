import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agnh extends agzi implements ahax
{
    public static final agnh a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(agnh.class, a = new agnh());
    }
    
    private agnh() {
        this.b = agzi.emptyProtobufList();
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = agnh.c) == null) {
                    synchronized (agnh.class) {
                        if (agnh.c == null) {
                            agnh.c = (ahbe)new agzb((agzi)agnh.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agnh.a;
            }
            case 4: {
                return new agza((agzi)agnh.a);
            }
            case 3: {
                return new agnh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agnh.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", agng.class });
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
