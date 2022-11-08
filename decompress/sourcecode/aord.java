import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aord extends agzi implements ahax
{
    public static final aord a;
    private static volatile ahbe b;
    private int c;
    private aioe d;
    private aioe e;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(aord.class, a = new aord());
    }
    
    private aord() {
        this.g = 2;
        final agyc b = agyc.b;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b2;
                if ((b2 = aord.b) == null) {
                    synchronized (aord.class) {
                        if (aord.b == null) {
                            aord.b = (ahbe)new agzb((agzi)aord.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aord.a;
            }
            case 4: {
                return new agza((agzi)aord.a);
            }
            case 3: {
                return new aord();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aord.a, "\u0001\u0003\u0000\u0001\u0006\u000b\u0003\u0000\u0000\u0003\u0006\u1409\u0006\u0007\u1409\u0007\u000b\u1409\u000b", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
