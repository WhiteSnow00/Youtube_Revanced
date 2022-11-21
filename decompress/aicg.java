import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aicg extends ahcz implements aheo
{
    public static final aicg a;
    private static volatile ahev d;
    public int b;
    public int c;
    
    static {
        ahcz.registerDefaultInstance(aicg.class, a = new aicg());
    }
    
    private aicg() {
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
                if ((d = aicg.d) == null) {
                    synchronized (aicg.class) {
                        if (aicg.d == null) {
                            aicg.d = (ahev)new ahcs((ahcz)aicg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aicg.a;
            }
            case 4: {
                return new ahcr((ahcz)aicg.a);
            }
            case 3: {
                return new aicg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aicg.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", ankj.m });
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
