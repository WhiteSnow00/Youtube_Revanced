import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubu extends ahcz implements aheo
{
    public static final aubu a;
    private static volatile ahev d;
    public ahdh b;
    public ahdh c;
    
    static {
        ahcz.registerDefaultInstance(aubu.class, a = new aubu());
    }
    
    private aubu() {
        this.b = ahcz.emptyIntList();
        this.c = ahcz.emptyIntList();
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
                if ((d = aubu.d) == null) {
                    synchronized (aubu.class) {
                        if (aubu.d == null) {
                            aubu.d = (ahev)new ahcs((ahcz)aubu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aubu.a;
            }
            case 4: {
                return new ahcr((boolean[][][])null, (short[][][])null);
            }
            case 3: {
                return new aubu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aubu.a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001'\u0002'", new Object[] { "b", "c" });
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
