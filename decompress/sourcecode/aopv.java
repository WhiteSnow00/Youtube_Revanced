import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aopv extends agzi implements ahax
{
    public static final aopv a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private anss f;
    private anss g;
    private aibc h;
    private aibc i;
    private aioe j;
    private ahfw k;
    private byte l;
    
    static {
        agzi.registerDefaultInstance((Class)aopv.class, (agzi)(a = new aopv()));
    }
    
    private aopv() {
        this.l = 2;
        emptyProtobufList();
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
                if ((b2 = aopv.b) == null) {
                    synchronized (aopv.class) {
                        if (aopv.b == null) {
                            aopv.b = (ahbe)new agzb((agzi)aopv.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aopv.a;
            }
            case 4: {
                return new agza((agzi)aopv.a);
            }
            case 3: {
                return new aopv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aopv.a, "\u0001\b\u0000\u0001\u0001\u000e\b\u0000\u0000\b\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0005\u0005\u1409\u0006\b\u1409\n\u000b\u1409\t\r\u1409\u0002\u000e\u1409\u0003", new Object[] { "c", "d", "e", "h", "i", "k", "j", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.l = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
