import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahou extends ahcz implements aheo
{
    public static final ahou a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(ahou.class, a = new ahou());
    }
    
    private ahou() {
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
                if ((c = ahou.c) == null) {
                    synchronized (ahou.class) {
                        if (ahou.c == null) {
                            ahou.c = (ahev)new ahcs((ahcz)ahou.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahou.a;
            }
            case 4: {
                return new ahcr((ahcz)ahou.a);
            }
            case 3: {
                return new ahou();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahou.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100b\u0000", new Object[] { "d", "b" });
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
