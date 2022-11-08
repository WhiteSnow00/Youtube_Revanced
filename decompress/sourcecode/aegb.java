import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aegb extends agzi implements ahax
{
    public static final aegb a;
    private static volatile ahbe c;
    public boolean b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(aegb.class, a = new aegb());
    }
    
    private aegb() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
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
                if ((c = aegb.c) == null) {
                    synchronized (aegb.class) {
                        if (aegb.c == null) {
                            aegb.c = (ahbe)new agzb((agzi)aegb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aegb.a;
            }
            case 4: {
                return new agza((agzi)aegb.a);
            }
            case 3: {
                return new aegb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aegb.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u1007\u0005", new Object[] { "d", "b" });
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
