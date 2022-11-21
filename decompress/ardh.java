import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardh extends ahcz implements aheo
{
    public static final ardh a;
    private static volatile ahev f;
    public int b;
    public aras c;
    public String d;
    public ardi e;
    
    static {
        ahcz.registerDefaultInstance(ardh.class, a = new ardh());
    }
    
    private ardh() {
        this.d = "";
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
                if ((f = ardh.f) == null) {
                    synchronized (ardh.class) {
                        if (ardh.f == null) {
                            ardh.f = (ahev)new ahcs((ahcz)ardh.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ardh.a;
            }
            case 4: {
                return new ahcr((ahcz)ardh.a);
            }
            case 3: {
                return new ardh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ardh.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
