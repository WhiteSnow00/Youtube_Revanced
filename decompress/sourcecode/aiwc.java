import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiwc extends agzi implements ahax
{
    public static final aiwc a;
    private static volatile ahbe b;
    private int c;
    private aioe d;
    private anss e;
    private anss f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(aiwc.class, a = new aiwc());
    }
    
    private aiwc() {
        this.g = 2;
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
                if ((b2 = aiwc.b) == null) {
                    synchronized (aiwc.class) {
                        if (aiwc.b == null) {
                            aiwc.b = (ahbe)new agzb((agzi)aiwc.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aiwc.a;
            }
            case 4: {
                return new agza((agzi)aiwc.a);
            }
            case 3: {
                return new aiwc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiwc.a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0003\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f" });
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
