import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqqc extends ahcz implements aheo
{
    public static final aqqc a;
    private static volatile ahev f;
    public int b;
    public int c;
    public Object d;
    public String e;
    
    static {
        ahcz.registerDefaultInstance(aqqc.class, a = new aqqc());
    }
    
    private aqqc() {
        this.c = 0;
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
                if ((f = aqqc.f) == null) {
                    synchronized (aqqc.class) {
                        if (aqqc.f == null) {
                            aqqc.f = (ahev)new ahcs((ahcz)aqqc.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqqc.a;
            }
            case 4: {
                return new ahcr((ahcz)aqqc.a);
            }
            case 3: {
                return new aqqc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqqc.a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u1008\u0002", new Object[] { "d", "c", "b", aqpv.class, aqpm.class, "e" });
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
