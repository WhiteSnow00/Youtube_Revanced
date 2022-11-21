import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acbh extends ahcz implements aheo
{
    public static final acbh a;
    private static volatile ahev f;
    public int b;
    public int c;
    public long d;
    public String e;
    
    static {
        ahcz.registerDefaultInstance(acbh.class, a = new acbh());
    }
    
    private acbh() {
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = acbh.f) == null) {
                    synchronized (acbh.class) {
                        if (acbh.f == null) {
                            acbh.f = (ahev)new ahcs((ahcz)acbh.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return acbh.a;
            }
            case 4: {
                return new ahcr((ahcz)acbh.a);
            }
            case 3: {
                return new acbh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)acbh.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1003\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
