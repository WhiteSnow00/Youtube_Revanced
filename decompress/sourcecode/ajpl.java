import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajpl extends agzi implements ahax
{
    public static final ajpl a;
    private static volatile ahbe b;
    private int c;
    private anss d;
    private anss e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)ajpl.class, (agzi)(a = new ajpl()));
    }
    
    private ajpl() {
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
                final ahbe b2;
                if ((b2 = ajpl.b) == null) {
                    synchronized (ajpl.class) {
                        if (ajpl.b == null) {
                            ajpl.b = (ahbe)new agzb((agzi)ajpl.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajpl.a;
            }
            case 4: {
                return new agza((agzi)ajpl.a);
            }
            case 3: {
                return new ajpl();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajpl.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
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
