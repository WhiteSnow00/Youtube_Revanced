import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afox extends agzi implements ahax
{
    public static final afox a;
    private static volatile ahbe l;
    public int b;
    public afpa c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public int j;
    public int k;
    
    static {
        agzi.registerDefaultInstance(afox.class, a = new afox());
    }
    
    private afox() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe l;
                if ((l = afox.l) == null) {
                    synchronized (afox.class) {
                        if (afox.l == null) {
                            afox.l = (ahbe)new agzb((agzi)afox.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return afox.a;
            }
            case 4: {
                return new agza((agzi)afox.a);
            }
            case 3: {
                return new afox();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afox.a, "\u0001\t\u0000\u0001\u0001\u000e\t\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1007\u0001\u0003\u1005\u0002\u0007\u1004\u0006\b\u1004\u0007\u000b\u1004\n\f\u1007\u000b\r\u1004\f\u000e\u1004\r", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k" });
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
