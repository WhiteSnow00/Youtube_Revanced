import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amfv extends agzi implements ahax
{
    public static final amfv a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)amfv.class, (agzi)(a = new amfv()));
    }
    
    private amfv() {
        this.b = 0;
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
                if ((d = amfv.d) == null) {
                    synchronized (amfv.class) {
                        if (amfv.d == null) {
                            amfv.d = (ahbe)new agzb((agzi)amfv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amfv.a;
            }
            case 4: {
                return new agza((agzi)amfv.a);
            }
            case 3: {
                return new amfv();
            }
            case 2: {
                return newMessageInfo((MessageLite)amfv.a, "\u0001\u0005\u0001\u0000\uf716\u21ff\uf3ee\u92fd\u0005\u0000\u0000\u0005\uf716\u21ff\u143c\u0000\uec16\u3230\u143c\u0000\ueb3c\u5208\u143c\u0000\ufc61\u6243\u143c\u0000\uf3ee\u92fd\u143c\u0000", new Object[] { "c", "b", amfu.class, amfw.class, amft.class, amfy.class, amfr.class });
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
