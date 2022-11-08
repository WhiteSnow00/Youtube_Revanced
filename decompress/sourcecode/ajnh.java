import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajnh extends agzi implements ahax
{
    public static final ajnh a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)ajnh.class, (agzi)(a = new ajnh()));
    }
    
    private ajnh() {
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
                if ((d = ajnh.d) == null) {
                    synchronized (ajnh.class) {
                        if (ajnh.d == null) {
                            ajnh.d = (ahbe)new agzb((agzi)ajnh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajnh.a;
            }
            case 4: {
                return new agza((agzi)ajnh.a);
            }
            case 3: {
                return new ajnh();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajnh.a, "\u0001\u0001\u0001\u0000\ufaea\u4220\ufaea\u4220\u0001\u0000\u0000\u0001\ufaea\u4220\u143c\u0000", new Object[] { "c", "b", ajnl.class });
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
