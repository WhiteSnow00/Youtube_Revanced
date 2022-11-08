import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aide extends agzi implements ahax
{
    public static final aide a;
    private static volatile ahbe b;
    private int c;
    private ahfw d;
    private anss e;
    private anss f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)aide.class, (agzi)(a = new aide()));
    }
    
    private aide() {
        this.g = 2;
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
                if ((b2 = aide.b) == null) {
                    synchronized (aide.class) {
                        if (aide.b == null) {
                            aide.b = (ahbe)new agzb((agzi)aide.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aide.a;
            }
            case 4: {
                return new agza((agzi)aide.a);
            }
            case 3: {
                return new aide();
            }
            case 2: {
                return newMessageInfo((MessageLite)aide.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0002\u0002\u1409\u0003\u0003\u1409\u0000", new Object[] { "c", "e", "f", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
