import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojw extends ahcz implements aheo
{
    public static final aojw a;
    public static final ahcx b;
    private static volatile ahev c;
    
    static {
        ahcz.registerDefaultInstance(aojw.class, a = new aojw());
        b = ahcz.newSingularGeneratedExtension((MessageLite)ahpm.a, false, null, null, 120958174, ahgc.h, Boolean.class);
    }
    
    private aojw() {
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
                if ((c = aojw.c) == null) {
                    synchronized (aojw.class) {
                        if (aojw.c == null) {
                            aojw.c = (ahev)new ahcs((ahcz)aojw.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aojw.a;
            }
            case 4: {
                return new ahcr((ahcz)aojw.a);
            }
            case 3: {
                return new aojw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aojw.a, "\u0001\u0000", null);
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
