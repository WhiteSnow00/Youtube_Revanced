import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arak extends ahcz implements aheo
{
    public static final arak a;
    private static volatile ahev e;
    public int b;
    public String c;
    public String d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(arak.class, a = new arak());
    }
    
    private arak() {
        this.f = 2;
        this.c = "";
        this.d = "";
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
                final ahev e;
                if ((e = arak.e) == null) {
                    synchronized (arak.class) {
                        if (arak.e == null) {
                            arak.e = (ahev)new ahcs((ahcz)arak.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return arak.a;
            }
            case 4: {
                return new ahcr((ahcz)arak.a);
            }
            case 3: {
                return new arak();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arak.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1508\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
