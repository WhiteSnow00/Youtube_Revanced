import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajnq extends ahcz implements aheo
{
    public static final ajnq a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(ajnq.class, a = new ajnq());
    }
    
    private ajnq() {
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
                final ahev d;
                if ((d = ajnq.d) == null) {
                    synchronized (ajnq.class) {
                        if (ajnq.d == null) {
                            ajnq.d = (ahev)new ahcs((ahcz)ajnq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajnq.a;
            }
            case 4: {
                return new ahcr((ahcz)ajnq.a);
            }
            case 3: {
                return new ajnq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajnq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
