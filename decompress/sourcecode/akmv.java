import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmv extends agzi implements ahax
{
    public static final akmv a;
    private static volatile ahbe j;
    public int b;
    public akjf c;
    public agzy d;
    public anss e;
    public int f;
    public anss g;
    public anss h;
    public double i;
    private apjz k;
    private ajtl l;
    private byte m;
    
    static {
        agzi.registerDefaultInstance(akmv.class, a = new akmv());
    }
    
    private akmv() {
        this.m = 2;
        this.d = agzi.emptyProtobufList();
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
                final ahbe j;
                if ((j = akmv.j) == null) {
                    synchronized (akmv.class) {
                        if (akmv.j == null) {
                            akmv.j = (ahbe)new agzb((agzi)akmv.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return akmv.a;
            }
            case 4: {
                return new agza((agzi)akmv.a);
            }
            case 3: {
                return new akmv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akmv.a, "\u0001\t\u0000\u0001\u0001\u0309\t\u0000\u0001\u0007\u0001\u1409\u0000\u0003\u041b\u0004\u1409\u0001\u0006\u100c\u0002\u0007\u1409\u0003\b\u1409\u0004\n\u1000\u0006\u000b\u1409\u0007\u0309\u1409\b", new Object[] { "b", "c", "d", anss.class, "e", "f", amww.a(), "g", "h", "i", "k", "l" });
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
