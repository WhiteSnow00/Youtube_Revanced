import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzu extends ahcz implements aheo
{
    public static final akzu a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(akzu.class, a = new akzu());
    }
    
    private akzu() {
        emptyIntList();
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
                if ((c = akzu.c) == null) {
                    synchronized (akzu.class) {
                        if (akzu.c == null) {
                            akzu.c = (ahev)new ahcs((ahcz)akzu.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akzu.a;
            }
            case 4: {
                return new ahcr((ahcz)akzu.a);
            }
            case 3: {
                return new akzu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akzu.a, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006\u100c\u0003", new Object[] { "d", "b", anki.a() });
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
