import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apvo extends ahcz implements aheo
{
    public static final apvo a;
    private static volatile ahev i;
    public int b;
    public int c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public boolean h;
    
    static {
        ahcz.registerDefaultInstance(apvo.class, a = new apvo());
    }
    
    private apvo() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = apvo.i) == null) {
                    synchronized (apvo.class) {
                        if (apvo.i == null) {
                            apvo.i = (ahev)new ahcs((ahcz)apvo.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return apvo.a;
            }
            case 4: {
                return new ahcr((ahcz)apvo.a);
            }
            case 3: {
                return new apvo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apvo.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\u1007\u0001\u0003\u1004\u0004\u0004\u1004\u0005\u0005\u1004\u0000\u0006\u1002\u0003\u0007\u1007\u0006", new Object[] { "b", "d", "f", "g", "c", "e", "h" });
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
