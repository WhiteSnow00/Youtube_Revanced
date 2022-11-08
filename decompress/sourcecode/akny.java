import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akny extends agzi implements ahax
{
    public static final akny a;
    private static volatile ahbe f;
    public int b;
    public Object c;
    public akjf d;
    public agyc e;
    private int g;
    private ahfw h;
    private ajtl i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(akny.class, a = new akny());
    }
    
    private akny() {
        this.b = 0;
        this.j = 2;
        agzi.emptyProtobufList();
        agzi.emptyProtobufList();
        this.e = agyc.b;
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
                final ahbe f;
                if ((f = akny.f) == null) {
                    synchronized (akny.class) {
                        if (akny.f == null) {
                            akny.f = (ahbe)new agzb((agzi)akny.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akny.a;
            }
            case 4: {
                return new agza((agzi)akny.a);
            }
            case 3: {
                return new akny();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akny.a, "\u0001\u0007\u0001\u0001\u0001\u0309\u0007\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u143c\u0000\u0003\u143c\u0000\u0004\u1409\u0005\u0005\u100a\u0006\u0006\u143c\u0000\u0309\u1409\u0007", new Object[] { "c", "b", "g", "d", anss.class, ajnh.class, "h", "e", aioe.class, "i" });
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
