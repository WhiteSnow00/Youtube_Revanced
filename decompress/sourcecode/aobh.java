import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aobh extends agzi implements ahax
{
    public static final aobh a;
    private static volatile ahbe d;
    public int b;
    public ameo c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aobh.class, a = new aobh());
    }
    
    private aobh() {
        this.e = 2;
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
                final ahbe d;
                if ((d = aobh.d) == null) {
                    synchronized (aobh.class) {
                        if (aobh.d == null) {
                            aobh.d = (ahbe)new agzb((agzi)aobh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aobh.a;
            }
            case 4: {
                return new agza((agzi)aobh.a);
            }
            case 3: {
                return new aobh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aobh.a, "\u0001\u0001\u0000\u0001\ueaaa\u1fae\ueaaa\u1fae\u0001\u0000\u0000\u0001\ueaaa\u1fae\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
