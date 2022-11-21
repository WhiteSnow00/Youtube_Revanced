import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acbg extends ahcz implements aheo
{
    public static final acbg a;
    private static volatile ahev i;
    public int b;
    public acbh c;
    public long d;
    public long e;
    public long f;
    public long g;
    public int h;
    
    static {
        ahcz.registerDefaultInstance(acbg.class, a = new acbg());
    }
    
    private acbg() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = acbg.i) == null) {
                    synchronized (acbg.class) {
                        if (acbg.i == null) {
                            acbg.i = (ahev)new ahcs((ahcz)acbg.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return acbg.a;
            }
            case 4: {
                return new ahcr((ahcz)acbg.a);
            }
            case 3: {
                return new acbg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)acbg.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1002\u0004\u0007\u100c\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "h", pfw.m });
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
