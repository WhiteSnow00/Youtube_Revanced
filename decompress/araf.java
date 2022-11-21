import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class araf extends ahcz implements aheo
{
    public static final araf a;
    private static volatile ahev f;
    public int b;
    public ahbt c;
    public int d;
    public int e;
    
    static {
        ahcz.registerDefaultInstance(araf.class, a = new araf());
    }
    
    private araf() {
        emptyProtobufList();
        this.c = ahbt.b;
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
                if ((f = araf.f) == null) {
                    synchronized (araf.class) {
                        if (araf.f == null) {
                            araf.f = (ahev)new ahcs((ahcz)araf.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return araf.a;
            }
            case 4: {
                return new ahcr((ahcz)araf.a);
            }
            case 3: {
                return new araf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)araf.a, "\u0001\u0003\u0000\u0001\u0004\n\u0003\u0000\u0000\u0000\u0004\u100a\u0002\u0007\u100b\u0005\n\u100b\b", new Object[] { "b", "c", "d", "e" });
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
