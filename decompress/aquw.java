import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aquw extends ahcz implements aheo
{
    public static final aquw a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(aquw.class, a = new aquw());
    }
    
    private aquw() {
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aquw.d) == null) {
                    synchronized (aquw.class) {
                        if (aquw.d == null) {
                            aquw.d = (ahev)new ahcs((ahcz)aquw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aquw.a;
            }
            case 4: {
                return new ahcr((ahcz)aquw.a);
            }
            case 3: {
                return new aquw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aquw.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
