import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class antw extends ahcz implements aheo
{
    public static final antw a;
    private static volatile ahev c;
    public int b;
    private int d;
    private ajws e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(antw.class, a = new antw());
    }
    
    private antw() {
        this.f = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = antw.c) == null) {
                    synchronized (antw.class) {
                        if (antw.c == null) {
                            antw.c = (ahev)new ahcs((ahcz)antw.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return antw.a;
            }
            case 4: {
                return new ahcr((ahcz)antw.a);
            }
            case 3: {
                return new antw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)antw.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1004\u0000\u0002\u1409\u0001", new Object[] { "d", "b", "e" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
