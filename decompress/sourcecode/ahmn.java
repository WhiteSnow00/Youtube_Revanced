import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmn extends agzi implements ahax
{
    public static final ahmn a;
    private static volatile ahbe c;
    public agyc b;
    private int d;
    private aibc e;
    private ajsq f;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)ahmn.class, (agzi)(a = new ahmn()));
    }
    
    private ahmn() {
        this.h = 2;
        this.b = agyc.b;
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
                final ahbe c;
                if ((c = ahmn.c) == null) {
                    synchronized (ahmn.class) {
                        if (ahmn.c == null) {
                            ahmn.c = (ahbe)new agzb((agzi)ahmn.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahmn.a;
            }
            case 4: {
                return new agza((agzi)ahmn.a);
            }
            case 3: {
                return new ahmn();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahmn.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u100a\u0002\u0004\u1409\u0003", new Object[] { "d", "e", "f", "b", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
