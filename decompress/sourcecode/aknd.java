import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aknd extends agzi implements ahax
{
    public static final aknd a;
    private static volatile ahbe g;
    public int b;
    public akjd c;
    public altf d;
    public String e;
    public int f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(aknd.class, a = new aknd());
    }
    
    private aknd() {
        this.h = 2;
        this.e = "";
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
                final ahbe g;
                if ((g = aknd.g) == null) {
                    synchronized (aknd.class) {
                        if (aknd.g == null) {
                            aknd.g = (ahbe)new agzb((agzi)aknd.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aknd.a;
            }
            case 4: {
                return new agza((agzi)aknd.a);
            }
            case 3: {
                return new aknd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aknd.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0001\u0001\u1409\u0000\u0003\u1009\u0001\u0004\u1008\u0002\u0006\u100c\u0004", new Object[] { "b", "c", "d", "e", "f", ahzk.j });
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
