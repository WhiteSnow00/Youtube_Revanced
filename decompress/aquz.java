import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aquz extends ahcz implements aheo
{
    public static final aquz a;
    private static volatile ahev d;
    public int b;
    public boolean c;
    
    static {
        ahcz.registerDefaultInstance(aquz.class, a = new aquz());
    }
    
    private aquz() {
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
                if ((d = aquz.d) == null) {
                    synchronized (aquz.class) {
                        if (aquz.d == null) {
                            aquz.d = (ahev)new ahcs((ahcz)aquz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aquz.a;
            }
            case 4: {
                return new ahcr((ahcz)aquz.a);
            }
            case 3: {
                return new aquz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aquz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
