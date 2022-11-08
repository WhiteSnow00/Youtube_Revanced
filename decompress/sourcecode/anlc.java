import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anlc extends agzi implements ahax
{
    public static final anlc a;
    private static volatile ahbe e;
    public int b;
    public long c;
    public String d;
    
    static {
        agzi.registerDefaultInstance(anlc.class, a = new anlc());
    }
    
    private anlc() {
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
                final ahbe e;
                if ((e = anlc.e) == null) {
                    synchronized (anlc.class) {
                        if (anlc.e == null) {
                            anlc.e = (ahbe)new agzb((agzi)anlc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anlc.a;
            }
            case 4: {
                return new agza((agzi)anlc.a);
            }
            case 3: {
                return new anlc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anlc.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1003\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
