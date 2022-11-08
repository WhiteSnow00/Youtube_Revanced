import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akof extends agzi implements ahax
{
    public static final akof a;
    private static volatile ahbe g;
    public int b;
    public akjd c;
    public String d;
    public String e;
    public String f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(akof.class, a = new akof());
    }
    
    private akof() {
        this.h = 2;
        this.d = "";
        this.e = "";
        this.f = "";
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
                if ((g = akof.g) == null) {
                    synchronized (akof.class) {
                        if (akof.g == null) {
                            akof.g = (ahbe)new agzb((agzi)akof.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akof.a;
            }
            case 4: {
                return new agza((agzi)akof.a);
            }
            case 3: {
                return new akof();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akof.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
