import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjm extends ahcz implements aheo
{
    public static final apjm a;
    private static volatile ahev d;
    public int b;
    public int c;
    
    static {
        ahcz.registerDefaultInstance(apjm.class, a = new apjm());
    }
    
    private apjm() {
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
                if ((d = apjm.d) == null) {
                    synchronized (apjm.class) {
                        if (apjm.d == null) {
                            apjm.d = (ahev)new ahcs((ahcz)apjm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apjm.a;
            }
            case 4: {
                return new ahcr((ahcz)apjm.a);
            }
            case 3: {
                return new apjm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apjm.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", apkb.a() });
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
