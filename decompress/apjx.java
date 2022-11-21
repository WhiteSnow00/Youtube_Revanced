import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjx extends ahcz implements aheo
{
    public static final apjx a;
    private static volatile ahev e;
    public int b;
    public apjn c;
    public ahdh d;
    
    static {
        ahcz.registerDefaultInstance(apjx.class, a = new apjx());
    }
    
    private apjx() {
        this.d = ahcz.emptyIntList();
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
                if ((e = apjx.e) == null) {
                    synchronized (apjx.class) {
                        if (apjx.e == null) {
                            apjx.e = (ahev)new ahcs((ahcz)apjx.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apjx.a;
            }
            case 4: {
                return new ahcr((boolean[][][])null, (byte[][][])null);
            }
            case 3: {
                return new apjx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apjx.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u001e", new Object[] { "b", "c", "d", apkd.a() });
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
