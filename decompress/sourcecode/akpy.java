import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpy extends agzi implements ahax
{
    public static final akpy a;
    private static volatile ahbe c;
    public akjf b;
    private int d;
    private akpz e;
    private aioe f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(akpy.class, a = new akpy());
    }
    
    private akpy() {
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
                final ahbe c;
                if ((c = akpy.c) == null) {
                    synchronized (akpy.class) {
                        if (akpy.c == null) {
                            akpy.c = (ahbe)new agzb((agzi)akpy.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akpy.a;
            }
            case 4: {
                return new agza((agzi)akpy.a);
            }
            case 3: {
                return new akpy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akpy.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002", new Object[] { "d", "b", "e", "f" });
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
