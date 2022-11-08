import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdh extends agzi implements ahax
{
    public static final apdh a;
    private static volatile ahbe b;
    private int c;
    private aibc d;
    private ajsq e;
    private anss f;
    private anss g;
    private ajsq h;
    private ajsq i;
    private anss j;
    private anss k;
    private ajsq l;
    private ajsq m;
    private ahfw n;
    private byte o;
    
    static {
        agzi.registerDefaultInstance(apdh.class, a = new apdh());
    }
    
    private apdh() {
        this.o = 2;
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
                if ((b2 = apdh.b) == null) {
                    synchronized (apdh.class) {
                        if (apdh.b == null) {
                            apdh.b = (ahbe)new agzb((agzi)apdh.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apdh.a;
            }
            case 4: {
                return new agza((agzi)apdh.a);
            }
            case 3: {
                return new apdh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apdh.a, "\u0001\u000b\u0000\u0001\u0004\u0011\u000b\u0000\u0000\u000b\u0004\u1409\u0004\u0005\u1409\u0005\u0007\u1409\u000f\n\u1409\u0006\u000b\u1409\u0007\f\u1409\b\r\u1409\t\u000e\u1409\n\u000f\u1409\u000b\u0010\u1409\f\u0011\u1409\r", new Object[] { "c", "d", "e", "n", "f", "g", "h", "i", "j", "k", "l", "m" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.o = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
