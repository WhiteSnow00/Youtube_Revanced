import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akou extends agzi implements ahax
{
    public static final akou a;
    private static volatile ahbe h;
    public int b;
    public akjf c;
    public anss d;
    public anss e;
    public agzy f;
    public agzy g;
    private ajtl i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(akou.class, a = new akou());
    }
    
    private akou() {
        this.j = 2;
        this.f = agzi.emptyProtobufList();
        this.g = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = akou.h) == null) {
                    synchronized (akou.class) {
                        if (akou.h == null) {
                            akou.h = (ahbe)new agzb((agzi)akou.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return akou.a;
            }
            case 4: {
                return new agza((agzi)akou.a);
            }
            case 3: {
                return new akou();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akou.a, "\u0001\u0006\u0000\u0001\u0001\u0309\u0006\u0000\u0002\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u041b\u0005\u041b\u0309\u1409\u0003", new Object[] { "b", "c", "d", "e", "f", ajnh.class, "g", anss.class, "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
