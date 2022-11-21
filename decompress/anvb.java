import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anvb extends ahcz implements aheo
{
    public static final anvb a;
    private static volatile ahev e;
    public int b;
    public anva c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(anvb.class, a = new anvb());
    }
    
    private anvb() {
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
                if ((e = anvb.e) == null) {
                    synchronized (anvb.class) {
                        if (anvb.e == null) {
                            anvb.e = (ahev)new ahcs((ahcz)anvb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anvb.a;
            }
            case 4: {
                return new ahcr((ahcz)anvb.a);
            }
            case 3: {
                return new anvb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anvb.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", anus.c });
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
