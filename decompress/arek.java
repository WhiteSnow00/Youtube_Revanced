import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arek extends ahcz implements aheo
{
    public static final arek a;
    private static volatile ahev e;
    public int b;
    public String c;
    public aree d;
    
    static {
        ahcz.registerDefaultInstance(arek.class, a = new arek());
    }
    
    private arek() {
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
                if ((e = arek.e) == null) {
                    synchronized (arek.class) {
                        if (arek.e == null) {
                            arek.e = (ahev)new ahcs((ahcz)arek.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return arek.a;
            }
            case 4: {
                return new ahcr((ahcz)arek.a);
            }
            case 3: {
                return new arek();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arek.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
