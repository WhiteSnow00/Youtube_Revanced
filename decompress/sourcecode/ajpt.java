import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class ajpt extends agzi implements ahax
{
    public static final ajpt a;
    private static volatile ahbe b;
    private int c;
    private anss d;
    private anss e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)ajpt.class, (agzi)(a = new ajpt()));
    }
    
    private ajpt() {
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
                if ((b2 = ajpt.b) == null) {
                    synchronized (ajpt.class) {
                        if (ajpt.b == null) {
                            ajpt.b = (ahbe)new agzb((agzi)ajpt.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajpt.a;
            }
            case 4: {
                return new agza((agzi)ajpt.a);
            }
            case 3: {
                return new ajpt();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajpt.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
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
