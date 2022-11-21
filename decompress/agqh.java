import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqh extends ahcz implements aheo
{
    public static final agqh a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(agqh.class, a = new agqh());
    }
    
    private agqh() {
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
                if ((d = agqh.d) == null) {
                    synchronized (agqh.class) {
                        if (agqh.d == null) {
                            agqh.d = (ahev)new ahcs((ahcz)agqh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agqh.a;
            }
            case 4: {
                return new ahcr((ahcz)agqh.a);
            }
            case 3: {
                return new agqh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agqh.a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1035\u0000\u0002\u1033\u0000\u0003\u103c\u0000", new Object[] { "c", "b", agqf.class });
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
