import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqqx extends ahcz implements aheo
{
    public static final aqqx a;
    private static volatile ahev e;
    public long b;
    public ahdp c;
    public String d;
    private int f;
    
    static {
        ahcz.registerDefaultInstance(aqqx.class, a = new aqqx());
    }
    
    private aqqx() {
        this.c = ahcz.emptyProtobufList();
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
                final ahev e;
                if ((e = aqqx.e) == null) {
                    synchronized (aqqx.class) {
                        if (aqqx.e == null) {
                            aqqx.e = (ahev)new ahcs((ahcz)aqqx.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqqx.a;
            }
            case 4: {
                return new ahcr((ahcz)aqqx.a);
            }
            case 3: {
                return new aqqx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqqx.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1002\u0000\u0002\u001a\u0003\u1008\u0001", new Object[] { "f", "b", "c", "d" });
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
