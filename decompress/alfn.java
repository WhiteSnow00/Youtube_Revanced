import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alfn extends ahcz implements aheo
{
    public static final alfn a;
    private static volatile ahev d;
    public int b;
    public ancw c;
    
    static {
        ahcz.registerDefaultInstance(alfn.class, a = new alfn());
    }
    
    private alfn() {
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
                if ((d = alfn.d) == null) {
                    synchronized (alfn.class) {
                        if (alfn.d == null) {
                            alfn.d = (ahev)new ahcs((ahcz)alfn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alfn.a;
            }
            case 4: {
                return new ahcr((ahcz)alfn.a);
            }
            case 3: {
                return new alfn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alfn.a, "\u0001\u0001\u0000\u0001\ueb3e\u3e20\ueb3e\u3e20\u0001\u0000\u0000\u0000\ueb3e\u3e20\u1009\u0000", new Object[] { "b", "c" });
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
