import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyu extends ahcz implements aheo
{
    public static final apyu a;
    private static volatile ahev d;
    public int b;
    public ahbt c;
    
    static {
        ahcz.registerDefaultInstance(apyu.class, a = new apyu());
    }
    
    private apyu() {
        this.c = ahbt.b;
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
                if ((d = apyu.d) == null) {
                    synchronized (apyu.class) {
                        if (apyu.d == null) {
                            apyu.d = (ahev)new ahcs((ahcz)apyu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apyu.a;
            }
            case 4: {
                return new ahcr((ahcz)apyu.a);
            }
            case 3: {
                return new apyu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apyu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "b", "c" });
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
