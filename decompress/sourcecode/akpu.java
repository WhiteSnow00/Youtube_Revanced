import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpu extends agzi implements ahax
{
    public static final akpu a;
    private static volatile ahbe c;
    public akjf b;
    private int d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(akpu.class, a = new akpu());
    }
    
    private akpu() {
        this.e = 2;
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
                final ahbe c;
                if ((c = akpu.c) == null) {
                    synchronized (akpu.class) {
                        if (akpu.c == null) {
                            akpu.c = (ahbe)new agzb((agzi)akpu.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akpu.a;
            }
            case 4: {
                return new agza((agzi)akpu.a);
            }
            case 3: {
                return new akpu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akpu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
