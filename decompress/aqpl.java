import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqpl extends ahcz implements aheo
{
    public static final aqpl a;
    private static volatile ahev f;
    public int b;
    public ahdc c;
    public ahdc d;
    public int e;
    
    static {
        ahcz.registerDefaultInstance(aqpl.class, a = new aqpl());
    }
    
    private aqpl() {
        emptyDoubleList();
        this.c = ahcz.emptyDoubleList();
        this.d = ahcz.emptyDoubleList();
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
                if ((f = aqpl.f) == null) {
                    synchronized (aqpl.class) {
                        if (aqpl.f == null) {
                            aqpl.f = (ahev)new ahcs((ahcz)aqpl.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqpl.a;
            }
            case 4: {
                return new ahcr((ahcz)aqpl.a);
            }
            case 3: {
                return new aqpl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqpl.a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0002\u0000\u0002\u0012\u0003\u0012\u0004\u100b\u0000", new Object[] { "b", "c", "d", "e" });
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
