import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ailo extends agzi implements ahax
{
    public static final ailo a;
    private static volatile ahbe d;
    public ailp b;
    public agzy c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(ailo.class, a = new ailo());
    }
    
    private ailo() {
        this.c = agzi.emptyProtobufList();
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
                if ((d = ailo.d) == null) {
                    synchronized (ailo.class) {
                        if (ailo.d == null) {
                            ailo.d = (ahbe)new agzb((agzi)ailo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ailo.a;
            }
            case 4: {
                return new agza((agzi)ailo.a);
            }
            case 3: {
                return new ailo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ailo.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u001b", new Object[] { "e", "b", "c", ailp.class });
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
