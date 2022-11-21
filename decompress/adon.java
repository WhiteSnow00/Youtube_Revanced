import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adon extends ahcz implements aheo
{
    public static final adon a;
    private static volatile ahev h;
    public int b;
    public String c;
    public String d;
    public int e;
    public ahdp f;
    public adol g;
    
    static {
        ahcz.registerDefaultInstance(adon.class, a = new adon());
    }
    
    private adon() {
        this.c = "";
        this.d = "";
        this.f = ahcz.emptyProtobufList();
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
                if ((h = adon.h) == null) {
                    synchronized (adon.class) {
                        if (adon.h == null) {
                            adon.h = (ahev)new ahcs((ahcz)adon.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return adon.a;
            }
            case 4: {
                return new ahcr((ahcz)adon.a);
            }
            case 3: {
                return new adon();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)adon.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u100c\u0002\u0004\u001a\u0005\u1009\u0003", new Object[] { "b", "c", "d", "e", adom.b(), "f", "g" });
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
