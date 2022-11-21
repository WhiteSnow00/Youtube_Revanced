import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoic extends ahcz implements aheo
{
    public static final aoic a;
    public static final ahcx b;
    private static volatile ahev c;
    
    static {
        final aoic a2 = new aoic();
        ahcz.registerDefaultInstance(aoic.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aisc.a, a2, (MessageLite)a2, null, 448353930, ahgc.k, aoic.class);
    }
    
    private aoic() {
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
                if ((c = aoic.c) == null) {
                    synchronized (aoic.class) {
                        if (aoic.c == null) {
                            aoic.c = (ahev)new ahcs((ahcz)aoic.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aoic.a;
            }
            case 4: {
                return new ahcr((ahcz)aoic.a);
            }
            case 3: {
                return new aoic();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoic.a, "\u0001\u0000", null);
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
