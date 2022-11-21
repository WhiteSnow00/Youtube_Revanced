import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqqm extends ahcz implements aheo
{
    public static final aqqm a;
    private static volatile ahev f;
    public int b;
    public int c;
    public int d;
    public String e;
    
    static {
        ahcz.registerDefaultInstance(aqqm.class, a = new aqqm());
    }
    
    private aqqm() {
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
                final ahev f;
                if ((f = aqqm.f) == null) {
                    synchronized (aqqm.class) {
                        if (aqqm.f == null) {
                            aqqm.f = (ahev)new ahcs((ahcz)aqqm.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqqm.a;
            }
            case 4: {
                return new ahcr((ahcz)aqqm.a);
            }
            case 3: {
                return new aqqm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqqm.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u100b\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
