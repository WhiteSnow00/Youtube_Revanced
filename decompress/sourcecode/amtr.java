import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amtr extends agzi implements ahax
{
    public static final amtr a;
    private static volatile ahbe f;
    public int b;
    public akjd c;
    public agzy d;
    public long e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(amtr.class, a = new amtr());
    }
    
    private amtr() {
        this.g = 2;
        this.d = agzi.emptyProtobufList();
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
                if ((f = amtr.f) == null) {
                    synchronized (amtr.class) {
                        if (amtr.f == null) {
                            amtr.f = (ahbe)new agzb((agzi)amtr.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return amtr.a;
            }
            case 4: {
                return new agza((byte[][])null, (char[][])null);
            }
            case 3: {
                return new amtr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amtr.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u001b\u0003\u1002\u0001", new Object[] { "b", "c", "d", aplm.class, "e" });
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
