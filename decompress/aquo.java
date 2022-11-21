import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aquo extends ahcz implements aheo
{
    public static final aquo a;
    private static volatile ahev d;
    public int b;
    public boolean c;
    
    static {
        ahcz.registerDefaultInstance(aquo.class, a = new aquo());
    }
    
    private aquo() {
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
                if ((d = aquo.d) == null) {
                    synchronized (aquo.class) {
                        if (aquo.d == null) {
                            aquo.d = (ahev)new ahcs((ahcz)aquo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aquo.a;
            }
            case 4: {
                return new ahcr((ahcz)aquo.a);
            }
            case 3: {
                return new aquo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aquo.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
