import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anty extends ahcz implements aheo
{
    public static final anty a;
    public static final ahcx b;
    private static volatile ahev e;
    public long c;
    public int d;
    private int f;
    
    static {
        final anty a2 = new anty();
        ahcz.registerDefaultInstance(anty.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aisc.a, a2, (MessageLite)a2, null, 191776071, ahgc.k, anty.class);
    }
    
    private anty() {
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
                if ((e = anty.e) == null) {
                    synchronized (anty.class) {
                        if (anty.e == null) {
                            anty.e = (ahev)new ahcs((ahcz)anty.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anty.a;
            }
            case 4: {
                return new ahcr((ahcz)anty.a);
            }
            case 3: {
                return new anty();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anty.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0003\u1004\u0002", new Object[] { "f", "c", "d" });
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
