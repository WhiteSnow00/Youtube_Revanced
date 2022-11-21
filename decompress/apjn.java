import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjn extends ahcz implements aheo
{
    public static final apjn a;
    private static volatile ahev f;
    public int b;
    public int c;
    public int d;
    public boolean e;
    
    static {
        ahcz.registerDefaultInstance(apjn.class, a = new apjn());
    }
    
    private apjn() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = apjn.f) == null) {
                    synchronized (apjn.class) {
                        if (apjn.f == null) {
                            apjn.f = (ahev)new ahcs((ahcz)apjn.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apjn.a;
            }
            case 4: {
                return new ahcr((ahcz)apjn.a);
            }
            case 3: {
                return new apjn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apjn.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u1007\u0002", new Object[] { "b", "c", apke.a(), "d", apkc.c, "e" });
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
