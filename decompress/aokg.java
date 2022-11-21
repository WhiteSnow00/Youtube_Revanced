import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aokg extends ahcz implements aheo
{
    public static final aokg a;
    public static final ahcx b;
    public static final ahcx c;
    private static volatile ahev d;
    
    static {
        ahcz.registerDefaultInstance(aokg.class, a = new aokg());
        final aoko a2 = aoko.a;
        final Boolean value = false;
        b = ahcz.newSingularGeneratedExtension((MessageLite)a2, value, null, null, 128093714, ahgc.h, Boolean.class);
        c = ahcz.newSingularGeneratedExtension((MessageLite)aoko.a, value, null, null, 127992852, ahgc.h, Boolean.class);
    }
    
    private aokg() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aokg.d) == null) {
                    synchronized (aokg.class) {
                        if (aokg.d == null) {
                            aokg.d = (ahev)new ahcs((ahcz)aokg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aokg.a;
            }
            case 4: {
                return new ahcr((ahcz)aokg.a);
            }
            case 3: {
                return new aokg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aokg.a, "\u0001\u0000", null);
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
