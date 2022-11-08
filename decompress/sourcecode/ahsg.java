import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahsg extends agzi implements ahax
{
    public static final ahsg a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ahsg.class, a = new ahsg());
    }
    
    private ahsg() {
        this.b = 0;
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
                if ((d = ahsg.d) == null) {
                    synchronized (ahsg.class) {
                        if (ahsg.d == null) {
                            ahsg.d = (ahbe)new agzb((agzi)ahsg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahsg.a;
            }
            case 4: {
                return new agza((agzi)ahsg.a);
            }
            case 3: {
                return new ahsg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahsg.a, "\u0001\u0002\u0001\u0000\uf076\u1798\ufdab\u17fa\u0002\u0000\u0000\u0001\uf076\u1798\u143c\u0000\ufdab\u17fa\u103c\u0000", new Object[] { "c", "b", ahsk.class, ahsl.class });
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
