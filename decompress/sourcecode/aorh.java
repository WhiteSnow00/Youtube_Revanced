import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aorh extends agzi implements ahax
{
    public static final aorh a;
    private static volatile ahbe c;
    public aorm b;
    private int d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aorh.class, a = new aorh());
    }
    
    private aorh() {
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
                final ahbe c;
                if ((c = aorh.c) == null) {
                    synchronized (aorh.class) {
                        if (aorh.c == null) {
                            aorh.c = (ahbe)new agzb((agzi)aorh.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aorh.a;
            }
            case 4: {
                return new agza((agzi)aorh.a);
            }
            case 3: {
                return new aorh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aorh.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
