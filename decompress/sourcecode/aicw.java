import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aicw extends agzi implements ahax
{
    public static final aicw a;
    private static volatile ahbe b;
    private int c;
    private anss d;
    private anss e;
    private anss f;
    private anss g;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)aicw.class, (agzi)(a = new aicw()));
    }
    
    private aicw() {
        this.i = 2;
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
                if ((b2 = aicw.b) == null) {
                    synchronized (aicw.class) {
                        if (aicw.b == null) {
                            aicw.b = (ahbe)new agzb((agzi)aicw.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aicw.a;
            }
            case 4: {
                return new agza((agzi)aicw.a);
            }
            case 3: {
                return new aicw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aicw.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "c", "d", "e", "f", "g", "h" });
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
