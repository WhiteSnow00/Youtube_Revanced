import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alhz extends ahcz implements aheo
{
    public static final alhz a;
    private static volatile ahev h;
    public int b;
    public apry c;
    public String d;
    public String e;
    public alji f;
    public alhy g;
    
    static {
        ahcz.registerDefaultInstance(alhz.class, a = new alhz());
    }
    
    private alhz() {
        this.d = "";
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = alhz.h) == null) {
                    synchronized (alhz.class) {
                        if (alhz.h == null) {
                            alhz.h = (ahev)new ahcs((ahcz)alhz.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alhz.a;
            }
            case 4: {
                return new ahcr((ahcz)alhz.a);
            }
            case 3: {
                return new alhz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alhz.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1009\u0003\u0005\u1009\u0005", new Object[] { "b", "c", "d", "e", "f", "g" });
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
