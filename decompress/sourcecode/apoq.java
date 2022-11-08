import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apoq extends agzi implements ahax
{
    public static final apoq a;
    private static volatile ahbe d;
    public aorm b;
    public int c;
    private int e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)apoq.class, (agzi)(a = new apoq()));
    }
    
    private apoq() {
        this.f = 2;
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
                final ahbe d;
                if ((d = apoq.d) == null) {
                    synchronized (apoq.class) {
                        if (apoq.d == null) {
                            apoq.d = (ahbe)new agzb((agzi)apoq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apoq.a;
            }
            case 4: {
                return new agza((agzi)apoq.a);
            }
            case 3: {
                return new apoq();
            }
            case 2: {
                return newMessageInfo((MessageLite)apoq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u100c\u0001", new Object[] { "e", "b", "c", apms.o });
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
