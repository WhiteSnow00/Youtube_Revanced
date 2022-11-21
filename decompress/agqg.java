import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqg extends ahcz implements aheo
{
    public static final agqg a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(agqg.class, a = new agqg());
    }
    
    private agqg() {
        this.b = 0;
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
                if ((d = agqg.d) == null) {
                    synchronized (agqg.class) {
                        if (agqg.d == null) {
                            agqg.d = (ahev)new ahcs((ahcz)agqg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agqg.a;
            }
            case 4: {
                return new ahcr((ahcz)agqg.a);
            }
            case 3: {
                return new agqg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agqg.a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u103b\u0000\u0002\u1037\u0000\u0003\u103a\u0000", new Object[] { "c", "b" });
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
