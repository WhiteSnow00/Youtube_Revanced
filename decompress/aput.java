import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aput extends ahcz implements aheo
{
    public static final aput a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aput.class, a = new aput());
    }
    
    private aput() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = aput.c) == null) {
                    synchronized (aput.class) {
                        if (aput.c == null) {
                            aput.c = (ahev)new ahcs((ahcz)aput.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aput.a;
            }
            case 4: {
                return new ahcr((ahcz)aput.a);
            }
            case 3: {
                return new aput();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aput.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aitw.m });
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
