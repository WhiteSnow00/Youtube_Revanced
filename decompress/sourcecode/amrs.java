import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amrs extends agzi implements ahax
{
    public static final amrs a;
    private static volatile ahbe d;
    public int b;
    public String c;
    private amrt e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(amrs.class, a = new amrs());
    }
    
    private amrs() {
        this.f = 2;
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
                final ahbe d;
                if ((d = amrs.d) == null) {
                    synchronized (amrs.class) {
                        if (amrs.d == null) {
                            amrs.d = (ahbe)new agzb((agzi)amrs.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amrs.a;
            }
            case 4: {
                return new agza((agzi)amrs.a);
            }
            case 3: {
                return new amrs();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amrs.a, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0001\u0002\u1008\u0001\u0004\u1409\u0003", new Object[] { "b", "c", "e" });
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
