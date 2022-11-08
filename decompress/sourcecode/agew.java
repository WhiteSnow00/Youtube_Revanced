import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agew extends agzi implements ahax
{
    public static final agew a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(agew.class, a = new agew());
    }
    
    private agew() {
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
                if ((c = agew.c) == null) {
                    synchronized (agew.class) {
                        if (agew.c == null) {
                            agew.c = (ahbe)new agzb((agzi)agew.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agew.a;
            }
            case 4: {
                return new agza((agzi)agew.a);
            }
            case 3: {
                return new agew();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agew.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[] { "b" });
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
