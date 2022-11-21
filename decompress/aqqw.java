import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqqw extends ahcz implements aheo
{
    public static final aqqw a;
    private static volatile ahev f;
    public long b;
    public long c;
    public ahdp d;
    public String e;
    private int g;
    
    static {
        ahcz.registerDefaultInstance(aqqw.class, a = new aqqw());
    }
    
    private aqqw() {
        this.d = ahcz.emptyProtobufList();
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
                if ((f = aqqw.f) == null) {
                    synchronized (aqqw.class) {
                        if (aqqw.f == null) {
                            aqqw.f = (ahev)new ahcs((ahcz)aqqw.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqqw.a;
            }
            case 4: {
                return new ahcr((ahcz)aqqw.a);
            }
            case 3: {
                return new aqqw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqqw.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u001a\u0004\u1008\u0002", new Object[] { "g", "b", "c", "d", "e" });
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
