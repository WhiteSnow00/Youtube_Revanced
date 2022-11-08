import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apoh extends agzi implements ahax
{
    public static final apoh a;
    public static final agzg b;
    public static final agzg c;
    private static volatile ahbe d;
    
    static {
        agzi.registerDefaultInstance((Class)apoh.class, (agzi)(a = new apoh()));
        b = agzi.newSingularGeneratedExtension((MessageLite)apot.a, (Object)0, (MessageLite)null, (agzn)null, 162410900, ahcm.e, (Class)Integer.class);
        c = agzi.newSingularGeneratedExtension((MessageLite)apot.a, (Object)false, (MessageLite)null, (agzn)null, 162000138, ahcm.h, (Class)Boolean.class);
    }
    
    private apoh() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = apoh.d) == null) {
                    synchronized (apoh.class) {
                        if (apoh.d == null) {
                            apoh.d = (ahbe)new agzb((agzi)apoh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apoh.a;
            }
            case 4: {
                return new agza((agzi)apoh.a);
            }
            case 3: {
                return new apoh();
            }
            case 2: {
                return newMessageInfo((MessageLite)apoh.a, "\u0001\u0000", (Object[])null);
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
