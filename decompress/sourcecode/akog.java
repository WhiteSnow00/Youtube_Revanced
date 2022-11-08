import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akog extends agzi implements ahax
{
    public static final akog a;
    private static volatile ahbe i;
    public akjf b;
    public anss c;
    public anss d;
    public anss e;
    public agyc f;
    public boolean g;
    public aioe h;
    private int j;
    private ahfw k;
    private ajtl l;
    private byte m;
    
    static {
        agzi.registerDefaultInstance(akog.class, a = new akog());
    }
    
    private akog() {
        this.m = 2;
        this.f = agyc.b;
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
                if ((i = akog.i) == null) {
                    synchronized (akog.class) {
                        if (akog.i == null) {
                            akog.i = (ahbe)new agzb((agzi)akog.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return akog.a;
            }
            case 4: {
                return new agza((agzi)akog.a);
            }
            case 3: {
                return new akog();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akog.a, "\u0001\t\u0000\u0001\u0001\u0309\t\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u100a\u0005\u0007\u1007\u0006\b\u1409\u0007\u0309\u1409\b", new Object[] { "j", "b", "c", "d", "e", "k", "f", "g", "h", "l" });
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
