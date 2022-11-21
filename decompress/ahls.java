import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahls extends ahcz implements aheo
{
    public static final ahls a;
    private static volatile ahev e;
    public int b;
    public ahbt c;
    public String d;
    
    static {
        ahcz.registerDefaultInstance(ahls.class, a = new ahls());
    }
    
    private ahls() {
        this.c = ahbt.b;
        this.d = "";
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
                if ((e = ahls.e) == null) {
                    synchronized (ahls.class) {
                        if (ahls.e == null) {
                            ahls.e = (ahev)new ahcs((ahcz)ahls.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahls.a;
            }
            case 4: {
                return new ahcr((ahcz)ahls.a);
            }
            case 3: {
                return new ahls();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahls.a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003\u100a\u0002\u0004\u1008\u0003", new Object[] { "b", "c", "d" });
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
