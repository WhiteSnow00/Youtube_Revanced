import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amuw extends agzi implements ahax
{
    public static final amuw a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public ajsq d;
    public ajsq e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(amuw.class, a = new amuw());
    }
    
    private amuw() {
        this.g = 2;
        this.c = "";
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
                if ((f = amuw.f) == null) {
                    synchronized (amuw.class) {
                        if (amuw.f == null) {
                            amuw.f = (ahbe)new agzb((agzi)amuw.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return amuw.a;
            }
            case 4: {
                return new agza((agzi)amuw.a);
            }
            case 3: {
                return new amuw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amuw.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "b", "c", "d", "e" });
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
