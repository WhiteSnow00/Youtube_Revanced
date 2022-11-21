import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amod extends ahcz implements aheo
{
    public static final amod a;
    public static final ahcx b;
    private static volatile ahev d;
    public String c;
    private int e;
    
    static {
        final amod a2 = new amod();
        ahcz.registerDefaultInstance(amod.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqkf.a, a2, (MessageLite)a2, null, 471576040, ahgc.k, amod.class);
    }
    
    private amod() {
        this.c = "";
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
                if ((d = amod.d) == null) {
                    synchronized (amod.class) {
                        if (amod.d == null) {
                            amod.d = (ahev)new ahcs((ahcz)amod.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amod.a;
            }
            case 4: {
                return new ahcr((ahcz)amod.a);
            }
            case 3: {
                return new amod();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amod.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0000", new Object[] { "e", "c" });
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
