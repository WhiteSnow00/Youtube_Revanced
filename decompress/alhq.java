import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alhq extends ahcz implements aheo
{
    public static final alhq a;
    private static volatile ahev e;
    public int b;
    public String c;
    public String d;
    private ajws f;
    private aisc g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(alhq.class, a = new alhq());
    }
    
    private alhq() {
        this.h = 2;
        this.c = "";
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = alhq.e) == null) {
                    synchronized (alhq.class) {
                        if (alhq.e == null) {
                            alhq.e = (ahev)new ahcs((ahcz)alhq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alhq.a;
            }
            case 4: {
                return new ahcr((ahcz)alhq.a);
            }
            case 3: {
                return new alhq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alhq.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0005\u1409\u0004", new Object[] { "b", "f", "c", "d", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
