import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amfg extends agzi implements ahax
{
    public static final amfg a;
    private static volatile ahbe d;
    public int b;
    public ajsq c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)amfg.class, (agzi)(a = new amfg()));
    }
    
    private amfg() {
        this.e = 2;
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
                if ((d = amfg.d) == null) {
                    synchronized (amfg.class) {
                        if (amfg.d == null) {
                            amfg.d = (ahbe)new agzb((agzi)amfg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amfg.a;
            }
            case 4: {
                return new agza((agzi)amfg.a);
            }
            case 3: {
                return new amfg();
            }
            case 2: {
                return newMessageInfo((MessageLite)amfg.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
