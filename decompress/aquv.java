import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aquv extends ahcz implements aheo
{
    public static final aquv a;
    private static volatile ahev c;
    public String b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aquv.class, a = new aquv());
    }
    
    private aquv() {
        this.b = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = aquv.c) == null) {
                    synchronized (aquv.class) {
                        if (aquv.c == null) {
                            aquv.c = (ahev)new ahcs((ahcz)aquv.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aquv.a;
            }
            case 4: {
                return new ahcr((ahcz)aquv.a);
            }
            case 3: {
                return new aquv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aquv.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "d", "b" });
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
