import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aneb extends agzi implements ahax
{
    public static final aneb a;
    private static volatile ahbe d;
    public int b;
    public int c;
    private int e;
    private ajsq f;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(aneb.class, a = new aneb());
    }
    
    private aneb() {
        this.h = 2;
        final agyc b = agyc.b;
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
                final ahbe d;
                if ((d = aneb.d) == null) {
                    synchronized (aneb.class) {
                        if (aneb.d == null) {
                            aneb.d = (ahbe)new agzb((agzi)aneb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aneb.a;
            }
            case 4: {
                return new agza((agzi)aneb.a);
            }
            case 3: {
                return new aneb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aneb.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1004\u0001\u0003\u1409\u0003\u0005\u1004\u0002", new Object[] { "e", "f", "b", "g", "c" });
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
