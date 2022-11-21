import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsw extends ahcz implements aheo
{
    public static final aqsw a;
    private static volatile ahev e;
    public int b;
    public boolean c;
    public boolean d;
    
    static {
        ahcz.registerDefaultInstance(aqsw.class, a = new aqsw());
    }
    
    private aqsw() {
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
                if ((e = aqsw.e) == null) {
                    synchronized (aqsw.class) {
                        if (aqsw.e == null) {
                            aqsw.e = (ahev)new ahcs((ahcz)aqsw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqsw.a;
            }
            case 4: {
                return new ahcr((ahcz)aqsw.a);
            }
            case 3: {
                return new aqsw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqsw.a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003\u1007\u0000\u0004\u1007\u0001", new Object[] { "b", "c", "d" });
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
