import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class andu extends agzi implements ahax
{
    public static final andu a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(andu.class, a = new andu());
    }
    
    private andu() {
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
                final ahbe b2;
                if ((b2 = andu.b) == null) {
                    synchronized (andu.class) {
                        if (andu.b == null) {
                            andu.b = (ahbe)new agzb((agzi)andu.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return andu.a;
            }
            case 4: {
                return new agza((agzi)andu.a);
            }
            case 3: {
                return new andu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)andu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
