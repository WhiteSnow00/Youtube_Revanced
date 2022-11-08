import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agfd extends agzi implements ahax
{
    public static final agfd a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(agfd.class, a = new agfd());
    }
    
    private agfd() {
        this.b = agzi.emptyProtobufList();
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
                if ((c = agfd.c) == null) {
                    synchronized (agfd.class) {
                        if (agfd.c == null) {
                            agfd.c = (ahbe)new agzb((agzi)agfd.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agfd.a;
            }
            case 4: {
                return new agza((agzi)agfd.a);
            }
            case 3: {
                return new agfd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agfd.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[] { "b" });
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
