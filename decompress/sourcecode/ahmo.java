import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmo extends agzi implements ahax
{
    public static final ahmo a;
    private static volatile ahbe c;
    public agzy b;
    private int d;
    private anss e;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)ahmo.class, (agzi)(a = new ahmo()));
    }
    
    private ahmo() {
        this.g = 2;
        this.b = emptyProtobufList();
        final agyc b = agyc.b;
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
                final ahbe c;
                if ((c = ahmo.c) == null) {
                    synchronized (ahmo.class) {
                        if (ahmo.c == null) {
                            ahmo.c = (ahbe)new agzb((agzi)ahmo.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahmo.a;
            }
            case 4: {
                return new agza((agzi)ahmo.a);
            }
            case 3: {
                return new ahmo();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahmo.a, "\u0001\u0003\u0000\u0001\u0003\u0006\u0003\u0000\u0001\u0003\u0003\u041b\u0005\u1409\u0002\u0006\u1409\u0000", new Object[] { "d", "b", ahmp.class, "f", "e" });
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
