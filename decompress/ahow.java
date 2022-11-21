import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahow extends ahcz implements aheo
{
    public static final ahow a;
    private static volatile ahev e;
    public String b;
    public int c;
    public int d;
    private int f;
    
    static {
        ahcz.registerDefaultInstance(ahow.class, a = new ahow());
    }
    
    private ahow() {
        this.b = "";
        this.d = 1;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = ahow.e) == null) {
                    synchronized (ahow.class) {
                        if (ahow.e == null) {
                            ahow.e = (ahev)new ahcs((ahcz)ahow.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahow.a;
            }
            case 4: {
                return new ahcr((ahcz)ahow.a);
            }
            case 3: {
                return new ahow();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahow.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1004\u0002", new Object[] { "f", "b", "c", ahqw.a(), "d" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
