import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amsh extends agzi implements ahax
{
    public static final amsh a;
    private static volatile ahbe h;
    public int b;
    public int c;
    public String d;
    public amsf e;
    public agzy f;
    public agzy g;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(amsh.class, a = new amsh());
    }
    
    private amsh() {
        this.i = 2;
        this.d = "";
        this.f = agzi.emptyProtobufList();
        this.g = agzi.emptyProtobufList();
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
                final ahbe h;
                if ((h = amsh.h) == null) {
                    synchronized (amsh.class) {
                        if (amsh.h == null) {
                            amsh.h = (ahbe)new agzb((agzi)amsh.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return amsh.a;
            }
            case 4: {
                return new agza((byte[][][])null, (boolean[])null);
            }
            case 3: {
                return new amsh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amsh.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0003\u0001\u100c\u0000\u0002\u1008\u0001\u0003\u1409\u0002\u0004\u041b\u0005\u041b", new Object[] { "b", "c", amsc.h, "d", "e", "f", amsh.class, "g", amsh.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
