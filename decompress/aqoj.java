import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqoj extends ahcz implements aheo
{
    public static final aqoj a;
    private static volatile ahev f;
    public int b;
    public String c;
    public String d;
    public long e;
    
    static {
        ahcz.registerDefaultInstance(aqoj.class, a = new aqoj());
    }
    
    private aqoj() {
        this.c = "";
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
                if ((f = aqoj.f) == null) {
                    synchronized (aqoj.class) {
                        if (aqoj.f == null) {
                            aqoj.f = (ahev)new ahcs((ahcz)aqoj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqoj.a;
            }
            case 4: {
                return new ahcr((ahcz)aqoj.a);
            }
            case 3: {
                return new aqoj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqoj.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1002\u0002", new Object[] { "b", "c", "d", "e" });
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
