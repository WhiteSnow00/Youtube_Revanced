import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtc extends ahcz implements aheo
{
    public static final agtc a;
    private static volatile ahev f;
    public int b;
    public int c;
    public int d;
    public String e;
    private ahej g;
    
    static {
        ahcz.registerDefaultInstance(agtc.class, a = new agtc());
    }
    
    private agtc() {
        this.g = ahej.a;
        this.e = "";
        emptyProtobufList();
        emptyProtobufList();
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
                if ((f = agtc.f) == null) {
                    synchronized (agtc.class) {
                        if (agtc.f == null) {
                            agtc.f = (ahev)new ahcs((ahcz)agtc.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agtc.a;
            }
            case 4: {
                return new ahcr((ahcz)agtc.a);
            }
            case 3: {
                return new agtc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agtc.a, "\u0001\u0004\u0000\u0001\u0006\u0010\u0004\u0001\u0000\u0000\u0006\u1004\u0005\u0007\u1004\u0006\b2\u0010\u1008\u000e", new Object[] { "b", "c", "d", "g", agtb.a, "e" });
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
