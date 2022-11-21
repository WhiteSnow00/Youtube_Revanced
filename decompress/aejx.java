import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aejx extends ahcz implements aheo
{
    public static final aejx a;
    private static volatile ahev f;
    public int b;
    public aejv c;
    public String d;
    public boolean e;
    
    static {
        ahcz.registerDefaultInstance(aejx.class, a = new aejx());
    }
    
    private aejx() {
        this.d = "";
        ahcz.emptyProtobufList();
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
                if ((f = aejx.f) == null) {
                    synchronized (aejx.class) {
                        if (aejx.f == null) {
                            aejx.f = (ahev)new ahcs((ahcz)aejx.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aejx.a;
            }
            case 4: {
                return new ahcr((ahcz)aejx.a);
            }
            case 3: {
                return new aejx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aejx.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001\u0003\u1007\u0002", new Object[] { "b", "c", "d", "e" });
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
