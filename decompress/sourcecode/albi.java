import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albi extends agzi implements ahax
{
    public static final albi a;
    private static volatile ahbe d;
    public int b;
    public akjd c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)albi.class, (agzi)(a = new albi()));
    }
    
    private albi() {
        this.e = 2;
        agzi.emptyProtobufList();
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
                if ((d = albi.d) == null) {
                    synchronized (albi.class) {
                        if (albi.d == null) {
                            albi.d = (ahbe)new agzb((agzi)albi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return albi.a;
            }
            case 4: {
                return new agza((agzi)albi.a);
            }
            case 3: {
                return new albi();
            }
            case 2: {
                return newMessageInfo((MessageLite)albi.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
