import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alow extends ahcz implements aheo
{
    public static final alow a;
    private static volatile ahev f;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    
    static {
        ahcz.registerDefaultInstance(alow.class, a = new alow());
    }
    
    private alow() {
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
                if ((f = alow.f) == null) {
                    synchronized (alow.class) {
                        if (alow.f == null) {
                            alow.f = (ahev)new ahcs((ahcz)alow.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alow.a;
            }
            case 4: {
                return new ahcr((ahcz)alow.a);
            }
            case 3: {
                return new alow();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alow.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1007\u0001\u0003\u1007\u0002", new Object[] { "b", "c", apvm.f, "d", "e" });
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
