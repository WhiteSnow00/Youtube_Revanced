import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aigq extends ahcz implements aheo
{
    public static final aigq a;
    private static volatile ahev h;
    public int b;
    public int c;
    public Object d;
    public aowb e;
    public int f;
    public int g;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(aigq.class, a = new aigq());
    }
    
    private aigq() {
        this.c = 0;
        this.i = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = aigq.h) == null) {
                    synchronized (aigq.class) {
                        if (aigq.h == null) {
                            aigq.h = (ahev)new ahcs((ahcz)aigq.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aigq.a;
            }
            case 4: {
                return new ahcr((ahcz)aigq.a);
            }
            case 3: {
                return new aigq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aigq.a, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001\u143c\u0000\u0002\u1409\u0002\u0004\u1004\u0004\u0005\u1004\u0005\u0006\u143c\u0000", new Object[] { "d", "c", "b", aowb.class, "e", "f", "g", aigm.class });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
