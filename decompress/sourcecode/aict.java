import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aict extends agzi implements ahax
{
    public static final aict a;
    private static volatile ahbe b;
    private int c;
    private anss d;
    private anss e;
    private anss f;
    private anss g;
    private aioe h;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)aict.class, (agzi)(a = new aict()));
    }
    
    private aict() {
        this.j = 2;
        emptyProtobufList();
        final agyc b = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b2;
                if ((b2 = aict.b) == null) {
                    synchronized (aict.class) {
                        if (aict.b == null) {
                            aict.b = (ahbe)new agzb((agzi)aict.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aict.a;
            }
            case 4: {
                return new agza((agzi)aict.a);
            }
            case 3: {
                return new aict();
            }
            case 2: {
                return newMessageInfo((MessageLite)aict.a, "\u0001\u0006\u0000\u0001\u0001\u0015\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u1409\n\b\u1409\u0006\n\u1409\u0004\u0015\u1409\u0002", new Object[] { "c", "d", "e", "i", "h", "g", "f" });
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
