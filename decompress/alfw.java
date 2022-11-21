import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alfw extends ahcz implements aheo
{
    public static final alfw a;
    private static volatile ahev e;
    public int b;
    public boolean c;
    public boolean d;
    
    static {
        ahcz.registerDefaultInstance(alfw.class, a = new alfw());
    }
    
    private alfw() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = alfw.e) == null) {
                    synchronized (alfw.class) {
                        if (alfw.e == null) {
                            alfw.e = (ahev)new ahcs((ahcz)alfw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alfw.a;
            }
            case 4: {
                return new ahcr((ahcz)alfw.a);
            }
            case 3: {
                return new alfw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alfw.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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
