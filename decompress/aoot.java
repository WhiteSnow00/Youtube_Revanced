import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoot extends ahcz implements aheo
{
    public static final aoot a;
    private static volatile ahev e;
    public String b;
    public long c;
    public ahdp d;
    private int f;
    
    static {
        ahcz.registerDefaultInstance(aoot.class, a = new aoot());
    }
    
    private aoot() {
        this.b = "";
        this.d = ahcz.emptyProtobufList();
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
                if ((e = aoot.e) == null) {
                    synchronized (aoot.class) {
                        if (aoot.e == null) {
                            aoot.e = (ahev)new ahcs((ahcz)aoot.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aoot.a;
            }
            case 4: {
                return new ahcr((ahcz)aoot.a);
            }
            case 3: {
                return new aoot();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoot.a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002\u1002\u0001\u0003\u1008\u0000\u0004\u001a", new Object[] { "f", "c", "b", "d" });
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
