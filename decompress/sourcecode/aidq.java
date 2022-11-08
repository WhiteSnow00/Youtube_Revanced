import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidq extends agzi implements ahax
{
    public static final aidq a;
    private static volatile ahbe b;
    private int c;
    private aidp d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aidq.class, (agzi)(a = new aidq()));
    }
    
    private aidq() {
        this.e = 2;
        emptyProtobufList();
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
                if ((b2 = aidq.b) == null) {
                    synchronized (aidq.class) {
                        if (aidq.b == null) {
                            aidq.b = (ahbe)new agzb((agzi)aidq.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aidq.a;
            }
            case 4: {
                return new agza((agzi)aidq.a);
            }
            case 3: {
                return new aidq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aidq.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
