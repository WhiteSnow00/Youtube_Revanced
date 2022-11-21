import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubn extends ahcz implements aheo
{
    public static final aubn a;
    private static volatile ahev e;
    public int b;
    public ahdp c;
    public aubm d;
    
    static {
        ahcz.registerDefaultInstance(aubn.class, a = new aubn());
    }
    
    private aubn() {
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
                if ((e = aubn.e) == null) {
                    synchronized (aubn.class) {
                        if (aubn.e == null) {
                            aubn.e = (ahev)new ahcs((ahcz)aubn.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aubn.a;
            }
            case 4: {
                return new ahcr((boolean[][][])null, (byte[][])null);
            }
            case 3: {
                return new aubn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aubn.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002\u1009\u0000", new Object[] { "b", "c", "d" });
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
