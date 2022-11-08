import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alal extends agzi implements ahax
{
    public static final alal a;
    private static volatile ahbe d;
    public akjf b;
    public int c;
    private int e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)alal.class, (agzi)(a = new alal()));
    }
    
    private alal() {
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
                if ((d = alal.d) == null) {
                    synchronized (alal.class) {
                        if (alal.d == null) {
                            alal.d = (ahbe)new agzb((agzi)alal.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alal.a;
            }
            case 4: {
                return new agza((agzi)alal.a);
            }
            case 3: {
                return new alal();
            }
            case 2: {
                return newMessageInfo((MessageLite)alal.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0003\u100c\u0001", new Object[] { "e", "b", "c", akwf.o });
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
