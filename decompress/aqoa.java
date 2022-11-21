import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqoa extends ahcz implements aheo
{
    public static final aqoa a;
    public static final ahcx b;
    private static volatile ahev e;
    public int c;
    public String d;
    
    static {
        final aqoa a2 = new aqoa();
        ahcz.registerDefaultInstance(aqoa.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqjq.a, a2, (MessageLite)a2, null, 284051629, ahgc.k, aqoa.class);
    }
    
    private aqoa() {
        this.d = "";
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
                if ((e = aqoa.e) == null) {
                    synchronized (aqoa.class) {
                        if (aqoa.e == null) {
                            aqoa.e = (ahev)new ahcs((ahcz)aqoa.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqoa.a;
            }
            case 4: {
                return new ahcr((ahcz)aqoa.a);
            }
            case 3: {
                return new aqoa();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqoa.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "c", "d" });
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
