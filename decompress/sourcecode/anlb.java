import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anlb extends agzi implements ahax
{
    public static final anlb a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public String d;
    public anlc e;
    
    static {
        agzi.registerDefaultInstance(anlb.class, a = new anlb());
    }
    
    private anlb() {
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = anlb.f) == null) {
                    synchronized (anlb.class) {
                        if (anlb.f == null) {
                            anlb.f = (ahbe)new agzb((agzi)anlb.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return anlb.a;
            }
            case 4: {
                return new agza((agzi)anlb.a);
            }
            case 3: {
                return new anlb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anlb.a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002\u100c\u0001\u0003\u1008\u0002\u0005\u1009\u0005", new Object[] { "b", "c", angs.k, "d", "e" });
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
