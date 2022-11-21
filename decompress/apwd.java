import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apwd extends ahcz implements aheo
{
    public static final apwd a;
    private static volatile ahev c;
    public String b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(apwd.class, a = new apwd());
    }
    
    private apwd() {
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
                if ((c = apwd.c) == null) {
                    synchronized (apwd.class) {
                        if (apwd.c == null) {
                            apwd.c = (ahev)new ahcs((ahcz)apwd.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apwd.a;
            }
            case 4: {
                return new ahcr((ahcz)apwd.a);
            }
            case 3: {
                return new apwd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apwd.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
