import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akou extends ahcz implements aheo
{
    public static final akou a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(akou.class, a = new akou());
    }
    
    private akou() {
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
                if ((d = akou.d) == null) {
                    synchronized (akou.class) {
                        if (akou.d == null) {
                            akou.d = (ahev)new ahcs((ahcz)akou.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akou.a;
            }
            case 4: {
                return new ahcr((ahcz)akou.a);
            }
            case 3: {
                return new akou();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akou.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
