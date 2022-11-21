import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alel extends ahcz implements aheo
{
    public static final alel a;
    private static volatile ahev d;
    public int b;
    public boolean c;
    
    static {
        ahcz.registerDefaultInstance(alel.class, a = new alel());
    }
    
    private alel() {
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
                if ((d = alel.d) == null) {
                    synchronized (alel.class) {
                        if (alel.d == null) {
                            alel.d = (ahev)new ahcs((ahcz)alel.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alel.a;
            }
            case 4: {
                return new ahcr((ahcz)alel.a);
            }
            case 3: {
                return new alel();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alel.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
