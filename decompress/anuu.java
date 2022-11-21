import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anuu extends ahcz implements aheo
{
    public static final anuu a;
    public static final ahcx b;
    private static volatile ahev e;
    public String c;
    public long d;
    private int f;
    
    static {
        final anuu a2 = new anuu();
        ahcz.registerDefaultInstance(anuu.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aisc.a, a2, (MessageLite)a2, null, 408684665, ahgc.k, anuu.class);
    }
    
    private anuu() {
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
                final ahev e;
                if ((e = anuu.e) == null) {
                    synchronized (anuu.class) {
                        if (anuu.e == null) {
                            anuu.e = (ahev)new ahcs((ahcz)anuu.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anuu.a;
            }
            case 4: {
                return new ahcr((ahcz)anuu.a);
            }
            case 3: {
                return new anuu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anuu.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001", new Object[] { "f", "c", "d" });
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
