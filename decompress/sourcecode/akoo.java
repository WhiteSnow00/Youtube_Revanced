import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akoo extends agzi implements ahax
{
    public static final akoo a;
    private static volatile ahbe i;
    public int b;
    public Object c;
    public int d;
    public Object e;
    public akjf f;
    public agzy g;
    public agzy h;
    private int j;
    private ahfw k;
    private ajtl l;
    private byte m;
    
    static {
        agzi.registerDefaultInstance(akoo.class, a = new akoo());
    }
    
    private akoo() {
        this.b = 0;
        this.d = 0;
        this.m = 2;
        this.g = agzi.emptyProtobufList();
        this.h = agzi.emptyProtobufList();
        final agyc b = agyc.b;
        emptyProtobufList();
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
                final ahbe i;
                if ((i = akoo.i) == null) {
                    synchronized (akoo.class) {
                        if (akoo.i == null) {
                            akoo.i = (ahbe)new agzb((agzi)akoo.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return akoo.a;
            }
            case 4: {
                return new agza((agzi)akoo.a);
            }
            case 3: {
                return new akoo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akoo.a, "\u0001\t\u0002\u0001\u0001\u0309\t\u0000\u0002\u0007\u0001\u1409\u0000\u0002\u041b\u0003\u103b\u0000\u0004\u041b\u0005\u103b\u0001\u0006\u1409\u0005\b\u143c\u0000\t\u143c\u0001\u0309\u1409\u0007", new Object[] { "c", "b", "e", "d", "j", "f", "g", akom.class, "h", akom.class, "k", aioe.class, aioe.class, "l" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.m = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
