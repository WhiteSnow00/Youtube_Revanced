import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkq extends ahcz implements aheo
{
    public static final ahkq a;
    private static volatile ahev f;
    public int b;
    public String c;
    public boolean d;
    public ahkr e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(ahkq.class, a = new ahkq());
    }
    
    private ahkq() {
        this.g = 2;
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = ahkq.f) == null) {
                    synchronized (ahkq.class) {
                        if (ahkq.f == null) {
                            ahkq.f = (ahev)new ahcs((ahcz)ahkq.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahkq.a;
            }
            case 4: {
                return new ahcr((ahcz)ahkq.a);
            }
            case 3: {
                return new ahkq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahkq.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1409\u0003", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
