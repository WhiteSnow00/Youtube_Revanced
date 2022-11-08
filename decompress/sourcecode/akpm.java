import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpm extends agzi implements ahax
{
    public static final akpm a;
    private static volatile ahbe c;
    public akjf b;
    private int d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(akpm.class, a = new akpm());
    }
    
    private akpm() {
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
                if ((c = akpm.c) == null) {
                    synchronized (akpm.class) {
                        if (akpm.c == null) {
                            akpm.c = (ahbe)new agzb((agzi)akpm.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akpm.a;
            }
            case 4: {
                return new agza((agzi)akpm.a);
            }
            case 3: {
                return new akpm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akpm.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
