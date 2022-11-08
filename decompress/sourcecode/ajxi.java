import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxi extends agzi implements ahax
{
    public static final ajxi a;
    private static volatile ahbe d;
    public int b;
    public anom c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ajxi.class, a = new ajxi());
    }
    
    private ajxi() {
        this.e = 2;
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
                if ((d = ajxi.d) == null) {
                    synchronized (ajxi.class) {
                        if (ajxi.d == null) {
                            ajxi.d = (ahbe)new agzb((agzi)ajxi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajxi.a;
            }
            case 4: {
                return new agza((agzi)ajxi.a);
            }
            case 3: {
                return new ajxi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajxi.a, "\u0001\u0001\u0000\u0001\uff43\u1dfd\uff43\u1dfd\u0001\u0000\u0000\u0001\uff43\u1dfd\u1409\u0000", new Object[] { "b", "c" });
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
