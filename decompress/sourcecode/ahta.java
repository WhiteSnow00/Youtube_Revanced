import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahta extends agzi implements ahax
{
    public static final ahta a;
    public static final agzg b;
    private static volatile ahbe c;
    
    static {
        agzi.registerDefaultInstance(ahta.class, a = new ahta());
        b = agzi.newSingularGeneratedExtension((MessageLite)ahlw.a, false, null, null, 120958174, ahcm.h, Boolean.class);
    }
    
    private ahta() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ahta.c) == null) {
                    synchronized (ahta.class) {
                        if (ahta.c == null) {
                            ahta.c = (ahbe)new agzb((agzi)ahta.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahta.a;
            }
            case 4: {
                return new agza((agzi)ahta.a);
            }
            case 3: {
                return new ahta();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahta.a, "\u0001\u0000", null);
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
