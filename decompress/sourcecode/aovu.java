import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovu extends agzi implements ahax
{
    public static final aovu a;
    private static volatile ahbe b;
    private int c;
    private anss d;
    private anss e;
    private anss f;
    private aovv g;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(aovu.class, a = new aovu());
    }
    
    private aovu() {
        this.i = 2;
        final agyc b = agyc.b;
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
                final ahbe b2;
                if ((b2 = aovu.b) == null) {
                    synchronized (aovu.class) {
                        if (aovu.b == null) {
                            aovu.b = (ahbe)new agzb((agzi)aovu.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aovu.a;
            }
            case 4: {
                return new agza((agzi)aovu.a);
            }
            case 3: {
                return new aovu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aovu.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0003\u0005\u1409\u0004\u0007\u1409\u0002", new Object[] { "c", "d", "e", "g", "h", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
