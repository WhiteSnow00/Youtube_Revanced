import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajna extends agzi implements ahax
{
    public static final ajna a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)ajna.class, (agzi)(a = new ajna()));
    }
    
    private ajna() {
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
                if ((d = ajna.d) == null) {
                    synchronized (ajna.class) {
                        if (ajna.d == null) {
                            ajna.d = (ahbe)new agzb((agzi)ajna.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajna.a;
            }
            case 4: {
                return new agza((agzi)ajna.a);
            }
            case 3: {
                return new ajna();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajna.a, "\u0001\u0003\u0001\u0000\ue856\u32b0\ufa8e\u47bb\u0003\u0000\u0000\u0001\ue856\u32b0\u143c\u0000\uffbc\u3321\u103c\u0000\ufa8e\u47bb\u103c\u0000", new Object[] { "c", "b", ajmz.class, ajnb.class, ajnc.class });
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
