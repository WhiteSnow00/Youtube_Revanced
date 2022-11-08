import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amht extends agzi implements ahax
{
    public static final amht a;
    private static volatile ahbe d;
    public agzy b;
    public int c;
    private int e;
    private ajsq f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)amht.class, (agzi)(a = new amht()));
    }
    
    private amht() {
        this.g = 2;
        this.b = emptyProtobufList();
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
                if ((d = amht.d) == null) {
                    synchronized (amht.class) {
                        if (amht.d == null) {
                            amht.d = (ahbe)new agzb((agzi)amht.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amht.a;
            }
            case 4: {
                return new agza((agzi)amht.a);
            }
            case 3: {
                return new amht();
            }
            case 2: {
                return newMessageInfo((MessageLite)amht.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001\u041b\u0002\u1409\u0000\u0003\u100c\u0001", new Object[] { "e", "b", amhs.class, "f", "c", amcq.q });
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
