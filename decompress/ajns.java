import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajns extends ahcz implements aheo
{
    public static final ajns a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(ajns.class, a = new ajns());
    }
    
    private ajns() {
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
                if ((d = ajns.d) == null) {
                    synchronized (ajns.class) {
                        if (ajns.d == null) {
                            ajns.d = (ahev)new ahcs((ahcz)ajns.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajns.a;
            }
            case 4: {
                return new ahcr((ahcz)ajns.a);
            }
            case 3: {
                return new ajns();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajns.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
