import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidf extends agzi implements ahax
{
    public static final aidf a;
    public static final agzg b;
    public static final agzg c;
    public static final agzg d;
    private static volatile ahbe e;
    
    static {
        agzi.registerDefaultInstance((Class)aidf.class, (agzi)(a = new aidf()));
        b = agzi.newSingularGeneratedExtension((MessageLite)aidh.a, (Object)aidi.a, (MessageLite)aidi.a, (agzn)null, 146730964, ahcm.k, (Class)aidi.class);
        c = agzi.newSingularGeneratedExtension((MessageLite)aidh.a, (Object)false, (MessageLite)null, (agzn)null, 147492108, ahcm.h, (Class)Boolean.class);
        d = agzi.newRepeatedGeneratedExtension((MessageLite)aidh.a, (MessageLite)aidi.a, (agzn)null, 154861719, ahcm.k, false, (Class)aidi.class);
    }
    
    private aidf() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = aidf.e) == null) {
                    synchronized (aidf.class) {
                        if (aidf.e == null) {
                            aidf.e = (ahbe)new agzb((agzi)aidf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aidf.a;
            }
            case 4: {
                return new agza((agzi)aidf.a);
            }
            case 3: {
                return new aidf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aidf.a, "\u0001\u0000", (Object[])null);
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
