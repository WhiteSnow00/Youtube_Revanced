import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqun extends ahcz implements aheo
{
    public static final aqun a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(aqun.class, a = new aqun());
    }
    
    private aqun() {
        this.b = 0;
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
                if ((d = aqun.d) == null) {
                    synchronized (aqun.class) {
                        if (aqun.d == null) {
                            aqun.d = (ahev)new ahcs((ahcz)aqun.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqun.a;
            }
            case 4: {
                return new ahcr((ahcz)aqun.a);
            }
            case 3: {
                return new aqun();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqun.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000", new Object[] { "c", "b", ahcf.class, aqul.class });
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
