import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akos extends agzi implements ahax
{
    public static final akos a;
    private static volatile ahbe f;
    public akjf b;
    public aobz c;
    public aocf d;
    public amfc e;
    private int g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(akos.class, a = new akos());
    }
    
    private akos() {
        this.h = 2;
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
                final ahbe f;
                if ((f = akos.f) == null) {
                    synchronized (akos.class) {
                        if (akos.f == null) {
                            akos.f = (ahbe)new agzb((agzi)akos.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akos.a;
            }
            case 4: {
                return new agza((agzi)akos.a);
            }
            case 3: {
                return new akos();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akos.a, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0000\u0001\u0001\u1409\u0000\u0004\u1009\u0001\b\u1009\u0006\n\u1009\u0007", new Object[] { "g", "b", "c", "d", "e" });
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
