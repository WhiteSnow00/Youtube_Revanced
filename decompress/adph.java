import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adph extends ahcz implements aheo
{
    public static final adph a;
    private static volatile ahev e;
    public int b;
    public String c;
    public adpg d;
    
    static {
        ahcz.registerDefaultInstance(adph.class, a = new adph());
    }
    
    private adph() {
        this.c = "";
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
                if ((e = adph.e) == null) {
                    synchronized (adph.class) {
                        if (adph.e == null) {
                            adph.e = (ahev)new ahcs((ahcz)adph.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return adph.a;
            }
            case 4: {
                return new ahcr((ahcz)adph.a);
            }
            case 3: {
                return new adph();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)adph.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1008\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d" });
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
