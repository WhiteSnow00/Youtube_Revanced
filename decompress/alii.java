import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alii extends ahcz implements aheo
{
    public static final alii a;
    private static volatile ahev e;
    public int b;
    public boolean c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(alii.class, a = new alii());
    }
    
    private alii() {
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
                if ((e = alii.e) == null) {
                    synchronized (alii.class) {
                        if (alii.e == null) {
                            alii.e = (ahev)new ahcs((ahcz)alii.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alii.a;
            }
            case 4: {
                return new ahcr((ahcz)alii.a);
            }
            case 3: {
                return new alii();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alii.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", ainb.a() });
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
