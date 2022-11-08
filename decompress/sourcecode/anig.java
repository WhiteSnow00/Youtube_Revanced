import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anig extends agzi implements ahax
{
    public static final anig a;
    private static volatile ahbe e;
    public int b;
    public anih c;
    public anif d;
    private ammz f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(anig.class, a = new anig());
    }
    
    private anig() {
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
                final ahbe e;
                if ((e = anig.e) == null) {
                    synchronized (anig.class) {
                        if (anig.e == null) {
                            anig.e = (ahbe)new agzb((agzi)anig.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anig.a;
            }
            case 4: {
                return new agza((agzi)anig.a);
            }
            case 3: {
                return new anig();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anig.a, "\u0001\u0003\u0000\u0001\ue365\u2289\ue69a\u4e6e\u0003\u0000\u0000\u0003\ue365\u2289\u1409\u0000\ue391\u2289\u1409\u0001\ue69a\u4e6e\u1409\u0003", new Object[] { "b", "c", "d", "f" });
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
