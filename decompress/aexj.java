import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexj extends ahcz implements aheo
{
    public static final aexj a;
    private static volatile ahev f;
    public int b;
    public aexl c;
    public ahdp d;
    public aexs e;
    
    static {
        ahcz.registerDefaultInstance(aexj.class, a = new aexj());
    }
    
    private aexj() {
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
                final ahev f;
                if ((f = aexj.f) == null) {
                    synchronized (aexj.class) {
                        if (aexj.f == null) {
                            aexj.f = (ahev)new ahcs((ahcz)aexj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aexj.a;
            }
            case 4: {
                return new ahcr((ahcz)aexj.a);
            }
            case 3: {
                return new aexj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aexj.a, "\u0000\u0004\u0000\u0000\u0001\u0007\u0004\u0000\u0001\u0000\u0001\t\u0002\u001b\u0004\f\u0007\t", new Object[] { "c", "d", aext.class, "b", "e" });
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
