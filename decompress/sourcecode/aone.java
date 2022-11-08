import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aone extends agzi implements ahax
{
    public static final aone a;
    private static volatile ahbe d;
    public int b;
    public aond c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aone.class, (agzi)(a = new aone()));
    }
    
    private aone() {
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
                if ((d = aone.d) == null) {
                    synchronized (aone.class) {
                        if (aone.d == null) {
                            aone.d = (ahbe)new agzb((agzi)aone.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aone.a;
            }
            case 4: {
                return new agza((agzi)aone.a);
            }
            case 3: {
                return new aone();
            }
            case 2: {
                return newMessageInfo((MessageLite)aone.a, "\u0001\u0001\u0000\u0001\ued68\u359c\ued68\u359c\u0001\u0000\u0000\u0001\ued68\u359c\u1409\u0000", new Object[] { "b", "c" });
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
