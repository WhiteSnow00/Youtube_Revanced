import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhy extends ahcz implements aheo
{
    public static final aqhy a;
    public static final ahcx b;
    private static volatile ahev e;
    public ahdp c;
    public int d;
    private int f;
    
    static {
        final aqhy a2 = new aqhy();
        ahcz.registerDefaultInstance(aqhy.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqhw.a, a2, (MessageLite)a2, null, 188490103, ahgc.k, aqhy.class);
    }
    
    private aqhy() {
        this.c = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = aqhy.e) == null) {
                    synchronized (aqhy.class) {
                        if (aqhy.e == null) {
                            aqhy.e = (ahev)new ahcs((ahcz)aqhy.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqhy.a;
            }
            case 4: {
                return new ahcr((ahcz)aqhy.a);
            }
            case 3: {
                return new aqhy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqhy.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1004\u0000", new Object[] { "f", "c", aqhz.class, "d" });
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
