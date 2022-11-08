import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aivr extends agzi implements ahax
{
    public static final aivr a;
    private static volatile ahbe b;
    private int c;
    private anss d;
    private ahfw e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(aivr.class, a = new aivr());
    }
    
    private aivr() {
        this.f = 2;
        emptyProtobufList();
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
                if ((b2 = aivr.b) == null) {
                    synchronized (aivr.class) {
                        if (aivr.b == null) {
                            aivr.b = (ahbe)new agzb((agzi)aivr.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aivr.a;
            }
            case 4: {
                return new agza((agzi)aivr.a);
            }
            case 3: {
                return new aivr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aivr.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1409\u0001", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
