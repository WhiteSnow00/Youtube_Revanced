import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alaq extends agzi implements ahax
{
    public static final alaq a;
    private static volatile ahbe c;
    public akjf b;
    private int d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)alaq.class, (agzi)(a = new alaq()));
    }
    
    private alaq() {
        this.e = 2;
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
                if ((c = alaq.c) == null) {
                    synchronized (alaq.class) {
                        if (alaq.c == null) {
                            alaq.c = (ahbe)new agzb((agzi)alaq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return alaq.a;
            }
            case 4: {
                return new agza((agzi)alaq.a);
            }
            case 3: {
                return new alaq();
            }
            case 2: {
                return newMessageInfo((MessageLite)alaq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
