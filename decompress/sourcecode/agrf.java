import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrf extends agzi implements ahax
{
    public static final agrf a;
    private static volatile ahbe d;
    public agzy b;
    public agzy c;
    
    static {
        agzi.registerDefaultInstance(agrf.class, a = new agrf());
    }
    
    private agrf() {
        this.b = agzi.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.c = agzi.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                final ahbe d;
                if ((d = agrf.d) == null) {
                    synchronized (agrf.class) {
                        if (agrf.d == null) {
                            agrf.d = (ahbe)new agzb((agzi)agrf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agrf.a;
            }
            case 4: {
                return new agza((agzi)agrf.a);
            }
            case 3: {
                return new agrf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agrf.a, "\u0000\u0002\u0000\u0000\u0001\u0004\u0002\u0000\u0002\u0000\u0001\u001b\u0004\u001b", new Object[] { "b", agrj.class, "c", agrh.class });
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
